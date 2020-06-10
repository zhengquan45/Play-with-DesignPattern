package demo;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EventListener {
    protected Map<String,Event>events = new HashMap<String, Event>();
    public void addListener(String eventType,Object target){
        try {
            this.addListener(eventType,
                    target,
                    target.getClass().getMethod("On"+toUpperFirstCase(eventType),Event.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    protected void trigger(String trigger){
        if(this.events.containsKey(trigger)){
           trigger(this.events.get(trigger).setTrigger(trigger));
        }
    }

    private void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try {
            if (event.getCallback() != null) {
                event.getCallback().invoke(event.getTarget(), event);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void addListener(String eventType, Object target, Method callback) {
        events.put(eventType,new Event(target,callback));
    }



    private String toUpperFirstCase(String eventType) {
        char[] chars = eventType.toCharArray();
        chars[0]-=32;
        return String.valueOf(chars);
    }
}
