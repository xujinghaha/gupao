package gupao.patter.factory.simplefactory;

import gupao.patter.factory.IComputer;
import gupao.patter.factory.Lenvol;
import gupao.patter.factory.SamSum;
import gupao.patter.factory.XiaoMi;

public class ComputerFactory {

    public IComputer create(String name){
        if("联想".equals(name)){
            return new Lenvol();
        }else if("三星".equals(name)){
            return new SamSum();
        }else if("小米".equals(name)){
            return new XiaoMi();
        }
        return  null;
    }
}
