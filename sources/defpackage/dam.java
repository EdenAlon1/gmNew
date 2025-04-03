package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dam extends ffkk implements ffji {
    final /* synthetic */ fflb a;
    final /* synthetic */ float b;
    final /* synthetic */ cxq c;
    final /* synthetic */ cxv d;
    final /* synthetic */ ffji e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dam(fflb fflbVar, float f, cxq cxqVar, cxv cxvVar, ffji ffjiVar) {
        super(1);
        this.a = fflbVar;
        this.b = f;
        this.c = cxqVar;
        this.d = cxvVar;
        this.e = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.a.a;
        obj2.getClass();
        dap.e((cxs) obj2, longValue, this.b, this.c, this.d, this.e);
        return ffcu.a;
    }
}
