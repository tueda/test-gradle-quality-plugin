package example;

import java.util.logging.Logger;

/**
 * Sample class.
 */
public final class Sample {
    /**
     * Private constructor.
     */
    private Sample() {
    }

    /**
     * Entry point.
     */
    public static void main(final String[] args) {
        final Logger log = Logger.getLogger(Sample.class.getName());
        log.info("Hello World!");
    }
}
