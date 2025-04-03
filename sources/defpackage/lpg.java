package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpg {
    public final long a;
    public final int b;

    @Deprecated
    public final Uri[] c;
    public final lqw[] d;
    public final int[] e;
    public final long[] f;
    public final String[] g;
    public final long h;
    public final boolean i;

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
        lvf.N(5);
        lvf.N(6);
        lvf.N(7);
        lvf.N(8);
        lvf.N(9);
        lvf.N(10);
    }

    public lpg(int i, int[] iArr, lqw[] lqwVarArr, long[] jArr, String[] strArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = lqwVarArr.length;
        int i2 = 0;
        lti.a(length == length2);
        this.a = 0L;
        this.b = i;
        this.e = iArr;
        this.d = lqwVarArr;
        this.f = jArr;
        this.h = 0L;
        this.i = false;
        this.c = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.c;
            if (i2 >= uriArr.length) {
                this.g = strArr;
                return;
            }
            lqw lqwVar = lqwVarArr[i2];
            if (lqwVar == null) {
                uri = null;
            } else {
                lqt lqtVar = lqwVar.b;
                lti.f(lqtVar);
                uri = lqtVar.a;
            }
            uriArr[i2] = uri;
            i2++;
        }
    }

    public final int a() {
        return b(-1);
    }

    public final int b(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean c() {
        if (this.b == -1) {
            return true;
        }
        for (int i = 0; i < this.b; i++) {
            int i2 = this.e[i];
            if (i2 == 0 || i2 == 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lpg lpgVar = (lpg) obj;
            if (this.b == lpgVar.b && Arrays.equals(this.d, lpgVar.d) && Arrays.equals(this.e, lpgVar.e) && Arrays.equals(this.f, lpgVar.f) && Arrays.equals(this.g, lpgVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.b * 31) - 1) * 961) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.f)) * 29791) + Arrays.hashCode(this.g)) * 31;
    }
}
