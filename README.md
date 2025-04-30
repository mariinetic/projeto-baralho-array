# 🃏 Baralho com Array em Java

Este repositório contém um projeto desenvolvido para praticar os conceitos de **Programação Orientada a Objetos (POO)**  na linguagem **Java**, por meio da implementação de um baralho de cartas.

O projeto foi desenvolvido como parte dos estudos da disciplina de **Linguagem de Programação II**, com foco na fixação de conteúdo sobre criação de classes, uso de arrays, métodos e manipulação de objetos.

---

## 📝 Enunciado do Exercício

> Crie a classe `Carta`, que possui um **nome** e um **naipe**.  
> Crie os métodos **GET** e **SET** para os atributos.  
> 
> Crie agora uma classe `Baralho`, que possui **52 cartas**, além de **4 coringas**.  
> No construtor da classe `Baralho`, inicialize todas as 52 cartas mais os coringas (que devem se chamar `"coringa"` e ter o naipe `"coringa"`).
>
> Implemente os seguintes métodos na classe `Baralho`:
>
> - `embaralhar()`: deve misturar as cartas do baralho trocando posições aleatórias (utilize `Math.random()` para isso).
> - `distribuirCarta()`: devolve uma carta retirada do topo do baralho, se ainda houver cartas; caso contrário, retorna `null`.
> - `hasCarta()`: retorna `true` se ainda houver cartas disponíveis, ou `false` caso contrário.
> - `imprimirBaralho()`: imprime todas as cartas do baralho no estado atual (ordenado ou embaralhado).
>
> A classe `Baralho`, assim construída, será útil para programar diversos jogos de cartas, através de novas classes que os implementem.

---

## ✅ Funcionalidades Implementadas

- Criação de um baralho com 52 cartas + 4 coringas
- Embaralhamento aleatório das cartas
- Distribuição de cartas do topo
- Verificação de cartas restantes
- Impressão das cartas atuais no baralho
