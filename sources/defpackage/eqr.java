package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqr extends ffkk implements ffji {
    final /* synthetic */ float a;
    final /* synthetic */ ich b;
    final /* synthetic */ ibx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqr(float f, ich ichVar, ibx ibxVar) {
        super(1);
        this.a = f;
        this.b = ichVar;
        this.c = ibxVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        ifo ifoVar = (ifo) obj;
        ifoVar.p();
        ifl t = ifoVar.t();
        long a = t.a();
        t.b().l();
        ich ichVar = this.b;
        ibx ibxVar = this.c;
        float f = this.a;
        try {
            ifn ifnVar = t.c;
            ifnVar.e(f, 0.0f);
            ifnVar.c(45.0f, 0L);
            ifoVar.D(ichVar, ifu.a, ibxVar);
            t.b().j();
            t.h(a);
            return ffcu.a;
        } catch (Throwable th) {
            t.b().j();
            t.h(a);
            throw th;
        }
    }
}
