package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pyn extends otr {
    public pyn(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}
