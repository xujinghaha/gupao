package gupao.patter.factory.simplefactory;

import gupao.patter.factory.IComputer;

public class TestSimple {

    public static void main(String[] args) {
        ComputerFactory cf = new ComputerFactory();
        IComputer ic = cf.create("三星");
        ic.getPingpai();
    }

}
