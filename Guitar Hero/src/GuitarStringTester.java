/*****************************************************************************
 /*****************************************************************************
 *  Plays two guitar strings (concert A and concert C) when the user
 *  types the lowercase letters 'a' and 'c', respectively in the 
 *  standard drawing window.
 *	Name: Andre Zhang
 *	Partner Name: Thanh Duong
 ***************************************************************************/
import java.util.*;

public class GuitarStringTester   {
	private  GuitarString[] notes;
	private  String Keyboard ; 
	private String chord;
	private int index;
	
	public GuitarStringTester() {
		
		Keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
		chord = "";
		index = 0;
		notes = new GuitarString[37];
        for (int i=0;i<notes.length;i++) {
        	notes[i] = new GuitarString(440*Math.pow(1.05956,i-24));
        }
	}

    public static void main(String[] args) 
    {
        GuitarStringTester  a = new GuitarStringTester();
        a.runMain();
    }
    
    public void runMain() {
    	
        notes = new GuitarString[37];
        for (int i=0;i<notes.length;i++) {
        	notes[i] = new GuitarString(440*Math.pow(1.05956,i-24));
        } 
        Scanner kb = new Scanner( System.in );
        // the user types this character
        String key = kb.next();
        playNotes(key);
        
    }
		private void plucker(int i) {
			notes[i].pluck();
        	 for (int c=0;c<44100;c++) {
             	double sample = notes[i].sample();
             	StdAudio.play(sample);
             	notes[i].tic();
             }
		}
		
		public void playNotes(char key) {
			plucker(Keyboard.indexOf(key));
		}
		
		public void playNotes(String key) {
			
			for (int i=0;i<key.length();i++) {
				try {
				int note = Keyboard.indexOf(key.charAt(i));
				notes[note].pluck();
				}
				catch(Exception e) {
					return;
				}
			}
				
			for (int c=0;c<22050;c++) {
				double sample = 0;
				for (int i=0;i<key.length();i++) {
					int note = Keyboard.indexOf(key.charAt(i));
					sample +=notes[note].sample();
					notes[note].tic();
				}
				StdAudio.play(sample);
	        }
		}
		
}