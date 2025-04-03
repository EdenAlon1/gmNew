package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feup implements fevd {
    @Override // defpackage.fevr
    public final void d(fevq fevqVar) {
        while (true) {
            InputStream g = fevqVar.g();
            if (g == null) {
                return;
            }
            try {
                g.close();
            } catch (IOException e) {
                while (true) {
                    InputStream g2 = fevqVar.g();
                    if (g2 == null) {
                        throw new RuntimeException(e);
                    }
                    try {
                        g2.close();
                    } catch (IOException e2) {
                        feuy.b.logp(Level.WARNING, "io.grpc.internal.ServerImpl$NoopListener", "messagesAvailable", "Exception closing stream", (Throwable) e2);
                    }
                }
            }
        }
    }

    @Override // defpackage.fevd
    public final void b() {
    }

    @Override // defpackage.fevr
    public final void e() {
    }

    @Override // defpackage.fevd
    public final void a(Status status) {
    }
}
