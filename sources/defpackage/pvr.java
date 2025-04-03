package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pvr extends ffkk implements ffix {
    final /* synthetic */ pvu a;
    final /* synthetic */ pvs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvr(pvu pvuVar, pvs pvsVar) {
        super(0);
        this.a = pvuVar;
        this.b = pvsVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        pwl pwlVar = this.a.a;
        Object obj = pwlVar.b;
        pvs pvsVar = this.b;
        synchronized (obj) {
            if (pwlVar.c.remove(pvsVar) && pwlVar.c.isEmpty()) {
                pwlVar.e();
            }
        }
        return ffcu.a;
    }
}
