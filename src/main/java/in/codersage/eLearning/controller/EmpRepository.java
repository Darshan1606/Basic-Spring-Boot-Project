package in.codersage.eLearning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.codersage.eLearning.entity.Course;
import in.codersage.eLearning.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Long>  {



}
