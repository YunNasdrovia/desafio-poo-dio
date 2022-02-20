import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
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

        Dev devWesley = new Dev();

        devWesley.setNome("Wesley Faria");
        devWesley.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Wesley Faria" + devWesley.getConteudosInscritos());

        devWesley.progredir();
        devWesley.progredir();
        devWesley.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos Wesley Faria" + devWesley.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Wesley Faria" + devWesley.getConteudosConcluidos());
        System.out.println("XP:" + devWesley.calcularTotalXp());

        System.out.println("------------");

        Dev devJoel = new Dev();

        devWesley.setNome("Joel David");
        devJoel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joel David" + devJoel.getConteudosInscritos());

        devJoel.progredir();
        devJoel.progredir();
        devJoel.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos Joel David" + devJoel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Joel David" + devJoel.getConteudosConcluidos());
        System.out.println("XP:" + devWesley.calcularTotalXp());


    }
}
