package org.zhq.staticize.meipo;

public class Father {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove(){
        System.out.println("父亲物色");
        son.findLove();
        System.out.println("双方同意交往,确定关系");
    }

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
