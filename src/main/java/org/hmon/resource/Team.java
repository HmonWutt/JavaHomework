package org.hmon.resource;
import org.hmon.A011.Time;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Team {
    private ArrayList<Employee> member = new ArrayList<>();
    public void add (Employee employee){
        member.add(employee);
    }
    @Override
    public String toString(){
        StringBuilder finalString = new StringBuilder();
        finalString.append("#TEAM: \n");
        for (Employee each: member) {
            String eachEmployee = String.format("%s\n", each.toString());
            finalString.append(eachEmployee);
        }
        return finalString.toString();
    }
    public String work(){
        StringBuilder working = new StringBuilder();
        for (Employee each: member){
            working.append(each.work());
        }
        return working.toString();
    }

    public String salaryReport(){
        StringBuilder salaryReport  = new StringBuilder();
        int totalSalary = 0;
        salaryReport.append(String.format("# TEAM Salary %s %d\n",Time.getMonth(),Time.getYear()));
        String line = "--------------------------------\n";
        salaryReport.append(line);
        for (Employee each: member){
            String employeeData = String.format("(%s) %-20s ",each.empId,each.getName());
            salaryReport.append(employeeData);
            String formattedSalary = NumberFormat.getInstance().format(each.getSalary());
            String salary = String.format("%s\n",formattedSalary);
            salaryReport.append(salary);
            totalSalary+= each.getSalary();
        }
        salaryReport.append(line);
        salaryReport.append(String.format("%-25s","Total salary is "));
        String formattedTotalSalary = NumberFormat.getInstance().format(totalSalary);
        salaryReport.append(formattedTotalSalary).append("\n");
        String dateGenerated = String.format("Report generated %s.",Time.getDate());
        salaryReport.append(dateGenerated);
        return salaryReport.toString();

    }

}
