package edu.neu.csye7374;
//This class is a Factory Lazy Singleton
public class AbstractFactoryApple extends AbstractFactoryStock{

    private static AbstractFactoryApple instance;
    public AbstractFactoryApple(){
        instance = null;
    }
    public Stock getObject(){
        return new Apple();

    }
    public static synchronized AbstractFactoryApple getInstance() {
        if (instance == null) {
            instance = new AbstractFactoryApple();
        }
        return instance;
    }
}
