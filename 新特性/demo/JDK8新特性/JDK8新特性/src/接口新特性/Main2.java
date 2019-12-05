package 接口新特性;

import java.security.MessageDigest;

public class Main2 {
    public static void main(String[] args) throws Exception{
        String[] attr = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        //明文
        String pwd = "傻逼东西";
        //密文
        String mw = "";
        //MD5加密算法，任何明文经过加密之后都是变成一个长度为32位的字符串
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");

        //中间会产生一个长度为16的字节数组
        byte[] digest = messageDigest.digest(pwd.getBytes("UTF-8"));

        //通过这个字节数组来获取两个索引
        for (byte b : digest) {
            int temp = b;
            if (temp<0){
                temp+=256;
            }
            int index1 = temp/16;
            int index2 = temp%16;
            //通过这两个索引来拼接16进制的字符串
            mw += attr[index1];
            mw += attr[index2];
        }

        //可以看出不管多长的明文字符串经过MD5加密后，产生的都是长度为32的内容是16进制的字符串
        System.out.println(mw);
        System.out.println(mw.length());
    }
}
