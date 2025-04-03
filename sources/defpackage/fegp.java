package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fegp implements fevc {
    private final fegg a;
    private final fegw b;
    private final fdxd c;

    public fegp(fegg feggVar, fegw fegwVar, fdxd fdxdVar) {
        this.a = feggVar;
        this.b = fegwVar;
        this.c = fdxdVar;
    }

    @Override // defpackage.fevc
    public final fdxd a() {
        return this.c;
    }

    @Override // defpackage.fevc
    public final fevo b() {
        return this.b.f;
    }

    @Override // defpackage.fevc
    public final void c(Status status) {
        synchronized (this.a) {
            this.a.i(status);
        }
    }

    @Override // defpackage.fevc
    public final void e(Status status, febo feboVar) {
        try {
            synchronized (this.b) {
                fegw fegwVar = this.b;
                if (fegwVar.b == null) {
                    emxf.l(fegwVar.c == null);
                    fegwVar.b = status;
                    fegwVar.c = feboVar;
                    fegwVar.e();
                    fegwVar.f();
                    fegwVar.g();
                }
            }
            synchronized (this.a) {
                this.a.f();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
    }

    @Override // defpackage.fevp
    public final void g(int i) {
        synchronized (this.a) {
            this.a.n(i);
        }
    }

    @Override // defpackage.fevc
    public final void i(fevd fevdVar) {
        synchronized (this.a) {
            this.a.l(this.b, fevdVar);
        }
    }

    @Override // defpackage.fevc
    public final void j(febo feboVar) {
        try {
            synchronized (this.b) {
                fegw fegwVar = this.b;
                fegwVar.a = feboVar;
                fegwVar.e();
                fegwVar.g();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
    }

    @Override // defpackage.fevc
    public final void k() {
    }

    @Override // defpackage.fevp
    public final void n(InputStream inputStream) {
        try {
            synchronized (this.b) {
                this.b.d(inputStream);
                this.b.g();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
    }

    @Override // defpackage.fevp
    public final boolean o() {
        return this.b.h();
    }

    public final String toString() {
        fegw fegwVar = this.b;
        return "MultiMessageServerStream[" + this.a.toString() + "/" + fegwVar.toString() + "]";
    }

    @Override // defpackage.fevp
    public final void d() {
    }

    @Override // defpackage.fevp
    public final void f() {
    }

    @Override // defpackage.fevp
    public final void h(fdxy fdxyVar) {
    }
}
