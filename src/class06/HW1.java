package class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keybord = new Scanner(System.in);
        System.out.println("Please tell me where are you from?");
        String country=keybord.nextLine();
        String languge;

        switch(country) {

        case "USA":
        	languge="English";
            break;
        case "Kazakhstan":
        	languge="Kazakh";
            break;
        case "Turkey":
        	languge="Turkish";
            break;
        case "Venezuela":
        	languge="Spanish";
            break;
        case "India":
        	languge="Hindi";
            break;
        case "Yemen":
        	languge="Arabic";
            break;
        case "Afghanistan":
        	languge="Persian";
            break;
        case "Pakistan":
        	languge="Urdo";
        	break;
        case "Tajikstan":
        	languge="Persian";
        	break;
        case "Japan":
        	languge="Japanies";
        	break;
        default:
        	languge="Unknown";
            break;
        }

        System.out.println("You are from "+country+
                " and your speeking "+languge) ;
    }


	}


