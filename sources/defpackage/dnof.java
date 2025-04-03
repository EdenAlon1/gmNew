package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnof implements ipn {
    final /* synthetic */ hho a;
    final /* synthetic */ hho b;

    public dnof(hho hhoVar, hho hhoVar2) {
        this.a = hhoVar;
        this.b = hhoVar2;
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
        ipqVar.getClass();
        if (list.size() != 2) {
            throw new IllegalArgumentException("TransitionBubble should contain exactly 2 children.");
        }
        final iqk e = ((ipl) list.get(0)).e(j);
        iqk e2 = ((ipl) list.get(1)).e(j);
        if (dnon.c(this.a) == 0 && dnon.e(this.b) == 0) {
            this.a.b(Integer.valueOf(e.b));
            this.b.b(Integer.valueOf(e2.b));
        }
        ei = ipqVar.ei(e.a, e.b, ffem.a, new ffji() { // from class: dnoe
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                iqj iqjVar = (iqj) obj;
                iqjVar.getClass();
                iqjVar.e(iqk.this, 0, 0, 0.0f);
                return ffcu.a;
            }
        });
        return ei;
    }
}
