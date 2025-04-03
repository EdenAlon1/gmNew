package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyc implements pxy {
    public final otb a;
    public final otr b;
    private final otr c;

    public pyc(otb otbVar) {
        this.a = otbVar;
        new pxz(otbVar);
        this.c = new pya(otbVar);
        this.b = new pyb(otbVar);
    }

    @Override // defpackage.pxy
    public final void a(String str) {
        this.a.m();
        oyf d = this.c.d();
        d.g(1, str);
        try {
            this.a.n();
            try {
                d.a();
                this.a.q();
            } finally {
                this.a.o();
            }
        } finally {
            this.c.f(d);
        }
    }
}
