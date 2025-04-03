package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsve implements ipn {
    final /* synthetic */ hho a;
    final /* synthetic */ kgq b;
    final /* synthetic */ kgj c;
    final /* synthetic */ hho d;

    public dsve(hho hhoVar, kgq kgqVar, kgj kgjVar, hho hhoVar2) {
        this.a = hhoVar;
        this.b = kgqVar;
        this.c = kgjVar;
        this.d = hhoVar2;
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int a(iny inyVar, List list, int i) {
        return ipm.a(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int b(iny inyVar, List list, int i) {
        return ipm.b(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int c(iny inyVar, List list, int i) {
        return ipm.c(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int d(iny inyVar, List list, int i) {
        return ipm.d(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        ipo ei;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a.a();
        long d = this.b.d(j, ipqVar.q(), this.c, list, linkedHashMap);
        this.d.a();
        ei = ipqVar.ei(kaf.b(d), kaf.a(d), ffem.a, new dsvd(this.b, list, linkedHashMap));
        return ei;
    }
}
