package com.style.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile UserBeanDao _userBeanDao;

  private volatile FileDownloadStateDao _fileDownloadStateDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user_table` (`id` TEXT NOT NULL, `name` TEXT, `phone` TEXT, `sex` INTEGER NOT NULL, `updateTime` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `file_download` (`url` TEXT NOT NULL, `status` INTEGER NOT NULL, `totalSize` INTEGER NOT NULL, `downloadSize` INTEGER NOT NULL, PRIMARY KEY(`url`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6571f37fc83aa8d2c286a4ebf8fcfc89')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `user_table`");
        _db.execSQL("DROP TABLE IF EXISTS `file_download`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUserTable = new HashMap<String, TableInfo.Column>(5);
        _columnsUserTable.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserTable.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserTable.put("phone", new TableInfo.Column("phone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserTable.put("sex", new TableInfo.Column("sex", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserTable.put("updateTime", new TableInfo.Column("updateTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserTable = new TableInfo("user_table", _columnsUserTable, _foreignKeysUserTable, _indicesUserTable);
        final TableInfo _existingUserTable = TableInfo.read(_db, "user_table");
        if (! _infoUserTable.equals(_existingUserTable)) {
          return new RoomOpenHelper.ValidationResult(false, "user_table(com.style.entity.UserBean).\n"
                  + " Expected:\n" + _infoUserTable + "\n"
                  + " Found:\n" + _existingUserTable);
        }
        final HashMap<String, TableInfo.Column> _columnsFileDownload = new HashMap<String, TableInfo.Column>(4);
        _columnsFileDownload.put("url", new TableInfo.Column("url", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFileDownload.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFileDownload.put("totalSize", new TableInfo.Column("totalSize", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFileDownload.put("downloadSize", new TableInfo.Column("downloadSize", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFileDownload = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFileDownload = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFileDownload = new TableInfo("file_download", _columnsFileDownload, _foreignKeysFileDownload, _indicesFileDownload);
        final TableInfo _existingFileDownload = TableInfo.read(_db, "file_download");
        if (! _infoFileDownload.equals(_existingFileDownload)) {
          return new RoomOpenHelper.ValidationResult(false, "file_download(com.style.data.fileDown.FileDownloadStateBean).\n"
                  + " Expected:\n" + _infoFileDownload + "\n"
                  + " Found:\n" + _existingFileDownload);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "6571f37fc83aa8d2c286a4ebf8fcfc89", "6e54bd90bed369a586208d80c2fee622");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "user_table","file_download");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `user_table`");
      _db.execSQL("DELETE FROM `file_download`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UserBeanDao.class, UserBeanDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(FileDownloadStateDao.class, FileDownloadStateDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public UserBeanDao getTestRoomDao() {
    if (_userBeanDao != null) {
      return _userBeanDao;
    } else {
      synchronized(this) {
        if(_userBeanDao == null) {
          _userBeanDao = new UserBeanDao_Impl(this);
        }
        return _userBeanDao;
      }
    }
  }

  @Override
  public FileDownloadStateDao getFileDownloadDao() {
    if (_fileDownloadStateDao != null) {
      return _fileDownloadStateDao;
    } else {
      synchronized(this) {
        if(_fileDownloadStateDao == null) {
          _fileDownloadStateDao = new FileDownloadStateDao_Impl(this);
        }
        return _fileDownloadStateDao;
      }
    }
  }
}
