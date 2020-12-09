package structure;

import javax.swing.JFrame;

import lombok.Data;

@Data

public class Rock extends Structure {

	private final static String TAG = "Rock : ";
	
	public Rock(JFrame app, int xStructure, int yStructure) {
		super(app, "structure/rock.png", "바위", xStructure, yStructure);
		System.out.println(TAG + "만들어짐");
		drawStructure();
	}
	@Override
	public void drawStructure() {
		System.out.println(getXStructure());
		getSsStructure().drawObject(getXStructure(), getYStructure());
		getApp().add(getSsStructure());
	}
}
