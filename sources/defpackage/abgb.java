package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgb extends ffkk implements ffjo {
    final /* synthetic */ List a;
    final /* synthetic */ hho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abgb(List list, hho hhoVar) {
        super(4);
        this.a = list;
        this.b = hhoVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5 = (edi) obj;
        int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        boolean z = true;
        if ((intValue2 & 6) == 0) {
            i = (true != hfdVar.D(obj5) ? 2 : 4) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= true != hfdVar.B(intValue) ? 16 : 32;
        }
        if (hfdVar.J((i & 147) != 146, i & 1)) {
            abft abftVar = (abft) this.a.get(intValue);
            hfdVar.v(-1423745479);
            String str = abftVar.a;
            String str2 = abftVar.b;
            dmzz dmzzVar = abftVar.d;
            boolean z2 = intValue == ((Number) this.b.a()).intValue();
            hfdVar.v(-461561942);
            if ((((i & 112) ^ 48) <= 32 || !hfdVar.B(intValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean F = hfdVar.F(abftVar) | z;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new abfz(intValue, abftVar, this.b);
                hfdVar.y(f);
            }
            hfdVar.o();
            dnhz.a(new dnia(str, str2, dmzzVar, z2, (ffix) f), null, hfdVar, 0, 2);
            hfdVar.o();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
