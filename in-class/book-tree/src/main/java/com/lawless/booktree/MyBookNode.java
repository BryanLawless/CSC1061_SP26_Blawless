package src.main.java.com.lawless.booktree;

import java.util.ArrayList;
import java.util.List;

public class MyBookNode implements Comparable<MyBookNode> {
	private String title;
	private int chapterNum;
	private int sectionNum;
	private int subsectionNum;
	private List<MyBookNode> childNodes;

	public MyBookNode(String title, int chapterNum, int sectionNum, int subsectionNum) {
		this.title = title;
		this.chapterNum = chapterNum;
		this.sectionNum = sectionNum;
		this.subsectionNum = subsectionNum;
		this.childNodes = new ArrayList<>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getChapterNum() {
		return chapterNum;
	}

	public List<MyBookNode> getChildNodes() {
		return childNodes;
	}

	public void setChapterNum(int chapterNum) {
		this.chapterNum = chapterNum;
	}

	public int getSectionNum() {
		return sectionNum;
	}

	public void setSectionNum(int sectionNum) {
		this.sectionNum = sectionNum;
	}

	public int getSubsectionNum() {
		return subsectionNum;
	}

	public void setSubsectionNum(int subsectionNum) {
		this.subsectionNum = subsectionNum;
	}

	@Override
	public int compareTo(MyBookNode node) {
		if (this.chapterNum < node.chapterNum) {
			return -1;
		} else if (this.chapterNum > node.chapterNum) {
			return 1;
		}

		if (this.sectionNum  < node.sectionNum) {
			return -1;
		} else if (this.sectionNum > node.sectionNum) {
			return 1;
		}

		if (this.subsectionNum < node.subsectionNum) {
			return -1;
		} else if (this.subsectionNum > node.subsectionNum) {
			return 1;
		}

		return 0;
	}

	@Override 
	public String toString() {
		if (chapterNum == 0) {
			return title;
		}

		if (sectionNum == 0) {
			return "\t" + chapterNum + " " + title;
		}

		if (subsectionNum == 0) {
			return "\t\t" + chapterNum + "." + sectionNum + " " + title;
		}

		return "\t\t\t" + chapterNum + "." + sectionNum + "." + subsectionNum + " " + title;
	}
}
