package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fggw implements Runnable {
    final /* synthetic */ fggx a;
    private Runnable b;

    public fggw(fggx fggxVar, Runnable runnable) {
        this.a = fggxVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.b.run();
            } catch (Throwable th) {
                ffsf.b(ffhe.a, th);
            }
            Runnable g = this.a.g();
            if (g == null) {
                return;
            }
            this.b = g;
            i++;
            if (i >= 16) {
                fggx fggxVar = this.a;
                if (fggxVar.a.ex(fggxVar)) {
                    fggx fggxVar2 = this.a;
                    fggxVar2.a.a(fggxVar2, this);
                    return;
                }
            }
        }
    }
}
