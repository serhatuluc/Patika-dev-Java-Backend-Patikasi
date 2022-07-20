import java.util.Random;

public class BattleLoc extends Location{
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public BattleLoc(Player player, String name,Obstacle obstacle,String award,int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }
    public int randomObstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.maxObstacle) + 1;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    @Override
    boolean onLocation() {
        if(getPlayer().getInventory().getNeeds().contains(this.award)){
            System.out.println("Buradaki tüm düşmanları yendiniz!");
            return true;
        }
        int obsNumber = this.randomObstacleNumber();

        System.out.println("Şu an buradasınız : " + this.getName());
        System.out.println("Dikkatli ol! Burada " + obsNumber + " tane " + this.getObstacle().getName() + " yaşıyor !");
        System.out.println("<S>avaş veya <K>aç");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();

        if (selectCase.equals("S")){
            if (combat(obsNumber)){
                getPlayer().getInventory().setNeeds(this.award);
                if(this.award.equals("gift")){
                    System.out.println("Hediye kutusu açacaksınız !");
                    System.out.println();
                    sendGift();
                }
                System.out.println(this.getName() + " tüm düşmanları yendiniz !");
                return true;
            }
        }
        if (this.getPlayer().getHealth() <= 0){
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber){
        for (int i = 1; i <= obsNumber; i++){
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstacleStats(i);
            int temp = (Math.random() <= 0.5) ? 1 : 2;
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth()>0){
               if(temp == 1){
                   //Human hits here if it is asked and human still has health point
                   System.out.println("<V>ur veya <K>aç");
                   String selectCombat = input.nextLine().toUpperCase();
                   if(selectCombat.equals("V") && getPlayer().getHealth()>0){
                       humanHit();
                   }
                   else {return false;}

                   //Obstacle hit here if it still has health point
                   if(this.getObstacle().getHealth()>0){
                       ObstacleHit();
                   }

               }
               if (temp == 2){
                    //Obstacle hit here if it still has health point
                   if(this.getObstacle().getHealth()>0){
                       ObstacleHit();
                   }

                   //Human hits here if it is asked and human still has health point
                   System.out.println("<V>ur veya <K>aç");
                   String selectCombat = input.nextLine().toUpperCase();
                   if(selectCombat.equals("V") && getPlayer().getHealth()>0){
                       humanHit();
                   }
                   else {return false;}

               }

            }
            if(this.getObstacle().getHealth()<this.getPlayer().getHealth()){
                System.out.println("Düşmanı yendiniz ! ");
                System.out.println(this.getObstacle().getAward() + " para kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel paranız " + this.getPlayer().getMoney());
            }
        }
        return true;
    }
    public void sendGift(){
        int selectTool = (int)(Math.random()*100);
        int selectToolKind = (int)(Math.random()*100);
        if(selectTool < 16){
            if (selectToolKind<51){
                this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObj(1));
                System.out.println(Weapon.getWeaponObj(1).getName() + " kazandınız!");
            }
            if (selectToolKind>50 && selectToolKind<71){
                this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObj(3));
                System.out.println(Weapon.getWeaponObj(3).getName() + " kazandınız!");
            }
            else {
                this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObj(2));
                System.out.println(Weapon.getWeaponObj(2).getName() + " kazandınız!");
            }
        }
        if (selectTool > 15 && selectTool<31){
            if (selectToolKind<51){
                this.getPlayer().getInventory().setArmour(Armour.getArmourObj(1));
                System.out.println(Armour.getArmourObj(1).getName() + " kazandınız!");
            }
            if (selectToolKind>50 && selectToolKind<71){
                this.getPlayer().getInventory().setArmour(Armour.getArmourObj(3));
                System.out.println(Armour.getArmourObj(3).getName() + " kazandınız!");

            }
            else {
                this.getPlayer().getInventory().setArmour(Armour.getArmourObj(2));
                System.out.println(Armour.getArmourObj(2).getName() + " kazandınız!");

            }
        }
        if (selectTool>30 && selectTool<56){
            if (selectToolKind<51){
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
                System.out.println("1 para kazandınız!");
            }
            if (selectToolKind>50 && selectToolKind<71){
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
                System.out.println("10 para kazandınız!");

            }
            else {
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
                System.out.println("5 para kazandınız!");

            }
        }
        else {
            System.out.println("Hediye kutusu boş");
        }
    }

    public void humanHit(){
        System.out.println("Siz vurdunuz !");
        this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getTotalDamage());
        afterHit();
    }
    public void ObstacleHit(){
        System.out.println("Canavar Size Vurdu !");
        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmour().getBlock();
        if (obstacleDamage < 0){
            obstacleDamage = 0;
        }
        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
        afterHit();
    }
    public void afterHit(){
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Canı : " + this.getObstacle().getHealth());
        System.out.println("----------------------");
    }
    public void playerStats(){
        System.out.println("Oyuncu Değerleri");
        System.out.println("----------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Silah : " + this.getPlayer().getInventory().getArmour().getName());
        System.out.println("Kaçınma : " + this.getPlayer().getInventory().getArmour().getBlock());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void obstacleStats(int i){
        System.out.println(i + "." + this.getObstacle().getName() + " Değerleri");
        System.out.println("------------------------------");
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Ödül : " + this.getObstacle().getAward());
        System.out.println();

    }
}
