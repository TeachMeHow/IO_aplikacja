package bankingClient;

import java.io.IOException;

// TODO Update class diagram
public class TransferSender {
	//TODO define success and failure
	private static final String SUCCESS = "";
	private static final String FAILURE = "";
	private Connection connection;
	private Transfer inTransfer = null;
	private boolean isCompleted = false;
	TransferSender(Connection connection, Transfer transfer)
	{
		this.connection = connection;
		this.inTransfer = transfer;
		
	}
	boolean execute()
	{
		String request = new String();
		StringBuilder requestBuilder = new StringBuilder();
		// server will know how to parse this request if it knows it's a transfer
		requestBuilder.append("TRANSFER\n");
		// transfer attributes to parse
		requestBuilder.append("destination=" + inTransfer.getDestinationAccount() + '\n');
		requestBuilder.append("source=" + inTransfer.getSourceAccount() + '\n');
		requestBuilder.append("title=" + inTransfer.getTitle() + '\n');
		requestBuilder.append("type=" + String.valueOf(inTransfer.getType()) + '\n');
		requestBuilder.append("amount=" + String.valueOf(inTransfer.getAmount()));
		try {
			// 4.1
			connection.sendRequest(request);
		} catch (IOException e) {
			System.out.println("Request could not be sent");
		}		
		
		String response;
		// 4.3 
		response = connection.getResponse();
		
		// [alt]
		if (response == SUCCESS)
		{
			// 4.5
			isCompleted = true;
			return true;
		}
		else
		{
			// 14.6
			isCompleted = false;
			return false;
		}
	}
	
}