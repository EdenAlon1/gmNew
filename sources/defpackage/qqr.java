package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qqr implements rgj {
    final /* synthetic */ qqs a;
    private final rhd b;

    public qqr(qqs qqsVar, rhd rhdVar) {
        this.a = qqsVar;
        this.b = rhdVar;
    }

    @Override // defpackage.rgj
    public final void a(boolean z) {
        if (z) {
            synchronized (this.a) {
                rhd rhdVar = this.b;
                for (rib ribVar : rkh.h(rhdVar.a)) {
                    if (!ribVar.l() && !ribVar.k()) {
                        ribVar.c();
                        if (rhdVar.c) {
                            rhdVar.b.add(ribVar);
                        } else {
                            ribVar.b();
                        }
                    }
                }
            }
        }
    }
}
