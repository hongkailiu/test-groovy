package tk.hongkailiu.test.groovy.service

import groovy.util.logging.Slf4j
import tk.hongkailiu.test.groovy.dao.StudentDao
import tk.hongkailiu.test.groovy.entity.Student

/**
 * Created by hongkailiu on 2016-08-01.
 */
@Slf4j
class StudentService {
    def studentDao = new StudentDao()

    def save(Student student){
        studentDao.save(student)
    }
}
