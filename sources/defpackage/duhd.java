package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duhd extends SQLiteOpenHelper implements GellerDatabase {
    public static final enru c = enru.c("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl");
    private final boolean d;
    private final Context e;
    private final duhc f;
    private final duhg g;
    private final duhh h;
    private final emxc i;
    private final Map j;
    private final String k;
    private int l;
    private final eyom m;

    public duhd(Context context, String str, boolean z, boolean z2, int i, emxc emxcVar, Map map, eyom eyomVar) {
        super(context, String.format("portable_geller_%s.db", str.replace(File.separator, "_")), (SQLiteDatabase.CursorFactory) null, 9);
        this.l = 9;
        this.e = context;
        this.k = str;
        setWriteAheadLoggingEnabled(z);
        d();
        this.d = z2;
        this.f = new duhc(z2, eyomVar);
        this.g = new duhg(context, str, eyomVar);
        this.h = new duhh();
        this.i = emxcVar;
        this.j = map;
        this.m = eyomVar;
        ((enrr) ((enrr) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "<init>", 181, "GellerDatabaseImpl.java")).t("Setting isLegacySQLite mode to %s.", Boolean.valueOf(z2));
    }

    public static final boolean g(String str) {
        return a.contains(str);
    }

    private final int h(String str) {
        ezvn k = k();
        if (k == null) {
            ((enrr) ((enrr) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getGcLimit", 1505, "GellerDatabaseImpl.java")).t("The GellerConfig is not present, defaulting getGCLimit for corpus %s to 0.", str);
            return 0;
        }
        ezwd ezwdVar = k.c;
        if (ezwdVar == null) {
            ezwdVar = ezwd.a;
        }
        for (ezwc ezwcVar : ezwdVar.b) {
            ezib b = ezib.b(ezwcVar.b);
            if (b == null) {
                b = ezib.UNKNOWN;
            }
            if (emuz.e(b.name(), str)) {
                ezvz ezvzVar = ezwcVar.c;
                if (ezvzVar == null) {
                    ezvzVar = ezvz.a;
                }
                return ezvzVar.b;
            }
        }
        ((enrr) ((enrr) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getGcLimit", 1516, "GellerDatabaseImpl.java")).t("The Geller StorageConfig is not present, defaulting getGCLimit for corpus %s to 0.", str);
        return 0;
    }

    private final long i(String str, String[] strArr) {
        SQLiteDatabase d = d();
        if (d == null) {
            return 0L;
        }
        d.beginTransactionNonExclusive();
        try {
            long delete = d.delete("geller_metadata_table", str, strArr);
            d.setTransactionSuccessful();
            return delete;
        } finally {
            d.endTransaction();
        }
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [duhb, java.lang.Object] */
    private final duhb j(String str) {
        return b.contains(str) ? this.i.g() ? this.i.c() : this.h : this.j.containsKey(str) ? (duhb) this.j.get(str) : g(str) ? this.g : this.f;
    }

    private final ezvn k() {
        byte[][] d;
        eyfw checkIsLite;
        eyfw checkIsLite2;
        String name = ezib.GELLER_CONFIG.name();
        eyot eyotVar = (eyot) eyoy.a.createBuilder();
        eyotVar.copyOnWrite();
        eyoy eyoyVar = (eyoy) eyotVar.instance;
        eyoyVar.b |= 1;
        eyoyVar.e = 1;
        try {
            eyoy eyoyVar2 = (eyoy) eyfy.parseFrom(eyoy.a, ((eyoy) eyotVar.build()).toByteArray(), eyfc.a());
            ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "read", 443, "GellerDatabaseImpl.java")).D("Reading %s params: %s", name, eyoyVar2);
            SQLiteDatabase d2 = d();
            if (d2 == null) {
                d = new byte[0][];
            } else {
                eyot eyotVar2 = (eyot) eyoyVar2.toBuilder();
                eyotVar2.copyOnWrite();
                eyoy eyoyVar3 = (eyoy) eyotVar2.instance;
                name.getClass();
                eyoyVar3.b |= 4;
                eyoyVar3.g = name;
                int i = eyoyVar2.b;
                if ((i & 16) == 0 && (i & 64) == 0) {
                    eyotVar2.copyOnWrite();
                    eyoy eyoyVar4 = (eyoy) eyotVar2.instance;
                    eyoyVar4.b |= 16;
                    eyoyVar4.i = false;
                }
                try {
                    d = j(name).d(emxc.j(d2), (eyoy) eyotVar2.build());
                } catch (SQLiteException | IllegalStateException e) {
                    e(e);
                    throw new GellerException(11, e.getMessage(), e);
                }
            }
        } catch (eygu e2) {
            enru enruVar = c;
            ((enrr) ((enrr) ((enrr) enruVar.i()).g(e2)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "read", (char) 445, "GellerDatabaseImpl.java")).q("Failed to parse GellerReadParams bytes");
            ((enrr) ((enrr) enruVar.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readAll", 497, "GellerDatabaseImpl.java")).t("reading all %s", name);
            SQLiteDatabase d3 = d();
            if (d3 != null) {
                try {
                    duhb j = j(name);
                    emxc j2 = emxc.j(d3);
                    eyot eyotVar3 = (eyot) eyoy.a.createBuilder();
                    eyotVar3.copyOnWrite();
                    eyoy eyoyVar5 = (eyoy) eyotVar3.instance;
                    name.getClass();
                    eyoyVar5.b |= 4;
                    eyoyVar5.g = name;
                    d = j.d(j2, (eyoy) eyotVar3.build());
                } catch (SQLiteException | IllegalStateException e3) {
                    e(e3);
                    throw new GellerException(11, e3.getMessage(), e3);
                }
            } else {
                d = new byte[0][];
            }
        }
        if (d.length == 0) {
            ((enrr) ((enrr) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getGellerConfigClientConfig", 1445, "GellerDatabaseImpl.java")).q("The GellerConfig is not present, returning null.");
            return null;
        }
        eyfc a = eyfc.a();
        try {
            ezie ezieVar = (ezie) eyfy.parseFrom(ezie.a, d[0], a);
            checkIsLite = eyfy.checkIsLite(ezvn.b);
            ezieVar.b(checkIsLite);
            if (ezieVar.r.o(checkIsLite.d)) {
                checkIsLite2 = eyfy.checkIsLite(ezvn.b);
                ezieVar.b(checkIsLite2);
                Object l = ezieVar.r.l(checkIsLite2.d);
                return (ezvn) (l == null ? checkIsLite2.b : checkIsLite2.c(l));
            }
            try {
                eydq eydqVar = ezieVar.e;
                if (eydqVar == null) {
                    eydqVar = eydq.a;
                }
                return (ezvn) eyfy.parseFrom(ezvn.a, eydqVar.c, a);
            } catch (eygu e4) {
                throw new IllegalStateException("Failed to unpack GellerClientConfig.", e4);
            }
        } catch (eygu e5) {
            throw new IllegalStateException("Failed to parse an element.", e5);
        }
    }

    private final boolean l(String str) {
        ezvn k = k();
        if (k == null) {
            ((enrr) ((enrr) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "isUploadEnabled", 1480, "GellerDatabaseImpl.java")).t("The GellerConfig is not present, defaulting isUploadEnabled for corpus %s to true.", str);
            return true;
        }
        ezwj ezwjVar = k.d;
        if (ezwjVar == null) {
            ezwjVar = ezwj.a;
        }
        for (ezwi ezwiVar : ezwjVar.b) {
            ezib b = ezib.b(ezwiVar.b);
            if (b == null) {
                b = ezib.UNKNOWN;
            }
            if (emuz.e(b.name(), str)) {
                ezwf ezwfVar = ezwiVar.c;
                if (ezwfVar == null) {
                    ezwfVar = ezwf.a;
                }
                ezvv ezvvVar = ezwfVar.b;
                if (ezvvVar == null) {
                    ezvvVar = ezvv.a;
                }
                return ezvvVar.b;
            }
        }
        ((enrr) ((enrr) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "isUploadEnabled", 1491, "GellerDatabaseImpl.java")).t("The Geller SyncConfig is not present, defaulting isUploadEnabled for corpus %s to true.", str);
        return true;
    }

    private final long m(String str, String[] strArr, int i) {
        if (d() == null) {
            return 0L;
        }
        new ContentValues().put("delete_status", dugy.a(i));
        return r0.update("geller_key_table", r1, str, strArr);
    }

    private static final String n(String str) {
        g(str);
        return "key";
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long a(String str, eyoq eyoqVar) {
        int i;
        long f;
        if (eyoqVar.d.size() != 0) {
            ArrayList arrayList = new ArrayList(eyoqVar.d);
            int i2 = eyoqVar.c;
            int a = eyop.a(i2);
            int i3 = 1;
            if (a == 0) {
                a = 1;
            }
            int i4 = a - 1;
            if (i4 == 1) {
                i = 1;
            } else {
                if (i4 != 2) {
                    int a2 = eyop.a(i2);
                    throw new UnsupportedOperationException(a.a((a2 == 0 || a2 == 1) ? "UNKNOWN" : a2 != 2 ? "DELETION_SYNCED" : "SYNCED", "Marking data status to ", " is not supported."));
                }
                i = 2;
            }
            String str2 = str;
            ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "markSyncStatus", 1092, "GellerDatabaseImpl.java")).D("marking data in corpus %s to %s", str2, duhi.a(i));
            SQLiteDatabase d = d();
            if (d != null) {
                d.beginTransactionNonExclusive();
                try {
                    try {
                        long j = 0;
                        for (List list : enkr.e(arrayList, 100)) {
                            eyoe eyoeVar = (eyoe) eyoj.a.createBuilder();
                            eyof eyofVar = (eyof) eyog.a.createBuilder();
                            eyofVar.a(list);
                            eyoeVar.copyOnWrite();
                            eyoj eyojVar = (eyoj) eyoeVar.instance;
                            eyog eyogVar = (eyog) eyofVar.build();
                            eyogVar.getClass();
                            eyojVar.c = eyogVar;
                            eyojVar.b = 1;
                            eyoj eyojVar2 = (eyoj) eyoeVar.build();
                            if (i == 1) {
                                try {
                                    duhb j2 = j(str);
                                    emxc j3 = emxc.j(d);
                                    emxc j4 = emxc.j(true);
                                    emux emuxVar = emux.a;
                                    f = j2.f(j3, str2, eyojVar2, j4, emuxVar, emuxVar);
                                } catch (SQLiteException e) {
                                    e = e;
                                    ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "markSyncStatus", 1130, "GellerDatabaseImpl.java")).t("Marking data to %s failed", duhi.a(i3));
                                    try {
                                        e(e);
                                        d.endTransaction();
                                        return 0L;
                                    } catch (Throwable th) {
                                        th = th;
                                        d.endTransaction();
                                        throw th;
                                    }
                                } catch (IllegalStateException e2) {
                                    e = e2;
                                    ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "markSyncStatus", 1130, "GellerDatabaseImpl.java")).t("Marking data to %s failed", duhi.a(i3));
                                    e(e);
                                    d.endTransaction();
                                    return 0L;
                                }
                            } else {
                                try {
                                    f = j(str).f(emxc.j(d), str, eyojVar2, emux.a, emxc.j(true), emux.a);
                                } catch (SQLiteException | IllegalStateException e3) {
                                    e = e3;
                                    i3 = 2;
                                    ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "markSyncStatus", 1130, "GellerDatabaseImpl.java")).t("Marking data to %s failed", duhi.a(i3));
                                    e(e);
                                    d.endTransaction();
                                    return 0L;
                                }
                            }
                            j += f;
                            str2 = str;
                        }
                        d.setTransactionSuccessful();
                        d.endTransaction();
                        return j;
                    } catch (Throwable th2) {
                        th = th2;
                        d.endTransaction();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e4) {
                    e = e4;
                    i3 = i;
                }
            }
        }
        return 0L;
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final /* bridge */ /* synthetic */ Map b() {
        enhd enhdVar = new enhd();
        for (Map.Entry entry : this.j.entrySet()) {
            ezic c2 = ((duhb) entry.getValue()).c();
            if (c2 != ezic.CUSTOM_STORAGE_TYPE_UNKNOWN) {
                enhdVar.k((String) entry.getKey(), c2);
            }
        }
        return enhdVar.c();
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final void c() {
        close();
    }

    public final synchronized SQLiteDatabase d() {
        try {
        } catch (SQLiteException e) {
            if (e.getMessage().contains("Can't upgrade read-only database")) {
                return null;
            }
            ((enrr) ((enrr) ((enrr) c.j()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getSQLiteDatabase", (char) 1658, "GellerDatabaseImpl.java")).q("Failed to get geller database.");
            return null;
        }
        return getWritableDatabase();
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long delete(String str) {
        enru enruVar = c;
        ((enrr) ((enrr) enruVar.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 797, "GellerDatabaseImpl.java")).t("Deleting all data for %s", str);
        SQLiteDatabase d = d();
        long j = 0;
        try {
            if (d == null) {
                ((enrr) ((enrr) enruVar.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 800, "GellerDatabaseImpl.java")).q("The Geller SQLiteDatabase is null, skipping deletion.");
                return 0L;
            }
            try {
                d.beginTransactionNonExclusive();
                i("data_type = ?", new String[]{str});
                duhb j2 = j(str);
                emxc j3 = emxc.j(d);
                String str2 = this.k;
                eynl eynlVar = (eynl) eyns.a.createBuilder();
                eynlVar.copyOnWrite();
                eyns eynsVar = (eyns) eynlVar.instance;
                str.getClass();
                eynsVar.b |= 1;
                eynsVar.e = str;
                eynlVar.copyOnWrite();
                eyns.a((eyns) eynlVar.instance);
                j = j2.a(j3, str2, (eyns) eynlVar.build());
                d.setTransactionSuccessful();
            } catch (SQLiteException | IllegalStateException e) {
                ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 816, "GellerDatabaseImpl.java")).t("Delete %s failed", str);
                e(e);
            }
            return j;
        } finally {
            d.endTransaction();
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long deleteMetadata(String str, String str2) {
        ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "deleteMetadata", 875, "GellerDatabaseImpl.java")).D("deleting metadata %s : %s", str, str2);
        try {
            return i("data_type = ? AND key = ?", new String[]{str, str2});
        } catch (SQLiteException | IllegalStateException e) {
            ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "deleteMetadata", 879, "GellerDatabaseImpl.java")).D("Delete metadata %s : %s failed", str, str2);
            e(e);
            return 0L;
        }
    }

    final void e(Exception exc) {
        SQLiteDatabase d = d();
        if (d == null) {
            ((enrr) ((enrr) ((enrr) c.i()).g(exc)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "handleException", (char) 1551, "GellerDatabaseImpl.java")).q("An error occurred. No action was taken because the database was null.");
            return;
        }
        if ((exc instanceof IllegalStateException) || (exc instanceof SQLiteDatabaseLockedException) || (exc instanceof SQLiteDiskIOException) || (exc instanceof SQLiteFullException) || (exc instanceof SQLiteOutOfMemoryException) || (exc instanceof SQLiteTableLockedException)) {
            ((enrr) ((enrr) ((enrr) c.i()).g(exc)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "handleException", (char) 1554, "GellerDatabaseImpl.java")).q("An error occurred. No action was taken because the exception was not actionable.");
            return;
        }
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.h("geller_key_table");
        engrVar.h("geller_data_table");
        if (this.l >= 5) {
            engrVar.h("geller_file_table");
        }
        if (this.l >= 8) {
            engrVar.h("geller_metadata_table");
        }
        engw g = engrVar.g();
        Cursor rawQuery = d.rawQuery(String.format("SELECT count(*) FROM %s WHERE %s", "sqlite_master", "type = ? AND ".concat(duhf.b("name", "IN", g))), new String[]{"table"});
        try {
            rawQuery.moveToFirst();
            int i2 = rawQuery.getInt(0);
            int i3 = ((enou) g).c;
            if (rawQuery != null) {
                rawQuery.close();
            }
            if (i2 == i3) {
                ((enrr) ((enrr) ((enrr) c.i()).g(exc)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "validateTableSchema", (char) 1570, "GellerDatabaseImpl.java")).q("An error occurred. No action was taken because the error reason is unknown.");
            } else {
                ((enrr) ((enrr) ((enrr) c.i()).g(exc)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "validateTableSchema", (char) 1566, "GellerDatabaseImpl.java")).q("An error occurred. Dropping existing data and recreating all tables.");
                f(d);
            }
        } finally {
        }
    }

    final void f(SQLiteDatabase sQLiteDatabase) {
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
            while (rawQuery.moveToNext()) {
                try {
                    String string = rawQuery.getString(0);
                    sQLiteDatabase.execSQL(a.t(string, "DROP TABLE IF EXISTS "));
                    ((enrr) ((enrr) c.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "dropAllTables", 1692, "GellerDatabaseImpl.java")).t("Dropped table %s", string);
                } finally {
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            duhg.j(new File(this.e.getFilesDir(), "geller"));
            onCreate(sQLiteDatabase);
        } catch (SQLiteException e) {
            ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "recreateTables", (char) 1673, "GellerDatabaseImpl.java")).q("Failed to recreate tables");
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] getCorpusStats() {
        HashMap hashMap = new HashMap();
        hashMap.put(this.g, new HashSet());
        hashMap.put(this.f, new HashSet());
        if (this.i.g()) {
            hashMap.put(this.i.c(), new HashSet());
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            hashMap.put((duhb) it.next(), new HashSet());
        }
        eynj eynjVar = (eynj) eynk.a.createBuilder();
        emxc j = emxc.j(d());
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                Iterator<E> it2 = ((duhb) entry.getKey()).b(j, (Set) entry.getValue()).c.iterator();
                while (it2.hasNext()) {
                    eynjVar.a((eyni) it2.next());
                }
            }
            return ((eynk) eynjVar.build()).toByteArray();
        } catch (SQLiteException | IllegalStateException e) {
            ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getCorpusStats", (char) 1047, "GellerDatabaseImpl.java")).q("GetCorpusStats failed");
            e(e);
            return new byte[0];
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] getSnapshot(String[] strArr, int i, boolean z) {
        int i2;
        char c2;
        char c3;
        String[] strArr2 = strArr;
        int i3 = 1;
        eypd eypdVar = i != 0 ? i != 1 ? null : eypd.CREATE_REQUEST : eypd.GELLER_SNAPSHOT_REASON_UNSPECIFIED;
        if (eypdVar == null || eypdVar != eypd.CREATE_REQUEST) {
            ((enrr) ((enrr) c.i()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getSnapshot", 670, "GellerDatabaseImpl.java")).q("Invalid geller snapshot reason.");
            return new byte[0];
        }
        ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getSnapshot", 674, "GellerDatabaseImpl.java")).D("getting snapshot for %s reason: %s", Arrays.toString(strArr2), eypdVar);
        eypg eypgVar = (eypg) eyph.a.createBuilder();
        SQLiteDatabase d = d();
        if (d != null) {
            d.beginTransactionNonExclusive();
            try {
                try {
                    int length = strArr2.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        String str = strArr2[i4];
                        if (l(str)) {
                            eype eypeVar = (eype) eypf.a.createBuilder();
                            eypeVar.copyOnWrite();
                            eypf eypfVar = (eypf) eypeVar.instance;
                            str.getClass();
                            eypfVar.b |= i3;
                            eypfVar.c = str;
                            eypq eypqVar = (eypq) eyps.a.createBuilder();
                            eypqVar.copyOnWrite();
                            eyps eypsVar = (eyps) eypqVar.instance;
                            eypsVar.c = i3;
                            eypsVar.b |= i3;
                            duhb j = j(str);
                            emxc j2 = emxc.j(d);
                            eyot eyotVar = (eyot) eyoy.a.createBuilder();
                            eyotVar.copyOnWrite();
                            eyoy eyoyVar = (eyoy) eyotVar.instance;
                            str.getClass();
                            eyoyVar.b |= 4;
                            eyoyVar.g = str;
                            eyotVar.copyOnWrite();
                            eyoy eyoyVar2 = (eyoy) eyotVar.instance;
                            eyoyVar2.b |= 8;
                            eyoyVar2.h = true;
                            eyotVar.copyOnWrite();
                            eyoy eyoyVar3 = (eyoy) eyotVar.instance;
                            eyoyVar3.b |= 16;
                            eyoyVar3.i = true;
                            eyotVar.copyOnWrite();
                            eyoy eyoyVar4 = (eyoy) eyotVar.instance;
                            eyoyVar4.b |= 32;
                            eyoyVar4.j = false;
                            byte[][] d2 = j.d(j2, (eyoy) eyotVar.build());
                            int length2 = d2.length;
                            int i6 = i5;
                            int i7 = 0;
                            while (true) {
                                c2 = 26592;
                                if (i7 >= length2) {
                                    break;
                                }
                                byte[] bArr = d2[i7];
                                if (z) {
                                    int length3 = bArr.length + i6;
                                    if (length3 <= 3500000) {
                                        eypqVar.a(eyee.x(bArr));
                                        i6 = length3;
                                    }
                                } else {
                                    eypqVar.a(eyee.x(bArr));
                                }
                                i7++;
                            }
                            eypq eypqVar2 = (eypq) eyps.a.createBuilder();
                            eypqVar2.copyOnWrite();
                            eyps eypsVar2 = (eyps) eypqVar2.instance;
                            eypsVar2.c = 4;
                            eypsVar2.b |= 1;
                            eyot eyotVar2 = (eyot) eyoy.a.createBuilder();
                            eyotVar2.copyOnWrite();
                            eyoy eyoyVar5 = (eyoy) eyotVar2.instance;
                            str.getClass();
                            eyoyVar5.b |= 4;
                            eyoyVar5.g = str;
                            eyotVar2.copyOnWrite();
                            eyoy eyoyVar6 = (eyoy) eyotVar2.instance;
                            eyoyVar6.b |= 8;
                            eyoyVar6.h = false;
                            eyotVar2.copyOnWrite();
                            eyoy eyoyVar7 = (eyoy) eyotVar2.instance;
                            eyoyVar7.b |= 16;
                            eyoyVar7.i = false;
                            if (!this.m.h || h(str) <= 0) {
                                i2 = 1;
                            } else {
                                int h = h(str);
                                eyotVar2.copyOnWrite();
                                eyoy eyoyVar8 = (eyoy) eyotVar2.instance;
                                i2 = 1;
                                eyoyVar8.b |= 1;
                                eyoyVar8.e = h;
                            }
                            byte[][] d3 = j(str).d(emxc.j(d), (eyoy) eyotVar2.build());
                            int length4 = d3.length;
                            int i8 = 0;
                            while (i8 < length4) {
                                byte[] bArr2 = d3[i8];
                                if (z) {
                                    int length5 = bArr2.length + i6;
                                    c3 = 26592;
                                    if (length5 <= 3500000) {
                                        eypqVar2.a(eyee.x(bArr2));
                                        i6 = length5;
                                    }
                                } else {
                                    c3 = c2;
                                    eypqVar2.a(eyee.x(bArr2));
                                }
                                i8++;
                                c2 = c3;
                            }
                            if (!DesugarCollections.unmodifiableList(((eyps) eypqVar.instance).d).isEmpty() || !DesugarCollections.unmodifiableList(((eyps) eypqVar2.instance).d).isEmpty()) {
                                eypeVar.a(eypqVar);
                                eypeVar.a(eypqVar2);
                                String[] readMetadata = readMetadata(str, "_version_info");
                                if (readMetadata.length > 0) {
                                    String str2 = readMetadata[0];
                                    eypeVar.copyOnWrite();
                                    eypf eypfVar2 = (eypf) eypeVar.instance;
                                    str2.getClass();
                                    eypfVar2.b |= 2;
                                    eypfVar2.e = str2;
                                }
                                String[] readMetadata2 = readMetadata(str, "_sync_token");
                                if (readMetadata2.length > 0) {
                                    String str3 = readMetadata2[0];
                                    eypeVar.copyOnWrite();
                                    eypf eypfVar3 = (eypf) eypeVar.instance;
                                    str3.getClass();
                                    eypfVar3.b |= 4;
                                    eypfVar3.f = str3;
                                }
                                eypgVar.copyOnWrite();
                                eyph eyphVar = (eyph) eypgVar.instance;
                                eypf eypfVar4 = (eypf) eypeVar.build();
                                eypfVar4.getClass();
                                eygr eygrVar = eyphVar.b;
                                if (!eygrVar.c()) {
                                    eyphVar.b = eyfy.mutableCopy(eygrVar);
                                }
                                eyphVar.b.add(eypfVar4);
                            }
                            i5 = i6;
                        } else {
                            i2 = i3;
                        }
                        i4++;
                        strArr2 = strArr;
                        i3 = i2;
                    }
                    d.setTransactionSuccessful();
                } finally {
                    d.endTransaction();
                }
            } catch (SQLiteException | IllegalStateException e) {
                ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getSnapshot", (char) 761, "GellerDatabaseImpl.java")).q("Get snapshot failed.");
                e(e);
            }
        }
        return ((eyph) eypgVar.build()).toByteArray();
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long markSyncStatus(String str, byte[] bArr) {
        try {
            return a(str, (eyoq) eyfy.parseFrom(eyoq.a, bArr, eyfc.a()));
        } catch (eygu e) {
            ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "markSyncStatus", (char) 1062, "GellerDatabaseImpl.java")).q("Failed to parse GellerMarkSyncStatusParams.");
            return 0L;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_data_table (_id INTEGER PRIMARY KEY, data BLOB NOT NULL);");
        int i = this.l;
        if (i == 1) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
        } else if (i <= 5) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, deletion_sync_status TEXT, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
        }
        sQLiteDatabase.execSQL("CREATE INDEX datatype_key_dataid ON geller_key_table (data_type, key, delete_status, data_id);");
        if (this.l >= 3) {
            sQLiteDatabase.execSQL("CREATE INDEX datatype_dataid ON geller_key_table (data_type, data_id);");
        }
        int i2 = this.l;
        if (i2 >= 5 && i2 <= 7) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, file_path TEXT NOT NULL);");
        }
        if (this.l >= 7) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_metadata_table (data_type TEXT NOT NULL, key TEXT NOT NULL, metadata TEXT NOT NULL);");
        }
        if (this.l >= 8) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, deletion_sync_status TEXT, file_path TEXT NOT NULL);");
        }
        if (this.l >= 9) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_database_info_table (key TEXT NOT NULL, info TEXT NOT NULL);");
            sQLiteDatabase.execSQL(duhe.a);
        }
        sQLiteDatabase.setVersion(this.l);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "onDowngrade", 276, "GellerDatabaseImpl.java")).u("Downgrading Geller database from version: %d to %d", i, i2);
        this.l = i2;
        f(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "onUpgrade", 230, "GellerDatabaseImpl.java")).u("Upgrading Geller database from version: %d to %d", i, i2);
        while (i < i2) {
            switch (i) {
                case 1:
                    sQLiteDatabase.execSQL("ALTER TABLE geller_key_table ADD COLUMN num_times_used INTEGER;");
                    break;
                case 2:
                    sQLiteDatabase.execSQL("CREATE INDEX datatype_dataid ON geller_key_table (data_type, data_id);");
                    break;
                case 4:
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, file_path TEXT NOT NULL);");
                    break;
                case 5:
                    sQLiteDatabase.execSQL("ALTER TABLE geller_key_table ADD COLUMN deletion_sync_status TEXT;");
                    break;
                case 6:
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_metadata_table (data_type TEXT NOT NULL, key TEXT NOT NULL, metadata TEXT NOT NULL);");
                    break;
                case 7:
                    sQLiteDatabase.execSQL("ALTER TABLE geller_file_table ADD COLUMN deletion_sync_status TEXT;");
                    break;
                case 8:
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_database_info_table (key TEXT NOT NULL, info TEXT NOT NULL);");
                    sQLiteDatabase.execSQL(duhe.a);
                    break;
            }
            i++;
        }
        this.l = i2;
        sQLiteDatabase.setVersion(i2);
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] read(String str, boolean z, boolean z2) {
        ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "read", 472, "GellerDatabaseImpl.java")).J("reading data %s isSynced: %b isDeleted: %b", str, Boolean.valueOf(z), Boolean.valueOf(z2));
        SQLiteDatabase d = d();
        if (d == null) {
            return new byte[0][];
        }
        try {
            duhb j = j(str);
            emxc j2 = emxc.j(d);
            eyot eyotVar = (eyot) eyoy.a.createBuilder();
            eyotVar.copyOnWrite();
            eyoy eyoyVar = (eyoy) eyotVar.instance;
            str.getClass();
            eyoyVar.b |= 4;
            eyoyVar.g = str;
            eyotVar.copyOnWrite();
            eyoy eyoyVar2 = (eyoy) eyotVar.instance;
            eyoyVar2.b |= 8;
            eyoyVar2.h = z;
            eyotVar.copyOnWrite();
            eyoy eyoyVar3 = (eyoy) eyotVar.instance;
            eyoyVar3.b |= 16;
            eyoyVar3.i = z2;
            return j.d(j2, (eyoy) eyotVar.build());
        } catch (SQLiteException | IllegalStateException e) {
            e(e);
            throw new GellerException(11, e.getMessage(), e);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] readAll(String str) {
        ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readAll", 497, "GellerDatabaseImpl.java")).t("reading all %s", str);
        SQLiteDatabase d = d();
        if (d == null) {
            return new byte[0][];
        }
        try {
            duhb j = j(str);
            emxc j2 = emxc.j(d);
            eyot eyotVar = (eyot) eyoy.a.createBuilder();
            eyotVar.copyOnWrite();
            eyoy eyoyVar = (eyoy) eyotVar.instance;
            str.getClass();
            eyoyVar.b |= 4;
            eyoyVar.g = str;
            return j.d(j2, (eyoy) eyotVar.build());
        } catch (SQLiteException | IllegalStateException e) {
            e(e);
            throw new GellerException(11, e.getMessage(), e);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final String[] readDatabaseInfo(String str) {
        ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readDatabaseInfo", 581, "GellerDatabaseImpl.java")).t("reading database info: %s", str);
        SQLiteDatabase d = d();
        if (d != null) {
            try {
                emux emuxVar = emux.a;
                return (String[]) duhf.d(d, "geller_database_info_table", "info", "key = ?", new String[]{str}, emuxVar, emuxVar).toArray(new String[0]);
            } catch (SQLiteException | IllegalStateException e) {
                ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readDatabaseInfo", (char) 596, "GellerDatabaseImpl.java")).q("Read database info failed");
                e(e);
            }
        }
        return new String[0];
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final String[] readKeys(String str) {
        ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readKeys", 517, "GellerDatabaseImpl.java")).t("reading keys for %s", str);
        SQLiteDatabase d = d();
        if (d != null) {
            try {
                return j(str).e(emxc.j(d), str);
            } catch (SQLiteException | IllegalStateException e) {
                ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readKeys", (char) 523, "GellerDatabaseImpl.java")).q("Read keys failed");
                e(e);
            }
        }
        return new String[0];
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final String[] readMetadata(String str, String str2) {
        ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readMetadata", 533, "GellerDatabaseImpl.java")).D("reading metadata %s : %s", str, str2);
        SQLiteDatabase d = d();
        if (d != null) {
            try {
                emux emuxVar = emux.a;
                return (String[]) duhf.d(d, "geller_metadata_table", "metadata", "data_type = ? AND key = ?", new String[]{str, str2}, emuxVar, emuxVar).toArray(new String[0]);
            } catch (SQLiteException | IllegalStateException e) {
                ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readMetadata", (char) 548, "GellerDatabaseImpl.java")).q("Read metadata failed");
                e(e);
            }
        }
        return new String[0];
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] readMetadataForAllCorpora(String str) {
        ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readMetadataForAllCorpora", 558, "GellerDatabaseImpl.java")).t("reading all metadata for corpora with key: %s", str);
        SQLiteDatabase d = d();
        if (d != null) {
            try {
                String[] strArr = {"data_type", "metadata"};
                eynd eyndVar = (eynd) eyne.a.createBuilder();
                try {
                    Cursor query = d.query(true, "geller_metadata_table", strArr, "key = ?", new String[]{str}, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            eynf eynfVar = (eynf) eyng.a.createBuilder();
                            String string = query.getString(0);
                            eynfVar.copyOnWrite();
                            eyng eyngVar = (eyng) eynfVar.instance;
                            string.getClass();
                            eyngVar.b |= 1;
                            eyngVar.c = string;
                            eynfVar.copyOnWrite();
                            eyng eyngVar2 = (eyng) eynfVar.instance;
                            str.getClass();
                            eyngVar2.b |= 2;
                            eyngVar2.d = str;
                            String string2 = query.getString(1);
                            eynfVar.copyOnWrite();
                            eyng eyngVar3 = (eyng) eynfVar.instance;
                            string2.getClass();
                            eyngVar3.b |= 4;
                            eyngVar3.e = string2;
                            eyng eyngVar4 = (eyng) eynfVar.build();
                            eyndVar.copyOnWrite();
                            eyne eyneVar = (eyne) eyndVar.instance;
                            eyngVar4.getClass();
                            eygr eygrVar = eyneVar.b;
                            if (!eygrVar.c()) {
                                eyneVar.b = eyfy.mutableCopy(eygrVar);
                            }
                            eyneVar.b.add(eyngVar4);
                        } finally {
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                } catch (IllegalArgumentException e) {
                    ((enrr) ((enrr) ((enrr) duhf.a.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseUtil", "readMetadataFromTable", '`', "GellerDatabaseUtil.java")).q("Column doesn't exist");
                }
                return ((eyne) eyndVar.build()).toByteArray();
            } catch (SQLiteException | IllegalStateException e2) {
                ((enrr) ((enrr) ((enrr) c.i()).g(e2)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readMetadataForAllCorpora", (char) 571, "GellerDatabaseImpl.java")).q("Read metadata failed");
                e(e2);
            }
        }
        return new byte[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] readOutdatedData(String str) {
        duhd duhdVar;
        duhd duhdVar2;
        eyom eyomVar = this.m;
        if (eyomVar.i) {
            ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedDataElementIds", 1332, "GellerDatabaseImpl.java")).t("reading outdated data for %s", str);
            boolean g = g(str);
            String str2 = "data_type = ? AND timestamp_micro >= 0 AND delete_status = ?";
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add("DELETION_PROCESSED");
            try {
                if (l(str)) {
                    arrayList.add("DELETION_SYNCED");
                    str2 = (str2 + " AND (( deletion_sync_status = ? )") + " OR ( deletion_sync_status IS NULL AND sync_status IS NULL ))";
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                SQLiteDatabase d = d();
                if (d != null) {
                    if (g) {
                        try {
                            return duhg.k(d, str2, strArr, emux.a);
                        } catch (SQLiteException | IllegalStateException e) {
                            e = e;
                            duhdVar2 = this;
                        }
                    } else {
                        duhdVar2 = this;
                        try {
                            boolean z = duhdVar2.d;
                            ((enrr) ((enrr) duhc.a.h()).h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "readDataAsElementId", 801, "GellerDataTableStorage.java")).q("readDataAsElementId");
                            if (!z) {
                                return duhc.l(d, false, str2, strArr, -1);
                            }
                            String format = String.format("SELECT DISTINCT %s, %s AS %s FROM %s WHERE %s ORDER BY %s DESC", "data_id", "timestamp_micro", "timestamp_micro", "geller_key_table", str2, "timestamp_micro");
                            ArrayList arrayList2 = new ArrayList();
                            Cursor rawQuery = d.rawQuery(format, strArr);
                            try {
                                int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow("data_id");
                                int columnIndexOrThrow2 = rawQuery.getColumnIndexOrThrow("timestamp_micro");
                                while (rawQuery.moveToNext()) {
                                    String string = rawQuery.getString(columnIndexOrThrow);
                                    long j = rawQuery.getLong(columnIndexOrThrow2);
                                    ezid ezidVar = (ezid) ezie.a.createBuilder();
                                    ezidVar.copyOnWrite();
                                    ezie ezieVar = (ezie) ezidVar.instance;
                                    string.getClass();
                                    ezieVar.b |= 4;
                                    ezieVar.d = string;
                                    eypv eypvVar = (eypv) eypw.a.createBuilder();
                                    eypvVar.copyOnWrite();
                                    eypw eypwVar = (eypw) eypvVar.instance;
                                    eypwVar.b |= 1;
                                    eypwVar.c = j;
                                    eypw eypwVar2 = (eypw) eypvVar.build();
                                    ezidVar.copyOnWrite();
                                    ezie ezieVar2 = (ezie) ezidVar.instance;
                                    eypwVar2.getClass();
                                    ezieVar2.c = eypwVar2;
                                    ezieVar2.b |= 1;
                                    arrayList2.add(((ezie) ezidVar.build()).toByteArray());
                                }
                                if (rawQuery != null) {
                                    rawQuery.close();
                                }
                                return (byte[][]) arrayList2.toArray(new byte[0][]);
                            } finally {
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                        } catch (IllegalStateException e3) {
                            e = e3;
                        }
                    }
                    Exception exc = e;
                    ((enrr) ((enrr) ((enrr) c.i()).g(exc)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedDataElementIds", (char) 1377, "GellerDatabaseImpl.java")).q("Read outdated data failed.");
                    duhdVar2.e(exc);
                }
                return new byte[0][];
            } catch (IllegalStateException e4) {
                ((enrr) ((enrr) ((enrr) c.j()).g(e4)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedDataElementIds", 1347, "GellerDatabaseImpl.java")).t("There was an error determining whether corpus %s supports upload.", str);
                return new byte[0][];
            }
        }
        if (eyomVar.d) {
            eyot eyotVar = (eyot) eyoy.a.createBuilder();
            eyotVar.copyOnWrite();
            eyoy eyoyVar = (eyoy) eyotVar.instance;
            str.getClass();
            eyoyVar.b |= 4;
            eyoyVar.g = str;
            eyotVar.copyOnWrite();
            eyoy eyoyVar2 = (eyoy) eyotVar.instance;
            eyoyVar2.k = 3;
            eyoyVar2.b |= 64;
            try {
                boolean l = l(str);
                SQLiteDatabase d2 = d();
                if (d2 != null) {
                    duhb j2 = j(str);
                    try {
                        if (!l) {
                            return j2.d(emxc.j(d2), (eyoy) eyotVar.build());
                        }
                        d2.beginTransactionNonExclusive();
                        emxc j3 = emxc.j(d2);
                        eyotVar.copyOnWrite();
                        eyoy eyoyVar3 = (eyoy) eyotVar.instance;
                        eyoyVar3.b |= 32;
                        eyoyVar3.j = true;
                        byte[][] d3 = j2.d(j3, (eyoy) eyotVar.build());
                        emxc j4 = emxc.j(d2);
                        eyotVar.copyOnWrite();
                        eyoy eyoyVar4 = (eyoy) eyotVar.instance;
                        eyoyVar4.b |= 32;
                        eyoyVar4.j = false;
                        eyotVar.copyOnWrite();
                        eyoy eyoyVar5 = (eyoy) eyotVar.instance;
                        eyoyVar5.b |= 8;
                        eyoyVar5.h = false;
                        byte[][] d4 = j2.d(j4, (eyoy) eyotVar.build());
                        d2.setTransactionSuccessful();
                        ArrayList arrayList3 = new ArrayList(Arrays.asList(d3));
                        Collections.addAll(arrayList3, d4);
                        return (byte[][]) arrayList3.toArray(new byte[0][]);
                    } catch (SQLiteException | IllegalStateException e5) {
                        ((enrr) ((enrr) ((enrr) c.i()).g(e5)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedDataInternal", (char) 1426, "GellerDatabaseImpl.java")).q("Read outdated data failed.");
                        e(e5);
                    }
                }
                return new byte[0][];
            } catch (IllegalStateException e6) {
                ((enrr) ((enrr) ((enrr) c.j()).g(e6)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedDataInternal", 1394, "GellerDatabaseImpl.java")).t("There was an error determining whether corpus %s supports upload.", str);
                return new byte[0][];
            }
        }
        ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedData", 612, "GellerDatabaseImpl.java")).t("reading outdated data %s", str);
        boolean g2 = g(str);
        String str3 = "data_type = ? AND timestamp_micro >= 0 AND delete_status = ?";
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(str);
        arrayList4.add("DELETION_PROCESSED");
        try {
            if (l(str)) {
                arrayList4.add("DELETION_SYNCED");
                str3 = (str3 + " AND (( deletion_sync_status = ? )") + " OR ( deletion_sync_status IS NULL AND sync_status IS NULL ))";
            }
            String[] strArr2 = (String[]) arrayList4.toArray(new String[0]);
            SQLiteDatabase d5 = d();
            if (d5 != null) {
                if (g2) {
                    try {
                        return duhg.k(d5, str3, strArr2, emux.a);
                    } catch (SQLiteException | IllegalStateException e7) {
                        e = e7;
                        duhdVar = this;
                    }
                } else {
                    duhdVar = this;
                    try {
                        return duhc.k(d5, duhdVar.d, str3, strArr2);
                    } catch (SQLiteException e8) {
                        e = e8;
                    } catch (IllegalStateException e9) {
                        e = e9;
                    }
                }
                Exception exc2 = e;
                ((enrr) ((enrr) ((enrr) c.i()).g(exc2)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedData", (char) 656, "GellerDatabaseImpl.java")).q("Read outdated data failed.");
                duhdVar.e(exc2);
            }
            return new byte[0][];
        } catch (IllegalStateException e10) {
            ((enrr) ((enrr) ((enrr) c.j()).g(e10)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedData", 627, "GellerDatabaseImpl.java")).t("There was an error determining whether corpus %s supports upload.", str);
            return new byte[0][];
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long setDeletionProcessed(byte[] bArr) {
        long j;
        Exception exc;
        long j2;
        long j3;
        long j4;
        Iterator it;
        long m;
        long m2;
        Iterator it2;
        dugd a;
        SQLiteDatabase d = d();
        long j5 = 0;
        if (d == null) {
            ((enrr) ((enrr) c.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", 1144, "GellerDatabaseImpl.java")).q("The Geller SQLiteDatabase is null, skipping setting DELETION_PROCESSED status.");
            return 0L;
        }
        try {
            try {
                eyny eynyVar = (eyny) eyfy.parseFrom(eyny.a, bArr, eyfc.a());
                try {
                    d.beginTransactionNonExclusive();
                    Iterator it3 = eynyVar.b.iterator();
                    long j6 = 0;
                    while (it3.hasNext()) {
                        try {
                            eynx eynxVar = (eynx) it3.next();
                            ezib b = ezib.b(eynxVar.c);
                            if (b == null) {
                                b = ezib.UNKNOWN;
                            }
                            String name = b.name();
                            boolean g = g(name);
                            if (eynxVar.d.size() != 0) {
                                g(name);
                                n(name);
                                ArrayList arrayList = new ArrayList();
                                for (eynw eynwVar : eynxVar.d) {
                                    duga dugaVar = new duga();
                                    long j7 = j5;
                                    dugaVar.b(eynwVar.d);
                                    if ((eynwVar.b & 1) != 0) {
                                        dugaVar.c(Long.valueOf(eynwVar.c));
                                        a = dugaVar.a();
                                    } else {
                                        a = dugaVar.a();
                                    }
                                    arrayList.add(a);
                                    j5 = j7;
                                }
                                j4 = j5;
                                ArrayList<String> arrayList2 = new ArrayList();
                                Iterator it4 = enkr.e(arrayList, 100).iterator();
                                while (it4.hasNext()) {
                                    List list = (List) it4.next();
                                    StringBuilder sb = new StringBuilder();
                                    int i = 0;
                                    Iterator it5 = it4;
                                    while (i < list.size()) {
                                        String str = "( ";
                                        if (i == 0) {
                                            sb.append("( ");
                                            it2 = it3;
                                        } else {
                                            it2 = it3;
                                            sb.append(" OR ");
                                        }
                                        dugd dugdVar = (dugd) list.get(i);
                                        if (dugdVar.b().isEmpty() && !dugdVar.a().g()) {
                                            j3 = j6;
                                            i++;
                                            it3 = it2;
                                            j6 = j3;
                                        }
                                        if (!dugdVar.a().g() || ((Long) dugdVar.a().c()).longValue() < j4) {
                                            j3 = j6;
                                        } else {
                                            j3 = j6;
                                            try {
                                                str = "( ".concat(duhf.b("timestamp_micro", "=", engw.r(dugdVar.a().c())));
                                            } catch (SQLiteException e) {
                                                e = e;
                                                exc = e;
                                                j = j3;
                                                ((enrr) ((enrr) ((enrr) c.i()).g(exc)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", (char) 1204, "GellerDatabaseImpl.java")).q("Failed to set DELETION_PROCESSED status.");
                                                e(exc);
                                                j2 = j;
                                                return j2;
                                            } catch (IllegalStateException e2) {
                                                e = e2;
                                                exc = e;
                                                j = j3;
                                                ((enrr) ((enrr) ((enrr) c.i()).g(exc)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", (char) 1204, "GellerDatabaseImpl.java")).q("Failed to set DELETION_PROCESSED status.");
                                                e(exc);
                                                j2 = j;
                                                return j2;
                                            }
                                        }
                                        if (dugdVar.a().g() && ((Long) dugdVar.a().c()).longValue() >= j4 && !dugdVar.b().isEmpty()) {
                                            str = str.concat(" AND");
                                        }
                                        if (!dugdVar.b().isEmpty()) {
                                            str = str + " " + duhf.b("key", "=", engw.r(dugdVar.b()));
                                        }
                                        sb.append(str.concat(" )"));
                                        if (i == list.size() - 1) {
                                            sb.append(" )");
                                        }
                                        i++;
                                        it3 = it2;
                                        j6 = j3;
                                    }
                                    arrayList2.add(sb.toString());
                                    it4 = it5;
                                    it3 = it3;
                                    j6 = j6;
                                }
                                it = it3;
                                long j8 = j6;
                                j6 = j8;
                                for (String str2 : arrayList2) {
                                    try {
                                        if (!str2.isEmpty()) {
                                            String w = a.w(str2, "data_type = ?", " AND ");
                                            if (g) {
                                                ezib b2 = ezib.b(eynxVar.c);
                                                if (b2 == null) {
                                                    b2 = ezib.UNKNOWN;
                                                }
                                                m2 = duhg.l(d, w, new String[]{b2.name()}, 2);
                                            } else {
                                                ezib b3 = ezib.b(eynxVar.c);
                                                if (b3 == null) {
                                                    b3 = ezib.UNKNOWN;
                                                }
                                                m2 = m(w, new String[]{b3.name()}, 2);
                                            }
                                            j6 += m2;
                                        }
                                    } catch (SQLiteException | IllegalStateException e3) {
                                        exc = e3;
                                        j = j6;
                                        ((enrr) ((enrr) ((enrr) c.i()).g(exc)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", (char) 1204, "GellerDatabaseImpl.java")).q("Failed to set DELETION_PROCESSED status.");
                                        e(exc);
                                        j2 = j;
                                        return j2;
                                    }
                                }
                            } else {
                                j4 = j5;
                                it = it3;
                                long j9 = j6;
                                if (g) {
                                    ezib b4 = ezib.b(eynxVar.c);
                                    if (b4 == null) {
                                        b4 = ezib.UNKNOWN;
                                    }
                                    m = duhg.l(d, "data_type = ?", new String[]{b4.name()}, 2);
                                } else {
                                    ezib b5 = ezib.b(eynxVar.c);
                                    if (b5 == null) {
                                        b5 = ezib.UNKNOWN;
                                    }
                                    m = m("data_type = ?", new String[]{b5.name()}, 2);
                                }
                                j6 = j9 + m;
                            }
                            j5 = j4;
                            it3 = it;
                        } catch (SQLiteException | IllegalStateException e4) {
                            e = e4;
                            j3 = j6;
                        }
                    }
                    j3 = j6;
                    d.setTransactionSuccessful();
                    j2 = j3;
                } catch (SQLiteException | IllegalStateException e5) {
                    j = 0;
                    exc = e5;
                }
                return j2;
            } catch (eygu e6) {
                ((enrr) ((enrr) ((enrr) c.i()).g(e6)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", (char) 1155, "GellerDatabaseImpl.java")).q("Failed to parse GellerDeletedElements bytes");
                return 0L;
            }
        } finally {
            d.endTransaction();
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long softDelete(String str, eyns eynsVar) {
        int i;
        long l;
        SQLiteDatabase d = d();
        long j = 0;
        if (d == null) {
            ((enrr) ((enrr) c.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "softDelete", 904, "GellerDatabaseImpl.java")).q("The Geller SQLiteDatabase is null, skipping soft-deletion.");
            return 0L;
        }
        enrr enrrVar = (enrr) c.h();
        enrrVar.W(1, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "softDelete", 907, "GellerDatabaseImpl.java")).t("soft deleting data for %s", str);
        boolean g = g(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        duhb j2 = j(str);
        try {
            try {
                d.beginTransactionNonExclusive();
                i = eynsVar.c;
            } finally {
                d.endTransaction();
            }
        } catch (SQLiteException | IllegalStateException e) {
            ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "softDelete", (char) 1002, "GellerDatabaseImpl.java")).q("Soft-deletion failed.");
            e(e);
        }
        if (i == 1) {
            emxc j3 = emxc.j(d);
            eyoe eyoeVar = (eyoe) eyoj.a.createBuilder();
            eyof eyofVar = (eyof) eyog.a.createBuilder();
            eyofVar.a((eynsVar.c == 1 ? (eynn) eynsVar.d : eynn.a).b);
            eyog eyogVar = (eyog) eyofVar.build();
            eyoeVar.copyOnWrite();
            eyoj eyojVar = (eyoj) eyoeVar.instance;
            eyogVar.getClass();
            eyojVar.c = eyogVar;
            eyojVar.b = 1;
            eyoj eyojVar2 = (eyoj) eyoeVar.build();
            emux emuxVar = emux.a;
            l = j2.f(j3, str, eyojVar2, emuxVar, emuxVar, emxc.j(new dugx()));
        } else if (i == 4 && ((Boolean) eynsVar.d).booleanValue()) {
            i("data_type = ?", (String[]) arrayList.toArray(new String[0]));
            emxc j4 = emxc.j(d);
            eyoe eyoeVar2 = (eyoe) eyoj.a.createBuilder();
            eyoi eyoiVar = eyoi.a;
            eyoeVar2.copyOnWrite();
            eyoj eyojVar3 = (eyoj) eyoeVar2.instance;
            eyoiVar.getClass();
            eyojVar3.c = eyoiVar;
            eyojVar3.b = 2;
            eyoj eyojVar4 = (eyoj) eyoeVar2.build();
            emux emuxVar2 = emux.a;
            l = j2.f(j4, str, eyojVar4, emuxVar2, emuxVar2, emxc.j(new dugx()));
        } else {
            int i2 = eynsVar.c;
            if (i2 != 2) {
                if (((i2 == 6 ? (eynp) eynsVar.d : eynp.a).b & 1) != 0) {
                    String str2 = "data_type = ? AND " + n(str) + " like ?";
                    arrayList.add(a.v((eynsVar.c == 6 ? (eynp) eynsVar.d : eynp.a).c, "%"));
                    l = g ? duhg.l(d, str2, (String[]) arrayList.toArray(new String[0]), 1) : m(str2, (String[]) arrayList.toArray(new String[0]), 1);
                }
                d.setTransactionSuccessful();
                return j;
            }
            if (((eynr) eynsVar.d).b.size() == 0) {
                if ((eynsVar.c == 2 ? (eynr) eynsVar.d : eynr.a).c.size() == 0) {
                    if (this.m.e) {
                        throw new UnsupportedOperationException("Deleting all data via an empty deletion selection is no longer supported. Please use delete_all instead.");
                    }
                    i("data_type = ?", (String[]) arrayList.toArray(new String[0]));
                }
            }
            emxc j5 = emxc.j(d);
            eyoe eyoeVar3 = (eyoe) eyoj.a.createBuilder();
            eyoh eyohVar = (eyoh) eyoi.a.createBuilder();
            eygl eyglVar = (eynsVar.c == 2 ? (eynr) eynsVar.d : eynr.a).b;
            eyohVar.copyOnWrite();
            eyoi eyoiVar2 = (eyoi) eyohVar.instance;
            eygl eyglVar2 = eyoiVar2.b;
            if (!eyglVar2.c()) {
                eyoiVar2.b = eyfy.mutableCopy(eyglVar2);
            }
            eydl.addAll(eyglVar, eyoiVar2.b);
            eygr eygrVar = (eynsVar.c == 2 ? (eynr) eynsVar.d : eynr.a).c;
            eyohVar.copyOnWrite();
            eyoi eyoiVar3 = (eyoi) eyohVar.instance;
            eygr eygrVar2 = eyoiVar3.c;
            if (!eygrVar2.c()) {
                eyoiVar3.c = eyfy.mutableCopy(eygrVar2);
            }
            eydl.addAll(eygrVar, eyoiVar3.c);
            eyoi eyoiVar4 = (eyoi) eyohVar.build();
            eyoeVar3.copyOnWrite();
            eyoj eyojVar5 = (eyoj) eyoeVar3.instance;
            eyoiVar4.getClass();
            eyojVar5.c = eyoiVar4;
            eyojVar5.b = 2;
            eyoj eyojVar6 = (eyoj) eyoeVar3.build();
            emux emuxVar3 = emux.a;
            l = j2.f(j5, str, eyojVar6, emuxVar3, emuxVar3, emxc.j(new dugx()));
        }
        j = l;
        d.setTransactionSuccessful();
        return j;
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final boolean write(String str, String[] strArr, long j, boolean z, byte[] bArr) {
        int length = strArr.length;
        if (length == 0) {
            ((enrr) ((enrr) c.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 308, "GellerDatabaseImpl.java")).q("Unable to write data: empty key list");
            return false;
        }
        enru enruVar = c;
        enrr enrrVar = (enrr) enruVar.h();
        enrrVar.W(1, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 312, "GellerDatabaseImpl.java")).K("Writing data of size=%d bytes with N=%d keys to Geller corpus %s at ts=%d", Integer.valueOf(bArr.length), Integer.valueOf(length), str, Long.valueOf(j));
        ((enrr) ((enrr) enruVar.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 315, "GellerDatabaseImpl.java")).C("Specifically: keys: %s; ts: %d", Arrays.toString(strArr), j);
        SQLiteDatabase d = d();
        if (d == null) {
            ((enrr) ((enrr) enruVar.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 319, "GellerDatabaseImpl.java")).q("Writing to geller db is null");
            return false;
        }
        try {
            return j(str).g(emxc.j(d), str, strArr, j, z, bArr);
        } catch (SQLiteException e) {
            ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", (char) 326, "GellerDatabaseImpl.java")).q("Failed to write data");
            e(e);
            return false;
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final boolean writeMetadata(String str, String str2, String str3) {
        ((enrr) ((enrr) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "writeMetadata", 419, "GellerDatabaseImpl.java")).D("Writing metadata key: %s, corpus: %s", str2, str);
        SQLiteDatabase d = d();
        if (d != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("data_type", str);
                contentValues.put("key", str2);
                contentValues.put("metadata", str3);
                return d.insertOrThrow("geller_metadata_table", null, contentValues) >= 0;
            } catch (SQLiteException e) {
                ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "writeMetadata", (char) 429, "GellerDatabaseImpl.java")).q("Failed to write metadata");
                e(e);
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] writeWithResult(String str, String[] strArr, long j, boolean z, byte[] bArr) {
        int length = strArr.length;
        if (length == 0) {
            throw new GellerException(11, "Unable to write data: empty key list.", (byte[]) null);
        }
        enru enruVar = c;
        enrr enrrVar = (enrr) enruVar.h();
        enrrVar.W(1, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "writeWithResult", 341, "GellerDatabaseImpl.java")).K("Writing data of size=%d bytes with N=%d keys to Geller corpus %s at ts=%d", Integer.valueOf(bArr.length), Integer.valueOf(length), str, Long.valueOf(j));
        ((enrr) ((enrr) enruVar.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "writeWithResult", 344, "GellerDatabaseImpl.java")).C("Specifically: keys: %s; ts: %d", Arrays.toString(strArr), j);
        SQLiteDatabase d = d();
        if (d == null) {
            throw new GellerException(11, "Unable to write data: geller db is null.", (byte[]) null);
        }
        try {
            return j(str).h(emxc.j(d), str, strArr, j, z, bArr).toByteArray();
        } catch (SQLiteException e) {
            e(e);
            throw new GellerException(11, e.getMessage(), e);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] write(byte[] bArr) {
        String name;
        try {
            eypl eyplVar = (eypl) eyfy.parseFrom(eypl.a, bArr, eyfc.a());
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (eypk eypkVar : eyplVar.b) {
                if ((eypkVar.b & 64) != 0) {
                    name = eypkVar.j;
                } else {
                    ezib b = ezib.b(eypkVar.c);
                    if (b == null) {
                        b = ezib.UNKNOWN;
                    }
                    name = b.name();
                }
                List c2 = duhf.c(eypkVar.d);
                if (!hashMap.containsKey(name)) {
                    hashMap.put(name, (eypi) eypl.a.createBuilder());
                }
                eypi eypiVar = (eypi) hashMap.get(name);
                eypiVar.copyOnWrite();
                eypl eyplVar2 = (eypl) eypiVar.instance;
                eypkVar.getClass();
                eygr eygrVar = eyplVar2.b;
                if (!eygrVar.c()) {
                    eyplVar2.b = eyfy.mutableCopy(eygrVar);
                }
                eyplVar2.b.add(eypkVar);
                if (!hashMap2.containsKey(name)) {
                    hashMap2.put(name, new ArrayList());
                }
                ((ArrayList) hashMap2.get(name)).addAll(c2);
            }
            ((enrr) ((enrr) c.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 391, "GellerDatabaseImpl.java")).t("Writing data for these Geller corpora: %s", TextUtils.join(",", hashMap.keySet()));
            int i = engw.d;
            engr engrVar = new engr();
            SQLiteDatabase d = d();
            int i2 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                eypl eyplVar3 = (eypl) ((eypi) entry.getValue()).build();
                String str = (String) entry.getKey();
                if (j(str).i(emxc.i(d), eyplVar3)) {
                    engrVar.j((Iterable) hashMap2.get(str));
                    i2 += eyplVar3.b.size();
                }
            }
            eypm eypmVar = (eypm) eypp.a.createBuilder();
            engw g = engrVar.g();
            eypmVar.copyOnWrite();
            eypp eyppVar = (eypp) eypmVar.instance;
            eygr eygrVar2 = eyppVar.c;
            if (!eygrVar2.c()) {
                eyppVar.c = eyfy.mutableCopy(eygrVar2);
            }
            eydl.addAll(g, eyppVar.c);
            eypmVar.copyOnWrite();
            eypp eyppVar2 = (eypp) eypmVar.instance;
            eyppVar2.b |= 1;
            eyppVar2.d = i2;
            return ((eypp) eypmVar.build()).toByteArray();
        } catch (eygu e) {
            e(e);
            throw new GellerException(11, e.getMessage(), e);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] getCorpusStats(String[] strArr) {
        HashMap hashMap = new HashMap();
        if (strArr.length == 0) {
            hashMap.put(this.g, new HashSet());
            hashMap.put(this.f, new HashSet());
            if (this.i.g()) {
                hashMap.put(this.i.c(), new HashSet());
            }
            Iterator it = this.j.values().iterator();
            while (it.hasNext()) {
                hashMap.put((duhb) it.next(), new HashSet());
            }
        } else {
            for (String str : strArr) {
                duhb j = j(str);
                if (!hashMap.containsKey(j)) {
                    hashMap.put(j, new HashSet());
                }
                ((Set) hashMap.get(j)).add(str);
            }
        }
        eynj eynjVar = (eynj) eynk.a.createBuilder();
        emxc j2 = emxc.j(d());
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                Iterator<E> it2 = ((duhb) entry.getKey()).b(j2, (Set) entry.getValue()).c.iterator();
                while (it2.hasNext()) {
                    eynjVar.a((eyni) it2.next());
                }
            }
            return ((eynk) eynjVar.build()).toByteArray();
        } catch (SQLiteException | IllegalStateException e) {
            ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getCorpusStats", (char) 1047, "GellerDatabaseImpl.java")).q("GetCorpusStats failed");
            e(e);
            return new byte[0];
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] read(String str, byte[] bArr) {
        try {
            eyoy eyoyVar = (eyoy) eyfy.parseFrom(eyoy.a, bArr, eyfc.a());
            ((enrr) ((enrr) c.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "read", 443, "GellerDatabaseImpl.java")).D("Reading %s params: %s", str, eyoyVar);
            SQLiteDatabase d = d();
            if (d == null) {
                return new byte[0][];
            }
            eyot eyotVar = (eyot) eyoyVar.toBuilder();
            eyotVar.copyOnWrite();
            eyoy eyoyVar2 = (eyoy) eyotVar.instance;
            str.getClass();
            eyoyVar2.b |= 4;
            eyoyVar2.g = str;
            int i = eyoyVar.b;
            if ((i & 16) == 0 && (i & 64) == 0) {
                eyotVar.copyOnWrite();
                eyoy eyoyVar3 = (eyoy) eyotVar.instance;
                eyoyVar3.b |= 16;
                eyoyVar3.i = false;
            }
            try {
                return j(str).d(emxc.j(d), (eyoy) eyotVar.build());
            } catch (SQLiteException | IllegalStateException e) {
                e(e);
                throw new GellerException(11, e.getMessage(), e);
            }
        } catch (eygu e2) {
            enru enruVar = c;
            ((enrr) ((enrr) ((enrr) enruVar.i()).g(e2)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "read", (char) 445, "GellerDatabaseImpl.java")).q("Failed to parse GellerReadParams bytes");
            ((enrr) ((enrr) enruVar.d()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readAll", 497, "GellerDatabaseImpl.java")).t("reading all %s", str);
            SQLiteDatabase d2 = d();
            if (d2 == null) {
                return new byte[0][];
            }
            try {
                duhb j = j(str);
                emxc j2 = emxc.j(d2);
                eyot eyotVar2 = (eyot) eyoy.a.createBuilder();
                eyotVar2.copyOnWrite();
                eyoy eyoyVar4 = (eyoy) eyotVar2.instance;
                str.getClass();
                eyoyVar4.b |= 4;
                eyoyVar4.g = str;
                return j.d(j2, (eyoy) eyotVar2.build());
            } catch (SQLiteException | IllegalStateException e3) {
                e(e3);
                throw new GellerException(11, e3.getMessage(), e3);
            }
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long delete(String str, byte[] bArr) {
        eynr eynrVar;
        eynr eynrVar2;
        long j = 0;
        try {
            eyns eynsVar = (eyns) eyfy.parseFrom(eyns.a, bArr, eyfc.a());
            enru enruVar = c;
            ((enrr) ((enrr) enruVar.h()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 836, "GellerDatabaseImpl.java")).t("Deleting with GellerDeleteParams:\n %s", eynsVar);
            SQLiteDatabase d = d();
            if (d == null) {
                ((enrr) ((enrr) enruVar.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 840, "GellerDatabaseImpl.java")).q("The Geller SQLiteDatabase is null, skipping deletion.");
                return 0L;
            }
            String[] strArr = {str};
            try {
                try {
                    d.beginTransactionNonExclusive();
                    if (eynsVar.c == 2 && ((eynr) eynsVar.d).b.size() == 0) {
                        if (eynsVar.c == 2) {
                            eynrVar = (eynr) eynsVar.d;
                        } else {
                            eynrVar = eynr.a;
                        }
                        if (eynrVar.c.size() == 0) {
                            if (eynsVar.c == 2) {
                                eynrVar2 = (eynr) eynsVar.d;
                            } else {
                                eynrVar2 = eynr.a;
                            }
                            duhf.e(eynrVar2, this.m);
                            i("data_type = ?", strArr);
                        }
                    }
                    duhb j2 = j(str);
                    emxc j3 = emxc.j(d);
                    String str2 = this.k;
                    eynl eynlVar = (eynl) eynsVar.toBuilder();
                    eynlVar.copyOnWrite();
                    eyns eynsVar2 = (eyns) eynlVar.instance;
                    str.getClass();
                    eynsVar2.b |= 1;
                    eynsVar2.e = str;
                    long a = j2.a(j3, str2, (eyns) eynlVar.build());
                    d.setTransactionSuccessful();
                    j = a;
                } finally {
                    d.endTransaction();
                }
            } catch (SQLiteException | IllegalStateException e) {
                ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", (char) 864, "GellerDatabaseImpl.java")).q("Delete failed");
                e(e);
            }
            return j;
        } catch (eygu e2) {
            ((enrr) ((enrr) ((enrr) c.i()).g(e2)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", (char) 833, "GellerDatabaseImpl.java")).q("Failed to parse GellerDeleteParams.");
            return 0L;
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long softDelete(String str, byte[] bArr) {
        int i;
        eynp eynpVar;
        eynp eynpVar2;
        long m;
        eynr eynrVar;
        eynr eynrVar2;
        eynr eynrVar3;
        eynn eynnVar;
        long j = 0;
        try {
            eyns eynsVar = (eyns) eyfy.parseFrom(eyns.a, bArr, eyfc.a());
            SQLiteDatabase d = d();
            if (d == null) {
                ((enrr) ((enrr) c.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "softDelete", 904, "GellerDatabaseImpl.java")).q("The Geller SQLiteDatabase is null, skipping soft-deletion.");
                return 0L;
            }
            enrr enrrVar = (enrr) c.h();
            enrrVar.W(1, TimeUnit.SECONDS);
            ((enrr) enrrVar.h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "softDelete", 907, "GellerDatabaseImpl.java")).t("soft deleting data for %s", str);
            boolean g = g(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            duhb j2 = j(str);
            try {
                try {
                    d.beginTransactionNonExclusive();
                    i = eynsVar.c;
                } finally {
                    d.endTransaction();
                }
            } catch (SQLiteException | IllegalStateException e) {
                ((enrr) ((enrr) ((enrr) c.i()).g(e)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "softDelete", (char) 1002, "GellerDatabaseImpl.java")).q("Soft-deletion failed.");
                e(e);
            }
            if (i == 1) {
                emxc j3 = emxc.j(d);
                eyoe eyoeVar = (eyoe) eyoj.a.createBuilder();
                eyof eyofVar = (eyof) eyog.a.createBuilder();
                if (eynsVar.c == 1) {
                    eynnVar = (eynn) eynsVar.d;
                } else {
                    eynnVar = eynn.a;
                }
                eyofVar.a(eynnVar.b);
                eyog eyogVar = (eyog) eyofVar.build();
                eyoeVar.copyOnWrite();
                eyoj eyojVar = (eyoj) eyoeVar.instance;
                eyogVar.getClass();
                eyojVar.c = eyogVar;
                eyojVar.b = 1;
                eyoj eyojVar2 = (eyoj) eyoeVar.build();
                emux emuxVar = emux.a;
                m = j2.f(j3, str, eyojVar2, emuxVar, emuxVar, emxc.j(new dugx()));
            } else if (i == 4 && ((Boolean) eynsVar.d).booleanValue()) {
                i("data_type = ?", (String[]) arrayList.toArray(new String[0]));
                emxc j4 = emxc.j(d);
                eyoe eyoeVar2 = (eyoe) eyoj.a.createBuilder();
                eyoi eyoiVar = eyoi.a;
                eyoeVar2.copyOnWrite();
                eyoj eyojVar3 = (eyoj) eyoeVar2.instance;
                eyoiVar.getClass();
                eyojVar3.c = eyoiVar;
                eyojVar3.b = 2;
                eyoj eyojVar4 = (eyoj) eyoeVar2.build();
                emux emuxVar2 = emux.a;
                m = j2.f(j4, str, eyojVar4, emuxVar2, emuxVar2, emxc.j(new dugx()));
            } else {
                int i2 = eynsVar.c;
                if (i2 == 2) {
                    if (((eynr) eynsVar.d).b.size() == 0) {
                        if (eynsVar.c == 2) {
                            eynrVar3 = (eynr) eynsVar.d;
                        } else {
                            eynrVar3 = eynr.a;
                        }
                        if (eynrVar3.c.size() == 0) {
                            if (!this.m.e) {
                                i("data_type = ?", (String[]) arrayList.toArray(new String[0]));
                            } else {
                                throw new UnsupportedOperationException("Deleting all data via an empty deletion selection is no longer supported. Please use delete_all instead.");
                            }
                        }
                    }
                    emxc j5 = emxc.j(d);
                    eyoe eyoeVar3 = (eyoe) eyoj.a.createBuilder();
                    eyoh eyohVar = (eyoh) eyoi.a.createBuilder();
                    if (eynsVar.c == 2) {
                        eynrVar = (eynr) eynsVar.d;
                    } else {
                        eynrVar = eynr.a;
                    }
                    eygl eyglVar = eynrVar.b;
                    eyohVar.copyOnWrite();
                    eyoi eyoiVar2 = (eyoi) eyohVar.instance;
                    eygl eyglVar2 = eyoiVar2.b;
                    if (!eyglVar2.c()) {
                        eyoiVar2.b = eyfy.mutableCopy(eyglVar2);
                    }
                    eydl.addAll(eyglVar, eyoiVar2.b);
                    if (eynsVar.c == 2) {
                        eynrVar2 = (eynr) eynsVar.d;
                    } else {
                        eynrVar2 = eynr.a;
                    }
                    eygr eygrVar = eynrVar2.c;
                    eyohVar.copyOnWrite();
                    eyoi eyoiVar3 = (eyoi) eyohVar.instance;
                    eygr eygrVar2 = eyoiVar3.c;
                    if (!eygrVar2.c()) {
                        eyoiVar3.c = eyfy.mutableCopy(eygrVar2);
                    }
                    eydl.addAll(eygrVar, eyoiVar3.c);
                    eyoi eyoiVar4 = (eyoi) eyohVar.build();
                    eyoeVar3.copyOnWrite();
                    eyoj eyojVar5 = (eyoj) eyoeVar3.instance;
                    eyoiVar4.getClass();
                    eyojVar5.c = eyoiVar4;
                    eyojVar5.b = 2;
                    eyoj eyojVar6 = (eyoj) eyoeVar3.build();
                    emux emuxVar3 = emux.a;
                    m = j2.f(j5, str, eyojVar6, emuxVar3, emuxVar3, emxc.j(new dugx()));
                } else {
                    if (i2 == 6) {
                        eynpVar = (eynp) eynsVar.d;
                    } else {
                        eynpVar = eynp.a;
                    }
                    if ((eynpVar.b & 1) != 0) {
                        String str2 = "data_type = ? AND " + n(str) + " like ?";
                        if (eynsVar.c == 6) {
                            eynpVar2 = (eynp) eynsVar.d;
                        } else {
                            eynpVar2 = eynp.a;
                        }
                        arrayList.add(a.v(eynpVar2.c, "%"));
                        if (g) {
                            m = duhg.l(d, str2, (String[]) arrayList.toArray(new String[0]), 1);
                        } else {
                            m = m(str2, (String[]) arrayList.toArray(new String[0]), 1);
                        }
                    }
                    d.setTransactionSuccessful();
                    return j;
                }
            }
            j = m;
            d.setTransactionSuccessful();
            return j;
        } catch (eygu e2) {
            ((enrr) ((enrr) ((enrr) c.i()).g(e2)).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "softDelete", (char) 893, "GellerDatabaseImpl.java")).q("Failed to parse GellerDeleteParams.");
            return 0L;
        }
    }
}
