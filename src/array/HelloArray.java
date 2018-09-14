package array;

public class HelloArray {


    public static void main(String[] args) {
        String chuoi1 = "hello";
        String chuoi2 = "java";
        hienThiChuoiNoi(chuoi1, chuoi2);
        System.out.println(chuoi1);
    }

    public static void hienThiChuoiNoi(String chuoi1, String chuoi2) {
        if ("".equals(chuoi1)) {
            return;
        }
        chuoi1 = chuoi1 + " " + chuoi2;
        System.out.println(" " + chuoi1);
    }
}


























