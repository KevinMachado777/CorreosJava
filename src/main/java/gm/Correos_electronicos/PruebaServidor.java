package gm.Correos_electronicos;

import java.net.*;

public class PruebaServidor {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("smtp.gmail.com");
            System.out.println("IP de smtp.gmail.com: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("No se pudo resolver el host: " + e.getMessage());
        }
    }
}

