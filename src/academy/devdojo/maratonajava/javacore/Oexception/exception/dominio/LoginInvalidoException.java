package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException(String message) {
        super(message);
    }

    public LoginInvalidoException() {
        super("Login invalido");
    }
}
