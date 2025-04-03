package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsz b;
    final /* synthetic */ fcek c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsy(cpsz cpszVar, fcek fcekVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cpszVar;
        this.c = fcekVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cpsz cpszVar = this.b;
            fcek fcekVar = this.c;
            int i2 = this.d;
            this.a = 1;
            if (cpszVar.a.p(fcekVar, i2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpsy(this.b, this.c, this.d, ffguVar);
    }
}
