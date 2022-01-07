package lesson14;

public class UncurrentAgeException extends RuntimeException {
    public UncurrentAgeException() {
    }

    public UncurrentAgeException(String message) {
        super(message);
    }

    public UncurrentAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UncurrentAgeException(Throwable cause) {
        super(cause);
    }

    public UncurrentAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
