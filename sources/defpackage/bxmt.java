package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxmt extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bxms(this);
    }

    public final void b(bxmw bxmwVar) {
        aq(new dtwe("restore_workflow_files.file_type", 1, Integer.valueOf(bxmwVar == null ? 0 : bxmwVar.ordinal())));
    }

    public final void c(long j) {
        aq(new dtwe("restore_workflow_files.workflow_execution_id", 1, Long.valueOf(j)));
    }
}
