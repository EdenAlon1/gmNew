package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnn implements nnb {
    private final String a;
    private final int b;
    private final String c = "video/mp2t";
    private final luv d;
    private final luu e;
    private ndu f;
    private String g;
    private lqc h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private long s;
    private int t;
    private long u;
    private int v;
    private String w;

    public nnn(String str, int i) {
        this.a = str;
        this.b = i;
        luv luvVar = new luv(1024);
        this.d = luvVar;
        this.e = new luu(luvVar.a);
        this.m = -9223372036854775807L;
    }

    private final int f(luu luuVar) {
        int a = luuVar.a();
        nbn b = nbo.b(luuVar, true);
        this.w = b.c;
        this.t = b.a;
        this.v = b.b;
        return a - luuVar.a();
    }

    private static long g(luu luuVar) {
        return luuVar.d((luuVar.d(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x015b, code lost:
    
        if (r14.n == false) goto L89;
     */
    @Override // defpackage.nnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.luv r15) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnn.a(luv):void");
    }

    @Override // defpackage.nnb
    public final void b(ncr ncrVar, nom nomVar) {
        nomVar.c();
        this.f = ncrVar.p(nomVar.a(), 1);
        this.g = nomVar.b();
    }

    @Override // defpackage.nnb
    public final void d(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.nnb
    public final void e() {
        this.i = 0;
        this.m = -9223372036854775807L;
        this.n = false;
    }

    @Override // defpackage.nnb
    public final void c(boolean z) {
    }
}
