package jdk;

public class Test {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher a = new Teacher("Tom");
        Teacher b = new Teacher("Jerry");
        gPer.addObserver(a);
        gPer.addObserver(b);

        Question question = new Question();
        question.setUsername("xiaoming");
        question.setContent("你是🐷吗");
        gPer.publishQuestion(question);
    }
}
