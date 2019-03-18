package com.gupaoedu.designPattern.templateModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class PythonCourse extends Course {

    private boolean needHomeworkFlag;

    public PythonCourse(Boolean needHomeworkFlag) {

        this.needHomeworkFlag = needHomeworkFlag;

    }

    @Override
    public void checkHomework() {

        System.out.println("检查Python作业");

    }

    @Override
    public boolean needHomework() {

        return needHomeworkFlag;

    }

}
