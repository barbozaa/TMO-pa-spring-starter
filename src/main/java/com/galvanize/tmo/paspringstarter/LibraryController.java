package com.galvanize.tmo.paspringstarter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class LibraryController {
    List booksCache = new ArrayList<Books>();

    @GetMapping("/health")
    public void health() {

    }

    @RequestMapping(value = "/api/books", method = RequestMethod.POST)
    public Books getBooks(@RequestBody Books book) {
        if(StringUtils.hasLength(book.getAuthor()) && book.getDatePublished() > 0){
            book.setId(booksCache.size() + 1);
            booksCache.add(book);
            return book;
        }
        return new Books();
    }

    @GetMapping("/api/books")
    public List getBooksSorted(){
        Collections.sort(booksCache, Comparator.comparing(Books::getTitle));
        return booksCache;
    }

        @DeleteMapping("/api/books")
        public ResponseEntity<Void> deleteAllBooks(){
            booksCache.clear();
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
}
