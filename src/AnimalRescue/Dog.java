package AnimalRescue;

public class Dog {
    private String name;
    private int age;
    private short healthBar;
    private short hungerBar;
    private short mood;
    private String favoriteFood;
    private String favoriteActivity;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setHealthBar(short health) {
        this.healthBar = health;
    }

    public short getHealthBar(){
        return healthBar;
    }

    public void setHungerBar(short hungerBar) {
        this.hungerBar = hungerBar;
    }

    public short getHungerBar(){
        return hungerBar;
    }


    public void setMood(short mood) {
        this.mood = mood;
    }

    public short getMood(){
        return mood;
    }


    public void setFavouriteFood(String favouriteFood) {
        this.favoriteFood = favouriteFood;
    }

    public String getFavoriteFood(){
        return favoriteFood;
    }


    public void setFavouriteActivity(String favouriteActivity) {
        this.favoriteActivity = favouriteActivity;
    }

    public String getFavouriteActivity(){
        return favoriteActivity;
    }
    }
