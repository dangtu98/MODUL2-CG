package Abstractinterface.thuchanh;

public class Chicken extends  Animal implements Edible{
    @Override
    public String makeSound() {
        return "chicker: cluck";
    }

    @Override
    public String howToEat() {
        return "tôi đang ăn";
    }
}
