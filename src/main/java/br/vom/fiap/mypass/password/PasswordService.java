package br.vom.fiap.mypass.password;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasswordService {

    @Autowired
    PasswordRepository repository;

    public List<Password> findAll() {
        return repository.findAll();
    }
}
