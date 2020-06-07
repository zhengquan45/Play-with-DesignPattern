public class BigDataNetCourse extends NetCourse {
    private boolean check;

    public BigDataNetCourse(boolean check) {
        this.check = check;
    }

    @Override
    protected boolean needHomework() {
        return check;
    }

    protected void checkHomework() {
        System.out.println("检查大数据的作业");
    }
}
