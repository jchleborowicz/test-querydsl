package pl.jdata.example.querydsl.querydsl_demo.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBookStore is a Querydsl query type for QBookStore
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBookStore extends com.querydsl.sql.RelationalPathBase<QBookStore> {

    private static final long serialVersionUID = 1585880592;

    public static final QBookStore bookStore = new QBookStore("book_store");

    public final StringPath name = createString("name");

    public final com.querydsl.sql.ForeignKey<QBookToBookStore> _b2bsBookStoreFk = createInvForeignKey(name, "name");

    public QBookStore(String variable) {
        super(QBookStore.class, forVariable(variable), "public", "book_store");
        addMetadata();
    }

    public QBookStore(String variable, String schema, String table) {
        super(QBookStore.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBookStore(String variable, String schema) {
        super(QBookStore.class, forVariable(variable), schema, "book_store");
        addMetadata();
    }

    public QBookStore(Path<? extends QBookStore> path) {
        super(path.getType(), path.getMetadata(), "public", "book_store");
        addMetadata();
    }

    public QBookStore(PathMetadata metadata) {
        super(QBookStore.class, metadata, "public", "book_store");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.VARCHAR).withSize(400).notNull());
    }

}

