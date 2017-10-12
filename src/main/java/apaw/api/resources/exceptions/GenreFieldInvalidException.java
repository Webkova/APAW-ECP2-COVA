package apaw.api.resources.exceptions;

public class GenreFieldInvalidException extends Exception{

    private static final long serialVersionUID = -642045799876625537L;

    public static final String DESCRIPTION = "Id del género no encontrado";

    public GenreFieldInvalidException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

    public GenreFieldInvalidException() {
        this("");
    }

}
