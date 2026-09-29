public class Main {

    public static void main(String[] args)
    {
        //Declarations
        String party;

        //User output
        System.out.println("Enter your Political Party: Democrat,Republican,Independent?");

        //Input
        party = "Z";
        System.out.println(party);

        //Conditions
        if (party == "R")
        {
            //Output
            System.out.println("You get a Republican Elephant");
        }
        else if (party == "D")
        {
            //Output
            System.out.println("You get a Democratic Donkey");
        }
        else if (party == "I")
        {
            System.out.println("You are an Independent Human");

        }
        else
        {
            System.out.println("You get an other??");

        }

    }
}