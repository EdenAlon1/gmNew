package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class femf implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ femg b;

    public femf(femg femgVar, boolean z) {
        this.a = z;
        this.b = femgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            femj femjVar = this.b.b;
            femjVar.p = true;
            if (femjVar.l > 0) {
                emyg emygVar = femjVar.o;
                emygVar.e();
                emygVar.f();
            }
        }
        this.b.b.q = false;
    }
}
