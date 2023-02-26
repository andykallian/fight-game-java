package projetos.aula07;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    // Métodos Especiais

    //Construtor

    public Lutador(
        String nome,
        String nacionalidade,
        int idade,
        double altura,
        double peso,
        String categoria,
        int vitorias,
        int derrotas,
        int empates
    ){

        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //Getters e Setters
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //  Métodos


    public void apresentar(){
        System.out.println("--------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador "+ getNome());
        System.out.println("Diretamente de "+ getNacionalidade());
        System.out.println("Com " + getIdade() + " anos e " + getAltura() + "m de altura");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }

    public void status(){
        System.out.println(getNome() + " é um peso " + getCategoria());
        System.out.println("Ganhou " + getVitorias()+ " vezes");
        System.out.println("Perdeu " + getDerrotas()+ " vezes");
        System.out.println("Empatou " + getEmpates()+ " vezes");
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((nacionalidade == null) ? 0 : nacionalidade.hashCode());
        result = prime * result + idade;
        long temp;
        temp = Double.doubleToLongBits(altura);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(peso);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        result = prime * result + vitorias;
        result = prime * result + derrotas;
        result = prime * result + empates;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lutador other = (Lutador) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (nacionalidade == null) {
            if (other.nacionalidade != null)
                return false;
        } else if (!nacionalidade.equals(other.nacionalidade))
            return false;
        if (idade != other.idade)
            return false;
        if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
            return false;
        if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
            return false;
        if (categoria == null) {
            if (other.categoria != null)
                return false;
        } else if (!categoria.equals(other.categoria))
            return false;
        if (vitorias != other.vitorias)
            return false;
        if (derrotas != other.derrotas)
            return false;
        if (empates != other.empates)
            return false;
        return true;
    }


    
}
