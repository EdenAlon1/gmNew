package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwpt implements ctuj {
    final /* synthetic */ cwpv a;

    public cwpt(cwpv cwpvVar) {
        this.a = cwpvVar;
    }

    @Override // defpackage.ctuj
    public final void c() {
        cwpv.o.r("RECEIVE_WAP_PUSH permission denied");
        ((cpdl) this.a.A.b()).b();
    }

    @Override // defpackage.ctuj
    public final void d() {
        cwpv.o.m("RECEIVE_WAP_PUSH permission granted");
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void b() {
    }
}
