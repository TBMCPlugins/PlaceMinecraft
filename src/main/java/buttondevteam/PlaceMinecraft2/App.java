package buttondevteam.PlaceMinecraft2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

import buttondevteam.lib.TBMCCoreAPI;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws URISyntaxException {
		PlaceWebSocket placews = new PlaceWebSocket(get_place_url());
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

	public static String get_place_url() {
		String match = null;

		while (match == null) {
			String content;
			try {
				content = TBMCCoreAPI.DownloadString("https://reddit.com/r/place");
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			Pattern url_re = Pattern.compile("\"place_websocket_url\": \"([^,]+)\""); // Forgive me, for I am a sinner
			Matcher matcher = url_re.matcher(content);

			if (matcher.find())
				match = content.substring(matcher.start() + "\"place_websocket_url\": \"".length(), matcher.end() - 1);
		}
		return match;
	}

}
