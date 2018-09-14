package CleanCode;

import java.io.File;
import java.io.IOException;
//CamelCase
public class DuplicatedCode {

    public static void main(String[] args) throws IOException {
        String dirPath = "/Users/phanquangtrung/Documents/workspace/codegym/java";
        String dirPath2 = "/Users/phanquangtrung/Desktop";
        hienThi(dirPath);
        hienThi(dirPath2);
    }

    public static void hienThi (String dirPath) throws IOException{
        File file = new File(dirPath);
        File[] files = file.listFiles();
        System.out.println("Noi dung thu muc:"+dirPath);
        for (File file1 : files){
            System.out.println(file1.getCanonicalPath());
        }
    }
}
