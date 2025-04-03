package defpackage;

import io.grpc.Status;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feuh implements fevd {
    public final feui a;
    private final fect b;
    private final fdyg c;

    public feuh(feui feuiVar, fect fectVar, fdyg fdygVar) {
        this.a = feuiVar;
        this.b = fectVar;
        this.c = fdygVar;
        fdygVar.d(new feug(this), erpp.a);
    }

    @Override // defpackage.fevd
    public final void a(Status status) {
        int i = ffbo.a;
        feaa feaaVar = null;
        try {
            if (status.f()) {
                this.b.b();
            } else {
                this.a.c = true;
                this.b.a();
                Status withDescription = Status.c.withDescription("RPC cancelled");
                febj febjVar = fdzz.a;
                feaaVar = new feaa(withDescription);
            }
        } finally {
            this.c.j(null);
        }
    }

    @Override // defpackage.fevd
    public final void b() {
        int i = ffbo.a;
        if (this.a.c) {
            return;
        }
        this.b.c();
    }

    @Override // defpackage.fevr
    public final void d(fevq fevqVar) {
        int i = ffbo.a;
        if (this.a.c) {
            fend.g(fevqVar);
            return;
        }
        while (true) {
            try {
                InputStream g = fevqVar.g();
                if (g == null) {
                    return;
                }
                try {
                    this.b.d(this.a.a.d.b(g));
                    g.close();
                } finally {
                }
            } catch (Throwable th) {
                fend.g(fevqVar);
                emyt.e(th);
                throw new RuntimeException(th);
            }
        }
    }

    @Override // defpackage.fevr
    public final void e() {
        int i = ffbo.a;
        if (this.a.c) {
            return;
        }
        this.b.e();
    }
}
