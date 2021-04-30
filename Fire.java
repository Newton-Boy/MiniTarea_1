/**
*Clase Fire
*Extiende de Pokémon e implementa
*los metodos PokectMonster con un
*Double Dispach para los tipo fuego
*/
public class Fire extends Pokémon{
  /**
  *Constructor Fire
  *Crea al Pokémon de tipo fuego
  */
  public Fire(String n, String s, int h){
    super(n,s,h,"Fuego");
  }

  /**
  *Battle: PokectMonster-->void
  *Un Pokémon de tipo fuego ataca a 
  *un PokectMonster p
  */
  public void Battle(PokectMonster p){
    p.AttackByFire(this);
  }

  /**
  *AttackByFire: Fire-->void
  *El Pokémon tipo fuego recibe 5
  *puntos de daño cuando es atacado por 
  *otro del tipo fuego
  */
  public void AttackByFire(Fire fire){
    fire.DealDamage(5,this);
  }

  /**
  *AttackByPlant: Fire-->void
  *El Pokémon tipo fuego recibe 5
  *puntos de daño cuando es atacado por 
  *otro del tipo planta
  */
  public void AttackByPlant(Plant plant){
    plant.DealDamage(5,this);
  }

  /**
  *AttackByWater: Water-->void
  *El Pokémon tipo fuego recibe 10
  *puntos de daño cuando es atacado por 
  *otro del tipo agua
  */
  public void AttackByWater(Water water){
    water.DealDamage(10,this);
  }
}