import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class JettyHttpServerTestMain {

    public static void main(String[] args){
        try {
            HttpServer httpServer = HttpServer.create();// does not throw NPE 🎉
            httpServer.bind(new InetSocketAddress("localhost", 9620), 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
