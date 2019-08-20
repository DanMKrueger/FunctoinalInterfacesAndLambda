import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface FunctionalStaticInterface{
    void interfaceMethod();
}

@FunctionalInterface
interface ConstructorInterface{
    MyConstruct getIt(String m);
}

class MyConstruct{
    MyConstruct(String m){
        System.out.println(("Get: " + m));
    }
}

class StaticMethodClass{
    public static void staticMethodFunction(){
        System.out.println("Calling this static method");
    }
}

class MethodReferenceExamples{

    public void classMethod(){
        System.out.println("My class method");
    }
    public static void main(String argsp[]){

        FunctionalStaticInterface obj = StaticMethodClass::staticMethodFunction;
        obj.interfaceMethod();

        ConstructorInterface myObj = MyConstruct::new;

    }
}