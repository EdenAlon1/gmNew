package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class nky implements njx {
    private final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public long c;
    private final ArrayDeque d;
    private nkw e;
    private long f;
    private long g;

    public nky() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new nkw());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new nkx(new nkv(this)));
        }
        this.d = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    private final void k(nkw nkwVar) {
        nkwVar.eO();
        this.a.add(nkwVar);
    }

    @Override // defpackage.lxw
    public final /* bridge */ /* synthetic */ Object a() {
        lti.c(this.e == null);
        if (this.a.isEmpty()) {
            return null;
        }
        nkw nkwVar = (nkw) this.a.pollFirst();
        this.e = nkwVar;
        return nkwVar;
    }

    @Override // defpackage.lxw
    public void c() {
        this.f = 0L;
        this.c = 0L;
        while (!this.d.isEmpty()) {
            nkw nkwVar = (nkw) this.d.poll();
            int i = lvf.a;
            k(nkwVar);
        }
        nkw nkwVar2 = this.e;
        if (nkwVar2 != null) {
            k(nkwVar2);
            this.e = null;
        }
    }

    @Override // defpackage.lxw
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        lti.a(obj == this.e);
        nkw nkwVar = (nkw) obj;
        if (!nkwVar.eR()) {
            long j = nkwVar.f;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != -9223372036854775807L && j < j2) {
                    k(nkwVar);
                    this.e = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        nkwVar.i = j3;
        this.d.add(nkwVar);
        this.e = null;
    }

    @Override // defpackage.lxw
    public final void f(long j) {
        this.g = j;
    }

    protected abstract njw g();

    @Override // defpackage.lxw
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public nkd b() {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.d.isEmpty()) {
            nkw nkwVar = (nkw) this.d.peek();
            int i = lvf.a;
            if (nkwVar.f > this.c) {
                return null;
            }
            nkw nkwVar2 = (nkw) this.d.poll();
            if (nkwVar2.eR()) {
                nkd nkdVar = (nkd) this.b.pollFirst();
                nkdVar.eP(4);
                k(nkwVar2);
                return nkdVar;
            }
            i(nkwVar2);
            if (j()) {
                njw g = g();
                nkd nkdVar2 = (nkd) this.b.pollFirst();
                nkdVar2.i(nkwVar2.f, g, Long.MAX_VALUE);
                k(nkwVar2);
                return nkdVar2;
            }
            k(nkwVar2);
        }
        return null;
    }

    protected abstract void i(nkc nkcVar);

    protected abstract boolean j();

    @Override // defpackage.njx
    public final void q(long j) {
        this.c = j;
    }

    @Override // defpackage.lxw
    public void e() {
    }
}
