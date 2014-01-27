
package inheritancepractice;

import inheritancepractice.my.concrete.HourlyEmployee;

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
        emp1.address = "W421S6842 Trailblazer Road Pewaukee, WI 53044";
        emp1.employeeBirthdate = "09/25/1981";
        emp1.employeeNumber = 1;
        emp1.hours = 40;
        emp1.wage = 30;
        
        System.out.println("Employee Number 1 Address: " +emp1.address+ " Birthdate: "+ emp1.employeeBirthdate+
                " Employee Number: "+ emp1.employeeNumber+ " Employee Hours: "+ emp1.hours+" Employee Wages: $"+emp1.hours*emp1.wage);
    }
    
}
