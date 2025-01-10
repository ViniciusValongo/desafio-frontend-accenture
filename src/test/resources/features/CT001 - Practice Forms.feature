@1
Feature: Preenchimento e envio do formulário de prática

  Scenario: Preencher e submeter o formulário de prática
    Given que estou na página inicial do site DemoQA
    When eu navego até o submenu Practice Form em Forms
    And preencho o formulário com valores aleatórios e faço o upload de um arquivo
    And submeto o formulário
    Then um popup é exibido após o envio
    And fecho o popup