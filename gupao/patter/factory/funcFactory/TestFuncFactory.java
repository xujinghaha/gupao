package gupao.patter.factory.funcFactory;

import gupao.patter.factory.IComputer;

public class TestFuncFactory {

    public static void main(String[] args) {
        IComputerFactory ic = new LenvolFactory();
        IComputer ico = ic.create();
        ico.getPingpai();
    }
}
