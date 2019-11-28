package com.wx.proxy;

public class Proxy implements Sourceable {

    /**
     * 代理模式与装饰器模式的区别 代理模式下面这个是类，装饰器是接口
     */
    private SourceImpl source;

    public Proxy(SourceImpl source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("do sth");
        source.method();
        System.out.println("do sth");
    }
}
