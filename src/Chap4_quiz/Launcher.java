package Chap4_quiz;
import java.io.File;
import java.lang.reflect.Method;

public class Launcher {
    public static void main(String[] args) {

        String fqcn = args[0];
        String mode = args[1];

        long f = Runtime.getRuntime().freeMemory();
        long t = Runtime.getRuntime().totalMemory();
        long used = t-f;
        System.out.println("現在のメモリ量"+used+"バイト");

        long Mbuse = used/1024/1024;
        System.out.println("現在のメモリ使用量"+Mbuse+"MB");

        try{
            Class<?> clazz = Class.forName(fqcn);
        System.out.println("---メソッド一覧---");
        for(Method m : clazz.getDeclaredMethods()){
            System.out.println(m.getName());
        }
        System.out.println("-----------");

        if("I".equals(mode)){
            Method mainmethod = clazz.getMethod("main",String[].class);
        String[] mainArgs = new String[0];
        mainmethod.invoke(null,(Object) mainArgs);
        }
        else if("E".equals(mode)){
            String javaHome = System.getProperty("java.home");
            String javaBin = javaHome + File.separator+ "bin"+File.separator+"java";
            String classpath = System.getProperty("java.class.path");

            ProcessBuilder pb = new ProcessBuilder(javaBin,"-cp",classpath,fqcn);
            pb.inheritIO();

            Process process = pb.start();
            int exitCode = process.waitFor();

            if(exitCode != 0){
                throw new RuntimeException("外部プロセスが異常終了しました。");
            }
        }
            long f5 = Runtime.getRuntime().freeMemory();
            long t5 = Runtime.getRuntime().totalMemory();
            System.out.println("現在のメモリ使用量" + ((t5 - f5) / 1024 / 1024) + "MB");
            System.exit(0);

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}