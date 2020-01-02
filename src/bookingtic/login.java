/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingtic;

import java.util.Scanner;

public class login 
{
    static String init;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        System.out.println("==========MASUK==========");
        login();
    }

    public static void login() 
    {
        
        System.out.print("Initial: ");
        init = sc.next();
        if (init.equals("admin"))
        {
            jadwal obj = new jadwal();
            obj.jadwal();
        }
        else
        {
            System.out.println("=====INITIAL SALAH=====");
            System.out.println("Initial: ");
            init = sc.next();
            if (init.equals("admin"))
            {
                jadwal obj = new jadwal();
                obj.jadwal();
            }
            else
            {
                login();
            }
        }
    }
    
}
