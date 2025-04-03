package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsy extends ffhv implements ffji {
    int a;
    final /* synthetic */ ftb b;
    final /* synthetic */ float c;
    final /* synthetic */ cxt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsy(ftb ftbVar, float f, cxt cxtVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = ftbVar;
        this.c = f;
        this.d = cxtVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ftb ftbVar = this.b;
        float f = this.c;
        cxj cxjVar = ftbVar.e;
        Float f2 = new Float(f);
        cxt cxtVar = this.d;
        this.a = 1;
        Object j = cxj.j(cxjVar, f2, cxtVar, null, this, 12);
        return j == ffhhVar ? ffhhVar : j;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new fsy(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
