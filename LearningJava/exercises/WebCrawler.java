package exercises;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		System.out.print("Gif URL: ");
		String mainURL = read.next();
		// Check if the URL given is an actual URL
		try {
			URL url = new URL(mainURL);
		} catch (MalformedURLException e) {
			System.out.println(mainURL + " is not a valid URL");
		}
		// We want a list of urls to pass and a list of already passed. The latter will
		// give us our hard limit of 100 passed urls
		ArrayList<String> pendingURLS = new ArrayList<>();
		ArrayList<String> passedURLS = new ArrayList<>();
		// Start with the given one
		pendingURLS.add(mainURL);
		while (pendingURLS.size() != 0 && passedURLS.size() <= 99) {
			// Remove from pending
			String workURL = pendingURLS.remove(0);
			// Check if we have not already been here
			if (!passedURLS.contains(workURL)) {
				passedURLS.add(workURL);
				System.out.println("Crawling over: " + workURL);
				// Check if the newly found ones aren't already in the queue
				for (String s : getSubURLS(workURL)) {
					if (!pendingURLS.contains(s))
						pendingURLS.add(s);
				}
			}

		}
		System.out.println(passedURLS.size());

	}

	private static ArrayList<String> getSubURLS(String givenurl) throws IOException {
		// We need a list because we don't know how many there are and we want to
		// process the whole site at once not one by one
		ArrayList<String> foundURLS = new ArrayList<>();
		URL url = new URL(givenurl);
		// I create a dummy one first in case one of them throws an exception when we
		// try to openStream() - 404 and such
		Scanner readURL = new Scanner("");
		try {
			readURL = new Scanner(url.openStream());
		} catch (java.io.IOException|IllegalArgumentException e) {
			System.out.println("The URL| " + url + " |returned an exeption:" + e);
		}
		String s1;
		int index = 0;
		while (readURL.hasNext()) {
			//We are relying on the fact that an url is not split between lines
			s1 = readURL.nextLine();
			index = s1.indexOf("https:", index);
			while (index > 0) {
				//Any proper URL should end in \" apparently
				int endindex = s1.indexOf("\"", index);
				if (endindex > 0) {
					foundURLS.add(s1.substring(index, endindex));
					index = s1.indexOf("https:", endindex);
				} else
					index = 0;
			}
		}
		readURL.close();
		return foundURLS;
	}
}
