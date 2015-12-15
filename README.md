# Exemplo de Automação de Testes de Jogos mobile na plataforma Android com a ferramenta Sikuli

Este projeto é um exemplo de automação games com Android e Sikuli. 
Neste exemplo foi utilizando o game [Angry Birds](https://play.google.com/store/apps/details?id=com.rovio.angrybirds&hl=pt_BR) que pode ser baixado na playstore.

### Ferramentas Utilizadas

* [Eclipse IDE Kepler](http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/keplerr)
* [Maven 3.1.1](https://maven.apache.org/docs/3.1.1/release-notes.html)
* [Sikuli 1.1.0](http://www.sikulix.com/)
* [Game Angry Birds](https://play.google.com/store/apps/details?id=com.rovio.angrybirds&hl=pt_BR)
* [MyPhoneExplorer 1.8.7](http://www.fjsoft.at/en/)
* Android SDK instalado e configurado
* Java 7 instalado e configurado

### Espelhando Dispositivo no Computador com MyPhoneExplorer
Este aplicativo é necessário pois o sikuli é orientado a imagem e é preciso projetar nosso dispositivo na tela do computador para executar os testes. Outra alternativa seria usar um emulador como o [Genymotion](https://www.genymotion.com/). 

* Baixe e instale no seu computador o aplicativo [MyPhoneExplorer 1.8.7](http://www.fjsoft.at/en/). 
* Conecte o dispotivo via USB no computador.
* Abre o MyPhoneExplorer, clique em File e faça conexão via USB.
* Clique em Extras > Control phone / Load screenshot. 
* Na tela do dispositivo que será projetada no computador deixe marcado a opção 'Refresh automatically'

### Executando os Testes

* Baixe e instale o [Game Angry Birds](https://play.google.com/store/apps/details?id=com.rovio.angrybirds&hl=pt_BR).
* Certifique-se que o dispositivo está visivel no monitor principal.
* Abra o projeto no Eclipse e execute-o como JUnit Test.
