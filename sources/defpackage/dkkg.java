package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkkg implements dkgk {
    final /* synthetic */ dkkj a;
    private final String b;

    public dkkg(dkkj dkkjVar, String str) {
        this.a = dkkjVar;
        this.b = str;
    }

    @Override // defpackage.dkgk
    public final void a(dkgi dkgiVar) {
        dkty.d(dkkj.B, "Reference accepted", new Object[0]);
    }

    @Override // defpackage.dkgk
    public final void c(dkgi dkgiVar, dkgj dkgjVar) {
        dkty.d(dkkj.B, "Reference delivery failed", new Object[0]);
        this.a.aK(this.b, new dkjy(dkgjVar.a, dkgjVar.getMessage()));
    }

    @Override // defpackage.dkgk
    public final void d(dkgi dkgiVar, int i, String str) {
        dkty.d(dkkj.B, "Reference delivery failed", new Object[0]);
        this.a.aK(this.b, new dkjy(i, str));
    }

    @Override // defpackage.dkgk
    public final void e() {
        dkty.d(dkkj.B, "ConferenceInvitationListener.referenceNotify", new Object[0]);
    }

    @Override // defpackage.dkgk
    public final void f() {
        dkty.d(dkkj.B, "ConferenceInvitationListener.referenceTerminated", new Object[0]);
    }
}
