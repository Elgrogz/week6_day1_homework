class Runner {
  public static void main(String[] args) {
    Team liverpool = new Team("Liverpool F.C");
    Player player = new Player();

    liverpool.pickPlayer(player);

    liverpool.teamStatus(liverpool);

    liverpool.pickRestOfTeam(player);

    liverpool.teamStatus(liverpool);
    
    liverpool.fullTime();

    liverpool.teamStatus(liverpool);
  }
}