package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dej extends ffkk implements ffji {
    final /* synthetic */ ibq a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ ifs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dej(ibq ibqVar, long j, long j2, ifs ifsVar) {
        super(1);
        this.a = ibqVar;
        this.b = j;
        this.c = j2;
        this.d = ifsVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ifo ifoVar = (ifo) obj;
        ifoVar.p();
        ifq.i(ifoVar, this.a, this.b, this.c, 0.0f, this.d, 0, 104);
        return ffcu.a;
    }
}
