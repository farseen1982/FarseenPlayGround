package com.farseen.andriod.farseenplayground.dummy;

import java.util.ArrayList;
import java.util.List;

public class PageContent {
	public static List<String> getStartPage() {
		List<String> data = new ArrayList<String>();
		data.add("Show Local HTML");
		data.add("Show google");
		data.add("Show statistices");
		return data;
	}
}
