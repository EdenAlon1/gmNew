package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fekf extends feil {
    private static final fekd b = new fejy();
    private static final fekd c = new fejz();
    private static final fekd d = new feka();
    private static final fekd e = new fekb();
    private static final feke f = new fekc();
    public int a;
    private final Deque g;
    private Deque h;
    private boolean i;

    public fekf() {
        new ArrayDeque(2);
        this.g = new ArrayDeque();
    }

    private final int m(feke fekeVar, int i, Object obj, int i2) {
        a(i);
        if (!this.g.isEmpty()) {
            p();
        }
        while (i > 0 && !this.g.isEmpty()) {
            fesc fescVar = (fesc) this.g.peek();
            int min = Math.min(i, fescVar.f());
            i2 = fekeVar.a(fescVar, min, obj, i2);
            i -= min;
            this.a -= min;
            p();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int n(fekd fekdVar, int i, Object obj, int i2) {
        try {
            return m(fekdVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void o() {
        if (!this.i) {
            ((fesc) this.g.remove()).close();
            return;
        }
        this.h.add((fesc) this.g.remove());
        fesc fescVar = (fesc) this.g.peek();
        if (fescVar != null) {
            fescVar.b();
        }
    }

    private final void p() {
        if (((fesc) this.g.peek()).f() == 0) {
            o();
        }
    }

    @Override // defpackage.feil, defpackage.fesc
    public final void b() {
        if (this.h == null) {
            this.h = new ArrayDeque(Math.min(this.g.size(), 16));
        }
        while (!this.h.isEmpty()) {
            ((fesc) this.h.remove()).close();
        }
        this.i = true;
        fesc fescVar = (fesc) this.g.peek();
        if (fescVar != null) {
            fescVar.b();
        }
    }

    @Override // defpackage.feil, defpackage.fesc
    public final void c() {
        if (!this.i) {
            throw new InvalidMarkException();
        }
        fesc fescVar = (fesc) this.g.peek();
        if (fescVar != null) {
            int f2 = fescVar.f();
            fescVar.c();
            this.a += fescVar.f() - f2;
        }
        while (true) {
            fesc fescVar2 = (fesc) this.h.pollLast();
            if (fescVar2 == null) {
                return;
            }
            fescVar2.c();
            this.g.addFirst(fescVar2);
            this.a += fescVar2.f();
        }
    }

    @Override // defpackage.feil, defpackage.fesc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (!this.g.isEmpty()) {
            ((fesc) this.g.remove()).close();
        }
        if (this.h != null) {
            while (!this.h.isEmpty()) {
                ((fesc) this.h.remove()).close();
            }
        }
    }

    @Override // defpackage.feil, defpackage.fesc
    public final boolean d() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            if (!((fesc) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.fesc
    public final int e() {
        return n(b, 1, null, 0);
    }

    @Override // defpackage.fesc
    public final int f() {
        return this.a;
    }

    @Override // defpackage.fesc
    public final fesc g(int i) {
        fesc fescVar;
        int i2;
        fesc fescVar2;
        if (i <= 0) {
            return fesg.a;
        }
        a(i);
        this.a -= i;
        fesc fescVar3 = null;
        fekf fekfVar = null;
        while (true) {
            fesc fescVar4 = (fesc) this.g.peek();
            int f2 = fescVar4.f();
            if (f2 > i) {
                fescVar2 = fescVar4.g(i);
                i2 = 0;
            } else {
                if (this.i) {
                    fescVar = fescVar4.g(f2);
                    o();
                } else {
                    fescVar = (fesc) this.g.poll();
                }
                fesc fescVar5 = fescVar;
                i2 = i - f2;
                fescVar2 = fescVar5;
            }
            if (fescVar3 == null) {
                fescVar3 = fescVar2;
            } else {
                if (fekfVar == null) {
                    fekfVar = new fekf(i2 != 0 ? Math.min(this.g.size() + 2, 16) : 2);
                    fekfVar.h(fescVar3);
                    fescVar3 = fekfVar;
                }
                fekfVar.h(fescVar2);
            }
            if (i2 <= 0) {
                return fescVar3;
            }
            i = i2;
        }
    }

    public final void h(fesc fescVar) {
        boolean z = this.i && this.g.isEmpty();
        if (fescVar instanceof fekf) {
            fekf fekfVar = (fekf) fescVar;
            while (!fekfVar.g.isEmpty()) {
                this.g.add((fesc) fekfVar.g.remove());
            }
            this.a += fekfVar.a;
            fekfVar.a = 0;
            fekfVar.close();
        } else {
            this.g.add(fescVar);
            this.a += fescVar.f();
        }
        if (z) {
            ((fesc) this.g.peek()).b();
        }
    }

    @Override // defpackage.fesc
    public final void i(ByteBuffer byteBuffer) {
        n(e, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // defpackage.fesc
    public final void j(OutputStream outputStream, int i) {
        m(f, i, outputStream, 0);
    }

    @Override // defpackage.fesc
    public final void k(byte[] bArr, int i, int i2) {
        n(d, i2, bArr, i);
    }

    @Override // defpackage.fesc
    public final void l(int i) {
        n(c, i, null, 0);
    }

    public fekf(int i) {
        new ArrayDeque(2);
        this.g = new ArrayDeque(i);
    }
}
