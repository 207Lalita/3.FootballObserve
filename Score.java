import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        String input = "start";
        Scanner in = new Scanner(System.in);
        FirstAudience first = new FirstAudience();
        SecondAudience second = new SecondAudience();
        RecordHeadQuater headQuater = new RecordHeadQuater();

        headQuater.register(first);
        headQuater.register(second);

        while (input != ""){
            System.out.print("Enter Score ");
            input = in.nextLine();
            if (input != ""){
                headQuater.setMatch(input);
            }else{
                System.out.println("\'New match was updated already\'");
            }
        }
    }
}
