package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pyp extends otr {
    public pyp(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
    }
}
