Feature: Testing the functionalities

  Scenario Outline: To book the adult tickets
    Given launch the brower
    When url
    Then select source "<from>"
    Then select destination "<to>"
    Then select travellers "<seats>"
    Then click on apply

    Examples: 
      | from      | to        | seats |
      | Delhi | bangalore |     2 |
      | bangalore | goa       |     4 |
