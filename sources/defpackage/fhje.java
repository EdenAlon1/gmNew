package defpackage;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhje extends fhjb {
    final /* synthetic */ fhjh c;
    private long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhje(fhjh fhjhVar, long j) {
        super(fhjhVar);
        this.c = fhjhVar;
        this.d = j;
        if (j == 0) {
            c();
        }
    }

    @Override // defpackage.fhjb, defpackage.fhnv
    public final long b(fhmt fhmtVar, long j) {
        if (this.a) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.d;
        if (j2 == 0) {
            return -1L;
        }
        long b = super.b(fhmtVar, Math.min(j2, 8192L));
        if (b == -1) {
            this.c.b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c();
            throw protocolException;
        }
        long j3 = this.d - b;
        this.d = j3;
        if (j3 == 0) {
            c();
        }
        return b;
    }

    @Override // defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.d != 0 && !fhhl.D(this, TimeUnit.MILLISECONDS)) {
            this.c.b.e();
            c();
        }
        d();
    }
}
