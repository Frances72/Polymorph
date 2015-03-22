/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestSalEmpClss {

   public static void main(String [] args)
   {
      Salary s = new Salary("Sarah Martin", "Goodwood, CT", 3, 3600.00);
      Employee e = new Salary("John Adams", "Edgemead, CT", 2, 2400.00);
      System.out.println("Call mailCheck using Salary reference --");
      s.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
    }
}    

