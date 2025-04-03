package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqfa implements cqem {
    private static final cskc b = cskc.g("Bugle", "PwqForwardSyncEngineStarter");
    public final ffbr a;
    private final ffhd c;

    public cqfa(ffbr ffbrVar, ffhd ffhdVar) {
        ffbrVar.getClass();
        ffhdVar.getClass();
        this.a = ffbrVar;
        this.c = ffhdVar;
    }

    @Override // defpackage.cqem
    public final Object a(cqgj cqgjVar, eqqh eqqhVar, ffgu ffguVar) {
        eyee eyeeVar;
        if (cqgjVar == null && eqqhVar == null) {
            b.p("PwqForwardSyncEngine started without an explicit request.");
        } else {
            cskc cskcVar = b;
            int a = cqgjVar != null ? cqjd.a(cqgjVar) : 0;
            cskcVar.p("Starting PwqForwardSyncEngine for request: \nSyncType: [" + ((Object) cqjc.a(a)) + "]\nSyncReason: [" + (eqqhVar != null ? eqqhVar.name() : null) + "]\nSyncId: [" + ((cqgjVar == null || (eyeeVar = cqgjVar.e) == null) ? null : cqjf.b(eyeeVar)) + "]");
        }
        Object a2 = ffra.a(ekxi.a(this.c), new cqez(null, this), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }
}
