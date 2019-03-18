
/**
 * @Admin# 1727779
 * @Class DIT/FT/1B/21
 * @author Min
 */
import java.util.Scanner;

public class ChatBot {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        Scanner userinput = new Scanner(System.in);
        String message;
        String GenderInput;

        boolean gendercheck = false;
        System.out.println("Press \"1\" to chat" + " & " + "\"2\" to play games");                  //popup for 1 to chat and 2 to play
        int startup = choice.nextInt();
        switch (startup) {
            case 1:
                System.out.println("You have chosen to chat with me!");
                break;
            case 2:
                System.out.println("you have chsen to play word games with me!");
                break;
            default:
                System.out.println("You have entered an invalid value. Please enter either 1 or 2");
                break;
        }//end of switch

        if (startup == 1) {                                                                         //if the user wants the chatbot
            System.out.println("Bot:\tI am Mat, a chatbot. May i know your name please?");          //asking for the user's name
            String name = userinput.nextLine();
            String username = name.substring(0, 1).toUpperCase() + name.substring(1);
            message = "Mat:\tHello! " + username + " Are you a boy or a girl?";                     // asking for gender
            System.out.println(message);
            message = "\tInput ur gender:";

            while (gendercheck != true) {
                System.out.println(message);
                GenderInput = userinput.nextLine().toLowerCase();
                switch (GenderInput) {
                    case "boy":
                    case "man":
                    case "M":
                    case "male":
                    case "dude":
                    case "guy":
                        System.out.println("Hi. Mr. " + name);                                      //printing out Mr and name if it is a male
                        gendercheck = true;
                        break;
                    case "girl":
                    case "female":
                    case "F":
                    case "woman":
                    case "lady":
                        System.out.println("Hi. " + "Ms. " + name);                                 //printing out Ms and name if it is a female
                        gendercheck = true;
                        break;
                    case "madam":
                        System.out.println("Hi. Madam " + name);
                    default:
                        message = "Sorry i didn't get your gender.\nPlease try again";
                }
            }     
        }//end of main if
        else //main else                                                                            //printing this if the user wants to use the WordGame Bot
        {
            System.out.println("Hello! I am a Word Game Bot. You can call me \"Tam\".2");
            
        }
    }//end of main
}//end of class
