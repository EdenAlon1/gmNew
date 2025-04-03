package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Base64;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqy extends SQLiteOpenHelper {
    static final String[] a = {"id", "conversation_type", "conversation_group_id", "conversation_group_app_name", "other_contact_row_id", "update_timestamp_us", "owner_row_id", "conversation_app_data", "conversation_properties"};
    private final Context b;

    public dyqy(Context context, long j) {
        super(context, String.format("lighter_messaging_%d.db", Long.valueOf(j)), (SQLiteDatabase.CursorFactory) null, 27);
        dyia.b();
        emxf.b(j >= 0, "registrationId is invalid; ensure AccountContext is valid");
        this.b = context;
    }

    private static emxc a(byte[] bArr) {
        try {
            return emxc.j((fbzt) eyfy.parseFrom(fbzt.a, bArr, eyfc.a()));
        } catch (eygu unused) {
            return emux.a;
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        try {
            sQLiteDatabase.execSQL("ALTER TABLE " + str + " ADD COLUMN " + str2 + " " + str3 + ";");
        } catch (SQLException e) {
            Cursor cursor = null;
            boolean z = false;
            try {
                try {
                    cursor = sQLiteDatabase.rawQuery(a.a(str, "select * from ", " limit 0"), null);
                    if (cursor != null) {
                        if (cursor.getColumnIndex(str2) != -1) {
                            z = true;
                        }
                    }
                } finally {
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                }
            } catch (RuntimeException e2) {
                dyhr.d("Messaging SqliteHelper", a.d(str, str2, "failed to check column ", " in table ", "."), e2);
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                    throw e;
                }
            }
            if (!z) {
                throw e;
            }
        }
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(dywp.b);
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS messagesRENDERING_TYPE on messages(rendering_type)");
        sQLiteDatabase.execSQL("CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,last_deleted_timestamp_us INT NOT NULL DEFAULT 0, local_update_timestamp_ms INT NOT NULL DEFAULT 0,owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL,lighter_id_normalized_id TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS participants (id INTEGER PRIMARY KEY,conversation_row_id INTEGER,contact_row_id INTEGER, UNIQUE(conversation_row_id , contact_row_id) ON CONFLICT REPLACE, FOREIGN KEY(conversation_row_id) REFERENCES conversations(id) ON DELETE CASCADE, FOREIGN KEY(contact_row_id) REFERENCES contacts(id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS blocks(id INTEGER PRIMARY KEY,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,lighter_id_normalized_id TEXT)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID on blocks(lighter_id_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
        sQLiteDatabase.execSQL("CREATE TABLE notifications (id INTEGER PRIMARY KEY,notification_id TEXT UNIQUE NOT NULL,notification_type INTEGER NOT NULL,notification_metadata BLOB NOT NULL,notification_properties BLOB NOT NULL,notification_timestamp_received_ms INTEGER NOT NULL default 0)");
        sQLiteDatabase.execSQL("CREATE TABLE kvstore (key TEXT UNIQUE NOT NULL,value BLOB NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS deleted_conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_id_string TEXT,local_delete_timestamp_ms INT NOT NULL DEFAULT 0)");
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        dytn.d(sQLiteDatabase);
        c(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 < 19) {
            d(sQLiteDatabase);
            return;
        }
        while (true) {
            i--;
            if (i < i2) {
                return;
            }
            if (i == 19) {
                dytn.f(sQLiteDatabase, "messages", dywp.b, dywp.a);
                dytn.f(sQLiteDatabase, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,last_deleted_timestamp_us INT NOT NULL DEFAULT 0, local_update_timestamp_ms INT NOT NULL DEFAULT 0,owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )", a);
                dytn.f(sQLiteDatabase, "contacts", "CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL,lighter_id_normalized_id TEXT)", dywi.a);
                dytn.f(sQLiteDatabase, "participants", "CREATE TABLE IF NOT EXISTS participants (id INTEGER PRIMARY KEY,conversation_row_id INTEGER,contact_row_id INTEGER, UNIQUE(conversation_row_id , contact_row_id) ON CONFLICT REPLACE, FOREIGN KEY(conversation_row_id) REFERENCES conversations(id) ON DELETE CASCADE, FOREIGN KEY(contact_row_id) REFERENCES contacts(id) ON DELETE CASCADE)", dywr.a);
                dytn.f(sQLiteDatabase, "blocks", "CREATE TABLE IF NOT EXISTS blocks(id INTEGER PRIMARY KEY,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,lighter_id_normalized_id TEXT)", dywg.a);
                dytn.f(sQLiteDatabase, "notifications", "CREATE TABLE notifications (id INTEGER PRIMARY KEY,notification_id TEXT UNIQUE NOT NULL,notification_type INTEGER NOT NULL,notification_metadata BLOB NOT NULL,notification_properties BLOB NOT NULL,notification_timestamp_received_ms INTEGER NOT NULL default 0)", dywq.a);
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID on blocks(lighter_id_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS messagesRENDERING_TYPE on messages(rendering_type)");
            } else if (i == 20) {
                dytn.f(sQLiteDatabase, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INT NOT NULL DEFAULT 0, owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )", a);
            } else if (i == 26) {
                sQLiteDatabase.execSQL("DROP TABLE deleted_conversations");
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase.isReadOnly()) {
            return;
        }
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        String str;
        String str2;
        String str3;
        boolean z;
        Cursor query;
        String str4;
        emxc a2;
        String str5;
        dyqy dyqyVar = this;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String str6 = "TEXT";
        String str7 = "blocks";
        dyyt a3 = dyyt.a(dyqyVar.b);
        dzhl r = dzhm.r();
        r.g(BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED);
        r.f(381);
        a3.b(r.a());
        String str8 = "0";
        try {
        } catch (RuntimeException e) {
            e = e;
        }
        if (i < 11) {
            d(sQLiteDatabase2);
        } else {
            int i4 = i + 1;
            while (i4 <= i2) {
                switch (i4) {
                    case 12:
                        i3 = i4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        dytn.e(sQLiteDatabase2, "notifications");
                        sQLiteDatabase2.execSQL("CREATE TABLE notifications (id INTEGER PRIMARY KEY, notification_id TEXT UNIQUE NOT NULL, notification_type INTEGER NOT NULL, notification_metadata BLOB NOT NULL, notification_properties BLOB NOT NULL)");
                        dyqyVar = this;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 13:
                        i3 = i4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        b(sQLiteDatabase2, "notifications", "notification_timestamp_received_ms", "INTEGER NOT NULL default 0");
                        dyqyVar = this;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 14:
                        i3 = i4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        dytn.g(sQLiteDatabase2, "contacts", "CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL)");
                        dytn.g(sQLiteDatabase2, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,owner_row_id INT,FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE)");
                        dyqyVar = this;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 15:
                        i3 = i4;
                        str3 = str8;
                        int c = (int) fdql.c();
                        long b = fdql.b();
                        Random random = new Random();
                        String str9 = "contacts";
                        str = str6;
                        str2 = str7;
                        query = sQLiteDatabase2.query("conversations", new String[]{"id", "conversation_properties"}, null, null, null, null, null);
                        while (true) {
                            try {
                                long j = -1;
                                if (query.moveToNext()) {
                                    HashMap b2 = dyuh.b(query.getBlob(1));
                                    long longValue = ((Long) b2.get("last_sync_date")).longValue();
                                    if (longValue != -1) {
                                        j = longValue + random.nextInt(c) + b;
                                    }
                                    b2.put("expiration_time_ms", Long.valueOf(j));
                                    b2.remove("last_sync_date");
                                    try {
                                        byte[] i5 = dyhu.i(b2);
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("conversation_properties", i5);
                                        sQLiteDatabase2.update("conversations", contentValues, "id = ?", new String[]{String.valueOf(query.getInt(0))});
                                    } catch (IOException unused) {
                                        dyhr.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                    }
                                } else {
                                    if (query != null) {
                                        query.close();
                                    }
                                    Random random2 = new Random();
                                    Cursor query2 = sQLiteDatabase2.query("contacts", new String[]{"id", "contact_properties"}, null, null, null, null, null);
                                    while (query2.moveToNext()) {
                                        try {
                                            HashMap g = dyhu.g(query2.getBlob(1));
                                            long longValue2 = ((Long) g.get("last_sync_date")).longValue();
                                            g.put("expiration_time_ms", Long.valueOf(longValue2 == -1 ? -1L : longValue2 + random2.nextInt(c) + b));
                                            g.remove("last_sync_date");
                                            try {
                                                byte[] i6 = dyhu.i(g);
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("contact_properties", i6);
                                                try {
                                                    str4 = str9;
                                                    try {
                                                        sQLiteDatabase2.update(str4, contentValues2, "id = ?", new String[]{String.valueOf(query2.getInt(0))});
                                                    } catch (IOException unused2) {
                                                        dyhr.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                                        str9 = str4;
                                                    }
                                                } catch (IOException unused3) {
                                                    str4 = str9;
                                                }
                                            } catch (IOException unused4) {
                                                str4 = str9;
                                            }
                                            str9 = str4;
                                        } finally {
                                            if (query2 == null) {
                                                throw th;
                                            }
                                            try {
                                                query2.close();
                                                throw th;
                                            } catch (Throwable th) {
                                                th.addSuppressed(th);
                                            }
                                        }
                                    }
                                    z = true;
                                    if (query2 != null) {
                                        query2.close();
                                    }
                                    dyqyVar = this;
                                    i4 = i3 + 1;
                                    str8 = str3;
                                    str7 = str2;
                                    str6 = str;
                                }
                            } finally {
                                if (query == null) {
                                    throw th;
                                }
                                try {
                                    query.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            e = e;
                            dyqyVar = this;
                            dyyt a4 = dyyt.a(dyqyVar.b);
                            dzhl r2 = dzhm.r();
                            r2.g(204);
                            r2.f(381);
                            a4.b(r2.a());
                            throw e;
                        }
                    case 16:
                        str3 = str8;
                        i3 = i4;
                        b(sQLiteDatabase2, str7, "lighter_id_normalized_id", str6);
                        sQLiteDatabase2.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                        b(sQLiteDatabase2, "contacts", "lighter_id_normalized_id", str6);
                        Cursor query3 = sQLiteDatabase2.query("blocks", null, null, null, null, null, null);
                        if (query3 != null) {
                            try {
                                if (query3.moveToFirst()) {
                                    do {
                                        int i7 = query3.getInt(dywf.a(1));
                                        String string = query3.getString(dywf.a(3));
                                        int i8 = query3.getInt(dywf.a(2));
                                        ContentValues contentValues3 = new ContentValues();
                                        if (i8 == 2) {
                                            string = dyhm.a(string);
                                        }
                                        contentValues3.put("lighter_id_normalized_id", string);
                                        sQLiteDatabase2.update(str7, contentValues3, "id = ? ", new String[]{Integer.toString(i7)});
                                    } while (query3.moveToNext());
                                }
                            } finally {
                                try {
                                    query3.close();
                                    throw th;
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                            }
                        }
                        if (query3 != null) {
                            query3.close();
                        }
                        query3 = sQLiteDatabase2.query("contacts", null, null, null, null, null, null);
                        if (query3 != null) {
                            try {
                                if (query3.moveToFirst()) {
                                    do {
                                        int i9 = query3.getInt(dywh.a(1));
                                        String string2 = query3.getString(dywh.a(3));
                                        int i10 = query3.getInt(dywh.a(2));
                                        ContentValues contentValues4 = new ContentValues();
                                        if (i10 == 2) {
                                            string2 = dyhm.a(string2);
                                        }
                                        contentValues4.put("lighter_id_normalized_id", string2);
                                        sQLiteDatabase2.update("contacts", contentValues4, "id = ? ", new String[]{Integer.toString(i9)});
                                    } while (query3.moveToNext());
                                }
                            } finally {
                            }
                        }
                        if (query3 != null) {
                            query3.close();
                        }
                        z = true;
                        dyqyVar = this;
                        str = str6;
                        str2 = str7;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 17:
                        i3 = i4;
                        str3 = str8;
                        b(sQLiteDatabase2, "messages", "needs_delivery_receipt", "INTEGER NOT NULL default 0");
                        z = true;
                        dyqyVar = this;
                        str = str6;
                        str2 = str7;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 18:
                        i3 = i4;
                        try {
                            b(sQLiteDatabase2, "conversations", "conversation_app_data", "BLOB NOT NULL default 0");
                            str3 = str8;
                            Cursor query4 = sQLiteDatabase2.query("conversations", new String[]{"id", "conversation_properties"}, null, null, null, null, null);
                            while (query4.moveToNext()) {
                                try {
                                    HashMap b3 = dyuh.b(query4.getBlob(1));
                                    HashMap hashMap = (HashMap) b3.get("app_data");
                                    b3.remove("app_data");
                                    try {
                                        byte[] i11 = dyhu.i(b3);
                                        ContentValues contentValues5 = new ContentValues();
                                        contentValues5.put("conversation_properties", i11);
                                        contentValues5.put("conversation_app_data", dyuh.d(hashMap));
                                        sQLiteDatabase2.update("conversations", contentValues5, "id = ?", new String[]{String.valueOf(query4.getInt(0))});
                                    } catch (IOException unused5) {
                                        dyhr.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                    }
                                } finally {
                                }
                            }
                            if (query4 != null) {
                                query4.close();
                            }
                            z = true;
                            dyqyVar = this;
                            str = str6;
                            str2 = str7;
                            i4 = i3 + 1;
                            str8 = str3;
                            str7 = str2;
                            str6 = str;
                        } catch (RuntimeException e2) {
                            e = e2;
                            dyqyVar = this;
                            break;
                        }
                    case 19:
                        i3 = i4;
                        b(sQLiteDatabase2, "messages", "capability", "INTEGER NOT NULL DEFAULT -1");
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 20:
                        i3 = i4;
                        b(sQLiteDatabase2, "messages", "rendering_type", "INTEGER NOT NULL DEFAULT " + dzqr.DEFAULT_RENDERING_TYPE.f);
                        sQLiteDatabase2.execSQL("CREATE INDEX IF NOT EXISTS messagesRENDERING_TYPE on messages(rendering_type)");
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 21:
                        i3 = i4;
                        b(sQLiteDatabase2, "conversations", "last_deleted_timestamp_us", "INT NOT NULL DEFAULT 0");
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 22:
                        i3 = i4;
                        b(sQLiteDatabase2, "messages", "filterable_flags", "INTEGER NOT NULL DEFAULT 0");
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 23:
                        i3 = i4;
                        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS kvstore (key TEXT UNIQUE NOT NULL,value BLOB NOT NULL)");
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 24:
                        i3 = i4;
                        String str10 = "messages";
                        query = sQLiteDatabase2.query("messages", new String[]{"id", "message_properties"}, "capability <> ?", new String[]{"-1"}, null, null, null);
                        while (query.moveToNext()) {
                            try {
                                HashMap c2 = dyuq.c(query.getBlob(1));
                                byte[] bArr = (byte[]) c2.get("message_content");
                                if (bArr.length != 0 && dzqh.b(ermn.c((byte[]) c2.get("content_type"))) == 1) {
                                    try {
                                        try {
                                            a2 = a(Base64.decode(bArr, 8));
                                            if (!a2.g()) {
                                                a2 = a(bArr);
                                            }
                                        } catch (IOException unused6) {
                                            str5 = str10;
                                            dyhr.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                            str10 = str5;
                                        }
                                    } catch (IllegalArgumentException unused7) {
                                        a2 = a(bArr);
                                    }
                                    if (a2.g()) {
                                        fblh fblhVar = (fblh) eyfy.parseFrom(fblh.a, ((fbzt) a2.c()).e, eyfc.a());
                                        fbgl fbglVar = (fbgl) fbgm.a.createBuilder();
                                        fbglVar.copyOnWrite();
                                        fbgm fbgmVar = (fbgm) fbglVar.instance;
                                        fblhVar.getClass();
                                        fbgmVar.c = fblhVar;
                                        fbgmVar.b |= 1;
                                        c2.put("message_content", eyee.x(Base64.encode(((fbgm) fbglVar.build()).toByteArray(), 8)).I());
                                        byte[] i12 = dyhu.i(c2);
                                        ContentValues contentValues6 = new ContentValues();
                                        contentValues6.put("message_properties", i12);
                                        str5 = str10;
                                        try {
                                            sQLiteDatabase2.update(str5, contentValues6, "id = ?", new String[]{String.valueOf(query.getInt(0))});
                                        } catch (IOException unused8) {
                                            dyhr.c("Messaging SqliteHelper", "Unable to serialize obejct");
                                            str10 = str5;
                                        }
                                        str10 = str5;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (query != null) {
                            query.close();
                        }
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                        break;
                    case 25:
                        i3 = i4;
                        Cursor query5 = sQLiteDatabase2.query("contacts", new String[]{"id"}, "lighter_id_app_name = ?", new String[]{"GMM"}, null, null, null);
                        while (query5.moveToNext()) {
                            int i13 = query5.getInt(0);
                            Cursor cursor = query5;
                            Cursor query6 = sQLiteDatabase.query("messages", new String[]{"conversation_row_id"}, "sender_contact_row_id = ?  AND message_type = ? ", new String[]{String.valueOf(i13), str8}, null, null, null);
                            if (query6.moveToNext()) {
                                Cursor query7 = sQLiteDatabase.query("conversations", new String[]{"conversation_app_data"}, "id = ?  AND conversation_type = ?", new String[]{String.valueOf(query6.getInt(0)), String.valueOf(dzpq.GROUP.c)}, null, null, null);
                                if (query7.moveToNext()) {
                                    emxc a5 = dzdw.a(dyhu.h(query7.getBlob(0)));
                                    if (a5.g()) {
                                        for (dzpg dzpgVar : ((dyzw) a5.c()).a) {
                                            if (dzpgVar.c().g() && ((String) dzpgVar.c().c()).equals("lfb")) {
                                                ContentValues contentValues7 = new ContentValues();
                                                contentValues7.put("lighter_id_type", Integer.valueOf(dzpgVar.b().f));
                                                contentValues7.put("lighter_id_id", dzpgVar.d());
                                                contentValues7.put("lighter_id_normalized_id", dzpgVar.b() == dzpf.EMAIL ? dyhm.a(dzpgVar.d()) : dzpgVar.d());
                                                contentValues7.put("lighter_handler_id", (String) dzpgVar.c().f());
                                                contentValues7.put("lighter_id_app_name", dzpgVar.e());
                                                sQLiteDatabase.update("contacts", contentValues7, "id = ? ", new String[]{String.valueOf(i13)});
                                            }
                                        }
                                        if (query7 != null && !query7.isClosed()) {
                                            query7.close();
                                        }
                                        if (query6 != null && !query6.isClosed()) {
                                            query6.close();
                                        }
                                    }
                                }
                            }
                            query5 = cursor;
                        }
                        sQLiteDatabase2 = sQLiteDatabase;
                        Cursor cursor2 = query5;
                        if (cursor2 != null && !cursor2.isClosed()) {
                            cursor2.close();
                        }
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                        break;
                    case 26:
                        b(sQLiteDatabase2, "conversations", "local_update_timestamp_ms", "INT NOT NULL DEFAULT 0");
                        i3 = i4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    case 27:
                        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS deleted_conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_id_string TEXT,local_delete_timestamp_ms INT NOT NULL DEFAULT 0)");
                        i3 = i4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                    default:
                        i3 = i4;
                        str = str6;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        i4 = i3 + 1;
                        str8 = str3;
                        str7 = str2;
                        str6 = str;
                }
            }
        }
        dyyt a6 = dyyt.a(dyqyVar.b);
        dzhl r3 = dzhm.r();
        r3.g(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED);
        r3.f(381);
        a6.b(r3.a());
    }
}
