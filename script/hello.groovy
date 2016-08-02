/**
 * Created by ehongka on 7/11/16.
 */
// java code
System.out.println("Hello World");

// groovy code
println "Hello World"

def x = 42
println x.getClass()
x = "Hello World"
println x.getClass()


def y = "World"
println "Hello, $y"

def firstName = "Douglas"
def name = "Adams"
println "Hello, ${firstName[0]}. $name"

def s = """This is
a multiline
string"""

println s.getClass()

def s1 = "Hello, ${firstName[0]}. $name"
println s1.getClass()

def pattern = ~/a slash must be escaped \/ but backslash, like in a digit match \d does not/
println pattern.getClass()

// closure
def helloWorld = {
    println "Hello World! closure~~"
}

helloWorld()

def power = { int x1, int y1 ->
    return Math.pow(x1, y1)
}
println power(2, 3) // Will print 8.0

def transform = { str, transformation ->
    transformation(str)
}

println transform("Hello World", { it.toUpperCase() })