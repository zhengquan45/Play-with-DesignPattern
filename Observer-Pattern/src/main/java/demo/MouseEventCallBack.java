package demo;

public class MouseEventCallBack {
    public void OnClick(Event e){
        System.out.println("触发单击事件" + e);
    }
    public void OnDoubleClick(Event e){
        System.out.println("触发双击事件" + e);
    }
    public void OnUp(Event e){
        System.out.println("触发弹起事件" + e);
    }
    public void OnDown(Event e){
        System.out.println("触发按下事件" + e);
    }
    public void OnMove(Event e){
        System.out.println("触发移动事件" + e);
    }
    public void OnWheel(Event e){
        System.out.println("触发滚动事件" + e);
    }
    public void OnOver(Event e){
        System.out.println("触发悬停事件" + e);
    }
    public void OnBlur(Event e){
        System.out.println("触发失焦事件" + e);
    }
    public void OnFocus(Event e){
        System.out.println("触发获焦事件" + e);
    }
}
