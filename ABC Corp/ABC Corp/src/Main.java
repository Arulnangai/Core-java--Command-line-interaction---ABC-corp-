import bean.Employee;
import bean.Skill;
import exception.EmployeeNotFoundException;
import service.EmployeeDao;
import util.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws EmployeeNotFoundException {
        EmployeeDao employeeDao = new EmployeeDao();
        Date d = new Date();
        d.setYear(2002);
        d.setMonth(04);
        d.setDate(12);

        Skill s1 = new Skill("C",15);
        Skill s2 = new Skill("C++",10);
        Skill s3 = new Skill("Oracle",10);
        Skill s4 = new Skill("Oracle",4);
        Skill s5 = new Skill("Java",15);
        Skill s6 = new Skill("Oracle",10);
        Skill s7 = new Skill("Web",5);
        Skill s8 = new Skill("Dotnet",10);
        Skill s9 = new Skill("SQLServer",4);

        ArrayList<Skill> sk1 = new ArrayList<>();
        sk1.add(s1);
        sk1.add(s3);
        Employee e1 = new Employee(1001,"Arun",1212121212,d,25,sk1);
        employeeDao.addEmployee(e1);

        ArrayList<Skill> sk2 = new ArrayList<>();
        sk2.add(s2);
        sk2.add(s4);
        Employee e2 = new Employee(1002,"Krupa",222222222,d,14,sk2);
        employeeDao.addEmployee(e2);

        ArrayList<Skill> sk3 = new ArrayList<>();
        sk3.add(s5);
        sk3.add(s6);
        sk3.add(s7);
        Employee e3 = new Employee(1003,"Thomas",4444444,d,30,sk3);
        employeeDao.addEmployee(e3);

        ArrayList<Skill> sk4 = new ArrayList<>();
        sk4.add(s8);
        sk4.add(s9);
        Employee e4 = new Employee(1004,"Koushik",66666666,d,15,sk4);
        employeeDao.addEmployee(e4);

        Skill s10 = new Skill("C",20);
        try {
            employeeDao.updateExperience("1001", s10);
            System.out.println("Updated employee details" +"\n"+ e1);
        } catch (EmployeeNotFoundException e)
        {
            System.out.println(e);
        }

        ArrayList<Employee> emp = employeeDao.getEmployeesWithSkill("Oracle",2);
        for(Employee i : emp)
        System.out.println(i);

        HashMap<String,Integer> techCount = employeeDao.getSkillsSummary();
        for(Map.Entry<String,Integer> me : techCount.entrySet())
        System.out.println(me.getKey()+" \t "+ me.getValue());
    }
}