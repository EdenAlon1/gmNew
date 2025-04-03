package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxvx implements ellh {
    final /* synthetic */ cxtc a;

    public cxvx(cxtc cxtcVar) {
        this.a = cxtcVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        cxtc cxtcVar = this.a;
        ((alrv) cxtcVar.b.b()).e(alrv.c);
        boolean booleanValue = ((Boolean) cpev.k.e()).booleanValue();
        cxvv cxvvVar = cxtcVar.c;
        if (booleanValue) {
            ((cpev) cxvvVar.al.b()).h(cpeu.SEND_BUTTON_ACCURATE);
        }
        cxvvVar.D = false;
        if (cxvvVar.ad()) {
            return elli.b;
        }
        cxvvVar.G = true;
        if (cxvvVar.B) {
            cxvvVar.ak(false);
        } else {
            cxvvVar.ai(true, true, true != cxvvVar.aa() ? 1 : 2);
        }
        return elli.a;
    }
}
