Problema:

a classe DiscountCalculator precisa ser alterada para cada cliente novo, viola o principio da OCP que fiz que uma classe deve estar aberta para extensão e fechada para modificações

Proposta de melhoria:

utilizar o polimorfismo criando uma nova classe de desconto que permita diferentes estratégias sem modificar a classe DiscountCalculator