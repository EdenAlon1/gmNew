package j$.time.format;

import j$.time.DateTimeException;

/* loaded from: classes9.dex */
final class m implements InterfaceC0036f {
    private final InterfaceC0036f a;
    private final int b;
    private final char c;

    m(InterfaceC0036f interfaceC0036f, int i, char c) {
        this.a = interfaceC0036f;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.InterfaceC0036f
    public final boolean o(y yVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.o(yVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.a);
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + valueOf + "," + this.b + str;
    }

    @Override // j$.time.format.InterfaceC0036f
    public final int u(w wVar, CharSequence charSequence, int i) {
        boolean l = wVar.l();
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == charSequence.length()) {
            return ~i;
        }
        int i2 = this.b + i;
        if (i2 > charSequence.length()) {
            if (l) {
                return ~i;
            }
            i2 = charSequence.length();
        }
        int i3 = i;
        while (i3 < i2 && wVar.b(charSequence.charAt(i3), this.c)) {
            i3++;
        }
        int u = this.a.u(wVar, charSequence.subSequence(0, i2), i3);
        return (u == i2 || !l) ? u : ~(i + i3);
    }
}
