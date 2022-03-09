package abstractclass_interface.thuc_hanh.thuc_hanh.animal_class_and_interface_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: Cluck - cluck";
    }

    @Override
    public String howToEat() {
        return "Could be tried.";
    }
}
