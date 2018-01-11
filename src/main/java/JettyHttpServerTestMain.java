import com.sun.net.httpserver.HttpServer;

import java.io.IOException;

public class JettyHttpServerTestMain {

    public static void main(String[] args){
        try {
            HttpServer.create(); // throws NPE
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
