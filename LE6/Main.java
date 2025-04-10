/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/
public class Main{
    public static void main(String[] args){
        Offering offering =new Coffee();
        offering = new Rum(offering);
        offering = new Gin(offering);
        System.out.println(offering.getName() + " :- "+offering.getPrice());
        
        Offering offering2 =new Icecream();
        offering = new Rum(offering2);
        offering = new Gin(offering2);
        System.out.println(offering.getName() + " :- "+offering.getPrice());
    }
}
