package com.tuychiev.headfirst.basic;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/27/21
 */
public class PhraseOMatic {
    public static void main(String[] args) {
        // make three sets of words to choose from. Add your own!
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win",
                "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric",
                "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked",
                "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
                "strategy", "mind-share", "portal", "space", "vision", "paradigm", "mission"};

        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate there random numbers
        int randOne = (int) (Math.random() * oneLength);
        int randTwo = (int) (Math.random() * twoLength);
        int randThree = (int) (Math.random() * threeLength);

        // now build a phrase
        String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];

        // print out the phrase
        System.out.println("What we need is a " + phrase);
    }
}
