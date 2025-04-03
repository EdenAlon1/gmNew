package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvb extends ffkk implements ffji {
    final /* synthetic */ ioc a;
    final /* synthetic */ icv b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvb(ioc iocVar, icv icvVar, long j) {
        super(1);
        this.a = iocVar;
        this.b = icvVar;
        this.c = j;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ifo ifoVar = (ifo) obj;
        if (this.a != null) {
            ifoVar.p();
            ifq.h(ifoVar, this.b, this.c, null, 60);
        }
        return ffcu.a;
    }
}
