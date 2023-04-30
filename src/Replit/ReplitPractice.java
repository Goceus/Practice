package Replit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

    public class ReplitPractice {


        public static void main(String[] args) {

        /* //DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            int n = scan.nextInt();
            String prefix = str.substring(0,n);
            boolean result = true;

        //System.out.println(prefix);

            //WRITE YOUR CODE BELOW
        if( str.substring(n).contains(prefix)){
            System.out.println(result);
        }else{
            System.out.println(!result);
        }*/

        /*//DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = scan.next();
        scan.close();

        //WRITE YOUR CODE BELOW
        int wordBreaker = email.indexOf("_");
        int domainStart = email.indexOf("@");
        String firstName = email.substring(0, wordBreaker);
        String lastName = email.substring(wordBreaker+1, domainStart);
        String domain = email.substring(domainStart+1, email.indexOf("."));

        String firstNameCap = firstName.substring(0,1).toUpperCase() ;
        String lastNameCap =  lastName.substring(0, 1).toUpperCase();
        String domainCap = domain.substring(0, 1).toUpperCase();

        System.out.println("First name: " + firstNameCap + firstName.substring(1) );
        System.out.println("Last name: " + lastNameCap + lastName.substring(1));
        System.out.println("Domain: " + domainCap + domain.substring(1));*/

        /*//DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner scan = new Scanner(System.in);
            String str = scan.next();

            //WRITE YOUR CODE BELOW
            int first = str.indexOf("bread");
            int last = str.lastIndexOf("bread");

            if(first == last){// when there is not two pieces of bread.
                System.out.println("nothing");b
            }else{
                System.out.println(str.substring(first+5, last));
            }*/

        /*
          if (education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")) {
                premium *= 0.95/(premium *100);
            } else if (education.equalsIgnoreCase("PHD")) {
                premium *= 0.90/(premium *100);
            } else if (education.equalsIgnoreCase("High School")) {
                premium += premium * (5/100);
            }
         */

        /*  //WRITE YOUR CODE BELOW
        double premium = 0;
        int commuteDays = 0;
        //String fullName = " ";



        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        int wordBreaker = fullName.indexOf(" ");
        String firstName = fullName.substring(0, wordBreaker);
        String lastName = fullName.substring(wordBreaker+1);
        String firstNameCap = firstName.substring(0,1).toUpperCase();
        String lastNameCap =  lastName.substring(0, 1).toUpperCase();

        System.out.println("Do you have a US driver license?");
        String USDL = input.nextLine();

        if (USDL.equalsIgnoreCase("no")) {
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();

        if (zipCode == 20910 || zipCode == 20740) {
            premium += 60;
        } else if (zipCode == 22102 || zipCode == 22103) {
            premium += 30;
        } else {
            premium += 50;
        }

        input.nextLine();
        System.out.println("Is this vehicle owned, financed, or leased?");
        String carStatus = input.nextLine();

        if (carStatus.equalsIgnoreCase("owned")) {
            premium += 10;
        } else if (carStatus.equalsIgnoreCase("financed")) {
            premium += 15;
        } else if (carStatus.equalsIgnoreCase("leased")) {
            premium += 20;
        }


        System.out.println("How is this vehicle primarily used?");
        String usage = input.nextLine();

        if (usage.equalsIgnoreCase("business")) {
            premium += 50;
        } else if (usage.equalsIgnoreCase("pleasure")) {
            premium += 10;
        } else if (usage.equalsIgnoreCase("commuting")) {
            premium += 20;
            System.out.println("How many days do you commute?");
            commuteDays = input.nextInt();
            premium += commuteDays * 5;
        }

        System.out.println("How old are you?");
        int age = input.nextInt();

        if (age < 16) {
            System.out.println("You can't be driving");
            System.exit(0);
        } else if (age >= 16 && age < 20) {
            premium *= 10;
        } else if (age >= 20 && age < 25) {
            premium *= 6;
        } else if (age >= 25) {
            premium *= 2;
        }

        input.nextLine();
        System.out.println("Have you had any accidents in the last 5 years?");
        String accidents = input.nextLine();

        if (accidents.equalsIgnoreCase("yes")) {
            System.out.println("How many?");
            int accidentsNumber = input.nextInt();
            premium += accidentsNumber * 10;
        }
        String referenceNumber = "";
        input.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        String education = input.nextLine();
        if (education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")) {
            premium *= (95.0/100);
        } else if (education.equalsIgnoreCase("PHD")) {
            premium *= (90.0/100);
        } else if (education.equalsIgnoreCase("High School")) {
            premium += premium * (5.0/100);
        }

        String eduTrimmed = education.replaceAll(" ", "");

        referenceNumber = "" + firstNameCap + firstName.substring(1, 2).toUpperCase() + age + lastName.substring(lastName.length() - 3).toUpperCase() + zipCode + eduTrimmed.toUpperCase();
        String report =  firstNameCap + firstName.substring(1)+ " " + lastNameCap + lastName.substring(1) + ", here's your quote!\nThis is your start premium cost: $" + premium + "\nThis is your reference number: " + referenceNumber;

        System.out.println(report);*/

            //Loops:
        /*for (int number = 0; number <= 50 ; number++) {
            System.out.println(number);
        }*/

        /*for (char letter = 'A'; letter <= 'Z' ; letter++) {
            System.out.print(letter);
        }
        System.out.println();

        for (char letter2 = 'z'; letter2 >= 'a' ; letter2--) {
            System.out.print(letter2);
        }*/

        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int hashtag;
        for (int i = 0; i < n; i++) {
            System.out.print("#");
        }*/

        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int fac = 1;
        for (int i = n; i > 1; i--) {
            fac *= i;
        }

        System.out.println(fac);*/

        /*// even & odd 1 to 20
        String even = "";
        String odd = "";

        for (int i = 2; i <=20 ; i+=2) {
            even += i + " ";
        }
        System.out.println(even.trim());

        for (int i = 1; i <=20 ; i+=2) {
            odd += i + " ";
        }
        System.out.println(odd.trim());*/

            // zombie attack:
        /*Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        for (int day = 0; inhabitants > 0 ; day++) {

            System.out.println("Day "+day+" "+"["+inhabitants+"]");
            inhabitants /= 2;
            }
        System.out.println("---- EXTINCT ----");*/

            //Utopian tree:
        /*int year = 1;
        int growth = 1;
        int treeSize = 1;

        for (int i = 1; i <= 10 ; i++) {

            year = i;
            System.out.println("year "+year+" - growth "+growth+" cm\ntree size: "+treeSize+" cm");
            if(year < 3){
                treeSize += 1;
            }else{
                treeSize += 2;
                growth = 2;
            }

        }*/
        /*do {

            System.out.println("year " + year + " - growth " + growth + " cm\ntree size: " + treeSize + " cm");
            if(year < 3){
                treeSize++;
            }else{
                treeSize += 2;
                growth = 2;
            }

        } while (year++ < 10);*/

            //Each letter
        /*Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        String[] eachChar = word.split("");

        for (int i = 0; i < eachChar.length; i++) {
            System.out.println(eachChar[i]);
        }*/

            //Vowels:
        /*Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        String vowels = "aeiou";

        for (int i = 0; i < word.length(); i++) {
            if(vowels.contains("" + word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }*/

            //Party:
        /*Scanner input = new Scanner(System.in);
        String list = "";
        String answer = "";

        do{
            System.out.println("Please enter the guest's name:");
            String guest = input.next();
            list += guest + ", ";

            System.out.println("Do you want to enter another guest's name?");
            answer = input.next();

        }while (answer.equals("yes"));


        String updatedList = list.substring(0, list.length()-2);
        System.out.println("Guests' list: "+updatedList);*/

            //Count hi
        /*Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count =0;
        while(str.contains("hi")){
            count++;
            str = str.replaceFirst("hi", "");
        }
        System.out.println(count);*/

            //Cat and Dog
        /*Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length()-2; i++) {

            String piece = str.substring(i, i+3);

            if(piece.equals("cat")){
                countCat++;
            }else if(piece.equals("dog")){
                countDog++;
            }
        }

        System.out.println(countCat == countDog);
       }*/

            // Integer  a =1;
            //list.remove(a);

            //System.out.println(list);

            //Java and Python
        /*int javaCount = 0;
        int pythonCount = 0;

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        for (int i = 0; i < sentence.length()-3; i++) {

            String javaPiece = sentence.substring(i, i + 4);

            if (javaPiece.equals("java")) {
                javaCount++;

            }
        }

        for (int j = 0; j < sentence.length()-5; j++) {

            String pythonPiece = sentence.substring(j, j + 6);
            if(pythonPiece.equals("python")) {
                pythonCount++;

            }

        }
        System.out.println(javaCount == pythonCount);*/

        /*do{

            if(sentence.contains("java")){
                javaCount++;
                sentence = sentence.replaceFirst("java", "");
            }
            if(sentence.contains("python")){
                pythonCount++;
                sentence.replaceFirst("python", "");
            }

        }while(sentence.contains("java") || sentence.contains("python"));

        System.out.println(javaCount == pythonCount);*/

            //Count triples
        /*Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int count = 0;

        for (int i = 0; i < str.length()-2; i++) {

            if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)){
                count++;
            }

        }
        System.out.println(count);*/

            //Shopping list
        /*Scanner input = new Scanner(System.in);

        int itemCount = 1;
        String list = "SHOPPING LIST:";
        double totalCost = 0;
        String answer = "no";

        do {
            System.out.println("Enter the name of item " + itemCount++);
            String item = input.next();

            System.out.println("Enter the price of the " + item);
            double price = input.nextDouble();

            System.out.println("How many " + item + " will you buy?");
            int quantity = input.nextInt();

            double eachItemPrice = price * quantity;

            list += "\n" + item + " x " + quantity + " - $" + eachItemPrice;

            totalCost += eachItemPrice;

            System.out.println("Do you want to add more items to the shopping list?");
            answer = input.next();

        }while(answer.equalsIgnoreCase("yes"));

        list += "\nTotal cost: $" + totalCost;
        System.out.println(list);*/
            //Needs work
        /*String list = "";
        int itemCount = 1;

        System.out.println( "Enter the name of item "+ itemCount );
        String item = input.next();
        list = item + " " + itemCount++;

        System.out.println( "Enter the price of the "+ item );
        int itemPrice = input.nextInt();

        System.out.println("How many "+ item+ " will you buy?");
        int itemQuantity = input.nextInt();

        int totalPrice = itemQuantity * itemPrice;

        input.nextLine();

        System.out.println("Do you want to add more items to the shopping list?");
        String answer = input.nextLine();

        if(answer.equalsIgnoreCase("yes")){
            System.out.println( "Enter the name of item "+ itemCount );
            item = input.next();
            list += item + " " + itemCount++;

            System.out.println( "Enter the price of the "+ item );
            itemPrice = input.nextInt();

            System.out.println("How many "+ item+ " will you buy?");
            itemQuantity = input.nextInt();

        }else if (answer.equalsIgnoreCase("no")){
            System.out.println("receipt item " + itemCount);
        }

        totalPrice += itemQuantity * itemPrice;

        System.out.println("SHOPPING LIST:\nreceipt item "+ itemCount+"\nTotal cost: " + totalPrice + list);*/

            //Create Array
        /*int[] n = {34, 59, 19};

        for (int i = 0; i < n.length; i++) {
            System.out.println("First element: "+n[i]);
            i++;
            System.out.println("Middle element: "+n[i]);
            i++;
            System.out.println("Last element: "+n[i]);
        }*/

            // Print Array
        /*int [] nums = {10, 14, -93, 140, -20};

        System.out.println("["+nums[0]+", "+nums[1]+", "+nums[2]+", "+nums[3]+", "+nums[4]+"]");*/

            //Expand
        /*Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        int[] nums2 = new int[nums.length * 2];
        nums2[0] = nums[0];
        nums2[1] = nums[1];
        nums2[2] = nums[2];
        System.out.println(Arrays.toString(nums2));*/

            //Second Elements
        /*Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        System.out.println("Second element: "+nums[1]);
        System.out.println("Second to last element: "+ nums[nums.length-2]);*/

            // Average Temperature
        /*Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        double sum = 0;

        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }

        double average = sum / temps.length;
        System.out.println(average);*/

            // First and last character of words
        /*Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        System.out.println(Arrays.toString(words));

        for ( String eachWord : words) {
            //System.out.println(eachWord);
            System.out.println(""+eachWord.charAt(0)+eachWord.charAt(eachWord.length()-1));
        }*/

            //Reverse Array
        /*Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++){
            arr[i] = input.nextLine();
        }

        String reverse = "";
        for (int j = arr.length-1; j >= 0 ; j--) {
           reverse += arr[j] + " ";
        }
        String[] reverseOrder = reverse.trim().split(" ");

        System.out.println(Arrays.toString(reverseOrder));*/

            // Pairs
        /*Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0; i<8;i++){
            arr[i] = input.nextLine();
        }
        String pair = "";
        for (int p = 0; p < arr.length; p++) {
            System.out.println(arr[p] + ", " + arr[p+1]);
        }*/

            //Find Max
        /*Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println(max);*/

            //Count Evens
        /*Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                evenCount += 1;

            }

        }System.out.println(evenCount);*/

            // Has 55
        /*Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        boolean result = false;
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] == 5 && nums[i+1] == 5) {
                result = true;
            }
        }
        System.out.println(result)*/

            //Biggest Word
        /*Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }

        String maxWord = "";
        for ( String each : words ) {
            if(each.length() > maxWord.length()){
                maxWord = each;
            }
        }
        System.out.println(maxWord);*/

            // Split sentence
        /*Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String[] word = sentence.split(" ");

        for (String each : word) {
            System.out.println(each);
        }*/

            // Reverse sentence
        /*Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] word = sentence.split(" ");

        String reverse = "";
        for (int i = word.length - 1; i >= 0; i--) {
            reverse += "" + word[i] + " ";
        }
        System.out.println(reverse.trim());*/

            //Shortest words
        /*Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(", ");

        //System.out.println(Arrays.toString(words));



        int shortestWord = words[0].length();

            for ( String each : words ) {
                if(each.length() < shortestWord){
                    shortestWord = each.length();
                }
            }

            String allSmallestWords = "";
        for ( String each : words ) {
            if(each.length() == shortestWord ){
                allSmallestWords += each +" ";
            }
        }

        System.out.println(Arrays.toString(allSmallestWords.split(" ")));*/

            //Non duplicate
        /*Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        String loopedNumbers = "";

        for (int i = 0; i < nums.length; i++) {

            if(loopedNumbers.contains(""+ nums[i])){
                continue;
            }

            boolean unique = true;

            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    unique = false;
                    break;
                }
            }

            if(unique){
                System.out.println(nums[i]);
                break;
            }

            loopedNumbers += nums[i];
        }*/

            // Find cube
        /*
        ReplitPractice.cube();

        public static void cube () {

            int n = new Scanner(System.in).nextInt();

            //TYPE YOUR CODE BELOW:
            int result = n * n * n;
            System.out.println(result);
        */

            // Reverse String
        /*Scanner in = new Scanner(System.in);
        String test = in.nextLine();

        for (int i = test.length()-1; i >=0 ; i--) {
            //char reverseChar = test.charAt(i);
            String reverseString = "" + test.charAt(i);
            System.out.print(reverseString);
        }*/

            // Cover Me
        /*
        public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		System.out.println(coverString(in.nextLine(), in.nextLine()));
  }

  public static String coverString(String main, String coverMe) {
    // your code here

    if(!main.equals(coverMe) && !main.contains(coverMe)){
       main = "[" + main + "]";
    }
    if(main.contains(coverMe)){
       main = main.replace(coverMe, "[" + coverMe + "]");
    }
    return main;



}
       */

            // Unique Numbers
        /*
      public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the length of array!!!");
    int size = scan.nextInt();
    int[] nums = new int[size];
    for(int i=0; i < size; i++){
      nums[i] = scan.nextInt();
    }
    printUniqueNumbers(nums);
  }

  public static void printUniqueNumbers(int[] nums){
    //WRITE YOUR CODE HERE
    for(int each : nums){
      int count = 0;

      for (int second : nums){

        if(each == second){
          count++;
        }
      }
        if(count == 1){
          System.out.println(each);
        }

    }


}
       */

            //Merge Arrays
        /*Scanner in = new Scanner(System.in);
            int [] nums = new int[in.nextInt()];
            int [] nums2 = new int[in.nextInt()];
            for(int i=0; i < nums.length; i++) {
                nums[i] = in.nextInt();
            }
            for(int i=0; i < nums2.length; i++) {
                nums2[i] = in.nextInt();
            }

            System.out.println(Arrays.toString(merge(nums, nums2)));

        public static int[] merge(int[] a,int[] b) {
            int[] mergeArr = new int[a.length + b.length];

            for (int i = 0; i < a.length; i++) {
                mergeArr[i] = a[i];
            }

            for (int i = 0; i < b.length; i++) {
                mergeArr[a.length + i] = b[i];
            }
            return mergeArr;

        }*/

            //Count Appearance
       /*Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        String[] strs = new String[in.nextInt()];
        System.out.println("Enter the search word:");
        String word = in.next();
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(countAppearance(strs,word));

        public static int countAppearance(String[] arr, String word){

            int count = 0;
            for (String eachWord : arr){
                if(eachWord.equals(word)){
                    count++;
                }
            }
            return count;

        }*/

            // Return Word With E
        /*public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
            System.out.println(Arrays.toString(getWithE(arr)));

        }



        public static String[] getWithE(String[] arr) {

            String newStr = "";

            for ( String eachWord : arr)
                if(eachWord.contains("e")){
                    newStr += eachWord + " ";
                }


            //YOUR CODE ENDS HERE

            return newStr.trim().split(" ");
        }*/

            // Count duplicate elements
        /*Scanner in = new Scanner(System.in);
            String [] strs = new String[in.nextInt()];
            for(int i=0; i < strs.length; i++) {
                strs[i] = in.next();
            }

            System.out.println(getDup(strs));

        }

    public static int getDup(String[] arr) {

        int dup = 0;
        String past = "";



        for ( String each : arr ) {

            int count = 0;

            if(past.contains(each)){
                continue;
            }

            for ( String other : arr) {
                if(each.equals(other)){
                    count++;
                }
            }
            past += each + " ";

            if(count >1){
                dup += count;
            }

        }

        return dup;

    }*/

            // Extract Number
        /*Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));

        public static String extractNum(String s) {

            String numbers = "";

            for (int i = 0; i < s.length(); i++) {

                if(Character.isDigit(s.charAt(i))){
                    numbers += s.charAt(i);
                }

            }

            return numbers;
        }*/

            // Array List
        /* Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int pos1 = in.nextInt();
        int pos2 = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(swap(list, pos1, pos2));

        public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2) {

            String temp = list.get(pos1);

            list.set(pos1, list.get(pos2));
            list.set(pos2, temp);
            return list;

        }*/

            // Append positive sum
        /*Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

        public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){

            ArrayList<Integer> positive = new ArrayList<>();
            int sum = 0;

            for(int each : list){
                if(each > 0){
                    positive.add(each);
                    sum += each;
                }

            }

            positive.add(sum);
            return positive;


        }*/

            // Times two
        /*Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

        public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int each : nums) {
                int result = 0;
                result = each * 2;

                list.add(result);

            }

            return list;
        }*/

            // Sorted order
        /*Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(isSorted(list));

        public static boolean isSorted(ArrayList<Integer> nums) {

            for (int i = 0; i < nums.size()-1; i++) {
                if(nums.get(i) > nums.get(i+1) ){
                    return false;
                }
            }

            return true;
        }*/

            // Search a string in string
        /*Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));

        public static String search(ArrayList<String> strs, String find) {
            // complete the method
            String result = "search failed";
            for (String each : strs) {
                if(each.contains(find)){
                    result = each;
                }
            }
            return result;
        }*/

            //Combine Arrays
        /*Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combine(strs,strs2));

        public static ArrayList<String> combine(String[] r1, String[] r2){

            // your code here
            ArrayList<String> combinedStrArr = new ArrayList<>();
            for(String eachR1 : r1){
                String first = eachR1;
                first.trim();
                combinedStrArr.add(first);
            }
            for (String eachR2 : r2){
                String second = eachR2;
                second.trim();
                combinedStrArr.add(second);
            }

            return combinedStrArr;

        }*/

            // Fuel
        /*Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuels(list, fuel));

        public static int refuels(ArrayList<Integer> deliveries,int gasTank) {

            int stops = 0;
            int fullTankFuel = 0;
            for(int each : deliveries){
                fullTankFuel += each;
            }
            stops = fullTankFuel / gasTank + fullTankFuel % gasTank;
            return stops;

        }*/

            // Nanuk - Polar bear hunt
            // if no polar bears, and hunted as much as boasted, AND if waystones more than nanuks, and hunted nanuks more than boast number  - boolean true: hunt is successful
        /*Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(hunt(list, stones, boast));

        public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {

            int sumArr = 0;
            int countNanuk = 0;
            for (String eachString : result) {
                if (eachString.equals("nanuk")) {
                    countNanuk++;
                }else {
                    sumArr += Integer.parseInt(eachString);
                }
            }
            return countNanuk <= wayStones && sumArr >= boast;

        }*/

            // Sum String
        /*Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(getSum(list));

        public static ArrayList<Integer> getSum(ArrayList<String> digits){

            ArrayList<Integer> sumEachArr = new ArrayList<>();

            for ( String each : digits ) {
                int sum = 0;

                for (char eachDigit : each.toCharArray()) {
                    sum += Integer.parseInt(""+eachDigit);
                }

                sumEachArr.add(sum);
            }
            return sumEachArr;
        }*/


            //


        }


    }
