package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ctx extends ffkk implements ffji {
    final /* synthetic */ cud a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctx(cud cudVar, long j) {
        super(1);
        this.a = cudVar;
        this.b = j;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        int ordinal = ((cst) obj).ordinal();
        long j = this.b;
        cud cudVar = this.a;
        if (ordinal == 0) {
            csd csdVar = cudVar.e.b().c;
            if (csdVar != null) {
                j = ((kaf) csdVar.b.invoke(new kaf(j))).a;
            }
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new ffcd();
            }
            csd csdVar2 = cudVar.f.b().c;
            if (csdVar2 != null) {
                j = ((kaf) csdVar2.b.invoke(new kaf(j))).a;
            }
        }
        return new kaf(j);
    }
}
