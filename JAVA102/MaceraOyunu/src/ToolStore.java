public class ToolStore extends NormalLoc{

    public ToolStore(Player player) {
        super(player, "Mağaza");
    }
    @Override
    public boolean onLocation(){
        System.out.println("---------Mağazaya hoşgeldiniz !-------------");
        boolean showMenu = true;
        while (showMenu){
            System.out.println("1-Silahlar");
            System.out.println("2-Zırhlar");
            System.out.println("3-Çıkış yap");
            System.out.println("Seçiminiz : ");
            int selectCase = Location.input.nextInt();
            while (selectCase < 1 || selectCase > 3){
                System.out.println("Geçersiz değer, tekrar giriniz : ");
                selectCase = input.nextInt();
            }
            switch (selectCase){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmour();
                    buyArmour();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public  void printWeapon(){
        System.out.println("Silahlar");
        for (Weapon w:Weapon.weapons()){
            System.out.println(w.getName() +
                    " <Para : " + w.getPrice() + ", Hasar : " + w.getDamage() + ">");
        }
        System.out.println("0 - Çıkış yap");
    }
    public void buyWeapon(){
        System.out.println("Bir silah seçiniz : ");
        int selectWeapon = input.nextInt();
        while (selectWeapon < 0 || selectWeapon > Weapon.weapons().length){
            System.out.println("Geçersiz değer, tekrar giriniz : ");
            selectWeapon = input.nextInt();
        }
        if(selectWeapon != 0){
            Weapon selectedWeapon = Weapon.getWeaponObj(selectWeapon);
            if(selectedWeapon != null){
                if(selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                }
                else {
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız.");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                    System.out.println("Önceki silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni silahınız : " + this.getPlayer().getInventory().getWeapon().getName());

                }
            }
        }

    }
    public void printArmour(){
        System.out.println("Zırhlar");
        for (Armour a:Armour.armours()){
            System.out.println(a.getId() + " - " + a.getName() + "<Para : " + a.getPrice() + ", Zırh : " + a.getBlock()+ " >");
        }
        System.out.println("0 - Çıkış yap");
    }

    public void buyArmour(){
        int selectArmour = input.nextInt();
        while (selectArmour < 0 || selectArmour > Armour.armours().length){
            System.out.println("Geçersiz değer, tekrar giriniz : ");
            selectArmour = input.nextInt();
        }
        if (selectArmour != 0){
            Armour selectedArmour = Armour.getArmourObj(selectArmour);
            if(selectedArmour != null){
                if (selectedArmour.getPrice()>this.getPlayer().getMoney()){
                    System.out.println("Yeterli para bulunmamaktadır.");
                }
                else {
                    System.out.println(selectedArmour.getName() + " zırhını satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedArmour.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Bakiye : " + this.getPlayer().getMoney());
                    System.out.println("Önceki zırhınız : " + this.getPlayer().getInventory().getArmour().getName());
                    this.getPlayer().getInventory().setArmour(selectedArmour);
                    System.out.println("Yeni zırhınız : " + this.getPlayer().getInventory().getArmour().getName());

                }
            }
        }
    }
}
