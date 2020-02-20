package ru.inno.stc;

import ru.inno.stc.entity.Course;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface CoursesService {

    @WebMethod
    void addCourse(@WebParam Course course);

    @WebMethod
    Course getCourseById(@WebParam int id);
}
