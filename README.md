# Desafio Capgemini 02

<p align="center">
  <img width="300" height="100" src="https://user-images.githubusercontent.com/48846333/156939704-94c554aa-4be0-487f-a8cc-58292876ecd0.png">
</p>
Repositório criado para versionamento, compartilhamento e documentação das soluções ao segundo desafio de programação da Capgemini.

## :hammer: Tecnologias e ferramentas utilizadas
  * Java Development Kit 17 (JDK);
  * Apache NetBeans IDE 12.6;
  * JUnit 4.13.2 (dentro do projeto);

<br>

## :floppy_disk: Código Fonte do Projeto
O presente projeto possui código fonte aberto, e está disponível em repositório público nesse GitHub.
O download do projeto para a máquina local pode ser realizado de duas formas distintas: 
1. Na página do repositório, clicando-se no botão verde 'Code', e selecionando a opção 'Download Zip';
2. Pelo git, utilizando-se o comando:
```
git clone https://github.com/eruzvinicius/DesafioCapgemini-02.git
```

Após instaladas as ferramentas e tecnologias utilizadas, selecionar a IDE de preferência (IntelliJ, Eclipse, NetBeans, etc.) e abrir o projeto.

<br>

## :books: Estrutura do Código
O código está organizado em dois pacotes principais, sendo eles:


### 1. src/br/com/desafio/model;
No primeiro pacote podem ser encontrados seis arquivos de extensão '.java', e eles correspondem às soluções dos exercícios.
Cada exercício possui duas soluções distintas, uma com valores pré-definidos e alterados diretamente no código em questão.
Já nos arquivos 'ExercicioXX_Interativo', são solicitadas entradas de dados ao usuário, para informar parâmetros utilizados nos algoritmos.

### 2. teste/br/com/desafio/model;
No segundo pacote, encontram-se as classes utilizadas para os testes unitários, um para cada exercício. Nesse projeto, foi utilizado o framework JUnit.
Nesses testes, foram definidos comportamentos esperados de métodos individuais do código, para validação do seu correto funcionamento.
Testes adicionais podem ser realizados alterando-se os parâmetros dos testes.

<br>

## :arrows_clockwise: Execução de Código
Para rodar os códigos de ambos os pacotes, basta compilar cada um dos exercícios separadamente, uma vez que cada um deles possui um método principal.
Nos casos de classes normais, o resultado será exibido no console. Caso seja um exercício interativo, a entrada e saída de dados ocorre pelo console também.
Para os testes unitários, após a compilação, deve surgir uma GUI com o resultado dos testes.

<br>

## :page_facing_up: Exercícios
 
## Exercício 01
A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.

### Exemplo
  #### Entrada
```
arr = [9, 2, 1, 4, 6]
```
  #### Saída
```
4
```
<br>

## Exercício 02
Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.

### Exemplo
  #### Entrada
```
n = [1, 5, 3, 4, 2]
```
  #### Saída
```
3
```
  #### Explicação:
Existem 3 pares de inteiros no vetor com uma diferença de 2: [5, 3], [4, 2] e [3, 1].

<br>

## Exercício 03
Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:

* sqrt(T) <= linha <= coluna <= sqrt(T)
* Considere T, como o tamanho do texto.
* Se certifique de que linhas x colunas >= T. 
* Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.

Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.

### Exemplo 01
  #### Entrada
```
s= tenha um bom dia
```
  #### Saída
```
taoa eum nmd hbi
```
  #### Explicação
Depois de remover os espaços, a string tem 13 caracteres.
sqrt(13) está entre 3 e 4, então a string é rescrita na forma de um grid com 4 linhas e 4 colunas:

```
tenh
aumb
omdi
a
```
O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto.
A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.

### Exemplo 02
  #### Entrada
```
s = ola mundo
```
  #### Saída
```
omd luo an
```
  #### Explicação
Depois de remover os espaços a string tem 8 caracteres.
sqrt(8) está entre 2 e 3, então a string é reescrita na forma de um grid com 3 linhas e 3 colunas:
```
ola
mun
do
```
