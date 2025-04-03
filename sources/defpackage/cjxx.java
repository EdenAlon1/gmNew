package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjxx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjxz b;
    final /* synthetic */ cjyb c;
    final /* synthetic */ eiks d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxx(cjxz cjxzVar, cjyb cjybVar, eiks eiksVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjxzVar;
        this.c = cjybVar;
        this.d = eiksVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjxz cjxzVar = this.b;
            cjyb cjybVar = this.c;
            cjzb cjzbVar = cjybVar.b == 1 ? (cjzb) cjybVar.c : cjzb.a;
            cjzbVar.getClass();
            eiks eiksVar = this.d;
            this.a = 1;
            if (cjxzVar.c(cjzbVar, eiksVar.c, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjxx(this.b, this.c, this.d, ffguVar);
    }
}
