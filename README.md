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

## Os benefícios de um alto fator de potência
Um alto fator de potência traz diversos benefícios para a indústria. Primeiramente, o consumo de energia é otimizado, o que resulta em economia de custos. Com um alto fator de potência, a energia é utilizada de forma mais eficiente, evitando as penalizações tarifárias impostas por baixo fator de potência.

Além disso, um alto fator de potência melhora a eficiência do sistema elétrico como um todo. O desperdício de energia é reduzido, aumentando a vida útil dos equipamentos e evitando gastos desnecessários com manutenção e substituição de equipamentos danificados. Isso resulta em maior confiabilidade e disponibilidade dos equipamentos elétricos.

Outro benefício é a melhoria na qualidade da energia fornecida. Com um alto fator de potência, a rede elétrica opera com maior estabilidade, reduzindo as flutuações de tensão e corrente e evitando distorções e interferências. Isso proporciona um ambiente elétrico mais seguro e estável para os equipamentos da indústria.

## Os problemas causados por um baixo fator de potência
Um baixo fator de potência pode acarretar diversos problemas para a indústria. Primeiramente, os custos de energia elétrica podem aumentar significativamente devido às penalizações tarifárias impostas pelos fornecedores de energia. Isso pode impactar negativamente a viabilidade econômica das empresas.

Além disso, um baixo fator de potência resulta em desperdício de energia, o que leva a um aumento na demanda de energia. Isso pode sobrecarregar a rede elétrica, provocando quedas de tensão, aumento das perdas de energia e até mesmo a interrupção do fornecimento de energia.

Outro problema é a redução da eficiência do sistema elétrico e o aumento da carga nos equipamentos. Um baixo fator de potência gera correntes mais altas para fornecer a mesma potência real, o que pode causar superaquecimento e danos aos equipamentos. Isso leva a gastos adicionais com manutenção e reparos, além de aumentar a probabilidade de falhas e interrupções na produção.

## Como melhorar o fator de potência
Felizmente, existem várias medidas que podem ser adotadas para melhorar o fator de potência na indústria. A seguir, colocamos algumas das principais estratégias:

Instalação de capacitores: os capacitores são dispositivos que armazenam energia e ajudam a compensar a energia reativa, melhorando o fator de potência. A instalação de capacitores em paralelo com a carga pode reduzir a quantidade de energia reativa demandada pela instalação.

Correção do fator de potência: através da avaliação do sistema elétrico e identificação de equipamentos ou circuitos que estejam causando um baixo fator de potência, é possível tomar medidas corretivas para melhorar a eficiência energética.

Treinamento e conscientização dos colaboradores: educar os colaboradores da indústria sobre a importância do fator de potência e como utilizá-lo de forma eficiente pode ajudar a promover uma cultura de eficiência energética na empresa.

Monitoramento constante: implementar sistemas de monitoramento e medição do fator de potência para identificar variações e possíveis problemas, permitindo uma ação rápida e eficaz para corrigir qualquer desvio.


Nossa base de dados para o engenheiro colocar os dados de entrada e realizar a análise em relação à eficiência do sistema de energia.


Um engenheiro pode usar o fator de potência em um sistema de gerenciamento para otimizar os gastos e melhorar a eficiência da energia através das seguintes estratégias:

1. Monitoramento Contínuo do Fator de Potência
Implementação de Sistemas de Medição e Monitoramento:

Instalar medidores de energia que monitoram continuamente o fator de potência.
Utilizar sistemas SCADA (Supervisory Control and Data Acquisition) para coletar e analisar dados em tempo real.
Análise de Dados:

Identificar padrões de consumo e momentos de baixa eficiência.
Detectar equipamentos ou processos que estão contribuindo para um fator de potência baixo.


2. Correção do Fator de Potência
Instalação de Bancos de Capacitores:

Capacitores são usados para fornecer potência reativa localmente, compensando a potência reativa indutiva gerada por motores e transformadores.
Ajustar os bancos de capacitores para operar automaticamente conforme a demanda de energia varia ao longo do dia.
Uso de Filtros Ativos:

Implementar filtros ativos de potência que podem ajustar dinamicamente a correção do fator de potência e também filtrar harmônicas.


3. Otimização do Uso de Equipamentos
Manutenção Preventiva:

Realizar manutenção regular em motores e transformadores para garantir que estão operando de forma eficiente.
Substituir ou reparar equipamentos que contribuem para um fator de potência baixo.
Eficiência Energética em Motores:

Utilizar motores de alta eficiência com menor consumo de potência reativa.
Implementar controladores de velocidade variável (VFDs) para ajustar a velocidade dos motores conforme a necessidade.


4. Gestão da Demanda
Ajuste de Carga:

Programar a operação de equipamentos de alto consumo de energia durante períodos de baixa demanda para evitar picos que afetam o fator de potência.
Distribuir a carga de forma mais uniforme ao longo do dia.
Contratos de Energia:

Negociar contratos de energia com as concessionárias que ofereçam incentivos para manutenção de um fator de potência elevado.
Monitorar e ajustar a operação para evitar penalidades relacionadas a um fator de potência baixo.


## Benefícios da Otimização do Fator de Potência
Redução de Custos Energéticos:

Redução das perdas de energia e aumento da eficiência, resultando em menores contas de energia.
Evitar penalidades impostas pelas concessionárias de energia por baixo fator de potência.
Melhoria da Capacidade do Sistema:

Melhor uso da capacidade instalada, permitindo a adição de novas cargas sem a necessidade de grandes investimentos em infraestrutura.
Aumento da Vida Útil dos Equipamentos:

Redução do aquecimento excessivo e das falhas nos equipamentos, aumentando sua vida útil e diminuindo custos de manutenção e substituição.
Sustentabilidade:

Contribuir para a redução da pegada de carbono ao utilizar a energia de maneira mais eficiente e reduzir as perdas no sistema elétrico.
Implementar e gerenciar o fator de potência de forma eficaz pode resultar em economias significativas, melhoria da eficiência operacional e sustentabilidade energética.


Para mostrar dados reais de antes e depois da implementação de correção do fator de potência, precisamos considerar um exemplo típico em uma instalação industrial ou comercial. Vamos examinar um cenário hipotético onde uma fábrica implementou a correção do fator de potência.

Cenário Hipotético:
Antes da Correção do Fator de Potência:
Potência ativa (P): 500 kW
Potência reativa (Q): 300 kVAR
Potência aparente (S): raiz de (P^2 + Q^2).

S = raiz de (500^2 + 300^2) ≈ 583.1kVa

Fator de Potência (FP):
Fp = P/S
Fp = 500/583.1 = 0.86

Depois da Correção do Fator de Potência:
Supondo que a instalação de capacitores corrigiu o fator de potência para 0.95.

Potência ativa (P): 500 kW (permanece a mesma)
Novo Fator de Potência (FP): 0.95

Nova Potência aparente (S):
S = 500/0.95 = 526.3 kVa 
​
Nova Potência reativa (Q):
Q = raiz de (526.3^2 - 500^2) ≈ 161,2 kVAR

Comparação:
Antes da Correção:

Potência ativa: 500 kW

Potência reativa: 300 kVAR

Potência aparente: 583.1 kVA

Fator de Potência: 0.86

Depois da Correção:

Potência ativa: 500 kW

Potência reativa: 161.2 kVAR

Potência aparente: 526.3 kVA

Fator de Potência: 0.95

Benefícios Obtidos:

Redução na Potência Aparente (kVA):

Antes: 583.1 kVA

Depois: 526.3 kVA

Redução de 56.8 kVA

Redução na Potência Reativa (kVAR):

Antes: 300 kVAR

Depois: 161.2 kVAR

Redução de 138.8 kVAR

Possíveis Economias Financeiras:

Redução de multas por baixo fator de potência.
Menores perdas de energia em cabos e transformadores.
Maior capacidade disponível em sistemas de distribuição.

## Referências:
https://www.luterled.com.br/fator-de-potencia

Livro Instalações Elétricas Industriais, 10ª Edição 2023, De João Mamede Filho.


