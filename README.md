# ChessJava ♟️

[![Java](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-NO-red.svg)](LICENSE)

Um jogo de xadrez completo desenvolvido em Java, com interface de linha de comando (CLI) e todas as regras oficiais implementadas.

## Funcionalidades 🐺

✔️ Movimentação de todas as peças seguindo as regras oficiais  
✔️ Captura de peças  
✔️ Cheque e cheque-mate  
✔️ Roque (grande e pequeno)  
✔️ En passant  
✔️ Promoção de peões  
✔️ Turnos alternados entre jogadores  
✔️ Sistema de captura de peças  

## Como Executar 🐕

### Pré-requisitos
- Java JDK 17 ou superior instalado
- Git (opcional, para clonar o repositório)

### Passos

1. Clone o repositório:
	```
	git clone https://github.com/LucaoCorrea/ChessJava.git
	cd ChessJava
	```


2.  Compile e execute o projeto:

	```  
	javac src/*.java -d bin/
	java -cp bin/ ChessGame
	```
## Como Jogar 🐱

-   Digite o movimento no formato  `origem destino`  (ex:  `e2 e4`)
    
-   Para roque, digite  `e1 g1`  (pequeno) ou  `e1 c1`  (grande)
    
-   Para promoção, o sistema perguntará qual peça deseja quando um peão alcançar a 8ª linha
    
-   Digite  `sair`  a qualquer momento para encerrar o jogo
    

## Estrutura do Projeto 🐯

ChessJava/
├── bin/            # Arquivos compilados
├── src/            # Código fonte
│   ├── Board.java  # Lógica do tabuleiro
│   ├── Piece.java  # Classe base das peças
│   ├── *Subclasses de Piece* # Implementações específicas de cada peça
│   └── ChessGame.java # Classe principal com loop do jogo
└── README.md       # Este arquivo

## Contribuição 🐵

Contribuições são bem-vindas! Siga estes passos:

1.  Faça um fork do projeto
    
2.  Crie uma branch com sua feature (`git checkout -b feature/nova-feature`)
    
3.  Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
    
4.  Push para a branch (`git push origin feature/nova-feature`)
    
5.  Abra um Pull Request

## Prints 🐼
![UI](https://raw.githubusercontent.com/LucaoCorrea/ChessJava/refs/heads/main/screenshots/UI.png)

![Pawn Movement](https://raw.githubusercontent.com/LucaoCorrea/ChessJava/refs/heads/main/screenshots/pawn.png)

## Licença 🦍

Este projeto tem licença livre, para afins de estudos.

## Autor 🐶

[Lucas Corrêa](https://github.com/LucaoCorrea)  - Desenvolvimento e manutenção.
