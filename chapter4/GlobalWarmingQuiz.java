/*
	4.30 (Global Warming Facts Quiz) 
The controversial issue of global warming has been widely publicized 
by the film “An Inconvenient Truth,” featuring former Vice President Al 
Gore. Mr. Gore and a U.N. network of scientists, the Intergovernmental Panel on Climate 
Change, shared the 2007 Nobel Peace Prize in recognition of “their efforts to build up 
and disseminate greater knowledge about man-made climate change.” Research both sides of 
the global warming issue online (you might want to search for phrases like “global warming skeptics”). 
Create a five-question multiplechoice quiz on global warming, each question having four possible answers (numbered 1–4). 
Be objective and try to fairly represent both sides of the issue. Next, write an application that administers the quiz, 
calculates the number of correct answers (zero through five) and returns a message to the user. If the user correctly answers five 
questions, print “Excellent”; if four, print “Very good”; if three or fewer, print “Time to brush up on your knowledge of global warming,” 
and include a list of some of the websites where you found your facts. 
*/

import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score = 0;

        System.out.println("🌎 Welcome to the Global Warming Facts Quiz!");
        System.out.println("Type the number (1–4) corresponding to your answer.\n");

        // Question 1
        System.out.println("1. Which of the following gases is considered a major greenhouse gas?");
        System.out.println("1. Nitrogen\n2. Oxygen\n3. Carbon dioxide\n4. Argon");
        int answer = input.nextInt();
        if (answer == 3) score++;

        // Question 2
        System.out.println("\n2. What is one argument presented by global warming skeptics?");
        System.out.println("1. Climate change data may be influenced by natural cycles.");
        System.out.println("2. Humans have completely stopped emitting greenhouse gases.");
        System.out.println("3. The Earth's temperature has never changed before.");
        System.out.println("4. The ozone layer is no longer affected by human activity.");
        answer = input.nextInt();
        if (answer == 1) score++;

        // Question 3
        System.out.println("\n3. According to the IPCC, what is the likely cause of recent global warming?");
        System.out.println("1. Increased volcanic activity");
        System.out.println("2. Human activities such as burning fossil fuels");
        System.out.println("3. Solar radiation alone");
        System.out.println("4. Changes in Earth’s orbit");
        answer = input.nextInt();
        if (answer == 2) score++;

        // Question 4
        System.out.println("\n4. Which of the following is a potential effect of global warming?");
        System.out.println("1. Decrease in sea levels");
        System.out.println("2. More stable weather patterns");
        System.out.println("3. Melting polar ice and rising sea levels");
        System.out.println("4. Increase in the number of polar bears");
        answer = input.nextInt();
        if (answer == 3) score++;

        // Question 5
        System.out.println("\n5. Which of the following solutions can help reduce greenhouse gas emissions?");
        System.out.println("1. Burning more coal for energy");
        System.out.println("2. Planting trees and using renewable energy");
        System.out.println("3. Reducing recycling efforts");
        System.out.println("4. Increasing deforestation");
        answer = input.nextInt();
        if (answer == 2) score++;

        // Display score and feedback
        System.out.printf("%nYou answered %d out of 5 questions correctly.%n", score);

        if (score == 5)
            System.out.println("Excellent!");
        else if (score == 4)
            System.out.println("Very good!");
        else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("\nHere are some sources to learn more:");
            System.out.println("- https://www.ipcc.ch");
            System.out.println("- https://climate.nasa.gov");
            System.out.println("- https://www.nationalgeographic.com/environment/");
            System.out.println("- https://www.climate.gov");
        }

        input.close();
    }
}
