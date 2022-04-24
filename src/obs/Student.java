package obs;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int mats, int fizik, int fiziks, int kimya, int kimyas) {

        if ((mat >= 0 && mat <= 100) && (mats >= 0 && mats <= 100)) {
            double avgMat=(0.8*mat)+(0.2*mats);
            this.mat.note = avgMat;
        }

        if ((fizik >= 0 && fizik <= 100) && (fiziks >= 0 && fiziks <= 100)) {
            double avgFizik=(0.8*fizik)+(0.2*fiziks);
            this.fizik.note = avgFizik;
        }

        if ((kimya >= 0 && kimya <= 100) && (kimyas >= 0 && kimyas <= 100))  {
            double avgKimya=(0.8*kimya)+(0.2*kimyas);
            this.kimya.note = avgKimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
