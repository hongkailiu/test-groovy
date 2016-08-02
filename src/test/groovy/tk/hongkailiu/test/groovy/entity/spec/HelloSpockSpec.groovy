package tk.hongkailiu.test.groovy.entity.spec

import spock.lang.Specification

/**
 * Created by hongkailiu on 2016-08-01.
 * ref. https://github.com/spockframework/spock-example/blob/master/src/test/groovy/HelloSpockSpec.groovy
 */
class HelloSpockSpec extends Specification {
    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }
}
