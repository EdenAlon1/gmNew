package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pxo extends otr {
    public pxo(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
}
