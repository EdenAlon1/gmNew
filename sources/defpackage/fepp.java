package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fepp implements Runnable {
    final /* synthetic */ fepw a;

    public fepp(fepw fepwVar) {
        this.a = fepwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fepw fepwVar = this.a;
        if (fepwVar.c.x == null) {
            if (fepwVar.a.get() == feqc.e) {
                this.a.a.set(null);
            }
            this.a.c.A.a(feqc.b);
        }
    }
}
