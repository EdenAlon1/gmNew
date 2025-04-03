package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pzf extends otr {
    public pzf(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
