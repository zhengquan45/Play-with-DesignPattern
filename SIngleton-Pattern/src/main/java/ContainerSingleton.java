import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private ContainerSingleton(){}
    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();
    public static Object getBean(String clazzName){
        synchronized (ioc){
            if(!ioc.containsKey(clazzName)){
                Object obj = null;
                try {
                    obj = Class.forName(clazzName).newInstance();
                    ioc.put(clazzName,obj);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return obj;
            }else{
                return ioc.get(clazzName);
            }
        }
    }
}
