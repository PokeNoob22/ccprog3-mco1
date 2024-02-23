public class Jobclass{
    private String name;
    private int level;
    private int hp;
    private int dex;
    private int inte;
    private int end;
    private int str;
    private int fth;

    public static final Jobclass[] jobClasses = {
        new Jobclass("Vagabond", 9, 15, 13, 9, 11, 14, 8),
        new Jobclass("Samurai", 9, 15, 13, 9, 11, 14, 8),
        new Jobclass("Warrior", 9, 15, 13, 9, 11, 14, 8),
        new Jobclass("Hero", 9, 15, 13, 9, 11, 14, 8),
        new Jobclass("Astrologer", 9, 15, 13, 9, 11, 14, 8),
        new Jobclass("Prophet", 9, 15, 13, 9, 11, 14, 8)

    };
    
    public Jobclass(String name, int level, int hp, int dex, int inte, int end, int str, int fth) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.dex = dex;
        this.inte = inte;
        this.end = end;
        this.str = str;
        this.fth = fth;
    }

    public String getName() {
        return name;
    }

    public int getlevel() {
        return level;
    }

    public int gethp() {
    return hp;
    }

    public int getdex() {
        return dex;
    }

    public int getinte() {
        return inte;
    }

    public int getend() {
        return end;
    }

    public int getstr() {
        return str;
    }

    public int getfth() {
        return fth;
    }


    // void Vagabond (String name, int level, int hp, int dex, int inte, int end, int str, int fth){
    //     this.name = "Vagabond";
    //     this.level = 9;
    //     this.hp = 15;
    //     this.dex = 13;
    //     this.inte = 9;
    //     this.end = 11;
    //     this.str = 14;
    //     this.fth = 8;
    // }

    // void Samurai (String name, int level, int hp, int dex, int inte, int end, int str, int fth){
    //     this.name = "Samurai";
    //     this.level = 9;
    //     this.hp = 12;
    //     this.dex = 15;
    //     this.inte = 9;
    //     this.end = 13;
    //     this.str = 12;
    //     this.fth = 9;
    // }

    // void Warrior (String name, int level, int hp, int dex, int inte, int end, int str, int fth){
    //     this.name = "Warrior";
    //     this.level = 8;
    //     this.hp = 11;
    //     this.dex = 16;
    //     this.inte = 10;
    //     this.end = 11;
    //     this.str = 10;
    //     this.fth = 8;
    // }

    // void Hero (String name, int level, int hp, int dex, int inte, int end, int str, int fth){
    //     this.name = "Hero";
    //     this.level = 7;
    //     this.hp = 14;
    //     this.dex = 9;
    //     this.inte = 7;
    //     this.end = 12;
    //     this.str = 16;
    //     this.fth = 8;
    // }
    
    // void Astrologer (String name, int level, int hp, int dex, int inte, int end, int str, int fth){
    //     this.name = "Astrologer";
    //     this.level = 6;
    //     this.hp = 9;
    //     this.dex = 12;
    //     this.inte = 16;
    //     this.end = 9;
    //     this.str = 8;
    //     this.fth = 7;
    // }

    // void Prophet (String name, int level, int hp, int dex, int inte, int end, int str, int fth){
    //     this.name = "Prophet";
    //     this.level = 7;
    //     this.hp = 10;
    //     this.dex = 10;
    //     this.inte = 7;
    //     this.end = 8;
    //     this.str = 11;
    //     this.fth = 16;
        
    // }

    public String toString () {

        return name+"\n"+level+"\n"+hp+"\n"+dex+"\n"+inte+"\n"+end+"\n"+str+"\n"+fth;
    

    }
}
