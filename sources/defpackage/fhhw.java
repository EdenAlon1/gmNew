package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhhw extends fhmy {
    final /* synthetic */ fhhy a;
    private final long c;
    private boolean d;
    private long e;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhhw(fhhy fhhyVar, fhnt fhntVar, long j) {
        super(fhntVar);
        fhntVar.getClass();
        this.a = fhhyVar;
        this.c = j;
    }

    private final IOException c(IOException iOException) {
        if (this.d) {
            return iOException;
        }
        this.d = true;
        return this.a.e(false, true, iOException);
    }

    @Override // defpackage.fhmy, defpackage.fhnt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        long j = this.c;
        if (j != -1 && this.e != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            this.b.close();
        } catch (IOException e) {
            throw c(e);
        }
    }

    @Override // defpackage.fhmy, defpackage.fhnt, java.io.Flushable
    public final void flush() {
        try {
            this.b.flush();
        } catch (IOException e) {
            throw c(e);
        }
    }

    @Override // defpackage.fhmy, defpackage.fhnt
    public final void id(fhmt fhmtVar, long j) {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.c;
        if (j2 == -1 || this.e + j <= j2) {
            try {
                this.b.id(fhmtVar, j);
                this.e += j;
                return;
            } catch (IOException e) {
                throw c(e);
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + (this.e + j));
    }
}
