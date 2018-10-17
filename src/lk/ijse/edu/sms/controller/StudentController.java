/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.sms.controller;

import java.util.List;
import lk.ijse.edu.sms.bo.StudentBO;
import lk.ijse.edu.sms.dto.StudentDTO;

/**
 *
 * @author Sandun_CJ
 */
public class StudentController {
    
    private final StudentBO studentBO;
    
    public StudentController() {
        this.studentBO = new StudentBO();
    }
    
    public boolean saveStudent(StudentDTO sdto)throws Exception{
        return studentBO.saveStudent(sdto);
    }
    
    public List<StudentDTO> getAll() throws Exception{
        return studentBO.getAll();
    }
    
    public boolean updateStudent(StudentDTO sdto) throws Exception{
        return studentBO.updateStudent(sdto);
    }
    
    public boolean delete(int sId) throws Exception {
        return studentBO.deleteStudent(sId);
    }
    
}
