package bankingClient;

public class TransferSender {
	private Connection connection;
	TransferSender(Connection connection)
	{
		this.connection = connection;
		
	}
	void execute(Transfer transfer)
	{
		String request="1|3|453";
		connection.sendRequest(request);
		
	}
	
}
