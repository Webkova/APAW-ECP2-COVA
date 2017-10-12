package apaw.api.resources.exceptions;

public class DirectorIdNotFoundException extends Exception {
    private static final long serialVersionUID = -3893110892899234744L;

    public static final String DESCRIPTION = "El id del director no existe";

    public DirectorIdNotFoundException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

    public DirectorIdNotFoundException() {
        this("");
    }
}
