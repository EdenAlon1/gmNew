package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsa {
    public final int a;
    public final lrv b;
    public final int[] c;
    public final boolean[] d;
    private final boolean e;

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(3);
        lvf.N(4);
    }

    public lsa(lrv lrvVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = lrvVar.a;
        this.a = i;
        lti.a(i == iArr.length && i == zArr.length);
        this.b = lrvVar;
        this.e = z && i > 1;
        this.c = (int[]) iArr.clone();
        this.d = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.b.c;
    }

    public final lqc b(int i) {
        return this.b.a(i);
    }

    public final boolean c(int i) {
        return this.d[i];
    }

    public final boolean d(int i) {
        return this.c[i] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lsa lsaVar = (lsa) obj;
            if (this.e == lsaVar.e && this.b.equals(lsaVar.b) && Arrays.equals(this.c, lsaVar.c) && Arrays.equals(this.d, lsaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + (this.e ? 1 : 0)) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }
}
