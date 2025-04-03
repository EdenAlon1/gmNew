package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ctz extends ffkk implements ffji {
    final /* synthetic */ cud a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctz(cud cudVar, long j) {
        super(1);
        this.a = cudVar;
        this.b = j;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        int ordinal;
        cud cudVar = this.a;
        cst cstVar = (cst) obj;
        long j = 0;
        if (cudVar.h != null && cudVar.a() != null && !ffkj.e(cudVar.h, cudVar.a()) && (ordinal = cstVar.ordinal()) != 0 && ordinal != 1) {
            if (ordinal != 2) {
                throw new ffcd();
            }
            csd csdVar = cudVar.f.b().c;
            if (csdVar != null) {
                long j2 = this.b;
                long j3 = ((kaf) csdVar.b.invoke(new kaf(j2))).a;
                huo a = cudVar.a();
                a.getClass();
                long a2 = a.a(j2, j3, kah.a);
                huo huoVar = cudVar.h;
                huoVar.getClass();
                j = kaa.c(a2, huoVar.a(j2, j3, kah.a));
            }
        }
        return new kaa(j);
    }
}
