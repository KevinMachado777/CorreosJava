package gm.Correos_electronicos;

import java.net.Socket;

public class DNS {
    public static void main(String[] args) {
        try {
            System.out.println("Conectando a smtp.gmail.com:587...");
            Socket socket = new Socket("smtp.gmail.com", 587);
            System.out.println("Conexion exitosa ✅");
            socket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
