package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezp {
    public final fhmv b;
    int f;
    public final List a = new ArrayList();
    fezo[] e = new fezo[8];
    int g = 0;
    int h = 0;
    public int c = 4096;
    public int d = 4096;

    public fezp(fhnv fhnvVar) {
        this.f = r0.length - 1;
        this.b = new fhnp(fhnvVar);
    }

    public static final boolean g(int i) {
        if (i < 0) {
            return false;
        }
        int length = fezr.b.length;
        return i <= 60;
    }

    private final int h() {
        return this.b.d() & 255;
    }

    private final void i() {
        Arrays.fill(this.e, (Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private final void j(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].h;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
                length--;
            }
            fezo[] fezoVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(fezoVarArr, i5, fezoVarArr, i5 + i3, this.g);
            this.f += i3;
        }
    }

    public final int a(int i) {
        return this.f + 1 + i;
    }

    final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int h = h();
            if ((h & 128) == 0) {
                return i2 + (h << i4);
            }
            i2 += (h & 127) << i4;
            i4 += 7;
        }
    }

    public final fhmx c(int i) {
        if (g(i)) {
            return fezr.b[i].f;
        }
        int length = fezr.b.length;
        int a = a(i - 61);
        if (a >= 0) {
            fezo[] fezoVarArr = this.e;
            if (a < fezoVarArr.length) {
                return fezoVarArr[a].f;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    final fhmx d() {
        int i;
        int h = h();
        int i2 = h & 128;
        long b = b(h, 127);
        if (i2 != 128) {
            return this.b.u(b);
        }
        fhmv fhmvVar = this.b;
        fezy fezyVar = fezy.a;
        byte[] G = fhmvVar.G(b);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        fezx fezxVar = fezyVar.b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < G.length) {
            int i6 = G[i3] & 255;
            int i7 = i4 << 8;
            i5 += 8;
            while (true) {
                i = i7 | i6;
                if (i5 >= 8) {
                    int i8 = i5 - 8;
                    fezxVar = fezxVar.a[(i >>> i8) & PrivateKeyType.INVALID];
                    if (fezxVar.a == null) {
                        byteArrayOutputStream.write(fezxVar.b);
                        i5 -= fezxVar.c;
                        fezxVar = fezyVar.b;
                    } else {
                        i5 = i8;
                    }
                }
            }
            i3++;
            i4 = i;
        }
        while (i5 > 0) {
            fezx fezxVar2 = fezxVar.a[(i4 << (8 - i5)) & PrivateKeyType.INVALID];
            if (fezxVar2.a != null || fezxVar2.c > i5) {
                break;
            }
            byteArrayOutputStream.write(fezxVar2.b);
            i5 -= fezxVar2.c;
            fezxVar = fezyVar.b;
        }
        return fhmx.f(byteArrayOutputStream.toByteArray());
    }

    public final void e() {
        int i = this.d;
        int i2 = this.h;
        if (i < i2) {
            if (i == 0) {
                i();
            } else {
                j(i2 - i);
            }
        }
    }

    public final void f(fezo fezoVar) {
        this.a.add(fezoVar);
        int i = fezoVar.h;
        int i2 = this.d;
        if (i > i2) {
            i();
            return;
        }
        j((this.h + i) - i2);
        int i3 = this.g + 1;
        fezo[] fezoVarArr = this.e;
        int length = fezoVarArr.length;
        if (i3 > length) {
            fezo[] fezoVarArr2 = new fezo[length + length];
            System.arraycopy(fezoVarArr, 0, fezoVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = fezoVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = fezoVar;
        this.g++;
        this.h += i;
    }
}
