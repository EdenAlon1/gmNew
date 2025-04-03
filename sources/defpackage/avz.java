package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class avz extends bbt {
    final /* synthetic */ awa a;

    public avz(awa awaVar) {
        this.a = awaVar;
    }

    @Override // defpackage.bbt
    public final void b(int i, bcd bcdVar) {
        awa awaVar = this.a;
        synchronized (awaVar.a) {
            if (awaVar.d) {
                return;
            }
            awaVar.f.put(bcdVar.a(), new bku(bcdVar));
            awaVar.m();
        }
    }
}
