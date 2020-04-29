@Web
Feature: Search Bulbapedia
  Scenario: Search pokemon about A on wikipedia
    Given User open Bulbapedia home page
    When User input search "Pikachu" on home page
    Then User see pokemonName "Pikachu" on article page
    And User see pokemonNumber "#025" on article page

