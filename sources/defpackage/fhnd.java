package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhnd implements fhnv {
    private final InputStream a;
    private final fhnx b;

    public fhnd(InputStream inputStream, fhnx fhnxVar) {
        this.a = inputStream;
        this.b = fhnxVar;
    }

    @Override // defpackage.fhnv
    public final fhnx a() {
        return this.b;
    }

    @Override // defpackage.fhnv
    public final long b(fhmt fhmtVar, long j) {
        try {
            this.b.g();
            fhnq x = fhmtVar.x(1);
            int read = this.a.read(x.a, x.c, (int) Math.min(j, 8192 - x.c));
            if (read != -1) {
                x.c += read;
                long j2 = read;
                fhmtVar.b += j2;
                return j2;
            }
            if (x.b != x.c) {
                return -1L;
            }
            fhmtVar.a = x.a();
            fhnr.b(x);
            return -1L;
        } catch (AssertionError e) {
            if (fhne.d(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final String toString() {
        return "source(" + this.a + ")";
    }
}
