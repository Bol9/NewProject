package soon.dao;

import soon.model.User;

public class UserDao {
    private User users;

    public UserDao(User users) {
        this.users = users;
    }

    public UserDao() {
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + users +
                '}';
    }
}
