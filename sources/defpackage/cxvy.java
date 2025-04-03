package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxvy implements ellh {
    final /* synthetic */ cxtc a;

    public cxvy(cxtc cxtcVar) {
        this.a = cxtcVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        boolean booleanValue = ((Boolean) cnvu.a.e()).booleanValue();
        cxvv cxvvVar = this.a.c;
        if (!booleanValue) {
            if (cxvvVar.W()) {
                cxvvVar.D = true;
            }
            cxvvVar.O(true);
            cxvvVar.S();
            if (!cxvvVar.B) {
                cxvvVar.ak(false);
            }
            return elli.b;
        }
        if (cxvvVar.B) {
            return elli.a;
        }
        ((adsd) cxvvVar.af.b()).a(21);
        cxvvVar.w();
        if (!cxvvVar.af()) {
            return new elli(new aktv());
        }
        cxvvVar.ak(!((bcvr) cxvvVar.g().a()).Z());
        return elli.a;
    }
}
