package Server;


import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String url="http://0.0.0.0:4488/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web Service Déployé sur "+url);
    }
}
