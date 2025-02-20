Problema:
A dependência da classe engine e da classe car, viola o principio OCP(aberto fechado), pois a classe deveria estar aberta para extensão e fechada para modificação


Proposta:
Aplicar inversão de dependência e criar uma interface que a classe car dependerá desta nova classe e não depender da classe concreta engine