package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Film {


    public static void main(String[] args)  

    {
        System.out.println("Welcome to the Film category");
        System.out.println();
        System.out.println("There are 1000 fils");
        System.out.println("horror");
        Scanner scanner = new Scanner(System.in);
        /**
         * Constructs and initializes a point on position (x)
         * @params
         */

        ArrayList<String> action = new ArrayList<String>();
         action.add("Robot Chicken");
         action.add("Family Guy");
         action.add("American Dad");
         /**
          * Differen films and choices
          * from horrors to fantasys
          */

         ArrayList<String>comedy = new ArrayList<String>();
         comedy.add("John Q");
         comedy.add("The Green Mile");
         comedy.add("The Breakfast Club");

         ArrayList<String> horror = new ArrayList<String>();
         horror.add("Scream");
         horror.add("Carrie");
         horror.add("Insideous");

         ArrayList<String> fantasy = new ArrayList<String>();
         fantasy.add("The Book of Eli");
         fantasy.add("Daybreakers");
         fantasy.add("Hunter Prey");

        String choice = null;
		while(choice.equalsIgnoreCase("y"))
            {
            System.out.print("What category are you interested in?");

                        String filmlist = scanner.nextLine();
                    switch (filmlist) {
                        case "action":
                            System.out.println(action);
                            break;
                        case "comedy":
                            System.out.println(comedy);
                            break;
                        case "horror":
                            System.out.println(horror);
                            break;
                        case "fantasy":
                            System.out.println(fantasy);
                            break;
                            /**
                             * choose wisely
                             */
                    }

            System.out.print("Continue? y/n): ");
            choice = scanner.next();
            }
                    }


    }
