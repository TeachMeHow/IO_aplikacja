package bankingClient;

public class TransferSender {
	private Connection connection;
	TransferSender(Connection connection)
	{
		this.connection = connection;
	}
	void execute(Transfer transfer)
	{
		// send request using connection
	}
}
