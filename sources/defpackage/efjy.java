package defpackage;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import com.android.vcard.VCardConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class efjy implements ComponentCallbacks2 {
    public static final enru a = enru.c("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper");
    public final Context b;
    public final ScheduledExecutorService c;
    public final efjx d;
    public final emxc e;
    public final List f;
    public final List g;
    public final efke h;
    public final Executor k;
    public ListenableFuture l;
    public boolean o;
    private final erog q;
    private ScheduledFuture t;
    public final Set i = new HashSet();
    public final Object j = new Object();
    public final efjq p = new efjq(this);
    private final erqj r = new efjr(this);
    public int m = 0;
    private boolean s = false;
    public boolean n = false;

    @Deprecated
    public efjy(Context context, ScheduledExecutorService scheduledExecutorService, efjx efjxVar, erog erogVar, efkj efkjVar) {
        this.q = erogVar;
        this.c = scheduledExecutorService;
        this.d = efjxVar;
        this.k = new ersb(scheduledExecutorService);
        this.b = context;
        this.e = efkjVar.a;
        this.f = efkjVar.b;
        this.g = efkjVar.c;
        this.h = efkjVar.d;
    }

    public static SQLiteDatabase a(Context context, File file, efke efkeVar, emxc emxcVar, List list, List list2) {
        SQLiteDatabase g = g(context, efkeVar, file);
        try {
            if (!h(g, efkeVar, emxcVar, list, list2)) {
                return g;
            }
            g.close();
            SQLiteDatabase g2 = g(context, efkeVar, file);
            try {
                ekzz f = eleg.f("Configuring reopened database.");
                try {
                    emxf.m(!h(g2, efkeVar, emxcVar, list, list2), "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
                    f.close();
                    return g2;
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (SQLiteException e) {
                e = e;
                g2.close();
                throw new efjt("Failed to open database.", e);
            } catch (IllegalStateException e2) {
                e = e2;
                g2.close();
                throw new efjt("Failed to open database.", e);
            } catch (Throwable th3) {
                g2.close();
                throw th3;
            }
        } catch (SQLiteException e3) {
            g.close();
            throw new efjt("Failed to open database.", e3);
        } catch (Throwable th4) {
            g.close();
            throw th4;
        }
    }

    public static erph b(final ListenableFuture listenableFuture, final Closeable... closeableArr) {
        listenableFuture.getClass();
        return erph.c(new erov() { // from class: efjo
            @Override // defpackage.erov
            public final Object a(erpc erpcVar) {
                for (int i = 0; i <= 0; i++) {
                    erpcVar.a(closeableArr[i], erpp.a);
                }
                return null;
            }
        }, erpp.a).f(new erot() { // from class: efjp
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj) {
                return new erph(ListenableFuture.this);
            }
        }, erpp.a);
    }

    public static boolean f(Context context, efke efkeVar) {
        int i = efkeVar.b;
        return !((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    private static SQLiteDatabase g(Context context, efke efkeVar, File file) {
        boolean f = f(context, efkeVar);
        int i = f ? 805306368 : VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        file.getParentFile().mkdirs();
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, i, null);
            if (f) {
                openDatabase.enableWriteAheadLogging();
            }
            return openDatabase;
        } catch (Throwable th) {
            throw new efjt("Failed to open database.", th);
        }
    }

    private static boolean h(SQLiteDatabase sQLiteDatabase, efke efkeVar, emxc emxcVar, List list, List list2) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        Iterator it = efkeVar.a.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("PRAGMA ".concat(String.valueOf((String) it.next())));
        }
        return i(sQLiteDatabase, list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean i(SQLiteDatabase sQLiteDatabase, List list, List list2) {
        int version = sQLiteDatabase.getVersion();
        ((enrr) ((enrr) a.e()).h("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "upgradeDatabase", 747, "AsyncSQLiteOpenHelper.java")).r("Database version is %d", version);
        int i = ((enou) list).c;
        emxf.q(version <= i, "Can't downgrade from version %s to version %s", version, i);
        efks efksVar = new efks(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            try {
                if (version != ((enou) list).c) {
                    ekzz f = eleg.f("Applying upgrade steps");
                    try {
                        Iterator<E> it = ((engw) list).subList(version, ((enou) list).c).iterator();
                        while (it.hasNext()) {
                            ((efki) it.next()).a(efksVar);
                        }
                        f.close();
                        sQLiteDatabase.setVersion(((enou) list).c);
                    } catch (Throwable th) {
                        try {
                            f.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                enqv it2 = ((engw) list2).iterator();
                while (it2.hasNext()) {
                    efkh efkhVar = (efkh) it2.next();
                    if (Thread.interrupted()) {
                        throw new InterruptedException();
                    }
                    efksVar.b.execSQL(efkhVar.a);
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                return version != sQLiteDatabase.getVersion();
            } catch (SQLiteDatabaseLockedException e) {
                e = e;
                throw new efjw("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (SQLiteDiskIOException e2) {
                e = e2;
                throw new efjw("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (SQLiteFullException e3) {
                e = e3;
                throw new efjw("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (SQLiteOutOfMemoryException e4) {
                e = e4;
                throw new efjw("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (SQLiteTableLockedException e5) {
                e = e5;
                throw new efjw("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (InterruptedException e6) {
                throw new efjw("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", e6);
            } catch (Throwable th3) {
                throw new efjv(th3);
            }
        } catch (Throwable th4) {
            sQLiteDatabase.endTransaction();
            throw th4;
        }
    }

    public final erph c() {
        ListenableFuture listenableFuture;
        ListenableFuture h;
        eleg.d();
        ekzz ekzzVar = null;
        try {
            synchronized (this.j) {
                int i = this.m + 1;
                this.m = i;
                if (this.l == null) {
                    emxf.m(i == 1, "DB was null with nonzero refcount");
                    ekzzVar = eleg.f("Opening database");
                    try {
                        ListenableFuture n = erqt.n(this.q, this.k);
                        erqt.r(n, this.r, this.c);
                        h = erny.f(n, eldl.a(new emwl() { // from class: efjk
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                efju efjuVar;
                                SQLiteDatabase a2;
                                efjy efjyVar = efjy.this;
                                File databasePath = efjyVar.b.getDatabasePath((String) obj);
                                if (!efjyVar.n) {
                                    efjx efjxVar = efjyVar.d;
                                    String path = databasePath.getPath();
                                    if (!efjxVar.a.add(path)) {
                                        throw new IllegalStateException(a.a(path, "DB ", " opened from different AsyncSQLiteOpenHelper. Are you missing a scope on your binding?"));
                                    }
                                    efjyVar.n = true;
                                    boolean f = efjy.f(efjyVar.b, efjyVar.h);
                                    efjyVar.o = f;
                                    if (f) {
                                        try {
                                            File cacheDir = efjyVar.b.getCacheDir();
                                            if (cacheDir != null) {
                                                efjyVar.o = databasePath.getCanonicalPath().startsWith(cacheDir.getCanonicalPath());
                                            }
                                        } catch (IOException unused) {
                                        }
                                    }
                                }
                                Set set = efjyVar.i;
                                if (!set.isEmpty()) {
                                    Iterator it = set.iterator();
                                    while (it.hasNext()) {
                                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((WeakReference) it.next()).get();
                                        if (sQLiteDatabase == null) {
                                            it.remove();
                                        } else if (sQLiteDatabase.isOpen()) {
                                            throw new IllegalStateException("Open database reference to " + sQLiteDatabase.getPath() + " already exists. Follow instructions in source to file a bug against TikTok.");
                                        }
                                    }
                                }
                                try {
                                    try {
                                        a2 = efjy.a(efjyVar.b, databasePath, efjyVar.h, efjyVar.e, efjyVar.f, efjyVar.g);
                                    } catch (efjt | efjv | efjw unused2) {
                                        a2 = efjy.a(efjyVar.b, databasePath, efjyVar.h, efjyVar.e, efjyVar.f, efjyVar.g);
                                    }
                                    efjyVar.i.add(new WeakReference(a2));
                                    efjyVar.b.registerComponentCallbacks(efjyVar);
                                    return a2;
                                } catch (efjv e) {
                                    ((enrr) ((enrr) ((enrr) efjy.a.i()).g(e)).h("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "innerOpenDatabase", (char) 447, "AsyncSQLiteOpenHelper.java")).q("Fatal Exception when trying to upgrade database. Proceeding to delete.");
                                    try {
                                        File file = new File(String.valueOf(databasePath.getPath()).concat("-wal"));
                                        File file2 = new File(String.valueOf(databasePath.getPath()).concat("-journal"));
                                        File file3 = new File(String.valueOf(databasePath.getPath()).concat("-shm"));
                                        try {
                                            if ((!file.exists() || file.delete()) && ((!file2.exists() || file2.delete()) && ((!file3.exists() || file3.delete()) && databasePath.delete()))) {
                                                throw new efjt("Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance.", e);
                                            }
                                            throw new efju(String.format("Unable to clean up database %s", databasePath.getAbsolutePath()));
                                        } finally {
                                        }
                                    } catch (Throwable th) {
                                        throw new efjt("Recovery by deletion failed.", th);
                                    }
                                } catch (efjw e2) {
                                    throw new efjt("Probably-recoverable database upgrade failure.", e2);
                                }
                            }
                        }), this.k);
                    } catch (Exception e) {
                        h = erqt.h(e);
                    }
                    this.l = h;
                }
                listenableFuture = this.l;
                ScheduledFuture scheduledFuture = this.t;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
            }
            ListenableFuture j = erqt.j(listenableFuture);
            if (ekzzVar != null) {
                ekzzVar.b(j);
            }
            return b(j, new Closeable() { // from class: efjm
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    efjy efjyVar = efjy.this;
                    synchronized (efjyVar.j) {
                        int i2 = efjyVar.m;
                        emxf.n(i2 > 0, "Refcount went negative!", i2);
                        efjyVar.m--;
                        efjyVar.d();
                    }
                }
            }).f(eldl.e(new erot() { // from class: efjn
                @Override // defpackage.erot
                public final erph a(erpc erpcVar, Object obj) {
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                    boolean isWriteAheadLoggingEnabled = sQLiteDatabase.isWriteAheadLoggingEnabled();
                    efjy efjyVar = efjy.this;
                    Executor executor = efjyVar.k;
                    final efjh efjhVar = isWriteAheadLoggingEnabled ? new efjh(sQLiteDatabase, efjyVar.c, executor, efjyVar.p) : new efjh(sQLiteDatabase, executor, executor, efjyVar.p);
                    return efjy.b(erqt.i(efjhVar), new Closeable() { // from class: efji
                        @Override // java.io.Closeable, java.lang.AutoCloseable
                        public final void close() {
                            efjh.this.b = true;
                        }
                    });
                }
            }), erpp.a);
        } finally {
            if (ekzzVar != null) {
                ekzzVar.close();
            }
        }
    }

    public final void d() {
        if (this.m != 0 || this.l == null) {
            return;
        }
        if (this.s) {
            e();
            return;
        }
        this.t = this.c.schedule(new Runnable() { // from class: efjj
            @Override // java.lang.Runnable
            public final void run() {
                efjy efjyVar = efjy.this;
                synchronized (efjyVar.j) {
                    if (efjyVar.m == 0) {
                        efjyVar.e();
                    }
                }
            }
        }, 60L, TimeUnit.SECONDS);
        if (this.o) {
            return;
        }
        erqt.r(this.l, new efjs(this), this.k);
    }

    public final void e() {
        this.k.execute(new Runnable() { // from class: efjl
            @Override // java.lang.Runnable
            public final void run() {
                efjy efjyVar = efjy.this;
                synchronized (efjyVar.j) {
                    ListenableFuture listenableFuture = efjyVar.l;
                    if (efjyVar.m == 0 && listenableFuture != null) {
                        efjyVar.l = null;
                        if (!listenableFuture.cancel(true)) {
                            try {
                                ((SQLiteDatabase) erqt.q(listenableFuture)).close();
                            } catch (ExecutionException unused) {
                            }
                        }
                        efjyVar.b.unregisterComponentCallbacks(efjyVar);
                        Iterator it = efjyVar.i.iterator();
                        while (it.hasNext()) {
                            if (((WeakReference) it.next()).get() == null) {
                                it.remove();
                            }
                        }
                    }
                }
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        synchronized (this.j) {
            this.s = i >= 40;
            d();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
