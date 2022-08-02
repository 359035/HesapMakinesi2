/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hesapmakinesi2;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class HesapMakinesi2 {

    /**
     * @param args the command line arguments
     * String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

     */
    
    static void topla(int a,int b){
        int result=a+b;
        System.out.println("Toplama:"+result);
    } 
    
    static void cikar(int a,int b){
        int result=a-b;
        System.out.println("Cikarma:"+result);
    }
    
    static void carp(int a,int b){
        int result=a*b;
        System.out.println("Cikarma:"+result);
    }
    
    static void bol(int a,int b){
        int result=a/b;
        System.out.println("Bolme:"+result);
    }
    
    static void usAl(int a,int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Us Alma:"+result);
    }
    
    static void faktoriyelHesapla(int a){
        int result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        System.out.println("Faktoriyel Alma:"+result);
    }
    
    static void modAl(int a,int b){
        int result=a%b;
        System.out.println("Mod Alma:"+result);
    }
    
    static void dikdörtgenHesapla(int a,int b){
        int cevre=2*(a+b);
        int alan=a*b;
        
        System.out.println("Cevre:"+cevre);
        System.out.println("Alan:"+alan);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        while(true){
            System.out.print("Secimini Giriniz:");
            select=input.nextInt();
            System.out.print("İlk Sayiyi Giriniz");
            int a=input.nextInt();
            System.out.print("İkinci Sayiyi Giriniz:");
            int b=input.nextInt();
            
            switch(select){
                case 1:
                    topla(a,b);
                    break;
                 case 2:
                    cikar(a,b);
                    break;
                case 3:
                    carp(a,b);
                    break;
                case 4:
                    bol(a,b);
                    break;
                case 5:
                    usAl(a,b);
                    break;
                case 6:
                    faktoriyelHesapla(a);
                    break;
                case 7:
                    modAl(a,b);
                    break;
                case 8:
                    dikdörtgenHesapla(a,b);
                    break;    
                case 0:
                    break;
                default:
                    System.out.println("Yanlis Deger Girdiniz!");
                    
                    
            }
            
            
        }
    }
    
}
