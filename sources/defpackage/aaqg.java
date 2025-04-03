package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaqg implements ffjn {
    final /* synthetic */ zsn a;

    public aaqg(zsn zsnVar) {
        this.a = zsnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        eqd eqdVar = (eqd) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        eqdVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(eqdVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            zsn zsnVar = this.a;
            zta.a(zsnVar.b, eqdVar, null, zsnVar.a.f, null, hfdVar, (intValue << 3) & 112, 20);
        }
        return ffcu.a;
    }
}
