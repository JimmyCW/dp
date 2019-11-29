package com.wx.facade;

public class Computer implements Part {

    private CPU cpu;

    private Memory memory;

    public Computer(CPU cpu, Memory memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    @Override
    public void start() {
        System.out.println("computer starting");
        memory.start();
        cpu.start();
        System.out.println("computer started");
    }
}
