import javax.management.ObjectName;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class CodeAnalyzer {

    public static void analyzeClass(Object obj){
        Class clazz = obj.getClass();
        System.out.println("ClassName: " + clazz);
        System.out.println("ClassFields: " + Arrays.toString(clazz.getDeclaredFields()));
        //нет родительского класса
        System.out.println("ClassSuperclass: " + clazz.getSuperclass());
        System.out.println("ClassMethods: " + Arrays.toString(clazz.getMethods()));
        System.out.println("ClassDeclaredMethods: " + Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println("ClassConsturctors: " + Arrays.toString(clazz.getDeclaredConstructors()));
        System.out.println("ClassInterfaces: " + Arrays.toString(clazz.getInterfaces()));
        System.out.println("ClassAnnotations: " + Arrays.toString(clazz.getDeclaredAnnotations()));
        System.out.println("ClassClasses: " + Arrays.toString(clazz.getDeclaredClasses()));
    }

    public static void main(String[] args) {

        analyzeClass(new Student("Peter", 5030102, 3));
        try {
            Class[] classArr = {String.class};
            Student StudentFirst = Student.class.getDeclaredConstructor(classArr).newInstance("Niko");
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

}
