package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pys extends otr {
    public pys(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
