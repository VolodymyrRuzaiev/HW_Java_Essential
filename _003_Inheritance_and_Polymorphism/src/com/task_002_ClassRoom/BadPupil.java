package com.task_002_ClassRoom;

public class BadPupil extends Pupil {

    @Override
    public void study() {
        System.out.print("I study bad");
    }

    @Override
    public void read() {
        System.out.print("I read bad");
    }

    @Override
    public void write() {
        System.out.print("I write bad");
    }

    @Override
    public void relax() {
        System.out.print("I relax bad");
    }

}
