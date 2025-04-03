package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddla extends ddlc {
    private ddlo a;

    @Override // defpackage.ddlc
    public final ddld a() {
        ddlo ddloVar = this.a;
        if (ddloVar != null) {
            return new ddlb(ddloVar);
        }
        throw new IllegalStateException("Missing required properties: reminderDialogData");
    }

    @Override // defpackage.ddlc
    public final void b(ddlo ddloVar) {
        if (ddloVar == null) {
            throw new NullPointerException("Null reminderDialogData");
        }
        this.a = ddloVar;
    }
}
