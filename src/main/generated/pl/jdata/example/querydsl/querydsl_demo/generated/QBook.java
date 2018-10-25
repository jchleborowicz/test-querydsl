package pl.jdata.example.querydsl.querydsl_demo.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBook is a Querydsl query type for QBook
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBook extends com.querydsl.sql.RelationalPathBase<QBook> {

    private static final long serialVersionUID = 832509265;

    public static final QBook book = new QBook("book");

    public final NumberPath<Integer> authorId = createNumber("authorId", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> languageId = createNumber("languageId", Integer.class);

    public final NumberPath<Integer> publishedIn = createNumber("publishedIn", Integer.class);

    public final StringPath title = createString("title");

    public final com.querydsl.sql.PrimaryKey<QBook> bookPkey = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QLanguage> bookLanguageFk = createForeignKey(languageId, "id");

    public final com.querydsl.sql.ForeignKey<QAuthor> bookAuthorFk = createForeignKey(authorId, "id");

    public final com.querydsl.sql.ForeignKey<QBookToBookStore> _b2bsBookFk = createInvForeignKey(id, "book_id");

    public QBook(String variable) {
        super(QBook.class, forVariable(variable), "public", "book");
        addMetadata();
    }

    public QBook(String variable, String schema, String table) {
        super(QBook.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBook(String variable, String schema) {
        super(QBook.class, forVariable(variable), schema, "book");
        addMetadata();
    }

    public QBook(Path<? extends QBook> path) {
        super(path.getType(), path.getMetadata(), "public", "book");
        addMetadata();
    }

    public QBook(PathMetadata metadata) {
        super(QBook.class, metadata, "public", "book");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authorId, ColumnMetadata.named("author_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(languageId, ColumnMetadata.named("language_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(publishedIn, ColumnMetadata.named("published_in").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(title, ColumnMetadata.named("title").withIndex(3).ofType(Types.VARCHAR).withSize(400).notNull());
    }

}

