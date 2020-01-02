/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingtic;

import java.util.Scanner;


public class jadwal 
{
    static String choose;
    static Scanner sc = new Scanner(System.in);
    
    public static void jadwal()
    {
        System.out.print("**********JADWAL**********\n"
                + "1. Harry Potter and the Order of the Phoenix\n"
                + "2. Harry Potter and the Half-Blood Prince\n"
                + "Pesan tiket? y/n: ");
        choose = sc.next();
        if (choose.equals("y"))
        {
            pesantiket obj = new pesantiket();
            obj.pesantiket();
        }
        else
        {
            jadwal();
        }
    }
}
