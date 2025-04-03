package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zoo implements ffjo {
    final /* synthetic */ aave a;

    public zoo(aave aaveVar) {
        this.a = aaveVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        ((edi) obj).getClass();
        if ((intValue2 & 48) == 0) {
            intValue2 |= true != hfdVar.B(intValue) ? 16 : 32;
        }
        if ((intValue2 & 145) == 144 && hfdVar.I()) {
            hfdVar.s();
        } else {
            aavi.a((aavf) this.a.a.get(intValue), hfdVar, 0);
        }
        return ffcu.a;
    }
}
