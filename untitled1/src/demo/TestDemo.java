package demo;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        String s=ArrayUtil.printArr(arr);
        System.out.println(s);
        double aveger=ArrayUtil.GetAerage(arr);
        System.out.println(aveger);
    }
}
