package src;

interface Certification {
    void issueCertificate();
}

abstract class Course {
    String courseCode;
    double fee;

    Course(String code, double fee) {
        this.courseCode = code;
        this.fee = fee;
    }

    abstract double calculateTotalFee();
}

class OfflineCourse extends Course implements Certification {
    OfflineCourse(String code, double fee) {
        super(code, fee);
    }

    double calculateTotalFee() {
        return fee;
    }

    public void issueCertificate() {
        System.out.println("Offline Certificate Issued");
    }
}

// Online Course
class OnlineCourse extends Course implements Certification {
    double platformFee;

    OnlineCourse(String code, double fee, double platformFee) {
        super(code, fee);
        this.platformFee = platformFee;
    }

    double calculateTotalFee() {
        return fee + platformFee;
    }

    public void issueCertificate() {
        System.out.println("Online Certificate Issued");
    }
}

// Main
public class Exam5 {
    public static void main(String[] args) {
        Course c1 = new OfflineCourse("C1", 1000);
        Course c2 = new OnlineCourse("C2", 2000, 200);

        double total = c1.calculateTotalFee() + c2.calculateTotalFee();

        System.out.println("Total Income: " + total);
    }
}