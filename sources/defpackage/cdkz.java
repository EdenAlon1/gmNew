package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdkz extends ffhv implements ffji {
    int a;
    final /* synthetic */ cdlb b;
    final /* synthetic */ cejh c;
    final /* synthetic */ ceuw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdkz(cdlb cdlbVar, cejh cejhVar, ceuw ceuwVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cdlbVar;
        this.c = cejhVar;
        this.d = ceuwVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cdlb cdlbVar = this.b;
        cejh cejhVar = this.c;
        String str = cejhVar.d;
        str.getClass();
        ceuw ceuwVar = this.d;
        int i2 = cejhVar.c;
        this.a = 1;
        Object c = cdlbVar.c(str, i2, ceuwVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cdkz(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
