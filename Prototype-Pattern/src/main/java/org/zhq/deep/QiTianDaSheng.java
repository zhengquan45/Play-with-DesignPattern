package org.zhq.deep;

import java.io.*;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    public jinGuBang jinGuBang;

    public QiTianDaSheng() {
        this.birthday = new Date();
        this.jinGuBang = new jinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    private Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            copy.birthday = new Date();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public QiTianDaSheng shallowClone(QiTianDaSheng qiTianDaSheng) {
        QiTianDaSheng copy = new QiTianDaSheng();
        copy.height = qiTianDaSheng.height;
        copy.weight = qiTianDaSheng.weight;
        copy.jinGuBang = qiTianDaSheng.jinGuBang;
        copy.birthday = new Date();
        return copy;
    }

    public static void main(String[] args) {
        QiTianDaSheng q = new QiTianDaSheng();
        try {
            QiTianDaSheng c = (QiTianDaSheng) q.clone();
            System.out.println("深拷贝:" + (c.jinGuBang == q.jinGuBang));
        } catch (Exception e) {
            e.printStackTrace();
        }

        QiTianDaSheng s = q.shallowClone(q);
        System.out.println("浅拷贝:" + (s.jinGuBang == q.jinGuBang));
    }
}
