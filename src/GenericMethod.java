public class GenericMethod {

    public <T> void genericsMethod(T data){
        System.out.println();
        System.out.println("Generics Method :"+data.getClass());
        System.out.println("Data Passed : "+data);
    }

}
