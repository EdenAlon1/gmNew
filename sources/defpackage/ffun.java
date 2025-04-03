package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffun extends ffuj {
    final /* synthetic */ ffuq a;
    private final fgix b;

    public ffun(ffuq ffuqVar, fgix fgixVar) {
        this.a = ffuqVar;
        this.b = fgixVar;
    }

    @Override // defpackage.ffuj
    public final void a(Throwable th) {
        Object E = this.a.E();
        if (!(E instanceof ffrt)) {
            E = ffur.b(E);
        }
        this.b.j(this.a, E);
    }

    @Override // defpackage.ffuj
    public final boolean b() {
        return false;
    }
}
