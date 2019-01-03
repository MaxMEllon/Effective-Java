public class Main {

    public static void main(String[] args) {
        final Pizza pizza = new Pizza.Builder()
                .setSize(30)
                .setSauce(Pizza.Sauce.PESCATORA)
                .build();

        System.out.println(pizza.getInfo());
    }
}
