package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjmp implements fbba {
    public static cjjt a(cjop cjopVar, cjmc cjmcVar, cjom cjomVar, cjmg cjmgVar, cjmy cjmyVar, cjnf cjnfVar, cjmv cjmvVar, cjly cjlyVar, autj autjVar) {
        autjVar.getClass();
        cjjv cjjvVar = new cjjv("RequestToSendPhase");
        fffs fffsVar = new fffs((byte[]) null);
        fffsVar.add(cjomVar);
        fffsVar.add(cjmgVar);
        fffsVar.add(cjmyVar);
        fffsVar.add(cjnfVar);
        fffsVar.add(cjopVar);
        return new cjjx(new cjjv("SendingPipeline"), ffdx.g(new cjjx(cjjvVar, ffdx.a(fffsVar)), new cjjx(new cjjv("ProcessMessageStatusPhase"), ffdx.g(cjmcVar, cjmvVar)), new cjjx(new cjjv("ProcessPipelineResultPhase"), ffdx.b(cjlyVar))));
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
