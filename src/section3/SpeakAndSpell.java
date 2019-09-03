package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("e.g. spell mandlebrot");
		// 2. Catch the user's answer in a String
String answer =  JOptionPane.showInputDialog("How do you spell this?");

		// 3. If the user spelled the word correctly, speak "correct"
if (answer.equals ("mandlebrot")) {
speak("Correct!");
}
		// 4. Otherwise say "wrong"
else {
speak("Wrong");
}
		// 5. repeat the process for other words
speak("e.g. spell elephant");
// 2. Catch the user's answer in a String
answer =  JOptionPane.showInputDialog("How do you spell this?");

// 3. If the user spelled the word correctly, speak "correct"
if (answer.equals ("elephant")) {
speak("Correct!");
}
// 4. Otherwise say "wrong"
else {
speak("Wrong");
}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


