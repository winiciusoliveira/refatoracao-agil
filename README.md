# Projeto POO com Java - Pato e Pinguim

Este projeto demonstra a aplicação prática dos pilares da Programação Orientada a Objetos (POO) utilizando a linguagem Java. Desenvolvido com a metodologia ágil **Scrum**, o projeto foi estruturado para representar o comportamento de animais como **Pato** e **Pinguim**, focando em conceitos fundamentais da orientação a objetos.

## Objetivo

Representar entidades do mundo real (animais) com propriedades e comportamentos, evidenciando os pilares da OOP:

- Abstração
- Encapsulamento
- Herança
- Polimorfismo

---


## Estrutura do Código

```java

public class Main {
   	// Método principal onde instânciaremos nossos objetos
	public static void main(String[] args) {
		Pinguim pinguim = new Pinguim();
		pinguim.bicar(); // SAÍDA: Um Pinguim pode bicar
		pinguim.bico = false;
		pinguim.bicar(); // SAÍDA: Um Pinguim não pode bicar
	}
	
	public static class Pinguim {
		// Propriedades ou atributos do objeto Pinguim
		Boolean asas = true;
		Boolean bico = true;
		Boolean penas = true;
		
		// Métodos do objeto Pinguim
		public void bicar() {
			if(bico.equals(true)) {
				System.out.println("Um Pinguim pode bicar");
			} else {
				System.out.println("Um Pinguim não pode bicar");
			}
		}
		
		public void nadar() {
		//Ação ...
		}
	}

	public static class Pato {	
		// Propriedades ou atributos do objeto Pato
		Boolean asas = true;
		Boolean bico = true;
		Boolean penas = true;
	
		// Métodos do objeto Pato
		public void bicar() {
		//Ação ...
		}
		
		public void nadar() {
		//Ação ...
		}
	
		public void voar() {
		//Ação ...
		}
	}
}

````

## Pilares Aplicados

| Pilar              | Aplicação                                                                                                                          |
| ------------------ | ---------------------------------------------------------------------------------------------------------------------------------- |
| **Abstração**      | Criação das classes `Pato` e `Pinguim`, representando entidades reais com atributos e comportamentos.                              |
| **Encapsulamento** | Atributos são representados dentro das classes, manipulados por meio de métodos como `bicar()`.                                    |
| **Herança**        | Embora não esteja ainda implementada, a estrutura sugere que as classes podem herdar de uma classe comum como `Ave`.               |
| **Polimorfismo**   | O método `bicar()` pode se comportar de maneira diferente dependendo do valor de `bico`, evidenciando polimorfismo comportamental. |

---

## Metodologia SCRUM

Durante o desenvolvimento do projeto:

* Foram seguidos sprints curtos para análise, implementação e testes.
* Pair programming e revisões foram utilizados para consolidar o aprendizado.
