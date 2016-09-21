/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstrepo2;

/**
 *
 * @author emmettberger
 */
public class FirstRepo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int grade = readInt("What is your grade? ");
    
    if(grade >= 90)
    {
        System.out.println("A");
    }
    else if(grade >= 80 && grade <= 89)
    {
        System.out.println("B");
    }
    else if(grade >= 70 && grade <= 79)
    {
        System.out.println("C");
    }
    else if(grade >= 60 && grade <= 69)
    {
        System.out.println("D");
    }
    else
    {
        System.out.println("F");
    }
    }
    
}
