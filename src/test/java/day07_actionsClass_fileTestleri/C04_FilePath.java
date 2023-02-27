package day07_actionsClass_fileTestleri;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePath {

    @Test
    public void test01(){
        String dosyaYolu =  "C:\\Users\\tasta\\OneDrive\\Masaüstü\\TheDelta.docx";

        boolean sonuc = Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);
        /*
        Bilgisayarimizda bir dosyanin var oldugunu test etmek icin dosya yoluna ihtiyacimiz var
       Ancak herkesin bilgisayarindaki dosya yollari farkliliklar gosteririr
         */
        System.out.println(System.getProperty("user.home"));
        dosyaYolu = System.getProperty("user.home") + "\\OneDrive\\Masaüstü\\TheDelta.docx";
    }
}
