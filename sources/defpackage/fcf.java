package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcf extends ffkk implements ffji {
    final /* synthetic */ ffix a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ich c;
    final /* synthetic */ ibx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcf(ffix ffixVar, boolean z, ich ichVar, ibx ibxVar) {
        super(1);
        this.a = ffixVar;
        this.b = z;
        this.c = ichVar;
        this.d = ibxVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        ifo ifoVar = (ifo) obj;
        ifoVar.p();
        if (((Boolean) this.a.invoke()).booleanValue()) {
            if (this.b) {
                ich ichVar = this.c;
                ibx ibxVar = this.d;
                long a = ifoVar.a();
                ifl t = ifoVar.t();
                long a2 = t.a();
                t.b().l();
                try {
                    t.c.d(-1.0f, 1.0f, a);
                    ifoVar.D(ichVar, ifu.a, ibxVar);
                } finally {
                    t.b().j();
                    t.h(a2);
                }
            } else {
                ifoVar.D(this.c, ifu.a, this.d);
            }
        }
        return ffcu.a;
    }
}
