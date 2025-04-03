package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaoe implements ffjm {
    final /* synthetic */ aapj a;
    final /* synthetic */ eqd b;
    final /* synthetic */ Object c;

    public aaoe(aapj aapjVar, eqd eqdVar, Object obj) {
        this.a = aapjVar;
        this.b = eqdVar;
        this.c = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            new hpw(-710761612, true, new aapl((aapm) hfdVar.e(aaof.a))).f(this.a, this.b, this.c, hfdVar, 0);
        }
        return ffcu.a;
    }
}
