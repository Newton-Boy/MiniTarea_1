public class Fire extends PokectMonster{
  public Fire(String n, String s, int h){
    super(n,s,h,"Fuego");
  }

  public void Battle(Pokémon p){
    p.AttackToFire(this);
  }

  public void AttackToFire(Fire fire){
    fire.TakeDamage(5);
  }

  public void AttackToPlant(Plant plant){
    plant.TakeDamage(10);
  }

  public void AttackToWater(Water water){
    water.TakeDamage(5);
  }
}