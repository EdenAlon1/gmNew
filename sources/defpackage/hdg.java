package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hdg extends ffkk implements ffjn {
    final /* synthetic */ ffix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdg(ffix ffixVar) {
        super(3);
        this.a = ffixVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ipo ei;
        ipq ipqVar = (ipq) obj;
        ipl iplVar = (ipl) obj2;
        long j = ((jzk) obj3).a;
        float f = ((jzq) this.a.invoke()).a;
        iqk e = iplVar.e(jzk.m(j, 0, 0, jzl.b(j, !jzq.b(f, Float.NaN) ? ipqVar.eo(f) : 0), 0, 11));
        ei = ipqVar.ei(e.a, e.b, ffem.a, new hdf(e));
        return ei;
    }
}
