import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame
{
	// set contents for JFrame
	private JTextField answerField;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero, decimal, negative, add, sub, multiply, div, sq, sqr, equals, clear, back;
	private String stemp1, stemp2, sanswer;
	private double answer = 0.0;
	private JPanel contentPanel;
	private boolean equalIsClicked = false, opChosen = false;
	char operation = ' ';
	
	public Gui()
	{
		// calculator's answer field
		answerField = new JTextField(null, 20);
		answerField.setEditable(false);
		
		// calculator's buttons
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		decimal = new JButton(",");
		negative = new JButton("±");
		add = new JButton("+");
		sub = new JButton("-");
		multiply = new JButton("*");
		div = new JButton("/");
		sq = new JButton("x²");
		sqr = new JButton("√");
		equals = new JButton("=");
		clear = new JButton("c");
		back = new JButton("←");
		
		// set buttons' size
		Dimension dim = new Dimension(75, 25);
		
		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		zero.setPreferredSize(new Dimension(225, 25));
		decimal.setPreferredSize(new Dimension (112, 25));
		negative.setPreferredSize(new Dimension (112, 25));
		add.setPreferredSize(new Dimension (112, 25));
		sub.setPreferredSize(new Dimension (112, 25));
		multiply.setPreferredSize(new Dimension (112, 25));
		div.setPreferredSize(new Dimension (112, 25));
		sq.setPreferredSize(new Dimension (112, 25));
		sqr.setPreferredSize(new Dimension (112, 25));
		equals.setPreferredSize(new Dimension (225, 25));
		clear.setPreferredSize(new Dimension(225, 25));
		back.setPreferredSize(new Dimension(225, 25));
		
		// buttons' functionality
		Numbers n = new Numbers();
		Calc c = new Calc();
		
		// action listeners to implement functionality
		one.addActionListener(n); 
		two.addActionListener(n); 
		three.addActionListener(n); 
		four.addActionListener(n); 
		five.addActionListener(n); 
		six.addActionListener(n); 
		seven.addActionListener(n); 
		eight.addActionListener(n); 
		nine.addActionListener(n); 
		zero.addActionListener(n); 
		decimal.addActionListener(n); 
		negative.addActionListener(n);
		back.addActionListener(n);
		
		add.addActionListener(c); 
		sub.addActionListener(c); 
		multiply.addActionListener(c);
		div.addActionListener(c); 
		equals.addActionListener(c); 
		clear.addActionListener(c);
		sq.addActionListener(c); 
		sqr.addActionListener(c);
		
		// JPanel and layout
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.RED);
		contentPanel.setLayout(new FlowLayout());
		
		// add answer field and all buttons to JPanel
		contentPanel.add(answerField, BorderLayout.NORTH);
		contentPanel.add(one); 
		contentPanel.add(two); 
		contentPanel.add(three); 
		contentPanel.add(four); 
		contentPanel.add(five); 
		contentPanel.add(six); 
		contentPanel.add(seven); 
		contentPanel.add(eight); 
		contentPanel.add(nine); 
		contentPanel.add(zero); 
		contentPanel.add(decimal); 
		contentPanel.add(negative); 
		contentPanel.add(add); 
		contentPanel.add(sub); 
		contentPanel.add(multiply); 
		contentPanel.add(div); 
		contentPanel.add(sq); 
		contentPanel.add(sqr); 
		contentPanel.add(equals); 
		contentPanel.add(clear); 
		contentPanel.add(back);
		
		// set JPanel
		this.setContentPane(contentPanel);
	}
	
	// functionality for all numbers, decimal point, negative value and backspace
	private class Numbers implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JButton src = (JButton) event.getSource();
			
			/* Add a correct value of a pressed button as a character to the end of the temporary
			 *  string (stemp1 or stemp2) to show on the answer field. Boolean opChosen is set to
			 *  true only if operation was already chosen. 
			 */
			if (src.equals(one))
			{
				if (opChosen == false)
				{
					if (stemp1 == null)
					{
						stemp1 = "1";
					} 
					else 
					{
						stemp1 += "1";
					}
				}
				else 
				{
					if (stemp2 == null)
					{
						stemp2 = "1";
					} 
					else 
					{
						stemp2 += "1";
					}
				}
			}
			if (src.equals(two))
			{
				if (opChosen == false)
				{
					if (stemp1 == null)
					{
						stemp1 = "2";
					} 
					else 
					{
						stemp1 += "2";
					}
				}
				else 
				{
					if (stemp2 == null)
					{
						stemp2 = "2";
					} else {
						stemp2 += "2";
					}
				}
			}
			if (src.equals(three))
			{
				if (opChosen == false)
				{
					if (stemp1 == null)
					{
						stemp1 = "3";
					} 
					else 
					{
						stemp1 += "3";
					}
				}
				else 
				{
					if (stemp2 == null)
					{
						stemp2 = "3";
					} 
					else 
					{
						stemp2 += "3";
					}
				}
			}
			if (src.equals(four))
			{
				if (opChosen == false)
				{
					if (stemp1 == null)
					{
						stemp1 = "4";
					} 
					else 
					{
						stemp1 += "4";
					}
				}
				else 
				{
					if (stemp2 == null)
					{
						stemp2 = "4";
					} 
					else 
					{
						stemp2 += "4";
					}
				}
			}
			if (src.equals(five))
			{
				if (opChosen == false)
				{
					if (stemp1 == null)
					{
						stemp1 = "5";
					} 
					else 
					{
						stemp1 += "5";
					}
				}
				else 
				{
					if (stemp2 == null)
					{
						stemp2 = "5";
					} 
					else 
					{
						stemp2 += "5";
					}
				}
			}
			if (src.equals(six))
			{
				if (opChosen == false)
				{
					if (stemp1 == null)
					{
						stemp1 = "6";
					} 
					else 
					{
						stemp1 += "6";
					}
				}
				else 
				{
					if (stemp2 == null)
					{
						stemp2 = "6";
					} 
					else 
					{
						stemp2 += "6";
					}
				}
			}
			if (src.equals(seven))
			{
				if (opChosen == false)
				{
					if (stemp1 == null)
					{
						stemp1 = "7";
					} 
					else 
					{
						stemp1 += "7";
					}
				}
				else 
				{
					if (stemp2 == null)
					{
						stemp2 = "7";
					} 
					else 
					{
						stemp2 += "7";
					}
				}
			}
			if (src.equals(eight))
			{
				if (opChosen == false)
				{
					if (stemp1 == null)
					{
						stemp1 = "8";
					} 
					else 
					{
						stemp1 += "8";
					}
				}
				else 
				{
					if (stemp2 == null)
					{
						stemp2 = "8";
					} 
					else 
					{
						stemp2 += "8";
					}
				}
			}
			if (src.equals(nine))
			{
				if (opChosen == false)
				{
					if (stemp1 == null)
					{
						stemp1 = "9";
					} 
					else 
					{
						stemp1 += "9";
					}
				}
				else 
				{
					if (stemp2 == null)
					{
						stemp2 = "9";
					} 
					else 
					{
						stemp2 += "9";
					}
				}
			}
			if (src.equals(zero))
			{
				if (opChosen == false)
				{
					if (stemp1 == null)
					{
						stemp1 = "0";
					} 
					else 
					{
						stemp1 += "0";
					}
				}
				else 
				{
					if (stemp2 == null)
					{
						stemp2 = "0";
					} 
					else 
					{
						stemp2 += "0";
					}
				}
			}
			
			// same logic for decimal point, but only one point is allowed. Add "0." if string is empty
			if (src.equals(decimal))
			{
				if (opChosen == false)
				{
					if (stemp1 == null)
					{
						stemp1 = "0.";
					} 
					else 
						if(stemp1 != null)
						{
							if(stemp1.contains("."))
							{
								System.out.println("You already have a decimal point!");
							}
							else 
							{
								stemp1 += ".";
							}
					}
				}
				else 
				{
					if (stemp2 == null)
					{
						stemp2 = "0.";
					} 
					else 
						if (stemp2 != null)
						{
							if(stemp2.contains("."))
							{
								System.out.println("You already have a decimal point!");
							}
							else 
							{
								stemp2 += ".";
							}
					}
				}
			}
			
			// add (or remove if already occurred) a "-" to represent a negative value
			if (src.equals(negative))
			{
				if (opChosen == false)
				{
					if (stemp1 == null)
					{
						stemp1 = "-";
					} 
					else 
						if(stemp1 != null && stemp1.startsWith("-"))
						{
						stemp1 = stemp1.substring(1);
					}
						else
						{
						stemp1 = "-" + stemp1;
						}
				}
				else 
				{
					if (stemp2 == null)
					{
						stemp2 = "-";
					} 
					else 
						if(stemp2 != null && stemp2.startsWith("-"))
						{
							stemp2 = stemp2.substring(1);
						}
						else 
						{
							stemp2 = "-" + stemp2;
						}
				}
			}
			// backspace button to delete last digit
			if(src.equals(back))
			{
				if(opChosen == false)
				{
					if(stemp1 == null)
					{
						System.out.println("Can't delete nothing!");
					}
					else 
					{
						stemp1 = stemp1.substring(0, stemp1.length() - 1);
					}
				}
				else 
					if(stemp2 == null)
					{
						System.out.println("Can't delete nothing!");
					}
					else 
					{
						stemp2 = stemp2.substring(0, stemp2.length() - 1);
					}
			}
			
		// display the the digits on the answer field
		if(equalIsClicked == false)
		{
			if(opChosen==false)
			{
				answerField.setText(stemp1);
			}
			else
			{
				answerField.setText(stemp2);
			}
		}
			
		}
	}
	
	/* Functionality for all calculations
	 * BUG FIX: make sure stemp1 or stemp2 is not "-" or "-."
	 * (fixed 07/07/16)
	 */
	private class Calc implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JButton src = (JButton) event.getSource();
			
			/* For [+, -, *, /] - check if first temporary string (stemp1) is null, then 
			 * check if opChosen is true, if not, set opChosen to true and add a correct 
			 * value to operation variable which will be passed to switch/case block. Also, 
			 * allow to choose only one operation per calculation (might as well fix this later).
			 */
			if(src.equals(add))
			{
				if(stemp1 == null || stemp1.equals("-") || stemp1.equals("-."))
				{
					System.out.println("Choose your numbers first!");
				}
				if(opChosen)
				{
					System.out.println("One operation only!");
				}
				else
				{
					if(stemp1 != null && stemp2 == null)
					{
						opChosen = true;
						operation = '+';
					}
					else
					{
						if(stemp1 != null && stemp2 != null)
						{
							System.out.println("One operation only!");
						}
					}
				}
			}
			if(src.equals(sub))
			{
				if(stemp1 == null || stemp1.equals("-") || stemp1.equals("-."))
				{
					System.out.println("Choose your numbers first!");
				}
				if(opChosen)
				{
					System.out.println("One operation only!");
				}
				else
				{
					if(stemp1 != null && stemp2 == null)
					{
						opChosen = true;
						operation = '-';
					}
					else
					{
						if(stemp1 != null && stemp2 != null)
						{
							System.out.println("One operation only!");
						}
					}
				}
			}
			if(src.equals(multiply))
			{
				if(stemp1 == null || stemp1.equals("-") || stemp1.equals("-."))
				{
					System.out.println("Choose your numbers first!");
				}
				if(opChosen)
				{
					System.out.println("One operation only!");
				}
				else
				{
					if(stemp1 != null && stemp2 == null)
					{
						opChosen = true;
						operation = '*';
					}
					else
					{
						if(stemp1 != null && stemp2 != null)
						{
							System.out.println("One operation only!");
						}
					}
				}
			}
			if(src.equals(div))
			{
				if(stemp1 == null || stemp1.equals("-") || stemp1.equals("-."))
				{
					System.out.println("Choose your numbers first!");
				}
				if(opChosen)
				{
					System.out.println("One operation only!");
				}
				else
				{
					if(stemp1 != null && stemp2 == null)
					{
						opChosen = true;
						operation = '/';
					}
					else
					{
						if(stemp1 != null && stemp2 != null)
						{
							System.out.println("One operation only!");
						}
					}
				}
			}
			
			/* For square and square root [sq, sqr] operations second number is not needed so
			 * operation variable will not be passed to switch/case block. Instead, it is 
			 * calculated in this block: temporary string (stemp1) is parsed as a double,
			 * calculated by a function and displayed at the answer field straight away.
			 */
			if(src.equals(sq))
			{
				if(stemp1 == null || stemp1.equals("-") || stemp1.equals("-."))
				{
					System.out.println("Choose you number first!");
				}
				if(opChosen)
				{
					System.out.println("One operation only!");
				}
				else 
				{
					if(stemp1 != null && (stemp1.equals("-") == false) && (stemp1.equals("-.") == false))
					{
						opChosen = true;
						operation = '^';
						double sq1 = 0.0;
						sq1 = Double.parseDouble(stemp1);
						answer = sq1 * sq1;
						sanswer = Double.toString(answer);
						answerField.setText(sanswer);
					}
				}
			}
			
			if(src.equals(sqr))
			{
				if(stemp1 == null || stemp1.equals("-") || stemp1.equals("-."))
				{
					System.out.println("Choose your number first!");
				}
				if(opChosen)
				{
					System.out.println("One operation only!");
				}
				else
				{
					if(stemp1 != null && (stemp1.equals("-") == false) && (stemp1.equals("-.") == false))
					{
						opChosen = true;
						operation = '&';
						double sqr1 = 0.0;
						sqr1 = Double.parseDouble(stemp1);
						if (sqr1 > 0)
						{
							answer = Math.sqrt(sqr1);
							sanswer = Double.toString(answer);
							answerField.setText(sanswer);
						}
						else
						{
							answerField.setText("No Square root out of negative number.");
						}
					}
				}
			}
			
			/* For [+, -, *, /] - ensure both stemp1 and stemp2 are not null; and that operations
			 * are not sq or sqr. Then check if stemp1 and stemp2 are valid (i.e. not "-" or "-.").
			 * Parse both temporary strings as doubles, pass them to switch/case block, make calculations
			 * accordingly and display the result as a string on the answer field.
			 * Handle "divide by 0". 
			 */
			if(src.equals(equals))
			{
				if(stemp1 == null)
				{
					System.out.println("Choose BOTH numbers first!");
				}
				else
				{
					if(stemp1 != null && stemp2 == null && operation != '^' && operation != '&')
					{
						System.out.println("Choose BOTH numbers first!");
					}
				if(stemp1 != null && (stemp1.equals("-") == false) && (stemp1.equals("-.") == false) && 
						stemp2 != null && (stemp2.equals("-") == false) && (stemp2.equals("-.") == false))
				{
					double d1 = 0.0, d2 = 0.0;
					d1 = Double.parseDouble(stemp1);
					d2 = Double.parseDouble(stemp2);
					
					switch(operation)
					{
					case '+':
						answer = d1 + d2;
						break;
					case '-':
						answer = d1 - d2;
						break;
					case '*':
						answer = d1 * d2;
						break;
					case '/':
						answer = d1 / d2;
						break;
					}
					
					sanswer = Double.toString(answer);
					answerField.setText(sanswer);
					if (operation == '/' && d2 == 0.0)
					{
						answerField.setText("DIVIDE BY 0 ERROR");
					}
				}
					}
				}
			// set initial values if "clear" button is pressed
			if (src.equals(clear))
			{
				stemp1 = null;
				stemp2 = null;
				equalIsClicked = false;
				opChosen = false;
				operation = ' ';
				answerField.setText(null);
				sanswer = null;
			}
			}
		}
}
