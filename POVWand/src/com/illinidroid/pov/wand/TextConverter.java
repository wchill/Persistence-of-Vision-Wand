package com.illinidroid.pov.wand;

public class TextConverter {

	private static final int WIDTH = 12;
	private static final int HEIGHT = 20;

	public static boolean[][] convert(String s) {
		boolean[][] output = new boolean[s.length() * WIDTH][HEIGHT];
		for (int i = 0; i < s.length(); i++) {
			boolean[][] temp;
			switch (s.charAt(i)) {
			case 'A':
			case 'a':
				temp = convertArray(letterA);
				break;
			case 'B':
			case 'b':
				temp = convertArray(letterB);
				break;
			case 'C':
			case 'c':
				temp = convertArray(letterC);
				break;
			case 'D':
			case 'd':
				temp = convertArray(letterD);
				break;
			case 'E':
			case 'e':
				temp = convertArray(letterE);
				break;
			case 'F':
			case 'f':
				temp = convertArray(letterF);
				break;
			case 'G':
			case 'g':
				temp = convertArray(letterG);
				break;
			case 'H':
			case 'h':
				temp = convertArray(letterH);
				break;
			case 'I':
			case 'i':
				temp = convertArray(letterI);
				break;
			case 'J':
			case 'j':
				temp = convertArray(letterJ);
				break;
			case 'K':
			case 'k':
				temp = convertArray(letterK);
				break;
			case 'L':
			case 'l':
				temp = convertArray(letterL);
				break;
			case 'M':
			case 'm':
				temp = convertArray(letterM);
				break;
			case 'N':
			case 'n':
				temp = convertArray(letterN);
				break;
			case 'O':
			case 'o':
				temp = convertArray(letterO);
				break;
			case 'P':
			case 'p':
				temp = convertArray(letterP);
				break;
			case 'Q':
			case 'q':
				temp = convertArray(letterQ);
				break;
			case 'R':
			case 'r':
				temp = convertArray(letterR);
				break;
			case 'S':
			case 's':
				temp = convertArray(letterS);
				break;
			case 'T':
			case 't':
				temp = convertArray(letterT);
				break;
			case 'U':
			case 'u':
				temp = convertArray(letterU);
				break;
			case 'V':
			case 'v':
				temp = convertArray(letterV);
				break;
			case 'W':
			case 'w':
				temp = convertArray(letterW);
				break;
			case 'X':
			case 'x':
				temp = convertArray(letterX);
				break;
			case 'Y':
			case 'y':
				temp = convertArray(letterY);
				break;
			case 'Z':
			case 'z':
				temp = convertArray(letterZ);
				break;
			default:
				temp = convertArray(letterSpace);
				break;
			}
			System.arraycopy(temp, 0, output, WIDTH * i, temp.length);
			
		}
		return output;
	}

	public static boolean[][] convertArray(boolean[] array) {
		boolean[][] output = new boolean[WIDTH][HEIGHT];
		for (int i = 0; i < array.length; i++) {
			output[i % 12][i / 12] = array[i];
		}
		return output;
	}

	static boolean[] letterA = { false, false, false, false, true, true, true,
			true, false, false, false, false, false, false, false, true, true,
			true, true, true, true, false, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			true, true, true, true, true, true, true, true, true, true, false,
			true, true, true, true, true, false, false, true, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, false, false,
			false, false, true, true, true, true, true, true, true, true,
			false, false, false, false, true, true, true, true, true, true,
			true, true, false, false, false, false, true, true, true, true,
			true, true, true, true, false, false, false, false, true, true,
			true, true, true, true, true, true, false, false, false, false,
			true, true, true, true, true, true, true, true, false, false,
			false, false, true, true, true, true, };

	static boolean[] letterB = { true, true, true, true, true, true, true,
			true, true, true, false, false, true, true, true, true, true, true,
			true, true, true, true, true, false, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, false, false, false, true, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, false, true, true, true, true, true,
			true, true, true, true, true, false, false, true, true, true, true,
			true, true, true, true, true, true, true, false, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, false, false, false, true, true, true, true, true,
			true, true, true, true, false, false, false, false, true, true,
			true, true, true, true, true, true, false, false, false, false,
			true, true, true, true, true, true, true, true, false, false,
			false, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, false, true, true,
			true, true, true, true, true, true, true, true, false, false, };

	static boolean[] letterC = { false, false, false, false, true, true, true,
			true, true, true, true, false, false, false, true, true, true,
			true, true, true, true, true, true, true, false, true, true, true,
			true, true, true, true, true, true, true, true, false, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, false, false, false, false, true, true,
			true, true, true, true, true, false, false, false, false, false,
			false, false, true, true, true, true, false, false, false, false,
			false, false, false, false, true, true, true, true, false, false,
			false, false, false, false, false, false, true, true, true, true,
			false, false, false, false, false, false, false, false, true, true,
			true, true, false, false, false, false, false, false, false, false,
			true, true, true, true, false, false, false, false, false, false,
			false, false, true, true, true, true, false, false, false, false,
			false, false, false, false, true, true, true, true, false, false,
			false, false, false, false, false, false, true, true, true, true,
			false, false, false, false, false, false, false, false, true, true,
			true, true, true, false, false, false, false, false, false, false,
			true, true, true, true, true, true, false, false, false, false,
			true, true, false, true, true, true, true, true, true, true, true,
			true, true, true, false, true, true, true, true, true, true, true,
			true, true, true, true, false, false, true, true, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, false, };

	static boolean[] letterD = { true, true, true, true, true, true, true,
			true, true, false, false, false, true, true, true, true, true,
			true, true, true, true, true, true, false, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, false, false, false, true, true, true, true, true,
			true, true, true, true, false, false, false, false, true, true,
			true, true, true, true, true, true, false, false, false, false,
			true, true, true, true, true, true, true, true, false, false,
			false, false, true, true, true, true, true, true, true, true,
			false, false, false, false, true, true, true, true, true, true,
			true, true, false, false, false, false, true, true, true, true,
			true, true, true, true, false, false, false, false, true, true,
			true, true, true, true, true, true, false, false, false, false,
			true, true, true, true, true, true, true, true, false, false,
			false, false, true, true, true, true, true, true, true, true,
			false, false, false, false, true, true, true, true, true, true,
			true, true, false, false, false, false, true, true, true, true,
			true, true, true, true, false, false, false, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, false, true, true, true, true, true, true,
			true, true, true, false, false, false, };

	static boolean[] letterE = { true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, false, false, false, false, false, false, false, false, true,
			true, true, true, false, false, false, false, false, false, false,
			false, true, true, true, true, false, false, false, false, false,
			false, false, false, true, true, true, true, false, false, false,
			false, false, false, false, false, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, false, false, false, false, false, false, false,
			false, true, true, true, true, false, false, false, false, false,
			false, false, false, true, true, true, true, false, false, false,
			false, false, false, false, false, true, true, true, true, false,
			false, false, false, false, false, false, false, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, };

	static boolean[] letterF = { true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, false, false, false, false, false, false, false, false, true,
			true, true, true, false, false, false, false, false, false, false,
			false, true, true, true, true, false, false, false, false, false,
			false, false, false, true, true, true, true, false, false, false,
			false, false, false, false, false, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, false, false, false, false, false, false, false,
			false, true, true, true, true, false, false, false, false, false,
			false, false, false, true, true, true, true, false, false, false,
			false, false, false, false, false, true, true, true, true, false,
			false, false, false, false, false, false, false, true, true, true,
			true, false, false, false, false, false, false, false, false, true,
			true, true, true, false, false, false, false, false, false, false,
			false, true, true, true, true, false, false, false, false, false,
			false, false, false, true, true, true, true, false, false, false,
			false, false, false, false, false, };

	static boolean[] letterG = { false, false, false, false, true, true, true,
			true, true, false, false, false, false, false, true, true, true,
			true, true, true, true, true, true, false, false, true, true, true,
			true, true, true, true, true, true, true, true, false, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, false, false, true, true, true, true, true,
			true, true, true, true, false, false, false, false, false, false,
			false, true, true, true, true, false, false, false, false, false,
			false, false, false, true, true, true, true, false, false, false,
			false, false, false, false, false, true, true, true, true, false,
			false, false, false, false, false, false, false, true, true, true,
			true, false, false, true, true, true, true, true, true, true, true,
			true, true, false, false, true, true, true, true, true, true, true,
			true, true, true, false, false, true, true, true, true, true, true,
			true, true, true, true, false, false, true, true, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, true, false, false,
			false, true, true, true, true, true, true, true, true, true, true,
			false, false, true, true, true, true, false, true, true, true,
			true, true, true, true, true, true, true, true, false, true, true,
			true, true, true, true, true, true, true, true, true, false, false,
			true, true, true, true, true, true, true, true, true, false, false,
			false, false, false, true, true, true, true, true, false, false,
			false, };

	static boolean[] letterH = { true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, false, false,
			false, false, true, true, true, true, true, true, true, true,
			false, false, false, false, true, true, true, true, true, true,
			true, true, false, false, false, false, true, true, true, true,
			true, true, true, true, false, false, false, false, true, true,
			true, true, true, true, true, true, false, false, false, false,
			true, true, true, true, true, true, true, true, false, false,
			false, false, true, true, true, true, true, true, true, true,
			false, false, false, false, true, true, true, true, };

	static boolean[] letterI = { true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, false, false,
			false, false, true, true, true, true, false, false, false, false,
			false, false, false, false, true, true, true, true, false, false,
			false, false, false, false, false, false, true, true, true, true,
			false, false, false, false, false, false, false, false, true, true,
			true, true, false, false, false, false, false, false, false, false,
			true, true, true, true, false, false, false, false, false, false,
			false, false, true, true, true, true, false, false, false, false,
			false, false, false, false, true, true, true, true, false, false,
			false, false, false, false, false, false, true, true, true, true,
			false, false, false, false, false, false, false, false, true, true,
			true, true, false, false, false, false, false, false, false, false,
			true, true, true, true, false, false, false, false, false, false,
			false, false, true, true, true, true, false, false, false, false,
			false, false, false, false, true, true, true, true, false, false,
			false, false, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, };

	static boolean[] letterJ = { true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, false, false,
			false, false, true, true, true, true, false, false, false, false,
			false, false, false, false, true, true, true, true, false, false,
			false, false, false, false, false, false, true, true, true, true,
			false, false, false, false, false, false, false, false, true, true,
			true, true, false, false, false, false, false, false, false, false,
			true, true, true, true, false, false, false, false, false, false,
			false, false, true, true, true, true, false, false, false, false,
			false, false, false, false, true, true, true, true, false, false,
			false, false, false, false, false, false, true, true, true, true,
			false, false, false, false, false, false, false, false, true, true,
			true, true, false, false, false, false, false, false, false, false,
			true, true, true, true, false, false, false, false, false, false,
			false, false, true, true, true, true, false, false, false, false,
			true, true, true, false, true, true, true, true, false, false,
			false, false, true, true, true, true, true, true, true, true,
			false, false, false, false, true, true, true, true, true, true,
			true, true, false, false, false, false, false, true, true, true,
			true, true, true, false, false, false, false, false, false, false,
			true, true, true, true, false, false, false, false, false, false, };

	static boolean[] letterK = { true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, true, true,
			true, true, true, true, true, true, true, false, false, false,
			true, true, true, true, true, true, true, true, true, false, false,
			true, true, true, true, true, false, true, true, true, true, false,
			true, true, true, true, true, true, false, true, true, true, true,
			true, true, true, true, true, true, false, false, true, true, true,
			true, true, true, true, true, true, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, true, false,
			false, false, true, true, true, true, true, true, true, true, true,
			true, false, false, true, true, true, true, false, true, true,
			true, true, true, false, false, true, true, true, true, false,
			false, true, true, true, true, true, false, true, true, true, true,
			false, false, false, true, true, true, true, false, true, true,
			true, true, false, false, false, true, true, true, true, true,
			true, true, true, true, false, false, false, false, true, true,
			true, true, true, true, true, true, false, false, false, false,
			true, true, true, true, true, true, true, true, false, false,
			false, false, true, true, true, true, };

	static boolean[] letterL = { true, true, true, true, false, false, false,
			false, false, false, false, false, true, true, true, true, false,
			false, false, false, false, false, false, false, true, true, true,
			true, false, false, false, false, false, false, false, false, true,
			true, true, true, false, false, false, false, false, false, false,
			false, true, true, true, true, false, false, false, false, false,
			false, false, false, true, true, true, true, false, false, false,
			false, false, false, false, false, true, true, true, true, false,
			false, false, false, false, false, false, false, true, true, true,
			true, false, false, false, false, false, false, false, false, true,
			true, true, true, false, false, false, false, false, false, false,
			false, true, true, true, true, false, false, false, false, false,
			false, false, false, true, true, true, true, false, false, false,
			false, false, false, false, false, true, true, true, true, false,
			false, false, false, false, false, false, false, true, true, true,
			true, false, false, false, false, false, false, false, false, true,
			true, true, true, false, false, false, false, false, false, false,
			false, true, true, true, true, false, false, false, false, false,
			false, false, false, true, true, true, true, false, false, false,
			false, false, false, false, false, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, };

	static boolean[] letterM = { true, true, true, true, false, false, false,
			false, false, false, false, true, true, true, true, true, true,
			true, true, false, false, false, false, false, false, false, true,
			true, true, true, true, true, true, true, true, false, false,
			false, false, false, true, true, true, true, true, true, true,
			true, true, true, false, false, false, false, false, true, true,
			true, true, true, true, true, true, true, true, true, false, false,
			false, true, true, true, true, true, true, true, true, true, true,
			true, true, true, false, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, false, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, false, true, true, true, true, true, false, true, true, true,
			true, true, true, true, true, false, true, true, true, true, true,
			false, true, true, true, true, true, true, true, true, false,
			false, true, true, true, false, false, true, true, true, true,
			true, true, true, true, false, false, true, true, true, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, true, false, false, false, true, true, true, true,
			true, true, true, true, false, false, false, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, false, false, false, true, true, true, true,
			true, true, true, true, false, false, false, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, false, false, false, true, true, true, true,
			true, true, true, true, false, false, false, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, false, false, false, true, true, true, true,
			true, true, true, true, false, false, false, false, false, false,
			false, true, true, true, true, };

	static boolean[] letterN = { true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, true, false, false, false, true, true, true, true, true,
			true, true, true, true, false, false, false, true, true, true,
			true, true, true, true, true, true, false, false, false, true,
			true, true, true, true, true, true, true, true, true, false, false,
			true, true, true, true, true, true, true, true, true, true, false,
			false, true, true, true, true, true, true, true, true, true, true,
			false, false, true, true, true, true, true, true, true, true, true,
			true, true, false, true, true, true, true, true, true, true, true,
			true, true, true, false, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, false, true, true, true, true, true, true, true, true,
			true, true, true, false, true, true, true, true, true, true, true,
			true, true, true, true, false, false, true, true, true, true, true,
			true, true, true, true, true, false, false, true, true, true, true,
			true, true, true, true, true, true, false, false, true, true, true,
			true, true, true, true, true, true, true, false, false, false,
			true, true, true, true, true, true, true, true, true, false, false,
			false, true, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, };

	static boolean[] letterO = { false, false, false, true, true, true, true,
			true, true, false, false, false, false, true, true, true, true,
			true, true, true, true, true, true, false, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, false, false, true, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, true, false, false, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, false, true, true, true, true, true, true, true, true,
			true, true, false, false, false, false, true, true, true, true,
			true, true, false, false, false, };

	static boolean[] letterP = { true, true, true, true, true, true, true,
			true, true, true, false, false, true, true, true, true, true, true,
			true, true, true, true, true, false, true, true, true, true, true,
			true, true, true, true, true, true, false, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, false, true, true, true, true,
			true, true, true, true, true, true, true, false, true, true, true,
			true, true, true, true, true, true, true, false, false, true, true,
			true, true, false, false, false, false, false, false, false, false,
			true, true, true, true, false, false, false, false, false, false,
			false, false, true, true, true, true, false, false, false, false,
			false, false, false, false, true, true, true, true, false, false,
			false, false, false, false, false, false, true, true, true, true,
			false, false, false, false, false, false, false, false, true, true,
			true, true, false, false, false, false, false, false, false, false,
			true, true, true, true, false, false, false, false, false, false,
			false, false, true, true, true, true, false, false, false, false,
			false, false, false, false, };

	static boolean[] letterQ = { false, false, false, true, true, true, true,
			true, true, false, false, false, false, true, true, true, true,
			true, true, true, true, true, true, false, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, false, false, true, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, true, true, true, true, true, true,
			true, true, true, true, false, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, false, false, true, true, true, true, true, true, true, true,
			true, true, true, false, false, false, true, true, true, true,
			true, false, true, true, true, };

	static boolean[] letterR = { true, true, true, true, true, true, true,
			true, true, true, false, false, true, true, true, true, true, true,
			true, true, true, true, true, false, true, true, true, true, true,
			true, true, true, true, true, true, false, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, false, true, true, true, true,
			true, true, true, true, true, true, true, false, true, true, true,
			true, true, true, true, true, true, true, false, false, true, true,
			true, true, false, false, true, true, true, true, true, false,
			true, true, true, true, false, false, false, false, true, true,
			true, true, true, true, true, true, false, false, false, false,
			true, true, true, true, true, true, true, true, false, false,
			false, false, true, true, true, true, true, true, true, true,
			false, false, false, false, true, true, true, true, true, true,
			true, true, false, false, false, false, true, true, true, true,
			true, true, true, true, false, false, false, false, true, true,
			true, true, true, true, true, true, false, false, false, false,
			true, true, true, true, };

	static boolean[] letterS = { false, false, true, true, true, true, true,
			true, true, true, true, true, false, true, true, true, true, true,
			true, true, true, true, true, true, false, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, false, false, false, false, false, false, false, false, true,
			true, true, true, false, false, false, false, false, false, false,
			false, true, true, true, true, true, false, false, false, false,
			false, false, false, false, true, true, true, true, true, false,
			false, false, false, false, false, false, false, true, true, true,
			true, true, false, false, false, false, false, false, false, false,
			true, true, true, true, true, false, false, false, false, false,
			false, false, false, true, true, true, true, true, false, false,
			false, false, false, false, false, false, true, true, true, true,
			true, false, false, false, false, false, false, false, false, true,
			true, true, true, true, false, false, false, false, false, false,
			false, true, true, true, true, true, true, false, false, false,
			false, false, false, false, true, true, true, true, true, false,
			false, false, false, false, false, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, false, };

	static boolean[] letterT = { true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, false, false,
			false, false, true, true, true, true, false, false, false, false,
			false, false, false, false, true, true, true, true, false, false,
			false, false, false, false, false, false, true, true, true, true,
			false, false, false, false, false, false, false, false, true, true,
			true, true, false, false, false, false, false, false, false, false,
			true, true, true, true, false, false, false, false, false, false,
			false, false, true, true, true, true, false, false, false, false,
			false, false, false, false, true, true, true, true, false, false,
			false, false, false, false, false, false, true, true, true, true,
			false, false, false, false, false, false, false, false, true, true,
			true, true, false, false, false, false, false, false, false, false,
			true, true, true, true, false, false, false, false, false, false,
			false, false, true, true, true, true, false, false, false, false,
			false, false, false, false, true, true, true, true, false, false,
			false, false, false, false, false, false, true, true, true, true,
			false, false, false, false, false, false, false, false, true, true,
			true, true, false, false, false, false, false, false, false, false,
			true, true, true, true, false, false, false, false, false, false,
			false, false, true, true, true, true, false, false, false, false, };

	static boolean[] letterU = { true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, true, false, false, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, false, true, true, true, true,
			true, true, true, true, true, true, false, false, false, false,
			true, true, true, true, true, true, false, false, false, };

	static boolean[] letterV = { true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, false, true, true,
			true, false, false, false, false, true, true, true, false, false,
			true, true, true, true, false, false, true, true, true, true,
			false, false, false, true, true, true, false, false, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, false, true, true,
			true, true, true, true, false, false, false, false, false, false,
			true, true, true, true, true, true, false, false, false, false,
			false, false, false, true, true, true, true, false, false, false,
			false, false, false, false, false, true, true, true, true, false,
			false, false, false, };

	static boolean[] letterW = { true, true, true, true, false, false, false,
			false, false, false, false, true, true, true, true, true, true,
			true, true, false, false, false, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, false, false, false, true, true, true, true, true, true,
			true, true, false, false, false, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, false, false, false, true, true, true, true, true, true,
			true, true, false, false, false, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, false, false, false, true, true, true, true, true, true,
			true, true, false, false, false, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, false, false, false, true, true, true, true, true, true,
			true, true, false, false, false, false, false, false, false, true,
			true, true, true, true, true, true, true, false, false, false,
			false, false, false, false, true, true, true, true, true, true,
			true, true, false, false, false, true, false, false, false, true,
			true, true, true, true, true, true, true, false, false, true, true,
			true, false, false, true, true, true, true, true, true, true, true,
			false, false, true, true, true, false, false, true, true, true,
			true, true, true, true, true, false, true, true, true, true, true,
			false, true, true, true, true, true, true, true, true, false, true,
			true, true, true, true, false, true, true, true, true, false, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, false, false, true, true, true, true, true, true, false,
			true, true, true, true, true, true, false, false, false, true,
			true, true, true, true, false, true, true, true, true, true, false,
			false, false, false, true, true, true, true, false, false, false,
			true, true, true, true, false, false, };

	static boolean[] letterX = { true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, false,
			true, true, true, false, false, false, false, true, true, true,
			false, false, true, true, true, true, false, false, true, true,
			true, true, false, false, false, true, true, true, false, false,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, false,
			true, true, true, true, true, true, false, false, false, false,
			false, false, true, true, true, true, true, true, false, false,
			false, false, false, false, false, true, true, true, true, false,
			false, false, false, false, false, false, false, true, true, true,
			true, false, false, false, false, false, false, false, true, true,
			true, true, true, true, false, false, false, false, false, false,
			true, true, true, true, true, true, false, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, true, true, true, true, false, false,
			true, true, true, true, false, false, true, true, true, true,
			false, false, true, true, true, true, false, true, true, true,
			true, false, false, false, false, true, true, true, true, true,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, true,
			true, true, true, };

	static boolean[] letterY = { true, true, true, true, false, false, false,
			false, true, true, true, true, true, true, true, true, false,
			false, false, false, true, true, true, true, true, true, true,
			true, false, false, false, false, true, true, true, true, false,
			true, true, true, false, false, false, false, true, true, true,
			false, false, true, true, true, true, false, false, true, true,
			true, true, false, false, false, true, true, true, false, false,
			true, true, true, false, false, false, false, true, true, true,
			true, true, true, true, true, false, false, false, false, false,
			true, true, true, true, true, true, false, false, false, false,
			false, false, true, true, true, true, true, true, false, false,
			false, false, false, false, false, true, true, true, true, false,
			false, false, false, false, false, false, false, true, true, true,
			true, false, false, false, false, false, false, false, false, true,
			true, true, true, false, false, false, false, false, false, false,
			false, true, true, true, true, false, false, false, false, false,
			false, false, false, true, true, true, true, false, false, false,
			false, false, false, false, false, true, true, true, true, false,
			false, false, false, false, false, false, false, true, true, true,
			true, false, false, false, false, false, false, false, false, true,
			true, true, true, false, false, false, false, false, false, false,
			false, true, true, true, true, false, false, false, false, false,
			false, false, false, true, true, true, true, false, false, false,
			false, false, false, false, false, true, true, true, true, false,
			false, false, false, };

	static boolean[] letterZ = { true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, false, false,
			false, false, false, false, false, true, true, true, true, false,
			false, false, false, false, false, false, true, true, true, true,
			true, false, false, false, false, false, false, false, true, true,
			true, true, false, false, false, false, false, false, false, true,
			true, true, true, true, false, false, false, false, false, false,
			false, true, true, true, true, false, false, false, false, false,
			false, false, false, true, true, true, true, false, false, false,
			false, false, false, false, true, true, true, true, false, false,
			false, false, false, false, false, true, true, true, true, true,
			false, false, false, false, false, false, false, true, true, true,
			true, false, false, false, false, false, false, false, true, true,
			true, true, true, false, false, false, false, false, false, true,
			true, true, true, true, false, false, false, false, false, false,
			false, true, true, true, true, false, false, false, false, false,
			false, false, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, true, true, true, true, true,
			true, true, true, true, true, true, };

	static boolean[] letterSpace = { false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false, };
}
