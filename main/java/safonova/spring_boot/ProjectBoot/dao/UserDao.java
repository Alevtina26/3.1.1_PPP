package safonova.spring_boot.ProjectBoot.dao;

import safonova.spring_boot.ProjectBoot.model.User;
import java.util.List;

public interface UserDao {
    public void changeUser(User user);
    List<User> getUsers();
    void addUser(User user);
    void deleteUser(int id);
}
