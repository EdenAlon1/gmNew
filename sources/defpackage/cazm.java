package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j$.util.Optional;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cazm implements cavm {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/layer/TransactionWatchDogPlugin");
    static final cfup b = cfvl.l(cfvl.b, "transaction_watchdog_limit_ms", 5000);
    public static final Object c = new Object();
    public final cqoh d;
    public final errm e;
    public errk f;
    public boolean g;
    private final fazb h;
    private final asle i;

    public cazm(errm errmVar, asle asleVar, cqoh cqohVar, fazb fazbVar) {
        this.e = errmVar;
        this.i = asleVar;
        this.d = cqohVar;
        this.h = fazbVar;
    }

    @Override // defpackage.cavm
    public final /* synthetic */ int e(Exception exc, int i, dtwd dtwdVar) {
        return 1;
    }

    @Override // defpackage.cavm
    public final Closeable l(dtwd dtwdVar) {
        int ordinal = ((dtrg) dtwdVar).b.ordinal();
        if (ordinal == 6) {
            final Optional optional = (Optional) this.h.b();
            if (optional.isEmpty()) {
                return null;
            }
            return new Closeable() { // from class: cazk
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    final cazm cazmVar = cazm.this;
                    synchronized (cazm.c) {
                        cazmVar.g = true;
                    }
                    final Optional optional2 = optional;
                    final Thread currentThread = Thread.currentThread();
                    final StackTraceElement[] stackTrace = currentThread.getStackTrace();
                    cqoh cqohVar = cazmVar.d;
                    final long a2 = cqohVar.a();
                    final long millis = cqohVar.d().toMillis();
                    cazmVar.f = cazmVar.e.schedule(new Runnable() { // from class: cazj
                        @Override // java.lang.Runnable
                        public final void run() {
                            cazm cazmVar2 = cazm.this;
                            long j = a2;
                            Thread thread = currentThread;
                            StackTraceElement[] stackTraceElementArr = stackTrace;
                            Optional optional3 = optional2;
                            synchronized (cazm.c) {
                                if (cazmVar2.g) {
                                    long a3 = cazmVar2.d.a() - j;
                                    long millis2 = cazmVar2.d.d().toMillis() - millis;
                                    cazl cazlVar = new cazl();
                                    try {
                                        cazlVar.setStackTrace(thread.getStackTrace());
                                    } catch (RuntimeException e) {
                                        ensk i = cazm.a.i();
                                        i.Y(ente.a, "BugleDatabasePerf");
                                        ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/datamodel/layer/TransactionWatchDogPlugin", "open", (char) 133, "TransactionWatchDogPlugin.java")).q("unable to acquire stack trace from thread holding transaction");
                                    }
                                    cazl cazlVar2 = new cazl(cazlVar);
                                    cazlVar2.setStackTrace(stackTraceElementArr);
                                    ensk j2 = cazm.a.j();
                                    j2.Y(ente.a, "BugleDatabasePerf");
                                    ((enrr) ((enrr) ((enrr) j2).g(cazlVar2)).h("com/google/android/apps/messaging/shared/datamodel/layer/TransactionWatchDogPlugin", "open", 141, "TransactionWatchDogPlugin.java")).z("transaction taking excessive time (%d total; %d in thread)", a3, millis2);
                                    ((cavk) optional3.get()).a();
                                }
                            }
                        }
                    }, ((Long) cazm.b.e()).longValue(), TimeUnit.MILLISECONDS);
                }
            };
        }
        if (ordinal != 8) {
            return null;
        }
        synchronized (c) {
            if (this.g) {
                this.g = false;
                this.f.cancel(false);
            }
        }
        return null;
    }

    @Override // defpackage.cavm
    public final boolean n() {
        return ((ersq) ((arog) this.i).a.b()).a("bugle.report_long_transactions");
    }

    @Override // defpackage.cavm
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.cavm
    public final /* synthetic */ Cursor a(Cursor cursor, dtwd dtwdVar) {
        return cursor;
    }
}
