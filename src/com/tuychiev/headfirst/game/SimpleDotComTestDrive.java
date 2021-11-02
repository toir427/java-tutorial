package com.tuychiev.headfirst.game;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 11/2/21
 */
class SimpleDotCom {

    private int[] locationCells;
    private int numOfHits=0;

    public void setLocationCells(int[] locations) {
        locationCells = locations;
    }

    public String checkYourself(String userGuess) {
        // Convert the String to an int
        int guess = Integer.parseInt(userGuess);
        // make a variable to hold the result we'll
        // return. put "miss" in as the default
        // (i.e. we assume a "miss")
        String result = "miss";

        // repeat with each call in the locationCells
        // array (each cell location of the object)
        for (int cell : locationCells) {
            // compare the user guess to this
            // element (cell) in the array
            if (guess == cell) {
                // we got a hit!
                result = "hit";
                numOfHits++;
                // get out of the loop,
                // no need to test the other cells
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            // we're out of the loop,
            // but let's see if we're now "dead" (hit 3 times)
            // and change the result String to "kill"
            result = "kill";
        }

        // display the result for the user
        // ("Miss", unless it was changed to "Hit" or "Kill")
        System.out.println(result);
        // return the result back to the calling method
        return result;
    }
}

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        // instantaite a SimpleDotCom object
        SimpleDotCom dot = new SimpleDotCom();

        // make an int array for the location of the dot
        // com (3 consecutive ints out of a possible 7).
        int[] locations = {2, 3, 4};

        // invoke the setter method on the dot com.
        dot.setLocationCells(locations);

        // make a fake user guess
        String userGuess = "2";

        // invoke the checkYourself() method on the dot com
        // object and pass it the fake guess
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";

        if (result.equals("hit")) {
            // if the fake guess (2) gives back a "hit", it's working
            testResult = "passed";
        }

        // print out the test result (pass or failed)
        System.out.println(testResult);
    }
}
