package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pyq extends otr {
    public pyq(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
}
