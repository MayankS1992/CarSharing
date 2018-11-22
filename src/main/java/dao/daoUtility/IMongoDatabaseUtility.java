package dao.daoUtility;

import com.mongodb.DB;
import com.mongodb.DBCursor;

import java.util.List;

public interface IMongoDatabaseUtility {

    /**
     *
     *
     * @param database
     * @param ColumnName to be retrieved from Database
     * @param fieldName
     * @return Colletion of the Data
     */
    List getListValues(DB database, String ColumnName, String fieldName);

    /**
     *
     * @param database
     * @param ColumnName
     * @param fieldName
     * @param queryValue
     * @return
     */
    DBCursor cursor(DB database, String ColumnName, String fieldName,String queryValue);

    /**
     *
     * @param database
     * @param ColumnName
     * @param fieldName
     * @return
     */
    List distinctFields(DB database, String ColumnName, String fieldName);
}
