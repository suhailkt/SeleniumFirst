package org.example;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        XmlSuite suite = new XmlSuite();
        suite.setName("TmpSuite");
        XmlTest test = new XmlTest(suite);
        test.setName("TmpTest");
        List<XmlClass> classes = new ArrayList<XmlClass>();
        classes.add(new XmlClass("org.example.PerfTest"));
//        classes.add(new XmlClass("org.example.AppiumBasicsRemote"));
        test.setXmlClasses(classes);
        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        TestNG tng = new TestNG();
        tng.setParallel(XmlSuite.ParallelMode.METHODS);
        tng.setXmlSuites(suites);
        tng.run();
    }



}
