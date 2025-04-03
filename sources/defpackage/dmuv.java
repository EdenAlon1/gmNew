package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmuv extends ffkk implements ffjo {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmuv(List list) {
        super(4);
        this.a = list;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        edi ediVar = (edi) obj;
        int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (true != hfdVar.D(ediVar) ? 2 : 4) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= true != hfdVar.B(intValue) ? 16 : 32;
        }
        if (hfdVar.J((i & 147) != 146, i & 1)) {
            dndt dndtVar = (dndt) this.a.get(intValue);
            hfdVar.v(-998476437);
            dnds.a(dndtVar, null, hfdVar, 0, 2);
            hfdVar.o();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
