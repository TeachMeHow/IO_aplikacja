package bankingClient;

import java.io.IOException;

public class TransferSender {
	private Connection connection;
	TransferSender(Connection connection)
	{
		this.connection = connection;
	}
	void execute(Transfer transfer)
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
		requestBuilder.append("amount=" + transfer.getAmount().toString());
		try {
			connection.sendRequest(request);
		} catch (IOException e) {
			System.out.println("Request could not be sent");
		}		
	}
	
}