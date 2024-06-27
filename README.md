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

## Integrantes

- João Carlos (BackEnd).
- Carlos Daniel (FrontEnd).
- Carlos Eduardo (Tester).
- João Pedro (Documentador).


## Problema:
-Com o crescimento de uma empresa também há um crescimento em suas demandas, tais como: Funcionários, Aperfeiçoamento do serviço, Aumento de Espaço e etc. Mas também, é notável o crescimento de suas despesas sendo uma delas a de energia elétrica. Uma indústria aprensenta diversas máquinas com diferentes funcionalidades, voltagem, potências que definirá um valor final a se pagar. Pensando nisso, pensamos em desenvolver uma ´´Cálculadora Enérgitica´´ para que um Engenheiro em uma grande indústria não precise perder muito tempo fazendo cálculos além de já imprimir um pequeno relatório de cada equipamento com possíveis melhorias para otimizar ou até mesmo para monitorar os gastos energético dos mesmo. Por isso, se fez tão essencial pensar na solução dessa problemática para que assim haja uma ferramenta ´´facilitadora´´ no processo do engenheiro ou técnico responsável.







