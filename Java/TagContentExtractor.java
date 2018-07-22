package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Tag Content Extractor Solution
In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. 
Note that the corresponding end tag starts with a /.

Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of 
well-organized tags meeting the following criterion:

The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts 
with an h1 tag and ends with a non-matching h2 tag.
Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>, 
contents is valid but invalid is not valid.
Tags can consist of any printable characters.*/

public class TagContentExtractor {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("(<|</)[^<>/]+>");

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		for (int tc = 0; tc < N; tc++) {
			String line = sc.nextLine();

			Matcher matcher = pattern.matcher(line);
			int index = 0;
			List<String> contents = new ArrayList<String>();
			Stack<String> tagStack = new Stack<String>();
			String content = null;
			boolean lastStartOrEnd = false;
			while (matcher.find()) {
				String tag = matcher.group();

				boolean startOrEnd;
				String tagName;
				if (tag.startsWith("</")) {
					startOrEnd = false;
					tagName = tag.substring(2, tag.length() - 1);
				} else {
					startOrEnd = true;
					tagName = tag.substring(1, tag.length() - 1);
				}

				if (startOrEnd) {
					tagStack.push(tagName);
				} else {
					if (!tagStack.empty() && tagStack.pop().equals(tagName)) {
						if (lastStartOrEnd) {
							content = line.substring(index, matcher.start());
							if (!content.isEmpty()) {
								contents.add(content);
							}
						}
					}
				}

				index = matcher.end();
				lastStartOrEnd = startOrEnd;
			}

			System.out.println(contents.isEmpty() ? "None" : String.join("\n", contents));
		}

		sc.close();
	}

}
