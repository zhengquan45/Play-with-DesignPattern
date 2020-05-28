import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkNumberOfCourses(){
        List<Course>list = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            list.add(new Course());
        }
        System.out.println("目前发布了" + list.size() + "个课程");
    }
}
