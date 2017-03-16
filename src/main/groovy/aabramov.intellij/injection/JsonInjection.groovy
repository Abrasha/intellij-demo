package aabramov.intellij.injection

import groovy.json.JsonSlurper

class JsonInjection {

    static String jsonText =
            '''{
                "name": "John",
                "age": 20          
                }
            '''

    static void main(String[] args) {

        def json = new JsonSlurper().parseText(jsonText)

        println "name = ${json.name}"
    }

}
