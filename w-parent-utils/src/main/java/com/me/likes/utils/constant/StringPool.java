package com.me.likes.utils.constant;

import java.util.regex.Pattern;

/**
 * @author : sizhenhui <p>
 * @date :  </p>
 * @time : 15:20 </p>
 */
public interface StringPool {
    String UPPER_NULL = "NULL";
    String LOWER_NULL = "null";
    String UNDEFINED = "undefined";
    String UNDERLINE = "_";
    char UNDERLINE_CHAR = '_';
    String HYPHEN = "-";
    String EMPTY = "";
    String SEMICOLON = ";";
    String SLASH = "/";
    String BACKSLASH = "\\";
    int INDEX_NOT_FOUND = -1;
    String SPACE = " ";
    String TAB = "\t";
    String DOT = ".";
    String DOUBLE_DOT = "..";
    String CR = "\r";
    String LF = "\n";
    String CRLF = "\r\n";
    String DASHED = "-";
    String COMMA = ",";
    String DELIM_START = "{";
    String DELIM_END = "}";
    String BRACKET_START = "[";
    String BRACKET_END = "]";
    String COLON = ":";
    String DOUBLE_COLON = "::";
    String AMPERSAND = "&";
    String AND = "and";
    String AT = "@";
    String ASTERISK = "*";
    String STAR = "*";
    String BACK_SLASH = "\\";
    String DASH = "-";
    String DOLLAR = "$";
    String DOTDOT = "..";
    String DOT_CLASS = ".class";
    String DOT_JAVA = ".java";
    String DOT_XML = ".xml";
    String EQUALS = "=";
    String FALSE = "false";
    String HASH = "#";
    String HAT = "^";
    String LEFT_BRACE = "{";
    String LEFT_BRACKET = "(";
    String LEFT_CHEV = "<";
    String DOT_NEWLINE = ",\n";
    String NEWLINE = System.lineSeparator();
    String LINE_SEPARATOR = System.lineSeparator();
    String N = "n";
    String NO = "no";
    String NULL = "null";
    String OFF = "off";
    String ON = "on";
    String PERCENT = "%";
    String PIPE = "|";
    String PLUS = "+";
    String QUESTION_MARK = "?";
    String EXCLAMATION_MARK = "!";
    String QUOTE = "\"";
    String RETURN = "\r";
    String RIGHT_BRACE = "}";
    String RIGHT_BRACKET = ")";
    String RIGHT_CHEV = ">";
    String SINGLE_QUOTE = "'";
    String BACKTICK = "`";
    String TILDA = "~";
    String LEFT_SQ_BRACKET = "[";
    String RIGHT_SQ_BRACKET = "]";
    String TRUE = "true";
    String UNDERSCORE = "_";
    String UTF_8 = "UTF-8";
    String US_ASCII = "US-ASCII";
    String ISO_8859_1 = "ISO-8859-1";
    String Y = "y";
    String YES = "yes";
    String ONE = "1";
    String ZERO = "0";
    String DOLLAR_LEFT_BRACE = "${";
    String HASH_LEFT_BRACE = "#{";
    String HTML_NBSP = "&nbsp;";
    String HTML_AMP = "&amp";
    String HTML_QUOTE = "&quot;";
    String HTML_LT = "&lt;";
    String HTML_GT = "&gt;";
    String[] EMPTY_ARRAY = new String[0];
    byte[] BYTES_NEW_LINE = NEWLINE.getBytes();
    Pattern PATTERN_BLANK_CHARACTER = Pattern.compile("\\s*|\t*|\r*|\n*");
}
