/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.sms.bo;

import java.util.List;
import lk.ijse.edu.sms.dao.StudentDAO;
import lk.ijse.edu.sms.dto.StudentDTO;

/**
 *
 * @author Sandun_CJ
 */
public class StudentBO {
    
    private final StudentDAO studentDAO;
    
    public StudentBO() {
        this.studentDAO = new StudentDAO();
    }
    
    public boolean saveStudent(StudentDTO sdto)throws Exception{
        studentDAO.writeFile(sdto);
        return true;
    }
    
    public List<StudentDTO> getAll() throws Exception {
        return studentDAO.fileIfExists() ? studentDAO.getAll() : null;
    }
    
    public boolean updateStudent(StudentDTO sdto) throws Exception{
        return studentDAO.updateStudent(sdto);
    }
    
    public boolean deleteStudent(int sId) throws Exception {
        return studentDAO.deleteStudent(sId);
    }
    
}
