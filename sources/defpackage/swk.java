package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swk extends ffkk implements ffjo {
    final /* synthetic */ List a;
    final /* synthetic */ fnx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swk(List list, fnx fnxVar) {
        super(4);
        this.a = list;
        this.b = fnxVar;
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
            sxc sxcVar = (sxc) this.a.get(intValue);
            hfdVar.v(-960229200);
            svw.a(sxcVar, this.b, hfdVar, 0);
            hfdVar.o();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
