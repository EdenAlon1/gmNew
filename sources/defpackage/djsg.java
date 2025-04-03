package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djsg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ djsh b;
    final /* synthetic */ cosz c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djsg(ffgu ffguVar, djsh djshVar, cosz coszVar) {
        super(2, ffguVar);
        this.b = djshVar;
        this.c = coszVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djsg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            djsh djshVar = this.b;
            String str = this.c.c;
            str.getClass();
            this.a = 1;
            obj = ffra.a(ekxi.a(djshVar.f), new djsb(null, djshVar, str), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Boolean.valueOf(obj == eqwf.AVAILABLE);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        djsg djsgVar = new djsg(ffguVar, this.b, this.c);
        djsgVar.d = obj;
        return djsgVar;
    }
}
