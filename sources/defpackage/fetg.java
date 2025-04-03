package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fetg implements Runnable {
    final fete a;
    final /* synthetic */ fetu b;

    public fetg(fetu fetuVar, fete feteVar) {
        this.b = fetuVar;
        this.a = feteVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fetu fetuVar = this.b;
        fets s = fetuVar.s(fetuVar.w.e, false);
        if (s == null) {
            return;
        }
        fetu fetuVar2 = this.b;
        fetuVar2.k.execute(new fetf(this, s));
    }
}
