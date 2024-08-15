package FootballApp.utility;

import FootballApp.databases.ManagerDB;
import FootballApp.databases.PlayerDB;
import FootballApp.databases.TeamDB;
import FootballApp.entities.Manager;
import FootballApp.entities.Player;
import FootballApp.entities.Team;
import FootballApp.entities.attributes.TechnicalAttributes;
import FootballApp.enums.EPosition;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class DataGenerator {
    public static TeamDB teamDB = new TeamDB();
    public static ManagerDB managerDB = new ManagerDB();
    public static PlayerDB playerDB = new PlayerDB();

    public  void initialize(){

        addTeams(teamDB);
        addManager(managerDB);
        playerGenerator();
    }

    public static void addTeams(TeamDB teamDB){


        Team team1 = new Team("Fenerbahce",new ArrayList<>(),"Istanbul","Sukru Saracoglu Stadyumu",15_000_000.0,20_000_000.0);
        Team team2 = new Team("Galatasaray",new ArrayList<>(),"Istanbul","RAMS Park",10_000_000.0,25_000_000.0);
        Team team3 = new Team("Besiktas",new ArrayList<>(),"Istanbul","Tupras Stadyumu",10_000_000.0,25_000_000.0);
        Team team4 = new Team("Trabzonspor",new ArrayList<>(),"Trabzon","Papara Park",8_000_000.0,22_000_000.0);
        Team team5 = new Team("Basaksehir FK",new ArrayList<>(),"Basaksehir/Istanbul"," Basaksehir Fatih Terim Stadyumu",10_000_000.0,15_000_000.0);
        Team team6 = new Team("Caykur Rizespor",new ArrayList<>(),"Gündogdu/Rize","Caykur Didi Stadyumu",5_000_000.0,10_000_000.0);
        Team team7 = new Team("Samsunspor",new ArrayList<>(),"Canik/Samsun","19 Mayıs Stadyumu",3_000_000.0,5_000_000.0);
        Team team8 = new Team("Kayserispor",new ArrayList<>(),"Kayseri","Kayseri Kadir Has Sehir Stadyumu",1_000_000.0,2_000_000.0);
        Team team9= new Team("Eyupspor",new ArrayList<>(),"Istanbul","Arda Turan Stadyumu",20_0000_000d,30_000_000d);
        Team team10= new Team("Antalyaspor",new ArrayList<>(),"Antalya","Antalya Sehir Stadi",30_0000_000d,40_000_000d);
        Team team11= new Team("Adanaspor",new ArrayList<>(),"Adana","Adana Fatih Terim Stadyumu",35_0000_000d,50_000_000d);
        Team team12= new Team("Alanyaspor",new ArrayList<>(),"Antalya","Alanya Rus Turist Stadyumu",22_0000_000d, 35_000_000d);
        Team team13 = new Team("Sivasspor",  new ArrayList<>(),"Sivas", "Yeni 4 Eylul Stadi", 3_000_000d, 500_000d);
        Team team14 = new Team("Kasimpasa",  new ArrayList<>(),"Istanbul", "Recep Tayyip Erdogan Stadyumu", 3_000_000d, 500_000d);
        Team team15 = new Team("Konyaspor",  new ArrayList<>(),"Konya", "Medas Konya Buyuksehir Stadyumu", 2_500_000d, 450_000d);
        Team team16 = new Team("Gaziantep FK ",  new ArrayList<>(),"Gaziantep", "Kalyon Stadyumu ", 2_000_000d, 400_000d);
        Team team17= new Team("Hatayspor",new ArrayList<>(),"Hatay","Mersin Stadyumu",2_000_000d,200_000d);
        Team team18= new Team("Goztepe",new ArrayList<>(),"Izmir","Gursel Aksel Stadyumu",2_500_000d,250_000d);
        Team team19= new Team("Bodrum FK",new ArrayList<>(),"Mugla","Bodrum Ilce Stadi",1_500_000d,120_000d);
        Team team20= new Team("MKE Ankaragucu",new ArrayList<>(),"Ankara","Eryaman Stadyumu",1_700_000d,100_000d);



        teamDB.save(team1);
        teamDB.save(team2);
        teamDB.save(team3);
        teamDB.save(team4);
        teamDB.save(team5);
        teamDB.save(team6);
        teamDB.save(team7);
        teamDB.save(team8);
        teamDB.save(team9);
        teamDB.save(team10);
        teamDB.save(team11);
        teamDB.save(team12);
        teamDB.save(team13);
        teamDB.save(team14);
        teamDB.save(team15);
        teamDB.save(team16);
        teamDB.save(team17);
        teamDB.save(team18);
        teamDB.save(team19);
        teamDB.save(team20);
    }

    public static void addManager(ManagerDB managerDB){
        Manager manager1 = new Manager("Jose"," Mourinho", 61, "Portekiz", "mourinho", "1234");
        Manager manager2 = new Manager("Okan"," Buruk",50,"Istanbul","okan","1234");
        Manager manager3 = new Manager("Giovanni van" ," Bronckhorst",49,"Hollanda","giovanni","1234");
        Manager manager4 = new Manager("Abdullah"," Avci",61,"Istanbul","abdullah","1234");
        Manager manager5 = new Manager("Cagdas"," Atan",44,"Istanbul","cagdas","6783");
        Manager manager6 = new Manager("İlhan"," Palut",47,"Hatay","ilhan","5214");
        Manager manager7 = new Manager("Thomas"," Reis",50,"Almanya","thomas","4325");
        Manager manager8 = new Manager("Burak"," Yılmaz",39,"Antalya","burak","3675");
        Manager manager9 = new Manager("Arda"," Turan", 37, "Turkiye", "Arda", "9999");
        Manager manager10 = new Manager("Alex"," DeSouza",46,"Brazil","Alex","9876");
        Manager manager11 = new Manager("Michael"," Valkanis",40,"Avustralia","Michi","5432");
        Manager manager12 = new Manager("Fatih"," Tekke",46,"Turkiye","Fatih","2468");
        Manager manager13 = new Manager("Bülent"," Uygun",53,"Turkiye","bulent","1234");
        Manager manager14 = new Manager("Sami"," Ugurlu",46,"Turkiye","sami","1234");
        Manager manager15 = new Manager("Ali"," Camdali",40,"Turkiye","ali","1234");
        Manager manager16 = new Manager("Selcuk"," Inan",39,"Turkiye","selcuk","1234");
        Manager manager17 = new Manager("Ozhan"," Pulat",39,"Turkiye","ozhan","1234");
        Manager manager18 = new Manager("Stanimir"," Stoilov",57,"Bulgaristan","stanimir","1234");
        Manager manager19 = new Manager("Ismet"," Tasdemir",50,"Turkiye","ismet","1234");
        Manager manager20 = new Manager("Cihat"," Arslan",54,"Turkiye","cihat","1234");

        managerDB.save(manager1);
        managerDB.save(manager2);
        managerDB.save(manager3);
        managerDB.save(manager4);
        managerDB.save(manager5);
        managerDB.save(manager6);
        managerDB.save(manager7);
        managerDB.save(manager8);
        managerDB.save(manager9);
        managerDB.save(manager10);
        managerDB.save(manager11);
        managerDB.save(manager12);
        managerDB.save(manager13);
        managerDB.save(manager14);
        managerDB.save(manager15);
        managerDB.save(manager16);
        managerDB.save(manager17);
        managerDB.save(manager18);
        managerDB.save(manager19);
        managerDB.save(manager20);
    }

    public static void playerGenerator(){
        Random rand= new Random();
        List<String> names=List.of("Ali","Ahmet","Baris","Ceren","Deniz","Kemal","Mert","Burak","Okan","Emre","Can","Arda","Ege","Serkan","Ömer","Gökhan","Bora","Mustafa","Melis","Selin");
        List<String> surNames = List.of("Yılmaz","Demir","Kaya","Çelik","Kılıç","Yurt","Arslan","Karaca","Aydın","Koç","Yalçın","Şahin","Acar","Yavuz","Çetin","Çelik","Öztürk","Akman","Çam","Taş");
        EPosition[] positions = EPosition.values();


        for (int teamId = 1; teamId <= 20; teamId++){

            String name = names.get(teamId - 1);

            for (int i = 0; i < 15; i++) {
                Integer age = rand.nextInt(15,35);
                Double value = rand.nextDouble(100_000, 5_000_000);
                Double wage = rand.nextDouble(5_000, 8_000);
                int positionIndex =  rand.nextInt(positions.length);

                String surName =surNames.get(rand.nextInt(surNames.size()));
                EPosition position=positions[positionIndex];

                // TechnicalAttributes için rastgele değerler oluşturuyoruz.
                Integer finishing = rand.nextInt(50, 100);
                Integer pass = rand.nextInt(50, 100);
                Integer dribbling = rand.nextInt(50, 100);
                Integer tackle = rand.nextInt(50, 100);
                Integer shotPower = rand.nextInt(50, 100);

                TechnicalAttributes technicalAttributes = new TechnicalAttributes(finishing, pass, dribbling, tackle, shotPower);


                playerDB.save(new Player(name,surName,age,"Turkiye",technicalAttributes,teamId,wage,value,position));
            }
        }





    }

}
