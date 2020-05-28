public class Tom {
    public void study(ICourse course){
        course.study();
    }

    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.study(new JavaCourse());
    }
}
