public class Main {
    public static void main(String[] args) {
            
            Triple<Integer> intengerTriple = new Triple<>(1, 2, 3);
            System.out.println("Integer triple: " + intengerTriple);
            
            try { System.out.println("Min in integer triple: " + intengerTriple.min()); }
            catch (Exception e) { System.out.println(e.getMessage()); }
            
            try { System.out.println("Mean in integer triple: " + intengerTriple.mean()); }
            catch (UndefinedComponentException e) { System.out.println(e.getMessage()); }
           
            try { System.out.println("Max in integer triple: " + intengerTriple.max()); }
            catch (UndefinedComponentException e) { System.out.println(e.getMessage()); }
            
            intengerTriple.setRight(1);
            System.out.println("\nRefresh integer triple: " + intengerTriple);
            
            try { System.out.println("Min in refresh integer triple: " + intengerTriple.min()); }
            catch (Exception e) { System.out.println(e.getMessage()); }
           
            try { System.out.println("Mean in refresh integer triple: " + intengerTriple.mean()); }
            catch (UndefinedComponentException e) { System.out.println(e.getMessage()); }
           
            try { System.out.println("Max in refresh integer triple: " + intengerTriple.max()); }
            catch (UndefinedComponentException e) { System.out.println(e.getMessage()); }
            
            
            
            Triple<String> stringTriple = new Triple<>("Apple","Banana", "Peach");
            
            System.out.println("\nString triple: " + stringTriple);
            
            try { System.out.println("Min in string triple: " + stringTriple.min()); }
            catch (UndefinedComponentException e) { System.out.println(e.getMessage()); }
            
            try { System.out.println("Mean in string triple: " + stringTriple.mean()); }
            catch (UndefinedComponentException e) { System.out.println(e.getMessage()); }
            
            try { System.out.println("Max in string triple: " + stringTriple.max()); }
            catch (UndefinedComponentException e) { System.out.println(e.getMessage()); }

          
            Triple<Animal> mixTriple = new Triple<>(
                    new Animal(12, "Frog"),
                    new Animal(7, "Snake"),
                    new Animal(111, "Turtle"));
            System.out.println("\nMix triple: " + mixTriple);
           
            try { System.out.println("Min in mix triple: " + mixTriple.min()); }
            catch (UndefinedComponentException | ClassCastException e) { System.out.println(e.getMessage()); }
           
            try { System.out.println("Mean in mix triple: " + mixTriple.mean()); }
            catch (UndefinedComponentException | ClassCastException e) { System.out.println(e.getMessage()); }
            
            try { System.out.println("Max in mix triple: " + mixTriple.max()); }
            catch (UndefinedComponentException | ClassCastException e) { System.out.println(e.getMessage()); }
        }
        
        private static class Animal implements Comparable<Animal> {
            int age;
            String name;

            Animal (int age, String name) {
                this.age = age;
                this.name = name;
            }

            @Override
            public int compareTo(Animal o) {
                return age - o.age;
            }

            @Override
            public String toString() {
                return "(Animal) { " + "age=" + age + ", name=\"" + name + '\"' + '}';
            }
     }
}
