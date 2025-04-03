package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akaw extends ffhv implements ffjm {
    private /* synthetic */ Object a;

    public akaw(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akaw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = bqea.a;
        bqdv bqdvVar = new bqdv(bqea.a);
        bqdvVar.z("RestoreAnytimeCompatibleRestoreWorkflowSteps#getRestoredMessageCount");
        bqdvVar.d(akax.a);
        return new Integer(bqdvVar.b().i());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akaw akawVar = new akaw(ffguVar);
        akawVar.a = obj;
        return akawVar;
    }
}
