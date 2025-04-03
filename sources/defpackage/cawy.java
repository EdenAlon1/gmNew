package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.Closeable;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cawy implements cavm {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/layer/ReadLockPlugin");
    static final cfup b = cfvl.e(cfvl.b, "max_expected_read_lock_wait_time_ms", 5000);
    static final cfup c = cfvl.e(cfvl.b, "max_expected_query_cpu_time", 250);
    static final cfup d = cfvl.e(cfvl.b, "max_non_severe_query_cpu_time", 2000);
    public final cqoh g;
    private final atkt i;
    public final Semaphore e = new Semaphore(4, true);
    public final ThreadLocal f = new ThreadLocal() { // from class: cawx
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Object initialValue() {
            enru enruVar = cawy.a;
            return false;
        }
    };
    private final AtomicLong h = new AtomicLong(0);

    public cawy(cqoh cqohVar, atkt atktVar) {
        this.g = cqohVar;
        this.i = atktVar;
    }

    @Override // defpackage.cavm
    public final /* synthetic */ int e(Exception exc, int i, dtwd dtwdVar) {
        return 1;
    }

    @Override // defpackage.cavm
    public final Closeable l(dtwd dtwdVar) {
        final cawy cawyVar;
        final dtwd dtwdVar2;
        final Runnable runnable;
        cqoh cqohVar = this.g;
        final long a2 = cqohVar.a();
        final long millis = cqohVar.d().toMillis();
        final AtomicLong atomicLong = new AtomicLong(0L);
        atkt atktVar = this.i;
        final long andIncrement = this.h.getAndIncrement();
        if (((ersq) ((atkf) atktVar).a.b()).a("bugle.enable_slow_query_logging") && ((dtrg) dtwdVar).b == dtxc.QUERY) {
            cawyVar = this;
            dtwdVar2 = dtwdVar;
            runnable = new Runnable() { // from class: caws
                @Override // java.lang.Runnable
                public final void run() {
                    cawy cawyVar2 = cawy.this;
                    long millis2 = cawyVar2.g.d().minusMillis(millis).toMillis();
                    long intValue = ((Integer) cawy.d.e()).intValue();
                    AtomicLong atomicLong2 = atomicLong;
                    long j = a2;
                    long j2 = andIncrement;
                    dtwd dtwdVar3 = dtwdVar2;
                    String str = "Unknown";
                    if (millis2 > intValue) {
                        ensk i = cawy.a.i();
                        i.Y(ente.a, "BugleDatabasePerf");
                        enrr enrrVar = (enrr) ((enrr) ((enrr) i).g(eldx.b(new Exception("SlowQueryException")))).h("com/google/android/apps/messaging/shared/datamodel/layer/ReadLockPlugin", "open", 120, "ReadLockPlugin.java");
                        ecgg ecggVar = new ecgg(millis2);
                        Object e = cawy.c.e();
                        dtrg dtrgVar = (dtrg) dtwdVar3;
                        ecgk ecgkVar = new ecgk(dtrgVar.b);
                        Long valueOf = Long.valueOf(j2);
                        dtui dtuiVar = dtrgVar.a;
                        cqoh cqohVar2 = cawyVar2.g;
                        ecgi a3 = dtuiVar.a();
                        ecgg ecggVar2 = new ecgg(cqohVar2.a() - j);
                        if (atomicLong2.get() > 0) {
                            str = cawyVar2.g.d().minusMillis(atomicLong2.get()).toMillis() + "ms";
                        }
                        enrrVar.N("ReadLockPlugin query took %s ms, longer than the expected %d ms max. op=%s, opId=%s, tag=%s, wallDuration=%sms, postLockThreadDuration=%s", ecggVar, e, ecgkVar, valueOf, a3, ecggVar2, str);
                        return;
                    }
                    if (millis2 > ((Integer) cawy.c.e()).intValue()) {
                        ensk j3 = cawy.a.j();
                        j3.Y(ente.a, "BugleDatabasePerf");
                        enrr enrrVar2 = (enrr) ((enrr) ((enrr) j3).g(eldx.b(new Exception("SlowQueryException")))).h("com/google/android/apps/messaging/shared/datamodel/layer/ReadLockPlugin", "open", 142, "ReadLockPlugin.java");
                        ecgg ecggVar3 = new ecgg(millis2);
                        Object e2 = cawy.c.e();
                        dtrg dtrgVar2 = (dtrg) dtwdVar3;
                        ecgk ecgkVar2 = new ecgk(dtrgVar2.b);
                        Long valueOf2 = Long.valueOf(j2);
                        dtui dtuiVar2 = dtrgVar2.a;
                        cqoh cqohVar3 = cawyVar2.g;
                        ecgi a4 = dtuiVar2.a();
                        ecgg ecggVar4 = new ecgg(cqohVar3.a() - j);
                        if (atomicLong2.get() > 0) {
                            str = cawyVar2.g.d().minusMillis(atomicLong2.get()).toMillis() + "ms";
                        }
                        enrrVar2.N("ReadLockPlugin query took %s ms, longer than the expected %d ms max. op=%s, opId=%s, tag=%s, wallDuration=%sms, postLockThreadDuration=%s", ecggVar3, e2, ecgkVar2, valueOf2, a4, ecggVar4, str);
                    }
                }
            };
        } else {
            cawyVar = this;
            dtwdVar2 = dtwdVar;
            runnable = null;
        }
        dtrg dtrgVar = (dtrg) dtwdVar2;
        int ordinal = dtrgVar.b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (!((Boolean) cawyVar.f.get()).booleanValue()) {
                cawyVar.e.acquireUninterruptibly();
                atomicLong.set(cawyVar.g.d().toMillis());
                long a3 = cawyVar.g.a() - a2;
                cfup cfupVar = b;
                if (a3 > ((Integer) cfupVar.e()).intValue()) {
                    if (csjc.h()) {
                        ensk h = a.h();
                        h.Y(ente.a, "BugleDatabasePerf");
                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/layer/ReadLockPlugin", "open", 196, "ReadLockPlugin.java")).J("%s took > %d (%d ms) to acquire readLock", dtrgVar.a, cfupVar.e(), Long.valueOf(a3));
                    } else {
                        ensk j = a.j();
                        j.Y(ente.a, "BugleDatabasePerf");
                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/layer/ReadLockPlugin", "open", BasePaymentResult.ERROR_REQUEST_FAILED, "ReadLockPlugin.java")).J("%s took > %d (%d ms) to acquire readLock", dtrgVar.a, cfupVar.e(), Long.valueOf(a3));
                    }
                }
                return new Closeable() { // from class: cawv
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        cawy.this.e.release();
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                };
            }
        } else {
            if (ordinal == 6) {
                return new Closeable() { // from class: cawt
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        cawy cawyVar2 = cawy.this;
                        emxf.l(!((Boolean) cawyVar2.f.get()).booleanValue());
                        cawyVar2.f.set(true);
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                };
            }
            if (ordinal == 8) {
                return new Closeable() { // from class: cawu
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        cawy cawyVar2 = cawy.this;
                        emxf.l(((Boolean) cawyVar2.f.get()).booleanValue());
                        cawyVar2.f.set(false);
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                };
            }
            if (runnable != null) {
                return new Closeable() { // from class: caww
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        enru enruVar = cawy.a;
                        runnable.run();
                    }
                };
            }
        }
        return null;
    }

    @Override // defpackage.cavm
    public final boolean n() {
        return false;
    }

    @Override // defpackage.cavm
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.cavm
    public final /* synthetic */ Cursor a(Cursor cursor, dtwd dtwdVar) {
        return cursor;
    }
}
