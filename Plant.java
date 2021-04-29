public class Plant extends PokectMonster{
  public Plant(String n, String s, int h){
    super(n,s,h,"Planta");
  }

  public void Battle(Pokémon p){
    p.AttackToPlant(this);
  }

  public void AttackToFire(Fire fire){
    fire.TakeDamage(5);
  }

  public void AttackToPlant(Plant plant){
    plant.TakeDamage(5);
  }

  public void AttackToWater(Water water){
    water.TakeDamage(10);
  }
}