package com.test;

/**
 * Created by admin on 2020/2/6.
 */
public  class MainBox {
    private Cpu cpu;
    public Cpu getCpu() {
        return cpu;
    }
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
    public void method(){
        this.cpu.method();
    }
}
