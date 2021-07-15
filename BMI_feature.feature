
Feature: BMI Calculator

  Scenario Outline: Calculate  with different data
    Given I am in BMI calculator page
    When I enter <age>  and <gender> in BMI calculator
    And I enter <height> and <weight> in  the BMI calculator
    Then I see the result <expected_result>
    Then close the browser
    Examples:
    |age|gender|height|weight|expected_result|
    |"20" |"male"  |"180"   |"60"    |"BMI = 18.5 kg/m2"|
    |"35" |"female"|"160"   |   "55"     |"BMI = 21.5 kg/m2"     |
    |"50" |"male"   | "175"   |"65"       |"BMI = 21.2 kg/m2"     |
    |"45" |"female" |"150"    |"52"       |"BMI = 23.1 kg/m2"     |






