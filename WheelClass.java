


	import java.util.ArrayList;


	public class WheelClass {
	    private ArrayList<Integer> wheelWheel = new ArrayList<Integer>();
	    public ArrayList<String> easyWheel = new ArrayList<String>();
	    public ArrayList<String> mediumWheel = new ArrayList<String>();
	    public ArrayList<String> hardWheel = new ArrayList<String>();
	    public ArrayList<String> hardWheelAnswer = new ArrayList<String>();
	    public ArrayList<String> braveWheel = new ArrayList<String>();
	    public ArrayList<String> answeredQuestions = new ArrayList<String>();
	    private int quest;
	    private String wheel;
	    private static final int brave = 15;
	    private static final int easy = 5;
	    private static final int medium = 10;
	    private static final int hard = 20;

	    public int getQuest() {
	        return quest;
	    }

	    public String getWheel() {
	        return wheel;
	    }

	    WheelClass() {
	    	quest = 0;
	    	wheel = "";
	        wheelWheel.add(1);
	        wheelWheel.add(2);

	        easyWheel.add("Last lie you have told ?");
	        easyWheel.add("Tell me a lesson you cheated on.");
	        easyWheel.add("What is the last excuse you used to stay with your friend?");
	        easyWheel.add("Your Biggest fear ?");
	        easyWheel.add("What's the most ridiculous social club you've ever been to ?");
	        easyWheel.add("Have you ever lied to your family ?");
	        easyWheel.add("Is there any whatsapp groups that you have muted?");
	        easyWheel.add("Tell me what are your favorite music bands ?");
	        easyWheel.add("Tell me your lowest university exam score.");
	        easyWheel.add("Tell me your favorite Turkish food !");
	        easyWheel.add("Tell me the celebrity you hate the most.");
	        easyWheel.add("Tell me the most luxurious thing you'll get when you are rich.");
	        easyWheel.add("What is your favorite dessert ?");
	        easyWheel.add("Make your choice ! Chill-in backyards or Coffee-break.");
	        easyWheel.add("Tell me your guilty pleasure.");
	        easyWheel.add("Make your choice ! Tea or coffee.");
	        easyWheel.add("Tell me your favorite Netflix production.");
	        easyWheel.add("Make your choice ! Künefe or Baklava.");
	        easyWheel.add(" Tell me your favorite TEDU activity.");
	        easyWheel.add("Tell me a bad that incident happened in 2020.");
	        easyWheel.add("Tell me a Ninja Turtle character.");

	        mediumWheel.add("Have you unfairly accused someone you don't love ?");
	        mediumWheel.add("Do you have a fake Instagram account ?");
	        mediumWheel.add("Did you met anyone through a dating app'?");
	        mediumWheel.add("Did you drive while you were drunk ?");
	        mediumWheel.add("What's your best friend's worst trait ?");
	        mediumWheel.add("Tell me about a moment when you were ashamed in public.");
	        mediumWheel.add("Love or money ? please be honest :)");
	        mediumWheel.add("What would you say to them if the whole world was listening to you ?");
	        mediumWheel.add("What was the most severe physical pain you've ever experienced ?");
	        mediumWheel.add("Why did you cry last time ?");
	        mediumWheel.add("What are your favorite Common Core lectures ?");
	        mediumWheel.add("What is your favorite CMPE211 instructor ?");
	        mediumWheel.add("Did you take any FF notes ?");
	        mediumWheel.add("Did you ever fight at TEDU ?");
	        mediumWheel.add("Tell an element with it's symbol from the periodic table.");

	        hardWheel.add("Tell me the country that has won Eurovision last year.");//1
	        hardWheel.add("What is the oldest flag in the world that has been used since 1219?");//2
	        hardWheel.add("What is the oldest university in the UK ?");//3
	        hardWheel.add("What is the Single-digit maximum prime number ?");//4
	        hardWheel.add("What is the most downloaded application in Turkey ?");//5
	        hardWheel.add("Which city has the most software companies ?");//6
	        hardWheel.add("The most commonly used programming language ?");//7
	        hardWheel.add("When was TEDU established ?");//8
	        hardWheel.add("How many stars are on the national flag of USA?");//9
	        hardWheel.add("Who has won the most Academy Awards?");//10
	        hardWheel.add("What is the capital of St. Lucia?");//11
	        hardWheel.add("What is Joe Biden's middle name?");//12
	        hardWheel.add("Without using a calculator, what is 30% of 546?");//13
	        hardWheel.add("Who is director of the Tenet ? ");//14
	        hardWheel.add("What month of which year was the first iPhone released?");//15


	        hardWheelAnswer.add("Holland");//1 answer

	        hardWheelAnswer.add("Denmark");//2 answer
	        hardWheelAnswer.add("Oxford");//3 answers
	        hardWheelAnswer.add("7");//4 answer
	        hardWheelAnswer.add("Facebook");//5 answer
	        hardWheelAnswer.add("California");//6 answer
	        hardWheelAnswer.add("Javascript");//7 answer

	        hardWheelAnswer.add("2009");//8 answer
	        hardWheelAnswer.add("50 stars");//9 answer
	        hardWheelAnswer.add("Katherina Nepburn");//10 answer
	        hardWheelAnswer.add("Castries");//11 answer
	        hardWheelAnswer.add("Robinette");//12 answer
	        hardWheelAnswer.add("164");//13 answer
	        hardWheelAnswer.add("Christopher Nolan");//14 answer
	        hardWheelAnswer.add("June");//15 answer


	        braveWheel.add("Sing a song that has the word 'love' in it. Can be in Turkish too !");
	        braveWheel.add("Sing a song from Serdar Ortac.");
	        braveWheel.add("Ask for money from a friend.");
	        braveWheel.add("Do 5 push-ups.");
	        braveWheel.add("Say a movie quote.");
	        braveWheel.add("Imitate your favorite animal !");
	        braveWheel.add("Say the most ridiculous thing you've ever memorized.");
	        braveWheel.add("Try to whistle.");
	        braveWheel.add("Show a weird talent of yours.");
	        braveWheel.add("Make up an excuse to stay over at a friends house.");


	    }


	    public String wheelSelect() {

	        int i = (int) (Math.random() * 2);

	        if (i == wheelWheel.get(0)) {
	            wheel = "truth";
	            return "truth";
	        } else {
	            wheel = "dare";
	            return "dare";
	        }
	    }

	    public String questionSelect(String wheel) {
	        String question = "";


	        if (wheel.equals("truth")) {

	            do {
	                quest = (int) (Math.random() * 3);

	                switch (quest) {
	                    case 0: {
	                        if (easyWheel.isEmpty()) {
	                            break;
	                        }
	                        question = easyWheel.get((int) (Math.random() * easyWheel.size()));
	                        break;
	                    }
	                    case 1: {
	                        if (mediumWheel.isEmpty()) {
	                            break;
	                        }
	                        question = mediumWheel.get((int) (Math.random() * mediumWheel.size()));
	                        break;
	                    }
	                    case 2: {
	                        if (hardWheel.isEmpty()) {
	                            break;
	                        }
	                        question = hardWheel.get((int) (Math.random() * hardWheel.size()));
	                        break;
	                    }
	                }
	                if (((easyWheel.isEmpty()) && (mediumWheel.isEmpty()) && (hardWheel.isEmpty()))) {
	                    if (braveWheel.isEmpty()) {
	                        return "THERE IS NO QUESTIONS LEFT !";
	                    } else {
	                        return braveWheel.get((int) (Math.random() * braveWheel.size()));
	                    }

	                }
	            } while (question.equals(""));

	        } else {
	            do {
	                if (braveWheel.isEmpty()) {
	                    return questionSelect("truth");
	                }
	                question = braveWheel.get((int) (Math.random() * braveWheel.size()));
	            } while (question.equals(""));

	        }
	        return question;


	    }

	    public void removeQuestion(String str) {
	        if (easyWheel.contains(str)) {
	            answeredQuestions.add(str);
	            easyWheel.remove(str);
	        } else if (mediumWheel.contains(str)) {
	            answeredQuestions.add(str);
	            mediumWheel.remove(str);
	        } else if (hardWheel.contains(str)) {
	            hardWheelAnswer.remove(hardWheel.indexOf(str));
	            answeredQuestions.add(str);
	            hardWheel.remove(str);
	        } else {
	            answeredQuestions.add(str);
	            braveWheel.remove(str);
	        }
	    }

	    public int addPoints() {
	        int index;
	        if (wheel.equals("dare")) {
	            return brave;
	        } else {
	            switch (quest) {
	                case 0 : index = easy;
	                break;
					case 1 : index = medium;
					break;
	                default : {
	                    index = 0;
	                    System.out.println("You should not be reading this !");
	                    break;
	                }
	            }
	            return index;
	        }

	    }

	    public int questionIndexFinder(String question) {
	        int index = 0;
	        for (int i = 0; i < hardWheel.size(); i++) {
	            if (question.equals(hardWheel.get(i)))
	                index = i;
	        }
	        return index;
	    }

	    public int answerChecker(String answer, String question) {
	        int index = questionIndexFinder(question);
	        int gain = 0;
	        if (answer.equalsIgnoreCase(hardWheelAnswer.get(index))){
	            gain = hard;
	        }
	        return gain;

	    }

	}

