/* The following code was generated by JFlex 1.6.1 */

/**
 * This class is a scanner generated by <a href="http://www.jflex.de/">JFlex</a>
 * 1.6.1 from the specification file
 * <tt>C:/Users/Matheus/Desktop/Exercicio2/lexer/Exercicio2Lexer.jflex</tt>
 */
class Exercicio2Lexer {

	/** This character denotes the end of file */
	public static final int YYEOF = -1;

	/** initial size of the lookahead buffer */
	private static final int ZZ_BUFFERSIZE = 16384;

	/** lexical states */
	public static final int YYINITIAL = 0;

	/**
	 * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
	 * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l at the
	 * beginning of a line l is of the form l = 2*k, k a non negative integer
	 */
	private static final int ZZ_LEXSTATE[] = { 0, 0 };

	/**
	 * Translates characters to character classes
	 */
	private static final String ZZ_CMAP_PACKED = "\11\0\1\11\1\4\1\5\1\5\1\4\22\0\1\12\5\0\1\44"
			+ "\1\0\1\51\1\52\1\14\1\45\1\57\1\7\1\42\1\13\1\3" + "\11\2\1\0\1\60\1\47\1\46\1\50\2\0\4\1\1\6\15\1"
			+ "\1\40\7\1\1\55\1\0\1\56\1\0\1\1\1\0\1\24\1\27" + "\1\22\1\33\1\16\1\43\1\1\1\36\1\30\2\1\1\23\1\34"
			+ "\1\21\1\32\1\26\1\1\1\15\1\25\1\17\1\20\1\31\1\37" + "\1\35\1\41\1\1\1\53\1\10\1\54\7\0\1\5\u1fa2\0\1\5"
			+ "\1\5\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

	/**
	 * Translates characters to character classes
	 */
	private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

	/**
	 * Translates DFA states to action switch labels.
	 */
	private static final int[] ZZ_ACTION = zzUnpackAction();

	private static final String ZZ_ACTION_PACKED_0 = "\1\0\1\1\1\2\2\3\1\4\1\5\1\6\1\4"
			+ "\1\7\1\10\15\2\1\11\1\2\1\1\1\12\1\13" + "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"
			+ "\1\24\1\25\1\0\1\3\1\26\1\27\1\0\13\2" + "\1\30\5\2\1\31\1\32\1\33\1\34\1\35\1\3"
			+ "\1\27\2\0\5\2\1\36\4\2\1\37\5\2\3\0" + "\1\2\1\40\1\2\1\41\1\42\4\2\1\43\1\44"
			+ "\3\2\2\35\1\0\2\2\1\45\3\2\1\46\1\2" + "\1\47\1\50\1\2\1\51\1\52\2\2\1\53\1\54" + "\13\0\1\55";

	private static int[] zzUnpackAction() {
		int[] result = new int[135];
		int offset = 0;
		offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAction(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/**
	 * Translates a state to a row index in the transition table
	 */
	private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

	private static final String ZZ_ROWMAP_PACKED_0 = "\0\0\0\61\0\142\0\223\0\304\0\365\0\61\0\61"
			+ "\0\u0126\0\u0157\0\61\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c"
			+ "\0\u027d\0\u02ae\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4"
			+ "\0\61\0\u0405\0\u0436\0\61\0\u0467\0\u0498\0\u04c9\0\61" + "\0\61\0\61\0\61\0\61\0\61\0\61\0\61\0\u04fa"
			+ "\0\u052b\0\365\0\u055c\0\u058d\0\u05be\0\u05ef\0\u0620\0\u0651"
			+ "\0\u0682\0\u06b3\0\u06e4\0\u0715\0\u0746\0\u0777\0\u07a8\0\142"
			+ "\0\u07d9\0\u080a\0\u083b\0\u086c\0\u089d\0\61\0\61\0\61"
			+ "\0\61\0\u08ce\0\u08ff\0\61\0\u0930\0\u0961\0\u0992\0\u09c3"
			+ "\0\u09f4\0\u0a25\0\u0a56\0\142\0\u0a87\0\u0ab8\0\u0ae9\0\u0b1a"
			+ "\0\142\0\u0b4b\0\u0b7c\0\u0bad\0\u0bde\0\u0c0f\0\u0c40\0\u0c71"
			+ "\0\u0ca2\0\u0cd3\0\142\0\u0d04\0\142\0\142\0\u0d35\0\u0d66"
			+ "\0\u0d97\0\u0dc8\0\142\0\142\0\u0df9\0\u0e2a\0\u0e5b\0\u0e8c"
			+ "\0\61\0\u0ebd\0\u0eee\0\u0f1f\0\142\0\u0f50\0\u0f81\0\u0fb2"
			+ "\0\142\0\u0fe3\0\142\0\142\0\u1014\0\142\0\142\0\u1045"
			+ "\0\u1076\0\142\0\142\0\u10a7\0\u10d8\0\u1109\0\u113a\0\u116b"
			+ "\0\u119c\0\u11cd\0\u11fe\0\u122f\0\u1260\0\u1291\0\61";

	private static int[] zzUnpackRowMap() {
		int[] result = new int[135];
		int offset = 0;
		offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackRowMap(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int high = packed.charAt(i++) << 16;
			result[j++] = high | packed.charAt(i++);
		}
		return j;
	}

	/**
	 * The transition table of the DFA
	 */
	private static final int[] ZZ_TRANS = zzUnpackTrans();

	private static final String ZZ_TRANS_PACKED_0 = "\1\2\1\3\1\4\1\5\1\6\1\7\1\3\1\10"
			+ "\1\11\2\6\1\12\1\13\1\14\1\15\1\16\1\3" + "\1\17\1\20\2\3\1\21\1\22\1\23\1\24\1\25"
			+ "\2\3\1\26\2\3\1\27\1\30\1\3\1\31\1\32" + "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"
			+ "\1\43\1\44\1\45\1\46\1\47\62\0\3\3\2\0" + "\1\3\6\0\25\3\1\0\1\3\15\0\2\50\2\51"
			+ "\2\0\57\50\2\0\53\50\4\0\1\6\3\0\3\6" + "\52\0\1\6\3\0\1\52\2\6\61\0\1\53\1\54"
			+ "\45\0\3\3\2\0\1\3\6\0\1\3\1\55\23\3" + "\1\0\1\3\16\0\3\3\2\0\1\3\6\0\6\3"
			+ "\1\56\11\3\1\57\4\3\1\0\1\3\16\0\3\3" + "\2\0\1\3\6\0\1\60\20\3\1\61\3\3\1\0"
			+ "\1\3\16\0\3\3\2\0\1\3\6\0\1\3\1\62" + "\23\3\1\0\1\3\16\0\3\3\2\0\1\3\6\0"
			+ "\6\3\1\63\16\3\1\0\1\3\16\0\3\3\2\0" + "\1\3\6\0\2\3\1\64\22\3\1\0\1\3\16\0"
			+ "\3\3\2\0\1\3\6\0\3\3\1\65\21\3\1\0" + "\1\3\16\0\3\3\2\0\1\3\6\0\15\3\1\66"
			+ "\7\3\1\0\1\3\16\0\3\3\2\0\1\3\6\0" + "\4\3\1\67\20\3\1\0\1\70\16\0\3\3\2\0"
			+ "\1\3\6\0\15\3\1\71\7\3\1\0\1\3\16\0" + "\3\3\2\0\1\3\6\0\7\3\1\72\15\3\1\0"
			+ "\1\3\16\0\3\3\2\0\1\3\6\0\21\3\1\73" + "\3\3\1\0\1\3\16\0\3\3\2\0\1\3\6\0"
			+ "\24\3\1\74\1\0\1\3\16\0\3\3\2\0\1\3" + "\6\0\7\3\1\75\15\3\1\0\1\3\61\0\1\76"
			+ "\62\0\1\77\60\0\1\100\60\0\1\101\14\0\2\102" + "\55\0\2\50\2\103\2\0\53\50\4\53\1\104\54\53"
			+ "\14\105\1\106\44\105\1\0\3\3\2\0\1\3\6\0" + "\2\3\1\107\22\3\1\0\1\3\16\0\3\3\2\0"
			+ "\1\3\6\0\10\3\1\110\14\3\1\0\1\3\16\0" + "\3\3\2\0\1\3\6\0\2\3\1\111\22\3\1\0"
			+ "\1\3\16\0\3\3\2\0\1\3\6\0\3\3\1\112" + "\21\3\1\0\1\3\16\0\3\3\2\0\1\3\6\0"
			+ "\13\3\1\113\11\3\1\0\1\3\16\0\3\3\2\0" + "\1\3\6\0\22\3\1\114\2\3\1\0\1\3\16\0"
			+ "\3\3\2\0\1\3\6\0\7\3\1\115\15\3\1\0" + "\1\3\16\0\3\3\2\0\1\3\6\0\7\3\1\116"
			+ "\15\3\1\0\1\3\16\0\3\3\2\0\1\3\6\0" + "\12\3\1\117\12\3\1\0\1\3\16\0\3\3\2\0"
			+ "\1\3\6\0\15\3\1\120\7\3\1\0\1\3\16\0" + "\3\3\2\0\1\3\6\0\2\3\1\121\22\3\1\0"
			+ "\1\3\16\0\3\3\2\0\1\3\6\0\13\3\1\122" + "\11\3\1\0\1\3\16\0\3\3\2\0\1\3\6\0"
			+ "\13\3\1\123\11\3\1\0\1\3\16\0\3\3\2\0" + "\1\3\6\0\13\3\1\124\11\3\1\0\1\3\16\0"
			+ "\3\3\2\0\1\3\6\0\10\3\1\125\14\3\1\0" + "\1\3\16\0\3\3\2\0\1\3\6\0\6\3\1\126"
			+ "\16\3\1\0\1\3\17\0\2\102\2\0\1\127\52\0" + "\2\50\2\103\2\0\1\130\52\50\14\105\1\131\44\105"
			+ "\13\0\1\104\1\106\45\0\3\3\2\0\1\3\6\0" + "\3\3\1\132\21\3\1\0\1\3\16\0\3\3\2\0"
			+ "\1\3\6\0\1\3\1\133\23\3\1\0\1\3\16\0" + "\3\3\2\0\1\3\6\0\1\3\1\134\23\3\1\0"
			+ "\1\3\16\0\3\3\2\0\1\3\6\0\1\3\1\135" + "\23\3\1\0\1\3\16\0\3\3\2\0\1\3\6\0"
			+ "\10\3\1\136\14\3\1\0\1\3\16\0\3\3\2\0" + "\1\3\6\0\10\3\1\137\14\3\1\0\1\3\16\0"
			+ "\3\3\2\0\1\3\6\0\2\3\1\140\22\3\1\0" + "\1\3\16\0\3\3\2\0\1\3\6\0\6\3\1\141"
			+ "\16\3\1\0\1\3\16\0\3\3\2\0\1\3\6\0" + "\6\3\1\142\16\3\1\0\1\3\16\0\3\3\2\0"
			+ "\1\3\6\0\16\3\1\143\6\3\1\0\1\3\16\0" + "\3\3\2\0\1\3\6\0\4\3\1\144\20\3\1\0"
			+ "\1\3\16\0\3\3\2\0\1\3\6\0\6\3\1\145" + "\16\3\1\0\1\3\16\0\3\3\2\0\1\3\6\0"
			+ "\2\3\1\146\22\3\1\0\1\3\16\0\3\3\2\0" + "\1\3\6\0\10\3\1\147\14\3\1\0\1\3\17\0"
			+ "\1\150\1\151\3\0\2\152\1\0\1\152\32\0\1\152" + "\15\0\2\102\3\0\2\152\1\0\1\152\32\0\1\152"
			+ "\13\0\13\105\1\104\1\131\44\105\1\0\3\3\2\0" + "\1\3\6\0\1\153\24\3\1\0\1\3\16\0\3\3"
			+ "\2\0\1\3\6\0\4\3\1\154\20\3\1\0\1\3" + "\16\0\3\3\2\0\1\3\6\0\10\3\1\155\14\3"
			+ "\1\0\1\3\16\0\3\3\2\0\1\3\6\0\13\3" + "\1\156\11\3\1\0\1\3\16\0\3\3\2\0\1\3"
			+ "\6\0\13\3\1\157\11\3\1\0\1\3\16\0\3\3" + "\2\0\1\3\6\0\1\3\1\160\23\3\1\0\1\3"
			+ "\16\0\3\3\2\0\1\3\6\0\1\3\1\161\23\3" + "\1\0\1\3\16\0\3\3\2\0\1\3\6\0\1\3"
			+ "\1\162\23\3\1\0\1\3\16\0\3\3\2\0\1\3" + "\6\0\1\3\1\163\23\3\1\0\1\3\17\0\2\150"
			+ "\57\0\1\150\1\151\56\0\3\3\2\0\1\3\6\0" + "\4\3\1\164\20\3\1\0\1\3\16\0\3\3\2\0"
			+ "\1\3\6\0\16\3\1\165\6\3\1\0\1\3\16\0" + "\3\3\2\0\1\3\6\0\5\3\1\166\17\3\1\0"
			+ "\1\3\16\0\3\3\2\0\1\3\6\0\5\3\1\167" + "\17\3\1\0\1\3\16\0\3\3\2\0\1\3\6\0"
			+ "\7\3\1\170\15\3\1\0\1\3\16\0\3\3\2\0" + "\1\3\6\0\17\3\1\171\5\3\1\0\1\3\16\0"
			+ "\3\3\2\0\1\3\6\0\10\3\1\172\14\3\1\0" + "\1\3\16\0\3\3\2\0\1\3\6\0\4\3\1\173"
			+ "\20\3\1\0\1\3\16\0\3\3\2\0\1\3\6\0" + "\25\3\1\174\1\3\47\0\1\175\46\0\1\176\57\0"
			+ "\1\177\103\0\1\200\44\0\1\201\47\0\1\202\73\0" + "\1\203\51\0\1\204\56\0\1\205\64\0\1\206\56\0"
			+ "\1\207\37\0";

	private static int[] zzUnpackTrans() {
		int[] result = new int[4802];
		int offset = 0;
		offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackTrans(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			value--;
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/* error codes */
	private static final int ZZ_UNKNOWN_ERROR = 0;
	private static final int ZZ_NO_MATCH = 1;
	private static final int ZZ_PUSHBACK_2BIG = 2;

	/* error messages for the codes above */
	private static final String ZZ_ERROR_MSG[] = { "Unknown internal scanner error", "Error: could not match input",
			"Error: pushback value was too large" };

	/**
	 * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
	 */
	private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

	private static final String ZZ_ATTRIBUTE_PACKED_0 = "\1\0\1\11\4\1\2\11\2\1\1\11\15\1\1\11"
			+ "\2\1\1\11\3\1\10\11\1\0\3\1\1\0\21\1" + "\4\11\2\1\1\11\2\0\20\1\3\0\17\1\1\11" + "\1\0\21\1\13\0\1\11";

	private static int[] zzUnpackAttribute() {
		int[] result = new int[135];
		int offset = 0;
		offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAttribute(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/** the input device */
	private java.io.Reader zzReader;

	/** the current state of the DFA */
	private int zzState;

	/** the current lexical state */
	private int zzLexicalState = YYINITIAL;

	/**
	 * this buffer contains the current text to be matched and is the source of
	 * the yytext() string
	 */
	private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

	/** the textposition at the last accepting state */
	private int zzMarkedPos;

	/** the current text position in the buffer */
	private int zzCurrentPos;

	/** startRead marks the beginning of the yytext() string in the buffer */
	private int zzStartRead;

	/**
	 * endRead marks the last character in the buffer, that has been read from
	 * input
	 */
	private int zzEndRead;

	/** number of newlines encountered up to the start of the matched text */
	private int yyline;

	/** the number of characters up to the start of the matched text */
	private int yychar;

	/**
	 * the number of characters from the last newline up to the start of the
	 * matched text
	 */
	private int yycolumn;

	/**
	 * zzAtBOL == true <=> the scanner is currently at the beginning of a line
	 */
	private boolean zzAtBOL = true;

	/** zzAtEOF == true <=> the scanner is at the EOF */
	private boolean zzAtEOF;

	/** denotes if the user-EOF-code has already been executed */
	private boolean zzEOFDone;

	/**
	 * The number of occupied positions in zzBuffer beyond zzEndRead. When a
	 * lead/high surrogate has been read from the input stream into the final
	 * zzBuffer position, this will have a value of 1; otherwise, it will have a
	 * value of 0.
	 */
	private int zzFinalHighSurrogate = 0;

	/* user code: */
	int qtdeID = 0;

	/**
	 * Creates a new scanner
	 *
	 * @param in
	 *            the java.io.Reader to read input from.
	 */
	Exercicio2Lexer(java.io.Reader in) {
		this.zzReader = in;
	}

	/**
	 * Unpacks the compressed character translation table.
	 *
	 * @param packed
	 *            the packed character translation table
	 * @return the unpacked character translation table
	 */
	private static char[] zzUnpackCMap(String packed) {
		char[] map = new char[0x110000];
		int i = 0; /* index in packed string */
		int j = 0; /* index in unpacked array */
		while (i < 176) {
			int count = packed.charAt(i++);
			char value = packed.charAt(i++);
			do
				map[j++] = value;
			while (--count > 0);
		}
		return map;
	}

	/**
	 * Refills the input buffer.
	 *
	 * @return <code>false</code>, iff there was new input.
	 * 
	 * @exception java.io.IOException
	 *                if any I/O-Error occurs
	 */
	private boolean zzRefill() throws java.io.IOException {

		/* first: make room (if you can) */
		if (zzStartRead > 0) {
			zzEndRead += zzFinalHighSurrogate;
			zzFinalHighSurrogate = 0;
			System.arraycopy(zzBuffer, zzStartRead, zzBuffer, 0, zzEndRead - zzStartRead);

			/* translate stored positions */
			zzEndRead -= zzStartRead;
			zzCurrentPos -= zzStartRead;
			zzMarkedPos -= zzStartRead;
			zzStartRead = 0;
		}

		/* is the buffer big enough? */
		if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
			/* if not: blow it up */
			char newBuffer[] = new char[zzBuffer.length * 2];
			System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
			zzBuffer = newBuffer;
			zzEndRead += zzFinalHighSurrogate;
			zzFinalHighSurrogate = 0;
		}

		/* fill the buffer with new input */
		int requested = zzBuffer.length - zzEndRead;
		int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

		/* not supposed to occur according to specification of java.io.Reader */
		if (numRead == 0) {
			throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
		}
		if (numRead > 0) {
			zzEndRead += numRead;
			/*
			 * If numRead == requested, we might have requested to few chars to
			 * encode a full Unicode character. We assume that a Reader would
			 * otherwise never return half characters.
			 */
			if (numRead == requested) {
				if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
					--zzEndRead;
					zzFinalHighSurrogate = 1;
				}
			}
			/* potentially more input available */
			return false;
		}

		/* numRead < 0 ==> end of stream */
		return true;
	}

	/**
	 * Closes the input stream.
	 */
	public final void yyclose() throws java.io.IOException {
		zzAtEOF = true; /* indicate end of file */
		zzEndRead = zzStartRead; /* invalidate buffer */

		if (zzReader != null)
			zzReader.close();
	}

	/**
	 * Resets the scanner to read from a new input stream. Does not close the
	 * old reader.
	 *
	 * All internal variables are reset, the old input stream <b>cannot</b> be
	 * reused (internal buffer is discarded and lost). Lexical state is set to
	 * <tt>ZZ_INITIAL</tt>.
	 *
	 * Internal scan buffer is resized down to its initial length, if it has
	 * grown.
	 *
	 * @param reader
	 *            the new input stream
	 */
	public final void yyreset(java.io.Reader reader) {
		zzReader = reader;
		zzAtBOL = true;
		zzAtEOF = false;
		zzEOFDone = false;
		zzEndRead = zzStartRead = 0;
		zzCurrentPos = zzMarkedPos = 0;
		zzFinalHighSurrogate = 0;
		yyline = yychar = yycolumn = 0;
		zzLexicalState = YYINITIAL;
		if (zzBuffer.length > ZZ_BUFFERSIZE)
			zzBuffer = new char[ZZ_BUFFERSIZE];
	}

	/**
	 * Returns the current lexical state.
	 */
	public final int yystate() {
		return zzLexicalState;
	}

	/**
	 * Enters a new lexical state
	 *
	 * @param newState
	 *            the new lexical state
	 */
	public final void yybegin(int newState) {
		zzLexicalState = newState;
	}

	/**
	 * Returns the text matched by the current regular expression.
	 */
	public final String yytext() {
		return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
	}

	/**
	 * Returns the character at position <tt>pos</tt> from the matched text.
	 * 
	 * It is equivalent to yytext().charAt(pos), but faster
	 *
	 * @param pos
	 *            the position of the character to fetch. A value from 0 to
	 *            yylength()-1.
	 *
	 * @return the character at position pos
	 */
	public final char yycharat(int pos) {
		return zzBuffer[zzStartRead + pos];
	}

	/**
	 * Returns the length of the matched text region.
	 */
	public final int yylength() {
		return zzMarkedPos - zzStartRead;
	}

	/**
	 * Reports an error that occured while scanning.
	 *
	 * In a wellformed scanner (no or only correct usage of yypushback(int) and
	 * a match-all fallback rule) this method will only be called with things
	 * that "Can't Possibly Happen". If this method is called, something is
	 * seriously wrong (e.g. a JFlex bug producing a faulty scanner etc.).
	 *
	 * Usual syntax/scanner level error handling should be done in error
	 * fallback rules.
	 *
	 * @param errorCode
	 *            the code of the errormessage to display
	 */
	private void zzScanError(int errorCode) {
		String message;
		try {
			message = ZZ_ERROR_MSG[errorCode];
		} catch (ArrayIndexOutOfBoundsException e) {
			message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
		}

		throw new Error(message);
	}

	/**
	 * Pushes the specified amount of characters back into the input stream.
	 *
	 * They will be read again by then next call of the scanning method
	 *
	 * @param number
	 *            the number of characters to be read again. This number must
	 *            not be greater than yylength()!
	 */
	public void yypushback(int number) {
		if (number > yylength())
			zzScanError(ZZ_PUSHBACK_2BIG);

		zzMarkedPos -= number;
	}

	/**
	 * Contains user EOF-code, which will be executed exactly once, when the end
	 * of file is reached
	 */
	private void zzDoEOF() {
		if (!zzEOFDone) {
			zzEOFDone = true;
			System.out.println("Quantidade de Identificadores encontrados: " + qtdeID);

		}
	}

	/**
	 * Resumes scanning until the next regular expression is matched, the end of
	 * input is encountered or an I/O-Error occurs.
	 *
	 * @return the next token
	 * @exception java.io.IOException
	 *                if any I/O-Error occurs
	 */
	public int yylex() throws java.io.IOException {
		int zzInput;
		int zzAction;

		// cached fields:
		int zzCurrentPosL;
		int zzMarkedPosL;
		int zzEndReadL = zzEndRead;
		char[] zzBufferL = zzBuffer;
		char[] zzCMapL = ZZ_CMAP;

		int[] zzTransL = ZZ_TRANS;
		int[] zzRowMapL = ZZ_ROWMAP;
		int[] zzAttrL = ZZ_ATTRIBUTE;

		while (true) {
			zzMarkedPosL = zzMarkedPos;

			boolean zzR = false;
			int zzCh;
			int zzCharCount;
			for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL; zzCurrentPosL += zzCharCount) {
				zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
				zzCharCount = Character.charCount(zzCh);
				switch (zzCh) {
				case '\u000B':
				case '\u000C':
				case '\u0085':
				case '\u2028':
				case '\u2029':
					yyline++;
					yycolumn = 0;
					zzR = false;
					break;
				case '\r':
					yyline++;
					yycolumn = 0;
					zzR = true;
					break;
				case '\n':
					if (zzR)
						zzR = false;
					else {
						yyline++;
						yycolumn = 0;
					}
					break;
				default:
					zzR = false;
					yycolumn += zzCharCount;
				}
			}

			if (zzR) {
				// peek one character ahead if it is \n (if we have counted one
				// line too much)
				boolean zzPeek;
				if (zzMarkedPosL < zzEndReadL)
					zzPeek = zzBufferL[zzMarkedPosL] == '\n';
				else if (zzAtEOF)
					zzPeek = false;
				else {
					boolean eof = zzRefill();
					zzEndReadL = zzEndRead;
					zzMarkedPosL = zzMarkedPos;
					zzBufferL = zzBuffer;
					if (eof)
						zzPeek = false;
					else
						zzPeek = zzBufferL[zzMarkedPosL] == '\n';
				}
				if (zzPeek)
					yyline--;
			}
			zzAction = -1;

			zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

			zzState = ZZ_LEXSTATE[zzLexicalState];

			// set up zzAction for empty match case:
			int zzAttributes = zzAttrL[zzState];
			if ((zzAttributes & 1) == 1) {
				zzAction = zzState;
			}

			zzForAction: {
				while (true) {

					if (zzCurrentPosL < zzEndReadL) {
						zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
						zzCurrentPosL += Character.charCount(zzInput);
					} else if (zzAtEOF) {
						zzInput = YYEOF;
						break zzForAction;
					} else {
						// store back cached positions
						zzCurrentPos = zzCurrentPosL;
						zzMarkedPos = zzMarkedPosL;
						boolean eof = zzRefill();
						// get translated positions and possibly new buffer
						zzCurrentPosL = zzCurrentPos;
						zzMarkedPosL = zzMarkedPos;
						zzBufferL = zzBuffer;
						zzEndReadL = zzEndRead;
						if (eof) {
							zzInput = YYEOF;
							break zzForAction;
						} else {
							zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
							zzCurrentPosL += Character.charCount(zzInput);
						}
					}
					int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
					if (zzNext == -1)
						break zzForAction;
					zzState = zzNext;

					zzAttributes = zzAttrL[zzState];
					if ((zzAttributes & 1) == 1) {
						zzAction = zzState;
						zzMarkedPosL = zzCurrentPosL;
						if ((zzAttributes & 8) == 8)
							break zzForAction;
					}

				}
			}

			// store back cached position
			zzMarkedPos = zzMarkedPosL;

			if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
				zzAtEOF = true;
				zzDoEOF();
				return YYEOF;
			} else {
				switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
				case 1: {
					System.out.println("Illegal char, '" + yytext() + "' line: " + yyline + ", column: " + yycolumn);
				}
				case 46:
					break;
				case 2: {
					qtdeID++;
					System.out.println("Token ID (" + yytext() + ")");
				}
				case 47:
					break;
				case 3: {
					System.out.println("Token INT (" + yytext() + ")");
				}
				case 48:
					break;
				case 4: { /* Ignorar whitespace. */
				}
				case 49:
					break;
				case 5: {
					System.out.print(yytext());
				}
				case 50:
					break;
				case 6: {
					System.out.println("Token -");
				}
				case 51:
					break;
				case 7: {
					System.out.println("Token /");
				}
				case 52:
					break;
				case 8: {
					System.out.println("Token *");
				}
				case 53:
					break;
				case 9: {
					System.out.println("Token .");
				}
				case 54:
					break;
				case 10: {
					System.out.println("Token +");
				}
				case 55:
					break;
				case 11: {
					System.out.println("Token =");
				}
				case 56:
					break;
				case 12: {
					System.out.println("Token <");
				}
				case 57:
					break;
				case 13: {
					System.out.println("Token >");
				}
				case 58:
					break;
				case 14: {
					System.out.println("Token (");
				}
				case 59:
					break;
				case 15: {
					System.out.println("Token )");
				}
				case 60:
					break;
				case 16: {
					System.out.println("Token {");
				}
				case 61:
					break;
				case 17: {
					System.out.println("Token }");
				}
				case 62:
					break;
				case 18: {
					System.out.println("Token [");
				}
				case 63:
					break;
				case 19: {
					System.out.println("Token ]");
				}
				case 64:
					break;
				case 20: {
					System.out.println("Token ,");
				}
				case 65:
					break;
				case 21: {
					System.out.println("Token ;");
				}
				case 66:
					break;
				case 22: {
					System.out.println("Token ||");
				}
				case 67:
					break;
				case 23: { /* Ignore os comentários */
				}
				case 68:
					break;
				case 24: {
					System.out.println("Token if");
				}
				case 69:
					break;
				case 25: {
					System.out.println("Token &&");
				}
				case 70:
					break;
				case 26: {
					System.out.println("Token ==");
				}
				case 71:
					break;
				case 27: {
					System.out.println("Token <=");
				}
				case 72:
					break;
				case 28: {
					System.out.println("Token >=");
				}
				case 73:
					break;
				case 29: {
					System.out.println("Token FLOAT (" + yytext() + ")");
				}
				case 74:
					break;
				case 30: {
					System.out.println("Token new");
				}
				case 75:
					break;
				case 31: {
					System.out.println("Token int");
				}
				case 76:
					break;
				case 32: {
					System.out.println("Token else");
				}
				case 77:
					break;
				case 33: {
					System.out.println("Token true");
				}
				case 78:
					break;
				case 34: {
					System.out.println("Token this");
				}
				case 79:
					break;
				case 35: {
					System.out.println("Token void");
				}
				case 80:
					break;
				case 36: {
					System.out.println("Token main");
				}
				case 81:
					break;
				case 37: {
					System.out.println("Token class");
				}
				case 82:
					break;
				case 38: {
					System.out.println("Token while");
				}
				case 83:
					break;
				case 39: {
					System.out.println("Token false");
				}
				case 84:
					break;
				case 40: {
					System.out.println("Token return");
				}
				case 85:
					break;
				case 41: {
					System.out.println("Token static");
				}
				case 86:
					break;
				case 42: {
					System.out.println("Token public");
				}
				case 87:
					break;
				case 43: {
					System.out.println("Token extends");
				}
				case 88:
					break;
				case 44: {
					System.out.println("Token boolean");
				}
				case 89:
					break;
				case 45: {
					System.out.println("Token System.out.println");
				}
				case 90:
					break;
				default:
					zzScanError(ZZ_NO_MATCH);
				}
			}
		}
	}

	/**
	 * Runs the scanner on input files.
	 *
	 * This is a standalone scanner, it will print any unmatched text to
	 * System.out unchanged.
	 *
	 * @param argv
	 *            the command line, contains the filenames to run the scanner
	 *            on.
	 */
	public static void main(String argv[]) {
		if (argv.length == 0) {
			System.out.println("Usage : java Exercicio2Lexer [ --encoding <name> ] <inputfile(s)>");
		} else {
			int firstFilePos = 0;
			String encodingName = "UTF-8";
			if (argv[0].equals("--encoding")) {
				firstFilePos = 2;
				encodingName = argv[1];
				try {
					java.nio.charset.Charset.forName(encodingName); // Side-effect:
																	// is
																	// encodingName
																	// valid?
				} catch (Exception e) {
					System.out.println("Invalid encoding '" + encodingName + "'");
					return;
				}
			}
			for (int i = firstFilePos; i < argv.length; i++) {
				Exercicio2Lexer scanner = null;
				try {
					java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
					java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
					scanner = new Exercicio2Lexer(reader);
					while (!scanner.zzAtEOF)
						scanner.yylex();
				} catch (java.io.FileNotFoundException e) {
					System.out.println("File not found : \"" + argv[i] + "\"");
				} catch (java.io.IOException e) {
					System.out.println("IO error scanning file \"" + argv[i] + "\"");
					System.out.println(e);
				} catch (Exception e) {
					System.out.println("Unexpected exception:");
					e.printStackTrace();
				}
			}
		}
	}

}
