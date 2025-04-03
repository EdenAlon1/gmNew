package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cua extends ffkk implements ffji {
    final /* synthetic */ cud a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cua(cud cudVar, long j) {
        super(1);
        this.a = cudVar;
        this.b = j;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        long j;
        long j2;
        cud cudVar = this.a;
        cst cstVar = (cst) obj;
        cxa cxaVar = cudVar.e.b().b;
        long j3 = this.b;
        long j4 = 0;
        if (cxaVar != null) {
            j = ((kaa) cxaVar.a.invoke(new kaf(j3))).a;
        } else {
            j = 0;
        }
        cxa cxaVar2 = cudVar.f.b().b;
        if (cxaVar2 != null) {
            j2 = ((kaa) cxaVar2.a.invoke(new kaf(j3))).a;
        } else {
            j2 = 0;
        }
        int ordinal = cstVar.ordinal();
        if (ordinal == 0) {
            j4 = j;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new ffcd();
            }
            j4 = j2;
        }
        return new kaa(j4);
    }
}
