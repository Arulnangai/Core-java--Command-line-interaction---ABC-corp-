package util;

import bean.Employee;
import bean.Skill;
import exception.*;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public interface EmployeeManagementSystem {
    public void addEmployee(Employee e);
    public void updateExperience(String empid, Skill s) throws EmployeeNotFoundException;
    public ArrayList<Employee> getEmployeesWithSkill(String technology,int exp);
    public HashMap<String,Integer> getSkillsSummary();
}
