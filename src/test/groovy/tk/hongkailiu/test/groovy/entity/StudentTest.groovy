package tk.hongkailiu.test.groovy.entity

import org.junit.Before
import org.junit.Test

/**
 * Created by hongkailiu on 2016-08-01.
 */
class StudentTest {

    private Student unitUnderTest

    @Before public void setup() {
        unitUnderTest = new Student()
    }
    @Test public void testIdGetterSetter(){
        long id = 3
        unitUnderTest.setId(id)
        assert id == unitUnderTest.getId()
    }
}
