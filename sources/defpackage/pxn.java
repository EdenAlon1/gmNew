package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pxn extends oru {
    public pxn(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.oru
    protected final /* bridge */ /* synthetic */ void b(oyf oyfVar, Object obj) {
        oyfVar.g(1, ((pxk) obj).a);
        oyfVar.e(2, r5.b);
        oyfVar.e(3, r5.c);
    }

    @Override // defpackage.otr
    protected final String c() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }
}
