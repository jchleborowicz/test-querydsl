package pl.jdata.example.querydsl.querydsl_demo.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBookToBookStore is a Querydsl query type for QBookToBookStore
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBookToBookStore extends com.querydsl.sql.RelationalPathBase<QBookToBookStore> {

    private static final long serialVersionUID = -1658640084;

    public static final QBookToBookStore bookToBookStore = new QBookToBookStore("book_to_book_store");

    public final NumberPath<Integer> bookId = createNumber("bookId", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> stock = createNumber("stock", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QBookToBookStore> bookToBookStorePkey = createPrimaryKey(name, bookId);

    public final com.querydsl.sql.ForeignKey<QBook> b2bsBookFk = createForeignKey(bookId, "id");

    public final com.querydsl.sql.ForeignKey<QBookStore> b2bsBookStoreFk = createForeignKey(name, "name");

    public QBookToBookStore(String variable) {
        super(QBookToBookStore.class, forVariable(variable), "public", "book_to_book_store");
        addMetadata();
    }

    public QBookToBookStore(String variable, String schema, String table) {
        super(QBookToBookStore.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBookToBookStore(String variable, String schema) {
        super(QBookToBookStore.class, forVariable(variable), schema, "book_to_book_store");
        addMetadata();
    }

    public QBookToBookStore(Path<? extends QBookToBookStore> path) {
        super(path.getType(), path.getMetadata(), "public", "book_to_book_store");
        addMetadata();
    }

    public QBookToBookStore(PathMetadata metadata) {
        super(QBookToBookStore.class, metadata, "public", "book_to_book_store");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bookId, ColumnMetadata.named("book_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.VARCHAR).withSize(400).notNull());
        addMetadata(stock, ColumnMetadata.named("stock").withIndex(3).ofType(Types.INTEGER).withSize(10));
    }

}

