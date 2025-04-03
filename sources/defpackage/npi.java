package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npi implements nrl {
    public final lsp a;
    public final Queue b;
    public final AtomicLong c;
    public lso d;
    public boolean e;
    public boolean f;
    public long g;
    public boolean h;
    private final Queue i;
    private final Queue j;
    private nsj k;
    private lxz l;
    private boolean m;
    private long n;
    private boolean o;

    public npi(lsp lspVar, nql nqlVar, lqc lqcVar) {
        lsp lspVar2 = new lsp(lqcVar);
        lti.b(npg.d(lspVar2), lspVar2);
        this.i = new ConcurrentLinkedQueue();
        ByteBuffer order = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i = 0; i < 10; i++) {
            lxz lxzVar = new lxz(2);
            lxzVar.d = order;
            this.i.add(lxzVar);
        }
        this.j = new ConcurrentLinkedQueue();
        this.b = new ConcurrentLinkedQueue();
        this.k = new nsj(lspVar2);
        lso o = o(nqlVar, lspVar2, lspVar);
        this.d = o;
        o.c();
        lsp lspVar3 = this.d.a;
        this.a = lspVar3;
        lti.b(lspVar3.d == 2, lspVar3);
        this.c = new AtomicLong(-9223372036854775807L);
        this.g = -9223372036854775807L;
    }

    private final long k() {
        return lvf.v(this.n / r2.e, this.k.a.b);
    }

    private final void l() {
        nsj nsjVar = this.k;
        nsjVar.b.addAndGet(r3.e * lvf.r(this.g - k(), nsjVar.a.b));
        this.o = true;
        if (this.h) {
            this.f = true;
        }
    }

    private final void m(lxz lxzVar) {
        lxzVar.eO();
        lxzVar.f = 0L;
        this.i.add(lxzVar);
    }

    private final boolean n() {
        if (this.o) {
            return false;
        }
        long j = this.g;
        return j != -9223372036854775807L && j - k() > 2000;
    }

    private static lso o(nql nqlVar, lsp lspVar, lsp lspVar2) {
        int i;
        int i2;
        engr engrVar = new engr();
        boolean z = nqlVar.d;
        engrVar.j(nqlVar.g.b);
        if (lspVar2.b != -1) {
            lsw lswVar = new lsw();
            lswVar.j(lspVar2.b);
            engrVar.h(lswVar);
        }
        int i3 = lspVar2.c;
        if (i3 == 1 || i3 == 2) {
            lst lstVar = new lst();
            lstVar.o(lsu.b(1, lspVar2.c));
            lstVar.o(lsu.b(2, lspVar2.c));
            engrVar.h(lstVar);
        }
        lso lsoVar = new lso(engrVar.g());
        lsp a = lsoVar.a(lspVar);
        int i4 = lspVar2.b;
        if ((i4 == -1 || i4 == a.b) && (((i = lspVar2.c) == -1 || i == a.c) && ((i2 = lspVar2.d) == -1 || i2 == a.d))) {
            return lsoVar;
        }
        throw new lsq("Audio can not be modified to match downstream format", lspVar);
    }

    @Override // defpackage.nsb
    public final /* synthetic */ int a() {
        return nsa.b();
    }

    @Override // defpackage.nsb
    public final /* synthetic */ Surface b() {
        return nsa.a();
    }

    @Override // defpackage.nsb
    public final lxz c() {
        if (this.b.isEmpty()) {
            return (lxz) this.i.peek();
        }
        return null;
    }

    public final ByteBuffer d() {
        ByteBuffer byteBuffer;
        lsp lspVar;
        if (!this.m) {
            byteBuffer = lsr.a;
        } else if (this.d.h()) {
            while (true) {
                if (!this.k.b()) {
                    lxz lxzVar = (lxz) this.j.peek();
                    if (lxzVar != null) {
                        if (!lxzVar.eR()) {
                            ByteBuffer byteBuffer2 = lxzVar.d;
                            lti.f(byteBuffer2);
                            long remaining = byteBuffer2.remaining();
                            this.d.e(byteBuffer2);
                            this.n += remaining - byteBuffer2.remaining();
                            if (byteBuffer2.hasRemaining()) {
                                break;
                            }
                            m((lxz) this.j.remove());
                        } else {
                            if (!n()) {
                                this.d.d();
                                this.e = true;
                                m((lxz) this.j.remove());
                                break;
                            }
                            l();
                            m((lxz) this.j.remove());
                        }
                    } else if (!this.b.isEmpty()) {
                        if (!n()) {
                            this.d.d();
                            break;
                        }
                        l();
                    } else {
                        break;
                    }
                } else {
                    ByteBuffer a = this.k.a();
                    this.d.e(a);
                    if (a.hasRemaining()) {
                        break;
                    }
                    if (!this.k.b()) {
                        this.d.d();
                        break;
                    }
                }
            }
            byteBuffer = this.d.b();
        } else if (this.k.b()) {
            byteBuffer = this.k.a();
        } else {
            lxz lxzVar2 = this.l;
            if (lxzVar2 != null) {
                byteBuffer = lxzVar2.d;
                lti.g(byteBuffer);
                if (!byteBuffer.hasRemaining()) {
                    lxz lxzVar3 = this.l;
                    lti.g(lxzVar3);
                    m(lxzVar3);
                    this.l = null;
                }
            }
            lxz lxzVar4 = (lxz) this.j.poll();
            if (lxzVar4 == null) {
                if (!this.b.isEmpty() && n()) {
                    l();
                }
                byteBuffer = lsr.a;
            } else {
                ByteBuffer byteBuffer3 = lxzVar4.d;
                this.e = lxzVar4.eR();
                if (byteBuffer3 == null || !byteBuffer3.hasRemaining() || this.e) {
                    m(lxzVar4);
                    if (this.e && n()) {
                        l();
                    }
                    byteBuffer = lsr.a;
                } else {
                    this.l = lxzVar4;
                    this.n += byteBuffer3.remaining();
                    byteBuffer = byteBuffer3;
                }
            }
        }
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        if (!g() && !this.b.isEmpty()) {
            nph nphVar = (nph) this.b.poll();
            lti.g(nphVar);
            this.n = 0L;
            this.h = nphVar.d;
            this.o = false;
            lqc lqcVar = nphVar.c;
            if (lqcVar != null) {
                this.g = nphVar.b;
                lspVar = new lsp(lqcVar);
                this.k = new nsj(lspVar);
            } else {
                if (nphVar.a.g.b.isEmpty()) {
                    this.g = nphVar.a.a(nphVar.b);
                } else {
                    this.g = nphVar.b;
                }
                lsp lspVar2 = this.k.a;
                this.c.compareAndSet(-9223372036854775807L, 0L);
                l();
                lspVar = lspVar2;
            }
            if (this.m) {
                this.d = o(nphVar.a, lspVar, this.a);
            }
            this.d.c();
            this.e = false;
            this.m = true;
        }
        return lsr.a;
    }

    @Override // defpackage.nry
    public final void e(nql nqlVar, long j, lqc lqcVar, boolean z) {
        if (lqcVar == null) {
            lti.d(j != -9223372036854775807L, "Could not generate silent audio because duration is unknown.");
        } else {
            lti.c(lre.i(lqcVar.o));
            lsp lspVar = new lsp(lqcVar);
            lti.d(npg.d(lspVar), lspVar);
        }
        this.b.add(new nph(nqlVar, j, lqcVar, z));
    }

    @Override // defpackage.nsb
    public final /* synthetic */ void f() {
        nsa.e();
    }

    public final boolean g() {
        ByteBuffer byteBuffer;
        if (!this.m) {
            return false;
        }
        lxz lxzVar = this.l;
        if ((lxzVar == null || (byteBuffer = lxzVar.d) == null || !byteBuffer.hasRemaining()) && !this.k.b() && this.j.isEmpty()) {
            return this.d.h() && !this.d.g();
        }
        return true;
    }

    @Override // defpackage.nsb
    public final /* synthetic */ int h(Bitmap bitmap, ltr ltrVar) {
        return nsa.c();
    }

    @Override // defpackage.nsb
    public final /* synthetic */ boolean i() {
        return nsa.d();
    }

    @Override // defpackage.nsb
    public final void j() {
        lti.c(this.b.isEmpty());
        lxz lxzVar = (lxz) this.i.remove();
        this.j.add(lxzVar);
        this.c.compareAndSet(-9223372036854775807L, lxzVar.f);
    }
}
