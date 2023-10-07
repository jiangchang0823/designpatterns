package com.iss.designpatterns.io;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @author VODE CODC
 * @description TODO
 * @create 2023-10-01 19:46
 **/

public class TestSerializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a1 = new A(123, "def");
        String objectFile = "/Users/bytedance/java-space/designpatterns/DesignPatterns/src/main/java/com/iss/designpatterns/io/file/a1.txt";
        File file = new File(objectFile);
        boolean exists = file.exists();
        if(!exists){
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(objectFile);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(a1);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(objectFile));
        A a2 = (A) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(a2);

        URL url = new URL("http://www.baidu.com");
        InputStream inputStream = url.openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    private static class A implements Serializable {
        private int x;
        private String y;

        A(int x, String y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "x = " + x + "  " + "y = " + y;
        }
    }

}
