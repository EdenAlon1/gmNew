package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhjm {
    public final fhmv c;
    public int e;
    public int f;
    private int g;
    public int a = 4096;
    public final List b = new ArrayList();
    public fhjl[] d = new fhjl[8];

    public fhjm(fhnv fhnvVar) {
        this.c = new fhnp(fhnvVar);
        this.g = r2.length - 1;
    }

    public static final boolean h(int i) {
        if (i < 0) {
            return false;
        }
        fhjl[] fhjlVarArr = fhjo.a;
        int length = fhjo.a.length;
        return i <= 60;
    }

    private final int i() {
        return fhhl.z(this.c.d());
    }

    public final int a(int i) {
        return this.g + 1 + i;
    }

    public final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int i5 = i();
            if ((i5 & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (i5 & 127) << i4;
            i4 += 7;
        }
    }

    public final fhmx c(int i) {
        if (h(i)) {
            fhjl[] fhjlVarArr = fhjo.a;
            return fhjo.a[i].g;
        }
        fhjl[] fhjlVarArr2 = fhjo.a;
        int length = fhjo.a.length;
        int a = a(i - 61);
        if (a >= 0) {
            fhjl[] fhjlVarArr3 = this.d;
            if (a < fhjlVarArr3.length) {
                fhjl fhjlVar = fhjlVarArr3[a];
                fhjlVar.getClass();
                return fhjlVar.g;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final fhmx d() {
        int i;
        int i2 = i();
        int i3 = i2 & 128;
        long b = b(i2, 127);
        if (i3 != 128) {
            return this.c.u(b);
        }
        fhmt fhmtVar = new fhmt();
        int[] iArr = fhkq.a;
        fhmv fhmvVar = this.c;
        fhkp fhkpVar = fhkq.c;
        int i4 = 0;
        long j = 0;
        int i5 = 0;
        while (j < b) {
            int z = fhhl.z(fhmvVar.d());
            int i6 = i4 << 8;
            i5 += 8;
            while (true) {
                i = i6 | z;
                if (i5 >= 8) {
                    int i7 = i5 - 8;
                    int i8 = (i >>> i7) & PrivateKeyType.INVALID;
                    fhkp[] fhkpVarArr = fhkpVar.a;
                    fhkpVarArr.getClass();
                    fhkpVar = fhkpVarArr[i8];
                    fhkpVar.getClass();
                    if (fhkpVar.a == null) {
                        fhmtVar.O(fhkpVar.b);
                        i5 -= fhkpVar.c;
                        fhkpVar = fhkq.c;
                    } else {
                        i5 = i7;
                    }
                }
            }
            j++;
            i4 = i;
        }
        while (i5 > 0) {
            int i9 = (i4 << (8 - i5)) & PrivateKeyType.INVALID;
            fhkp[] fhkpVarArr2 = fhkpVar.a;
            fhkpVarArr2.getClass();
            fhkp fhkpVar2 = fhkpVarArr2[i9];
            fhkpVar2.getClass();
            if (fhkpVar2.a != null || fhkpVar2.c > i5) {
                break;
            }
            fhmtVar.O(fhkpVar2.b);
            i5 -= fhkpVar2.c;
            fhkpVar = fhkq.c;
        }
        return fhmtVar.t();
    }

    public final void e() {
        ffdo.d(r0, null, 0, this.d.length);
        this.g = this.d.length - 1;
        this.e = 0;
        this.f = 0;
    }

    public final void f(int i) {
        int i2;
        if (i > 0) {
            int length = this.d.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.g;
                if (length < i2 || i <= 0) {
                    break;
                }
                fhjl fhjlVar = this.d[length];
                fhjlVar.getClass();
                int i4 = this.f;
                int i5 = fhjlVar.i;
                this.f = i4 - i5;
                this.e--;
                i3++;
                i -= i5;
                length--;
            }
            fhjl[] fhjlVarArr = this.d;
            int i6 = i2 + 1;
            System.arraycopy(fhjlVarArr, i6, fhjlVarArr, i6 + i3, this.e);
            this.g += i3;
        }
    }

    public final void g(fhjl fhjlVar) {
        this.b.add(fhjlVar);
        int i = fhjlVar.i;
        int i2 = this.a;
        if (i > i2) {
            e();
            return;
        }
        f((this.f + i) - i2);
        int i3 = this.e + 1;
        fhjl[] fhjlVarArr = this.d;
        int length = fhjlVarArr.length;
        if (i3 > length) {
            fhjl[] fhjlVarArr2 = new fhjl[length + length];
            System.arraycopy(fhjlVarArr, 0, fhjlVarArr2, length, length);
            this.g = this.d.length - 1;
            this.d = fhjlVarArr2;
        }
        int i4 = this.g;
        this.g = i4 - 1;
        this.d[i4] = fhjlVar;
        this.e++;
        this.f += i;
    }
}
