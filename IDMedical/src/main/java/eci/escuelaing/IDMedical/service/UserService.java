package eci.escuelaing.IDMedical.service.user;

import eci.escuelaing.IDMedical.repository.user.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);

    Optional<User> findById(String id);

    List<User> all();

    void deleteById(String id);

    User update(User user, String userId);
}
