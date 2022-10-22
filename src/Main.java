public class Main {
    public static void main(String[] args) {

        // initialize generic class
        // with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Integer = "+intObj.getData());

        // initialize generic class
        // with String data
        GenericsClass<String> strObj = new GenericsClass<>("Hello World");
        System.out.println("String = "+strObj.getData());

        // initialize generic class
        // with Double data
        GenericsClass<Double> doubleObj = new GenericsClass<>(3242.432);
        System.out.println("Double = "+doubleObj.getData());


        GenericMethod demo = new GenericMethod();
        // generics method working with String
        demo.genericsMethod("Java Programming");

        // generics method working with Integer
        demo.genericsMethod(123);




    }
}