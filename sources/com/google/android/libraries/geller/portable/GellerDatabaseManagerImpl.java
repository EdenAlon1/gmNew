package com.google.android.libraries.geller.portable;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dugr;
import defpackage.duhb;
import defpackage.duhd;
import defpackage.emwl;
import defpackage.emxc;
import defpackage.emxe;
import defpackage.emye;
import defpackage.enju;
import defpackage.enrr;
import defpackage.enru;
import defpackage.eyom;
import defpackage.ezib;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class GellerDatabaseManagerImpl implements dugr {
    private static final enru a = enru.c("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl");
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final emxc d;
    private final Map e;
    private final Map f;
    private final Map g;
    private final Context h;
    private final boolean i;
    private final eyom j;

    public GellerDatabaseManagerImpl(Context context, eyom eyomVar, boolean z, emxc emxcVar, Map map, Map map2, Map map3) {
        new HashMap();
        new HashMap();
        this.h = context;
        this.j = eyomVar;
        this.d = emxcVar;
        this.e = map;
        this.f = map2;
        this.g = map3;
        this.i = z;
    }

    private final synchronized void c(String str, GellerDatabase gellerDatabase) {
        if (this.b.containsKey(str)) {
            long longValue = ((Long) this.b.get(str)).longValue();
            this.b.remove(str);
            nativeDestroyDatabase(longValue);
        }
        if (gellerDatabase != null) {
            gellerDatabase.c();
        }
    }

    private final synchronized boolean d(String str) {
        boolean z;
        z = false;
        for (Map.Entry entry : this.e.entrySet()) {
            ezib ezibVar = (ezib) entry.getKey();
            if (!((Map) entry.getValue()).containsKey(str)) {
                try {
                    ((Map) entry.getValue()).put(str, (duhb) ((ListenableFuture) ((emwl) this.f.get(ezibVar)).apply(str)).get(3000L, TimeUnit.MILLISECONDS));
                    z = true;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "maybeUpdateCustomStorageMap", 130, "GellerDatabaseManagerImpl.java")).D("Failed to create custom Geller storage for corpus %s and user %s", ezibVar.name(), str);
                } catch (ExecutionException e2) {
                    e = e2;
                    ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "maybeUpdateCustomStorageMap", 124, "GellerDatabaseManagerImpl.java")).D("Failed to create custom Geller storage for corpus %s and user %s", ezibVar.name(), str);
                } catch (TimeoutException e3) {
                    e = e3;
                    ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "maybeUpdateCustomStorageMap", 124, "GellerDatabaseManagerImpl.java")).D("Failed to create custom Geller storage for corpus %s and user %s", ezibVar.name(), str);
                }
            }
        }
        return z;
    }

    private final synchronized GellerDatabase e(String str) {
        boolean z;
        Context context;
        boolean z2;
        emxc emxcVar;
        eyom eyomVar;
        HashMap hashMap;
        enru enruVar = duhd.c;
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(":memory:", (SQLiteDatabase.CursorFactory) null);
        String stringForQuery = DatabaseUtils.stringForQuery(openOrCreateDatabase, "SELECT sqlite_version()", null);
        openOrCreateDatabase.close();
        boolean z3 = false;
        try {
            Iterator it = emye.d(".").g(stringForQuery).iterator();
            Iterator it2 = emye.d(".").g("3.25.0").iterator();
            while (true) {
                if (!it.hasNext() && !it2.hasNext()) {
                    break;
                }
                try {
                    int compare = Integer.compare(Integer.parseInt((String) enju.g(it, "0")), Integer.parseInt((String) enju.g(it2, "0")));
                    if (compare != 0) {
                        if (compare < 0) {
                            z3 = true;
                        }
                    }
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        } catch (IllegalArgumentException unused) {
            ((enrr) ((enrr) duhd.c.j()).h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "isLegacySQLite", 1757, "GellerDatabaseImpl.java")).t("Unable to parse SQLite version %s. Assuming legacy version.", stringForQuery);
        }
        z = z3;
        context = this.h;
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        if (str == null) {
            throw new NullPointerException("Null databaseId");
        }
        z2 = this.i;
        emxcVar = this.d;
        if (emxcVar == null) {
            throw new NullPointerException("Null optionalGddStorage");
        }
        eyomVar = this.j;
        if (eyomVar == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap = new HashMap();
        for (Map.Entry entry : this.e.entrySet()) {
            if (((Map) entry.getValue()).containsKey(str)) {
                hashMap.put(((ezib) entry.getKey()).name(), (duhb) ((Map) entry.getValue()).get(str));
            }
        }
        for (Map.Entry entry2 : this.g.entrySet()) {
            hashMap.put(((ezib) entry2.getKey()).name(), (duhb) entry2.getValue());
        }
        return new duhd(context, str, z2, z, 9, emxcVar, hashMap, eyomVar);
    }

    private native long nativeCreateDatabase(GellerDatabase gellerDatabase, String str);

    private native void nativeDestroyDatabase(long j);

    @Override // defpackage.dugr
    public final synchronized long a(String str) {
        Long l;
        Map map = this.b;
        String b = emxe.b(str);
        l = (Long) map.get(b);
        if (l == null) {
            long nativeCreateDatabase = nativeCreateDatabase(b(b), b);
            Long valueOf = Long.valueOf(nativeCreateDatabase);
            valueOf.getClass();
            if (nativeCreateDatabase != 0) {
                this.b.put(b, valueOf);
            } else {
                ((enrr) ((enrr) a.i()).h("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "getNativeGellerDatabase", 174, "GellerDatabaseManagerImpl.java")).q("Failed to create native geller database, returning empty response/default value.");
            }
            l = valueOf;
        }
        return l.longValue();
    }

    @Override // defpackage.dugr
    public final synchronized GellerDatabase b(String str) {
        Throwable th;
        GellerDatabase gellerDatabase;
        GellerDatabase gellerDatabase2 = (GellerDatabase) this.c.get(str);
        if (!d(str) && gellerDatabase2 != null) {
            return gellerDatabase2;
        }
        c(str, gellerDatabase2);
        try {
            gellerDatabase = e(str);
            try {
            } catch (SQLiteException e) {
                e = e;
            } catch (IllegalStateException e2) {
                e = e2;
            }
            try {
                this.c.put(str, gellerDatabase);
            } catch (SQLiteException e3) {
                e = e3;
                th = e;
                ((enrr) ((enrr) ((enrr) a.i()).g(th)).h("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "getGellerDatabase", 'g', "GellerDatabaseManagerImpl.java")).q("Failed to create/open geller database, returning empty response/default value.");
                return gellerDatabase;
            } catch (IllegalStateException e4) {
                e = e4;
                th = e;
                ((enrr) ((enrr) ((enrr) a.i()).g(th)).h("com/google/android/libraries/geller/portable/GellerDatabaseManagerImpl", "getGellerDatabase", 'g', "GellerDatabaseManagerImpl.java")).q("Failed to create/open geller database, returning empty response/default value.");
                return gellerDatabase;
            }
        } catch (SQLiteException | IllegalStateException e5) {
            th = e5;
            gellerDatabase = null;
        }
        return gellerDatabase;
    }
}
