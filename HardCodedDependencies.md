PROBLEMA:
A classe Report está acoplada diretamente à geração de relatórios em PDF, dificultando a manutenção e expansão.


SOLUÇAO:
Criar uma interface ReportGenerator e injetar a dependência, permitindo a geração de diferentes relatórios sem modificar a classe principal.
