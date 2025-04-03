package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdc {
    public bcs a = null;
    private final Executor b;
    private final ahi c;

    public bdc(Executor executor, ahi ahiVar) {
        this.b = executor;
        this.c = ahiVar;
    }

    public final bcs a(bcs bcsVar) {
        bcs bcsVar2 = this.a;
        this.a = bcsVar;
        return bcsVar2;
    }

    public final void b() {
        try {
            Executor executor = this.b;
            final ahi ahiVar = this.c;
            ahiVar.getClass();
            executor.execute(new Runnable() { // from class: bdb
                @Override // java.lang.Runnable
                public final void run() {
                    ahi ahiVar2 = ahi.this;
                    if (ahiVar2.b.A == 4 || ahiVar2.b.A == 5) {
                        ahiVar2.b.D(false);
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            avw.d("CameraStateRegistry", "Unable to notify camera to open.", e);
        }
    }
}
