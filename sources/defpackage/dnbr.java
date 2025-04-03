package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnbr implements ffjm {
    final /* synthetic */ dnbm a;
    final /* synthetic */ Object b;
    final /* synthetic */ eqd c;
    final /* synthetic */ inp d;

    public dnbr(dnbm dnbmVar, Object obj, eqd eqdVar, inp inpVar) {
        this.a = dnbmVar;
        this.b = obj;
        this.c = eqdVar;
        this.d = inpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnbu.d(this.a, this.b, this.c, this.d, hfdVar, 0);
        }
        return ffcu.a;
    }
}
