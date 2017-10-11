package apaw.api.resources.exceptions;

public class MovieIdNotFoundException extends Exception {
    private static final long serialVersionUID = -3893110892899234744L;

    public static final String DESCRIPTION = "El id de la película no existe";

    public MovieIdNotFoundException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

    public MovieIdNotFoundException() {
        this("");
    }
}
