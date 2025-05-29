package gm.Correos_electronicos.model;

public class Email {
    private String to; // Destinarario
    private String subject; // Asunto
    private String body; // Cuerpo o mensaje del correo


    // Metodos
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
