package tk.hongkailiu.test.groovy.service

import groovy.mock.interceptor.MockFor
import groovy.util.logging.Slf4j
import org.junit.Before
import org.junit.Test
import tk.hongkailiu.test.groovy.dao.StudentDao
import tk.hongkailiu.test.groovy.entity.Student

/**
 * Created by hongkailiu on 2016-08-01.
 */
@Slf4j class StudentServiceTest {

    StudentService unitUnderTest

    def mockForStudentDao = new MockFor(StudentDao)

    @Before
    void setup() {
        log.info 'setup ...'
        unitUnderTest = new StudentService()

        mockForStudentDao.demand.save(1) { Student s1 ->
            log.info "save ${s1.getName()}"
        }
    }

    @Test void testSave() throws Exception {
        def s = new Student(name: "elle")

        def mockStudentDao = mockForStudentDao.proxyInstance()
        unitUnderTest.setStudentDao(mockStudentDao)
        unitUnderTest.save(s)
        mockForStudentDao.verify mockStudentDao
    }
}
