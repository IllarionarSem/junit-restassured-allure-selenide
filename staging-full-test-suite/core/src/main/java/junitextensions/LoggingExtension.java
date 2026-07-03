package junitextensions;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

@Slf4j
public class LoggingExtension implements BeforeEachCallback, TestWatcher {

    @Override
    public void beforeEach(ExtensionContext context) {
        log.info("test {} started", context.getDisplayName());
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        log.info("test {} successful", context.getDisplayName());
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        log.error("test {} failed", context.getDisplayName(), cause);
    }
}
