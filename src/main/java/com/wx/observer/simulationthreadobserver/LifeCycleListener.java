package com.wx.observer.simulationthreadobserver;

/**
 * @author weixing
 * @date 2019/2/17
 **/
public interface LifeCycleListener {
     void onEvent(ObserverRunnable.RunnableEvent runnableEvent);
}
