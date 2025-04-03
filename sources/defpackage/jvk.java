package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvk {
    public String a;
    public jur b;
    public int c = -1;
    public int d = -1;

    public jvk(String str) {
        this.a = str;
    }

    public final int a() {
        jur jurVar = this.b;
        return jurVar == null ? this.a.length() : (this.a.length() - (this.d - this.c)) + jurVar.b();
    }

    public final void b(int i, int i2, String str) {
        if (i > i2) {
            jwo.b(a.r(i2, i, "start index must be less than or equal to end index: ", " > "));
        }
        if (i < 0) {
            jwo.b(a.h(i, "start must be non-negative, but was "));
        }
        jur jurVar = this.b;
        if (jurVar == null) {
            int max = Math.max(PrivateKeyType.INVALID, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(this.a.length() - i2, 64);
            int i3 = i - min;
            jut.a(this.a, cArr, 0, i3, i);
            int i4 = max - min2;
            int i5 = min2 + i2;
            jut.a(this.a, cArr, i4, i2, i5);
            jus.a(str, cArr, min);
            this.b = new jur(cArr, min + str.length(), i4);
            this.c = i3;
            this.d = i5;
            return;
        }
        int i6 = this.c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > jurVar.b()) {
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            b(i, i2, str);
            return;
        }
        int length = str.length() - (i8 - i7);
        if (length > jurVar.a()) {
            int a = length - jurVar.a();
            int i9 = jurVar.a;
            do {
                i9 += i9;
            } while (i9 - jurVar.a < a);
            char[] cArr2 = new char[i9];
            ffdo.j(jurVar.b, cArr2, 0, 0, jurVar.c);
            int i10 = jurVar.a;
            int i11 = jurVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            ffdo.j(jurVar.b, cArr2, i13, i11, i12 + i11);
            jurVar.b = cArr2;
            jurVar.a = i9;
            jurVar.d = i13;
        }
        int i14 = jurVar.c;
        if (i7 < i14 && i8 <= i14) {
            char[] cArr3 = jurVar.b;
            int i15 = i14 - i8;
            ffdo.j(cArr3, cArr3, jurVar.d - i15, i8, i14);
            jurVar.c = i7;
            jurVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int a2 = i7 + jurVar.a();
            int a3 = i8 + jurVar.a();
            int i16 = jurVar.d;
            char[] cArr4 = jurVar.b;
            ffdo.j(cArr4, cArr4, i14, i16, a2);
            i7 = jurVar.c + (a2 - i16);
            jurVar.c = i7;
            jurVar.d = a3;
        } else {
            jurVar.d = i8 + jurVar.a();
            jurVar.c = i7;
        }
        jus.a(str, jurVar.b, i7);
        jurVar.c += str.length();
    }

    public final String toString() {
        jur jurVar = this.b;
        if (jurVar == null) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.a, 0, this.c);
        sb.append(jurVar.b, 0, jurVar.c);
        char[] cArr = jurVar.b;
        int i = jurVar.d;
        sb.append(cArr, i, jurVar.a - i);
        String str = this.a;
        sb.append((CharSequence) str, this.d, str.length());
        return sb.toString();
    }
}
