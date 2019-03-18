package com.gupaoedu.designPattern.templateModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class TemplateModelTest {

    public static void main(String[] args) {

        JavaCourse javaCourse = new JavaCourse();
        javaCourse.courseProcess();

        System.out.println("--------------------");

        PythonCourse pythonCourse = new PythonCourse(true);
        pythonCourse.courseProcess();

    }

}
