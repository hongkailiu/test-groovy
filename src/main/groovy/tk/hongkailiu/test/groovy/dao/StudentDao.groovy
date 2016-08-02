package tk.hongkailiu.test.groovy.dao

import groovy.util.logging.Slf4j
import tk.hongkailiu.test.groovy.entity.Student

/**
 * Created by hongkailiu on 2016-08-01.
 */
@Slf4j class StudentDao {

    def save(Student student){
        log.info "save ${student.getName()}"
    }
}
