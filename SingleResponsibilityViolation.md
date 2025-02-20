Problema:

Classe invoice está com mais de uma responsabilidade, ela representa invoice e ao mesmo tempo é responsável pela printInvoice e saveToDatabase, violando assim o principio SRP no qual nos diz que uma classe deve ter apenas um motivo de mudança.

Proposta:
Separar as classes em uma que so represente os dados, outra que apenas imprima e a ultima que é responsável por salvar no BD