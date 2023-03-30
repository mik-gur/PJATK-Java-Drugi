package service;

import entity.LetterGame;

import java.io.IOException;

public class LetterGameService {

    private LetterGame letterGame = new LetterGame();

    public void guessTheLetter() throws IOException {
        letterGame.setLetter((char) (Math.random() * 26 + 'a'));
        letterGame.setCorrect(false);

        System.out.println("Pomyślałem literę z przedziału od A do Z.");
        while (!letterGame.isCorrect()) {
            System.out.println("Odgadnij ją: ");
            char input = (char) System.in.read();
            System.in.skip(System.in.available());
            if (input == letterGame.getLetter()) {
                letterGame.setCorrect(true);
                System.out.println("Dobrze!");
            } else {
                System.out.println("Źle!");
                if (input < letterGame.getLetter()) {
                    System.out.println("Trafiłeś zbyt wysoko!");
                } else {
                    System.out.println("Trafiłeś za nisko!");
                }
            }
        }
        System.out.println("");
    }
}
