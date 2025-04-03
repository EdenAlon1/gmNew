package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtlc extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ dtld b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtlc(dtld dtldVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtldVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtlc) c((dtjb) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dtjb dtjbVar = (dtjb) this.a;
        if (dtjbVar == dtjb.b) {
            dtld dtldVar = this.b;
            dteg dtegVar = (dteg) dteh.a.createBuilder();
            dtegVar.getClass();
            dtldVar.f.f(dtei.a(dtegVar));
        }
        this.b.c(dtjbVar);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dtlc dtlcVar = new dtlc(this.b, ffguVar);
        dtlcVar.a = obj;
        return dtlcVar;
    }
}
