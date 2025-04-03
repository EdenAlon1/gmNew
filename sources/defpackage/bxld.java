package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxld extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bxlc(this);
    }

    public final void b(Optional optional) {
        aq(new dtrt("restore_workflow_executions.session_id", 1, bdhj.b(optional)));
    }

    public final void c(akci akciVar) {
        aq(new dtwe("restore_workflow_executions.status", 1, Integer.valueOf(akciVar == null ? 0 : akciVar.q)));
    }
}
