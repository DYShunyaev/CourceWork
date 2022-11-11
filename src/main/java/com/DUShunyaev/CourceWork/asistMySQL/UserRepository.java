package com.DUShunyaev.CourceWork.asistMySQL;

import com.DUShunyaev.CourceWork.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Employee, Integer>{

}
