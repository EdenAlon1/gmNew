package defpackage;

import androidx.car.app.model.Alert;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fezs implements fhnv {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final fhmv f;

    public fezs(fhmv fhmvVar) {
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
                this.e = (short) 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int b = fezw.b(this.f);
                    this.d = b;
                    this.a = b;
                    int d = this.f.d() & 255;
                    this.b = (byte) (this.f.d() & 255);
                    byte b2 = (byte) d;
                    if (fezw.a.isLoggable(Level.FINE)) {
                        fezw.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", fezt.a(true, this.c, this.a, b2, this.b));
                    }
                    f = this.f.f() & Alert.DURATION_SHOW_INDEFINITELY;
                    this.c = f;
                    if (b2 != 9) {
                        throw fezw.c("%s != TYPE_CONTINUATION", Byte.valueOf(b2));
                    }
                }
            } else {
                long b3 = this.f.b(fhmtVar, Math.min(8192L, i2));
                if (b3 != -1) {
                    this.d -= (int) b3;
                    return b3;
                }
            }
            return -1L;
        } while (f == i);
        throw fezw.c("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    @Override // defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
