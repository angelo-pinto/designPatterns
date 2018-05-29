------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Padrão de Projeto Chain of Responsibility
PURPOSE OF PROJECT: Entender como funciona este padrão de projeto
VERSION or DATE: 2018-05-27
HOW TO START THIS PROJECT: Projeto desenvolvido em BlueJ (https://www.bluej.org/)
AUTHORS: Angelo Rafael Peres Pinto
USER INSTRUCTIONS:

O projeto baseia em:

Considere o desembarque de um avião, do qual temos diversas pessoas que 
irão pegar carona com outras com parentes e familiares. Cada uma das pessoas
que estão dirigindo são consideradas Motoristas, cada qual é resonsável por
dar carona a apenas uma pessoa. Formando assim a corrente de responsabilidade.
Para melhor entendimento todos os nomes dos caronas começam com a letra "C", 
enquanto que os motoristas começam com outras letras.


Utilize o Code Pad com os seguintes códigos:

/// Criandos os motoristas
Motorista andre = new Motorista("Andre");
andre.setResponsavelPor("Camila");
Motorista bruna = new Motorista("Bruna");
bruna.setResponsavelPor("Carol");
Motorista luiz = new Motorista("Luiz");
luiz.setResponsavelPor("Carlos");
Motorista rafael = new Motorista("Rafael");
rafael.setResponsavelPor("Cecilia");
Motorista felipe = new Motorista("Felipe");
felipe.setResponsavelPor("Cintia");
Motorista giovana = new Motorista("Giovana");
giovana.setResponsavelPor("Cortez");

/// Criando a fila de motoristas a medida que chegam ao aeroporto
andre.setProximoMotorista(bruna);
bruna.setProximoMotorista(luiz);
luiz.setProximoMotorista(rafael);
rafael.setProximoMotorista(felipe);
felipe.setProximoMotorista(giovana);

/// Obtendo os motoristas
andre
bruna
luiz
rafael
felipe
giovana

/// Criando os caronas(passageiros)
Carona carlos = new Carona("Carlos");
Carona claudia = new Carona("Claudia");
carlos
claudia

/// Pegando carona
andre.darCarona(carlos);
andre.darCarona(claudia);
