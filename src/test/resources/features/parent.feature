Feature: Parent Feature to call Child Feature

Scenario Outline: Call Child Feature with multiple data sets
    * def childFeature = read('classpath:features/child.feature')
    * def args = { name: '<name>', age: <age> }
    * def response = call childFeature args
    * print 'Response from Child Feature:', response    
    * match response.greeting == 'Hello, ' + '<name>' + '!'

    * def expected =
    """
    function(age){
      if(age < 13) return 'Child';
      if(age < 20) return 'Teen';
      return 'Adult';
    }
    """

    * match response.ageCategory == expected(<age>)

Examples:
| name   | age |
| Gourav | 15  |
| Anu    | 5   |
| Rajesh | 35  |
| harish | 55  |
