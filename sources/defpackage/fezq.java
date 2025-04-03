package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fezq {
    public final fhmt a;
    fezo[] b = new fezo[8];
    int c;
    public int d;
    private int e;

    public fezq(fhmt fhmtVar) {
        this.d = r0.length - 1;
        this.a = fhmtVar;
    }

    public final void a(fezo fezoVar) {
        int i;
        int i2 = fezoVar.h;
        if (i2 > 4096) {
            Arrays.fill(this.b, (Object) null);
            this.d = this.b.length - 1;
            this.c = 0;
            this.e = 0;
            return;
        }
        int i3 = (this.e + i2) - 4096;
        if (i3 > 0) {
            int length = this.b.length - 1;
            int i4 = 0;
            while (true) {
                i = this.d;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = this.b[length].h;
                i3 -= i5;
                this.e -= i5;
                this.c--;
                i4++;
                length--;
            }
            fezo[] fezoVarArr = this.b;
            int i6 = i + 1;
            System.arraycopy(fezoVarArr, i6, fezoVarArr, i6 + i4, this.c);
            this.d += i4;
        }
        int i7 = this.c + 1;
        fezo[] fezoVarArr2 = this.b;
        int length2 = fezoVarArr2.length;
        if (i7 > length2) {
            fezo[] fezoVarArr3 = new fezo[length2 + length2];
            System.arraycopy(fezoVarArr2, 0, fezoVarArr3, length2, length2);
            this.d = this.b.length - 1;
            this.b = fezoVarArr3;
        }
        int i8 = this.d;
        this.d = i8 - 1;
        this.b[i8] = fezoVar;
        this.c++;
        this.e += i2;
    }

    final void b(fhmx fhmxVar) {
        c(fhmxVar.b(), 127, 0);
        this.a.K(fhmxVar);
    }

    final void c(int i, int i2, int i3) {
        if (i < i2) {
            this.a.O(i | i3);
            return;
        }
        this.a.O(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.a.O(128 | (i4 & 127));
            i4 >>>= 7;
        }
        this.a.O(i4);
    }
}
