package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pyo extends otr {
    public pyo(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
    }
}
