package network;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Download {

	public static void main(String[] args) throws Exception {
	 	URL urlobj = new URL("http://www.srikanthtechnologies.com/banner.jpg");
		InputStream is = urlobj.openStream();
		FileOutputStream fo = new FileOutputStream("d:\\classroom\\st.jpg");
		int ch = is.read();
		int count = 0;
		while (ch != -1) {
			count ++;
			fo.write(ch);
			ch = is.read();
		}
		fo.close();
		is.close();
		System.out.printf("Download completed! %d bytes downloaded", count);
	}

}
