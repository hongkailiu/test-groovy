package tk.hongkailiu.test.groovy.entity

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by hongkailiu on 2016-08-01.
 */
@Unroll
class StudentSpec extends Specification {
    def "#student.name is a #sex.toLowerCase() student"() {
        expect:
        student.getSex() == sex

        where:
        student                    || sex
        new Student(name: "Fred")  || "Male"
        new Student(name: "Wilma") || "Female"
    }
}
