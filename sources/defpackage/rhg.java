package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rhg implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ rhh b;

    public rhg(rhh rhhVar, boolean z) {
        this.a = z;
        this.b = rhhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rkh.j();
        rhi rhiVar = this.b.a;
        boolean z = rhiVar.a;
        boolean z2 = this.a;
        rhiVar.a = z2;
        if (z != z2) {
            rhiVar.b.a(z2);
        }
    }
}
