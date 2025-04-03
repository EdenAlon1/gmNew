package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwg implements ellh {
    final /* synthetic */ vvn a;

    public vwg(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final cvmt cvmtVar = (cvmt) ellfVar;
        String c = cvmtVar.c();
        String b = cvmtVar.b();
        Runnable runnable = new Runnable() { // from class: vse
            @Override // java.lang.Runnable
            public final void run() {
                enru enruVar = vvn.a;
                cvmt.this.a().run();
            }
        };
        cvmtVar.d();
        this.a.aH(c, b, runnable, false);
        return elli.a;
    }
}
