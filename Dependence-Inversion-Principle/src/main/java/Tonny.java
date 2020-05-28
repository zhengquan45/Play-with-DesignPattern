public class Tonny {
    private ICourse course;

    public Tonny(ICourse course) {
        this.course = course;
    }

    public void study(){
        course.study();
    }

    public static void main(String[] args) {
        Tonny tonny = new Tonny(new PythonCourse());
        tonny.study();
    }
}
