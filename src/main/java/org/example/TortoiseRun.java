package org.example;

/*
Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour. Young B knows she runs faster than A, and furthermore has not finished her cabbage.

When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour. How long will it take B to catch A?

More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and a lead g (integer > 0) how long will it take B to catch A?

The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.

If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++, C, Go, Nim, Pascal, COBOL, Erlang, [-1, -1, -1] for Perl,[] for Kotlin or "-1 -1 -1" for others.

Examples:
(form of the result depends on the language)

race(720, 850, 70) => [0, 32, 18] or "0 32 18"
race(80, 91, 37)   => [3, 21, 49] or "3 21 49"
Note:
See other examples in "Your test cases".

In Fortran - as in any other language - the returned string is not permitted to contain any redundant trailing whitespace: you can use dynamically allocated character strings.

** Hints for people who don't know how to convert to hours, minutes, seconds:

Tortoises don't care about fractions of seconds
Think of calculation by hand using only integers (in your code use or simulate integer division)
or Google: "convert decimal time to hours minutes seconds"
 */

public class TortoiseRun {

    public int[] time(int speedA, int speedB, int advantage){

        if(speedA>=speedB){
            return new int[]{-1,-1,-1};
        }
        double finalTiming = (double) advantage/(speedB - speedA);

        int[] arrayTiming = new int[3];
        arrayTiming[0]=(int)finalTiming;
        double decimals=finalTiming - arrayTiming[0];
        double minutes=decimals*60;
        arrayTiming[1]=(int)minutes;
        double minutesDecimals=minutes-arrayTiming[1];
        double seconds=minutesDecimals*60;
        arrayTiming[2]=(int)seconds;

        return arrayTiming;
    }
}
