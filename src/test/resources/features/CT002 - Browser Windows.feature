@2
Feature: Preenchimento e envio do formulário de prática

  Scenario: Preencher e submeter o formulário de prática
    Given que estou na página inicial do site DemoQA
    And escolho a opção alerts, frames e windowns
    And navego até o submenu Browser Windows
    And seleciono new Windows
    When verifico se foi aberta uma nova janela
    And valido a mensagem
    Then fecho a nova janela