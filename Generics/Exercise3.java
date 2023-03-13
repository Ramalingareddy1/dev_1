package dev_1.Generics;

class MyGenericClass<T> {
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        MyGenericClass<Integer> mgi= new MyGenericClass<Integer>();
        mgi.add(2);

        MyGenericClass<String> mgs = new MyGenericClass<String>();

        mgs.add("SoftwareTestingHelps");
        System.out.println(" Member of MyGenericsClass<Integer>:"+mgi.get());
        System.out.println(" Member of MyGenericsClass<String>:"+mgs.get());

    }

    
}
