package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyra extends SQLiteOpenHelper {
    public dyra(Context context) {
        super(context, "lighter_registration.db", (SQLiteDatabase.CursorFactory) null, 8);
        dyia.b();
    }

    private static final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE registration ( registration_id INTEGER PRIMARY KEY AUTOINCREMENT, tachyon_app_name TEXT, tachyon_auth_token BLOB, auth_token_expire_at_timestamp_ms INT, identity_key_type INT NOT NULL DEFAULT 1, identity_key_private BLOB, identity_key_public BLOB, server_registration_id BLOB, server_registration_status INTEGER, auth_token_refreshed_at_timestamp_ms INTEGER, registration_properties BLOB);");
        sQLiteDatabase.execSQL("CREATE TABLE reachability(reachability_id TEXT, reachability_type INT,  registration_id INT,  reachability_normalized_id TEXT, FOREIGN KEY (registration_id) REFERENCES registration(registration_id) ON DELETE CASCADE, PRIMARY KEY (registration_id, reachability_type, reachability_id));");
        sQLiteDatabase.execSQL("CREATE INDEX registration_tachyon_app_name on registration(tachyon_app_name)");
    }

    private static final void b(SQLiteDatabase sQLiteDatabase) {
        dytn.d(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 < 7) {
            b(sQLiteDatabase);
            return;
        }
        dytn.f(sQLiteDatabase, "registration", "CREATE TABLE registration ( registration_id INTEGER PRIMARY KEY AUTOINCREMENT, tachyon_app_name TEXT, tachyon_auth_token BLOB, auth_token_expire_at_timestamp_ms INT, identity_key_type INT NOT NULL DEFAULT 1, identity_key_private BLOB, identity_key_public BLOB, server_registration_id BLOB, server_registration_status INTEGER, auth_token_refreshed_at_timestamp_ms INTEGER, registration_properties BLOB);", dywv.a);
        dytn.f(sQLiteDatabase, "reachability", "CREATE TABLE reachability(reachability_id TEXT, reachability_type INT,  registration_id INT,  reachability_normalized_id TEXT, FOREIGN KEY (registration_id) REFERENCES registration(registration_id) ON DELETE CASCADE, PRIMARY KEY (registration_id, reachability_type, reachability_id));", dywt.a);
        sQLiteDatabase.execSQL("CREATE INDEX registration_tachyon_app_name on registration(tachyon_app_name)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase.isReadOnly()) {
            return;
        }
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        SQLiteDatabase sQLiteDatabase2;
        if (i < 5) {
            b(sQLiteDatabase);
            return;
        }
        int i3 = i + 1;
        while (i3 <= i2) {
            if (i3 != 6) {
                if (i3 == 7) {
                    sQLiteDatabase.execSQL("ALTER TABLE registration ADD COLUMN identity_key_type INT NOT NULL DEFAULT 1;");
                } else if (i3 == 8) {
                    sQLiteDatabase.execSQL("ALTER TABLE registration ADD COLUMN registration_properties BLOB;");
                }
                sQLiteDatabase2 = sQLiteDatabase;
            } else {
                sQLiteDatabase.execSQL("ALTER TABLE reachability ADD COLUMN reachability_normalized_id TEXT;");
                int i4 = dzpf.EMAIL.f;
                sQLiteDatabase2 = sQLiteDatabase;
                Cursor query = sQLiteDatabase2.query("reachability", null, null, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            do {
                                String string = query.getString(dyws.a(1));
                                int i5 = query.getInt(dyws.a(2));
                                int i6 = query.getInt(dyws.a(3));
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("reachability_normalized_id", i5 == i4 ? dyhm.a(string) : string);
                                sQLiteDatabase2.update("reachability", contentValues, "reachability_id = ? AND reachability_type = ? AND registration_id = ?", new String[]{string, Integer.toString(i5), Integer.toString(i6)});
                            } while (query.moveToNext());
                        }
                    } finally {
                    }
                }
                if (query != null) {
                    query.close();
                }
            }
            i3++;
            sQLiteDatabase = sQLiteDatabase2;
        }
    }
}
