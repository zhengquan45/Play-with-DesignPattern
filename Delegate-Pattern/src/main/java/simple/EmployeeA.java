package simple;

public class EmployeeA implements IEmployee {
    public void doing(String command) {
        System.out.println("我是员工A,开始干" + command + "工作");
    }
}
