package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khe implements Comparable {
    public static int a = 1;
    public boolean b;
    public float f;
    int n;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    final float[] h = new float[9];
    final float[] i = new float[9];
    kgx[] j = new kgx[16];
    int k = 0;
    public int l = 0;
    boolean m = false;

    public khe(int i) {
        this.n = i;
    }

    public final void a(kgx kgxVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            if (i >= i2) {
                kgx[] kgxVarArr = this.j;
                int length = kgxVarArr.length;
                if (i2 >= length) {
                    this.j = (kgx[]) Arrays.copyOf(kgxVarArr, length + length);
                }
                kgx[] kgxVarArr2 = this.j;
                int i3 = this.k;
                kgxVarArr2[i3] = kgxVar;
                this.k = i3 + 1;
                return;
            }
            if (this.j[i] == kgxVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(kgx kgxVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == kgxVar) {
                while (i2 < i - 1) {
                    kgx[] kgxVarArr = this.j;
                    int i3 = i2 + 1;
                    kgxVarArr[i2] = kgxVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c - ((khe) obj).c;
    }

    public final void d(kgz kgzVar, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int i = this.k;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].c(kgzVar, this, false);
        }
        this.k = 0;
    }

    public final void e(kgz kgzVar, kgx kgxVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].d(kgzVar, kgxVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.c;
    }
}
