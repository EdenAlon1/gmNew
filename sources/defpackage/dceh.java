package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dceh extends abo {
    final /* synthetic */ dcei a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dceh(dcei dceiVar) {
        super(true);
        this.a = dceiVar;
    }

    @Override // defpackage.abo
    public final void b() {
        dcei dceiVar = this.a;
        dceiVar.f.H();
        dcnd H = dceiVar.f.H();
        dctl dctlVar = H.Y;
        if (dctlVar != null) {
            if (dctlVar.H().q()) {
                return;
            }
            Runnable runnable = H.ac;
            if (runnable != null) {
                runnable.run();
                return;
            }
        }
        if (!((Boolean) dcem.b.e()).booleanValue()) {
            dceiVar.b();
        }
        dceiVar.g.h(false);
        dceiVar.a.gE().d();
    }
}
