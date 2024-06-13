package com.tka.dao;

import java.util.List;

import com.tka.entity.Faculty;

public interface FacultyDAO {
	List<Faculty> getAllFaculties();

	Faculty getFacultyById(int id);

	void saveFaculty(Faculty faculty);

	void deleteFaculty(int id);
}
