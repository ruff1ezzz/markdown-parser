// javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
// java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }


    @Test
    public void testGetLinks2() throws IOException {
        Path fileName2 = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-files/new-test-file1.md");
        String content = Files.readString(fileName2);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("youtube.com","https://google.com"), links);

    }

    @Test
    public void testGetLinks3() throws IOException {
        Path fileName2 = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-files/new-test-file2.md");
        String content = Files.readString(fileName2);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://test.com"), links);

    }

    @Test
    public void testGetLinks4() throws IOException {
        Path fileName2 = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-files/new-test-file3.md");
        String content = Files.readString(fileName2);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://test.com"), links);

    }

    @Test
    public void testGetLinksStep61() throws IOException {
        Path fileName2 = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-files/new-test-file3.md");
        String content = Files.readString(fileName2);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://test.com"), links);

     }

    @Test
    public void MarkdownParseTest1() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-files/test-file.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.addAll(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();
        res.add("https://something.com");
        res.add("some-thing.html");

        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest2() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-files/test-file2.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.addAll(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();
        res.add("https://something.com");
        res.add("some-page.html");

        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest3() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-files/test-file3.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.addAll(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();


        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest4() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-files/test-file4.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.addAll(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();

        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest5() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-files/test-file5.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.addAll(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();


        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest6() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-files/test-file6.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.addAll(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();

        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest7() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-files/test-file7.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.addAll(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();


        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest8() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-files/test-file8.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.addAll(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();

        assertEquals(res, links);
    }
}