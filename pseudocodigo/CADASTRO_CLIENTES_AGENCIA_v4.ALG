                               Algoritmo "CADASTRO_CLIENTES_AGENCIA"

// Recode Pro 2023 [Linguagem e L�gica de Programa��o]
// Projeto Individual
// Autor    : Guilherme Baptista de Oliveira

//Usando conceitos de programa��o estruturada (Vetor), criar em pseudoc�digo
//um menu para simular um cadastro para uma ag�ncia de viagens com as
//seguintes fun��es: cadastro de cliente e cadastro de destino, criar tamb�m
// uma consulta para cada estrutura de dados.

Var
   nome: vetor[1..4] de caracter
   email: vetor[1..4] de caracter
   destino: vetor[1..4] de caracter
   i,opcao:inteiro


Inicio

repita

   escreval(" _________AGENCIA KAIOKEN_________ ")
   escreval("|                                 |")
   escreval("|       ESCOLHA UMA OP��O         |")
   escreval("|   1. CADASTRO DE VIAJANTES      |")
   escreval("|   2. CONSULTA                   |")
   escreval("|   3. SAIR                       |")
   escreval("|                                 |")
   escreval("|_________RECODE PRO 2023_________|")

   leia(opcao)
   escolha opcao

   caso 1

   para i de 1 ate 4 faca

      escreval("***************************************")
      escreval("* Bem vindo viajante, digite seu nome *")
      escreval("***************************************")
      escreval("")
      leia(nome[i])

      escreval("***************************************")
      escreval("* Digite seu e-mail *")
      escreval("***************************************")
      escreval("")
      leia(email[i])

      escreval("")
      escreval("***********************")
      escreval("* Digite seu destino: *")
      escreval("***********************")
      escreval("")
      leia(destino[i])

      i <- i+1

      limpatela

   fimpara

   caso 2


   para i de 1 ate 4 faca

   escreval("***************************")
   escreval("* Viajante " ,nome[i])
   escreval("* E-mail ", email[i])
   escreval("* Destino " ,destino[i])
   escreval("***************************")

   fimpara

   caso 3

   escreval("Fim da execu��o do programa")
   interrompa

   outrocaso
   escreva("Op��o Inv�lida")


   fimescolha

   ate opcao = 4


Fimalgoritmo