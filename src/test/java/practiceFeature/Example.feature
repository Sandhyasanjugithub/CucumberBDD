Feature: Test makemytrip functionality

  Scenario Outline: test the makemytrip destinations
    Given launch the browser
    When get url
    Then enter the src "<starting_points>"
    Then enter the dst "<destination_points>"
    Then enter the seats "<seats>"

    Examples: 
      | starting_points | destination_points | seats |
      | mumbai          | chennai            |     2 |
      | bangalore       | hyderabad          |     2 |
      | hyderabad       | chennai            |     4 |
