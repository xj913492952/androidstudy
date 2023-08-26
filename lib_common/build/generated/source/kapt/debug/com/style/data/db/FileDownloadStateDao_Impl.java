package com.style.data.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.style.data.fileDown.FileDownloadStateBean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class FileDownloadStateDao_Impl implements FileDownloadStateDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FileDownloadStateBean> __insertionAdapterOfFileDownloadStateBean;

  private final EntityDeletionOrUpdateAdapter<FileDownloadStateBean> __updateAdapterOfFileDownloadStateBean;

  private final SharedSQLiteStatement __preparedStmtOfUpdate;

  public FileDownloadStateDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFileDownloadStateBean = new EntityInsertionAdapter<FileDownloadStateBean>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `file_download` (`url`,`status`,`totalSize`,`downloadSize`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FileDownloadStateBean value) {
        if (value.url == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.url);
        }
        stmt.bindLong(2, value.status);
        stmt.bindLong(3, value.totalSize);
        stmt.bindLong(4, value.downloadSize);
      }
    };
    this.__updateAdapterOfFileDownloadStateBean = new EntityDeletionOrUpdateAdapter<FileDownloadStateBean>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `file_download` SET `url` = ?,`status` = ?,`totalSize` = ?,`downloadSize` = ? WHERE `url` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FileDownloadStateBean value) {
        if (value.url == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.url);
        }
        stmt.bindLong(2, value.status);
        stmt.bindLong(3, value.totalSize);
        stmt.bindLong(4, value.downloadSize);
        if (value.url == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.url);
        }
      }
    };
    this.__preparedStmtOfUpdate = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE file_download SET status=?,downloadSize=? WHERE url=?";
        return _query;
      }
    };
  }

  @Override
  public long save(final FileDownloadStateBean bean) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfFileDownloadStateBean.insertAndReturnId(bean);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final FileDownloadStateBean entity) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfFileDownloadStateBean.handle(entity);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final int status, final int downloadSize, final String url) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdate.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, status);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, downloadSize);
    _argIndex = 3;
    if (url == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, url);
    }
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdate.release(_stmt);
    }
  }

  @Override
  public List<FileDownloadStateBean> getAll() {
    final String _sql = "SELECT * FROM file_download";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfTotalSize = CursorUtil.getColumnIndexOrThrow(_cursor, "totalSize");
      final int _cursorIndexOfDownloadSize = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadSize");
      final List<FileDownloadStateBean> _result = new ArrayList<FileDownloadStateBean>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final FileDownloadStateBean _item;
        _item = new FileDownloadStateBean();
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _item.url = null;
        } else {
          _item.url = _cursor.getString(_cursorIndexOfUrl);
        }
        _item.status = _cursor.getInt(_cursorIndexOfStatus);
        _item.totalSize = _cursor.getInt(_cursorIndexOfTotalSize);
        _item.downloadSize = _cursor.getInt(_cursorIndexOfDownloadSize);
        _result.add(_item);
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
