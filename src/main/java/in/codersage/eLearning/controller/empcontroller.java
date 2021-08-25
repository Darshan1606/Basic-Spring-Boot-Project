package in.codersage.eLearning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import in.codersage.eLearning.entity.Employee;


@RestController
public class empcontroller {

	@Autowired
	EmpRepository EmpRepository;

    @GetMapping("/employee")
    public List<Employee> getAll(){
        return EmpRepository.findAll();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getDetails(@PathVariable Long id){
        return EmpRepository.findById(id);
    }

    @PostMapping("/employee")
    public Employee saveemp(@RequestBody Employee age){
        return EmpRepository.save(age);
    }
}
