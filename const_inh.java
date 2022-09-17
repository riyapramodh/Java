class test {
    int x;

    public void setTest(int q) {
        x = q;
    }

    public int getTest() {
        return x;
    }
    test(){
        System.out.println("this contains test data");
    }
}
    class exams extends test{
        int y;
        public void setExam(int w){
            y = w;
        }
        public int getExam(){
            return y;
        }
        exams(){
            System.out.println("this is exam data");
        }

    }


public class const_inh {
    public static void main(String[] args) {
        exams e = new exams();
    }
}
