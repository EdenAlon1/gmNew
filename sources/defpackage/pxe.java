package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pxe extends oru {
    public pxe(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.oru
    protected final /* bridge */ /* synthetic */ void b(oyf oyfVar, Object obj) {
        pxc pxcVar = (pxc) obj;
        oyfVar.g(1, pxcVar.a);
        oyfVar.e(2, pxcVar.b.longValue());
    }

    @Override // defpackage.otr
    protected final String c() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }
}
