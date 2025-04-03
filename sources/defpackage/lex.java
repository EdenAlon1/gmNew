package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lex {
    private static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final lfh b;
    public volatile int c = 0;

    public lex(lfh lfhVar, int i) {
        this.b = lfhVar;
        this.a = i;
    }

    public final int a(int i) {
        ozb d2 = d();
        int b = d2.b(16);
        if (b != 0) {
            return d2.b.getInt(d2.c(b) + (i * 4));
        }
        return 0;
    }

    public final int b() {
        ozb d2 = d();
        int b = d2.b(16);
        if (b != 0) {
            return d2.d(b);
        }
        return 0;
    }

    public final int c() {
        ozb d2 = d();
        int b = d2.b(4);
        if (b != 0) {
            return d2.b.getInt(b + d2.a);
        }
        return 0;
    }

    public final ozb d() {
        ThreadLocal threadLocal = d;
        ozb ozbVar = (ozb) threadLocal.get();
        if (ozbVar == null) {
            ozbVar = new ozb();
            threadLocal.set(ozbVar);
        }
        lfh lfhVar = this.b;
        int i = this.a;
        ozc ozcVar = lfhVar.a;
        int b = ozcVar.b(6);
        if (b != 0) {
            int c = ozcVar.c(b) + (i * 4);
            ozbVar.e(c + ozcVar.b.getInt(c), ozcVar.b);
        }
        return ozbVar;
    }

    public final short e() {
        ozb d2 = d();
        int b = d2.b(14);
        if (b != 0) {
            return d2.b.getShort(b + d2.a);
        }
        return (short) 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(c()));
        sb.append(", codepoints:");
        int b = b();
        for (int i = 0; i < b; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
