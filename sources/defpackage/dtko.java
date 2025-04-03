package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtko implements dtik {
    final /* synthetic */ dtik a;
    final /* synthetic */ iir b;
    final /* synthetic */ hss c;
    final /* synthetic */ dtlj d;

    public dtko(dtik dtikVar, iir iirVar, hss hssVar, dtlj dtljVar) {
        this.a = dtikVar;
        this.b = iirVar;
        this.c = hssVar;
        this.d = dtljVar;
    }

    @Override // defpackage.dtik
    public final void a(boolean z, boolean z2, dteh dtehVar) {
        if (this.d instanceof dtli) {
            this.b.a(0);
        }
        this.a.a(z, z2, dtehVar);
    }

    @Override // defpackage.dtik
    public final void b() {
        this.a.b();
        this.b.a(0);
        this.c.clear();
    }

    @Override // defpackage.dtik
    public final void c() {
        if (this.d instanceof dtli) {
            this.b.a(0);
        }
        this.a.c();
    }

    @Override // defpackage.dtik
    public final void d(dteh dtehVar) {
        if (this.d instanceof dtli) {
            this.b.a(0);
        }
        this.a.d(dtehVar);
    }
}
