package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eve implements ipn {
    public final ffix a;

    public eve(ffix ffixVar) {
        this.a = ffixVar;
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
        ei = ipqVar.ei(jzk.b(j), jzk.a(j), ffem.a, new evd(list, this));
        return ei;
    }
}
