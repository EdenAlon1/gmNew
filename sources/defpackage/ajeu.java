package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajeu implements ffjm {
    final /* synthetic */ ffbr a;
    final /* synthetic */ ajev b;

    public ajeu(ffbr ffbrVar, ajev ajevVar) {
        this.a = ffbrVar;
        this.b = ajevVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cwoi.a(null, null, false, null, false, hpx.d(289604561, new ajet(this.a, this.b), hfdVar), hfdVar, 196608, 31);
        }
        return ffcu.a;
    }
}
