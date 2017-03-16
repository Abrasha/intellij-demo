package aabramov.intellij.injection

class XmlInjection {

    static String xmlText =
            '''<car>
                    <brand>Lada</brand>
                    <model>Kalina</model>
               </car>
            '''

    static void main(String[] args) {

        def xml = new XmlSlurper().parseText(xmlText)

        println "brand = ${xml.brand}"
        println "model = ${xml.model}"
    }

}
