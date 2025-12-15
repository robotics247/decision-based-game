// Yichen
public static void main(String[] args) { 
    try (Scanner scanner = new Scanner(System.in)) {
        while (true) {
            System.out.print("You are in a maze, do you want to go left or right?");
            String input = scanner.nextLine();
            if (input.equals("left")) {
                while (true) { 
                    System.out.print("You went left. There is another branching path, do you go left or right?");
                    input = scanner.nextLine();
                    if (input.equals("left")) {
                        System.out.print("You found a dead end. Try again? (restart)\n");
                    } else if (input.equals("right")) {
                        System.out.print("You found the exit to the maze.\n");
                    } else {
                        System.out.print("Invalid input, try again.\n");
                        continue;
                    }
                    break;
                }
            } else if (input.equals("right")) {
                while (true) { 
                    System.out.print("You went right. There is another branching path, do you go left or right?");
                    input = scanner.nextLine();
                    if (input.equals("left")) {
                        System.out.print("You found a dead end. Try again? (restart)\n");
                    } else if (input.equals("right")) {
                        System.out.print("You found a dead end. Try again? (restart)\n");
                    } else {
                        System.out.print("Invalid input, try again.\n");
                        continue;
                    }
                    break;
                }
            } else {
                System.out.print("Invalid input, try again.\n");
                continue;
            }
            break;
        }
    }
}
