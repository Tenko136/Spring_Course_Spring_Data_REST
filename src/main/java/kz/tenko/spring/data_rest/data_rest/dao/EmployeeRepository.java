package kz.tenko.spring.data_rest.data_rest.dao;



import kz.tenko.spring.data_rest.data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}





