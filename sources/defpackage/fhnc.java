package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhnc implements fhnv {
    private final fhmv a;
    private final Inflater b;
    private int c;
    private boolean d;

    public fhnc(fhmv fhmvVar, Inflater inflater) {
        this.a = fhmvVar;
        this.b = inflater;
    }

    @Override // defpackage.fhnv
    public final fhnx a() {
        return this.a.a();
    }

    @Override // defpackage.fhnv
    public final long b(fhmt fhmtVar, long j) {
        do {
            long c = c(fhmtVar);
            if (c > 0) {
                return c;
            }
            if (this.b.finished() || this.b.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.D());
        throw new EOFException("source exhausted prematurely");
    }

    public final long c(fhmt fhmtVar) {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        try {
            fhnq x = fhmtVar.x(1);
            int min = (int) Math.min(8192L, 8192 - x.c);
            if (this.b.needsInput() && !this.a.D()) {
                fhnq fhnqVar = ((fhnp) this.a).b.a;
                fhnqVar.getClass();
                int i = fhnqVar.c;
                int i2 = fhnqVar.b;
                int i3 = i - i2;
                this.c = i3;
                this.b.setInput(fhnqVar.a, i2, i3);
            }
            int inflate = this.b.inflate(x.a, x.c, min);
            int i4 = this.c;
            if (i4 != 0) {
                int remaining = i4 - this.b.getRemaining();
                this.c -= remaining;
                this.a.C(remaining);
            }
            if (inflate > 0) {
                x.c += inflate;
                long j = inflate;
                fhmtVar.b += j;
                return j;
            }
            if (x.b != x.c) {
                return 0L;
            }
            fhmtVar.a = x.a();
            fhnr.b(x);
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}
