package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dak extends ffkk implements ffji {
    final /* synthetic */ fflb a;
    final /* synthetic */ Object b;
    final /* synthetic */ cxq c;
    final /* synthetic */ cyb d;
    final /* synthetic */ cxv e;
    final /* synthetic */ float f;
    final /* synthetic */ ffji g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dak(fflb fflbVar, Object obj, cxq cxqVar, cyb cybVar, cxv cxvVar, float f, ffji ffjiVar) {
        super(1);
        this.a = fflbVar;
        this.b = obj;
        this.c = cxqVar;
        this.d = cybVar;
        this.e = cxvVar;
        this.f = f;
        this.g = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        cxq cxqVar = this.c;
        dbv c = cxqVar.c();
        cxqVar.g();
        cxs cxsVar = new cxs(this.b, c, this.d, longValue, longValue, new daj(this.e));
        dap.e(cxsVar, longValue, this.f, this.c, this.e, this.g);
        this.a.a = cxsVar;
        return ffcu.a;
    }
}
