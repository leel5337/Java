package Chapter2;

public class Java2_19 {

    private static Java2_19 instance = new Java2_19();

    private Java2_19() {}

    public static Java2_19 getInstance() {

        if ( instance == null) {
             instance = new Java2_19();
        }
        return instance;
    }
}
