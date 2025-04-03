package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mwd implements mxf {
    protected final lrv a;
    protected final int b;
    protected final int[] c;
    private final lqc[] d;
    private int e;

    public mwd(lrv lrvVar, int[] iArr) {
        int length = iArr.length;
        lti.c(length > 0);
        this.a = lrvVar;
        this.b = length;
        this.d = new lqc[length];
        for (int i = 0; i < iArr.length; i++) {
            this.d[i] = lrvVar.a(iArr[i]);
        }
        Arrays.sort(this.d, new Comparator() { // from class: mwc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((lqc) obj2).j - ((lqc) obj).j;
            }
        });
        this.c = new int[this.b];
        for (int i2 = 0; i2 < this.b; i2++) {
            int[] iArr2 = this.c;
            lqc lqcVar = this.d[i2];
            int i3 = 0;
            while (true) {
                lqc[] lqcVarArr = lrvVar.d;
                if (i3 >= lqcVarArr.length) {
                    i3 = -1;
                    break;
                } else if (lqcVar == lqcVarArr[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
            iArr2[i2] = i3;
        }
    }

    @Override // defpackage.mxj
    public final int a(int i) {
        return this.c[i];
    }

    @Override // defpackage.mxf
    public final int b() {
        return this.c[0];
    }

    @Override // defpackage.mxj
    public final int c(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.mxj
    public final int d() {
        return this.c.length;
    }

    @Override // defpackage.mxj
    public final lqc e(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mwd mwdVar = (mwd) obj;
            if (this.a.equals(mwdVar.a) && Arrays.equals(this.c, mwdVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mxf
    public final lqc f() {
        return this.d[0];
    }

    @Override // defpackage.mxj
    public final lrv g() {
        return this.a;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
        this.e = identityHashCode;
        return identityHashCode;
    }
}
