package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxh {
    public final int a;
    public final mvo[] b;
    public final int[] c;
    public final int[][][] d;
    public final mvo e;
    private final int[] f;

    public mxh(int[] iArr, mvo[] mvoVarArr, int[] iArr2, int[][][] iArr3, mvo mvoVar) {
        this.f = iArr;
        this.b = mvoVarArr;
        this.d = iArr3;
        this.c = iArr2;
        this.e = mvoVar;
        this.a = iArr.length;
    }

    public final int a(int i) {
        return this.f[i];
    }

    public final int b(int i, int i2, int i3) {
        return mih.e(this.d[i][i2][i3]);
    }

    public final mvo c(int i) {
        return this.b[i];
    }
}
