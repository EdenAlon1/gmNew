package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class dcuc implements ejwd<Boolean> {
    final /* synthetic */ dcty a;

    public dcuc(dcty dctyVar) {
        this.a = dctyVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            dcty.a.r("Media editor library failed to load.");
            return;
        }
        dcty dctyVar = this.a;
        dctyVar.h.i(dctyVar.O.Q, dctyVar.H.a, new Runnable() { // from class: dcub
            @Override // java.lang.Runnable
            public final void run() {
                dcuc.this.a.n();
            }
        });
        this.a.O.Q.invalidate();
        this.a.O.Q.requestLayout();
    }

    @Override // defpackage.ejwd
    public final void hB() {
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
    }
}
