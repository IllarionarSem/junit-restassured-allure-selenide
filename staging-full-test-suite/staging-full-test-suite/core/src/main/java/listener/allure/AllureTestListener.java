package listener.allure;

import io.qameta.allure.listener.TestLifecycleListener;
import io.qameta.allure.model.TestResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "TEST")
public class AllureTestListener implements TestLifecycleListener {

    @Override
    public void beforeTestStart(TestResult result) {
        log.info(result.getTestCaseName() + " STARTED");
    }

    @Override
    public void beforeTestStop(TestResult result) {
        log.info(result.getTestCaseName() + " FINISHED");
    }
}
