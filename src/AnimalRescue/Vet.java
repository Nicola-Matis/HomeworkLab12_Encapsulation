package AnimalRescue;

public class Vet {
    String name;
    int experience;
    String specialization;

    public void setName(String name){
    this.name=name;
}

public String getName(){
        return name;
}

public void setExperience(int experience){
        this.experience=experience;
}

public int getExperience(){
        return experience;
    }

    public void setSpecialization(String specialization){
        this.specialization=specialization;
    }

    public String getSpecialization(){
        return specialization;
    }
}