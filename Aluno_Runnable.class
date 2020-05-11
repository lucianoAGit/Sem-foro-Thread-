public class Aluno implements Runnable{ 
    
    static Semaphore mutex = new Semaphore(1); //Numero de atendentes livres
    private String nome; 
    private String N_usp;
         
    public Aluno(String nome, String N_usp) {
	this.nome = nome;
        this.N_usp = N_usp;     
    }         
    @Override
    public void run(){
        mutex.down();
        System.out.println("\n Bem Vindo, qual o seu nome e numero usp ? \n");
        System.out.println(nome + " esqueci meu numero usp, vou pensar... \n");
        //tempo para pensar no numero usp
        try{
            Thread.sleep(1800); //pensando...
            System.out.println("Lembrei, esse é meu numero USP: " + N_usp +"\n");
            
            Thread.sleep(1500);//tempo para a atendente anotar a resposta
            mutex.up();
        }catch (InterruptedException e){}   

    }  

}
