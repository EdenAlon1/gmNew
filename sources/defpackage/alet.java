package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alet extends ffhv implements ffjm {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ eqkv c;
    final /* synthetic */ alex d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alet(int i, eqkv eqkvVar, alex alexVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = i;
        this.c = eqkvVar;
        this.d = alexVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alet) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dvxm a = dvxn.a(this.b);
            a.c(dvyd.b());
            eqkv eqkvVar = this.c;
            if (eqkvVar != null) {
                a.b(new dvxg(alfd.a, eqkvVar));
            }
            a.b(alfb.b(this.d.a));
            alex alexVar = this.d;
            dvxn a2 = a.a();
            this.a = 1;
            if (alexVar.c(a2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alet(this.b, this.c, this.d, ffguVar);
    }
}
