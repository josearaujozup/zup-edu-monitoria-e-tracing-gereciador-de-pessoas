package br.com.zup.edu.personmanager.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

public class PessoaRequest {

    @NotBlank
    private String nome;

    @Pattern(regexp = "(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)")
    @NotBlank
    private String cpf;

    private String apelido;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataNascimento;

    public PessoaRequest() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pessoa toModel(){
        return new Pessoa(this.nome, this.cpf, this.apelido, this.dataNascimento);
    }

}
