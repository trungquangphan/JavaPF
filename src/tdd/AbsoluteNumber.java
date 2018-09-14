package tdd;

import java.io.File;
import java.io.IOException;

public class AbsoluteNumber {

    public static void main(String[] args) throws IOException {
        directoryTree("/Users/phanquangtrung/Documents/ebook");
    }
    public static void directoryTree(String path) throws IOException {
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("Folder " + path + " does not exist");
        }
        if (dir.isDirectory()) {
            File[] list = dir.listFiles();
            if (list != null) {
                for (File f : list) {
                    System.out.println(f.getCanonicalPath());
                    if(f.isDirectory()){
                        directoryTree(f.getCanonicalPath());
                    }

                }
            }
        }
    }




    public static int getAbsoluteNumber(int number){
        if(number > 0){
            return number;
        }else{
            return -number;
        }
    }
}
