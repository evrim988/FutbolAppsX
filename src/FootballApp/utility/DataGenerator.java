package FootballApp.utility;

import FootballApp.databases.ManagerDB;
import FootballApp.databases.PlayerDB;
import FootballApp.databases.TeamDB;
import FootballApp.entities.Manager;
import FootballApp.entities.Player;
import FootballApp.entities.Team;
import FootballApp.entities.attributes.TechnicalAttributes;
import FootballApp.enums.EPosition;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class DataGenerator {
    public static TeamDB teamDB = new TeamDB();
    public static ManagerDB managerDB = new ManagerDB();
    public static PlayerDB playerDB = new PlayerDB();
    static DecimalFormat df = new DecimalFormat("#,00");
    
    public void initialize() {
        
        addTeams(teamDB);
        addManager(managerDB);
        playerGenerator();
        setCurrentPlayerList();
        saveTeamsToFile();
        saveManagersToFile();
        savePlayersToFile();
    }
    
//    public static void addTeams(TeamDB teamDB) {
//        List<String> teamNames = List.of(
//                "Fenerbahce", "Galatasaray", "Besiktas", "Trabzonspor", "Basaksehir FK",
//                "Caykur Rizespor", "Samsunspor", "Kayserispor", "Eyupspor", "Antalyaspor",
//                "Adanaspor", "Alanyaspor", "Sivasspor", "Kasimpasa", "Konyaspor",
//                "Gaziantep FK", "Hatayspor", "Goztepe", "Bodrum FK", "MKE Ankaragucu"
//        );
//
//        List<String> cities = List.of(
//                "Istanbul", "Istanbul", "Istanbul", "Trabzon", "Basaksehir/Istanbul",
//                "Gündogdu/Rize", "Canik/Samsun", "Kayseri", "Istanbul", "Antalya",
//                "Adana", "Antalya", "Sivas", "Istanbul", "Konya",
//                "Gaziantep", "Hatay", "Izmir", "Mugla", "Ankara"
//        );
//
//        List<String> stadiumNames = List.of(
//                "Sukru Saracoglu Stadyumu", "RAMS Park", "Tupras Stadyumu", "Papara Park", "Basaksehir Fatih Terim Stadyumu",
//                "Caykur Didi Stadyumu", "19 Mayıs Stadyumu", "Kayseri Kadir Has Sehir Stadyumu", "Arda Turan Stadyumu", "Antalya Sehir Stadi",
//                "Adana Fatih Terim Stadyumu", "Alanya Rus Turist Stadyumu", "Yeni 4 Eylul Stadi", "Recep Tayyip Erdogan Stadyumu", "Medas Konya Buyuksehir Stadyumu",
//                "Kalyon Stadyumu", "Mersin Stadyumu", "Gursel Aksel Stadyumu", "Bodrum Ilce Stadi", "Eryaman Stadyumu"
//        );
//
//        List<Double> transferBudgets = List.of(
//                15_000_000.0, 10_000_000.0, 10_000_000.0, 8_000_000.0, 10_000_000.0,
//                5_000_000.0, 3_000_000.0, 1_000_000.0, 20_000_000.0, 30_000_000.0,
//                35_000_000.0, 22_000_000.0, 3_000_000.0, 3_000_000.0, 2_500_000.0,
//                2_000_000.0, 2_000_000.0, 2_500_000.0, 1_500_000.0, 1_700_000.0
//        );
//
//        List<Double> wageBudgets = List.of(
//                20_000_000.0, 25_000_000.0, 25_000_000.0, 22_000_000.0, 15_000_000.0,
//                10_000_000.0, 5_000_000.0, 2_000_000.0, 30_000_000.0, 40_000_000.0,
//                50_000_000.0, 35_000_000.0, 500_000.0, 500_000.0, 450_000.0,
//                400_000.0, 200_000.0, 250_000.0, 120_000.0, 100_000.0
//        );
//
//        for (int i = 0; i < teamNames.size(); i++) {
//            Team team = new Team(
//                    teamNames.get(i),
//                    new ArrayList<>(),
//                    cities.get(i),
//                    stadiumNames.get(i),
//                    transferBudgets.get(i),
//                    wageBudgets.get(i)
//            );
//            teamDB.save(team);
//        }
//    }
public static void addTeams(TeamDB teamDB) {
    List<Team> teams = new ArrayList<>();
    
    teams.add(new Team("Fenerbahce", new ArrayList<>(), "Istanbul", "Sukru Saracoglu Stadyumu", 15_000_000.0, 20_000_000.0));
    teams.add(new Team("Galatasaray", new ArrayList<>(), "Istanbul", "RAMS Park", 10_000_000.0, 25_000_000.0));
    teams.add(new Team("Besiktas", new ArrayList<>(), "Istanbul", "Tupras Stadyumu", 10_000_000.0, 25_000_000.0));
    teams.add(new Team("Trabzonspor", new ArrayList<>(), "Trabzon", "Papara Park", 8_000_000.0, 22_000_000.0));
    teams.add(new Team("Basaksehir FK", new ArrayList<>(), "Basaksehir/Istanbul", "Basaksehir Fatih Terim Stadyumu", 10_000_000.0, 15_000_000.0));
    teams.add(new Team("Caykur Rizespor", new ArrayList<>(), "Gündogdu/Rize", "Caykur Didi Stadyumu", 5_000_000.0, 10_000_000.0));
    teams.add(new Team("Samsunspor", new ArrayList<>(), "Canik/Samsun", "19 Mayıs Stadyumu", 3_000_000.0, 5_000_000.0));
    teams.add(new Team("Kayserispor", new ArrayList<>(), "Kayseri", "Kayseri Kadir Has Sehir Stadyumu", 1_000_000.0, 2_000_000.0));
    teams.add(new Team("Eyupspor", new ArrayList<>(), "Istanbul", "Arda Turan Stadyumu", 20_000_000.0, 30_000_000.0));
    teams.add(new Team("Antalyaspor", new ArrayList<>(), "Antalya", "Antalya Sehir Stadi", 30_000_000.0, 40_000_000.0));
    teams.add(new Team("Adanaspor", new ArrayList<>(), "Adana", "Adana Fatih Terim Stadyumu", 35_000_000.0, 50_000_000.0));
    teams.add(new Team("Alanyaspor", new ArrayList<>(), "Antalya", "Alanya Rus Turist Stadyumu", 22_000_000.0, 35_000_000.0));
    teams.add(new Team("Sivasspor", new ArrayList<>(), "Sivas", "Yeni 4 Eylul Stadi", 3_000_000.0, 500_000.0));
    teams.add(new Team("Kasimpasa", new ArrayList<>(), "Istanbul", "Recep Tayyip Erdogan Stadyumu", 3_000_000.0, 500_000.0));
    teams.add(new Team("Konyaspor", new ArrayList<>(), "Konya", "Medas Konya Buyuksehir Stadyumu", 2_500_000.0, 450_000.0));
    teams.add(new Team("Gaziantep FK", new ArrayList<>(), "Gaziantep", "Kalyon Stadyumu", 2_000_000.0, 400_000.0));
    teams.add(new Team("Hatayspor", new ArrayList<>(), "Hatay", "Mersin Stadyumu", 2_000_000.0, 200_000.0));
    teams.add(new Team("Goztepe", new ArrayList<>(), "Izmir", "Gursel Aksel Stadyumu", 2_500_000.0, 250_000.0));
    teams.add(new Team("Bodrum FK", new ArrayList<>(), "Mugla", "Bodrum Ilce Stadi", 1_500_000.0, 120_000.0));
    teams.add(new Team("MKE Ankaragucu", new ArrayList<>(), "Ankara", "Eryaman Stadyumu", 1_700_000.0, 100_000.0));
    
    teamDB.saveAll(teams);
    
}
    
    
    
    public static void addManager(ManagerDB managerDB) {
        List<Manager> managers = List.of(
                new Manager(1,"Jose", "Mourinho", 61, "Portekiz", "mourinho", "1234"),
                new Manager(2,"Okan", "Buruk", 50, "Istanbul", "okan", "1234"),
                new Manager(3,"Giovanni van", "Bronckhorst", 49, "Hollanda", "giovanni", "1234"),
                new Manager(4,"Abdullah", "Avci", 61, "Istanbul", "abdullah", "1234"),
                new Manager(5,"Cagdas", "Atan", 44, "Istanbul", "cagdas", "6783"),
                new Manager(6,"İlhan", "Palut", 47, "Hatay", "ilhan", "5214"),
                new Manager(7,"Thomas", "Reis", 50, "Almanya", "thomas", "4325"),
                new Manager(8,"Burak", "Yılmaz", 39, "Antalya", "burak", "3675"),
                new Manager(9,"Arda", "Turan", 37, "Turkiye", "Arda", "9999"),
                new Manager(10,"Alex", "DeSouza", 46, "Brazil", "Alex", "9876"),
                new Manager(11,"Michael", "Valkanis", 40, "Avustralia", "Michi", "5432"),
                new Manager(12,"Fatih", "Tekke", 46, "Turkiye", "Fatih", "2468"),
                new Manager(13,"Bülent", "Uygun", 53, "Turkiye", "bulent", "1234"),
                new Manager(14,"Sami", "Ugurlu", 46, "Turkiye", "sami", "1234"),
                new Manager(15,"Ali", "Camdali", 40, "Turkiye", "ali", "1234"),
                new Manager(16,"Selcuk", "Inan", 39, "Turkiye", "selcuk", "1234"),
                new Manager(17,"Ozhan", "Pulat", 39, "Turkiye", "ozhan", "1234"),
                new Manager(18,"Stanimir", "Stoilov", 57, "Bulgaristan", "stanimir", "1234"),
                new Manager(19,"Ismet", "Tasdemir", 50, "Turkiye", "ismet", "1234"),
                new Manager(20,"Cihat", "Arslan", 54, "Turkiye", "cihat", "1234")
        );
        
        managerDB.saveAll(managers);
    }
    
    
    public static void playerGenerator() {
        Random rand = new Random();

        List<String> names =
                List.of("Ali", "Ahmet", "Baris", "Ceren", "Deniz", "Kemal", "Mert", "Burak", "Okan", "Emre", "Can", "Arda", "Ege", "Serkan", "Ömer", "Gökhan", "Bora", "Mustafa", "Melis", "Selin");
        List<String> surNames =
                List.of("Yılmaz", "Demir", "Kaya", "Çelik", "Kılıç", "Yurt", "Arslan", "Karaca", "Aydın", "Koç", "Yalçın", "Şahin", "Acar", "Yavuz", "Çetin", "Çelik", "Öztürk", "Akman", "Çam", "Taş");
        EPosition[] positions = EPosition.values();
        
            for (int teamId = 1; teamId <= 20; teamId++) {
                
                String name = names.get(teamId - 1);
                
                for (int i = 0; i < 15; i++) {
                    Integer age = rand.nextInt(15, 35);
                    double value = (100_000 + (rand.nextDouble() * 4_900_00));
                    double wage = (5_000 + (rand.nextDouble() * 3_000));
                    int positionIndex = rand.nextInt(positions.length);
                    String surName = surNames.get(rand.nextInt(surNames.size()));
                    EPosition position = positions[positionIndex];
                    
                    // TechnicalAttributes için rastgele değerler oluşturuyoruz.
                    Integer finishing = rand.nextInt(50, 100);
                    Integer pass = rand.nextInt(50, 100);
                    Integer dribbling = rand.nextInt(50, 100);
                    Integer tackle = rand.nextInt(50, 100);
                    Integer shotPower = rand.nextInt(50, 100);
                    
                    TechnicalAttributes technicalAttributes =
                            new TechnicalAttributes(finishing, pass, dribbling, tackle, shotPower);
                    
                    Player player =
                            new Player(name, surName, age, "Turkiye", technicalAttributes, teamId, value, wage, position);
                    playerDB.save(player);
                    
                }
               
            }
            
        }
	    public static void setCurrentPlayerList() {
        Integer teamID;
        for (Team team : teamDB.listAll()) {
            teamID = team.getId();
            Integer finalTeamID = teamID;
            List<Integer> list = DataGenerator.playerDB.listAll().stream().filter(player -> player.getCurrentTeamID()
                                  .equals(finalTeamID)).map(Player::getId) .toList();
            
            Optional<Team> byID = teamDB.findByID(finalTeamID);
            if (byID.isPresent()) {
                team = byID.get();
                team.setTeamPlayerIDList(list);
            }
        }
    }
    public static void saveTeamsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("teams.txt"))) {
            for (Team team : teamDB.listAll()) {
                writer.write(team + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error while writing teams.txt: " + e.getMessage());
        }
    }
    
    public static void saveManagersToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("managers.txt"))) {
            for (Manager manager : managerDB.listAll()) {
                writer.write(manager + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error while writing teams.txt: " + e.getMessage());
        }
    }
    
    public static void savePlayersToFile() {
        long startingTime = System.currentTimeMillis();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("players.txt"))) {
            for (Player player : playerDB.listAll()) {
                writer.write(player + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error while writing players.txt: " + e.getMessage());
        }
        long endTime = System.currentTimeMillis();
//        System.out.println("Players saved to file: " + (endTime - startingTime) + " ms");
    }
    
}