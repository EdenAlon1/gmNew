package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fehn implements fevc {
    private final fegg a;
    private final fegw b;
    private final fdxd c;
    private febo d;
    private InputStream e;

    public fehn(fegg feggVar, fegw fegwVar, fdxd fdxdVar) {
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
                febo feboVar2 = this.d;
                InputStream inputStream = this.e;
                if (fegwVar.b == null) {
                    if (feboVar2 != null) {
                        fegwVar.a = feboVar2;
                    }
                    fegwVar.e();
                    if (inputStream != null) {
                        fegwVar.d(inputStream);
                    }
                    emxf.l(fegwVar.c == null);
                    fegwVar.b = status;
                    fegwVar.c = feboVar;
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
        this.d = feboVar;
    }

    @Override // defpackage.fevc
    public final void k() {
    }

    @Override // defpackage.fevp
    public final void n(InputStream inputStream) {
        if (this.e == null) {
            this.e = inputStream;
            return;
        }
        synchronized (this.a) {
            this.a.h(Status.o.withDescription("too many messages"));
        }
    }

    @Override // defpackage.fevp
    public final boolean o() {
        return this.b.h();
    }

    public final String toString() {
        fegw fegwVar = this.b;
        return "SingleMessageServerStream[" + this.a.toString() + "/" + fegwVar.toString() + "]";
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
