package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhki implements fhnv {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final fhmv f;

    public fhki(fhmv fhmvVar) {
        this.f = fhmvVar;
    }

    @Override // defpackage.fhnv
    public final fhnx a() {
        return this.f.a();
    }

    @Override // defpackage.fhnv
    public final long b(fhmt fhmtVar, long j) {
        int i;
        int f;
        do {
            int i2 = this.d;
            if (i2 == 0) {
                this.f.C(this.e);
                this.e = 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int g = fhhl.g(this.f);
                    this.d = g;
                    this.a = g;
                    int z = fhhl.z(this.f.d());
                    this.b = fhhl.z(this.f.d());
                    if (fhkj.a.isLoggable(Level.FINE)) {
                        Logger logger = fhkj.a;
                        fhmx fhmxVar = fhjp.a;
                        logger.fine(fhjp.b(true, this.c, this.a, z, this.b));
                    }
                    f = this.f.f() & Alert.DURATION_SHOW_INDEFINITELY;
                    this.c = f;
                    if (z != 9) {
                        throw new IOException(a.B(z, " != TYPE_CONTINUATION"));
                    }
                }
            } else {
                long b = this.f.b(fhmtVar, Math.min(8192L, i2));
                if (b != -1) {
                    this.d -= (int) b;
                    return b;
                }
            }
            return -1L;
        } while (f == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
