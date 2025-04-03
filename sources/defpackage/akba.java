package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akba extends ffhv implements ffjm {
    private /* synthetic */ Object a;

    public akba(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akba) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = bqea.a;
        bqdv bqdvVar = new bqdv(bqea.a);
        bqdvVar.z("RestoreAnytimeCompatibleRestoreWorkflowSteps#getRestoredMessageCount");
        bqdvVar.d(akbb.a);
        return new Integer(bqdvVar.b().i());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akba akbaVar = new akba(ffguVar);
        akbaVar.a = obj;
        return akbaVar;
    }
}
