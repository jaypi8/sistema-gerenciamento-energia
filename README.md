# sistema-gerenciamento-energia

## Sumário

- [Introdução](#introdução)
- [Objetivos](#objetivos)

## Introdução

O presente projeto busca apresentar um modelo (protótipo) de Sistemas de Gerenciamento de Energia (SGE) que tem como objetivo monitorar,otimizar e controlar o desempenho energético de determinado equipamento ou carga consumidora. SGE são utilizados por várias empresas para monitorar seus gastos de energia diários, e dado essa problemática temos como objetivo criar uma ferramenta para que um Engenheiro Eletricista responsável pelo monitoramento dessas SGEs, seja capaz de efetuar com agilidade seu trabalho além de ajudar a entregar suas demandas com maior efetividade.

O Sistema de Gerenciamento de Energia (SGE) é uma solução projetada para monitorar, controlar e otimizar o uso de energia em ambientes residenciais, comerciais e industriais. Seu objetivo principal é melhorar a eficiência energética, reduzir custos operacionais e minimizar o impacto ambiental. Para implementar essas funcionalidades de forma eficaz, propõe-se uma organização de classes no software do SGE.

A classe abstrata Equipamento representa o conceito genérico de um dispositivo elétrico, contendo atributos como potência e horas de uso. Subclasses de Equipamento, como Maquina e EquipamentoGenerico, permitem a especificação de diferentes tipos de dispositivos. Maquina lida com máquinas que necessitam de cálculos específicos, como o fator de potência, enquanto EquipamentoGenerico abrange dispositivos que não requerem cálculos detalhados.

A classe ConsumoEnergia é responsável por calcular o consumo de energia com base na potência, horas de uso e dias de utilização. Ela usa as classes Equipamento e suas subclasses para realizar cálculos precisos. Já a classe DemandaMaquinas calcula a demanda total das máquinas, utilizando a classe Maquina para obter as informações necessárias.

Por fim, a classe EficienciaSetor gerencia e calcula informações sobre um conjunto de equipamentos em um setor específico, utilizando a hierarquia de classes de Equipamento. Essa classe permite que o SGE monitore a eficiência energética de diferentes setores, identifique áreas para melhorias e implemente estratégias para reduzir o consumo de energia e os custos operacionais.

Assim, a estrutura proposta das classes permite ao SGE realizar o monitoramento detalhado, controle preciso e otimização do uso de energia, alinhando-se com os objetivos de melhorar a eficiência energética, reduzir custos e minimizar o impacto ambiental.

## Objetivos

- **Monitoramento em Tempo Real**: Fornecer dados em tempo real sobre o consumo de energia para analíse.
- **Otimização de Energia**: a partir do monitoramento, tomar ações necessárias para a otimização de energia.
- **Relatórios e Análises**: fornecer um relatório da nossa analíse para tomadas de decisões.
- **Cálculo do Fator de Potência**: Fator de potência e a relação entre *potência ativa*(conversão de energia elétrica em outras formas de energia), que é medida em (kW), e *potência reativa*(mantém campos magnéticos e é medida em quiloVolt-Ampere reativo (kVAr). para que possamos usar em nossas analíses de otimização e monitoramento,pois ao saber o fator de potência podemos ver a eficiência energética de alguma máquina se está boa, baixa ou está desperdiçando energia.

## Integrantes

- João Carlos (BackEnd).
- Carlos Daniel (FrontEnd).
- Carlos Eduardo (Tester).
- João Pedro (Documentador).


## Problema:
-Com o crescimento de uma empresa também há um crescimento em suas demandas, tais como: Funcionários, Aperfeiçoamento do serviço, Aumento de Espaço e etc. Mas também, é notável o crescimento de suas despesas sendo uma delas a de energia elétrica. Uma indústria aprensenta diversas máquinas com diferentes funcionalidades, voltagem, potências que definirá um valor final a se pagar. Pensando nisso, pensamos em desenvolver uma ´´Cálculadora Energética´´ para que um Engenheiro em uma grande indústria não precise perder muito tempo fazendo cálculos além de já imprimir um pequeno relatório de cada equipamento com possíveis melhorias para otimizar ou até mesmo para monitorar os gastos energético dos mesmo. Por isso, se fez tão essencial pensar na solução dessa problemática para que assim haja uma ferramenta ´´facilitadora´´ no processo do engenheiro ou técnico responsável.

## Possíveis Cálculos:
**Tipos de Potência**


![Captura de tela 2024-07-04 080353](https://github.com/jaypi8/sistema-gerenciamento-energia/assets/167809129/9766d4be-8ead-49a0-ae3b-03fe3089bf4b)

na imagem acima podemos ver o que é chamado "Triângulo das Potência", que é a forma geométrica da utilização das mesmas.

## Potência Aparente:
Potência Total de um circuito elétrico, instalação ou fonte de energia oferecida. Nada mais é que o somatório das potências (reativas e ativas), na imagem é a nossa hipotenusa e podemos considerar uma variável S

## Potência Ativa:
Potência ativa é o que realmente foi utilizado da energia para transformar em outras. É o aproveitamento de carga utilizada para realizar um trabalho de conversão muitas vezes em indústria em energia mecânica ou térmica. E esse mesmo tipo de potência que está presente em nossa conta de energia, e vai ser esse mesmo tipo de potência que provavelmente iremos focar mais, pois nos ajudará a ter uma noção dos gastos que nossos equipamentos está tendo. E representado pelo cateto adjacente e pode-se considerar uma variável P 

## Reativa:
Essa é oposta anterior. Ela é responsável por desenvolver o campo magnético para basear equipamentos que funcionam por indução, como transformadores e motores. Ela é representada pelo cateto oposto e sua variável Q



![Captura de tela 2024-07-04 081159](https://github.com/jaypi8/sistema-gerenciamento-energia/assets/167809129/fe050c64-6c99-45e3-b25a-48402f5352c5)

nota: De acordo com a resolução normativa N 414/201, da Agência Nacional de Energia Elétrica(ANEEL), o Fator de potência por padrão deve ter no mínimo 0,92. Caso seja inferior a isso, você estará sujeito a multas.

## Referências:
https://www.luterled.com.br/fator-de-potencia



