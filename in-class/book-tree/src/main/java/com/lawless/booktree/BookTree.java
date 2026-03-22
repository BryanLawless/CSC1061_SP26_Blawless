package src.main.java.com.lawless.booktree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class BookTree implements Iterable<MyBookNode> {

    private MyBookNode root;

    public BookTree(String title) {
        root = new MyBookNode(title, 0, 0, 0);
    }

    public boolean addBookNode(
        String title,
        int chapterNum,
        int sectionNum,
        int subsectionNum
    ) {
        MyBookNode node = new MyBookNode(
            title,
            chapterNum,
            sectionNum,
            subsectionNum
        );

        if (sectionNum == 0) {
            root.getChildNodes().add(node);
            Collections.sort(node.getChildNodes());

            return true;
        }

        if (subsectionNum == 0) {
            for (MyBookNode chap : root.getChildNodes()) {
                if (chap.getChapterNum() == chapterNum) {
                    chap.getChildNodes().add(node);
                    Collections.sort(chap.getChildNodes());
                    return true;
                }
            }
        }

        for (MyBookNode chap : root.getChildNodes()) {
            if (chap.getChapterNum() == chapterNum) {
                for (MyBookNode sec : chap.getChildNodes()) {
                    if (sec.getSectionNum() == sectionNum) {
                        chap.getChildNodes().add(node);
                        Collections.sort(chap.getChildNodes());

                        return true;
                    }
                }
            }
        }

        return false;
    }

    private class RecursiveIterator implements Iterator<MyBookNode> {
        Deque<MyBookNode> queue = new ArrayDeque<>();

        public RecursiveIterator(MyBookNode node) {
            preorder(root):
        }

        private void preorder(MyBookNode node) {
            queue.add(node);
            if (node.getChildNodes() == null || node.getChildNodes().isEmpty()) {
                return;
            }

            for (MyBookChild child : node.getChildNodes()) {
                preorder(child);
            }
        }
    }

    private class MyBookIterator implements Iterator<MyBookNode> {

        Deque<MyBookNode> stack;

        public MyBookIterator() {
            stack = new ArrayDeque<>();
            stack.push(root);
        }

        @Override
        public boolean hasNext() {
            return (!stack.isEmpty());
        }

        @Override
        public MyBookNode next() {
            MyBookNode node = stack.pop();

            List<MyBookNode> children = node.getChildNodes();
            List<MyBookNode> copy = new ArrayList<>(children);

            Collections.reverse(copy);

            for (MyBookNode child : copy) {
                stack.push(child);
            }

            return node;
        }
    }

    @Override
    public Iterator<MyBookNode> iterator() {
        return new MyBookIterator();
    }
}
