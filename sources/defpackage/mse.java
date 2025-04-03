package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mse implements mvc {
    public final mvc a;
    public boolean b;
    final /* synthetic */ msf c;

    public mse(msf msfVar, mvc mvcVar) {
        this.c = msfVar;
        this.a = mvcVar;
    }

    @Override // defpackage.mvc
    public final int a(mgz mgzVar, lxz lxzVar, int i) {
        msf msfVar = this.c;
        if (msfVar.p()) {
            return -3;
        }
        if (this.b) {
            lxzVar.a = 4;
            return -4;
        }
        long d = msfVar.d();
        int a = this.a.a(mgzVar, lxzVar, i);
        if (a != -5) {
            long j = this.c.c;
            if (j == Long.MIN_VALUE || ((a != -4 || lxzVar.f < j) && !(a == -3 && d == Long.MIN_VALUE && !lxzVar.e))) {
                return a;
            }
            lxzVar.eO();
            lxzVar.a = 4;
            this.b = true;
            return -4;
        }
        lqc lqcVar = mgzVar.b;
        lti.f(lqcVar);
        int i2 = lqcVar.H;
        if (i2 == 0) {
            if (lqcVar.I != 0) {
                i2 = 0;
            }
            return -5;
        }
        msf msfVar2 = this.c;
        if (msfVar2.b != 0) {
            i2 = 0;
        }
        int i3 = msfVar2.c == Long.MIN_VALUE ? lqcVar.I : 0;
        lqb lqbVar = new lqb(lqcVar);
        lqbVar.F = i2;
        lqbVar.G = i3;
        mgzVar.b = new lqc(lqbVar);
        return -5;
    }

    @Override // defpackage.mvc
    public final int b(long j) {
        if (this.c.p()) {
            return -3;
        }
        return this.a.b(j);
    }

    @Override // defpackage.mvc
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.mvc
    public final boolean d() {
        return !this.c.p() && this.a.d();
    }
}
