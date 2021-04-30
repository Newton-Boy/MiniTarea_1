/**
*Clase abstracta Pokémon
*Implementa la interfaz PokectMonster y
*contendrá la mayor cantidad de métodos
*que todo Pokémon debiera poder usar.
*
*Además de ello, setea las variables privadas
*nombre, especie,vida, y tipo.
*/
public abstract class Pokémon implements PokectMonster{
  private String name;
  private String species;
  private int hp;
  private String type;

  /**
  *Constructor Pokémon
  *Genera al Pokémon en si mismo 
  */
  public Pokémon(String n,String s, int h,String t){
    name=n;
    species=s;
    hp=h;
    type=t;
  }

  /**
  *getName: void-->String
  *Retorna el nombre del Pokémon
  */
  public String getName(){
    return this.name;
  }

  /**
  *setName: String-->void
  *Modifica el nombre del Pokémon
  *previamente asignado
  */
  public void setName(String n){
    this.name=n;
  }

  /**
  *getSpecies: void-->String
  *Retorna la especie a la que pertence
  *el Pokémon
  */
  public String getSpecies(){
    return this.species;
  }

  /**
  *getHP: void-->int
  *Retorna la vida actual del Pokémon
  */
  public int getHP(){
    return this.hp;
  }

  /**
  *setHP: int-->void
  *Modifica la vida actual del Pokémon
  */
  public void setHP(int h){
    this.hp=h;
  }

  /**
  *getType: void--> String
  *Retorna el tipo al que pertenece
  *el Pokémon
  */
  public String getType(){
    return this.type;
  }

  /**
  *DealDamage: int Pokémon--> void
  *Realiza un ataque al Pokémon p,
  *inflingiendo un entero damage
  *como daño a la salud de este
  */
  public void DealDamage(int damage,Pokémon p){
    int hp=p.getHP();
    System.out.println(this.getName()+" ataca a "+p.getName()+" y le ha inflingido "+damage+" de daño");
    if (hp<damage){
      p.setHP(0);
    }
    else{
      p.setHP(hp-damage);
    }
  }

  /**
  *isKO: void-->boolean
  *Confirma si la salud del Pokémon
  *es suficiente para seguir peleando
  *o si ha quedado inconsciente
  */
  public boolean isKO(){
    if (this.getHP()<=0){
      return true;
    }
    else{
      return false;
    }
  }
}