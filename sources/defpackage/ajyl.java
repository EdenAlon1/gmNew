package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajyl extends ffhv implements ffjm {
    final /* synthetic */ long a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajyl(ffgu ffguVar, long j) {
        super(2, ffguVar);
        this.a = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajyl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = bxmu.a;
        bxmr bxmrVar = new bxmr();
        bxmrVar.ap("markRestoreWorkflowFileAsRestored");
        bxmv bxmvVar = bxmv.b;
        if (bxmvVar == null) {
            bxmrVar.a.putNull("status");
        } else {
            bxmrVar.a.put("status", Integer.valueOf(bxmvVar.ordinal()));
        }
        long j = this.a;
        bxmt bxmtVar = new bxmt();
        bxmtVar.aq(new dtwe("restore_workflow_files._id", 1, Long.valueOf(j)));
        return Boolean.valueOf(bxmrVar.aj(new bxms(bxmtVar), "restore_workflow_files-buildAndUpdateForId"));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajyl ajylVar = new ajyl(ffguVar, this.a);
        ajylVar.b = obj;
        return ajylVar;
    }
}
