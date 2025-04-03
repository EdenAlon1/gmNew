package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pzb extends otr {
    public pzb(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
    }
}
