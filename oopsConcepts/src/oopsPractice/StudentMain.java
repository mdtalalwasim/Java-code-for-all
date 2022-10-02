package oopsPractice;

public class StudentMain {
    public static void main(String[] args) {
        Student st = new Student();

        st.setStudentName("Taimur");
        st.setStudentId(10);
        st.setStudentCity("Rangpur");

        st.study();
        st.showFullDetails();
    }
}
