package day21_springboot_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import day21_springboot_crud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}