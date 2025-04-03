package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elde implements Runnable {
    final /* synthetic */ elat a;
    final /* synthetic */ Runnable b;

    public elde(elat elatVar, Runnable runnable) {
        this.a = elatVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        elat i = ekyf.i(ekyf.b(), this.a);
        try {
            this.b.run();
        } finally {
        }
    }
}
