/*
 * Copyright (C) 2020 cstuser
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package app;

/**
 *
 * @author Aristotelis Kondylis
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello this is App!!");
        System.out.println("Adding an output to my app!");
        
        int a = 0;
        int b = 2;
        boolean result = (a==b);
        System.out.println("Is a = b?" + result);
        System.out.println("The value of a is"+a);
        System.out.println("The value of b is"+b);
        
        if (a!=b) {
            System.out.println("The value of a is not EQUAL to b");
        } else if (a==0) {
            System.out.println("Only if FALSE and a is ZERO");
        } else {
         System.out.println("ELSE");
     }
        System.out.println("OUTSIDE");
        
        String strResult;
        
        //a = 4;
        
        strResult = (a==b)?"***TRUE***":"!!!FALSE!!!";
        
        System.out.println("Is a = b?" + strResult);
        System.out.println("Is a = b?" + (a==b));
        
        b = (a==b)?0:-1;
        
        System.out.println("The value of b is " + b);
    }
    
}
