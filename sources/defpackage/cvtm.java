package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvtm implements ffjo {
    final /* synthetic */ olu a;

    public cvtm(olu oluVar) {
        this.a = oluVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cvup cvupVar;
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
            cvud cvudVar = (cvud) this.a.f(intValue);
            if (cvudVar != null) {
                hfdVar.v(1347505535);
                olu oluVar = this.a;
                cvug a = cvudVar.a();
                if (intValue > 0) {
                    cvud cvudVar2 = (cvud) oluVar.g(intValue - 1);
                    cvupVar = cvudVar2 != null ? new cvum(cvudVar2.a().c) : cvuo.a;
                } else {
                    cvupVar = cvun.a;
                }
                cvuk.b(a, cvupVar, hfdVar, 0);
                hfdVar.o();
            } else {
                hfdVar.v(1347934668);
                cvuk.a(hfdVar, 0);
                hfdVar.o();
            }
        }
        return ffcu.a;
    }
}
