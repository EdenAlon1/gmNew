package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feic implements Runnable {
    final feia a;
    final /* synthetic */ String b;
    final /* synthetic */ febo c;
    final /* synthetic */ febs d;
    final /* synthetic */ fevo e;
    final /* synthetic */ fdxj f;
    final /* synthetic */ feid g;

    public feic(feid feidVar, String str, febo feboVar, febs febsVar, fevo fevoVar, fdxj fdxjVar) {
        this.b = str;
        this.c = feboVar;
        this.d = febsVar;
        this.e = fevoVar;
        this.f = fdxjVar;
        this.g = feidVar;
        this.a = new feia(str, feidVar.a, feidVar.e, feboVar, feidVar, this, feidVar.c, feidVar.f, febsVar, fevoVar, fdxjVar, feidVar.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.g.c) {
            feid feidVar = this.g;
            if (feidVar.j) {
                this.a.o.j(feidVar.k, true, new febo());
            } else {
                if (!feidVar.l) {
                    throw new AssertionError("Transport is not started");
                }
                feia feiaVar = this.a;
                feidVar.d.add(feiaVar);
                feiaVar.o.h.p = feidVar.i;
            }
        }
    }
}
