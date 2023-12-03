package model;

import model.entities.Department;

import java.util.List;

public interface departmentDao {
    void inset (Department obj);
    void update (Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll ();
}
