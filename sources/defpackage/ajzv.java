package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajzv extends ffhv implements ffjm {
    private /* synthetic */ Object a;

    public ajzv(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajzv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = bqea.a;
        bqdv bqdvVar = new bqdv(bqea.a);
        bqdvVar.z("BasicRestoreWorkflowSteps#getRestoredMessageCount");
        bqdvVar.d(ajzw.a);
        return new Integer(bqdvVar.b().i());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajzv ajzvVar = new ajzv(ffguVar);
        ajzvVar.a = obj;
        return ajzvVar;
    }
}
