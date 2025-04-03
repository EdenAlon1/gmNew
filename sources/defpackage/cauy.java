package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cauy implements dtve {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl");
    public static final entd b = entd.p();
    static final ThreadLocal c = new caun();
    public final cqoh d;
    public final dttz e;
    public final cavm[] f;
    public final Context i;
    private final ffbr k;
    public final ReentrantLock g = new ReentrantLock(true);
    public final cauw h = new cauw(this);
    public final caut j = new caut();
    private final dtzf l = new dtzf(new Supplier() { // from class: casi
        @Override // java.util.function.Supplier
        public final Object get() {
            final cauy cauyVar = cauy.this;
            Integer num = (Integer) cauyVar.U(new cauu() { // from class: cast
                @Override // defpackage.cauu
                public final Object a() {
                    return Integer.valueOf(cauy.this.k().getVersion());
                }
            }, cauy.m(dtxc.READ, new dtui("DatabasePlugin#getVersion"), new emyl() { // from class: casu
                @Override // defpackage.emyl
                public final Object get() {
                    enru enruVar = cauy.a;
                    return null;
                }
            }, cauyVar));
            num.intValue();
            return num;
        }
    });

    public cauy(Context context, ffbr ffbrVar, cqoh cqohVar, dttz dttzVar, engw engwVar) {
        this.i = context;
        this.k = ffbrVar;
        this.d = cqohVar;
        this.e = dttzVar;
        this.f = (cavm[]) engwVar.toArray(new cavm[0]);
    }

    public static void X(dtzv dtzvVar) {
        t().addLast(dtzvVar);
    }

    private static dtwd Z(dtxc dtxcVar, String str, dtui dtuiVar, emyl emylVar, dtve dtveVar) {
        dtwc n = dtwd.n();
        dtrf dtrfVar = (dtrf) n;
        dtrfVar.a = dtuiVar;
        dtrfVar.h = str;
        n.d(dtxcVar);
        dtrfVar.c = emylVar;
        n.b(dtveVar);
        return n.a();
    }

    private static dtwd aa(dtxc dtxcVar, String str, dtui dtuiVar, emyl emylVar, emyl emylVar2, dtve dtveVar, boolean z, ContentValues contentValues) {
        dtwc n = dtwd.n();
        dtrf dtrfVar = (dtrf) n;
        dtrfVar.a = dtuiVar;
        dtrfVar.h = str;
        n.d(dtxcVar);
        dtrfVar.b = emylVar;
        dtrfVar.c = emylVar2;
        n.b(dtveVar);
        n.c(z);
        dtrfVar.i = contentValues;
        return n.a();
    }

    private final dtwd ab(dtui dtuiVar, final dtsr dtsrVar) {
        dtxc dtxcVar = dtxc.READ;
        emyl emylVar = new emyl() { // from class: casz
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                dtyq dtyqVar = dtsr.this.b;
                if (dtyqVar == null) {
                    return dtzh.c(null, null);
                }
                ArrayList arrayList = new ArrayList();
                return dtzh.c(dtyqVar.J(arrayList), (String[]) arrayList.toArray(new String[0]));
            }
        };
        dtwc n = dtwd.n();
        dtrf dtrfVar = (dtrf) n;
        dtrfVar.a = dtuiVar;
        dtrfVar.h = null;
        n.d(dtxcVar);
        dtrfVar.c = emylVar;
        n.b(this);
        n.c(false);
        dtrfVar.j = dtsrVar.b;
        return n.a();
    }

    private static dtzv ac() {
        return (dtzv) t().removeLast();
    }

    private static Throwable ad(Closeable[] closeableArr, int i) {
        Closeable closeable = closeableArr[i];
        if (closeable != null) {
            try {
                closeableArr[i] = null;
                closeable.close();
            } catch (Throwable th) {
                ensk j = a.j();
                j.Y(ente.a, "BugleDatabase");
                ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "closePluginStack", (char) 702, "DatabaseInterfaceImpl.java")).q("Caught exception closing DatabasePlugin Closeable");
                return th;
            }
        }
        return null;
    }

    private final void ae() {
        List list = (List) U(new cauu() { // from class: casj
            @Override // defpackage.cauu
            public final Object a() {
                return cauy.this.u(false);
            }
        }, m(dtxc.END_SCOPE, new dtui("DatabasePlugin#endScope"), new emyl() { // from class: cask
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return null;
            }
        }, this));
        if (ersy.a("bugle.enable_runnables_execution_in_silo_batches", "bugle")) {
            af(list);
            return;
        }
        if (list != null) {
            ekzz f = eleg.f("DatabaseWrapperImpl.deferredRunnables");
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((dtvb) it.next()).b();
                }
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
    }

    private final void af(List list) {
        ekzz f;
        if (list == null || list.isEmpty()) {
            return;
        }
        ekzz f2 = eleg.f("DatabaseWrapperImpl.deferredRunnables");
        try {
            EnumMap enumMap = new EnumMap(dtuz.class);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dtvb dtvbVar = (dtvb) it.next();
                ((List) Map.EL.computeIfAbsent(enumMap, dtvbVar.a, new Function() { // from class: casw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        enru enruVar = cauy.a;
                        return new ArrayList();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })).add(dtvbVar);
            }
            ArrayList<Pair> arrayList = new ArrayList();
            for (dtuz dtuzVar : dtuz.values()) {
                if (enumMap.containsKey(dtuzVar)) {
                    arrayList.add(Pair.create(dtuzVar, (List) enumMap.get(dtuzVar)));
                }
            }
            for (final Pair pair : arrayList) {
                Runnable runnable = new Runnable() { // from class: catt
                    @Override // java.lang.Runnable
                    public final void run() {
                        enru enruVar = cauy.a;
                        Iterator it2 = ((List) pair.second).iterator();
                        while (it2.hasNext()) {
                            ((dtvb) it2.next()).b();
                        }
                    }
                };
                try {
                    if (pair.first != dtuz.NO_TXN && pair.first != dtuz.NO_TXN_EXCLUDING_SCOPE) {
                        A("run-after-complete-in-txn", runnable);
                    }
                    runnable.run();
                    f.close();
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                f = eleg.f("DatabaseWrapperImpl::run-after-complete-no-txn");
            }
            f2.close();
        } catch (Throwable th3) {
            try {
                f2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static void ag(cavm[] cavmVarArr, Closeable[] closeableArr, int i, dtwd dtwdVar) {
        while (i < cavmVarArr.length) {
            closeableArr[i] = cavmVarArr[i].l(dtwdVar);
            i++;
        }
    }

    public static dtwd m(dtxc dtxcVar, dtui dtuiVar, emyl emylVar, dtve dtveVar) {
        dtwc n = dtwd.n();
        dtrf dtrfVar = (dtrf) n;
        dtrfVar.a = dtuiVar;
        dtrfVar.h = null;
        n.d(dtxcVar);
        dtrfVar.c = emylVar;
        n.b(dtveVar);
        n.c(false);
        return n.a();
    }

    static dtzh n(String str, final ContentValues contentValues, int i) {
        String j = dtub.j(i);
        return dtzh.c("INSERT" + (j != null ? a.a(j, " ", " ") : " ") + "INTO " + str + " (" + ((String) Collection.EL.stream(contentValues.keySet()).sorted().collect(Collectors.joining(","))) + ") VALUES (" + ((String) Collection.EL.stream(contentValues.keySet()).sorted().map(new Function() { // from class: catw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                enru enruVar = cauy.a;
                Object obj2 = contentValues.get(str2);
                return (obj2 == null ? "NULL" : obj2 instanceof Boolean ? true != ((Boolean) obj2).booleanValue() ? "0" : "1" : obj2 instanceof Number ? obj2.toString() : DatabaseUtils.sqlEscapeString(obj2.toString())) + " -- " + str2 + "\n";
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(","))) + ")", null);
    }

    static Deque t() {
        Deque deque = (Deque) c.get();
        deque.getClass();
        return deque;
    }

    @Override // defpackage.dtve
    public final void A(String str, final Runnable runnable) {
        r(str, new emyl() { // from class: cass
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                runnable.run();
                return null;
            }
        });
    }

    public final void B(final Runnable runnable, dtwd dtwdVar) {
    }

    @Override // defpackage.dtve
    public final void D(Uri uri) {
        E(uri, null);
    }

    @Override // defpackage.dtve
    public final void E(final Uri uri, final String str) {
        Deque t = t();
        if (str != null) {
            ensk n = b.n();
            n.Y(ente.a, "BugleDatabase");
            ((ensz) n.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "notifyChangeAfterCommit", 965, "DatabaseInterfaceImpl.java")).J("%s notifying change. stack %d; uri %s", str, Integer.valueOf(t.size()), uri);
        }
        if (!t.isEmpty()) {
            dtuy.a(this, uri.toString(), eldl.l(new Runnable() { // from class: casb
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    Uri uri2 = uri;
                    cauy cauyVar = cauy.this;
                    if (str2 != null) {
                        ensk n2 = cauy.b.n();
                        n2.Y(ente.a, "BugleDatabase");
                        ((ensz) n2.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "notifyChangeAfterCommit", 981, "DatabaseInterfaceImpl.java")).D("%s notifying change after commit. uri %s", str2, uri2);
                    }
                    ekzz f = eleg.f("DatabaseWrapperImpl#notifyChangeAfterCommit");
                    try {
                        cauyVar.i.getContentResolver().notifyChange(uri2, null);
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
            }));
            return;
        }
        ekzz f = eleg.f("DatabaseWrapperImpl#notifyChangeAfterCommit");
        try {
            this.i.getContentResolver().notifyChange(uri, null);
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

    @Override // defpackage.dtve
    public final /* synthetic */ void F(String str, Runnable runnable) {
        dtuy.a(this, str, runnable);
    }

    @Override // defpackage.dtve
    public final void G(final boolean z) {
        B(new Runnable() { // from class: catx
            @Override // java.lang.Runnable
            public final void run() {
                dtzv dtzvVar = (dtzv) cauy.t().peekLast();
                dtzvVar.getClass();
                if (dtzvVar.f()) {
                    ensk j = cauy.b.j();
                    j.Y(ente.a, "BugleDatabase");
                    ensz enszVar = (ensz) j;
                    enszVar.aa(ensy.MEDIUM);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "setTransactionSuccessful", 817, "DatabaseInterfaceImpl.java")).q("setTransactionSuccessful called twice.");
                }
                boolean z2 = z;
                dtzvVar.h();
                dtzvVar.d(z2);
                if (z2 && (dtzvVar instanceof dtzx)) {
                    cauy.this.k().setTransactionSuccessful();
                }
            }
        }, m(dtxc.WRITE, new dtui("DatabasePlugin#setTransactionSuccessful"), new emyl() { // from class: caty
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return null;
            }
        }, this));
    }

    public final void H(Exception exc, String str) {
        boolean delete = this.i.getDatabasePath(str).delete();
        ensk i = b.i();
        i.Y(ente.a, "BugleDatabase");
        ((ensz) ((ensz) ((ensz) i).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "wipeDbOnFailedUpgrade", 1183, "DatabaseInterfaceImpl.java")).t("got DatabaseUpgradeException; File.delete returned %b", Boolean.valueOf(delete));
        for (cbsd cbsdVar : (Set) this.k.b()) {
            if (delete) {
                ((cbrn) cbsdVar.c.b()).f();
                ensk h = cbsd.a.h();
                h.Y(ente.a, "BugleSearch");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingOnDatabaseUpgradeFailedListener", "onDatabaseUpgradeFailed", 54, "IcingOnDatabaseUpgradeFailedListener.java")).q("On database upgrade failed. All the search indexes on the device are removed.");
            }
        }
        try {
            dtnq.a(((pqc) pqr.a(this.i).a("verified_sms_work_manager_tag")).c);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.dtve
    public final /* synthetic */ boolean I() {
        return dtuy.b(this);
    }

    @Override // defpackage.dtve
    public final boolean J(final dtsr dtsrVar) {
        return ((Boolean) U(new cauu() { // from class: casc
            @Override // defpackage.cauu
            public final Object a() {
                enru enruVar = cauy.a;
                return Boolean.valueOf(dtsr.this.dk());
            }
        }, ab(new dtui("DatabasePlugin#moveCursorToFirst"), dtsrVar))).booleanValue();
    }

    @Override // defpackage.dtve
    public final boolean K(final dtsr dtsrVar) {
        return ((Boolean) U(new cauu() { // from class: catb
            @Override // defpackage.cauu
            public final Object a() {
                enru enruVar = cauy.a;
                return Boolean.valueOf(dtsr.this.dl());
            }
        }, ab(new dtui("DatabasePlugin#moveCursorToLast"), dtsrVar))).booleanValue();
    }

    @Override // defpackage.dtve
    public final boolean L(final dtsr dtsrVar) {
        return ((Boolean) U(new cauu() { // from class: carv
            @Override // defpackage.cauu
            public final Object a() {
                enru enruVar = cauy.a;
                return Boolean.valueOf(dtsr.this.dm());
            }
        }, ab(new dtui("DatabasePlugin#moveCursorToNext"), dtsrVar))).booleanValue();
    }

    @Override // defpackage.dtve
    public final boolean M(final dtsr dtsrVar, final int i) {
        return ((Boolean) U(new cauu() { // from class: cate
            @Override // defpackage.cauu
            public final Object a() {
                enru enruVar = cauy.a;
                return Boolean.valueOf(dtsr.this.dn(i));
            }
        }, m(dtxc.READ, new dtui("DatabasePlugin#moveCursorToPosition"), new emyl() { // from class: catf
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return null;
            }
        }, this))).booleanValue();
    }

    @Override // defpackage.dtve
    public final boolean N(final dtsr dtsrVar) {
        return ((Boolean) U(new cauu() { // from class: casv
            @Override // defpackage.cauu
            public final Object a() {
                enru enruVar = cauy.a;
                return Boolean.valueOf(dtsr.this.m369do());
            }
        }, ab(new dtui("DatabasePlugin#moveCursorToPrevious"), dtsrVar))).booleanValue();
    }

    public final boolean O() {
        return this.g.isHeldByCurrentThread();
    }

    @Override // defpackage.dtve
    public final dtzf P() {
        return this.l;
    }

    @Override // defpackage.dtve
    public final dtuj Q(dtui dtuiVar) {
        boolean z = false;
        emxf.l(this.g.isHeldByCurrentThread() || !k().inTransaction());
        int i = 0;
        while (true) {
            try {
                try {
                } catch (InterruptedException unused) {
                    ensk j = b.j();
                    j.Y(ente.a, "BugleDatabase");
                    ((ensz) ((ensz) j).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "acquireWriteLock", 259, "DatabaseInterfaceImpl.java")).q("interruped while locking the write lock");
                    z = true;
                }
                if (this.g.tryLock(2L, TimeUnit.SECONDS)) {
                    if (this.g.getHoldCount() != 1) {
                        break;
                    }
                    cauw cauwVar = this.h;
                    cauwVar.a = new carm(Thread.currentThread(), dtuiVar, cauwVar.b.d.f().toEpochMilli());
                    cauwVar.b(dtuiVar, true);
                    Context context = dtub.b;
                    break;
                }
                cauw cauwVar2 = this.h;
                caux cauxVar = cauwVar2.a;
                if (cauxVar != null) {
                    Level level = csjc.j() ? Level.INFO : Level.WARNING;
                    String str = ((carm) cauxVar).b.toString() + " " + cauwVar2.b.d.f().minusMillis(((carm) cauxVar).c).toEpochMilli() + " ms " + cauw.a(((carm) cauxVar).a);
                    String str2 = dtuiVar.toString() + "\n" + cauw.a(Thread.currentThread());
                    enrr a2 = a.a(level);
                    a2.Y(ente.a, "BugleDatabase");
                    int i2 = i + 1;
                    ((enrr) a2.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl$WriteLockHistory", "emitLoggingForSlowToAcquireWriteLock", 193, "DatabaseInterfaceImpl.java")).J("kind of slow getting the write lock; wait seconds %s; blocked %s\nblocked by: %s", Integer.valueOf(i2 + i2), str2, str);
                    i = i2;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return new dtuj() { // from class: casl
            @Override // defpackage.dtuj
            public final Object a() {
                cauy cauyVar = cauy.this;
                if (cauyVar.g.getHoldCount() == 1) {
                    cauw cauwVar3 = cauyVar.h;
                    caux cauxVar2 = cauwVar3.a;
                    if (cauxVar2 != null) {
                        cauwVar3.a = null;
                        cauwVar3.b(((carm) cauxVar2).b, false);
                    }
                    Context context2 = dtub.b;
                    dtyq.a.remove();
                }
                cauyVar.g.unlock();
                return null;
            }
        };
    }

    @Override // defpackage.dtve
    public final long R(final String str, final ContentValues contentValues) {
        return ((Long) W(new cauu() { // from class: cati
            @Override // defpackage.cauu
            public final Object a() {
                cauy cauyVar = cauy.this;
                try {
                    return Long.valueOf(cauyVar.k().insertWithOnConflict(str, null, contentValues, 0));
                } catch (SQLiteException e) {
                    ensk i = cauy.a.i();
                    i.Y(ente.a, "BugleDatabase");
                    ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "insert", (char) 1345, "DatabaseInterfaceImpl.java")).q("Error inserting ");
                    return -1L;
                }
            }
        }, Z(dtxc.INSERT, str, new dtui("insert-", str), new emyl() { // from class: catj
            @Override // defpackage.emyl
            public final Object get() {
                return cauy.n(str, contentValues, 0);
            }
        }, this))).longValue();
    }

    @Override // defpackage.dtve
    public final long S(final String str, final ContentValues contentValues) {
        return ((Long) W(new cauu() { // from class: catk
            @Override // defpackage.cauu
            public final Object a() {
                return Long.valueOf(cauy.this.k().insertOrThrow(str, null, contentValues));
            }
        }, Z(dtxc.INSERT, str, new dtui("insertOrThrow-", str), new emyl() { // from class: catm
            @Override // defpackage.emyl
            public final Object get() {
                return cauy.n(str, contentValues, 0);
            }
        }, this))).longValue();
    }

    @Override // defpackage.dtve
    public final long T(final String str, final ContentValues contentValues, final int i) {
        return ((Long) W(new cauu() { // from class: casd
            @Override // defpackage.cauu
            public final Object a() {
                return Long.valueOf(cauy.this.k().insertWithOnConflict(str, null, contentValues, i));
            }
        }, Z(dtxc.INSERT, str, new dtui("insertWithOnConflict-", str), new emyl() { // from class: casf
            @Override // defpackage.emyl
            public final Object get() {
                return cauy.n(str, contentValues, i);
            }
        }, this))).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        r1[r7] = r1[r7] + 1;
        ag(r13.f, r2, r7, r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1 A[LOOP:3: B:42:0x00bf->B:43:0x00c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(defpackage.cauu r14, defpackage.dtwd r15) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cauy.U(cauu, dtwd):java.lang.Object");
    }

    final Cursor V(cauu cauuVar, dtwd dtwdVar) {
        Cursor cursor = (Cursor) U(cauuVar, dtwdVar);
        cursor.getCount();
        int length = this.f.length;
        while (true) {
            length--;
            if (length < 0) {
                return cursor;
            }
            cursor = this.f[length].a(cursor, dtwdVar);
        }
    }

    public final Object W(final cauu cauuVar, final dtwd dtwdVar) {
        return U(new cauu() { // from class: caug
            @Override // defpackage.cauu
            public final Object a() {
                cauy cauyVar = cauy.this;
                cauyVar.v();
                cauu cauuVar2 = cauuVar;
                try {
                    cauy.X(new duay(cauyVar, ((dtrg) dtwdVar).a));
                    try {
                        Object a2 = cauuVar2.a();
                        cauy.ac().c();
                        return a2;
                    } finally {
                    }
                } catch (IOException e) {
                    throw new emyx(e);
                }
            }
        }, dtwdVar);
    }

    @Override // defpackage.dtve
    public final void Y(String str, final Runnable runnable, final dtuz dtuzVar) {
        Integer num;
        dtzv dtzvVar = dtuzVar == dtuz.NO_TXN_EXCLUDING_SCOPE ? (dtzv) Collection.EL.stream(t()).filter(new Predicate() { // from class: catu
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
                enru enruVar = cauy.a;
                return !((dtzv) obj).e();
            }
        }).findFirst().orElse(null) : (dtzv) t().peekFirst();
        if (dtzvVar == null) {
            runnable.run();
            elfo.e(null);
            return;
        }
        final dtvf b2 = dtzvVar.b();
        if (str != null && (num = (Integer) b2.c.get(str)) != null) {
            ((dtvb) b2.a.get(num.intValue())).a();
        }
        if (str != null) {
            b2.c.put(str, Integer.valueOf(b2.a.size()));
        }
        elfl.g(kfg.a(new kfd() { // from class: cauf
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                enru enruVar = cauy.a;
                dtvf.this.a.add(new dtvb(eldl.l(runnable), kfbVar, dtuzVar));
                return "DatabaseWrapperImpl.runAfterCommit (completer)";
            }
        }));
    }

    @Override // defpackage.dtve
    public final int a(final String str, final String str2, final String[] strArr, dtvj dtvjVar) {
        dtrc dtrcVar = (dtrc) dtvjVar;
        return ((Integer) W(new cauu() { // from class: cauh
            @Override // defpackage.cauu
            public final Object a() {
                return Integer.valueOf(cauy.this.k().delete(str, str2, strArr));
            }
        }, aa(dtxc.DELETE, str, dtrcVar.c, new emyl() { // from class: caui
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return null;
            }
        }, new emyl() { // from class: cauj
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return dtzh.c("DELETE FROM " + str + " WHERE " + str2, strArr);
            }
        }, this, dtrcVar.b, null))).intValue();
    }

    @Override // defpackage.dtve
    public final int b(final SQLiteStatement sQLiteStatement) {
        return ((Integer) W(new cauu() { // from class: catg
            @Override // defpackage.cauu
            public final Object a() {
                enru enruVar = cauy.a;
                return Integer.valueOf(sQLiteStatement.executeUpdateDelete());
            }
        }, m(dtxc.RAW_SQL, new dtui("DatabasePlugin#executeStatement"), new emyl() { // from class: cath
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return null;
            }
        }, this))).intValue();
    }

    @Override // defpackage.dtve
    public final int c(final SQLiteStatement sQLiteStatement, dtui dtuiVar) {
        sQLiteStatement.getClass();
        return ((Integer) U(new cauu() { // from class: carw
            @Override // defpackage.cauu
            public final Object a() {
                return Integer.valueOf(sQLiteStatement.executeUpdateDelete());
            }
        }, m(dtxc.RAW_SQL, dtuiVar, new emyl() { // from class: carx
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return null;
            }
        }, this))).intValue();
    }

    @Override // defpackage.dtve
    public final int d(final dtsr dtsrVar) {
        return ((Integer) U(new cauu() { // from class: cauc
            @Override // defpackage.cauu
            public final Object a() {
                enru enruVar = cauy.a;
                return Integer.valueOf(dtsr.this.cN());
            }
        }, ab(new dtui("DatabasePlugin#getCountForCursor"), dtsrVar))).intValue();
    }

    @Override // defpackage.dtve
    public final int e(final String str, final ContentValues contentValues, final String str2, final String[] strArr, final duan duanVar) {
        cauu cauuVar = new cauu() { // from class: casm
            @Override // defpackage.cauu
            public final Object a() {
                return Integer.valueOf(cauy.this.k().updateWithOnConflict(str, contentValues, str2, strArr, ((dtrm) duanVar).g));
            }
        };
        dtrm dtrmVar = (dtrm) duanVar;
        return ((Integer) W(cauuVar, aa(dtxc.UPDATE, str, dtrmVar.d, new emyl() { // from class: casn
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return null;
            }
        }, new emyl() { // from class: caso
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return dtzh.c("UPDATE " + str + " SET " + dtub.k(contentValues, null, null) + " WHERE " + str2, strArr);
            }
        }, this, dtrmVar.c, contentValues))).intValue();
    }

    @Override // defpackage.dtve
    public final long f(final String str, final String str2, final String[] strArr) {
        return ((Long) U(new cauu() { // from class: catc
            @Override // defpackage.cauu
            public final Object a() {
                return Long.valueOf(DatabaseUtils.queryNumEntries(cauy.this.k(), str, str2, strArr));
            }
        }, Z(dtxc.QUERY, str, new dtui("queryCount"), new emyl() { // from class: catd
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return null;
            }
        }, this))).longValue();
    }

    @Override // defpackage.dtve
    public final Cursor g(final String str, final String[] strArr) {
        return V(new cauu() { // from class: casq
            @Override // defpackage.cauu
            public final Object a() {
                return cauy.this.k().rawQuery(str, strArr);
            }
        }, m(dtxc.QUERY, dtui.c, new emyl() { // from class: casr
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return dtzh.c(str, strArr);
            }
        }, this));
    }

    @Override // defpackage.dtve
    public final Cursor h(final String str, final String[] strArr, dtza dtzaVar) {
        cauu cauuVar = new cauu() { // from class: case
            @Override // defpackage.cauu
            public final Object a() {
                return cauy.this.k().rawQuery(str, strArr);
            }
        };
        dtxc dtxcVar = dtxc.QUERY;
        dtrj dtrjVar = (dtrj) dtzaVar;
        dtui dtuiVar = dtrjVar.t;
        if (dtuiVar == null) {
            dtuiVar = dtui.a;
        }
        dtui dtuiVar2 = dtuiVar;
        emyl emylVar = dtrjVar.w;
        if (emylVar == null) {
            emylVar = new emyl() { // from class: casp
                @Override // defpackage.emyl
                public final Object get() {
                    enru enruVar = cauy.a;
                    return null;
                }
            };
        }
        return V(cauuVar, aa(dtxcVar, null, dtuiVar2, emylVar, new emyl() { // from class: cata
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return dtzh.c(str, strArr);
            }
        }, this, dtrjVar.s, null));
    }

    @Override // defpackage.dtve
    public final Cursor i(final String str, final String[] strArr, dtza dtzaVar, final CancellationSignal cancellationSignal) {
        OperationCanceledException operationCanceledException;
        cauu cauuVar;
        dtxc dtxcVar;
        dtui dtuiVar;
        emyl emylVar;
        try {
            cauuVar = new cauu() { // from class: catz
                @Override // defpackage.cauu
                public final Object a() {
                    return cauy.this.k().rawQuery(str, strArr, cancellationSignal);
                }
            };
            dtxcVar = dtxc.QUERY;
            dtrj dtrjVar = (dtrj) dtzaVar;
            dtui dtuiVar2 = dtrjVar.t;
            if (dtuiVar2 == null) {
                try {
                    dtuiVar2 = dtui.a;
                } catch (OperationCanceledException e) {
                    operationCanceledException = e;
                    throw new dtyy(operationCanceledException);
                }
            }
            dtuiVar = dtuiVar2;
            emylVar = dtrjVar.w;
            if (emylVar == null) {
                emylVar = new emyl() { // from class: caua
                    @Override // defpackage.emyl
                    public final Object get() {
                        enru enruVar = cauy.a;
                        return null;
                    }
                };
            }
        } catch (OperationCanceledException e2) {
            e = e2;
        }
        try {
            return V(cauuVar, aa(dtxcVar, null, dtuiVar, emylVar, new emyl() { // from class: caub
                @Override // defpackage.emyl
                public final Object get() {
                    enru enruVar = cauy.a;
                    return dtzh.c(str, strArr);
                }
            }, this, ((dtrj) dtzaVar).s, null));
        } catch (OperationCanceledException e3) {
            e = e3;
            operationCanceledException = e;
            throw new dtyy(operationCanceledException);
        }
    }

    @Override // defpackage.dtve
    public final SQLiteDatabase j() {
        return k();
    }

    public final SQLiteDatabase k() {
        caut cautVar = this.j;
        if (cautVar.d != null && Thread.currentThread() == cautVar.d) {
            SQLiteDatabase sQLiteDatabase = cautVar.e;
            sQLiteDatabase.getClass();
            return sQLiteDatabase;
        }
        Future future = (Future) cautVar.a.get();
        future.getClass();
        try {
            try {
                return (SQLiteDatabase) erqt.q(future);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new cauo("Interrupted exception during database initialization", e);
            } catch (ExecutionException e2) {
                return caut.b(e2);
            }
        } catch (IllegalStateException unused) {
            ListenableFuture listenableFuture = (ListenableFuture) cautVar.a.get();
            if (listenableFuture == null) {
                throw new IllegalStateException("no waiting future set");
            }
            elfl g = elfl.g(erqt.j(listenableFuture));
            return efbd.g() ? (SQLiteDatabase) g.get() : (SQLiteDatabase) dtnq.a(g);
        } catch (ExecutionException e3) {
            return caut.b(e3);
        }
    }

    @Override // defpackage.dtve
    public final dttz l() {
        return this.e;
    }

    @Override // defpackage.dtve
    public final elfl o() {
        Thread currentThread = Thread.currentThread();
        caut cautVar = this.j;
        return currentThread == cautVar.d ? elfo.e(null) : cautVar.c.h(new emwl() { // from class: caur
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.dtve
    public final Object p(emyl emylVar) {
        Object obj;
        try {
            boolean isEmpty = t().isEmpty();
            B(new Runnable() { // from class: caud
                @Override // java.lang.Runnable
                public final void run() {
                    enru enruVar = cauy.a;
                    cauy.X(new dtzg());
                }
            }, m(dtxc.BEGIN_SCOPE, new dtui("DatabasePlugin#beginScope"), new emyl() { // from class: caue
                @Override // defpackage.emyl
                public final Object get() {
                    enru enruVar = cauy.a;
                    return null;
                }
            }, this));
            if (isEmpty) {
                ekzz f = eleg.f("executeInScope");
                try {
                    obj = emylVar.get();
                    f.close();
                } finally {
                }
            } else {
                obj = emylVar.get();
            }
            G(true);
            return obj;
        } finally {
            ae();
        }
    }

    @Override // defpackage.dtve
    public final Object q(emyl emylVar) {
        return r("AnonymousExecuteInTransaction", emylVar);
    }

    @Override // defpackage.dtve
    public final Object r(String str, emyl emylVar) {
        return s(new dtui(str), emylVar, dtvd.c().a());
    }

    @Override // defpackage.dtve
    public final Object s(dtui dtuiVar, final emyl emylVar, dtvd dtvdVar) {
        boolean z = ((dtra) dtvdVar).a;
        final boolean z2 = !z;
        boolean z3 = false;
        if (!z && dtuy.b(this)) {
            z3 = true;
        }
        if (z) {
            X(new dtzx(this, this.e, dtuiVar));
        } else {
            final dtui dtuiVar2 = new dtui(dtuiVar, "-BEGIN");
            B(new Runnable() { // from class: casx
                @Override // java.lang.Runnable
                public final void run() {
                    cauy cauyVar = cauy.this;
                    cauyVar.v();
                    cauy.X(new dtzx(cauyVar, cauyVar.e, dtuiVar2));
                    cauyVar.k().beginTransaction();
                }
            }, m(dtuy.b(this) ? dtxc.BEGIN_NESTED_TRANSACTION : dtxc.BEGIN_TRANSACTION, dtuiVar2, new emyl() { // from class: casy
                @Override // defpackage.emyl
                public final Object get() {
                    enru enruVar = cauy.a;
                    return null;
                }
            }, this));
        }
        try {
            Object U = U(new cauu() { // from class: catl
                @Override // defpackage.cauu
                public final Object a() {
                    Object obj = emylVar.get();
                    if (z2) {
                        cauy.this.G(true);
                    }
                    return obj;
                }
            }, m(dtxc.EXECUTE_IN_TRANSACTION_BODY, z3 ? dtui.c : new dtui(dtuiVar, "-BODY"), new emyl() { // from class: catv
                @Override // defpackage.emyl
                public final Object get() {
                    enru enruVar = cauy.a;
                    return null;
                }
            }, this));
            if (z) {
                ac().c();
                return U;
            }
            x(new dtui(dtuiVar, "-END"));
            return U;
        } catch (Throwable th) {
            if (z) {
                ac().c();
            } else {
                x(new dtui(dtuiVar, "-END"));
            }
            throw th;
        }
    }

    public final List u(boolean z) {
        Object b2;
        dtzv ac = ac();
        boolean isEmpty = t().isEmpty();
        boolean allMatch = Collection.EL.stream(t()).allMatch(new Predicate() { // from class: cauk
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
                enru enruVar = cauy.a;
                return ((dtzv) obj).e();
            }
        });
        emyw.e(ac);
        if (isEmpty) {
            ekzz f = eleg.f("DatabaseWrapperImpl.inTransactionDeferredRunnableList");
            try {
                HashMap hashMap = new HashMap();
                Iterator it = ac.b().d.entrySet().iterator();
                while (it.hasNext()) {
                    dtxg dtxgVar = (dtxg) ((Map.Entry) it.next()).getValue();
                    if (dtxgVar != null && (b2 = dtxgVar.b()) != null) {
                        hashMap.put(Integer.valueOf(dtxgVar.a()), b2);
                    }
                }
                dtvf b3 = ac.b();
                int size = b3.b.size();
                for (int i = 0; i < size; i++) {
                    dtva dtvaVar = (dtva) b3.b.get(i);
                    hashMap.get(Integer.valueOf(i));
                    dtvaVar.a();
                }
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
        if (z) {
            k().endTransaction();
        }
        ac.c();
        ac.getClass();
        if (!ac.f()) {
            entd entdVar = b;
            ensk j = entdVar.j();
            j.Y(ente.a, "BugleDatabase");
            ((ensz) ((ensz) j).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "endExecutionScopeAndReturnDeferredRunnables", 874, "DatabaseInterfaceImpl.java")).q("endTransaction without setting successful.");
            ensk j2 = entdVar.j();
            j2.Y(ente.a, "BugleDatabase");
            ensz enszVar = (ensz) j2;
            enszVar.aa(ensy.MEDIUM);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "endExecutionScopeAndReturnDeferredRunnables", 875, "DatabaseInterfaceImpl.java")).q("endTransaction called at");
        }
        if (isEmpty) {
            dtvf b4 = ac.b();
            if (!ac.g()) {
                Iterator it2 = b4.a.iterator();
                while (it2.hasNext()) {
                    ((dtvb) it2.next()).a();
                }
            } else if (!b4.a.isEmpty()) {
                return b4.a;
            }
        } else if (allMatch) {
            dtvf b5 = ac.b();
            if (ac.g()) {
                Stream filter = Collection.EL.stream(b5.a).filter(new Predicate() { // from class: caul
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
                        enru enruVar = cauy.a;
                        return ((dtvb) obj).a == dtuz.NO_TXN_EXCLUDING_SCOPE;
                    }
                });
                int i2 = engw.d;
                return (engw) filter.collect(endq.a);
            }
        }
        return new ArrayList();
    }

    public final void v() {
        dttz a2;
        Iterator descendingIterator = t().descendingIterator();
        while (descendingIterator.hasNext()) {
            dtzv dtzvVar = (dtzv) descendingIterator.next();
            if (dtzvVar != null && (a2 = dtzvVar.a()) != null && !dtzvVar.e()) {
                dtqy dtqyVar = (dtqy) this.e;
                int i = dtqyVar.d;
                int i2 = ((dtqy) a2).d;
                if (i2 <= i) {
                    return;
                }
                String str = dtqyVar.b;
                throw new IllegalStateException("cannot begin transaction on " + i + "/" + str + " already holding " + i2 + "/" + str);
            }
        }
    }

    @Override // defpackage.dtve
    public final void w() {
        B(new Runnable() { // from class: catp
            @Override // java.lang.Runnable
            public final void run() {
                cauy.this.k().close();
            }
        }, m(dtxc.CLOSE, new dtui("DatabasePlugin#close"), new emyl() { // from class: catq
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return null;
            }
        }, this));
    }

    public final void x(dtui dtuiVar) {
        cauu cauuVar = new cauu() { // from class: catn
            @Override // defpackage.cauu
            public final Object a() {
                return cauy.this.u(true);
            }
        };
        Stream stream = Collection.EL.stream(t());
        final String str = ((dtqy) this.e).b;
        af((List) U(cauuVar, m(stream.filter(new Predicate() { // from class: caum
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
                dttz a2;
                dtzv dtzvVar = (dtzv) obj;
                enru enruVar = cauy.a;
                if (dtzvVar == null || dtzvVar.e() || (a2 = dtzvVar.a()) == null) {
                    return false;
                }
                return ((dtqy) a2).b.equals(str);
            }
        }).count() > 1 ? dtxc.END_NESTED_TRANSACTION : dtxc.END_TRANSACTION, dtuiVar, new emyl() { // from class: cato
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return null;
            }
        }, this)));
    }

    @Override // defpackage.dtve
    public final void y(final String str) {
        W(new cauu() { // from class: cary
            @Override // defpackage.cauu
            public final Object a() {
                cauy cauyVar = cauy.this;
                emxf.l(cauyVar.O());
                cauyVar.k().execSQL(str);
                return 1L;
            }
        }, m(dtxc.RAW_SQL, new dtui("DatabasePlugin#execSQL1"), new emyl() { // from class: carz
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return null;
            }
        }, this));
    }

    @Override // defpackage.dtve
    public final void z(final String str, final Object[] objArr) {
        W(new cauu() { // from class: casg
            @Override // defpackage.cauu
            public final Object a() {
                cauy cauyVar = cauy.this;
                emxf.l(cauyVar.O());
                cauyVar.k().execSQL(str, objArr);
                return 1L;
            }
        }, m(dtxc.RAW_SQL, new dtui("DatabasePlugin#execSQL2"), new emyl() { // from class: cash
            @Override // defpackage.emyl
            public final Object get() {
                enru enruVar = cauy.a;
                return null;
            }
        }, this));
    }
}
