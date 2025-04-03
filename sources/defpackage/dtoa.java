package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtoa extends Thread {
    public Runnable a;
    public Runnable b;
    public final dtot c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtoa(int i, Runnable runnable) {
        super(runnable);
        runnable.getClass();
        this.c = new dtot(this, 0, false, 0, true, 26);
        a(i);
    }

    public final void a(int i) {
        dtot dtotVar = this.c;
        if (!dtotVar.c) {
            throw new IllegalStateException("Cannot override priority of non-boostable thread");
        }
        while (true) {
            long j = dtotVar.f.get();
            long i2 = dtos.i(j, false, false, false, i, 0, 0L, 119);
            if (dtos.g(j)) {
                if (dtotVar.f.compareAndSet(j, i2)) {
                    return;
                }
            } else if (dtos.d(j) == dtos.d(i2)) {
                if (dtotVar.f.compareAndSet(j, i2)) {
                    return;
                }
            } else if (dtotVar.f.compareAndSet(j, dtos.i(i2, false, true, false, 0, 0, 0L, 125))) {
                dtotVar.a(dtos.d(j));
                return;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        dtot dtotVar = this.c;
        dtotVar.b = Process.myTid();
        do {
            j = dtotVar.f.get();
        } while (!dtotVar.f.compareAndSet(j, dtos.i(j, true, true, false, 0, 0, 0L, 124)));
        if (!dtos.g(j)) {
            dtotVar.a(-21);
        }
        Runnable runnable = null;
        try {
            try {
                Runnable runnable2 = this.a;
                if (runnable2 == null) {
                    ffkj.c("startedCallback");
                    runnable2 = null;
                }
                runnable2.run();
                super.run();
                Runnable runnable3 = this.b;
                if (runnable3 == null) {
                    ffkj.c("finishedCallback");
                } else {
                    runnable = runnable3;
                }
                runnable.run();
                this.c.c();
            } catch (Throwable th) {
                th = th;
                Runnable runnable4 = this.b;
                if (runnable4 == null) {
                    ffkj.c("finishedCallback");
                } else {
                    runnable = runnable4;
                }
                runnable.run();
                this.c.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            this.c.c();
            throw th;
        }
    }
}
