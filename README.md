![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)

<h1 aligh="center"> API vendas com Spring Boot e MySql <h2>
<strong>Ponto de vendas com Java 17</strong>

Para baixar o projeto:

```
https://github.com/Rodrigodante11/Ponto_Venda_Java_Web_Spring.git
```

Dependencias do projeto
- Spring Boot DevTools
- Lombok
- Spring Web
- Spring Data JPA
- Mysql Driver
- I/O Validation

### :mag_right: Descricao de algumas Dependencias Usadas:
- Lombok = Atraves do Lombok foi possivel subistituir os Métodos getters and setters das classes do projeto apenas com uma annotation acima da classe (@Getter & @Setter)


### :mag_right: Descricao de annotation Usadas:

```
    import lombok.AllArgsConstructor;
    import lombok.NoArgsConstructor;
    import lombok.Data;
```
    
- @AllArgsConstructor: Obriga a passar todos os atributos ao instanciar o objeto (Atravez da dependecia Lombok
- @NoArgsConstructor: Nao precisa a passar todos os atributos ao instanciar o objeto (Atravez da dependecia Lombok
- Os dois Acima usados ao mesmo tempo deixa Opcional a passagem dos atributos ao instanciar um objeto

</br>

- @Getter & @Setter: Subistituir os Métodos getters and setters das classes do projeto apenas com essas annotation acima da classe
- @Date: Equivale ao @Getter, @Setter, @RequiredArgsConstructor, @ToString e @EqualsAndHashCode

</br>

```
  import jakarta.persistence.Table;
  import jakarta.persistence.Entity;
  import jakarta.persistence.Id;
  import jakarta.persistence.GeneratedValue;
  import jakarta.persistence.GenerationType;
  import jakarta.persistence.Column;
``` 
- @Table(name = "nomeTabela") : definindo para a entidade o nome que a classe tera na tabela
- @Entity: Essa anotação  é utilizada para informar que uma classe também é uma entidade. A partir disso, a JPA estabelecerá a ligação entre a entidade e uma tabela de mesmo nome no banco de dados, onde os dados de objetos desse tipo poderão ser persistidos.
- @Id: Definindo com atributo sera o ID da tabela
- @GeneratedValue(strategy = GenerationType.IDENTITY) : Definindo que o ID sera autoincremento
- @Column(length = 100, nullable = false) : Serve para definir tamanho , nome , pode ser nulo ou nao e etc de uma coluna da Tabela


