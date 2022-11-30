package generics;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer fred = new SoccerPlayer("Fred");

        Team<FootballPlayer> adelaide = new Team<>("Adelaide");
        adelaide.addPlayer(joe);
//        adelaide.addPlayer(pat);
//        adelaide.addPlayer(fred);

        System.out.println(adelaide.getName() + " number " + adelaide.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Baseball Team");
        baseballTeam.addPlayer(pat);

//        Team<String> soccerTeam = new Team<>("Soccer Team");
//        soccerTeam.addPlayer("will not function");

        Team<SoccerPlayer> soccerTeam = new Team<>("Soccer Team");
        soccerTeam.addPlayer(fred);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaide, 3, 8);

        adelaide.matchResult(fremantle, 2, 1);
//        adelaide.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaide.getName()+ " : " + adelaide.ranking());
        System.out.println(melbourne.getName()+ " : " + melbourne.ranking());
        System.out.println(fremantle.getName()+ " : " + fremantle.ranking());
        System.out.println(hawthorn.getName()+ " : " + hawthorn.ranking());

        System.out.println(adelaide.compareTo(melbourne));
        System.out.println(adelaide.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaide));
        System.out.println(melbourne.compareTo(fremantle));

    }
}
