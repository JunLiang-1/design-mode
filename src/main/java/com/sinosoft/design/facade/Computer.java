package com.sinosoft.design.facade;

/**
 * @author: DuJunLiang
 * @date: 2022/1/7 13:55
 * @version: 1.0
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startup() {
        System.out.println("computer startup");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("computer finished");
    }

    public void shutdown() {
        System.out.println("computer shutdown begin");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer close finished");
    }
}
