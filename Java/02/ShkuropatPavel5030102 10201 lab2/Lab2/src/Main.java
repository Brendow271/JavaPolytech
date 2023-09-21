

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex1:");
        boolean isTrue = true, isFalse = false;
        System.out.println(isTrue && isFalse? "Yeahhh!" : "Oooops("); // 1 * 0 = 0
        System.out.println(isTrue || isFalse? "Yeahhh!" : "Oooops("); // 1 + 0 = 1
        System.out.println((isTrue && !isFalse? "Yeahhh!" : "Oooops(") + "\n"); // 1 * !0 = 1 * 1 = 1

        System.out.println("Ex2:");
        int ageMasha = 19, ageDasha = 20;
        System.out.println("Who is older?");
        System.out.println((ageMasha < ageDasha ? "Dasha" : "Masha") + "\n");

        System.out.println("Ex3:");
        int value1 = 117, value2 = 333;
        System.out.println("Decimal" + " Val1: " + value1 + " Val2: " + value2);
        System.out.println("Binary" + " Val1: " + Integer.toBinaryString(value1) + " Val2: "+ Integer.toBinaryString(value2));
        System.out.println("Decimal &: " +  Integer.toBinaryString(value1 & value2) + "\n" + "Binary &: " + (value1 & value2));
        System.out.println("Decimal |: " +  Integer.toBinaryString(value1 | value2) + "\n" + "Binary |: " + (value1 | value2));
        System.out.println("Decimal ^: " +  Integer.toBinaryString(value1 ^ value2) + "\n" + "Binary ^: " + (value1 ^ value2));
        System.out.println("Decimal: " +  Integer.toBinaryString(value1) + "\n" + "Binary: " + value1);
        System.out.println("Decimal ~: " +  Integer.toBinaryString(~value1) + "\n" + "Binary ~: " + ~value1);
        System.out.println("Так происходит, потому что переменная типа int занимает 4 байта, т.е. 32 бита");

        value1 = 16;
        int StepCount = 2;
        System.out.println("Decimal: " +  Integer.toBinaryString(value1) + "\n" + "Binary: " + value1);
        System.out.println("Decimal <<: " +  Integer.toBinaryString(value1 << StepCount) + "\n" + "Binary <<: " + (value1 << StepCount));
        System.out.println("Decimal >>: " +  Integer.toBinaryString(value1 >> StepCount) + "\n" + "Binary >>: " + (value1 >> StepCount));
        StepCount = 5;
        value1 = -16;
        System.out.println("Decimal: " +  Integer.toBinaryString(value1) + "\n" + "Binary: " + value1);
        System.out.println("Decimal >>: " +  Integer.toBinaryString(value1 >> StepCount) + "\n" + "Binary >>: " + (value1 >> StepCount));
        System.out.println(("Decimal >>>: " +  Integer.toBinaryString(value1 >>> StepCount) + "\n" + "Binary >>>: " + (value1 >>> StepCount)) + "\n" );

        System.out.println("Ex4:");

        System.out.print("String: ");
        String day = "Thursday";
        switch (day) {
            case "Monday":
                System.out.println("Today is windy!");
                break;
            case "Thursday":
                System.out.println("Today is sunny!");
                break;
            case "Wednesday":
                System.out.println("Today is rainy!");
                break;
            default:
                System.out.println("Oooops, something wrong !");
        }

        System.out.print("Enum: ");
        Cars c;
        c = Cars.VOLGA;
        switch (c) {
            case BMW:
                System.out.println("You choose BMW!");
                break;
            case JEEP:
                System.out.println("You choose JEEP!");
                break;
            case AUDI:
                System.out.println("You choose AUDI!");
                break;
            case VOLKSWAGEN:
                System.out.println("You choose VOLKSWAGEN!");
                break;
            case NANO:
                System.out.println("You choose NANO!");
                break;
            case VOLGA:
                System.out.println("You choose DevyatKa!");
                break;
            default:
                System.out.println("NEW BRAND'S CAR(");
                break;
        }

        System.out.print("Char: ");
        char letter = 'T';
        switch (letter)
        {
            case 'T':
                System.out.println("TRUE!");
                break;
            case 'F':
                System.out.println("FALSE!");
                break;
            case 'N':
                System.out.println("NOT STATED!");
                break;
            default:
                System.out.println("Choose another answer!");
                break;
        }

        System.out.print("Byte: ");
        byte valB = 4;
        switch (valB)
        {
            case 5:
                System.out.println("Perfect!");
                break;
            case 4:
                System.out.println("Good!");
                break;
            case 3:
                System.out.println("Satisfactory!");
                break;
            case 2:
                System.out.println("Unsatisfactory!");
                break;
            default:
                System.out.println("Retake!");
                break;
        }

        System.out.print("int: ");
        int valI = 5;
        switch (valI)
        {
            case 5:
                System.out.println("Perfect!");
                break;
            case 4:
                System.out.println("Good!");
                break;
            case 3:
                System.out.println("Satisfactory!");
                break;
            case 2:
                System.out.println("Unsatisfactory!");
                break;
            default:
                System.out.println("Retake!");
                break;
        }

        System.out.print("Short: ");
        short valS = 3;
        switch (valS)
        {
            case 5:
                System.out.println("Perfect!");
                break;
            case 4:
                System.out.println("Good!");
                break;
            case 3:
                System.out.println("Satisfactory!");
                break;
            case 2:
                System.out.println("Unsatisfactory!");
                break;
            default:
                System.out.println("Retake!");
                break;
        }
    }
}

enum Cars {
    BMW,
    JEEP,
    AUDI,
    VOLKSWAGEN,
    NANO,
    VOLGA;
}



