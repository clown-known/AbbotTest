/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import abbot.finder.Matcher;
import abbot.tester.JButtonTester;
import dateTimeChecker.*;
import junit.extensions.abbot.ComponentTestFixture;
import junit.extensions.abbot.TestHelper;

/**
 *
 * @author LapTop
 */
public class DateTimeCheckerTest extends ComponentTestFixture{
	
	private JButtonTester tester;
	
    public void testFontTille() throws Throwable{
    	DateTimeChecker frTest = new DateTimeChecker();
    	showWindow(frTest);
    	tester = new JButtonTester();
    	
    	JLabel lbtitle = (JLabel)getFinder().find(frTest,new Matcher() {	
			@Override
			public boolean matches(Component c) {	
				return c.getClass().equals(JLabel.class)
						&&c.getName().equals("lbtitle");
			}
		});

    	tester.actionDelay(1000);
    	String fontName = lbtitle.getFont().getName();
    	String expFont = "Arial"; 
    	assertEquals("Not exactly font", expFont,fontName);
    }
	
//    public void testFormatForDay() throws Throwable{
//    	DateTimeChecker frTest = new DateTimeChecker();
//    	showWindow(frTest);
//    	tester = new JButtonTester();
//    	
//    	JTextField txtyear = (JTextField)getFinder().find(frTest,new Matcher() {	
//			@Override
//			public boolean matches(Component c) {	
//				return c.getClass().equals(JTextField.class)
//						&&c.getName().equals("txtyear");
//			}
//		});
//    	
//    	JTextField txtmonth = (JTextField)getFinder().find(frTest,new Matcher() {	
//			@Override
//			public boolean matches(Component c) {	
//				return c.getClass().equals(JTextField.class)
//						&&c.getName().equals("txtmonth");
//			}
//		});
//    	
//    	JTextField txtday = (JTextField)getFinder().find(frTest,new Matcher() {	
//			@Override
//			public boolean matches(Component c) {	
//				return c.getClass().equals(JTextField.class)
//						&&c.getName().equals("txtday");
//			}
//		});
//    	
//    	txtday.setText("1");
//    	tester.actionDelay(3000);
//    	txtmonth.setText("1");
//    	tester.actionDelay(3000);
//    	txtyear.setText("1");
//    	
//    	JButton btncheck = (JButton)getFinder().find(frTest,new Matcher() {	
//			@Override
//			public boolean matches(Component c) {		
//				return c.getClass().equals(JButton.class)
//						&&c.getName().equals("btncheck");
//			}
//		});
//    	
//    	tester.actionClick(btncheck);
//    	
//    	tester.actionDelay(3000);
//    	ResultDialog rsDialog = frTest.r;
//
//    	JLabel txtresult = (JLabel)getFinder().find(rsDialog,new Matcher() {	
//			@Override
//			public boolean matches(Component c) {
//				return c.getClass().equals(JLabel.class)
//						&&c.getName().equals("txtresult");
//			}
//		});
//    	assertEquals("Not exactly result", "Year is out of range",txtresult.getText());
//    }
       
//    public void testButtonClear() throws Throwable{
//    	DateTimeChecker frTest = new DateTimeChecker();
//    	showWindow(frTest);
//    	
//    	JTextField txtyear = (JTextField)getFinder().find(frTest,new Matcher() {	
//			@Override
//			public boolean matches(Component c) {	
//				return c.getClass().equals(JTextField.class)
//						&&c.getName().equals("txtyear");
//			}
//		});
//    	
//    	JTextField txtmonth = (JTextField)getFinder().find(frTest,new Matcher() {	
//			@Override
//			public boolean matches(Component c) {	
//				return c.getClass().equals(JTextField.class)
//						&&c.getName().equals("txtmonth");
//			}
//		});
//    	
//    	JTextField txtday = (JTextField)getFinder().find(frTest,new Matcher() {	
//			@Override
//			public boolean matches(Component c) {	
//				return c.getClass().equals(JTextField.class)
//						&&c.getName().equals("txtday");
//			}
//		});
//    	
//    	txtday.setText("1");
//    	txtyear.setText("1");
//    	txtmonth.setText("1");
//    	
//    	JButton btnclear = (JButton)getFinder().find(frTest,new Matcher() {	
//			@Override
//			public boolean matches(Component c) {		
//				return c.getClass().equals(JButton.class)
//						&&c.getName().equals("btnclear");
//			}
//		});
//    	
//    	tester = new JButtonTester();
//    	tester.actionClick(btnclear);
//    	tester.actionDelay(3000);
//
//    	assertEquals("Button clear not work.", "",
//    			txtmonth.getText()+txtday.getText()+txtyear.getText());
//
//    }
    
    public DateTimeCheckerTest(String name) {
		super(name);
	}
    public static void main(String[] args) {
    	TestHelper.runTests(args, DateTimeCheckerTest.class);
    }
}
