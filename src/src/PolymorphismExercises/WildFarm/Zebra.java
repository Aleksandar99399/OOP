package src.PolymorphismExercises.WildFarm;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public String makeSound() {
        return "Zs";
    }

    @Override
    public void eatFood(Food food) {
        if (!"vegetable".equalsIgnoreCase(food.getClass().getSimpleName())) {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        super.eatFood(food);
    }
}