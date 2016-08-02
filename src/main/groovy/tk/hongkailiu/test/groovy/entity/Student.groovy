package tk.hongkailiu.test.groovy.entity

/**
 * Created by hongkailiu on 2016-08-01.
 */
class Student {
    int id;
    String name


    String getSex() {
        name == "Fred" ? "Male" : "Female"
    }
}