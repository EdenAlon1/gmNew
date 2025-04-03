package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pze extends otr {
    public pze(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
    }
}
