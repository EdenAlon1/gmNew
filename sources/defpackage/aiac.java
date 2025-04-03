package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiac implements ffjo {
    final /* synthetic */ olu a;

    public aiac(olu oluVar) {
        this.a = oluVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        aiaz aiazVar;
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
            aiar aiarVar = (aiar) this.a.f(intValue);
            if (aiarVar != null) {
                hfdVar.v(618538278);
                olu oluVar = this.a;
                if (intValue > 0) {
                    aiar aiarVar2 = (aiar) oluVar.g(intValue - 1);
                    aiazVar = aiarVar2 != null ? new aiaw(aiarVar2.c) : aiay.a;
                } else {
                    aiazVar = aiax.a;
                }
                aiav.b(aiarVar, aiazVar, hfdVar, 0);
                hfdVar.o();
            } else {
                hfdVar.v(618964528);
                aiav.a(hfdVar, 0);
                hfdVar.o();
            }
        }
        return ffcu.a;
    }
}
