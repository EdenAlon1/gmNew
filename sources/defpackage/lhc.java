package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhc {
    private static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final lgz b;
    public volatile int c = 0;

    public lhc(lgz lgzVar, int i) {
        this.b = lgzVar;
        this.a = i;
    }

    public final int a(int i) {
        lhh f = f();
        int b = f.b(16);
        if (b != 0) {
            return f.b.getInt(f.c(b) + (i * 4));
        }
        return 0;
    }

    public final int b() {
        lhh f = f();
        int b = f.b(16);
        if (b != 0) {
            return f.d(b);
        }
        return 0;
    }

    public final int c() {
        return this.c & 3;
    }

    public final int d() {
        lhh f = f();
        int b = f.b(14);
        if (b != 0) {
            return f.b.getShort(b + f.a);
        }
        return 0;
    }

    public final int e() {
        lhh f = f();
        int b = f.b(4);
        if (b != 0) {
            return f.b.getInt(b + f.a);
        }
        return 0;
    }

    public final lhh f() {
        ThreadLocal threadLocal = d;
        lhh lhhVar = (lhh) threadLocal.get();
        if (lhhVar == null) {
            lhhVar = new lhh();
            threadLocal.set(lhhVar);
        }
        lgz lgzVar = this.b;
        int i = this.a;
        lhi lhiVar = lgzVar.a;
        int b = lhiVar.b(6);
        if (b != 0) {
            int c = lhiVar.c(b) + (i * 4);
            lhhVar.e(c + lhiVar.b.getInt(c), lhiVar.b);
        }
        return lhhVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(e()));
        sb.append(", codepoints:");
        int b = b();
        for (int i = 0; i < b; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
