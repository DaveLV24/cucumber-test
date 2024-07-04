@Input

Feature: Inputs

  @Input1
  Scenario Outline: Input number
    Given  I navigated to Input site
    When I add number '<number>' into the field
#    And
 # Then
    Examples:
      | number |
      | 77    |