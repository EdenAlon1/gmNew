package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexm implements fezn {
    private static final Logger d = Logger.getLogger(feyg.class.getName());
    public final fexl a;
    public final fezn b;
    public final feyj c = new feyj(Level.FINE, feyg.class);

    public fexm(fexl fexlVar, fezn feznVar) {
        this.a = fexlVar;
        this.b = feznVar;
    }

    @Override // defpackage.fezn
    public final void a(fezz fezzVar) {
        throw null;
    }

    @Override // defpackage.fezn
    public final void b() {
        throw null;
    }

    @Override // defpackage.fezn
    public final void c(boolean z, int i, fhmt fhmtVar, int i2) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.close();
        } catch (IOException e) {
            d.logp(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e);
        }
    }

    @Override // defpackage.fezn
    public final void d() {
        try {
            this.b.d();
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.fezn
    public final void e(boolean z, int i, int i2) {
        long j = i << 32;
        long j2 = i2 & 4294967295L;
        if (z) {
            feyj feyjVar = this.c;
            if (feyjVar.a()) {
                long j3 = j | j2;
                feyjVar.a.logp(feyjVar.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", feyh.a(2) + " PING: ack=true bytes=" + j3);
            }
        } else {
            this.c.d(2, j | j2);
        }
        try {
            fezn feznVar = this.b;
            if (z) {
                ((fexi) feznVar).a.h++;
            }
            ((fexn) feznVar).b.e(z, i, i2);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.fezn
    public final void f(int i, fezm fezmVar) {
        this.c.e(2, i, fezmVar);
        try {
            fezn feznVar = this.b;
            ((fexi) feznVar).a.h++;
            ((fexn) feznVar).b.f(i, fezmVar);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.fezn
    public final void g(fezz fezzVar) {
        throw null;
    }

    @Override // defpackage.fezn
    public final void h(int i, long j) {
        this.c.g(2, i, j);
        try {
            ((fexn) this.b).b.h(i, j);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.fezn
    public final void i(fezm fezmVar, byte[] bArr) {
        this.c.c(2, 0, fezmVar, fhmx.f(bArr));
        try {
            ((fexn) this.b).b.i(fezmVar, bArr);
            this.b.d();
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.fezn
    public final void j(boolean z, int i, List list) {
        throw null;
    }
}
