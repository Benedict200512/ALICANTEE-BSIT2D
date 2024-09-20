package alicantebsit2d;

public class Grades {
    private String name;
    private int id;
    private double pr, md, pf, fn;


    public void addGrades(String snm, int sid, double spr, double smd, double spf, double sfn) {
        this.name = snm;
        this.id = sid;
        this.pr = spr;
        this.md = smd;
        this.pf = spf;
        this.fn = sfn;
    }

    public void viewGrades() {
        double totalMarks = this.pr + this.md + this.pf + this.fn;
        double average = totalMarks / 4;
        String status = (average > 3.0) ? "Failed" : "Passed";

        System.out.printf("%-10s %-10d %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                this.name, this.id, this.pr, this.md, this.pf, this.fn, average, status);
    }

    public void editGrades(int sid, double prl, double mdl, double pfl, double fnl) {
        if (this.id == sid) {
            this.pr = prl;
            this.md = mdl;
            this.pf = pfl;
            this.fn = fnl;
            System.out.println("Grades updated successfully!");
        } else {
            System.out.println("Student ID not found!");
        }
    }
    public void deleteGrades(int sid) {
        if (this.id == sid) {
            this.id = 0;
            this.name = null;
            this.pr = 0.0;
            this.md = 0.0;
            this.pf = 0.0;
            this.fn = 0.0;
            System.out.println("Grades deleted successfully!");
        } else {
            System.out.println("Student ID not found!");
        }
    }
    public int getId() {
        return this.id;
    }   
    public String getName() {
        return this.name;
    }
}
