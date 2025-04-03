package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iok extends ffkk implements ffjm {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iok(List list) {
        super(2);
        this.a = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        if (hfdVar.J((intValue & 3) != 2, intValue & 1)) {
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ffjm ffjmVar = (ffjm) list.get(i);
                int a = hey.a(hfdVar);
                int i2 = ist.a;
                ffix ffixVar = iss.b;
                hfdVar.M();
                hfdVar.x();
                if (hfdVar.H()) {
                    hfdVar.j(ffixVar);
                } else {
                    hfdVar.z();
                }
                ffjm ffjmVar2 = iss.f;
                if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a))) {
                    Integer valueOf = Integer.valueOf(a);
                    hfdVar.y(valueOf);
                    hfdVar.h(valueOf, ffjmVar2);
                }
                ffjmVar.a(hfdVar, 0);
                hfdVar.n();
            }
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
