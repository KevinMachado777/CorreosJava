package gm.Correos_electronicos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class CorreoServicio {
    // Dependencia de correo
    @Autowired
    private JavaMailSender mailSender;

    public void enviarCorreo(String to, String Subject, String  body) {
        // Objeto para almacenar un correo simple
        SimpleMailMessage message = new SimpleMailMessage();
        try {
            message.setFrom("kasedevelopmentgroup@gmail.com"); // El que envia el correo

            // Llenar el objeto de la inyeccion con los valores enviados del formulario
            message.setTo(to);
            message.setSubject(Subject);
            message.setText(body);

            // Pasar el objeto de la inyecciion a la dependencia del correo y enviarlo
            mailSender.send(message);
            System.out.println("Correo enviado correctamente a " + to);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error enviando correo: " + e.getMessage());
        }
    }
}
