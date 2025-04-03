package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pzl extends otr {
    public pzl(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "DELETE FROM worktag WHERE work_spec_id=?";
    }
}
