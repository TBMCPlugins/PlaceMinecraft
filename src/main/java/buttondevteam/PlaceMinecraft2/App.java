package buttondevteam.PlaceMinecraft2;

import java.net.URISyntaxException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws URISyntaxException {
		PlaceWebSocket placews = new PlaceWebSocket(
				"wss://...");
		SSLContext sslContext = null;
		try {
			sslContext = SSLContext.getInstance("TLS");
			sslContext.init(null, null, null); // will use java's default key and trust store which is sufficient unless you deal with self-signed certificates
			SSLSocketFactory factory = sslContext.getSocketFactory();// (SSLSocketFactory) SSLSocketFactory.getDefault();
			placews.setSocket(factory.createSocket());
			if (!placews.connectBlocking())
				System.out.println("Failed to connect.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Finished");
	}
}
