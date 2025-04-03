package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class days extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dayt b;
    final /* synthetic */ cskc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public days(dayt daytVar, cskc cskcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = daytVar;
        this.c = cskcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((days) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bqwn a = bqws.a();
            a.z("logLocalCmsKeys");
            engw y = a.b().y();
            dayt daytVar = this.b;
            cskc cskcVar = this.c;
            ffhd a2 = ekxi.a(daytVar.f);
            dayr dayrVar = new dayr(null, cskcVar, y);
            this.a = 1;
            if (ffra.a(a2, dayrVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new days(this.b, this.c, ffguVar);
    }
}
