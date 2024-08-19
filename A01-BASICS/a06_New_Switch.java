public class a06_New_Switch {
    public static void main(String[] args) {
        String day = "Monday";
        String result = "";

        //New : you dont need to write "Break"
        result = switch(day){

            case "Saturday", "Sunday" -> "10AM";

            case "Friday" -> "6AM";

            default -> "7AM";
        }; // <- semicolon

        System.out.println(result);
        
        // Old
        // switch(day){

        //     case "Saturday", "Sunday":
        //         System.out.println("10AM");
        //         break;

        //     case "Friday":
        //         System.out.println("6AM");
        //         break;

        //     default :
        //         System.out.println("7AM");
        // }
    }
}
