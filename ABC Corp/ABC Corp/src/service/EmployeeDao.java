package service;

import bean.Employee;
import bean.Skill;
import exception.EmployeeNotFoundException;
import util.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class EmployeeDao implements EmployeeManagementSystem {
    private ArrayList<Employee> employeeArray = new ArrayList<>();
    @Override
    public void addEmployee(Employee e) {
        if(e.getSkills().size() >=1)
           employeeArray.add(e);
        System.out.println(e.getEmpName()+ " is Added into DB");
    }

    @Override
    public void updateExperience(String empid, Skill s) throws EmployeeNotFoundException {
        int f=0;
        for(Employee i: employeeArray) {

            if (i.getEmpId() == Integer.valueOf(empid)) {
                i.setTotalExp(i.getTotalExp() + s.getExperience());
                i.getSkills().add(s);
                System.out.println(i.getEmpId() + " Is Updated Successfully...!");
                f = 1;
                break;
            }
        }
        if(f ==0 )
            throw new EmployeeNotFoundException();
            }





    @Override
    public ArrayList<Employee> getEmployeesWithSkill(String technology, int exp) {
        System.out.println("List of Employee with the requested Technology and Experiences .....! ");
        ArrayList<Employee> emp = new ArrayList<>();
        for (Employee i : employeeArray)
        {
            ArrayList<Skill> skillArray = i.getSkills();
            for(Skill s: skillArray)
            {
                if(s.getTechnology().equalsIgnoreCase(technology) && s.getExperience() >= exp)
                {
                   emp.add(i);
                }
            }
        }
        return emp;
    }

    @Override
    public HashMap<String, Integer> getSkillsSummary() {
        System.out.println("Here is the list of SKills Summary.........! ");
        HashMap<String,Integer> techCount = new HashMap<>();
        for(Employee e : employeeArray)
        {
            ArrayList<Skill>  skillArrayList = e.getSkills();
            for(Skill s : skillArrayList)
            {
                techCount.put(s.getTechnology(),techCount.getOrDefault(s.getTechnology(),0)+1);
            }
        }
        return techCount;
    }
}
