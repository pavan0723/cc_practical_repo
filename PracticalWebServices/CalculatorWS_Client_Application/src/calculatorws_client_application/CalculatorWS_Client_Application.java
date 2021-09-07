/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorws_client_application;

/**
 *
 * @author Anonymous
 */
public class CalculatorWS_Client_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            // Addition
            int a1 = 3;
            int a2 = 4;
            int addResult = add(a1, a2);
            System.out.println("Addition of " + a1 + " and " + a2 + " is " + addResult);
            
            // Substraction
            int s1 = 5;
            int s2 = 4;
            int subResult = sub(s1, s2);
            System.out.println("Substraction of "+ s1 + " and "+ s2 + " is " + subResult);
        }catch(Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    private static int add(int i, int j) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(i, j);
    }

    private static int sub(int i, int j) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.sub(i, j);
    }
    
}
