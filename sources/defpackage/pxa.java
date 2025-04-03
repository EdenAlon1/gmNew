package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pxa extends oru {
    public pxa(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.oru
    protected final /* bridge */ /* synthetic */ void b(oyf oyfVar, Object obj) {
        pwy pwyVar = (pwy) obj;
        oyfVar.g(1, pwyVar.a);
        oyfVar.g(2, pwyVar.b);
    }

    @Override // defpackage.otr
    protected final String c() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
}
