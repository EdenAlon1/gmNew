package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhhx extends fhmz {
    final /* synthetic */ fhhy a;
    private final long c;
    private long d;
    private boolean e;
    private boolean f;
    private boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhhx(fhhy fhhyVar, fhnv fhnvVar, long j) {
        super(fhnvVar);
        fhnvVar.getClass();
        this.a = fhhyVar;
        this.c = j;
        this.e = true;
        if (j == 0) {
            c(null);
        }
    }

    @Override // defpackage.fhmz, defpackage.fhnv
    public final long b(fhmt fhmtVar, long j) {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        try {
            long b = this.b.b(fhmtVar, 8192L);
            if (this.e) {
                this.e = false;
            }
            if (b == -1) {
                c(null);
                return -1L;
            }
            long j2 = this.d + b;
            long j3 = this.c;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + this.c + " bytes but received " + j2);
            }
            this.d = j2;
            if (j2 == j3) {
                c(null);
            }
            return b;
        } catch (IOException e) {
            throw c(e);
        }
    }

    public final IOException c(IOException iOException) {
        if (this.f) {
            return iOException;
        }
        this.f = true;
        if (iOException == null && this.e) {
            this.e = false;
        }
        return this.a.e(true, false, iOException);
    }

    @Override // defpackage.fhmz, defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            super.close();
        } catch (IOException e) {
            throw c(e);
        }
    }
}
