class Runner {
  public static void main(String[] args) {
    Team liverpool = new Team("Liverpool F.C");
    Player player = new Player();

    liverpool.pickPlayer(player);

    System.out.println(liverpool.teamStatus(liverpool));

    liverpool.pickPlayer(player);

    System.out.println(liverpool.teamStatus(liverpool));
    
    liverpool.fullTime();

    System.out.println(liverpool.teamStatus(liverpool));
  }
}

// I initially had the output lines in the runner like this:

// System.out.println(liverpool.name() + " currently has " + liverpool.playerCount() + " in the matchday squad.");

// but I've made a 'teamStatus' method that does it for me in the team class. Not sure if this is OK since in ruby its better not to output things from methods within the class?