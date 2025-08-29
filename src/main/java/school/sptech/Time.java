package school.sptech;

public class Time {

    String nome;
    Integer vitorias = 0;
    Integer empates = 0;
    Integer derrotas = 0;


    public void registrarVitoria(){
        vitorias++;
    }

    public void registrarEmpate(){
        empates++;
    }

    public void registrarDerrota(){
        derrotas++;
    }

    public Integer getTotalPartidas(){
        return vitorias + empates + derrotas;
    }

    public Integer getPontos(){
        return ((vitorias * 3) + empates);
    }

    public Integer getAproveitamento(){
        return (vitorias * 100) / getTotalPartidas();
    }

    public void compararAproveitamento(Time x){
        if (getAproveitamento() > x.getAproveitamento()){
            System.out.println("O time %s tem um aproveitamento maior que o time %s".formatted(nome, x.nome));
        } else if (getAproveitamento() < x.getAproveitamento()){
            System.out.println("O time %s tem um aproveitamento maior que o time %s".formatted(nome, x.nome));
        } else {
            System.out.println("O time %s tem um mesmo aproveitamento que o time %s".formatted(nome, x.nome));
        }
    }

    public void exibirInformacoes(){
        var texto = """
                Time: %s
                Vitórias: %d
                Empates: %d
                Derrotas: %d

                Pontos: %d
                Total de Partidas: %d
                Aproveitamento: %d%%
                    """.formatted(
                nome,
                vitorias,
                empates,
                derrotas,
                getPontos(),
                getTotalPartidas(),
                getAproveitamento());

        System.out.println(texto);
    }
}
