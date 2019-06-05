package excutor;

import delayed_prototype.DelayedConsumer;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: dulihong
 * @date: 2019/6/5 17:19
 */
public class ExecutorServer {

    private ThreadPoolExecutor threadPoolExecutor = ExecutorInstance.instance();

    public void startThread() {
        threadPoolExecutor.execute(new DelayedConsumer());
    }

}
