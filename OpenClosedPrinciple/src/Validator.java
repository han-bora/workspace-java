public interface Validator {



    boolean support(Product product);     //새상품인지 중고상품인지 파악하는 메서드

    void validator(Product product) throws IllegalArgumentException;

}
