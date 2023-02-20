package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao(); // o DaoFactory (fabrica de Daos) que injeta a dependência do DepartmentDao
	
	public List<Department> findAll(){
		return dao.findAll();
	}

}
