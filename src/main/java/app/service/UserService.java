package app.service;

import app.model.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public void save(User user);

    public void update(Long id, String name, String email);

    public void delete(Long id);

    public User findById(Long id);
}
