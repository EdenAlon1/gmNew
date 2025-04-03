package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfk extends ffkk implements ffjo {
    final /* synthetic */ List a;
    final /* synthetic */ abfc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abfk(List list, abfc abfcVar) {
        super(4);
        this.a = list;
        this.b = abfcVar;
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
            zdq zdqVar = (zdq) this.a.get(intValue);
            hfdVar.v(750628908);
            if (zdqVar.c.isEmpty()) {
                hfdVar.v(750657613);
                abfl.b(zdqVar, this.b.b, hfdVar, 0);
                hfdVar.o();
            } else {
                hfdVar.v(750747110);
                abfl.a(zdqVar, this.b.b, hfdVar, 0);
                hfdVar.o();
            }
            hfdVar.o();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
