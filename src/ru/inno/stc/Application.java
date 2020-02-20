package ru.inno.stc;
import javax.xml.ws.Endpoint;

public class Application {

    public static void main(String[] argv) {
        String address = "http://localhost:9000/ws";
        Endpoint.publish(address, new CoursesServiceImpl());
    }
}
