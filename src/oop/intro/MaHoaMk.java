package oop.intro;

public class MaHoaMk {
    public String maHoa(String mk){
        System.out.println("Ma hoa " + mk);
        return "abc";
    }

    public static void main(String[] args) {
        MaHoaMk maHoaMk = GetMaHoaMK();
        String mk = maHoaMk.maHoa("123123");
        System.out.println(mk);


        MaHoaMk maHoaMk2 = GetMaHoaMK();
        maHoaMk2.maHoa("asdfd");

    }

    private static MaHoaMk GetMaHoaMK() {
        return new MaHoaMk3();
    }
}
