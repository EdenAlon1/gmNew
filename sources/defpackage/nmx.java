package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmx implements nnb {
    private static final byte[] c = {73, 68, 51};
    private final boolean d;
    private final String g;
    private final int h;
    private final String i;
    private String j;
    private ndu k;
    private ndu l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private int t;
    private boolean u;
    private int v;
    private ndu w;
    private long x;
    private final luu e = new luu(new byte[7]);
    private final luv f = new luv(Arrays.copyOf(c, 10));
    private int r = -1;
    private int s = -1;
    public long a = -9223372036854775807L;
    public long b = -9223372036854775807L;

    public nmx(boolean z, String str, int i, String str2) {
        this.d = z;
        this.g = str;
        this.h = i;
        this.i = str2;
        h();
    }

    public static boolean f(int i) {
        return (i & 65526) == 65520;
    }

    private final void g() {
        this.q = false;
        h();
    }

    private final void h() {
        this.m = 0;
        this.n = 0;
        this.o = 256;
    }

    private final void i() {
        this.m = 3;
        this.n = 0;
    }

    private final void j(ndu nduVar, long j, int i, int i2) {
        this.m = 4;
        this.n = i;
        this.w = nduVar;
        this.x = j;
        this.v = i2;
    }

    private final boolean k(luv luvVar, byte[] bArr, int i) {
        int min = Math.min(luvVar.b(), i - this.n);
        luvVar.F(bArr, this.n, min);
        int i2 = this.n + min;
        this.n = i2;
        return i2 == i;
    }

    private static final boolean l(byte b) {
        return f((b & 255) | 65280);
    }

    private static final boolean m(luv luvVar, byte[] bArr, int i) {
        if (luvVar.b() < i) {
            return false;
        }
        luvVar.F(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02af A[SYNTHETIC] */
    @Override // defpackage.nnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.luv r18) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmx.a(luv):void");
    }

    @Override // defpackage.nnb
    public final void b(ncr ncrVar, nom nomVar) {
        nomVar.c();
        this.j = nomVar.b();
        ndu p = ncrVar.p(nomVar.a(), 1);
        this.k = p;
        this.w = p;
        if (!this.d) {
            this.l = new nck();
            return;
        }
        nomVar.c();
        ndu p2 = ncrVar.p(nomVar.a(), 5);
        this.l = p2;
        lqb lqbVar = new lqb();
        lqbVar.a = nomVar.b();
        lqbVar.a(this.i);
        lqbVar.c("application/id3");
        p2.i(new lqc(lqbVar));
    }

    @Override // defpackage.nnb
    public final void d(long j, int i) {
        this.b = j;
    }

    @Override // defpackage.nnb
    public final void e() {
        this.b = -9223372036854775807L;
        g();
    }

    @Override // defpackage.nnb
    public final void c(boolean z) {
    }
}
