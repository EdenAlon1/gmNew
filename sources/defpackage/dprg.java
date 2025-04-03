package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dprg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dprt b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dprg(dprt dprtVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dprtVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dprg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dprt dprtVar = this.b;
            int i2 = this.c;
            this.a = 1;
            dprw dprwVar = dprtVar.h;
            Object a = ffra.a(dprwVar.a.hT(), new dprv(dprwVar, i2, null), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dprg(this.b, this.c, ffguVar);
    }
}
