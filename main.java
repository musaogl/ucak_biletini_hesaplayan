import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int yolcuTipi,yas,mesafeyi,toplamTutar;
        double normalTutar,yasİndirimi=0,indirimliTutar,ciftTerafBilet=0;
        Scanner input =new Scanner(System.in);
        System.out.print("Mesafeyi Km türünden giriniz :");
        mesafeyi=input.nextInt();
        System.out.print("Yaşını girinizi :");
        yas=input.nextInt();
        System.out.print("Yolcu Tipi giriniz :");
        yolcuTipi=input.nextInt();
        normalTutar=mesafeyi * 0.10;
        if(yas<12){
            yasİndirimi=normalTutar*0.50;
        } else if (yas>12&&yas<24) {
            yasİndirimi = normalTutar * 0.10;
        } else if (yas>65) {
            yasİndirimi = normalTutar * 0.30;
        }
        indirimliTutar=(normalTutar - yasİndirimi);

        if (yolcuTipi==2){
            ciftTerafBilet=indirimliTutar*0.20;
        }
        toplamTutar=(int)(indirimliTutar-ciftTerafBilet)*2;
        System.out.print("Toplam Tutar :"+toplamTutar);
    }
    }

