package oop.lab03.acme;

public final class Testing {

    private Testing() { }

    public static void main(final String[] args) {
        /*
         * 1) Creare 3 studenti a piacere 2) Creare 2 docenti a piacere 3)
         * Creare due aulee di esame, una con 100 posti una con 80 posti 4)
         * Creare due esami, uno con nMaxStudents=10, l'altro con nMaxStudents=2
         * 5) Iscrivere tutti e 3 gli studenti agli esami 6) Stampare in stdout
         * la rapresentazione in stringa dei due esami
         */
        Student nardini = new Student(1,"Michele","Nardini","ciaone", 2018);
        Student tosi = new Student(2,"Sofia","Tosi","ciazz", 2018);
        Student santoro = new Student(3,"Matteo","Santoro","ciaonoro", 2018);
        
        Professor viroli = new Professor(4,"Bastardo","Viroli","bastard");
        Professor ghini = new Professor(5,"Ba","Ghini","ba");
        ExamRoom e1 = new ExamRoom(100,"oop",true,true);
        ExamRoom e2 = new ExamRoom(80,"SO",true,true);
        Exam ex1 = new Exam(34,10,"oop",viroli,e1);
        Exam ex2 = new Exam(35,2,"SO",ghini,e2);
        
        ex1.registerStudent(nardini);
        ex1.registerStudent(tosi);
        ex1.registerStudent(santoro);
        
        ex2.registerStudent(nardini);
        ex2.registerStudent(tosi);
        ex2.registerStudent(santoro);
        
        System.out.println("Esame1: " + ex1.toString() + "\n Esame2: " + ex2.toString());
        
    }
}
