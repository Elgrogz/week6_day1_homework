class Runner {
  public static void main(String[] args) {
    Team liverpool = new Team("Liverpool F.C");
    Goalkeeper goalkeeper = new Goalkeeper();
    Player player = new Player();

    System.out.println(liverpool.teamStatus(liverpool));

    liverpool.pick(goalkeeper);
    liverpool.pick(player);
    liverpool.pick(player);
    System.out.println(liverpool.teamStatus(liverpool));

    System.out.println(player.pass());
    System.out.println(goalkeeper.save());
    System.out.println(goalkeeper.pass());
    System.out.println(player.score());
    
    liverpool.fullTime();
    System.out.println(liverpool.teamStatus(liverpool));
  }
}
