package com.wx.observer.simlation2;

/**
 * @author weixing
 * @date 2019/2/17
 **/
public interface LifeCycleListener {

    void onEvent(ObserverRunnable.RunnableEvent event);
}