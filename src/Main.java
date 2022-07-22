import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de java");
        curso1.setDescricao("descricao do curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descricao do curso de js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao da mentoria de java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
//        Bootcamp bootcamp = new Bootcamp();
//        bootcamp.setNome("Bootcamp Java Developer");
//        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
//        bootcamp.getConteudos().add(curso1);
//        bootcamp.getConteudos().add(curso2);
//        bootcamp.getConteudos().add(mentoria);
//
//        Dev devTony = new Dev();
//        devTony.setNome("Tony");
//        devTony.inscreverBootcamp(bootcamp);
//        System.out.println("Conteudos Inscritos Tony"+ devTony.getConteudosInscritos());
//        devTony.progredir();
//        System.out.println("-");
//        System.out.println("Conteudos Inscritos Tony"+ devTony.getConteudosInscritos());
//        System.out.println("Conteudos Concluidos Tony"+ devTony.getConteudosConcluidos());
//        System.out.println("XP:" + devTony.calcularXp());
//        System.out.println("-----------------------------------------------------------");
//
//        Dev devCamila = new Dev();
//        devCamila.setNome("Camila");
//        devCamila.inscreverBootcamp(bootcamp);
//        System.out.println("Conteudos Inscritos Camila "+ devCamila.getConteudosInscritos());
//        devCamila.progredir();
//        devCamila.progredir();
//        devCamila.progredir();
//        System.out.println("-");
//        System.out.println("Conteudos Inscritos Camila"+ devTony.getConteudosInscritos());
//        System.out.println("Conteudos Concluidos Camila"+ devCamila.getConteudosConcluidos());
//        System.out.println("XP:" + devCamila.calcularXp());




    }
}
