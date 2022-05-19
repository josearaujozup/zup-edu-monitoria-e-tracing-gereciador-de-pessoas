package br.com.zup.edu.personmanager.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class PessoaResponse {

    private Long id;
    private String nome;
    private String cpf;
    private String apelido;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataNascimento;

    public PessoaResponse() {
    }

    private PessoaResponse(Long id, String nome, String cpf, String apelido, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
    }

    public static PessoaResponse from(Pessoa novaPessoa) {
        return new PessoaResponse(novaPessoa.getId(), novaPessoa.getNome(),
                novaPessoa.getCpf(), novaPessoa.getApelido(), novaPessoa.getDataNascimento() );
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getApelido() {
        return apelido;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
