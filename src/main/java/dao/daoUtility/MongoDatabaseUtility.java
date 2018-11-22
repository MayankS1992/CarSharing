package dao.daoUtility;

import com.mongodb.*;

import java.util.List;

/**
 *
 */
public class MongoDatabaseUtility implements IMongoDatabaseUtility {


    /**
     *
     * @param database
     * @param ColumnName to be retrieved from Database
     * @param fieldName
     * @return List of Values
     */
    @Override
    public List getListValues(DB database, String ColumnName, String fieldName) {
        DBCollection collection = database.getCollection(ColumnName);
        return collection.distinct(fieldName);
    }

    /**
     * @param database
     * @param ColumnName
     * @param fieldName
     * @return
     */
    public DBCursor cursor(DB database, String ColumnName, String fieldName,String queryValue) {
        DBCollection col = database.getCollection(ColumnName);
        DBCursor cursor = col.find(new BasicDBObject(fieldName,queryValue));
        cursor.close();
        return cursor;
    }

    /**
     * @param database
     * @param ColumnName
     * @param fieldName
     * @return
     */
    public List distinctFields(DB database, String ColumnName, String fieldName) {
        DBCollection col = database.getCollection(ColumnName);
        List distinctFields = col.distinct(fieldName);
        return distinctFields;
    }
}
