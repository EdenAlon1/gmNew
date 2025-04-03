package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dem extends ffkk implements ffji {
    final /* synthetic */ iam a;
    final /* synthetic */ fflb b;
    final /* synthetic */ long c;
    final /* synthetic */ ibx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dem(iam iamVar, fflb fflbVar, long j, ibx ibxVar) {
        super(1);
        this.a = iamVar;
        this.b = fflbVar;
        this.c = j;
        this.d = ibxVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        ifo ifoVar = (ifo) obj;
        ifoVar.p();
        ifn ifnVar = ifoVar.t().c;
        iam iamVar = this.a;
        float f = iamVar.b;
        float f2 = iamVar.c;
        ifnVar.e(f, f2);
        ibx ibxVar = this.d;
        float f3 = -f2;
        float f4 = -f;
        try {
            ifq.l(ifoVar, (ich) this.b.a, this.c, 0L, 0.0f, ibxVar, 0, 890);
            ifoVar.t().c.e(f4, f3);
            return ffcu.a;
        } catch (Throwable th) {
            ifoVar.t().c.e(f4, f3);
            throw th;
        }
    }
}
