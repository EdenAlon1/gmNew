package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pxv extends oru {
    public pxv(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.oru
    protected final /* bridge */ /* synthetic */ void b(oyf oyfVar, Object obj) {
        pxt pxtVar = (pxt) obj;
        oyfVar.g(1, pxtVar.a);
        oyfVar.g(2, pxtVar.b);
    }

    @Override // defpackage.otr
    protected final String c() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }
}
