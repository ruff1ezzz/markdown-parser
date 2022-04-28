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
    public void testGetLinks() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com","some-thing.html"), links);

    }

    // @Test
    // public void testGetLinks2() throws IOException {
    //     Path fileName2 = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/new-test-file1.md");
    //     String content = Files.readString(fileName2);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     assertEquals(List.of("youtube.com","https://google.com"), links);

    // }

    // @Test
    // public void testGetLinks3() throws IOException {
    //     Path fileName2 = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/new-test-file2.md");
    //     String content = Files.readString(fileName2);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     assertEquals(List.of("https://test.com"), links);

    // }

    // @Test
    // public void testGetLinks4() throws IOException {
    //     Path fileName2 = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/new-test-file3.md");
    //     String content = Files.readString(fileName2);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     assertEquals(List.of("https://test.com"), links);

    // }

    // @Test
    // public void testGetLinksStep61() throws IOException {
    //     Path fileName2 = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/new-test-file3.md");
    //     String content = Files.readString(fileName2);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     assertEquals(List.of("https://test.com"), links);

    //  }

    @Test
    public void testGetLinks3() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(null, links);

    }

    @Test
    public void testGetLinks4() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(null, links);

    }

    @Test
    public void testGetLinks5() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(null, links);

    }

    @Test
    public void testGetLinks6() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(null, links);

    }

    @Test
    public void testGetLinks7() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(null, links);

    }

    @Test
    public void testGetLinks8() throws IOException {
        Path fileName = Path.of("/Users/aungbong/Documents/GitHub/markdown-parser/test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(null, links);

    }
}
