package app.service;

import app.dao.UserDAO;
import app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }

    public void save(User user) {
        userDAO.save(user);
    }

    public void update(Long id, String name, String email) {
        User user = userDAO.findById(id);
        if (user != null) {
            user.setName(name);
            user.setEmail(email);
            userDAO.update(user);
        }
    }

    public void delete(Long id) {
        userDAO.delete(id);
    }

    public User findById(Long id) {
        return userDAO.findById(id);
    }
}
