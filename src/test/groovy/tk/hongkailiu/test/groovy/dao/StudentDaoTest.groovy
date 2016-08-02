package tk.hongkailiu.test.groovy.dao

import groovy.mock.interceptor.MockFor
import groovy.util.logging.Slf4j
import org.junit.Test
import tk.hongkailiu.test.groovy.entity.Student

/**
 * Created by hongkailiu on 2016-08-02.
 */
@Slf4j
class StudentDaoTest {
    def unitUnderTest = new StudentDao()

    def mockForStudent = new MockFor(Student)

    @Test
    void testSave() {
        mockForStudent.demand.getName(1) { return "xxx" }
        def mockStudent = mockForStudent.proxyInstance()
        unitUnderTest.save(mockStudent)

        mockForStudent.verify mockStudent
    }
}
