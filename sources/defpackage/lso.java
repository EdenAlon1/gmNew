package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lso {
    private final engw b;
    private final List c = new ArrayList();
    private ByteBuffer[] d = new ByteBuffer[0];
    public lsp a = lsp.a;
    private lsp e = lsp.a;
    private boolean f = false;

    public lso(engw engwVar) {
        this.b = engwVar;
    }

    private final int i() {
        return this.d.length - 1;
    }

    private final void j(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= i()) {
                if (!this.d[i].hasRemaining()) {
                    lsr lsrVar = (lsr) this.c.get(i);
                    if (!lsrVar.i()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.d[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : lsr.a;
                        long remaining = byteBuffer2.remaining();
                        lsrVar.f(byteBuffer2);
                        this.d[i] = lsrVar.c();
                        long remaining2 = remaining - byteBuffer2.remaining();
                        boolean z2 = true;
                        if (remaining2 <= 0 && !this.d[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.d[i].hasRemaining() && i < i()) {
                        ((lsr) this.c.get(i + 1)).e();
                    }
                }
                i++;
            }
        } while (z);
    }

    public final lsp a(lsp lspVar) {
        if (lspVar.equals(lsp.a)) {
            throw new lsq(lspVar);
        }
        int i = 0;
        while (true) {
            engw engwVar = this.b;
            if (i >= ((enou) engwVar).c) {
                this.e = lspVar;
                return lspVar;
            }
            lsr lsrVar = (lsr) engwVar.get(i);
            lsp b = lsrVar.b(lspVar);
            if (lsrVar.h()) {
                lti.c(!b.equals(lsp.a));
                lspVar = b;
            }
            i++;
        }
    }

    public final ByteBuffer b() {
        if (!h()) {
            return lsr.a;
        }
        ByteBuffer byteBuffer = this.d[i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        j(lsr.a);
        return this.d[i()];
    }

    public final void c() {
        this.c.clear();
        this.a = this.e;
        this.f = false;
        int i = 0;
        while (true) {
            engw engwVar = this.b;
            if (i >= ((enou) engwVar).c) {
                break;
            }
            lsr lsrVar = (lsr) engwVar.get(i);
            lsrVar.d();
            if (lsrVar.h()) {
                this.c.add(lsrVar);
            }
            i++;
        }
        this.d = new ByteBuffer[this.c.size()];
        for (int i2 = 0; i2 <= i(); i2++) {
            this.d[i2] = ((lsr) this.c.get(i2)).c();
        }
    }

    public final void d() {
        if (!h() || this.f) {
            return;
        }
        this.f = true;
        ((lsr) this.c.get(0)).e();
    }

    public final void e(ByteBuffer byteBuffer) {
        if (!h() || this.f) {
            return;
        }
        j(byteBuffer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lso)) {
            return false;
        }
        lso lsoVar = (lso) obj;
        if (((enou) this.b).c != ((enou) lsoVar.b).c) {
            return false;
        }
        int i = 0;
        while (true) {
            engw engwVar = this.b;
            if (i >= ((enou) engwVar).c) {
                return true;
            }
            if (engwVar.get(i) != lsoVar.b.get(i)) {
                return false;
            }
            i++;
        }
    }

    public final void f() {
        int i = 0;
        while (true) {
            engw engwVar = this.b;
            if (i >= ((enou) engwVar).c) {
                this.d = new ByteBuffer[0];
                this.a = lsp.a;
                this.e = lsp.a;
                this.f = false;
                return;
            }
            lsr lsrVar = (lsr) engwVar.get(i);
            lsrVar.d();
            lsrVar.g();
            i++;
        }
    }

    public final boolean g() {
        return this.f && ((lsr) this.c.get(i())).i() && !this.d[i()].hasRemaining();
    }

    public final boolean h() {
        return !this.c.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
