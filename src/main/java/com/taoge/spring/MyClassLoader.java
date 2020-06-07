package com.taoge.spring;

import com.taoge.spring.bean.Stu;
import com.taoge.spring.bean.Teacher;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader {

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        int index=name.lastIndexOf(".");
        String prefix=name.substring(0,index+1).replace(".","/");
        String suffix=name.substring(index+1)+".class";
        String fileName=prefix+suffix;
        InputStream inputStream=this.getResourceAsStream(fileName);
        try {
            byte[] data=new byte[inputStream.available()];
            inputStream.read(data);
            return defineClass(name, data, 0, data.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
       throw new ClassNotFoundException();
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader classLoader=new MyClassLoader();
        Teacher teacher=(Teacher)classLoader.loadClass("com.taoge.spring.bean.Teacher",true).newInstance();
//        teacher.setAge(10);
//        teacher.setName("hhe");
        System.out.println(teacher.toString());
        System.out.println(teacher instanceof  Teacher);

    }
}
