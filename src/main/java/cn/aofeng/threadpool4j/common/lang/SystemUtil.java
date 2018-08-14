package cn.aofeng.threadpool4j.common.lang;

public class SystemUtil {

    /**
     * 获取当前操作系统的换行符。
     *
     * @return 当前操作系统的换行符。
     */
    public static String getEndLine() {
        return System.getProperty("line.separator");
    }

    /**
     * 获取当前系统CPU的处理器个数。
     *
     * @return 当前系统CPU的处理器个数。
     */
    public static int getProcessorCount() {
        return Runtime.getRuntime().availableProcessors();
    }
}
