


	import java.util.*;

	public class BigDriver {
	    public static void main(String[] args) {
	        WheelClass wheeler = new WheelClass();

	        int playerNum;
	        int TOTAL_TURNS = 10;
	        String userCommand = "";
	        String currentQuestion = "";
	        String userAnswer = "";
	        int correctPoints = 0;


	        Scanner keyboardScanner = new Scanner(System.in);
	        ArrayList<Player> players = new ArrayList<Player>();
	        ArrayList<Player> players1 = new ArrayList<Player>();


	        do {
	            System.out.println("Welcome to Wheel of Destiny !");
	            System.out.println("Please type in how many players will play. The maximum amount is 4 players and the minimum is 2 players.");

	            userCommand = keyboardScanner.nextLine();
	            System.out.println("Please type in your names in the order you decided to play.");
	        } while (!(userCommand.equals("2") || userCommand.equals("3") || userCommand.equals("4")));

	        playerNum = Integer.parseInt(userCommand);


	        // INDEX 0 = FIRST PLAYER
	        // INDEX 1 = SECOND PLAYER
	        // INDEX 2 = THIRD PLAYER
	        // INDEX 3 = FOURTH PLAYER


	        if (userCommand.equals("2")) {
	            players.add(new Player());
	            players.add(new Player());
	            nameCollector(keyboardScanner, players, playerNum);


	        } else if (userCommand.equals("3")) {
	            players.add(new Player());
	            players.add(new Player());
	            players.add(new Player());
	            nameCollector(keyboardScanner, players, playerNum);

	        } else if (userCommand.equals("4")) {
	            players.add(new Player());
	            players.add(new Player());
	            players.add(new Player());
	            players.add(new Player());
	            nameCollector(keyboardScanner, players, playerNum);

	        }


	        boolean check = true;

	        while (true) {

	            if (!winConditions(TOTAL_TURNS, players)) {
	                break;
	            }

	            for (int i = 0; i < players.size(); i++) {
	                Timer timer = new Timer();
	                TimerTask task = new TimeKeeper();
	                System.out.println("It's your turn " + players.get(i).getPlayerName() + " ");

	                do {
	                    System.out.println("Do you wish to spin the wheel " + players.get(i).getPlayerName() + " ? if so type in 'spin' !");
	                    System.out.println("If you want to see the overall score, type in 'score'.");
	                    System.out.println("If you want to see your personal statistics, type in 'stats'.");
	                    userCommand = keyboardScanner.nextLine();
	                    if (userCommand.equalsIgnoreCase("score")) {
	                        for (int j = 0; j < players.size(); j++) {
	                            System.out.println(players.get(j).getPlayerName() + " has " + players.get(j).getPlayerPoints() + " total points.");
	                        }
	                    } else if (userCommand.equalsIgnoreCase("stats")) {
	                        System.out.println(players.get(i).toString());
	                    }
	                } while ((!userCommand.equalsIgnoreCase("spin")));

	                wheeler.wheelSelect();
	                userCommand = "";
	                currentQuestion = wheeler.questionSelect(wheeler.getWheel());

	                if (wheeler.braveWheel.contains(currentQuestion)) {

	                    System.out.print("You spun for dare ! You will get 15 points from this question.");
	                    do {
	                        userCommand = "";
	                        System.out.println(" Do you have what it takes ? If so type in 'spin' again :)");
	                        userCommand = keyboardScanner.nextLine();
	                    } while (!userCommand.equalsIgnoreCase("spin"));
	                    System.out.println(currentQuestion);
	                    timer.schedule(task, 5000, 1000);

	                    System.out.println("If you wish to skip this task, type in 'pass'. If you finished your task, type in 'complete' ! (Please be honest :))");
	                    userAnswer = keyboardScanner.nextLine();
	                    timer.cancel();
	                    if (userAnswer.equals("complete")) {
	                        System.out.println("Nice Job !");
	                        players.get(i).addQuestionCounter(3);
	                        players.get(i).addPointPlayer(wheeler.addPoints());
	                    } else {
	                        System.out.println("Better luck next time.");
	                    }
	                    wheeler.removeQuestion(currentQuestion);
	                } else {

	                    do {
	                        userCommand = "";
	                        System.out.println(" Get ready for very strange questions ! type in 'spin'.");
	                        userCommand = keyboardScanner.nextLine();
	                    } while (!userCommand.equals("spin"));

	                    System.out.println(currentQuestion);
	                    if (wheeler.hardWheel.contains(currentQuestion)) {

	                        System.out.println("This one is a hard question. You will get 20 points for answering correctly. If you wish to skip this question, type in 'pass'.");
	                        timer.schedule(task, 5000, 1000);
	                        userAnswer = keyboardScanner.nextLine();
	                        timer.cancel();
	                        correctPoints = wheeler.answerChecker(userAnswer, currentQuestion);

	                        if (correctPoints == 0) {
	                            System.out.println("Your answer was incorrect.");

	                        } else if (userAnswer.equals("pass")) {
	                            System.out.println("You decided to pass.");

	                        } else {
	                            System.out.println("Congratulations ! you answered correctly.");
	                            players.get(i).addPointPlayer(correctPoints);
	                            players.get(i).addQuestionCounter(2);
	                        }

	                        wheeler.removeQuestion(currentQuestion);

	                    } else {
	                        int ezOrMed;
	                        if (wheeler.easyWheel.contains(currentQuestion)) {
	                            System.out.println("This is an easy question. You will get 5 points if you answer correctly.");
	                            ezOrMed = 0;
	                        } else {
	                            System.out.println("This is a medium question. You will get 10 points if you answer correctly.");
	                            ezOrMed = 1;
	                        }

	                        System.out.println("Please answer honestly ! If you wish to skip this question, type in 'pass'.");
	                        timer.schedule(task, 5000, 1000);
	                        userAnswer = keyboardScanner.nextLine();
	                        timer.cancel();

	                        if (userAnswer.equals("pass")) {
	                            System.out.println("You decided to pass.");
	                        } else {
	                            System.out.println("Good answer !");
	                            players.get(i).addPointPlayer(wheeler.addPoints());
	                            players.get(i).addQuestionCounter(ezOrMed);
	                        }

	                        wheeler.removeQuestion(currentQuestion);
	                    }
	                }


	            }

	            TOTAL_TURNS--;
	        }

	        System.out.println("Thanks for playing !");


	        //timer.schedule(task,5000,1000);

	        /*
	        currentQuestion = wheeler.questionSelect(wheeler.wheelSelect());
	        if (wheeler.getQuest() == 2){
	            System.out.println(currentQuestion);
	            System.out.println("You can put in 'pass' to skip the question, but you will not be awarded any points.");
	            userAnswer = keyboardScanner.nextLine();
	            correctPoints = wheeler.answerChecker(userAnswer,currentQuestion);
	            if (userAnswer.equalsIgnoreCase("pass")){
	                System.out.println("you passed this question !");
	            }else if (correctPoints == 0){
	                System.out.println("Your answer is wrong.");
	            }else {
	                System.out.println("You are correct !");
	                players.get(0).addPointPlayer(correctPoints);
	                System.out.println("Your total score is "+players.get(0).getPlayerPoints());
	            }
	        }
	        wheeler.removeQuestion(currentQuestion);
	        if (wheeler.hardWheel.contains(currentQuestion)){
	            System.out.println("Didnt work !");
	        }else {
	            System.out.println("It works !");
	        }
	        if (wheeler.answeredQuestions.contains(currentQuestion))
	            System.out.println("It got stored !");
	         */


	    }

	    private static void nameCollector(Scanner keyboardScanner, ArrayList<Player> players, int playerNumber) {
	        String userCommand;
	        String[] numStr = {"First", "Second", "Third", "Fourth"};
	        for (int i = 0; i < playerNumber; i++) {
	            switch (i) {
	                case 0: {
	                    do {
	                        System.out.println("First player please enter your name !");
	                        userCommand = keyboardScanner.nextLine();
	                    } while (userCommand.equals(""));
	                    players.get(0).setPlayerName(userCommand);
	                    System.out.println("Hello " + players.get(0).getPlayerName() + " !");
	                    break;
	                }
	                case 1: {
	                    do {
	                        System.out.println("Second player please enter your name !");
	                        userCommand = keyboardScanner.nextLine();
	                    } while (userCommand.equals(""));
	                    players.get(1).setPlayerName(userCommand);
	                    System.out.println("Hello " + players.get(1).getPlayerName() + " !");
	                    break;
	                }

	                case 2: {
	                    do {
	                        System.out.println("Third player please enter your name !");
	                        userCommand = keyboardScanner.nextLine();
	                    } while (userCommand.equals(""));
	                    players.get(2).setPlayerName(userCommand);
	                    System.out.println("Hello " + players.get(2).getPlayerName() + " !");
	                    break;
	                }
	                case 3: {
	                    do {
	                        System.out.println("Fourth player please enter your name !");
	                        userCommand = keyboardScanner.nextLine();
	                    } while (userCommand.equals(""));
	                    players.get(3).setPlayerName(userCommand);
	                    System.out.println("Hello " + players.get(3).getPlayerName() + " !");
	                    break;
	                }
	            }
	        }

	    }


	    private static boolean winConditions(int turns, ArrayList<Player> players) {
	        boolean gameEnder = true;
	        if (turns == 0) {
	            System.out.println("The game is over. Here are the final results :");
	            for (Player player : players) {
	                System.out.println(player.toString());
	                gameEnder = false;
	            }
	        } else {
	            for (Player player : players) {
	                if (player.getPlayerPoints() >= 100) {
	                    System.out.println("Congratulations ! " + player.getPlayerName() + " Has won the game ! Here are the final results: ");
	                    for (Player player1 : players) {
	                        System.out.println(player1.toString());
	                    }
	                    gameEnder = false;
	                }
	            }

	        }

	        return gameEnder;
	    }


	}