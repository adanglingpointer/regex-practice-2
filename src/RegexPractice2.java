public class RegexPractice2 {
    public static void main(String[] args) {
        // . matches any character at all
        System.out.println("doggy".matches(".....")); // true;
        System.out.println("doggy".matches("....")); // false;
        System.out.println("doggy".matches(".+")); // true

        // ^ (karot) inside of brackets [ ] means the opposite of
        //  match anything that is NOT
        System.out.println("d".matches("[^abc]")); // true
        System.out.println("a".matches("[^abc]")); // false

        // ^ outside of brackets matches the beginning of a line
        // or string
        System.out.println("doggy".matches("^....."));  // true

        // $ matches the end of the line
        System.out.println("doggy".matches("^.....$"));  // true
        System.out.println("doggy".matches("^....$."));  // false

        // \\b matches boundary
        // area between a word and non-word character
        System.out.println("cat dog".matches("...\\s\\b..."));  // true

    }
}
