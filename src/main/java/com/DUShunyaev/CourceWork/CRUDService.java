package com.DUShunyaev.CourceWork;

import com.DUShunyaev.CourceWork.asistMySQL.UserRepository;
import com.DUShunyaev.CourceWork.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CRUDService {
    @Autowired
    UserRepository repo;

    public List<Employee> listAll() {
        return (List<Employee>) repo.findAll();
    }
}
