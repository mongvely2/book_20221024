package com.icia.book.repository;

import com.icia.book.dto.BookDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    @Autowired
    private SqlSessionTemplate sql;

    public int save(BookDTO bookDTO) {
        return sql.insert("Book.save", bookDTO);
    }

    public BookDTO findBook() {
//        전달할게 없으므로 별도의 매개변수는 없어도 됨
        return sql.selectOne("Book.findBook");
    }
}
