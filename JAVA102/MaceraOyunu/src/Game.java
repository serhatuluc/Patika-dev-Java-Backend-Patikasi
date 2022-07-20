import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Macera Oyununa Hoşgeldiniz ! ");
        System.out.print("Lütfen bir isim giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " bu karanlık ve sisli adaya hoşgeldin! Burada yaşananların hepsi gerçek !");
        System.out.println("Lütfen bir karakter seçiniz !");
        player.selectChar();
        while(true){ Location location = null;
            player.printInfo();
            System.out.println();
            System.out.println("#########Bölgeler############");
            System.out.println();
            System.out.println("1-Güvenli ev --> Burası sizin için güvenli bir ev, düşman yoktur");
            System.out.println("2-Mağaza --> Silah veya zırh satın alabilirsiniz !");
            System.out.println("3-Mağara --> Mağaraya gir. Dikkatli ol canavar çıkabilir ! Ödül : Yemek");
            System.out.println("4-Orman --> Ormana git. Dikkatli ol canavar çıkabilir ! Ödül : Odun");
            System.out.println("5-Nehir --> Ormana git. Dikkatli ol canavar çıkabilir ! Ödül : Su");
            System.out.println("6-Maden --> Ormana git. Dikkatli ol canavar çıkabilir ! Ödül : Sürpriz hediye");
            System.out.println("0-Oyundan çık");
            int selectLoc = input.nextInt();
            ArrayList<String> needs = player.getInventory().getNeeds();
            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Quarry(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (location == null){
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtiniz !");
                break;
            }
            if(!location.onLocation()){
                System.out.println("GAME OVER !");}

            ArrayList<String> ListOfNeeeds = player.getInventory().getNeeds();
            if (ListOfNeeeds.contains("food") && ListOfNeeeds.contains("water") && ListOfNeeeds.contains("firewood")){
                System.out.println("Bu karanlık dünyaya hükmettiniz ! Tebrikler !");
                return;
            }
        }
    }
}
