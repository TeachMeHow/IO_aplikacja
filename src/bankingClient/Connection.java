package bankingClient;
import java.util.Properties;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
public class Connection {
	// TODO maybe return bool if file not read?
	private void readConfig() {
		// open filename
		// read to attributes
		try
		{
			Properties properties = new Properties();

			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(config_filename);
			
			if (inputStream != null)
			{
				properties.load(inputStream);
				host = properties.getProperty("host");
				port = Integer.valueOf(properties.getProperty("port"));
			}
			else
			{
				throw new FileNotFoundException("Configuration file not found under \"" + config_filename + "\"");
			}
		}
		catch (Exception e)
		{
			System.out.println("Exception: " + e);
		}
	}
	private Socket socket;
	private DataOutputStream out;
	private DataInputStream in;
	private String config_filename = "connection.properties";
	
	//TODO change InetAddress to String in diagrams
	private String host;
	//TODO remove hostName from diagrams
	private int port;
	
	Connection()
	{
		try {
			readConfig();
			connect();
		} catch(Exception e)
		{
			System.out.println("Connection unsuccessful");
			e.printStackTrace();
		}
	}
	
	//TODO change to private in diagrams
	public void connect() throws UnknownHostException, IOException
	{
		//socket = new Socket(host, port);
		//out = new DataOutputStream(socket.getOutputStream());
		//in = new DataInputStream(socket.getInputStream());
		
	}
	
	//TODO change sendRequest to include response, get rid of getResponse method in diagrams
	public void sendRequest(String request) throws IOException
	{
		// TODO program this
		// out.writeBytes(request);
	}
	//TODO program getting response
	public String getResponse()
	{
		// read from in
		// 1.3.2
		return new String();
	}
	
	
	
	
}
