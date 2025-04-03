package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ejk extends ffkk implements ffji {
    final /* synthetic */ ekh a;
    final /* synthetic */ ejc b;
    final /* synthetic */ irf c;
    final /* synthetic */ elx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejk(ekh ekhVar, ejc ejcVar, irf irfVar, elx elxVar) {
        super(1);
        this.a = ekhVar;
        this.b = ejcVar;
        this.c = irfVar;
        this.d = elxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        elu eluVar = new elu(this.b, this.c, this.d);
        ekh ekhVar = this.a;
        ekhVar.c = eluVar;
        return new ejj(ekhVar);
    }
}
