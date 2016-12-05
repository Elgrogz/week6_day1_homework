class Runner {
  public static void main(String[] args) {
    Team liverpool = new Team("Liverpool F.C");
    Player player = new Player();

    System.out.println(liverpool.getName() + " currently has " + liverpool.playerCount() + " in the matchday squad.");
  }
}