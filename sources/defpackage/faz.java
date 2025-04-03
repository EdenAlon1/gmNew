package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faz {
    public String a;
    public jse b;
    public int c;
    public boolean d;
    public int e;
    public jzn f;
    public jmf g;
    public boolean h;
    public jmi j;
    public kah k;
    private jpo m;
    private long n = faw.a;
    public long i = 0;
    public long l = jzj.c(0, 0);
    private int o = -1;
    private int p = -1;

    public faz(String str, jpo jpoVar, jse jseVar, int i, boolean z, int i2) {
        this.a = str;
        this.m = jpoVar;
        this.b = jseVar;
        this.c = i;
        this.d = z;
        this.e = i2;
    }

    private final void f() {
        this.g = null;
        this.j = null;
        this.k = null;
        this.o = -1;
        this.p = -1;
        this.l = jzj.c(0, 0);
        this.i = 0L;
        this.h = false;
    }

    public final int a(int i, kah kahVar) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long d = jzl.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        int f = ffmk.f(evx.a(b(d, kahVar).b()), jzk.c(d));
        this.o = i;
        this.p = f;
        return f;
    }

    public final jmf b(long j, kah kahVar) {
        jmi c = c(kahVar);
        long b = fax.b(j, this.d, this.c, c.a());
        boolean z = this.d;
        int i = this.c;
        return new jlf((jwx) c, fax.a(z, i, this.e), i, b);
    }

    public final jmi c(kah kahVar) {
        jmi jmiVar = this.j;
        if (jmiVar == null || kahVar != this.k || jmiVar.c()) {
            this.k = kahVar;
            String str = this.a;
            jpo b = jpp.b(this.m, kahVar);
            ffel ffelVar = ffel.a;
            jzn jznVar = this.f;
            jznVar.getClass();
            jmiVar = new jwx(str, b, ffelVar, ffelVar, this.b, jznVar);
        }
        this.j = jmiVar;
        return jmiVar;
    }

    public final void d(jzn jznVar) {
        jzn jznVar2 = this.f;
        long a = jznVar != null ? faw.a(jznVar) : faw.a;
        if (jznVar2 == null) {
            this.f = jznVar;
            this.n = a;
        } else if (jznVar == null || !faw.c(this.n, a)) {
            this.f = jznVar;
            this.n = a;
            f();
        }
    }

    public final void e(String str, jpo jpoVar, jse jseVar, int i, boolean z, int i2) {
        this.a = str;
        this.m = jpoVar;
        this.b = jseVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        f();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.g != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j = this.n;
        long j2 = faw.a;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
