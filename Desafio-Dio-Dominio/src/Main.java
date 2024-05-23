
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
        
       /*System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);*/

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição Bootcamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devCamila = new Dev();
       devCamila.setNome("Camila");
       devCamila.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
       devCamila.progredir();
       devCamila.progredir();
       System.out.println("-");
       System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
       System.out.println("Conteudos Concluídos" + devCamila.getConteudosConcluidos());
       System.out.println("XP:" + devCamila.calcularTotalXp());
       
       System.out.println("_______________________________________");
       
       Dev devSukama = new Dev();
       devSukama.setNome("Sukama");
       devSukama.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos Inscritos" + devSukama.getConteudosInscritos());
       devSukama.progredir();
       devSukama.progredir();
       devSukama.progredir();
       System.out.println("-");
       System.out.println("Conteudos Inscritos" + devSukama.getConteudosInscritos());
       System.out.println("Conteudos Concluídos" + devSukama.getConteudosConcluidos());
       System.out.println("XP:" + devSukama.calcularTotalXp());
    }
}
