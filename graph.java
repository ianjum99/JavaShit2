/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphapp;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.pow;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author LapPC
 */
public class GraphApp extends JFrame {
    
    int x,y;
    int ax,by;
    JComboBox cb,cb1;
    String s = "supposed to be empty";
    String se = "also supposed to be empty";
            
    public GraphApp() {
        setTitle("Graph");
        setSize(900,700);
        String[] graphs = {"Graph 1","Graph 2","Graph 3"};
        cb = new JComboBox(graphs);
        
        cb.setBounds(700,100,120,25);
        add(cb);
        cb.setEditable(true);
        String[] select = {"Draw graph","erase"};
        cb1 = new JComboBox(select);
        
        cb1.setBounds(700,150,100,25);
        add(cb1);
        cb1.setEditable(true);
        
        setLayout(null);//makes sure combo box doesn\t take up the whole screen
        
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x = 30;
        y = 300; 
}
    public void paint(Graphics g){
            g.setColor(Color.BLACK);
            g.drawstring("Design by", 700, 400);
            g.drawstring("ia1526a", 700, 420);
            g.drawString("Y", 310, 40);
            g.drawString("Y'", 310, 600);
            g.drawString("X", 30, 314);
            g.drawString("X'", 600, 314);
            if(x==300&&y==300){
                    g.drawString("Origin(0,0)", 310, 314);
            }
            g.drawString("Select Graphs", 710, 100);
            g.drawLine(300, 30, 300, 600);
            g.drawLine(30,300,600,300);
            if(x>599||y<40){
                    //g.drawString((String) cb.getSelectedItem(), 200, 200);
                    s = (String) cb.getSelectedItem();
                    se = (String) cb1.getSelectedItem();
                    x=30;
                    y=300;
    }
           
            
    if(s.equals("Graph 1")&& se.equals("Draw graph")){
            g.setColor(Color.GREEN);
            run1();
    }
    else if(se.equals("Erase")&& s.equals("Graph 1")){
            g.setColor(new Color(223,237,238));
            run1E(); 
    }
    else if(s.equals("Graph 2")&& se.equals("Draw graph")){
            g.setColor(Color.RED);
            run2();
    }
    else if(se.equals("Erase")&& s.equals("Graph 2")){
            g.setColor(new Color(223,237,238));
            run2E();
    }
    else if(s.equals("Graph 3")&& se.equals("Draw graph")){
            g.setColor(Color.BLUE);
            run3();
    }
    else if(se.equals("Erase")&& s.equals("Graph 3")){
            g.setColor(new Color(223,237,238));
            run3E();
    }
    else{
            g.setColor(Color.white);
            run();
    }
    g.fillOval(x, y, 3, 3);
    
    
    
   repaint();
    }
    public void run(){
        try{
            
            Thread.sleep(1);

            if(x<600&&y>30&&y!=600){
            
            ax = x-300;
            by = y-300;
        ax++;
        
        x = 300 + ax;
        y = 300 - by;
        
        
            }
        }catch(Exception e){
            System.out.println("error");
        }
    }
    public void run1(){
        try{
            Thread.sleep(10);
            
            if(x<600&&y>30&&y!=600){
                ax = x - 300;
                by = y - 300;
            x++;
                
            by = ax - ((ax*ax)/500);
                x = 300 + ax;
                y = 300 - by;
            }

        }catch(Exception e){
            System.out.println("error");
        }
        
    }
    public void run1E(){
        try{
            Thread.sleep(10);
            
            if(x<600&&y>30&&y!=600){
                ax = x - 300;
                by = y - 300;
            x++;
                
            by = ax - ((ax*ax)/500);
                x = 300 + ax;
                y = 300 - by;
            }

        }catch(Exception e){
            System.out.println("error");
        }
        
    }
    public void run2(){
        try{
            Thread.sleep(10);
            
            if(x<600&&y>30&&y!=600){
                ax = x - 300;
                by = y - 300;
            x++;
                
            by = (int) ((Math.log(ax + 1)) + 1 );
                x = 300 + ax;
                y = 300 - by;
            }

        }catch(Exception e){
            System.out.println("error");
        }
        
    }
    public void run2E(){
        try{
            Thread.sleep(10);
            
            if(x<600&&y>30&&y!=600){
                ax = x - 300;
                by = y - 300;
            x++;
                
            by = (int) ((Math.log(ax + 1)) + 1 );
                x = 300 + ax;
                y = 300 - by;
            }

        }catch(Exception e){
            System.out.println("error");
        }
        
    }
    public void run3(){
        try{
            Thread.sleep(10);
            
            if(x<600&&y>30&&y!=600){
                ax = x - 300;
                by = y - 300;
            x++;
                
            by = (int) (pow(Math.E,(ax))- (3 * (ax)));
                x = 300 + ax;
                y = 300 - by;
            }

        }catch(Exception e){
            System.out.println("error");
        }
        
    }
    public void run3E(){
        try{
            Thread.sleep(10);
            
            if(x<600&&y>30&&y!=600){
                ax = x - 300;
                by = y - 300;
            x++;
                
            by = (int) (pow(Math.E,(ax))- (3 * (ax)));
                x = 300 + ax;
                y = 300 - by;
            }

        }catch(Exception e){
            System.out.println("error");
        }
    }        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new GraphApp();{
        
        Thread t1 = new Thread();
        t1.start();
    }
    }
}

