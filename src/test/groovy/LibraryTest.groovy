/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'ehongka' at '7/11/16 1:27 PM' with Gradle 2.13
 *
 * @author ehongka, @date 7/11/16 1:27 PM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
