/*
  Set yourself up:

  1) Install SDKMAN - http://sdkman.io/
  2) Install Groovy: sdk install groovy
  3) Start the groovy console by typing: groovyConsole

  To run: groovy <filename>
  groovy learn-groovy-in-y-minutes.groovy
*/

//  Single line comments start with two forward slashes
/*
Multi line comments look like this.
*/

// Hello World
println "Hello world!"

/*
    Variables:
    You can assign values to variables for later use
*/
println "\n\n======Variables======\n"
def x=1 // btw, semicolons are optional
println x
// println is a method reference, and can be also used as follows:
System.out.println(x)
println(x)

// use Java classes:
x = new java.util.Date()
println x
// use class's methods
// Java code is valid for groovy
System.out.println(x.toGMTString());

// you can reassign variables to different types (Dynamic language)
x=-3.1499392
println x

x = false
println x

x = "Groovy!"
println x

/*
  Collections and maps
*/
println "\n\n======Collections and maps======\n"
// Creating an empty list
def technologies = []
println "technologies is an "+technologies.getClass().getName()
// or use groovy shortcut syntax
println "technologies is an "+technologies.class

/*** Adding elements to the list ***/

// As with Java
technologies.add("Grails");

// Left shift adds, and returns the list
technologies << "Groovy"

// Addition!
technologies+='Java'

// Add multiple elements
technologies.addAll(["Gradle","Griffon"])

println "List of technologies: $technologies"

/*** Removing elements from the list ***/
println "\n\n===Removing Elements===\n"
// As with Java
technologies.remove("Griffon")

// Subtraction also works
technologies=technologies - 'Grails'

println "Removed Griffon and Grails"
println technologies

/*** iterating Lists ***/
println "\n===Iterating List===\n"
// Iterate over elements of a list
technologies.each{
  // iterator's default name is "it"
  // dollar sign $ is used for string interpolation
  println "Technology: $it"
}
// Same as:
// technologies.each{ it->println("Technology: $it") }
println "\n\n===Iterating with index===\n"
technologies.eachWithIndex{it,i -> println "$i: $it"}

/*** Checking List contents ***/
println "\n===Checking List Contents===\n"
// Evaluate if a list contains element(s) (boolean)
contained = technologies.contains('Groovy')
// Or 
contained = 'Groovy' in technologies
println "$technologies contains Groovy: $contained"
println "$technologies contains Griffon: ${'Griffon' in technologies}"

// Check for multiple contents
containsAll = technologies.containsAll(['Groovy','Grails'])
println "$technologies contains 'Groovy' and 'Grails': $containsAll"

/*** Sorting Lists ***/
println "\n===Sorting Lists===\n"

println "Unsorted: $technologies"
// Sort a list (mutates original list)
technologies.sort();
println(technologies)

// To sort without mutating original, you can do
sortedTechnologies = technologies.sort(false)
println(sortedTechnologies)

/*** Manipulating Lists ***/
println "\n===Manipulating Lists===\n"

technologies+='Gradle'
println "Original list: $technologies"
// Replace all elements in the list
Collections.replaceAll(technologies,'Gradle','eldarG')
println "Replaced all 'Gradle' occurences with 'eldarG': $technologies"

// Shuffle a list
Collections.shuffle(technologies,new Random())
println "Shuffled: $technologies"

// Clear a list
technologies.clear()
println "Cleared: $technologies"


println "\n===Working with Maps===\n"

// Creating an empty map
def devMap =[:]

// Add values
devMap = ['name':'Roberto', 'framework':'Grails', 'language':'Groovy']
devMap.put('lastName','Perez')

//Iterate over elements of a map
devMap.each { println "$it.key: $it.value" }
println ""
devMap.eachWithIndex { it, i -> println "$i: $it"}
println ""

//Evaluate if a map contains a key
assert devMap.containsKey('name')

//Evaluate if a map contains a value
assert devMap.containsValue('Roberto')

//Get the keys of a map
println "Keys: "+devMap.keySet()

//Get the values of a map
println "Values: "+devMap.values()

// print both keys and values
println devMap