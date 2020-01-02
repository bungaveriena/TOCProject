/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingtic;

import java.util.Scanner;

public class pesantiket 
{
    public static void pesantiket()
    {
        setgetdata sgd = new setgetdata();
        Scanner sc = new Scanner(System.in);
        int movie;
        String choose;
        
        System.out.print("Movie 1/2");
        System.out.print(": ");
        movie = sc.nextInt();
        if (movie==1) 
        {
            sgd.setMovie("Harry Potter and the Order of the Phoenix");
        }
        else if (movie==2) 
        {
            sgd.setMovie("Harry Potter and the Half-Blood Prince");
        }
        System.out.print("Time 19.00/20.00");
        System.out.print(": ");
        sgd.setTime(sc.next());
        System.out.print("Seat A1/A2/A3/A4/A5");
        System.out.print(": ");
        sgd.setSeat(sc.next());
        if(movie==1)
        {
            sgd.setTheater("1");
        }
        else
        {
            sgd.setTheater("1");
        }
        System.out.println("Theater: "+sgd.getTheater());
        System.out.println("Price: 35000");
        sgd.setPrice(35000);
        System.out.print("Print tiket y/n? ");
        choose = sc.next();
        if (choose.equals("y"))
        {
            output out = new output();
            out.output();
        }
        else
        {
            jadwal jdwl = new jadwal();
            jdwl.jadwal();
        }
    }

}
