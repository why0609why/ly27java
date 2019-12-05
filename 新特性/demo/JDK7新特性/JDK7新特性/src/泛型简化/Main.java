package 泛型简化;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //这是没有泛型简化
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //这是泛型简化
        ArrayList<Integer> arrayList1 = new ArrayList<>();
    }
}
