/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.sms.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.edu.sms.dto.StudentDTO;

/**
 *
 * @author Sandun_CJ
 */
public class StudentDAO {
    
    private final File file=new File("H:\\Project Viva-2018-08-08\\Viva\\File\\Student.txt");
    
    public boolean saveStudent(StudentDTO student) throws Exception{
            List<StudentDTO> alStudents= fileIfExists() ? getAll() : new ArrayList<>();
            alStudents.add(student);
            return writeStudentFiles(alStudents);
    }

    public boolean fileIfExists() {
        return file.exists();
    }

    public List<StudentDTO> getAll() {
        List<StudentDTO> sdtos=new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            sdtos  = (List<StudentDTO>) objectInputStream.readObject();
        } catch (Exception ex) {
          
        }
        return sdtos;
    }

    public boolean writeStudentFiles(List<StudentDTO> sdtos) throws Exception{
        
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(sdtos);
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }
    
    public boolean writeFile(StudentDTO studentDTO)throws Exception{
        List<StudentDTO> alStudents= fileIfExists() ? getAll() : new ArrayList<>();
        alStudents.add(studentDTO);
        return writeStudentFiles(alStudents);
    }
    
    public boolean updateStudent(StudentDTO studentDTO) throws Exception {
        List<StudentDTO> studentDTOs = fileIfExists() ? getAll() : new ArrayList<>();
        file.delete();

        StudentDTO studentDTO1 = null;
        for (StudentDTO studentDTO2 : studentDTOs) {
            if (studentDTO2.getsId()== studentDTO.getsId()) {
                studentDTO1 = studentDTO2;
            }
        }
        studentDTOs.remove(studentDTO1);
        studentDTOs.add(studentDTO);
        return writeStudentFiles(studentDTOs);
    }
    
    public boolean deleteStudent(int sId) throws Exception {
        List<StudentDTO> studentDTOs = fileIfExists() ? getAll() : new ArrayList<>();
        file.delete();

        StudentDTO studentDTO = null;
        for (StudentDTO studentDTO1 : studentDTOs) {
            if(studentDTO1.getsId()==sId){
                studentDTO=studentDTO1;
            }
        }
        studentDTOs.remove(studentDTO);
        return writeStudentFiles(studentDTOs);
    }
    
}
