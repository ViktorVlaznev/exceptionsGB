package Seminar3;

public class WrongPasswordException extends Exception {
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
