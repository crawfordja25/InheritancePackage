/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancepractice.myinterface;

/**
 *
 * @author Justin
 */
public class SalaryPlusCommissionEmployee implements Employee{
    public String Name(String name){
        return name;
    }
    public String Address(String address){
        return address;
    }
    
    public double wages(int salary, int sales, double commisionRate){
        double commission = sales*commisionRate;
        return salary+commission;
    }
}
