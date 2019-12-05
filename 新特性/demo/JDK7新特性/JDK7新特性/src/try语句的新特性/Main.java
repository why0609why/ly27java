package try语句的新特性;

import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        //这是原来的写法,关闭资源在try或者finally语句块里关闭
        try {
            FileReader fr = new FileReader("src/try语句的新特性/a.txt");
            FileWriter fw = new FileWriter("src/try语句的新特性/b.txt");

            int ch = 0;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fw.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //这是用了try的新特性的写法,写在try后面括号里的资源最后都会被关闭
        try (FileReader fr = new FileReader("src/try语句的新特性/a.txt");
             FileWriter fw = new FileWriter("src/try语句的新特性/b.txt");) {

            int ch = 0;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
