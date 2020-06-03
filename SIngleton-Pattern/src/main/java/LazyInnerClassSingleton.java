//兼顾了饿汉式单例模式内存浪费的问题和synchronized关键字的性能问题
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        if(LazyHolder.LAZY!=null){
            throw new RuntimeException("不允许多个实例对象");
        }
    }

    //调用静态方法一定会先加载静态内部类
    public static LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }
    //默认不加载
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
