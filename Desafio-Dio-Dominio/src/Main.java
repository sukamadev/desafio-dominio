
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("descrição curso jas");
        curso1.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        
       System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);

    }
}