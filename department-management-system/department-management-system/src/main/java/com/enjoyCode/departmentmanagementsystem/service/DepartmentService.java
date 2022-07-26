package com.enjoyCode.departmentmanagementsystem.service;

import java.util.List;

import com.enjoyCode.departmentmanagementsystem.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId);

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

}
