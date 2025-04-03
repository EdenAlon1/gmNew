package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alws implements csmx {
    final /* synthetic */ alwt a;

    public alws(alwt alwtVar) {
        this.a = alwtVar;
    }

    @Override // defpackage.csmx
    public final void y() {
        eosx f;
        csjb d = alwt.a.d();
        alwt alwtVar = this.a;
        d.B("Network connectivity updated", ((csmz) alwtVar.b.a()).r());
        d.r();
        synchronized (alwtVar) {
            f = !alwtVar.e(alwtVar.c) ? alwtVar.f(2, alwtVar.c) : alwtVar.d != 4 ? alwtVar.f(3, alwtVar.c) : null;
        }
        if (f != null) {
            alwtVar.a(f);
        }
    }
}
