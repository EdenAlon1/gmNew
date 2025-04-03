package defpackage;

import androidx.car.app.model.Alert;
import java.io.PrintStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiyt implements Comparable, Serializable {
    public static final fiyt a;
    public static final fiyt b;
    private static final byte[] c = {0};
    private static final byte[] d = {1, 42};
    private static final DecimalFormat e;
    private static final byte[] f;
    private static final fiyt g;
    private static final long serialVersionUID = -7257019940971525644L;
    private byte[] h;
    private long i;
    private int j;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        e = decimalFormat;
        f = new byte[256];
        decimalFormat.setMinimumIntegerDigits(3);
        int i = 0;
        while (true) {
            byte[] bArr = f;
            int length = bArr.length;
            if (i >= 256) {
                fiyt fiytVar = new fiyt();
                a = fiytVar;
                fiytVar.t(c);
                fiyt fiytVar2 = new fiyt();
                b = fiytVar2;
                fiytVar2.h = new byte[0];
                fiyt fiytVar3 = new fiyt();
                g = fiytVar3;
                fiytVar3.t(d);
                return;
            }
            if (i < 65 || i > 90) {
                bArr[i] = (byte) i;
            } else {
                bArr[i] = (byte) (i + 32);
            }
            i++;
        }
    }

    private fiyt() {
    }

    public static fiyt c(fiyt fiytVar, fiyt fiytVar2) {
        if (fiytVar.j()) {
            return fiytVar;
        }
        fiyt fiytVar3 = new fiyt();
        p(fiytVar, fiytVar3);
        fiytVar3.n(fiytVar2.h, fiytVar2.l(0), fiytVar2.a());
        return fiytVar3;
    }

    public static fiyt e(String str, fiyt fiytVar) {
        return (!str.equals("@") || fiytVar == null) ? str.equals(".") ? a : new fiyt(str, fiytVar) : fiytVar;
    }

    private final int l(int i) {
        if (i == 0) {
            if (a() == 0) {
                return 0;
            }
            i = 0;
        }
        if (i < 0 || i >= a()) {
            throw new IllegalArgumentException("label out of range");
        }
        if (i < 7) {
            return ((int) (this.i >>> ((7 - i) * 8))) & PrivateKeyType.INVALID;
        }
        int l = l(6);
        for (int i2 = 6; i2 < i; i2++) {
            l += this.h[l] + 1;
        }
        return l;
    }

    private static fjad m(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer("'");
        stringBuffer.append(str);
        stringBuffer.append("': ");
        stringBuffer.append(str2);
        return new fjad(stringBuffer.toString());
    }

    private final void n(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.h;
        int length = bArr2 == null ? 0 : bArr2.length - l(0);
        int i3 = i;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i3];
            if (i6 > 63) {
                throw new IllegalStateException("invalid label");
            }
            int i7 = i6 + 1;
            i3 += i7;
            i4 += i7;
        }
        int i8 = length + i4;
        if (i8 > 255) {
            throw new fiyu();
        }
        int a2 = a();
        int i9 = a2 + i2;
        if (i9 > 128) {
            throw new IllegalStateException("too many labels");
        }
        byte[] bArr3 = new byte[i8];
        if (length != 0) {
            System.arraycopy(this.h, l(0), bArr3, 0, length);
        }
        System.arraycopy(bArr, i, bArr3, length, i4);
        this.h = bArr3;
        for (int i10 = 0; i10 < i2; i10++) {
            r(a2 + i10, length);
            length += bArr3[length] + 1;
        }
        q(i9);
    }

    private final void o(String str, byte[] bArr, int i, int i2) {
        try {
            n(bArr, i, i2);
        } catch (fiyu unused) {
            throw m(str, "Name too long");
        }
    }

    private static final void p(fiyt fiytVar, fiyt fiytVar2) {
        if (fiytVar.l(0) == 0) {
            fiytVar2.h = fiytVar.h;
            fiytVar2.i = fiytVar.i;
            return;
        }
        int l = fiytVar.l(0);
        int length = fiytVar.h.length - l;
        int a2 = fiytVar.a();
        byte[] bArr = new byte[length];
        fiytVar2.h = bArr;
        System.arraycopy(fiytVar.h, l, bArr, 0, length);
        for (int i = 0; i < a2 && i < 7; i++) {
            fiytVar2.r(i, fiytVar.l(i) - l);
        }
        fiytVar2.q(a2);
    }

    private final void q(int i) {
        this.i = (this.i & (-256)) | i;
    }

    private final void r(int i, int i2) {
        if (i >= 7) {
            return;
        }
        int i3 = (7 - i) * 8;
        this.i = (i2 << i3) | (this.i & (~(255 << i3)));
    }

    private final boolean s(byte[] bArr, int i) {
        int a2 = a();
        int l = l(0);
        for (int i2 = 0; i2 < a2; i2++) {
            byte b2 = this.h[l];
            if (b2 != bArr[i]) {
                return false;
            }
            l++;
            i++;
            if (b2 > 63) {
                throw new IllegalStateException("invalid label");
            }
            int i3 = 0;
            while (i3 < b2) {
                byte[] bArr2 = f;
                int i4 = l + 1;
                int i5 = i + 1;
                if (bArr2[this.h[l] & 255] != bArr2[bArr[i] & 255]) {
                    return false;
                }
                i3++;
                i = i5;
                l = i4;
            }
        }
        return true;
    }

    private final void t(byte[] bArr) {
        try {
            n(bArr, 0, 1);
        } catch (fiyu unused) {
        }
    }

    public final int a() {
        return (int) (this.i & 255);
    }

    public final String b(boolean z) {
        int a2 = a();
        if (a2 == 0) {
            return "@";
        }
        int i = 0;
        if (a2 == 1 && this.h[l(0)] == 0) {
            return ".";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int l = l(0);
        while (true) {
            if (i >= a2) {
                break;
            }
            byte b2 = this.h[l];
            if (b2 > 63) {
                throw new IllegalStateException("invalid label");
            }
            if (b2 != 0) {
                if (i > 0) {
                    stringBuffer.append('.');
                }
                byte[] bArr = this.h;
                StringBuffer stringBuffer2 = new StringBuffer();
                int i2 = l + 1;
                byte b3 = bArr[l];
                for (int i3 = i2; i3 < i2 + b3; i3++) {
                    int i4 = bArr[i3] & 255;
                    if (i4 <= 32 || i4 >= 127) {
                        stringBuffer2.append('\\');
                        stringBuffer2.append(e.format(i4));
                    } else if (i4 == 34 || i4 == 40 || i4 == 41 || i4 == 46 || i4 == 59 || i4 == 92 || i4 == 64 || i4 == 36) {
                        stringBuffer2.append('\\');
                        stringBuffer2.append((char) i4);
                    } else {
                        stringBuffer2.append((char) i4);
                    }
                }
                stringBuffer.append(stringBuffer2.toString());
                l += b2 + 1;
                i++;
            } else if (!z) {
                stringBuffer.append('.');
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        fiyt fiytVar = (fiyt) obj;
        if (this == fiytVar) {
            return 0;
        }
        int a2 = a();
        int a3 = fiytVar.a();
        int i = a2 > a3 ? a3 : a2;
        for (int i2 = 1; i2 <= i; i2++) {
            int l = l(a2 - i2);
            int l2 = fiytVar.l(a3 - i2);
            byte b2 = this.h[l];
            byte b3 = fiytVar.h[l2];
            for (int i3 = 0; i3 < b2 && i3 < b3; i3++) {
                byte[] bArr = f;
                int i4 = bArr[this.h[(i3 + l) + 1] & 255] - bArr[fiytVar.h[(i3 + l2) + 1] & 255];
                if (i4 != 0) {
                    return i4;
                }
            }
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return a2 - a3;
    }

    public final fiyt d(fixa fixaVar) {
        fiyt fiytVar = fixaVar.f;
        fiyt fiytVar2 = fixaVar.a;
        if (!k(fiytVar)) {
            return null;
        }
        int a2 = a() - fiytVar.a();
        int f2 = f() - fiytVar.f();
        int l = l(0);
        int a3 = fiytVar2.a();
        short f3 = fiytVar2.f();
        int i = f2 + f3;
        if (i > 255) {
            throw new fiyu();
        }
        fiyt fiytVar3 = new fiyt();
        int i2 = a2 + a3;
        fiytVar3.q(i2);
        byte[] bArr = new byte[i];
        fiytVar3.h = bArr;
        System.arraycopy(this.h, l, bArr, 0, f2);
        System.arraycopy(fiytVar2.h, 0, fiytVar3.h, f2, f3);
        int i3 = 0;
        for (int i4 = 0; i4 < 7 && i4 < i2; i4++) {
            fiytVar3.r(i4, i3);
            i3 += fiytVar3.h[i3] + 1;
        }
        return fiytVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof fiyt)) {
            fiyt fiytVar = (fiyt) obj;
            if (fiytVar.j == 0) {
                fiytVar.hashCode();
            }
            if (this.j == 0) {
                hashCode();
            }
            if (fiytVar.j == this.j && fiytVar.a() == a()) {
                return s(fiytVar.h, fiytVar.l(0));
            }
            return false;
        }
        return false;
    }

    public final short f() {
        if (a() == 0) {
            return (short) 0;
        }
        return (short) (this.h.length - l(0));
    }

    public final void g(fixd fixdVar, fiwv fiwvVar) {
        int i;
        if (!j()) {
            throw new IllegalArgumentException("toWire() called on non-absolute name");
        }
        int a2 = a();
        int i2 = 0;
        while (true) {
            int i3 = -1;
            if (i2 >= a2 - 1) {
                fixdVar.g(0);
                return;
            }
            fiyt fiytVar = i2 == 0 ? this : new fiyt(this, i2);
            if (fiwvVar != null) {
                for (fiwu fiwuVar = fiwvVar.a[(fiytVar.hashCode() & Alert.DURATION_SHOW_INDEFINITELY) % 17]; fiwuVar != null; fiwuVar = fiwuVar.c) {
                    if (fiwuVar.a.equals(fiytVar)) {
                        i3 = fiwuVar.b;
                    }
                }
                if (fiwvVar.b) {
                    PrintStream printStream = System.err;
                    StringBuffer stringBuffer = new StringBuffer("Looking for ");
                    stringBuffer.append(fiytVar);
                    stringBuffer.append(", found ");
                    stringBuffer.append(i3);
                    printStream.println(stringBuffer.toString());
                }
            }
            if (i3 >= 0) {
                fixdVar.d(49152 | i3);
                return;
            }
            if (fiwvVar != null && (i = fixdVar.a) <= 16383) {
                int hashCode = (Integer.MAX_VALUE & fiytVar.hashCode()) % 17;
                fiwu fiwuVar2 = new fiwu();
                fiwuVar2.a = fiytVar;
                fiwuVar2.b = i;
                fiwu[] fiwuVarArr = fiwvVar.a;
                fiwuVar2.c = fiwuVarArr[hashCode];
                fiwuVarArr[hashCode] = fiwuVar2;
                if (fiwvVar.b) {
                    PrintStream printStream2 = System.err;
                    StringBuffer stringBuffer2 = new StringBuffer("Adding ");
                    stringBuffer2.append(fiytVar);
                    stringBuffer2.append(" at ");
                    stringBuffer2.append(i);
                    printStream2.println(stringBuffer2.toString());
                }
            }
            int l = l(i2);
            byte[] bArr = this.h;
            fixdVar.b(bArr, l, bArr[l] + 1);
            i2++;
        }
    }

    public final void h(fixd fixdVar, fiwv fiwvVar, boolean z) {
        if (z) {
            i(fixdVar);
        } else {
            g(fixdVar, fiwvVar);
        }
    }

    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        int l = l(0);
        while (true) {
            byte[] bArr = this.h;
            if (l >= bArr.length) {
                this.j = i2;
                return i2;
            }
            i2 += (i2 << 3) + f[bArr[l] & 255];
            l++;
        }
    }

    public final void i(fixd fixdVar) {
        byte[] bArr;
        int a2 = a();
        if (a2 == 0) {
            bArr = new byte[0];
        } else {
            byte[] bArr2 = new byte[this.h.length - l(0)];
            int l = l(0);
            int i = 0;
            for (int i2 = 0; i2 < a2; i2++) {
                byte b2 = this.h[l];
                if (b2 > 63) {
                    throw new IllegalStateException("invalid label");
                }
                bArr2[i] = b2;
                l++;
                i++;
                int i3 = 0;
                while (i3 < b2) {
                    bArr2[i] = f[this.h[l] & 255];
                    i3++;
                    i++;
                    l++;
                }
            }
            bArr = bArr2;
        }
        fixdVar.a(bArr);
    }

    public final boolean j() {
        int a2 = a();
        return a2 != 0 && this.h[l(a2 + (-1))] == 0;
    }

    public final boolean k(fiyt fiytVar) {
        int a2 = a();
        int a3 = fiytVar.a();
        if (a3 > a2) {
            return false;
        }
        return a3 == a2 ? equals(fiytVar) : fiytVar.s(this.h, l(a2 - a3));
    }

    public final String toString() {
        return b(false);
    }

    public fiyt(String str, fiyt fiytVar) {
        int i;
        boolean z;
        if (str.equals("")) {
            throw m(str, "empty name");
        }
        if (str.equals("@")) {
            if (fiytVar == null) {
                p(b, this);
                return;
            } else {
                p(fiytVar, this);
                return;
            }
        }
        if (str.equals(".")) {
            p(a, this);
            return;
        }
        byte[] bArr = new byte[64];
        int i2 = -1;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 1;
        int i5 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            byte charAt = (byte) str.charAt(i6);
            if (z2) {
                if (charAt >= 48 && charAt <= 57 && i3 < 3) {
                    i3++;
                    i5 = (i5 * 10) + (charAt - 48);
                    if (i5 > 255) {
                        throw m(str, "bad escape");
                    }
                    if (i3 >= 3) {
                        charAt = (byte) i5;
                    }
                    z2 = true;
                } else if (i3 > 0 && i3 < 3) {
                    throw m(str, "bad escape");
                }
                if (i4 > 63) {
                    throw m(str, "label too long");
                }
                bArr[i4] = charAt;
                i2 = i4;
                z2 = false;
                i4++;
            } else if (charAt == 92) {
                i3 = 0;
                i5 = 0;
                z2 = true;
            } else if (charAt != 46) {
                i2 = i2 == -1 ? i6 : i2;
                if (i4 > 63) {
                    throw m(str, "label too long");
                }
                bArr[i4] = charAt;
                i4++;
                z2 = false;
            } else {
                if (i2 == -1) {
                    throw m(str, "invalid empty label");
                }
                bArr[0] = (byte) (i4 - 1);
                o(str, bArr, 0, 1);
                i2 = -1;
                z2 = false;
                i4 = 1;
            }
        }
        if (i3 > 0 && i3 < 3) {
            throw m(str, "bad escape");
        }
        if (z2) {
            throw m(str, "bad escape");
        }
        if (i2 == -1) {
            z = true;
            i = 0;
            o(str, c, 0, 1);
        } else {
            i = 0;
            bArr[0] = (byte) (i4 - 1);
            o(str, bArr, 0, 1);
            z = false;
        }
        if (fiytVar == null || z) {
            return;
        }
        o(str, fiytVar.h, fiytVar.l(i), fiytVar.a());
    }

    public fiyt(fixb fixbVar) {
        byte[] bArr = new byte[64];
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            int c2 = fixbVar.c();
            int i = c2 & 192;
            if (i != 0) {
                if (i == 192) {
                    int c3 = fixbVar.c() + ((c2 & (-193)) << 8);
                    if (fiyy.a("verbosecompression")) {
                        PrintStream printStream = System.err;
                        StringBuffer stringBuffer = new StringBuffer("currently ");
                        stringBuffer.append(fixbVar.a());
                        stringBuffer.append(", pointer to ");
                        stringBuffer.append(c3);
                        printStream.println(stringBuffer.toString());
                    }
                    if (c3 < fixbVar.a() - 2) {
                        if (!z2) {
                            fixbVar.b = fixbVar.a.position();
                            fixbVar.c = fixbVar.a.limit();
                        }
                        if (c3 < fixbVar.a.capacity()) {
                            fixbVar.a.position(c3);
                            ByteBuffer byteBuffer = fixbVar.a;
                            byteBuffer.limit(byteBuffer.capacity());
                            if (fiyy.a("verbosecompression")) {
                                PrintStream printStream2 = System.err;
                                StringBuffer stringBuffer2 = new StringBuffer("current name '");
                                stringBuffer2.append(this);
                                stringBuffer2.append("', seeking to ");
                                stringBuffer2.append(c3);
                                printStream2.println(stringBuffer2.toString());
                            }
                            z2 = true;
                        } else {
                            throw new IllegalArgumentException("cannot jump past end of input");
                        }
                    } else {
                        throw new fjan("bad compression");
                    }
                } else {
                    throw new fjan("bad label type");
                }
            } else {
                if (a() >= 128) {
                    throw new fjan("too many labels");
                }
                if (c2 == 0) {
                    n(c, 0, 1);
                    z = true;
                } else {
                    bArr[0] = (byte) c2;
                    fixbVar.f(bArr, 1, c2);
                    n(bArr, 0, 1);
                }
            }
        }
        if (z2) {
            int i2 = fixbVar.b;
            if (i2 >= 0) {
                fixbVar.a.position(i2);
                fixbVar.a.limit(fixbVar.c);
                fixbVar.b = -1;
                fixbVar.c = -1;
                return;
            }
            throw new IllegalStateException("no previous state");
        }
    }

    public fiyt(fiyt fiytVar, int i) {
        int a2 = fiytVar.a();
        if (i <= a2) {
            this.h = fiytVar.h;
            int i2 = a2 - i;
            q(i2);
            for (int i3 = 0; i3 < 7 && i3 < i2; i3++) {
                r(i3, fiytVar.l(i3 + i));
            }
            return;
        }
        throw new IllegalArgumentException("attempted to remove too many labels");
    }
}
