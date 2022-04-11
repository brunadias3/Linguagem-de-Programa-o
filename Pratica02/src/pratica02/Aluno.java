package pratica02;
public class Aluno {
    private int ra;
    private String nome;
    private char sexo;
    private String rg;
    private String cpf;
    private Data dataNasc;

    public int getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }
    
    public Data getdataNasc() {
        return dataNasc;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setdataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Aluno(int ra, String nome, char sexo, String rg, String cpf, Data dataNasc) {
        this.ra = ra;
        this.nome = nome;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
    void imprimir(){
        System.out.println(getRa());
        System.out.println(getNome());
        System.out.println(getSexo());
        System.out.println(getRg());
        System.out.println(getCpf());
        System.out.println(dataNasc.formatarData());
    }
}





