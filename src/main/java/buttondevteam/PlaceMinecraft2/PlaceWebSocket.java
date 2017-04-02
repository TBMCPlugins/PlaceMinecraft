package buttondevteam.PlaceMinecraft2;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.URISyntaxException;

public class PlaceWebSocket extends WebSocketClient { // Ported from https://gist.github.com/teaearlgraycold/76877c8f262de24becc081ad96759730
	public PlaceWebSocket(String wslink) throws URISyntaxException {
		super(new URI(wslink));
		/*
		 * insert_queue = 0 inserted_count = 0 max_queue_size = 100 save_frame_per = 20000
		 */
	}

	@Override
	public void onOpen(ServerHandshake handshakedata) {
		System.out.println("Status: " + handshakedata.getHttpStatusMessage());
	}

	@Override
	public void onMessage(String message) {
		JsonObject frame = new JsonParser().parse(message).getAsJsonObject();
		String type = frame.get("type").getAsString();
		JsonObject payload = frame.get("payload").getAsJsonObject();
		System.out.println("Type: " + type);
		if (type.equals("place")) {
			int x = payload.get("x").getAsInt();
			int y = payload.get("y").getAsInt();
			String color = payload.get("color").getAsString();
			String author = payload.get("author").getAsString();
			System.out.println("X: " + x + " - Y: " + y + " - Color: " + color + " - Author: " + author);
		} else if (type.equals("activity")) {
			String count = payload.get("count").getAsString();
			System.out.println("Count: " + count);
		}
	}

	@Override
	public void onClose(int code, String reason, boolean remote) {
		System.out.println("Code: " + code + " - Reason: " + reason + " - Remote: " + remote);
	}

	@Override
	public void onError(Exception ex) {
		System.out.println(ex);
	}
}
