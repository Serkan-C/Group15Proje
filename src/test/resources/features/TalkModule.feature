@wip
Feature: Talk Module

  Background:
    Given the user is logged in
    Given the user navigate the Talk Module and click

    Scenario Outline:
      When user click the Plus icon
      And user enter a conversation "cydeo2" and click  add participant
      Then user add user from list and click Create conversation Button
      Then user created  "cydeo2" conversation and is on this conversation page

