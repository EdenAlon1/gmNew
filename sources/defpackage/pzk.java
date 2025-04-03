package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pzk extends oru {
    public pzk(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.oru
    protected final /* bridge */ /* synthetic */ void b(oyf oyfVar, Object obj) {
        pzi pziVar = (pzi) obj;
        oyfVar.g(1, pziVar.a);
        oyfVar.g(2, pziVar.b);
    }

    @Override // defpackage.otr
    protected final String c() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }
}
