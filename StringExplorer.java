/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        
        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);
        int notFoundPsn = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
        int position2 = sample.indexOf("jumped");
        System.out.println("sample.indexOf(\"jumped\") = " + position2);
        int notFoundPsn2 = sample.indexOf("jump");
        System.out.println("sample.indexOf(\"jump\") = " + notFoundPsn2);
        int position3 = sample.indexOf("brown");
        System.out.println("sample.indexOf(\"brown\") = " + position3);
        int notFoundPsn3 = sample.indexOf("own");
        System.out.println("sample.indexOf(\"own\") = " + notFoundPsn3);
        
        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);
        
        //  Edited by Sydney Lohman

    }

}
