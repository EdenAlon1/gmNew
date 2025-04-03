package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azxf extends SQLiteOpenHelper {
    private final becd A;
    public final azyd e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final AtomicReference i;
    public final Object j;
    public final emyl k;
    public final dttz l;
    public final DatabaseErrorHandler m;
    DatabaseErrorHandler n;
    public final dttv o;
    private final Context q;
    private final Optional r;
    private final ffbr s;
    private final ffbr t;
    private final cqoh u;
    private final ffbr v;
    private final String w;
    private final Map x;
    private final asnj y;
    private final SettableFuture z;
    private static final cskc p = cskc.g("Bugle", "DatabaseHelperBasic");
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static final emyl b = emys.a(new emyl() { // from class: azxd
        @Override // defpackage.emyl
        public final Object get() {
            AtomicBoolean atomicBoolean = azxf.a;
            return cfvl.e(cfvl.b, "database_open_retry_iterations", 20);
        }
    });
    static final cfva c = cfvl.f(cfvl.b, "cursor_window_size", 4194304);
    static final cfva d = cfvl.h(cfvl.b, "larger_cursor_window_logging_tags", "partOffsetQuery|+loadMessages");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public azxf(android.content.Context r9, defpackage.ffbr r10, j$.util.Optional r11, defpackage.ffbr r12, defpackage.ffbr r13, defpackage.ffbr r14, defpackage.ffbr r15, defpackage.ffbr r16, defpackage.cqoh r17, defpackage.becd r18, defpackage.ffbr r19, java.util.Map r20, defpackage.dttv r21, defpackage.asnj r22, defpackage.dttz r23) {
        /*
            r8 = this;
            r0 = r23
            r1 = r0
            dtqy r1 = (defpackage.dtqy) r1
            java.lang.String r4 = r1.a
            int r6 = defpackage.azyd.b(r0)
            r7 = 0
            r5 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            r8.i = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r8.j = r4
            android.database.DefaultDatabaseErrorHandler r4 = new android.database.DefaultDatabaseErrorHandler
            r4.<init>()
            r8.m = r4
            com.google.common.util.concurrent.SettableFuture r4 = com.google.common.util.concurrent.SettableFuture.create()
            r8.z = r4
            r8.q = r9
            r9 = r20
            r8.x = r9
            r9 = r21
            r8.o = r9
            r9 = r22
            r8.y = r9
            r8.l = r0
            java.lang.Object r9 = r10.b()
            azye r9 = (defpackage.azye) r9
            azyd r9 = r9.a(r0)
            r8.e = r9
            r8.r = r11
            r8.f = r12
            r8.g = r13
            r8.h = r14
            r8.s = r15
            r9 = r16
            r8.t = r9
            r9 = r17
            r8.u = r9
            r9 = r18
            r8.A = r9
            r9 = r19
            r8.v = r9
            azxc r9 = new azxc
            r9.<init>()
            emyl r9 = defpackage.emys.a(r9)
            r8.k = r9
            java.lang.String r9 = r1.b
            java.lang.String r10 = "$primary"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L7b
            java.lang.String r9 = "bugle_db"
            goto L7d
        L7b:
            java.lang.String r9 = r1.a
        L7d:
            r8.w = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azxf.<init>(android.content.Context, ffbr, j$.util.Optional, ffbr, ffbr, ffbr, ffbr, ffbr, cqoh, becd, ffbr, java.util.Map, dttv, asnj, dttz):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0346, code lost:
    
        ((defpackage.enrr) defpackage.azxf.p.j().h("com/google/android/apps/messaging/shared/datamodel/DatabaseHelperBasic", "getOrCreateDatabaseTraced", 460, "DatabaseHelperBasic.java")).q("posted notification indicating schema upgrade failure -- blocking database initialization indefinitely");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x035f, code lost:
    
        r0 = r14.z;
        defpackage.dtnq.c();
        defpackage.ersn.a(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.database.sqlite.SQLiteDatabase d() {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azxf.d():android.database.sqlite.SQLiteDatabase");
    }

    private static boolean e(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("sqlite_master", null, "type = 'trigger' AND name = ?", new String[]{str}, null, null, null);
        try {
            boolean z = query.getCount() > 0;
            if (query != null) {
                query.close();
            }
            return z;
        } catch (Throwable th) {
            if (query == null) {
                throw th;
            }
            try {
                query.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0206 A[Catch: all -> 0x0237, TRY_LEAVE, TryCatch #16 {all -> 0x0237, blocks: (B:124:0x01d5, B:126:0x0206, B:129:0x022d, B:132:0x022f, B:133:0x0236, B:122:0x01bb), top: B:121:0x01bb, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022d A[Catch: all -> 0x0237, TRY_ENTER, TryCatch #16 {all -> 0x0237, blocks: (B:124:0x01d5, B:126:0x0206, B:129:0x022d, B:132:0x022f, B:133:0x0236, B:122:0x01bb), top: B:121:0x01bb, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.sqlite.SQLiteDatabase a() {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azxf.a():android.database.sqlite.SQLiteDatabase");
    }

    final SQLiteDatabase b(String str) {
        ekzz f = eleg.f("DatabaseHelperBasic#openOrCreateDatabase");
        try {
            this.n = new DatabaseErrorHandler() { // from class: azxe
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    azxf azxfVar = azxf.this;
                    ((akzt) azxfVar.f.b()).c("Bugle.Datamodel.DatabaseCorrupted.Counts");
                    ((akzt) azxfVar.f.b()).a();
                    azxfVar.m.onCorruption(sQLiteDatabase);
                    azxfVar.c();
                }
            };
            int intValue = ((Integer) ((cfup) b.get()).e()).intValue();
            int i = 0;
            SQLiteException sQLiteException = null;
            while (i <= intValue) {
                try {
                    SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(str, Build.VERSION.SDK_INT < 28 ? null : new SQLiteDatabase.CursorFactory() { // from class: azwq
                        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str2, SQLiteQuery sQLiteQuery) {
                            SQLiteCursor sQLiteCursor = new SQLiteCursor(sQLiteCursorDriver, str2, sQLiteQuery);
                            emyl emylVar = azxf.this.k;
                            final String sQLiteQuery2 = sQLiteQuery.toString();
                            if (!Collection.EL.stream((engw) emylVar.get()).anyMatch(new Predicate() { // from class: azww
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo439negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
                                    AtomicBoolean atomicBoolean = azxf.a;
                                    return sQLiteQuery2.contains((String) obj);
                                }
                            }) && !sQLiteQuery2.contains("/* use_custom_cursor_window_for_testing */")) {
                                return sQLiteCursor;
                            }
                            sQLiteCursor.setWindow(new CursorWindow("bugle-cursor-window", ((Long) azxf.c.e()).longValue()));
                            return sQLiteCursor;
                        }
                    }, 805306384, this.n);
                    if (i > 0) {
                        ((akzt) this.f.b()).e("Bugle.Datamodel.OpenSucceedAfterRetries.Counts", i);
                    }
                    f.close();
                    return openDatabase;
                } catch (SQLiteCantOpenDatabaseException | SQLiteDiskIOException e) {
                    if (sQLiteException != null) {
                        e.addSuppressed(sQLiteException);
                    }
                    ersn.c(50L, TimeUnit.MILLISECONDS);
                    i++;
                    sQLiteException = e;
                }
            }
            ((akzt) this.f.b()).c("Bugle.Datamodel.UnableToOpenDatabaseExceededRetries.Counts");
            if (sQLiteException == null) {
                throw new SQLiteDiskIOException("doOpenDatabase was never called");
            }
            throw sQLiteException;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final void c() {
        ((akxl) this.t.b()).b();
        ctzh.a();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase.isReadOnly()) {
            return;
        }
        boolean z = true;
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        csix.k(azyd.h(sQLiteDatabase));
        Cursor rawQuery = sQLiteDatabase.rawQuery("pragma journal_mode", null);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    if (rawQuery.getString(0).equals("wal")) {
                        rawQuery.close();
                        csix.k(z);
                    }
                }
            } catch (Throwable th) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        z = false;
        csix.k(z);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ekzz f = eleg.f("DatabaseHelperBasic#onDowngrade");
        try {
            this.A.a((dtve) this.i.get(), this.l, i, i2).onDowngrade();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ekzz f = eleg.f("DatabaseHelperBasic#onUpgrade");
        try {
            emxf.l(i2 > i);
            ((cauy) this.i.get()).j.a(sQLiteDatabase);
            this.A.a((dtve) this.i.get(), this.l, i, i2).onUpgrade();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }
}
