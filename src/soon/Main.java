package soon;

import soon.dao.UserDao;
import soon.model.Gender;
import soon.model.User;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        User user1 = new User(1, "Kalys", 25, Gender.MALE);
        User user2 = new User(2, "Adilet", 27, Gender.MALE);
        User user3 = new User(3, "Aiym", 26, Gender.FEMALE);


        UserDao userDao1 = new UserDao(user1);
        UserDao userDao2 = new UserDao(user2);
        UserDao userDao3 = new UserDao(user3);

        UserDao[] userDaos1 = {userDao1, userDao2, userDao3};
       List<UserDao> userDaos = new ArrayList<>(List.of(userDaos1)) {};

       int counterForExeptin=1;

        for (UserDao users : userDaos) {
            int id = users.getUsers().getId();
            if (id == 2) {
                System.out.println(users);
                break;
            }
            counterForExeptin+=1;
            if(counterForExeptin== userDaos.toArray().length){
                Exception Exception = new RuntimeException();
                throw Exception;
            }
        }

        System.out.println(userDaos);

        int counterForExeptin1 =1;

        for (UserDao users : userDaos) {
            int id = users.getUsers().getId();
            if (id == 2) {  // kaisyl userdi ochurgusu kelse 2 degen sandyn orduna id sin jazsa ochurup koiot

                userDaos.remove(users);
                //System.out.println(users);
                break;
            }
            counterForExeptin1 += 1;
            if(counterForExeptin1== userDaos.toArray().length){
                Exception Exception = new RuntimeException();
                throw Exception;
            }
        }

        System.out.println(userDaos);


    }
}

