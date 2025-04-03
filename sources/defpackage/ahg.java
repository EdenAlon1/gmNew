package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahg implements bjt {
    final /* synthetic */ aku a;
    final /* synthetic */ ahu b;

    public ahg(ahu ahuVar, aku akuVar) {
        this.b = ahuVar;
        this.a = akuVar;
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.n.remove(this.a);
        int i = this.b.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 1 && i2 != 5) {
            if (i2 != 6 && (i2 != 7 || this.b.i == 0)) {
                return;
            } else {
                this.b.q("Camera reopen required. Checking if the current camera can be closed safely.");
            }
        }
        if (this.b.J()) {
            ahu ahuVar = this.b;
            if (ahuVar.h != null) {
                ahuVar.q("closing camera");
                this.b.h.close();
                this.b.h = null;
            }
        }
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
    }
}
