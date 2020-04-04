package lambda;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {
    public static void main(String[] args){
        // Anonymous Class//
//        FileFilter filter=new FileFilter() {
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java");
//            }
//        };
        //Lambda expression with parameter
        FileFilter filterLambda=(File pathname) -> pathname.getName().endsWith(".java");

        File dir= new File ("c:/mobiles");
        File[] files= dir.listFiles(filterLambda);
        if(files!=null)
        for(File f :files){
            System.out.println(f);
        }

    }
}
