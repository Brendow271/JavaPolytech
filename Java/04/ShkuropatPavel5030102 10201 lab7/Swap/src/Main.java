public class Main {
    public static void main(String[] args) {
        //Init
        Integer firstInteger = 1600, secondInteger = 15;
        String firstString = "Hippopotamus", secondString = "Dog";
        Animal firstAnimal = new Animal(2, "Rat"), secondAnimal = new Animal(1, "Axolotl");

        ObjectWrapper<Integer> firstIntegerWrap = new ObjectWrapper<>(firstInteger);
        ObjectWrapper<Integer> secondIntegerWrap = new ObjectWrapper<>(secondInteger);

        System.out.println("Before:\n" +
                            "FirstInt:\t" + firstInteger + "\n" +
                            "SecondInt:\t" + secondInteger);

        firstIntegerWrap.swap(secondIntegerWrap);

        firstInteger = firstIntegerWrap.getData();
        secondInteger = secondIntegerWrap.getData();

        System.out.println("After:\n" +
                "FirstInt:\t" + firstInteger + "\n" +
                "SecondInt:\t" + secondInteger + "\n");


        ObjectWrapper<String> firstStringWrap = new ObjectWrapper<>(firstString);
        ObjectWrapper<String> secondStringWrap = new ObjectWrapper<>(secondString);

        System.out.println("Before:\n" +
                "FirstInt:\t" + firstString + "\n" +
                "SecondInt:\t" + secondString);

        firstStringWrap.swap(secondStringWrap);

        firstString = firstStringWrap.getData();
        secondString = secondStringWrap.getData();

        System.out.println("After:\n" +
                "FirstInt:\t" + firstString + "\n" +
                "SecondInt:\t" + secondString + "\n");


        ObjectWrapper<Animal> firstAnimalWrap = new ObjectWrapper<>(firstAnimal);
        ObjectWrapper<Animal> secondAnimalWrap = new ObjectWrapper<>(secondAnimal);

        System.out.println("Before:\n" +
                "FirstInt:\t" + firstAnimal + "\n" +
                "SecondInt:\t" + secondAnimal);

        firstAnimalWrap.swap(secondAnimalWrap);

        firstAnimal = firstAnimalWrap.getData();
        secondAnimal = secondAnimalWrap.getData();

        System.out.println("After:\n" +
                "FirstInt:\t" + firstAnimal + "\n" +
                "SecondInt:\t" + secondAnimal);
    }

    private static class Animal {
        Animal(int valI, String valS)
        {
            this.type = valS;
            this.weight = valI;
        }
        int weight;
        String type;

        @Override
        public String toString() {
            return "(Animal) { " + "weight=" + weight + ", name=\"" + type + '\"' + '}';
        }
        }

}
