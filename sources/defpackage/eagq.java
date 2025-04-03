package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eagq extends eags {
    public String a;
    public String b;
    public String c;
    public String d;
    public enip e;
    public String f;
    public String g;
    private long h;
    private String i;
    private int j;
    private long k;
    private long l;
    private int m;
    private long n;
    private long o;
    private byte p;
    private int q;

    public eagq() {
    }

    @Override // defpackage.eags
    public final eagt a() {
        String str;
        int i;
        if (this.p == Byte.MAX_VALUE && (str = this.i) != null && (i = this.q) != 0) {
            return new eagr(this.h, str, i, this.a, this.b, this.c, this.j, this.d, this.e, this.f, this.k, this.l, this.m, this.n, this.g, this.o);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.p & 1) == 0) {
            sb.append(" id");
        }
        if (this.i == null) {
            sb.append(" accountSpecificId");
        }
        if (this.q == 0) {
            sb.append(" accountType");
        }
        if ((this.p & 2) == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.p & 4) == 0) {
            sb.append(" syncVersion");
        }
        if ((this.p & 8) == 0) {
            sb.append(" lastRegistrationTimeMs");
        }
        if ((this.p & 16) == 0) {
            sb.append(" lastRegistrationRequestHash");
        }
        if ((this.p & 32) == 0) {
            sb.append(" firstRegistrationVersion");
        }
        if ((this.p & 64) == 0) {
            sb.append(" fitbitDecodedId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eags
    protected final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null accountSpecificId");
        }
        this.i = str;
    }

    @Override // defpackage.eags
    public final void c(long j) {
        this.n = j;
        this.p = (byte) (this.p | 32);
    }

    @Override // defpackage.eags
    public final void d(long j) {
        this.o = j;
        this.p = (byte) (this.p | 64);
    }

    @Override // defpackage.eags
    public final void e(long j) {
        this.h = j;
        this.p = (byte) (this.p | 1);
    }

    @Override // defpackage.eags
    public final void f(int i) {
        this.m = i;
        this.p = (byte) (this.p | 16);
    }

    @Override // defpackage.eags
    public final void g(long j) {
        this.l = j;
        this.p = (byte) (this.p | 8);
    }

    @Override // defpackage.eags
    public final void h(String str) {
        this.a = str;
    }

    @Override // defpackage.eags
    public final void i(int i) {
        this.j = i;
        this.p = (byte) (this.p | 2);
    }

    @Override // defpackage.eags
    public final void j(long j) {
        this.k = j;
        this.p = (byte) (this.p | 4);
    }

    @Override // defpackage.eags
    public final void k() {
        this.b = null;
    }

    @Override // defpackage.eags
    protected final void l(int i) {
        this.q = i;
    }

    public eagq(eagt eagtVar) {
        eagr eagrVar = (eagr) eagtVar;
        this.h = eagrVar.a;
        this.i = eagrVar.b;
        this.q = eagrVar.p;
        this.a = eagrVar.c;
        this.b = eagrVar.d;
        this.c = eagrVar.e;
        this.j = eagrVar.f;
        this.d = eagrVar.g;
        this.e = eagrVar.h;
        this.f = eagrVar.i;
        this.k = eagrVar.j;
        this.l = eagrVar.k;
        this.m = eagrVar.l;
        this.n = eagrVar.m;
        this.g = eagrVar.n;
        this.o = eagrVar.o;
        this.p = Byte.MAX_VALUE;
    }
}
