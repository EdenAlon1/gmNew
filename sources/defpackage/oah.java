package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oah extends ffkk implements ffji {
    final /* synthetic */ oaj a;
    final /* synthetic */ nzr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oah(oaj oajVar, nzr nzrVar) {
        super(1);
        this.a = oajVar;
        this.b = nzrVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        nzh c;
        nxm nxmVar = (nxm) obj;
        nxmVar.getClass();
        nzh nzhVar = nxmVar.b;
        if (true != (nzhVar instanceof nzh)) {
            nzhVar = null;
        }
        if (nzhVar == null || (c = this.a.c(nzhVar, nxmVar.a(), this.b)) == null) {
            return null;
        }
        return ffkj.e(c, nzhVar) ? nxmVar : this.a.f().a(c, c.c(nxmVar.a()));
    }
}
