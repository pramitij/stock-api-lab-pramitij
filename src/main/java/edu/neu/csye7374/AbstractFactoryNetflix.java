package edu.neu.csye7374;
//This class is a Factory, Eager Singleton

public class AbstractFactoryNetflix extends AbstractFactoryStock {
    public Tradable getObject(){
        return new Netflix();
    }

    private static final AbstractFactoryNetflix instance =
            new AbstractFactoryNetflix();

    private AbstractFactoryNetflix() {
    }

    public static AbstractFactoryNetflix getInstance() {
        return instance;
    }


}
