package dz12;

public class ClassRoom {  // Думаю я не понял что надо сделать...
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        pupil1.read();
        pupil2.read();
        pupil3.read();
        pupil4.read();
        pupil1.study();
        pupil2.study();
        pupil3.study();
        pupil4.study();
        pupil1.write();
        pupil2.write();
        pupil3.write();
        pupil4.write();
        pupil1.relax();
        pupil2.relax();
        pupil3.relax();
        pupil4.relax();
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        pupil1.read();
        pupil2.read();
        pupil3.read();
        pupil1.study();
        pupil2.study();
        pupil3.study();
        pupil1.write();
        pupil2.write();
        pupil3.write();
        pupil1.relax();
        pupil2.relax();
        pupil3.relax();
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        pupil1.read();
        pupil2.read();
        pupil1.study();
        pupil2.study();
        pupil1.write();
        pupil2.write();
        pupil1.relax();
        pupil2.relax();
    }

    public static void main(String[] args) {
        Pupil pupil1 = new ExcellentPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new BadPupil();
        Pupil pupil4 = new GoodPupil();
        ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3, pupil4);


    }
}
