package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lyi implements mbj {
    protected final mdk a;
    private mbh d = new lyg();
    public mbi b = new lyh();
    public mbg c = new mbg() { // from class: lye
        @Override // defpackage.mbg
        public final void a(lsf lsfVar) {
            luj.d("BaseGlShaderProgram", "Exception caught by default BaseGlShaderProgram errorListener.", lsfVar);
        }
    };
    private Executor e = erpp.a;
    private int f = -1;
    private int g = -1;

    public lyi(boolean z) {
        this.a = new mdk(z, 1);
    }

    public abstract lux a(int i, int i2);

    public abstract void b(int i, long j);

    @Override // defpackage.mbj
    public final void c() {
        this.a.e();
        this.d.w();
        for (int i = 0; i < this.a.c; i++) {
            this.d.c();
        }
    }

    @Override // defpackage.mbj
    public final void d(lqg lqgVar, lqh lqhVar, long j) {
        try {
            if (this.f != lqhVar.d || this.g != lqhVar.e || !this.a.g()) {
                int i = lqhVar.d;
                this.f = i;
                int i2 = lqhVar.e;
                this.g = i2;
                lux a = a(i, i2);
                this.a.d(lqgVar, a.c, a.d);
            }
            lqh b = this.a.b();
            ltz.u(b.c, b.d, b.e);
            if (k()) {
                ltz.o();
            }
            b(lqhVar.b, j);
            this.d.b(lqhVar);
            this.b.x(b, j);
        } catch (lsf | lty e) {
            this.e.execute(new Runnable() { // from class: lyf
                @Override // java.lang.Runnable
                public final void run() {
                    lyi.this.c.a(lsf.a(e));
                }
            });
        }
    }

    @Override // defpackage.mbj
    public void e() {
        throw null;
    }

    @Override // defpackage.mbj
    public final void f(lqh lqhVar) {
        if (this.a.b.contains(lqhVar)) {
            mdk mdkVar = this.a;
            lti.c(mdkVar.b.contains(lqhVar));
            mdkVar.b.remove(lqhVar);
            mdkVar.a.add(lqhVar);
            this.d.c();
        }
    }

    @Override // defpackage.mbj
    public final void g(Executor executor, mbg mbgVar) {
        this.e = executor;
        this.c = mbgVar;
    }

    @Override // defpackage.mbj
    public final void h(mbh mbhVar) {
        this.d = mbhVar;
        for (int i = 0; i < this.a.a(); i++) {
            mbhVar.c();
        }
    }

    @Override // defpackage.mbj
    public final void i(mbi mbiVar) {
        this.b = mbiVar;
    }

    @Override // defpackage.mbj
    public final void j() {
        this.b.a();
    }

    public boolean k() {
        throw null;
    }
}
