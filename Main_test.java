public class Test_Semaforo {
    
    public static void main(String[] args) {
                
        Thread Alu_1, Alu_2, Alu_3;
        
        Alu_1 = new Thread(new Aluno("Karl Marx", "10814723"));
        Alu_2 = new Thread (new Aluno("Pedro Alvares Cabral", "10425878"));
        Alu_3 = new Thread(new Aluno("Harry Potter","10425789"));
     
        Alu_1.start();
        Alu_2.start();      
        Alu_3.start();         
    }   
}
