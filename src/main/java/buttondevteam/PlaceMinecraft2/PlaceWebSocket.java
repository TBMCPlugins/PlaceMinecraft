package buttondevteam.PlaceMinecraft2;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class PlaceWebSocket { //Ported from https://gist.github.com/teaearlgraycold/76877c8f262de24becc081ad96759730
	private Gson json;
	public JsonObject recv_frame()
	{
	//frame = super().recv_frame()
        return json.fromJson(frame.data.decode('utf-8'));
	}

public void main()
{    url = "wss://...";
    ws = create_connection(url, class_=PlaceWebSocket);
    insert_queue = 0
    inserted_count = 0
    max_queue_size = 100
    save_frame_per = 20000

    while(true)
    {        try
    {
            frame = ws.recv_frame();
            print(frame);

            if(frame['type'] == 'place')
            {
                c.execute('''INSERT INTO placements VALUES (?, ?, ?, ?, ?)''', [
                    int(time.time()),
                    frame['payload']['x'],
                    frame['payload']['y'],
                    frame['payload']['color'],
                    frame['payload']['author']
                ])
                insert_queue += 1
                inserted_count += 1
            }
            else if(frame['type'] == 'activity')
            {
                c.execute('''INSERT INTO activity VALUES (?, ?)''', [
                    int(time.time()),
                    frame['payload']['count']
                ])
                insert_queue += 1
                inserted_count += 1

            if insert_queue >= max_queue_size:
                conn.commit()
                insert_queue = 0
            if inserted_count % save_frame_per == 0:
                save_bitmap(c, conn)
        except KeyboardInterrupt:
            print('Exiting safely...')
            conn.commit()
            conn.close()
            sys.exit()
        except Exception as e:
            print('Error occured: {}'.format(str(e)))


if __name__ == '__main__':
    main()
}
