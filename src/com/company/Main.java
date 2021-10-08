package com.company;
/** My solution for a challenge on regular expression
 * @author Felix Ogbonnaya
 * @since 2020-03-02
 */
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);


        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";
        String regEx = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regEx));
        System.out.println(challenge2.matches(regEx));
        String challenge3 = "Replace all blanks with underscores.";

        System.out.println(challenge3.replaceAll("\\s", "_"));

        String challenge4 = "aaabccccccccdddefffg";
        System.out.println(challenge4.matches("^a{3}bc{8}d{3}ef{3}g$"));

        String challenge5 = "abcd.135";
        System.out.println(challenge5.matches("[a-z]{4}[.][1-9]{3}"));
        System.out.println(challenge5.matches("^[\\w]+\\.\\d+$"));

        String challenge6 = "abcd.135.uvqz.7tzik.999";
        Pattern pattern = Pattern.compile("[\\w]+\\.(\\d+)");
        Matcher matcher = pattern.matcher(challenge6);
        matcher.matches();

        while (matcher.find()){
            System.out.println("Occurence "+ matcher.group(1));
        }

        String challenge8 = "abcd.135\tuvqz.7\tzik.999\n";
        Pattern pattern8 = Pattern.compile("[\\w]+\\.(\\d+)\\s");
        Matcher matcher8 = pattern8.matcher(challenge8);
        while (matcher8.find()){
            System.out.println("Occurence "+ matcher8.group(1));
        }

        String challenge9 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern9 = Pattern.compile("\\{(\\d, \\d)\\}");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while (matcher9.find()){
            System.out.println("Occurence "+ matcher9.group(1));
        }

        String river = "MississippiMississippiMississippi";

        Pattern p = Pattern.compile("Mi(.*?)pi");
        Matcher m = p.matcher(river);
        while (m.find()){
            System.out.println(m.group(1));
        }


        String html = "<div class=\"image\"><img src=\"http://cdn.posh24.se/images/:profile/5ysh\"alt=\"Taylor Swift\"/></div>\n";
        StringBuilder sb = new StringBuilder(html);
        sb.append("<div class=\"image\"><img src=\"http://cdn.posh24.se/images/:profile/9thh\"alt=\"Travis Greene\"/></div>\n");
        sb.append("<div class=\"image\"><img src=\"http://cdn.posh24.se/images/:profile/67hsd\"alt=\"Tasha cobbs\"/></div>");
        Pattern pattern1 = Pattern.compile("img src=\"(.*?)\".*alt=\"(.*?)\"");
        Matcher matcher1 = pattern1.matcher(sb);

        while (matcher1.find()){
            System.out.println(matcher1.group(1));
            System.out.println(matcher1.group(2));
        }



    }


}

class ValidateInput {
    // validate first name
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    // validate last name
    public static boolean validateLastName(String lastName) {
        return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
    }

    // validate address
    public static boolean validateAddress(String address) {
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // validate city
    public static boolean validateCity(String city) {
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // validate state
    public static boolean validateState(String state) {
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }


    // validate zip
    public static boolean validateZip(String zip) {
        return zip.matches("\\d{5}");
    }

    // validate phone
    public static boolean validatePhone(String phone) {
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
}