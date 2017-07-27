package scut.carson_ho.reflect_demo;

/**
 * Created by Carson_Ho on 17/7/27.
 */

public class Student {

    public Student() {
        System.out.println("创建了一个Student实例");
    }

    // 无参数方法
    public void setName1 (){
        System.out.println("调用了无参方法：setName1（）");
    }

    // 有参数方法
    public void setName2 (String str){
        System.out.println("调用了有参方法setName2（String str）:" + str);
    }
}
