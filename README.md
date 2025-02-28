## Projeto

Este é um projeto para realizar o desafio da plataforma DIO no Bootcamp Bradesco.

## Mermaid Diagrams

```mermaid
classDiagram
    %% Definição das interfaces
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
    }

    class AparelhoTelefonico {
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    %% Definição da classe iPhone que implementa as interfaces
    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    %% Relacionamentos de implementação
    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet
