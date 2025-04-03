package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dusw implements erqj {
    final /* synthetic */ dutb a;

    public dusw(dutb dutbVar) {
        this.a = dutbVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        engw engwVar = (engw) obj;
        dusd dusdVar = this.a.z;
        if (dusdVar != null) {
            dusdVar.q.d(0, engwVar);
            dusdVar.n.remove(Integer.valueOf(dusdVar.m));
            dusdVar.u(0, dusdVar.F(0));
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}
