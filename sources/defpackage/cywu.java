package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cywu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cywx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cywu(cywx cywxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cywxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cywu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.g.c.f(cyxc.d);
            this.a = 1;
            if (ffsw.c(150L, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.g.c.f(cyxc.e);
        this.b.g.b.f(null);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cywu(this.b, ffguVar);
    }
}
