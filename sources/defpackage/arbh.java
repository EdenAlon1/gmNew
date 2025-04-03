package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.messaging.shared.app.UncaughtExceptionReceiver;
import j$.util.Optional;
import java.lang.Thread;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class arbh extends ekka implements Thread.UncaughtExceptionHandler, poc {
    public static final enru c = enru.c("com/google/android/apps/messaging/shared/app/BugleApplicationBase");
    public static final cfva d = cfvl.r(12345, "observable_query_on_read_kill_switch");
    private Executor a;
    protected Thread.UncaughtExceptionHandler e;
    public ffbr f;
    public ffbr g;
    public ffbr h;
    public ffbr i;
    public ffbr j;
    public ffbr k;
    public ffbr l;
    public ffbr m;
    public elbx n;
    public ffbr o;
    public ffbr p;
    public ffbr q;
    public asxd r;

    private final void eX(final Thread thread, final Throwable th) {
        Runnable runnable = new Runnable() { // from class: arax
            @Override // java.lang.Runnable
            public final void run() {
                ensk h = UncaughtExceptionReceiver.c.h();
                h.Y(ente.a, "Bugle");
                Throwable th2 = th;
                ((enrr) ((enrr) ((enrr) h).g(th2)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "reportUncaughtException", '$', "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: throwing exception to UncaughtExceptionReceiver");
                arbh arbhVar = arbh.this;
                Intent intent = new Intent(arbhVar, (Class<?>) UncaughtExceptionReceiver.class);
                intent.putExtra("throwable", th2);
                try {
                    arbhVar.sendBroadcast(intent);
                } catch (Throwable th3) {
                    ensk i = UncaughtExceptionReceiver.c.i();
                    i.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) i).g(th3)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "reportUncaughtException", ',', "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: unable to reportUncaughtException due to exception while sending broadcast");
                }
                arbhVar.d(thread, th2);
            }
        };
        if (getMainLooper().getThread() != thread) {
            ensk i = c.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i).g(th)).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "reportException", 247, "BugleApplicationBase.java")).t("BugleApplicationBase: Uncaught exception in background thread %s", thread);
            new Handler(getMainLooper()).post(runnable);
            ffbr ffbrVar = this.i;
            if (ffbrVar != null) {
                ((alir) ffbrVar.b()).f(aliq.EXCEPTION, Optional.of("Uncaught exception in background thread"));
                return;
            }
            return;
        }
        ensk i2 = c.i();
        i2.Y(ente.a, "Bugle");
        ((enrr) ((enrr) ((enrr) i2).g(th)).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "reportException", 258, "BugleApplicationBase.java")).t("BugleApplicationBase: Uncaught exception in primary thread %s", thread);
        runnable.run();
        ffbr ffbrVar2 = this.i;
        if (ffbrVar2 != null) {
            ((alir) ffbrVar2.b()).f(aliq.EXCEPTION, Optional.of("Uncaught exception in primary thread"));
        }
    }

    @Override // defpackage.poc
    public final pod a() {
        pob pobVar = new pob();
        pobVar.a((Executor) this.m.b());
        pobVar.b((Executor) this.m.b());
        int i = 2;
        if (!Log.isLoggable("BugleAction", 2)) {
            i = 3;
            if (!Log.isLoggable("BugleAction", 3)) {
                i = 4;
            }
        }
        pobVar.h = i;
        String packageName = getApplicationContext().getPackageName();
        packageName.getClass();
        pobVar.g = packageName;
        pobVar.c((pqy) this.o.b());
        pobVar.f = new ksp() { // from class: aray
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                ensk i2 = arbh.c.i();
                i2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) i2).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "handleWorkManagerDatabaseCorruption", 181, "BugleApplicationBase.java")).q("BugleApplicationBase: work manager corruption detected, wiping app data");
                ffbr ffbrVar = arbh.this.p;
                if (ffbrVar != null) {
                    ((csrf) ffbrVar.b()).b("Bugle.Datamodel.WorkManagerCorrupted.Counts");
                }
            }
        };
        pobVar.i = 1000;
        pobVar.j = 3000;
        return new pod(pobVar);
    }

    @Override // defpackage.ekka, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        ctba.a = this;
        ersy.a = this;
        dipo.b(this);
        ecwj.f(this);
    }

    public final void d(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.e;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    @Override // defpackage.ekka, android.app.Application
    public void onCreate() {
        Supplier supplier;
        Supplier supplier2;
        Supplier supplier3;
        Supplier supplier4;
        Supplier supplier5;
        Supplier supplier6;
        Supplier supplier7;
        Supplier supplier8;
        Supplier supplier9;
        Supplier supplier10;
        Supplier supplier11;
        Supplier supplier12;
        Supplier supplier13;
        Supplier supplier14;
        Supplier supplier15;
        String str;
        super.onCreate();
        devc.a = this;
        deup.b(this);
        dtqu dtquVar = new dtqu();
        dtquVar.a = new Supplier() { // from class: dtsv
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dtquVar.b = new Supplier() { // from class: dttg
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dtquVar.c = new Supplier() { // from class: dtth
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dtquVar.d = new Supplier() { // from class: dtti
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dtquVar.e = new Supplier() { // from class: dttj
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dtquVar.f = new Supplier() { // from class: dtsw
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dtquVar.g = new Supplier() { // from class: dtsx
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dtquVar.h = new Supplier() { // from class: dtsy
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dtquVar.j = new Supplier() { // from class: dtsz
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dtquVar.k = new Supplier() { // from class: dtta
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dtquVar.n = new Supplier() { // from class: dttb
            @Override // java.util.function.Supplier
            public final Object get() {
                return erpp.a;
            }
        };
        dtquVar.l = new Supplier() { // from class: dttc
            @Override // java.util.function.Supplier
            public final Object get() {
                return erpp.a;
            }
        };
        dtquVar.m = new Supplier() { // from class: dttd
            @Override // java.util.function.Supplier
            public final Object get() {
                return erpp.a;
            }
        };
        dtquVar.a(true);
        dtquVar.i = new Supplier() { // from class: dtte
            @Override // java.util.function.Supplier
            public final Object get() {
                return false;
            }
        };
        dtquVar.p = new Supplier() { // from class: dttf
            @Override // java.util.function.Supplier
            public final Object get() {
                return false;
            }
        };
        dtquVar.a = new Supplier() { // from class: araz
            @Override // java.util.function.Supplier
            public final Object get() {
                enru enruVar = arbh.c;
                return Boolean.valueOf(csjc.c());
            }
        };
        dtquVar.b = new Supplier() { // from class: arbd
            @Override // java.util.function.Supplier
            public final Object get() {
                return (Boolean) arbh.this.q.b();
            }
        };
        dtquVar.c = new Supplier() { // from class: arbe
            @Override // java.util.function.Supplier
            public final Object get() {
                return Boolean.valueOf(arbh.this.r.a());
            }
        };
        dtquVar.d = new Supplier() { // from class: arbf
            @Override // java.util.function.Supplier
            public final Object get() {
                enru enruVar = arbh.c;
                return true;
            }
        };
        dtquVar.g = new Supplier() { // from class: arbg
            @Override // java.util.function.Supplier
            public final Object get() {
                enru enruVar = arbh.c;
                return true;
            }
        };
        dtquVar.h = new Supplier() { // from class: aras
            @Override // java.util.function.Supplier
            public final Object get() {
                enru enruVar = arbh.c;
                return false;
            }
        };
        dtquVar.k = new Supplier() { // from class: arat
            @Override // java.util.function.Supplier
            public final Object get() {
                enru enruVar = arbh.c;
                return true;
            }
        };
        dtquVar.j = new Supplier() { // from class: arau
            @Override // java.util.function.Supplier
            public final Object get() {
                enru enruVar = arbh.c;
                return true;
            }
        };
        dtquVar.l = new Supplier() { // from class: arav
            @Override // java.util.function.Supplier
            public final Object get() {
                return (Executor) arbh.this.k.b();
            }
        };
        dtquVar.m = new Supplier() { // from class: araw
            @Override // java.util.function.Supplier
            public final Object get() {
                return (Executor) arbh.this.l.b();
            }
        };
        dtquVar.n = new Supplier() { // from class: arba
            @Override // java.util.function.Supplier
            public final Object get() {
                return (Executor) arbh.this.m.b();
            }
        };
        dtquVar.i = new Supplier() { // from class: arbb
            @Override // java.util.function.Supplier
            public final Object get() {
                return (Boolean) arbh.d.e();
            }
        };
        dtquVar.a(ctid.g(getApplicationContext()));
        dtquVar.p = new Supplier() { // from class: arbc
            @Override // java.util.function.Supplier
            public final Object get() {
                enru enruVar = arbh.c;
                return false;
            }
        };
        if (dtquVar.q == 1 && (supplier = dtquVar.a) != null && (supplier2 = dtquVar.b) != null && (supplier3 = dtquVar.c) != null && (supplier4 = dtquVar.d) != null && (supplier5 = dtquVar.e) != null && (supplier6 = dtquVar.f) != null && (supplier7 = dtquVar.g) != null && (supplier8 = dtquVar.h) != null && (supplier9 = dtquVar.i) != null && (supplier10 = dtquVar.j) != null && (supplier11 = dtquVar.k) != null && (supplier12 = dtquVar.l) != null && (supplier13 = dtquVar.m) != null && (supplier14 = dtquVar.n) != null && (supplier15 = dtquVar.p) != null) {
            dtqv dtqvVar = new dtqv(supplier, supplier2, supplier3, supplier4, supplier5, supplier6, supplier7, supplier8, supplier9, supplier10, supplier11, supplier12, supplier13, supplier14, dtquVar.o, supplier15);
            dtub.b = this;
            dtub.c = dtqvVar;
            dtub.d.set(dtqvVar);
            if (ctid.g(this)) {
                Iterator it = ((Set) this.h.b()).iterator();
                while (it.hasNext()) {
                    registerActivityLifecycleCallbacks((csiv) it.next());
                }
            } else {
                ecwj.f(this);
                dizc.m();
            }
            cfun.a.set(true);
            axnw.h(((cpdr) this.f.b()).b());
            ensk h = c.h();
            h.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "onCreate", 145, "BugleApplicationBase.java");
            int i = crob.a;
            try {
                PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
                str = "Bugle version: " + (TextUtils.isEmpty(packageInfo.versionName) ? "unknown_app_version" : packageInfo.versionName.toLowerCase(Locale.US)) + " , Bugle version code: " + (Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
            } catch (Exception e) {
                e.printStackTrace();
                str = "Error getting app version information.";
            }
            enrrVar.t("BugleApplicationBase: %s", str);
            csli.a(getApplicationContext(), crob.d(getApplicationContext()));
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (dtquVar.a == null) {
            sb.append(" enforceCheckInitializedSupplier");
        }
        if (dtquVar.b == null) {
            sb.append(" enforceThreadChecksOnCursorsSupplier");
        }
        if (dtquVar.c == null) {
            sb.append(" useIteratingStreamSupplier");
        }
        if (dtquVar.d == null) {
            sb.append(" omitUnchangedRowsFromUpdatesByDefaultSupplier");
        }
        if (dtquVar.e == null) {
            sb.append(" throwOnExtractBindDatasArrayLengthCheckSupplier");
        }
        if (dtquVar.f == null) {
            sb.append(" enforceConcurrentCursorModificationDurinBindSupplier");
        }
        if (dtquVar.g == null) {
            sb.append(" suppressPhantomRowsByDefaultSupplier");
        }
        if (dtquVar.h == null) {
            sb.append(" catchBulkInsertThrowablesSupplier");
        }
        if (dtquVar.i == null) {
            sb.append(" observableQueryOnReadyKillSwitch");
        }
        if (dtquVar.j == null) {
            sb.append(" addIdsToBindDataInBulkInsertSupplier");
        }
        if (dtquVar.k == null) {
            sb.append(" enableDbOverridesSupplier");
        }
        if (dtquVar.l == null) {
            sb.append(" readExecutor");
        }
        if (dtquVar.m == null) {
            sb.append(" writeExecutor");
        }
        if (dtquVar.n == null) {
            sb.append(" blockingExecutor");
        }
        if (dtquVar.q == 0) {
            sb.append(" isPrimaryProcess");
        }
        if (dtquVar.p == null) {
            sb.append(" allowQueryOnSingletonCaching");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i) {
        ekzm b = this.n.b("BugleApplicationBase#onTrimMemory");
        try {
            super.onTrimMemory(i);
            if (ctid.g(this)) {
                ensk e = c.e();
                e.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "onTrimMemory", 157, "BugleApplicationBase.java")).q("BugleApplicationBase: onTrimMemory");
                if (this.a == null) {
                    this.a = new ersb((Executor) this.j.b());
                }
                axos.a(new Runnable() { // from class: arar
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((crmr) arbh.this.g.b()).a(i, 2);
                    }
                }, this.a);
                if (crki.a.get()) {
                    try {
                        qpt.b(this).i(i);
                    } catch (NoSuchFieldError | OutOfMemoryError e2) {
                        ensk j = c.j();
                        j.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "onTrimMemory", (char) 170, "BugleApplicationBase.java")).q("BugleApplicationBase: Exception clearing glide memory");
                    }
                }
                ((alir) this.i.b()).f(aliq.TRIM_MEMORY, Optional.of(String.valueOf(i)));
            }
            b.close();
        } finally {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (ctid.g(this)) {
            eX(thread, th);
            return;
        }
        if (!ctid.a(this).equals(getPackageName().concat(":crash_report"))) {
            eX(thread, th);
            return;
        }
        ensk i = c.i();
        i.Y(ente.a, "Bugle");
        ((enrr) ((enrr) ((enrr) i).g(th)).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "uncaughtException", 219, "BugleApplicationBase.java")).t("BugleApplicationBase: Reporting disabled for background process. Dropping for %s", thread);
        d(thread, th);
    }
}
