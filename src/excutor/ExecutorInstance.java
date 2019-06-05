package excutor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: dulihong
 * @date: 2019/6/5 16:55
 */
public class ExecutorInstance {

    public static ThreadPoolExecutor instance() {
        return singleExecutor.threadPoolExecutor;
    }


    private static class singleExecutor {
        public static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(Constant.CORE_POOL_SIZE,
                Constant.MAX_IMUM_POOL_SIZE,
                Constant.KEEP_ALIVE_TIME,
                TimeUnit.NANOSECONDS, new LinkedBlockingQueue<>());
    }

}
