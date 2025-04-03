package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmim extends ffkk implements ffjo {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ eey c;
    final /* synthetic */ dmip d;
    final /* synthetic */ hho e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmim(List list, int i, eey eeyVar, dmip dmipVar, hho hhoVar) {
        super(4);
        this.a = list;
        this.b = i;
        this.c = eeyVar;
        this.d = dmipVar;
        this.e = hhoVar;
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
            hfdVar.v(-1327835697);
            Integer b = dmin.b(this.e);
            dmio.b(b != null ? b.intValue() : this.b, this.c, this.d.a, intValue, hfdVar, ((i & 126) << 6) & 7168);
            hfdVar.o();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
