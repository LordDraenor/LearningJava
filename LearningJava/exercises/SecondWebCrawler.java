package exercises;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class SecondWebCrawler {

	public static void main(String[] args) throws IOException {

		System.out.println("Crawling over the URL " + args[0] + " and up to 100 child urls");
		crawl(args[0]);
	}

	private static void crawl(String userInput) throws IOException {
		URL firstURL;
		ArrayList<URL> pendingURL = new ArrayList<>();
		ArrayList<URL> passedURL = new ArrayList<>();
		try {
			firstURL = new URL(userInput);
			pendingURL.add(firstURL);
		} catch (MalformedURLException e) {
			System.out.println("The given URL is not valid!");
			System.exit(1);
		}
		while (!pendingURL.isEmpty() && passedURL.size() < 100) {
			passedURL.add(pendingURL.get(0));
			for (URL s : GetSubURLs(pendingURL.remove(0))) {
				if (!passedURL.contains(s))
					pendingURL.add(s);
			}
		}
	}

	private static ArrayList<URL> GetSubURLs(URL entryURL) throws IOException {
		System.out.println("Crawling over " + entryURL.toString());
		ArrayList<URL> returnURL = new ArrayList<>();
		Scanner input = new Scanner("");
		try {
			input = new Scanner(entryURL.openStream());
		} catch (Exception e) {
			System.out.println("There was an error trying to access the URL " + entryURL.toString());
			System.out.println(e);			
		}
		int indexStart = 0, indexEnd;

		while (input.hasNext()) {
			String line = input.nextLine();
			indexStart = line.indexOf("https:", indexStart);
			while (indexStart > 0) {
				indexEnd = line.indexOf("\"", indexStart) < line.indexOf("'", indexStart) ? line.indexOf("\"", indexStart) : line.indexOf("'", indexStart);
				if (indexEnd > 0) {
					returnURL.add(new URL(line.substring(indexStart, indexEnd)));
					indexStart = line.indexOf("https:", indexEnd);
				} else
					// grrrrrrr
					indexStart = -1;
			}
		}
		input.close();
		return returnURL;
	}

}
