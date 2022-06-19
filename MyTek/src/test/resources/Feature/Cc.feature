Feature: Cc.feature
  I want to use this template for my feature file

  Scenario Outline: Tester la creation de compte
    Given Navigateur et page
    And Utilisateur dans la page de creation
    When je_tape <prenom> and <nom> and <Email> and <MDP> and <Confirmation_MDP>
    And je clique sur creer un compte
    Then page d_acceuil ouverte

    Examples: 
  | prenom | nom       | Email                                 | MDP        | Confirmation_MDP |
  | Ahmed  | Ben dhaya | ahmed-baha-eddine.ben-dhaya@gmail.com | 22080023Ah | 22080023Ah       |
