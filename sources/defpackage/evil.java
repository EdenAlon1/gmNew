package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evil implements edyr {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private final evik b;
    private final emxc c;

    public evil(evik evikVar, emxc emxcVar) {
        this.b = evikVar;
        this.c = emxcVar;
    }

    @Override // defpackage.edyr
    public final void a() {
        boolean isIsolated;
        isIsolated = Process.isIsolated();
        if (isIsolated || a.getAndSet(true)) {
            return;
        }
        ekzz f = eleg.f("AndroidLoggerConfig");
        try {
            evik evikVar = this.b;
            Object obj = ((emxn) this.c).a;
            if (!enut.a.compareAndSet(false, true)) {
                throw new IllegalStateException("Logger backend configuration may only occur once.");
            }
            AtomicReference atomicReference = enuz.d;
            while (!atomicReference.compareAndSet(null, evikVar)) {
                if (atomicReference.get() != null) {
                    throw new IllegalStateException("Logger backends can only be configured once.");
                }
            }
            enuz.e();
            enva.a.b.set(obj);
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
