package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrv {
    public final int a;
    public final String b;
    public final int c;
    public final lqc[] d;
    private int e;

    static {
        lvf.N(0);
        lvf.N(1);
    }

    public lrv(String str, lqc... lqcVarArr) {
        int length = lqcVarArr.length;
        int i = 1;
        lti.a(length > 0);
        this.b = str;
        this.d = lqcVarArr;
        this.a = length;
        int b = lre.b(lqcVarArr[0].o);
        this.c = b == -1 ? lre.b(lqcVarArr[0].n) : b;
        String c = c(lqcVarArr[0].d);
        int b2 = b(lqcVarArr[0].f);
        while (true) {
            lqc[] lqcVarArr2 = this.d;
            if (i >= lqcVarArr2.length) {
                return;
            }
            if (!c.equals(c(lqcVarArr2[i].d))) {
                lqc[] lqcVarArr3 = this.d;
                d("languages", lqcVarArr3[0].d, lqcVarArr3[i].d, i);
                return;
            } else {
                lqc[] lqcVarArr4 = this.d;
                if (b2 != b(lqcVarArr4[i].f)) {
                    d("role flags", Integer.toBinaryString(lqcVarArr4[0].f), Integer.toBinaryString(this.d[i].f), i);
                    return;
                }
                i++;
            }
        }
    }

    private static int b(int i) {
        return i | 16384;
    }

    private static String c(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void d(String str, String str2, String str3, int i) {
        luj.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final lqc a(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lrv lrvVar = (lrv) obj;
            if (this.b.equals(lrvVar.b) && Arrays.equals(this.d, lrvVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.b.hashCode() + 527) * 31) + Arrays.hashCode(this.d);
        this.e = hashCode;
        return hashCode;
    }
}
