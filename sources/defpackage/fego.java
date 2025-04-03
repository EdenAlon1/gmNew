package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fego implements fejs {
    private final fegf a;
    private final fegv b;

    public fego(fegf fegfVar, fegv fegvVar) {
        this.a = fegfVar;
        this.b = fegvVar;
    }

    @Override // defpackage.fejs
    public final fdxd a() {
        throw null;
    }

    @Override // defpackage.fejs
    public final void c(Status status) {
        synchronized (this.a) {
            this.a.i(status);
        }
    }

    @Override // defpackage.fejs
    public final void e() {
        try {
            synchronized (this.b) {
                fegv fegvVar = this.b;
                fegvVar.f();
                fegvVar.g();
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

    @Override // defpackage.fejs
    public final void i(fdys fdysVar) {
        synchronized (this.b) {
            this.b.c(fdysVar);
        }
    }

    @Override // defpackage.fejs
    public final void m(feju fejuVar) {
        synchronized (this.a) {
            this.a.l(this.b, fejuVar);
        }
        if (this.b.h()) {
            fejuVar.e();
        }
        try {
            synchronized (this.b) {
                this.b.e();
                this.b.g();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.h(e.a);
            }
        }
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
        fegv fegvVar = this.b;
        return "MultiMessageClientStream[" + this.a.toString() + "/" + fegvVar.toString() + "]";
    }

    @Override // defpackage.fevp
    public final void d() {
    }

    @Override // defpackage.fevp
    public final void f() {
    }

    @Override // defpackage.fejs
    public final void b(fenl fenlVar) {
    }

    @Override // defpackage.fevp
    public final void h(fdxy fdxyVar) {
    }

    @Override // defpackage.fejs
    public final void j(fdyv fdyvVar) {
    }

    @Override // defpackage.fejs
    public final void k(int i) {
    }

    @Override // defpackage.fejs
    public final void l(int i) {
    }
}
