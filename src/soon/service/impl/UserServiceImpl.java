package soon.service.impl;

import soon.service.UserService;

public class UserServiceImpl  {
    UserService  userService = new UserService() {
        @Override
        public void addUsers() {
            UserService.super.addUsers();
        }

        @Override
        public void findID() {
            UserService.super.findID();
        }

        @Override
        public void cleanWithID() {
            UserService.super.cleanWithID();
        }

        @Override
        public void takeAllUsers() {
            UserService.super.takeAllUsers();
        }
    };
}
