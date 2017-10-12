package apaw.api.resources.exceptions;

public class DirectorFieldInvalidException extends Exception {

    private static final long serialVersionUID = -642045799876625537L;

    public static final String DESCRIPTION = "Id del director no encontrado";

    public DirectorFieldInvalidException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

    public DirectorFieldInvalidException() {
        this("");
    }

}
