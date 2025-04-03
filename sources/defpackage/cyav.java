package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyav implements cxyp {
    final /* synthetic */ cyaz a;
    final /* synthetic */ engw b;
    final /* synthetic */ cyax c;

    public cyav(cyax cyaxVar, cyaz cyazVar, engw engwVar) {
        this.a = cyazVar;
        this.b = engwVar;
        this.c = cyaxVar;
    }

    @Override // defpackage.cxyp
    public final void a(cxyq cxyqVar) {
        cyax cyaxVar = this.c;
        cyag cyagVar = cyaxVar.b;
        if (cyagVar != null) {
            int i = cyagVar.E;
            r2 = i == 2;
            if (i == 0) {
                throw null;
            }
        }
        cyaxVar.f(this.b);
        cyax cyaxVar2 = this.c;
        cyaxVar2.c = this.b;
        if (!r2) {
            cyaxVar2.j();
            return;
        }
        cyag cyagVar2 = cyaxVar2.b;
        cyagVar2.getClass();
        cyagVar2.g(new cyau(this), true);
    }

    @Override // defpackage.cxyp
    public final void b() {
    }
}
