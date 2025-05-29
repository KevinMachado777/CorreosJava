package gm.Correos_electronicos.controller;

import gm.Correos_electronicos.model.Email;
import gm.Correos_electronicos.service.CorreoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

// Importar el modelo de Email
import gm.Correos_electronicos.model.Email;

@Controller
public class CorreoControlador {
    // Dependencia de servicio
    @Autowired
    private CorreoServicio correoServicio;

    // Ruta para mostrar el formulario principal para enviar el correo
    @GetMapping("/")
    public String mostrarFormulario(Model model) {

        // Pasar un objeto email a la vista, para que sea llenado
        model.addAttribute("email", new Email() );
        return "formulario";
    }

    // Enviar el correo al destinatario
    @PostMapping("/enviar")
    // Con @ModelAttribute tomamos los valores del formulario y llenamos un objeto de tipo email
    public String enviarCorreo(@ModelAttribute Email email, Model model) {

        // Pasamos los parametros que espera el metodo
        correoServicio.enviarCorreo(email.getTo(), email.getSubject(), email.getBody());

        // Enviar mensaje de confirmacion a la vista
        model.addAttribute("mensaje", "Correo enviado correctamente!");
        return "formulario";
    }
}
