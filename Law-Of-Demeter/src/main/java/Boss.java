public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

    public static void main(String[] args) {
        new Boss().commandCheckNumber(new TeamLeader());
    }
}
