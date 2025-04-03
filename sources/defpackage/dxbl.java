package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxbl implements Runnable {
    final /* synthetic */ dxbm a;
    private final Runnable b;

    public dxbl(dxbm dxbmVar, Runnable runnable) {
        this.a = dxbmVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } finally {
            this.a.a();
        }
    }
}
