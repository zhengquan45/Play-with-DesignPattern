package demo;

public class Test {
    public static void main(String[] args) {
        MouseEventCallBack callBack = new MouseEventCallBack();
        Mouse mouse = new Mouse();
        mouse.addListener(MouseEventType.ON_CLICK,callBack);
        mouse.click();
        mouse.addListener(MouseEventType.ON_MOVE,callBack);
        mouse.blur();
    }
}
