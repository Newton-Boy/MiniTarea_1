public abstract class PokectMonster implements Pokémon{
  private String name;
  private String species;
  private int hp;
  private String type;

  public PokectMonster(String n,String s, int h,String t){
    name=n;
    species=s;
    hp=h;
    type=t;
  }

  public String getName(){
    return this.name;
  }

  public PokectMonster setName(String n){
    this.name=n;
    return this;
  }

  public String getSpecies(){
    return this.species;
  }

  public int getHP(){
    return this.hp;
  }

  public PokectMonster setHP(int h){
    this.hp=h;
    return this;
  }

  public String getType(){
    return this.type;
  }

  public void TakeDamage(int d){
    int h= this.getHP();
    if ((h-d)<=0){
      this.setHP(0);
      System.out.println(this.getName()+" ha quedado inconsciente");
    }
    else{
      this.setHP(h-d);
    }
  }
}