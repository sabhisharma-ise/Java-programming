import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

//        switch (empID) {
//            case 1:
//                System.out.println("Employee 1");
//                break;
//            case 2:
//                System.out.println("Employee 2");
//                break;
//            case 3:
//                System.out.println("Employee 3");
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No department entered");
//                }
//                break;
//            default:
//                System.out.println("Enter correct empID");
//        }

        // better way to write
        switch (empID) {
            case 1 -> System.out.println("Employee 1");
            case 2 -> System.out.println("Employee 2");
            case 3 -> {
                System.out.println("Employee 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }
}
