package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import objects.Usuarios;
import repository.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRe;

    public List<Usuarios> obtenerTodos() {
        return userRe.findAll();
    }

    public Usuarios obtenerPorEmail(String email) {
        return userRe.findByEmail(email);
    }
    public Usuarios obtenerPorNombre(String name) {
        return userRe.findByName(name);
    }


    public Usuarios guardar(Usuarios usuario) {
        return userRe.save(usuario);
    }
}
