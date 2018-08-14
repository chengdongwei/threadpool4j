package cn.aofeng.threadpool4j.common;

public interface ILifeCycle {

    /**
     * 初始化资源。
     */
    public void init();

    /**
     * 释放资源。
     */
    public void destroy();
}
