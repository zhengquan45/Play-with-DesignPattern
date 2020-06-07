package simple;

public class EmployeeB implements IEmployee {
    public void doing(String command) {
        System.out.println("我是员工B,开始干" + command + "工作");
    }
}
