import java.util.Scanner;
public class bilet_programı {

    public static void main(String[] args) {
        int yas, yolculuk=0  ;
        double km = 0.10 , mesafe = 0 ,normaltutar=0 , yasindirimi=0 , indirimlitutar=0 , biletindirimi=0 , toplamTutar=0;
        Scanner giris = new Scanner(System.in);
        System.out.println("GİDECEĞİNİZ MESAFEYİ GİRİNİZ : ");
        mesafe = giris.nextInt();
        System.out.println("YAŞINIZI GİRİNİZ : ");
        yas = giris.nextInt();
        System.out.println("YOLCULUK DURUMUNUZU GİRİNİZ (TEK YÖN İÇİN :1 GİDİŞ DÖNÜŞ İÇİN : 2 ) :");
        yolculuk = giris.nextInt();

        if(mesafe > 0 && yas > 0 ){

        normaltutar = (mesafe * km);
        
        if(yolculuk == 1){

            if(yas < 12){

            yasindirimi =(normaltutar *1/2);
            indirimlitutar = normaltutar - yasindirimi ;
            toplamTutar = indirimlitutar;
            }
            else if (yas >= 12 && yas <= 24){
            yasindirimi = ( normaltutar * 1/10);
            indirimlitutar = normaltutar - yasindirimi ;
            toplamTutar = indirimlitutar;
            
            }
            else if ( yas >= 65){
            yasindirimi =(normaltutar * 3/10);
            indirimlitutar = normaltutar - yasindirimi ;
            toplamTutar = indirimlitutar;
            }
            else{
                yasindirimi = normaltutar;
                toplamTutar  = yasindirimi;
            }
            System.out.println(toplamTutar);
        }
        else if ( yolculuk == 2 ){
            if(yas < 12){

            yasindirimi = (normaltutar *1/2 );
            indirimlitutar = normaltutar - yasindirimi ;
            biletindirimi= indirimlitutar * 2/10;
            toplamTutar = (indirimlitutar - biletindirimi) *2;
            }
            else if (yas >= 12 && yas <= 24){

            yasindirimi =( normaltutar * 1/10);
            indirimlitutar = normaltutar - yasindirimi ;
            biletindirimi= indirimlitutar * 2/10;
            toplamTutar = (indirimlitutar - biletindirimi) *2;
            }
            else if ( yas >= 65){
                
            yasindirimi =(normaltutar * 3/10);
            indirimlitutar = normaltutar - yasindirimi ;
            biletindirimi= indirimlitutar * 2/10;
            toplamTutar = (indirimlitutar - biletindirimi) *2;
            }
            else{
                yasindirimi =  normaltutar *2;
                toplamTutar = yasindirimi;
            }
            System.out.println(toplamTutar);
        }
        
        else{
            System.out.println("EKSİK VEYA HATALI GİRİŞ YAPTINIZ : ");
        }
        }
        else{
            System.out.println("EKSİK VEYA HATALI GİRİŞ YAPTINIZ : ");   
        }
    }
}