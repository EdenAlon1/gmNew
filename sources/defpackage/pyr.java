package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pyr extends otr {
    public pyr(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
