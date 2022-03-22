package soon.service;

public interface UserService {
    default void addUsers(){
        System.out.println("User koshuu");

    }
    default void findID(){
        System.out.println("Id menen tabuu");

    }
    default void cleanWithID(){
        System.out.println("Id menen ochuruu");

    }
    default void takeAllUsers(){
        System.out.println("Baardyk userlerdi alyp atat");
    }



}
