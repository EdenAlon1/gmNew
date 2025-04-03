package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kjv implements kji {
    public int c;
    public kiu d;
    kjr e;
    protected int k;
    public final kjl f = new kjl(this);
    public int g = 0;
    public boolean h = false;
    public final kjk i = new kjk(this);
    public final kjk j = new kjk(this);
    protected int l = 1;

    public kjv(kiu kiuVar) {
        this.d = kiuVar;
    }

    protected static final void j(kjk kjkVar, kjk kjkVar2, int i) {
        kjkVar.k.add(kjkVar2);
        kjkVar.e = i;
        kjkVar2.j.add(kjkVar);
    }

    protected static final kjk k(kit kitVar) {
        kit kitVar2 = kitVar.e;
        if (kitVar2 == null) {
            return null;
        }
        int i = kitVar2.i;
        kiu kiuVar = kitVar2.d;
        int i2 = i - 1;
        if (i2 == 1) {
            return kiuVar.o.i;
        }
        if (i2 == 2) {
            return kiuVar.p.i;
        }
        if (i2 == 3) {
            return kiuVar.o.j;
        }
        if (i2 == 4) {
            return kiuVar.p.j;
        }
        if (i2 != 5) {
            return null;
        }
        return kiuVar.p.a;
    }

    protected static final kjk l(kit kitVar, int i) {
        kit kitVar2 = kitVar.e;
        if (kitVar2 == null) {
            return null;
        }
        kiu kiuVar = kitVar2.d;
        kjv kjvVar = i == 0 ? kiuVar.o : kiuVar.p;
        int i2 = kitVar2.i - 1;
        if (i2 == 1 || i2 == 2) {
            return kjvVar.i;
        }
        if (i2 == 3 || i2 == 4) {
            return kjvVar.j;
        }
        return null;
    }

    public long a() {
        if (this.f.i) {
            return r0.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.kji
    public void f() {
        throw null;
    }

    protected final int h(int i, int i2) {
        if (i2 == 0) {
            kiu kiuVar = this.d;
            int i3 = kiuVar.G;
            int max = Math.max(kiuVar.F, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            kiu kiuVar2 = this.d;
            int i4 = kiuVar2.J;
            int max2 = Math.max(kiuVar2.I, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    protected final void i(kjk kjkVar, kjk kjkVar2, int i, kjl kjlVar) {
        kjkVar.k.add(kjkVar2);
        kjkVar.k.add(this.f);
        kjkVar.g = i;
        kjkVar.h = kjlVar;
        kjkVar2.j.add(kjkVar);
        kjlVar.j.add(kjkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r10.c == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void m(defpackage.kit r13, defpackage.kit r14, int r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjv.m(kit, kit, int):void");
    }
}
