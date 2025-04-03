package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyaw implements cxyp {
    final /* synthetic */ engw a;
    final /* synthetic */ cyax b;

    public cyaw(cyax cyaxVar, engw engwVar) {
        this.a = engwVar;
        this.b = cyaxVar;
    }

    @Override // defpackage.cxyp
    public final void a(cxyq cxyqVar) {
        cyax.e(this.b.c).getClass();
        cyag cyagVar = this.b.b;
        if (cyagVar != null) {
            cyagVar.b();
            cyax cyaxVar = this.b;
            cyaxVar.a.remove(cyaxVar.b);
        }
        this.b.f(this.a);
        cyax cyaxVar2 = this.b;
        cyaxVar2.c = this.a;
        cyaxVar2.j();
    }

    @Override // defpackage.cxyp
    public final void b() {
        cyax.e(this.b.c).getClass();
    }
}
