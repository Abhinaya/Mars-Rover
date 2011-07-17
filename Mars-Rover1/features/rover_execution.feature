
        Feature: Rover Moves from Initial to final position on getting command

        Scenario:When the rover moves within the Plateau
          Given The Initial position is "1 3 N"
          When The Command "MLR" is executed
          Then The Final position is "1 3 N"

        Scenario:When the rover moves out of Plateau
          Given The Initial position is "5 5 N"
          When The Command "MLR" is executed
          Then exception is thrown




