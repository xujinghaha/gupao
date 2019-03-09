package gupao.patter.factory.funcFactory;

import gupao.patter.factory.IComputer;
import gupao.patter.factory.Lenvol;

public class LenvolFactory implements IComputerFactory {
    @Override
    public IComputer create() {
        return new Lenvol();
    }
}
