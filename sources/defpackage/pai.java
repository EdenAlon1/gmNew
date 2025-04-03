package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pai extends pas {
    public boolean b;
    public boolean c;
    public lel e;
    public Runnable g;
    public final /* synthetic */ par h;
    public long a = -1;
    public int d = 0;
    public final pbd f = new pbd();

    public pai(par parVar) {
        this.h = parVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pai.l():void");
    }

    @Override // defpackage.pas, defpackage.pak
    public final void a(par parVar) {
        this.c = true;
    }

    public final long h() {
        return this.h.s;
    }

    public final void i() {
        if (this.b) {
            l();
            this.e.e(h() + 1);
        } else {
            this.d = 1;
            this.g = null;
        }
    }

    public final void j(Runnable runnable) {
        this.g = runnable;
        if (!this.b) {
            this.d = 2;
        } else {
            l();
            this.e.e(0.0f);
        }
    }

    public final void k(float f) {
        long max = Math.max(-1L, Math.min(h() + 1, Math.round(f)));
        this.h.y(max, this.a);
        this.a = max;
    }
}
