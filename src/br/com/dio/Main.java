package br.com.dio;
import br.com.dio.Dominio.Bootcamp;
import br.com.dio.Dominio.Curso;
import br.com.dio.Dominio.Mentoria;

import java.time.LocalDate;
import br.com.dio.Dominio.Dev;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição javaScript Curso");

        Mentoria mentoria1= new Mentoria();
        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescricao("Primeira mentoria de java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1= new Bootcamp();
        bootcamp1.setNome("Bootcamp java development");
        bootcamp1.setDescricao("bootcamp para javeiros");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev marcos = new Dev();
        marcos.setNome("Marcos");
        marcos.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Marcos:"+ marcos.getConteudosInscritos());
        marcos.progredir();
        System.out.println("Conteudos concluidos marcos:"+ marcos.getConteudoConcluidos());

        Dev joao = new Dev();
        joao.setNome("Joao");
        joao.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos joão:"+ joao.getConteudosInscritos());
        joao.progredir();
        System.out.println("Conteudos concluidos João:"+ joao.getConteudoConcluidos());
    }
}
