# Abstract Factory

## Intenção
- *Fornecer uma interface para criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.*


## Sobre o Abstract Factory
- Utilizado para garantir que uma família de produtos relacionados ou dependentes trabalhem sempre juntos. 

- Necessita de uma interface em omum para todos os produtos finais. Todos os produtos devem serguir a mesma interface. 

---

## Aplicabilidade
- O sistema deve ser independente de como seus produtos são criados, compostos ou representados. 
- O sistema é configurado como uma entre várias famílias de produtos. 
- Uma família de objetos-produto é projetada para ser usada em conjunto. 
- Deseja-se expor apenas as interfaces dos produtos, ocultando suas implementações concretas. 


## Implementação
1. **Criar uma interface em comum para todas as factories concretas:** essa interface define métodos que retornam famílias de produtos diferentes em um nível mais abstrato. Esses produtos podem colaborar entre si caso necessário. Esses métodos devem ser implementados por todas as fábricas concretas. 
2. **Crie fábricas concretas:** essas fábricas implementam os métodos da fábrica abstrata e retornam os produtos concretos. A assinatura dos métodos nas fábricas concretas retornam a mesma família da fábrica abstrata, porém o retorno são produtos concretos que implementam a interface da família abstrata, porém o retorno são produtos concretos que implementam a interface da família de produtos retornados pela fábrica abstrata. 
3. **Criar interfaces correspondentes para cada família de produto:** essas interfaces definem os tipos dos objetos a serem retornados pela fábrica abstrata. Essas interfaces são os retornos dos métodos fábrica na fábrica abstrata.
4. **Criar os produtos concretos:** Crie os produtos concretos que implementam as interfaces de produtos. Note que os produtos de interfaces diferentes podem colaborar entre si por composição. Esses produtos são os retornos dos métodos fábrica nas fábricas concretas. 

## Consequências

O que é bom ou ruim no Abstract Factory:

**Bom:**
- Os produtos sempre serão compatíveis entre si
- Aplicação clara do Open/Closed Principle, é fácil adicionar novas fábricas e produtos
- Aplicação clara do Single Responsibility Principle, o código que cria está separado do código que usa os objetos

**Ruim:**
- Muitas classes e maior complexidade será introduzida no código