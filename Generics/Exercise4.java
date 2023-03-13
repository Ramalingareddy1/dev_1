package dev_1.Generics;

import java.lang.reflect.InvocationTargetException;

class Exercise4 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        GenericFactory<ProductA> factoryA = new GenericFactory<>(ProductA.class);
        ProductA productA = factoryA.createInstance();
        System.out.println(productA.getProductName());

        GenericFactory<ProductB> factoryB = new GenericFactory<>(ProductB.class);
        ProductB productB = factoryB.createInstance();
        System.out.println(productB.getProductName());

        GenericFactory<ProductC> factoryC = new GenericFactory<>(ProductC.class);
        ProductC productC = factoryC.createInstance();
        System.out.println(productC.getProductName());
    }
}

class ProductA {
    public String getProductName() {
        return "Product A";
    }
}

class ProductB {
    public String getProductName() {
        return "Product B";
    }
}

class ProductC {
    public String getProductName() {
        return "Product C";
    }
}

class GenericFactory<T> {
    private Class<T> theClass;

    public GenericFactory(Class<T> theClass) {
        this.theClass = theClass;
    }

    public T createInstance() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        return this.theClass.getDeclaredConstructor().newInstance();
    }
}
