import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 * Created by SiyuanZeng's on 11/30/2016.
 */
public class t {
        private static final String VOICENAME_kevin = "kevin";
        private String text; // string to speech

        public t(String text) {
            this.text = text;
        }

        public void speak() {
            Voice voice;
            VoiceManager voiceManager = VoiceManager.getInstance();
            voice = voiceManager.getVoice(VOICENAME_kevin);
            voice.allocate();
            voice.speak(text);
        }

        public static void main(String[] args) {
            String text = "FreeTTS was written by the Sun Microsystems Laboratories "
                    + "Speech Team and is based on CMU's Flite engine.";
            t freeTTS = new t(text);
            freeTTS.speak();
        }
    }
