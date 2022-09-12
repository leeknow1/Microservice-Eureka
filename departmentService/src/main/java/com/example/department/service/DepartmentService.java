package com.example.department.service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService class.");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentService class.");
        return departmentRepository.findById(departmentId);
    }
}
