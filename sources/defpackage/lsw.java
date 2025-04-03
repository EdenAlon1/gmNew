package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsw implements lsr {
    public lsp d;
    public lsp e;
    public boolean f;
    public lsv g;
    public long h;
    public long i;
    private int j;
    private lsp l;
    private ByteBuffer m;
    private ShortBuffer n;
    private ByteBuffer o;
    private boolean p;
    public float b = 1.0f;
    public float c = 1.0f;
    private lsp k = lsp.a;

    public lsw() {
        lsp lspVar = lsp.a;
        this.l = lspVar;
        this.d = lspVar;
        this.e = lspVar;
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = a;
        this.j = -1;
    }

    @Override // defpackage.lsr
    public final long a(long j) {
        if (this.i < 1024) {
            return (long) (j / this.b);
        }
        long j2 = this.h;
        lti.f(this.g);
        long b = j2 - r2.b();
        int i = this.e.b;
        int i2 = this.d.b;
        return i == i2 ? lvf.w(j, this.i, b) : lvf.w(j, this.i * i2, b * i);
    }

    @Override // defpackage.lsr
    public final lsp b(lsp lspVar) {
        if (lspVar.d != 2) {
            throw new lsq(lspVar);
        }
        int i = this.j;
        if (i == -1) {
            i = lspVar.b;
        }
        this.k = lspVar;
        lsp lspVar2 = new lsp(i, lspVar.c, 2);
        this.l = lspVar2;
        this.f = true;
        return lspVar2;
    }

    @Override // defpackage.lsr
    public final ByteBuffer c() {
        int a;
        lsv lsvVar = this.g;
        if (lsvVar != null && (a = lsvVar.a()) > 0) {
            if (this.m.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.m = order;
                this.n = order.asShortBuffer();
            } else {
                this.m.clear();
                this.n.clear();
            }
            ShortBuffer shortBuffer = this.n;
            lti.c(lsvVar.i >= 0);
            int min = Math.min(shortBuffer.remaining() / lsvVar.a, lsvVar.i);
            shortBuffer.put(lsvVar.h, 0, lsvVar.a * min);
            int i = lsvVar.i - min;
            lsvVar.i = i;
            short[] sArr = lsvVar.h;
            int i2 = lsvVar.a;
            System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
            this.i += a;
            this.m.limit(a);
            this.o = this.m;
        }
        ByteBuffer byteBuffer = this.o;
        this.o = a;
        return byteBuffer;
    }

    @Override // defpackage.lsr
    public final void d() {
        if (h()) {
            this.d = this.k;
            this.e = this.l;
            if (this.f) {
                lsp lspVar = this.d;
                this.g = new lsv(lspVar.b, lspVar.c, this.b, this.c, this.e.b);
            } else {
                lsv lsvVar = this.g;
                if (lsvVar != null) {
                    lsvVar.g = 0;
                    lsvVar.i = 0;
                    lsvVar.j = 0;
                    lsvVar.k = 0;
                    lsvVar.l = 0;
                    lsvVar.m = 0;
                    lsvVar.n = 0;
                    lsvVar.o = 0;
                    lsvVar.p = 0;
                    lsvVar.q = 0;
                    lsvVar.r = eobe.a;
                }
            }
        }
        this.o = a;
        this.h = 0L;
        this.i = 0L;
        this.p = false;
    }

    @Override // defpackage.lsr
    public final void e() {
        int i;
        lsv lsvVar = this.g;
        if (lsvVar != null) {
            int i2 = lsvVar.g;
            int i3 = lsvVar.m;
            int i4 = i2 - i3;
            double d = i3;
            float f = lsvVar.c;
            float f2 = lsvVar.b;
            int i5 = lsvVar.i + ((int) ((((((i4 / (f2 / f)) + d) + lsvVar.r) + lsvVar.j) / (lsvVar.d * f)) + 0.5d));
            lsvVar.r = eobe.a;
            int i6 = lsvVar.e;
            lsvVar.f = lsvVar.d(lsvVar.f, i2, i6 + i6 + i2);
            int i7 = 0;
            while (true) {
                int i8 = lsvVar.e;
                int i9 = lsvVar.a;
                i = i8 + i8;
                if (i7 >= i * i9) {
                    break;
                }
                lsvVar.f[(i9 * i2) + i7] = 0;
                i7++;
            }
            lsvVar.g += i;
            lsvVar.c();
            if (lsvVar.i > i5) {
                lsvVar.i = Math.max(i5, 0);
            }
            lsvVar.g = 0;
            lsvVar.m = 0;
            lsvVar.j = 0;
        }
        this.p = true;
    }

    @Override // defpackage.lsr
    public final void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            lsv lsvVar = this.g;
            lti.f(lsvVar);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.h += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = lsvVar.a;
            int i2 = remaining2 / i;
            int i3 = i * i2;
            lsvVar.f = lsvVar.d(lsvVar.f, lsvVar.g, i2);
            asShortBuffer.get(lsvVar.f, lsvVar.g * lsvVar.a, (i3 + i3) / 2);
            lsvVar.g += i2;
            lsvVar.c();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // defpackage.lsr
    public final void g() {
        this.b = 1.0f;
        this.c = 1.0f;
        this.k = lsp.a;
        lsp lspVar = lsp.a;
        this.l = lspVar;
        this.d = lspVar;
        this.e = lspVar;
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = a;
        this.j = -1;
        this.f = false;
        this.g = null;
        this.h = 0L;
        this.i = 0L;
        this.p = false;
    }

    @Override // defpackage.lsr
    public final boolean h() {
        if (this.l.b != -1) {
            return Math.abs(this.b + (-1.0f)) >= 1.0E-4f || Math.abs(this.c + (-1.0f)) >= 1.0E-4f || this.l.b != this.k.b;
        }
        return false;
    }

    @Override // defpackage.lsr
    public final boolean i() {
        if (!this.p) {
            return false;
        }
        lsv lsvVar = this.g;
        return lsvVar == null || lsvVar.a() == 0;
    }

    public final void j(int i) {
        boolean z = true;
        if (i != -1 && i <= 0) {
            z = false;
        }
        lti.a(z);
        this.j = i;
    }
}
