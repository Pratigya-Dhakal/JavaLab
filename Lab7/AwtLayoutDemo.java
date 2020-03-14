import java.awt.*;
class AwtLayoutDemo{
	AwtLayoutDemo()
	{
	Frame f=new Frame("AwtLayoutDemo");
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
	
		MenuBar mb=new MenuBar();  
         Menu file=new Menu("File");
          Menu edit=new Menu("Edit");
           Menu window=new Menu("Window");

         Menu saveas=new Menu("Save As");   
         MenuItem n=new MenuItem("New");  
         MenuItem open=new MenuItem("Open");   
         MenuItem old=new MenuItem("Old");  
         MenuItem ni=new MenuItem("New"); 
         MenuItem cut=new MenuItem("Cut");  
         MenuItem copy=new MenuItem("Copy");
         file.add(n);
         file.add(open);
         file.add(saveas);
        saveas.add(old);
        saveas.add(ni);
        edit.add(cut);
        edit.add(copy);

		mb.add(file);  
		mb.add(edit);
		mb.add(window);
		file.add(saveas);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);


         f.add(new Label("Name: "));
            TextField tf = new TextField("");
            tf.setBounds(50, 100, 200, 30);
        f.add(tf);

        f.add(new Label("Bio: "));
            TextArea ta = new TextArea("", 10, 20);
            // ta.setBounds(100, 50, 50, 40);
        f.add(ta);

        f.add(new Label("Country: "));
            Choice c = new Choice();
            c.add("Nepal");
            c.add("India");
            
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
		new	AwtLayoutDemo();
	}
}

