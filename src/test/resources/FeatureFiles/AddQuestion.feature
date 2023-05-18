Feature: validate the Quetions

  Scenario: Verify and add the Coding Question
    Given I launch the application
    Then I enter emailid "ninov23418@dufeed.com"
    Then I click on Next
    Then I enter password "Diatoz@123"
    Then I click on login button
    Then I click on Question
    Then I click on add question
    Then I click on coding
    Then I click on select and proceed
    Then I select core programming and skill-coding in Assessment
    Then I select MID level in Complexity
    Then I enter the question "Write a function to calculate the nth number in the Fibonacci sequence using memoization"
    Then I enter Program Input 1 "A single integer n where n >= 0"
    Then I enter Program Output 1 "0"
    Then I enter Sample Input 1 "1"
    Then I enter Sample Output 1 "1"
    Then I enter Hidden Input 1 "10"
    Then I enter Hidden Output 1 "55"
    Then I enter Hidden Input 2 "20"
    Then I enter Hidden Output 2 "6765"
    Then I enter Hidden Input 3 "30"
    Then I enter Hidden Output 3 "832040"
    Then I enter Hidden Input 4 "40"
    Then I enter Hidden Output 4 "102334155"
    Then I enter Hidden Input 5 "50"
    Then I enter Hidden Output 5 "12586269025"
    Then I select JavaScript-Coding in Skill
    Then I enter Code Snippet
    Then I enter Experience From "0"
    Then I enter Experience To "6"
    Then I enter Est resp time in sec "180"
    Then I enter Reference
    Then I click on Add Question Button
