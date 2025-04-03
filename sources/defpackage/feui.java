package defpackage;

import io.grpc.Status;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feui extends fecu {
    private static final Logger d = Logger.getLogger(feui.class.getName());
    public final febs a;
    public final fdyg b;
    public volatile boolean c;
    private final fevc e;
    private final byte[] f;
    private final fdyv g;
    private final fejg h;
    private boolean i;
    private boolean j;
    private fdxy k;
    private boolean l;

    public feui(fevc fevcVar, febs febsVar, febo feboVar, fdyg fdygVar, fdyv fdyvVar, fejg fejgVar) {
        this.e = fevcVar;
        this.a = febsVar;
        this.b = fdygVar;
        this.f = (byte[]) feboVar.b(fend.d);
        this.g = fdyvVar;
        this.h = fejgVar;
        fejgVar.b();
    }

    private final void i(Throwable th) {
        d.logp(Level.WARNING, "io.grpc.internal.ServerCallImpl", "handleInternalError", "Cancelling the stream because of internal error", th);
        this.e.c(th instanceof fedn ? ((fedn) th).a : Status.o.d(th).withDescription("Internal error so cancelling stream."));
        this.h.a(false);
    }

    private final void j(Object obj) {
        emxf.m(this.i, "sendHeaders has not been called");
        emxf.m(!this.j, "call is closed");
        febs febsVar = this.a;
        if (febsVar.a.b() && this.l) {
            i(new fedn(Status.o.withDescription("Too many responses")));
            return;
        }
        this.l = true;
        try {
            this.e.n(febsVar.e.a(obj));
            febr febrVar = this.a.a;
        } catch (Error e) {
            a(Status.c.withDescription("Server sendMessage() failed with Error"), new febo());
            throw e;
        } catch (RuntimeException e2) {
            i(e2);
        }
    }

    @Override // defpackage.fecu
    public final void a(Status status, febo feboVar) {
        int i = ffbo.a;
        emxf.m(!this.j, "call already closed");
        try {
            this.j = true;
            if (status.f() && this.a.a.b() && !this.l) {
                i(new fedn(Status.o.withDescription("Completed without a response")));
            } else {
                this.e.e(status, feboVar);
            }
        } finally {
            this.h.a(status.f());
        }
    }

    @Override // defpackage.fecu
    public final void b(febo feboVar) {
        int i = ffbo.a;
        emxf.m(!this.i, "sendHeaders has already been called");
        emxf.m(!this.j, "call is closed");
        feboVar.e(fend.g);
        feboVar.e(fend.c);
        if (this.k == null) {
            this.k = fdxw.a;
        } else {
            byte[] bArr = this.f;
            if (bArr != null) {
                Iterator it = fend.k.g(new String(bArr, fend.a)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.k = fdxw.a;
                        break;
                    } else if (emxb.a(it.next(), "identity")) {
                        break;
                    }
                }
            } else {
                this.k = fdxw.a;
            }
        }
        feboVar.g(fend.c, "identity");
        feboVar.e(fend.d);
        byte[] bArr2 = this.g.c;
        if (bArr2.length != 0) {
            feboVar.g(fend.d, bArr2);
        }
        this.i = true;
        fevc fevcVar = this.e;
        febr febrVar = this.a.a;
        fevcVar.j(feboVar);
    }

    @Override // defpackage.fecu
    public final febs d() {
        return this.a;
    }

    @Override // defpackage.fecu
    public final void e(Object obj) {
        int i = ffbo.a;
        j(obj);
    }

    @Override // defpackage.fecu
    public final fdxd f() {
        return this.e.a();
    }

    @Override // defpackage.fecu
    public final void g(int i) {
        int i2 = ffbo.a;
        this.e.g(i);
    }

    @Override // defpackage.fecu
    public final boolean h() {
        if (this.j) {
            return false;
        }
        return this.e.o();
    }
}
