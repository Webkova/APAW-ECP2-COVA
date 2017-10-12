package apaw.api.resources.exceptions;

public class MovieFieldInvalidException extends Exception {
    private static final long serialVersionUID = -642045799876625537L;

    public static final String DESCRIPTION = "Id del tema no encontrado";

    public MovieFieldInvalidException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

    public MovieFieldInvalidException() {
        this("");
    }

}
