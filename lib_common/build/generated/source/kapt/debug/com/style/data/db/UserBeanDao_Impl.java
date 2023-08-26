package com.style.data.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.style.entity.UserBean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class UserBeanDao_Impl implements UserBeanDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserBean> __insertionAdapterOfUserBean;

  private final EntityDeletionOrUpdateAdapter<UserBean> __deletionAdapterOfUserBean;

  private final EntityDeletionOrUpdateAdapter<UserBean> __updateAdapterOfUserBean;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public UserBeanDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserBean = new EntityInsertionAdapter<UserBean>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user_table` (`id`,`name`,`phone`,`sex`,`updateTime`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserBean value) {
        if (value.id == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.id);
        }
        if (value.name == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.name);
        }
        if (value.phone == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.phone);
        }
        stmt.bindLong(4, value.sex);
        stmt.bindLong(5, value.updateTime);
      }
    };
    this.__deletionAdapterOfUserBean = new EntityDeletionOrUpdateAdapter<UserBean>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `user_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserBean value) {
        if (value.id == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.id);
        }
      }
    };
    this.__updateAdapterOfUserBean = new EntityDeletionOrUpdateAdapter<UserBean>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `user_table` SET `id` = ?,`name` = ?,`phone` = ?,`sex` = ?,`updateTime` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserBean value) {
        if (value.id == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.id);
        }
        if (value.name == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.name);
        }
        if (value.phone == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.phone);
        }
        stmt.bindLong(4, value.sex);
        stmt.bindLong(5, value.updateTime);
        if (value.id == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.id);
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM user_table";
        return _query;
      }
    };
  }

  @Override
  public void save(final ArrayList<UserBean> list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserBean.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void save(final UserBean entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserBean.insert(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final UserBean[] users) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserBean.insert(users);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final UserBean entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserBean.handle(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final UserBean entity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfUserBean.handle(entity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final ArrayList<UserBean> list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfUserBean.handleMultiple(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<UserBean> getAll() {
    final String _sql = "SELECT * FROM user_table ORDER BY updateTime ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfSex = CursorUtil.getColumnIndexOrThrow(_cursor, "sex");
      final int _cursorIndexOfUpdateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "updateTime");
      final List<UserBean> _result = new ArrayList<UserBean>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserBean _item;
        _item = new UserBean();
        if (_cursor.isNull(_cursorIndexOfId)) {
          _item.id = null;
        } else {
          _item.id = _cursor.getString(_cursorIndexOfId);
        }
        if (_cursor.isNull(_cursorIndexOfName)) {
          _item.name = null;
        } else {
          _item.name = _cursor.getString(_cursorIndexOfName);
        }
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _item.phone = null;
        } else {
          _item.phone = _cursor.getString(_cursorIndexOfPhone);
        }
        _item.sex = _cursor.getInt(_cursorIndexOfSex);
        _item.updateTime = _cursor.getLong(_cursorIndexOfUpdateTime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<UserBean> getAllDesc() {
    final String _sql = "SELECT * FROM user_table ORDER BY updateTime DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfSex = CursorUtil.getColumnIndexOrThrow(_cursor, "sex");
      final int _cursorIndexOfUpdateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "updateTime");
      final List<UserBean> _result = new ArrayList<UserBean>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserBean _item;
        _item = new UserBean();
        if (_cursor.isNull(_cursorIndexOfId)) {
          _item.id = null;
        } else {
          _item.id = _cursor.getString(_cursorIndexOfId);
        }
        if (_cursor.isNull(_cursorIndexOfName)) {
          _item.name = null;
        } else {
          _item.name = _cursor.getString(_cursorIndexOfName);
        }
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _item.phone = null;
        } else {
          _item.phone = _cursor.getString(_cursorIndexOfPhone);
        }
        _item.sex = _cursor.getInt(_cursorIndexOfSex);
        _item.updateTime = _cursor.getLong(_cursorIndexOfUpdateTime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getCount() {
    final String _sql = "SELECT COUNT(*) FROM user_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<UserBean> getByLimit(final int current, final int count) {
    final String _sql = "SELECT * FROM user_table LIMIT ?,? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, current);
    _argIndex = 2;
    _statement.bindLong(_argIndex, count);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfSex = CursorUtil.getColumnIndexOrThrow(_cursor, "sex");
      final int _cursorIndexOfUpdateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "updateTime");
      final List<UserBean> _result = new ArrayList<UserBean>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserBean _item;
        _item = new UserBean();
        if (_cursor.isNull(_cursorIndexOfId)) {
          _item.id = null;
        } else {
          _item.id = _cursor.getString(_cursorIndexOfId);
        }
        if (_cursor.isNull(_cursorIndexOfName)) {
          _item.name = null;
        } else {
          _item.name = _cursor.getString(_cursorIndexOfName);
        }
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _item.phone = null;
        } else {
          _item.phone = _cursor.getString(_cursorIndexOfPhone);
        }
        _item.sex = _cursor.getInt(_cursorIndexOfSex);
        _item.updateTime = _cursor.getLong(_cursorIndexOfUpdateTime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<UserBean> queryAllByIds(final int[] userIds) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM user_table WHERE id IN (");
    final int _inputSize = userIds.length;
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int _item : userIds) {
      _statement.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfSex = CursorUtil.getColumnIndexOrThrow(_cursor, "sex");
      final int _cursorIndexOfUpdateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "updateTime");
      final List<UserBean> _result = new ArrayList<UserBean>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final UserBean _item_1;
        _item_1 = new UserBean();
        if (_cursor.isNull(_cursorIndexOfId)) {
          _item_1.id = null;
        } else {
          _item_1.id = _cursor.getString(_cursorIndexOfId);
        }
        if (_cursor.isNull(_cursorIndexOfName)) {
          _item_1.name = null;
        } else {
          _item_1.name = _cursor.getString(_cursorIndexOfName);
        }
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _item_1.phone = null;
        } else {
          _item_1.phone = _cursor.getString(_cursorIndexOfPhone);
        }
        _item_1.sex = _cursor.getInt(_cursorIndexOfSex);
        _item_1.updateTime = _cursor.getLong(_cursorIndexOfUpdateTime);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public UserBean findById(final String id) {
    final String _sql = "SELECT * FROM user_table WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfSex = CursorUtil.getColumnIndexOrThrow(_cursor, "sex");
      final int _cursorIndexOfUpdateTime = CursorUtil.getColumnIndexOrThrow(_cursor, "updateTime");
      final UserBean _result;
      if(_cursor.moveToFirst()) {
        _result = new UserBean();
        if (_cursor.isNull(_cursorIndexOfId)) {
          _result.id = null;
        } else {
          _result.id = _cursor.getString(_cursorIndexOfId);
        }
        if (_cursor.isNull(_cursorIndexOfName)) {
          _result.name = null;
        } else {
          _result.name = _cursor.getString(_cursorIndexOfName);
        }
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _result.phone = null;
        } else {
          _result.phone = _cursor.getString(_cursorIndexOfPhone);
        }
        _result.sex = _cursor.getInt(_cursorIndexOfSex);
        _result.updateTime = _cursor.getLong(_cursorIndexOfUpdateTime);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
