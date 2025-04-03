package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsea extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsed b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsea(dsed dsedVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsedVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsea) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (this.b.aF != 3) {
                this.b.aF = 2;
                return ffcu.a;
            }
            if (dsed.bm(this.b).d) {
                dsed dsedVar = this.b;
                this.a = 1;
                if (dsedVar.bp(this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        }
        this.b.bw();
        this.b.bJ();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsea(this.b, ffguVar);
    }
}
