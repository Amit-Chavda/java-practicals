import java.lang.invoke.MethodHandleInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Test{
    public String str;
    Test(){
        str="";
    }
    Test(String str){
        this.str=str;
    }

    public void dislplay(){
        System.out.println("String is "+str);
    }
    private void dislplayMessage(String msg){
        System.out.println("Message is "+msg);
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        Test test=new Test();

        Class class1=test.getClass();

        System.out.println("Class name : "+class1.getName());

        System.out.println("Declared method names :");
        Method[] methods=class1.getMethods();
        for(Method method:methods){
            System.out.println(method.getName());
        }

        Field[] fields = class1.getDeclaredFields();
        System.out.println("\nDeclare field names :");
        for(Field field:fields){
            System.out.println(field.getName());
        }


        Constructor[] constructors = class1.getDeclaredConstructors();
        System.out.println("Number of constructors :"+constructors.length);

    try {
        System.out.println("\nPrivate method invocation");
        Method method=class1.getDeclaredMethod("dislplayMessage", String.class);
        method.setAccessible(true);
        method.invoke(test, "Hello Java!");   
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
        
    }
}