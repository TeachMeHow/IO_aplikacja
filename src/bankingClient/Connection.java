package bankingClient;
import java.nio.file.*;
import java.net.*;
import java.io.*;

public class Connection {
	// TODO maybe return bool if file not read?
	private String config_filename;
	private void readConfig() {
		// open filename
		// read to attributes
	}
	private Socket socket;
	private InetAddress host;
	private String hostName;
	private int port;
	
	Connection()
	{
		readConfig();
	}
	
	public void connect()
	{
		// create socket
	}
	public void sendRequest(String request)
	{
		// send request to server
	}
	
	
	
	
}
