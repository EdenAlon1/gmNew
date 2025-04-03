package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtdx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtdy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtdx(dtdy dtdyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtdyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtdx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        do {
            enru enruVar = dtdy.a;
            if (!((Boolean) this.b.c.c()).booleanValue()) {
                return ffcu.a;
            }
            dtdy dtdyVar = this.b;
            dtdyVar.d.f(ernk.d(dtdyVar.e().getCurrentPosition()));
            this.a = 1;
        } while (ffsw.c(100L, this) != ffhhVar);
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtdx(this.b, ffguVar);
    }
}
