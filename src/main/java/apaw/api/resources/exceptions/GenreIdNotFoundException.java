package apaw.api.resources.exceptions;

public class GenreIdNotFoundException extends Exception {
    private static final long serialVersionUID = -3893110892899234744L;

    public static final String DESCRIPTION = "El id del género no existe";

    public GenreIdNotFoundException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

    public GenreIdNotFoundException() {
        this("");
    }
}