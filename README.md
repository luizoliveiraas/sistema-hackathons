# Sistema de Gerenciamento de Hackathons Universitários

Este projeto foi desenvolvido para a disciplina de Programação Orientada a Objetos. O objetivo é simular a organização de um hackathon universitário, permitindo cadastrar equipes, projetos, bancas avaliadoras e calcular as notas dos projetos apresentados.

## Sobre o projeto

O sistema permite:
- Criar universidades, empresas, estudantes, profissionais e jurados.
- Formar equipes de alunos.
- Cadastrar projetos para cada equipe.
- Montar bancas avaliadoras para os projetos.
- Realizar apresentações e calcular a média das notas dadas pelos jurados.
- Listar os projetos aprovados (nota final maior ou igual a 7).

Tudo é feito em memória, sem uso de banco de dados ou interface gráfica. O foco é praticar conceitos de orientação a objetos, como herança, composição, encapsulamento e o padrão Singleton para as coleções de equipes e apresentações.

## Como rodar

1. Entre na pasta do projeto:
   ```
   cd "Sistema Hackathons /hackathon"
   ```
2. Compile todos os arquivos Java:
   ```
   javac *.java
   ```
3. Execute o programa principal:
   ```
   java hackathon.HackathonManager
   ```

A saída será a lista dos projetos aprovados, de acordo com as notas das bancas.

## Observações
- O projeto foi feito individualmente.
- Não utilizei bibliotecas externas, só Java padrão.
- Qualquer dúvida, sugestão ou crítica é bem-vinda!

---
Luiz Gustavo 