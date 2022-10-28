// You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
// If it is a square, return its area. If it is a rectangle, return its perimeter.

// Example(Input1, Input2 --> Output):

// 6, 10 --> 32
// 3, 3 --> 9

// My solution
public class Solution {
    public static int areaOrPerimeter (int l, int w) {
        // code away...
    return (l==w)?l*w:2*(l+w);
    }
}