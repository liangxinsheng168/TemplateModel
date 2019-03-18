package com.gupaoedu.designPattern.templateModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public abstract class Course {

    public void courseProcess() {

        this.preStudy();

        this.startCourse();

        this.courseQA();

        this.courseOver();

        if(this.needHomework()) {

            this.checkHomework();

        }


    }

    public void courseOver() {

        System.out.println("课程结束");

    }

    public abstract void checkHomework();

    public boolean needHomework() { return false; }


    public void courseQA() {

        System.out.println("进行课堂答疑");

    }

    public void startCourse() {

        System.out.println("开始上课，演示PPT");

    }

    public void preStudy() {

        System.out.println("上传课前预习资料");

    }

}
