import java.util.ArrayList;

interface RouterInterface {
    public void open();                               
    public void close();
    public void read();
    public void write(byte[] buffer);
}

abstract class Router implements RouterInterface {
    byte[] data;
}

class NetgearRouter extends Router {
    public void open() {
        System.out.println("Opened connection to Netgear router");
    }
    public void close() {
        System.out.println("Closed connection to Netgear router");
    }
    public void read() {
        System.out.println("Successfully read \"" + new String(data) + "\" Netgear router");
    }
    public void write(byte[] buffer) {
        data = buffer;
        System.out.println("Successfully wrote \"" + new String(buffer) + "\" to Netgear router");
    }
}

class AsusRouter extends Router {
    public void open() {
        System.out.println("Opened connection to ASUS router");
    }
    public void close() {
        System.out.println("Closed connection to ASUS router");
    }
    public void read() {
        System.out.println("Successfully read \"" + new String(data) + "\" ASUS router");
    }
    public void write(byte[] buffer) {
        data = buffer;
        System.out.println("Successfully wrote \"" + new String(buffer) + "\" to ASUS router");
    }
}

public class InterfaceAbstractClassDemo {
    public static void main(String[] args) {
        Router netgearRouter = new NetgearRouter();
        Router asusRouter = new AsusRouter();
    
        ArrayList<Router> routerList = new ArrayList<Router>();

        routerList.add(netgearRouter);
        routerList.add(asusRouter);

        for (Router r : routerList) {
            r.open();
            r.write("Hello World".getBytes());
            r.read();
            r.close();
            System.out.println("");
        }
    }
}
