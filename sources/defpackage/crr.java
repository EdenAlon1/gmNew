package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class crr extends ffkk implements ffjn {
    final /* synthetic */ ffji a;
    final /* synthetic */ dbe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crr(ffji ffjiVar, dbe dbeVar) {
        super(3);
        this.a = ffjiVar;
        this.b = dbeVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j;
        ipo ei;
        ipq ipqVar = (ipq) obj;
        iqk e = ((ipl) obj2).e(((jzk) obj3).a);
        if (!ipqVar.eu() || ((Boolean) this.a.invoke(this.b.f())).booleanValue()) {
            j = (e.a << 32) | (e.b & 4294967295L);
        } else {
            j = 0;
        }
        ei = ipqVar.ei((int) (j >> 32), (int) (4294967295L & j), ffem.a, new crq(e));
        return ei;
    }
}
