package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        //Animal
        Dog Dog= new Dog();
        Dog.setName("Rex");
        Dog.setAge(6);
        Dog.setHealthBar((short) 1);

        System.out.println("The dog's name that has been rescued is " + Dog.getName() + ", It is "
                + Dog.getAge() + " years old" + " and its current health state is " + Dog.getHealthBar() + " on a scale to 10.");
        //Adopter
        Adopter dogAdopter = new Adopter();
        dogAdopter.setName("Mihai");
        dogAdopter.setNetWorth(400.000);
        System.out.println("The last person to adopt an animal from our centre is " + dogAdopter.getName() + ".");
        //AnimalFood
        AnimalFood dogFood = new AnimalFood();
        dogFood.setName("Canidae");
        dogFood.setPrice(119.99);
        System.out.println("Every dog's meal is perfect if " + dogFood.getName() + " is present at the table or should we say.. in the bowl? " +
                "However, despite the fame of the brand its price is a deciding factor, not everyone affords to pay " + "$" + dogFood.getPrice() +
                " for only 10 servings of the dog's favorite food, love can only get you so far!");
        //RecreationalActivities
        RecreationalActivities Activity = new RecreationalActivities();
        Activity.setName("Swimming");
        Activity.setDuration(30);
        System.out.println("Rex's favorite activity is " + Activity.getName() + " and the average session is " + Activity.getDuration() + " minutes long.");
        //Vet
        Vet veterinary = new Vet();
        veterinary.setName("Darius");
        veterinary.setExperience(25);
        veterinary.setSpecialization("Radiology");
        System.out.println("Ever since Rex has made its way to our shelter he was seen by our dear vet, "+ veterinary.name + " and who was always happy to take care of Rex, up to this moment.");

    }
}