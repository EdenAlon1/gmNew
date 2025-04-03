package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elda implements Runnable {
    final /* synthetic */ elav a;
    final /* synthetic */ Runnable b;

    public elda(elav elavVar, Runnable runnable) {
        this.a = elavVar;
        this.b = runnable;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [elat, elav] */
    @Override // java.lang.Runnable
    public final void run() {
        elat h = ekyf.h(ekyf.b(), this.a);
        try {
            this.b.run();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
