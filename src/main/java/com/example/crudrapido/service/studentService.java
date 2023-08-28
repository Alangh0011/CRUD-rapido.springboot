package com.example.crudrapido.service;

import com.example.crudrapido.entity.Student;
import com.example.crudrapido.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentService {
    @Autowired//Es una inyeccion y mandamos a llamar a StudentReposi
    studentRepository StudentRepository;

    //Va devolver una lista de elementos de los estudiante, lo que retornara toda la informacion, el findall es buscar todos los elementos y retornarlos
    public List<Student> getAllStudents(){
        return StudentRepository.findAll();
    }

    //Buscara un estudiante (opcional) lo busca por id
    public Optional<Student> getStudent(Long id){
        return StudentRepository.findById(id);
    }
    //Este es el guardar o actualizar, recibe un estudiante (llama al repositorio y le pasa el estudiante))
    public void saveOrUpdate(Student student){
        StudentRepository.save(student);
    }
    //eliminar atraves del id
    public void delete(Long id){
        StudentRepository.deleteById(id);
    }
}
