package bankingClient;

import java.io.IOException;

public class TransferSender {
	//TODO define success and failure
	private static final String SUCCESS = "";
	private static final String FAILURE = "";
	private Connection connection;
	TransferSender(Connection connection)
	{
		this.connection = connection;
	}
	boolean execute(Transfer transfer)
	{
		String request = new String();
		StringBuilder requestBuilder = new StringBuilder();
		// server will know how to parse this request if it knows it's a transfer
		requestBuilder.append("TRANSFER\n");
		// transfer attributes to parse
		requestBuilder.append("destination=" + transfer.getDestinationAccount() + '\n');
		requestBuilder.append("source=" + transfer.getSourceAccount() + '\n');
		requestBuilder.append("title=" + transfer.getTitle() + '\n');
		requestBuilder.append("type=" + String.valueOf(transfer.getType()) + '\n');
		requestBuilder.append("amount=" + String.valueOf(transfer.getAmount()));
		try {
			// 2.
			connection.sendRequest(request);
		} catch (IOException e) {
			System.out.println("Request could not be sent");
		}		
		
		String response;
		// 1.3.1
		response = connection.getResponse();
		
		if (response == SUCCESS)
		{
			// 1.4
			return true;
		}
		else
		{
			// 1.5
			return false;
		}
	}
	
}