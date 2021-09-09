import java.util.Scanner;
public class PhoneNumber {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Telephone: ");
		String s = keyboard.next();
		// print numbers will iterate through the given input and change characters to numbers
		//printNumbers(s);
		
		// Prints out overloaded method as a full string
		//System.out.print(getNumber(s));
		
	}
	
	
	//Iteration through a given input that converts numbers and char to a numerical value and returns as a char string
	public static void printNumbers(String s) {
		char ch;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			System.out.print(getNumber(ch));
		}
		
	}
	
	
	//Obtains each individual char and returns said char as a number
	public static char getNumber(char c) {
		if (c == 'a' || c == 'b' || c == 'c') {
			c = '2';
		}else {
			if (c == 'd' || c == 'e' || c == 'f') {
				c = '3';
			}else {
				if (c == 'g' || c == 'h' || c == 'i') {
					c = '4';
				}else {
					if (c == 'j' || c == 'k' || c == 'l') {
						c = '5';
					}else
						if (c == 'm' || c == 'n' || c == 'o') {
							c = '6';
						}else {
							if (c == 'p' || c == 'q' || c == 'r' || c == 's') {
								c = '7';
							}else {
								if (c == 't' || c == 'u' || c == 'v') {
									c = '8';
								}else {
									if (c == 'w' || c == 'x' || c == 'y' || c == 'z') {
										c = '9';
									}else {
										if (c == '0') {
											c = '0';
										}else {
											if (c == '*') {
												c = '*';
											}else {
												if (c == '#') {
													c = '#';
												}
											}
										}
									}
								}
							}
						}
				}
				
			}
		}
		
		return c;
	}
	
	public static String getNumber(String x) {
		String fullstring = "";
		x = x.toLowerCase();
		for (int i = 0; i < x.length(); i++) {
			char ch = x.charAt(i);
			if (ch == 'a' || ch == 'b' || ch == 'c') {
				fullstring = fullstring + "2";
			}else {
				if (ch == 'd' || ch == 'e' || ch == 'f') {
					fullstring = fullstring + "3";
				}else {
					if (ch == 'g' || ch == 'h' || ch == 'i') {
						fullstring = fullstring + "4";
					}else {
						if (ch == 'j' || ch == 'k' || ch == 'l') {
							fullstring = fullstring + "5";
						}else
							if (ch == 'm' || ch == 'n' || ch == 'o') {
								fullstring = fullstring + "6";
							}else {
								if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') {
									fullstring = fullstring + "7";
								}else {
									if (ch == 't' || ch == 'u' || ch == 'v') {
										fullstring = fullstring + "8";
									}else {
										if (ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
											fullstring = fullstring + "9";
										}else {
											if (ch == '0') {
												fullstring = fullstring + "0";
											}else {
												if (ch == '*') {
													fullstring = fullstring + "*";
												}else {
													if (ch == '#') {
														fullstring = fullstring + "#";
													}else {
														if (ch == '1') {
															fullstring = fullstring + "1";
														}else {
															if (ch == '2') {
																fullstring = fullstring + "2";
															}else {
																if (ch == '3') {
																	fullstring = fullstring + "3";
																}else {
																	if (ch == '4') {
																		fullstring = fullstring + "4";
																	}else {
																		if (ch == '5') {
																			fullstring = fullstring + "5";
																		}else {
																			if (ch == '6') {
																				fullstring = fullstring + "6";
																			}else {
																				if (ch == '7') {
																					fullstring = fullstring + "7";
																				}else {
																					if (ch == '8') {
																						fullstring = fullstring + "8";
																					}else {
																						if (ch == '9') {
																							fullstring = fullstring + "9";
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
					}
					
				}
			}
		}
		
		return fullstring;
	}
}
