
package inheritancepractice;

import inheritancepractice.my.concrete.HourlyEmployee;
import inheritancepractice.myinterface.SalaryPlusCommissionEmployee;

/**
 *
 * @author Justin
 */
public class InheritancePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HourlyEmployee emp1 = new HourlyEmployee();
        emp1.name = "James Smith";
        emp1.address = "W421S6842 Trailblazer Road Pewaukee, WI 53044";
        emp1.employeeBirthdate = "09/25/1981";
        emp1.employeeNumber = 1;
        emp1.hours = 40;
        emp1.wage = 30;
        
        System.out.println("Employee 1 Name: "+emp1.name+" Address: " +emp1.address+ " Birthdate: "+ emp1.employeeBirthdate+
                " Employee Number: "+ emp1.employeeNumber+ " Employee Hours: "+ emp1.hours+" Employee Wages: $"+emp1.hours*emp1.wage);
        
//**************************************************************************************************************************
        SalaryPlusCommissionEmployee emp2 = new SalaryPlusCommissionEmployee();
        
        
        System.out.println("Employee 2 Name: "+ emp2.Name("Tim Smith")+ " Address: "+emp2.Address("W555S44578 Springmist Lane Kingsdale, IL 606601")+
                " Wages: $"+emp2.wages(10000, 4000, .04));
    }
    
}
