import java.awt.*;

class FrameGrid
{
	FrameGrid()
	{
		Frame f = new Frame();
		Panel p1 = new Panel();
		Panel p2 = new Panel();

			f.setSize(800, 800);
			f.setVisible(true);
			f.setLayout(new GridLayout(0,2,10, 20));
			f.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

			p1.setSize(100, 100);
			p1.setVisible(true);

			p2.setSize(100, 100);
			p2.setVisible(true);

		f.add(new Label("Name: "));
			TextField tf = new TextField("");
			tf.setBounds(20, 10, 20, 3);
		f.add(tf);

		f.add(new Label("Bio: "));
			TextArea ta = new TextArea("", 10, 20);
			// ta.setBounds(100, 50, 50, 40);
		f.add(ta);

		f.add(new Label("Country: "));
			Choice c = new Choice();
			c.add("Nepal");
			c.add("India");
			c.add("China");
			f.add(c);

		f.add(new Label("Hobbies: "));
			Checkbox c1 = new Checkbox("Dancing");
			Checkbox c2 = new Checkbox("Singing");
			
				p1.add(c1); p1.add(c2);
		f.add(p1);

		f.add(new Label("Gender: "));
			CheckboxGroup cb = new CheckboxGroup();
				Checkbox g1 = new Checkbox("Female", cb , false);
				Checkbox g2 = new Checkbox("Male", cb , true);
							
		p2.add(g1); p2.add(g2); 
		f.add(p2);

		
	}

	public static void main(String[] args) {
		new FrameGrid();
	}
}