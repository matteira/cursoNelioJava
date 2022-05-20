package execepitions;

public class DomainExeception extends RuntimeException{

    private static final long serialVersionUID = 1l;

    public DomainExeception(String msg) {
        super(msg);
    }
}
