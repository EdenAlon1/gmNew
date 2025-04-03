package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejkz implements Runnable {
    public erog a;
    public Executor b;

    public ejkz(erog erogVar, Executor executor) {
        this.a = erogVar;
        executor.getClass();
        this.b = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = null;
        this.b = null;
    }
}
