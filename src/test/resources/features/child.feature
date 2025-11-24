Feature: This take name and age and return greeting and age category

Scenario: Process input and return response
    * def name = __arg.name
    * def age = __arg.age
    * def greeting = 'Hello, ' + name + '!'
    * def ageCategory = age < 13 ? 'Child' : age < 20 ? 'Teen' : 'Adult'
    * def response = { greeting: greeting, ageCategory: ageCategory }
    * def result = response
    * karate.set('result', result)
