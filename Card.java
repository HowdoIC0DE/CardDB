public class Card {
    private String name;
    private String rarity;
    private int atk;
    private int def;

    public Card (String name, String rarity, int atk, int def){
        this.name = name;
        this.rarity = rarity;
        this.atk = atk;
        this.def = def;
    }
    public String getname(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity(){
        return rarity;
    }
    public void setRarity(String rarity){
        this.rarity=rarity;
    }
    public int getAtk(){
        return atk;
    }
    public void setAtk(int atk){
        this.atk=atk;
    }
    public int getDef(){
        return def;
    }
    public void setDef(int def){
        this.def=def;
    }
}
