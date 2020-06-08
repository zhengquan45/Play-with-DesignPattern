package simple;

public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outputDC5V() {
        int input = ac220.outputAC220();
        int output = input / 44;
        System.out.println("输出直流电" + output+"V");
        return output;
    }
}
