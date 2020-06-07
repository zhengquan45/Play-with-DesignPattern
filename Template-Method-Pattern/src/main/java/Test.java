public class Test {
    public static void main(String[] args) {
        NetCourse java = new JavaNetCourse();
        java.createCourse();

        NetCourse bigdata = new BigDataNetCourse(true);
        bigdata.createCourse();
    }
}
