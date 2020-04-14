# GRASP

* Polymorphism
* Pure Fabrication: O DAO (fora do escopo do negócio/modelo) interage com as interfaces de bancos de dados, não a entidade.
* Protected Variations: As interfaces abstraem potenciais mudanças de conexão etc.
* Indirection: O mapa não utiliza o provider diretamente, mas sim o serviço, semelhante o que fazemos com o Spring.