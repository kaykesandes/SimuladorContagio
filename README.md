# Projeto Simulador Contaminação e Recuperação

Este projeto é uma simulação de contaminação e recuperação de uma população. O projeto é gerenciado pelo Maven e inclui todas as dependências e plugins necessários para compilar e executar o código.

## Estrutura do Projeto

```plaintext
ATVJAVA/
  ├── pom.xml
  └── src/
      └── main/
          └── java/
              ├── Main.java
              ├── Pessoa.java
              ├── Simulacao.java
              └── Vetor.jav
```

## Dependências e Plugins

O projeto utiliza as seguintes dependências e plugins:

### Maven Compiler Plugin

- **Plugin**: `maven-compiler-plugin`
- **Versão**: `3.8.1`
- **Descrição**: Este plugin é usado para compilar o código fonte Java.
- **Configuração**:
  ```xml
  <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <version>3.8.1</version>
      <configuration>
          <source>1.8</source>
          <target>1.8</target>
      </configuration>
  </plugin>
  ```

### Maven Jar Plugin
- **Plugin:** `maven-jar-plugin`
- **Versão:** `3.1.0`
- **Descrição:**  Este plugin é usado para empacotar o código compilado em um arquivo `.jar` executável.
- **Configuração: **
    ```xml
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
          <version>3.1.0</version>
            <configuration>
              <archive>
                  <manifest>
                      <mainClass>Main</mainClass>
                  </manifest>
              </archive>
          </configuration>
      </plugin>
    ```

### Como Compilar e Executar

Pré-requisitos
  - **Java Development Kit (JDK):** Versão 1.8 ou superior.
  - **Apache Maven:** Versão 3.6.0 ou superior.

#### Passos para Compilar e Executar
  1. Clone o Repositório:
  ```bash
    git clone <URL_DO_REPOSITORIO>
    cd ATVJAVA
  ```

  2. **Compile o Projeto:**
  ```bash
    mvn clean compile
  ```

  3. **Empacote o Projeto em um Arquivo**`.jar`**:**
  ```bash
    mvn packege
  ```
  Isso gerará um arquivo `ATVJAVA-1.0-SNAPSHOT.jar` na pasta `target`.]

  4. **Execute o Arquivo**`.jar`**:**
  ```bash
    java -jar target/ATVJAVA-1.0-SNAPSHOT.jar <tamanho> <taxaInfeccao> <taxaRecuperacao>
  ```
  Por exemplo: 
  ```bash
    java -jar target/ATVJAVA-1.0-SNAPSHOT.jar 100 0.8 0.9
  ```
  Onde:
    - `<tamanho>`: Número de pessoas na simulação.
    - `<taxaInfeccao>`: Taxa de infecção (por exemplo, 0,8 para 80%).
    - `<taxaRecuperação>`: Taxa de recuperação (por exemplo, 0,9 para 90%).  

### Estrutura do Código

  #### Main.java
    A classe principal que inicia a simulação com os parâmetros fornecidos pela linha de comando.

  #### Pessoa.java
    Define a classe Pessoa com atributos de saúde e recuperação.

  #### Simulacao.java
    Contém a lógica de contaminação e recuperação da população.

  #### Vetor.java
    Gerencia o vetor de pessoas e imprime o estado atual da população.
## Contato

  Para mais informações, entre em contato com:
    - [kaykegy@proton.me](mailto:kaykegy@proton.me)
    - [guilherme.24122004@gmail.com](mailto:guilherme.24122004@gmail.com)


