package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swn implements ffjm {
    final /* synthetic */ sxh a;
    final /* synthetic */ fnx b;

    public swn(sxh sxhVar, fnx fnxVar) {
        this.a = sxhVar;
        this.b = fnxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            swl.b((sxg) hkf.a(this.a.a, hfdVar).a(), this.b, hfdVar, 48);
        }
        return ffcu.a;
    }
}
