package com.example.demo.repositories;

import com.example.demo.entitys.Employees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface EmployeesRepository extends CrudRepository<Employees, Long> {
    @Query(value = "SELECT *\n" +
            "FROM employees E\n" +
            "WHERE salary > (SELECT AVG(salary) FROM employees X\n" +
            "WHERE E.office_id = x.office_id)", nativeQuery = true)
    Collection<Employees> findEmployeesWithLargeSalary();
}
