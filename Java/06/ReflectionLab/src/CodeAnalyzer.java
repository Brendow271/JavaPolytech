import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CodeAnalyzer {
    /*Написать метод, который через reflection выводит полную информацию о классе*/
    public static void analyzeClass(Object obj){
        Class<?> clazz = obj.getClass();
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
    /*Написать программу, которая через reflection создаст экземпляр класса (по имени) и выполнит его метод (по имени)*/

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        /*Написать метод, который через reflection выводит полную информацию о классе*/
        analyzeClass(new Student("Peter", 5030102, 3));
        System.out.println();
        /*Написать программу, которая через reflection создаст экземпляр класса (по имени) и выполнит его метод (по имени)*/
        try {
            //Вызываем конструктор
            Constructor<Student> constrStudent = Student.class.getDeclaredConstructor(String.class);
            constrStudent.setAccessible(true);
            Student StudentFirst = constrStudent.newInstance("Nikolay");
            System.out.println(StudentFirst + "\n");
            //Вызываем метод экземпляра
            Class<?> clazz = Class.forName(Student.class.getName());
            Method AnsExam = clazz.getDeclaredMethod("AnsExam", String.class);
            AnsExam.setAccessible(true);
            AnsExam.invoke(StudentFirst, "123");

        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }


    }

}
