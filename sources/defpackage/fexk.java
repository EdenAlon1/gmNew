package defpackage;

import java.io.IOException;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fexk implements fhnt {
    public final fexl c;
    public fhnt f;
    public Socket g;
    public int h;
    public int i;
    private final feuf j;
    private boolean l;
    public final Object a = new Object();
    public final fhmt b = new fhmt();
    public boolean d = false;
    public boolean e = false;
    private boolean k = false;

    public fexk(feuf feufVar, fexl fexlVar) {
        feufVar.getClass();
        this.j = feufVar;
        this.c = fexlVar;
    }

    @Override // defpackage.fhnt
    public final fhnx a() {
        return fhnx.j;
    }

    @Override // defpackage.fhnt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.execute(new fexh(this));
    }

    @Override // defpackage.fhnt, java.io.Flushable
    public final void flush() {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = ffbo.a;
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            this.e = true;
            this.j.execute(new fexg(this));
        }
    }

    @Override // defpackage.fhnt
    public final void id(fhmt fhmtVar, long j) {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = ffbo.a;
        synchronized (this.a) {
            this.b.id(fhmtVar, j);
            int i2 = this.i + this.h;
            this.i = i2;
            boolean z = false;
            this.h = 0;
            if (this.l || i2 <= 10000) {
                if (!this.d && !this.e && this.b.h() > 0) {
                    this.d = true;
                }
                return;
            }
            this.l = true;
            z = true;
            if (!z) {
                this.j.execute(new fexf(this));
                return;
            }
            try {
                this.g.close();
            } catch (IOException e) {
                this.c.a(e);
            }
        }
    }
}
