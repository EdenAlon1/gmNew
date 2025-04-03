package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pya extends otr {
    public pya(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "DELETE from WorkProgress where work_spec_id=?";
    }
}
