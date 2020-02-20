package ru.inno.stc;

import ru.inno.stc.entity.Course;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "ru.inno.stc.CoursesService")
public class CoursesServiceImpl implements CoursesService {

    private final Map<Integer, Course> courses = new HashMap<>();

    @Override
    public void addCourse(@WebParam Course course) {
        courses.put(course.getId(), course);
    }

    @Override
    public Course getCourseById(@WebParam int id) {
        return courses.get(id);
    }
}
