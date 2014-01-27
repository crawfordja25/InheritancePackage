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
    
    public int wages(int salary, int sales, int commisionRate){
        int commission = sales*commisionRate;
        return salary+commission;
    }
}
