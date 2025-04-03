package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dipa extends SQLiteOpenHelper implements diop, dioo {
    public static final ContentValues a;
    public final diph b;
    private final dlpw c;

    static {
        ContentValues contentValues = new ContentValues(1);
        a = contentValues;
        contentValues.put("deleted", (Integer) 1);
    }

    public dipa(Context context, dlpw dlpwVar) {
        super(context, "subscribers.db", (SQLiteDatabase.CursorFactory) null, 18);
        this.b = new diph();
        this.c = dlpwVar;
    }

    public static void j(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str));
    }

    private static final String m(String str) {
        return a.a(str, "SELECT COUNT(DISTINCT contactId) FROM (SELECT contactId FROM Subscribers WHERE (", ") GROUP BY number)");
    }

    @Override // defpackage.dioo
    public final int a(long j) {
        SQLiteStatement compileStatement = getReadableDatabase().compileStatement(m("number NOT NULL AND ((date < ? AND state = 2) OR state != 2) AND deleted = 0"));
        compileStatement.bindString(1, String.valueOf(this.c.f().toEpochMilli() - j));
        return (int) compileStatement.simpleQueryForLong();
    }

    @Override // defpackage.dioo
    public final int b() {
        try {
            return (int) getReadableDatabase().compileStatement(m("number NOT NULL AND date=0 AND deleted = 0")).simpleQueryForLong();
        } catch (SQLiteException e) {
            dkty.i(e, "Error getting number of untried entries", new Object[0]);
            return 0;
        }
    }

    @Override // defpackage.dioo
    public final Cursor c(long j) {
        return g("number NOT NULL AND ((date < ? AND state = 2) OR state != 2) AND deleted = 0", new String[]{String.valueOf(this.c.f().toEpochMilli() - j)});
    }

    @Override // defpackage.dioo
    public final Cursor d() {
        return g("number NOT NULL AND date=0 AND deleted = 0", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dioo
    public final boolean e(final String str, int i, dkht dkhtVar) {
        Cursor cursor;
        int i2;
        boolean z;
        if (str == null) {
            throw new InvalidParameterException("Number must not be null");
        }
        String c = dktx.PHONE_NUMBER.c(str);
        Integer valueOf = Integer.valueOf(i);
        dkty.o("Updating state for %s to %s with capabilities: %s", c, valueOf, dkhtVar);
        final String[] strArr = {str};
        String[] strArr2 = {"capabilities"};
        try {
            final SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                cursor = writableDatabase.query("Subscribers", strArr2, "number = ? ", strArr, null, null, null);
                try {
                    if (cursor.moveToFirst()) {
                        i2 = cursor.getInt(0);
                        z = true;
                    } else {
                        i2 = 0;
                        z = false;
                    }
                    dktb.a(cursor);
                    final ContentValues contentValues = new ContentValues();
                    contentValues.put("state", valueOf);
                    contentValues.put("date", dkvj.a());
                    if (i == 1) {
                        contentValues.put("capabilities", (Integer) 0);
                    }
                    if (dkhtVar != null) {
                        contentValues.put("lastActive", Long.valueOf(dkhtVar.e));
                        contentValues.put("isOnline", Integer.valueOf(dkhtVar.c ? 1 : 0));
                        contentValues.put("responseCode", Integer.valueOf(dkhtVar.g));
                        boolean u = dkhtVar.u();
                        boolean D = dkhtVar.D();
                        Object[] objArr = dkhtVar.G() || dkhtVar.I();
                        boolean I = dkhtVar.I();
                        boolean C = dkhtVar.C();
                        boolean B = dkhtVar.B();
                        boolean E = dkhtVar.E();
                        boolean K = dkhtVar.K();
                        int a2 = u ? dity.STICKERS.a(0) : 0;
                        if (D) {
                            a2 = dity.LOCATION_PUSH.a(a2);
                        }
                        if (objArr != false) {
                            a2 = dity.IP_CALL.a(a2);
                        }
                        if (I) {
                            a2 = dity.IP_VIDEO_CALL_ONLY.a(a2);
                        }
                        if (C && i == 2 && (dkhtVar.c || dkhtVar.C())) {
                            a2 = dity.HTTP_FT.a(a2);
                        }
                        if (B) {
                            a2 = dity.FILE_TRANSFER_VIA_SMS.a(a2);
                        }
                        if (E) {
                            a2 = dity.LOCATION_VIA_SMS.a(a2);
                        }
                        if (K) {
                            a2 = dity.UP_2_0.a(a2);
                        }
                        int i3 = a2 | i2;
                        if (i3 != i2) {
                            contentValues.put("capabilities", Integer.valueOf(i3));
                        }
                    }
                    final boolean z2 = z;
                    return ((Integer) diph.a(writableDatabase, new emyl() { // from class: dioq
                        public final /* synthetic */ String d = "number = ? ";

                        @Override // defpackage.emyl
                        public final Object get() {
                            ContentValues contentValues2 = dipa.a;
                            boolean z3 = z2;
                            SQLiteDatabase sQLiteDatabase = writableDatabase;
                            ContentValues contentValues3 = contentValues;
                            if (z3) {
                                return Integer.valueOf(sQLiteDatabase.update("Subscribers", contentValues3, this.d, strArr));
                            }
                            contentValues3.put("number", str);
                            return Integer.valueOf(sQLiteDatabase.insert("Subscribers", null, contentValues3) != -1 ? 1 : 0);
                        }
                    }).orElse(0)).intValue() > 0;
                } catch (Throwable th) {
                    th = th;
                    dktb.a(cursor);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        } catch (SQLiteException unused) {
            return false;
        }
    }

    @Override // defpackage.diop
    public final ditz f(String str) {
        int i;
        long j;
        int i2;
        boolean z;
        int i3;
        if (str == null) {
            throw new InvalidParameterException("Number must not be null");
        }
        Cursor query = getReadableDatabase().query("Subscribers", (String[]) diov.a.toArray(new String[0]), "number=?", new String[]{str}, null, null, null);
        do {
            try {
                if (!query.moveToNext()) {
                    dktb.a(query);
                    return ditz.a;
                }
                i = query.getInt(0);
                j = query.getLong(2);
                i2 = query.getInt(1);
                z = query.getInt(3) == 1;
                i3 = query.getInt(4);
            } finally {
                dktb.a(query);
            }
        } while (i == 0);
        return new ditz(i, j, i2, z, i3);
    }

    public final Cursor g(String str, String[] strArr) {
        return getReadableDatabase().query("Subscribers", (String[]) dioz.a.toArray(new String[0]), str, strArr, "number", null, "contactId");
    }

    public final diox h(String str) {
        Cursor query = getReadableDatabase().query("Subscribers", (String[]) dioy.a.toArray(new String[0]), "number=?", new String[]{str}, null, null, "contactId ASC LIMIT 1");
        diox dioxVar = new diox();
        try {
            if (query.moveToFirst()) {
                dioxVar.b = query.getLong(0);
                dioxVar.a = query.getString(1);
            }
            if (query != null) {
                query.close();
            }
            return dioxVar;
        } catch (Throwable th) {
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public final void i() {
        try {
            final SQLiteDatabase writableDatabase = getWritableDatabase();
            final ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            contentValues.put("capabilities", (Integer) 0);
            contentValues.put("lastActive", (Integer) 0);
            contentValues.put("isOnline", (Integer) 0);
            contentValues.put("responseCode", (Integer) 0);
            diph.b(writableDatabase, new Runnable() { // from class: dior
                @Override // java.lang.Runnable
                public final void run() {
                    ContentValues contentValues2 = dipa.a;
                    writableDatabase.update("Subscribers", contentValues, null, null);
                }
            });
        } catch (SQLiteException unused) {
        }
    }

    public final boolean k(String str, int i, dkht dkhtVar) {
        if (TextUtils.isEmpty(str)) {
            dkty.c("Ignoring IMS state update for empty MSISDN", new Object[0]);
            return false;
        }
        if (e(str, i, dkhtVar)) {
            return true;
        }
        dkty.o("Updating last checked date only for %s", dktx.PHONE_NUMBER.c(str));
        final ContentValues contentValues = new ContentValues();
        contentValues.put("date", Long.valueOf(this.c.f().toEpochMilli()));
        final String[] strArr = {str};
        try {
            final SQLiteDatabase writableDatabase = getWritableDatabase();
            diph.a(writableDatabase, new emyl() { // from class: diot
                @Override // defpackage.emyl
                public final Object get() {
                    ContentValues contentValues2 = dipa.a;
                    return Integer.valueOf(writableDatabase.update("Subscribers", contentValues, "number=?", strArr));
                }
            });
        } catch (SQLiteException unused) {
        }
        return false;
    }

    public final boolean l(String str) {
        return k(str, 2, null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Subscribers ( _id INTEGER PRIMARY KEY AUTOINCREMENT, phoneId BIGINT NOT NULL DEFAULT 0, contactId BIGINT NOT NULL DEFAULT 0, number TEXT, nativeNumber TEXT, state INTEGER NOT NULL, capabilities INTEGER NOT NULL DEFAULT 0, dataVersion INTEGER, date LONG NOT NULL,lastActive LONG,isOnline INTEGER,responseCode INTEGER,Availability TEXT, FreeText TEXT, FavouriteLink TEXT, Timestamp TEXT, PortraitIconLink TEXT, PortraitIconLinkEtag TEXT, Location TEXT, LocationLatitude REAL NOT NULL DEFAULT 0, LocationLongitude REAL NOT NULL DEFAULT 0, LocationRadius REAL NOT NULL DEFAULT 0, SharingState INTEGER NOT NULL DEFAULT 0, SharingFeatures TEXT, DisplayName TEXT, deleted INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PresenceContent ( _id INTEGER PRIMARY KEY AUTOINCREMENT, Url TEXT NOT NULL, Etag TEXT NOT NULL, Description TEXT, ContentType TEXT, Size INTEGER NOT NULL DEFAULT 0, Data BLOB);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(final SQLiteDatabase sQLiteDatabase, final int i, int i2) {
        dkty.k("Update %s database from version: %d to %d", "subscribers.db", Integer.valueOf(i), Integer.valueOf(i2));
        diph.b(sQLiteDatabase, new Runnable() { // from class: dios
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                if (i3 != 17) {
                    dipa dipaVar = dipa.this;
                    dipa.j(sQLiteDatabase2, "PresenceContent");
                    dipa.j(sQLiteDatabase2, "Subscribers");
                    dipaVar.onCreate(sQLiteDatabase2);
                    return;
                }
                try {
                    sQLiteDatabase2.query("Subscribers", new String[]{"isOnline"}, null, null, null, null, null).close();
                } catch (SQLiteException unused) {
                    sQLiteDatabase2.execSQL("ALTER TABLE Subscribers ADD COLUMN isOnline INTEGER");
                    sQLiteDatabase2.execSQL("ALTER TABLE Subscribers ADD COLUMN responseCode INTEGER");
                }
            }
        });
    }
}
