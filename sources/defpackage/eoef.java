package defpackage;

import j$.util.Objects;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eoef extends eoeg {
    private volatile eoeg a;
    public final eoeb b;
    public final Character c;
    public volatile eoeg d;

    public eoef(eoeb eoebVar, Character ch) {
        this.b = eoebVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            byte[] bArr = eoebVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        emxf.f(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.eoeg
    public int a(byte[] bArr, CharSequence charSequence) {
        eoeb eoebVar;
        CharSequence h = h(charSequence);
        if (!this.b.f(h.length())) {
            throw new eoee("Invalid input length " + h.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < h.length()) {
            long j = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                eoebVar = this.b;
                if (i3 >= eoebVar.e) {
                    break;
                }
                j <<= eoebVar.d;
                if (i + i3 < h.length()) {
                    j |= this.b.b(h.charAt(i4 + i));
                    i4++;
                }
                i3++;
            }
            int i5 = eoebVar.f;
            int i6 = i4 * eoebVar.d;
            int i7 = (i5 - 1) * 8;
            while (i7 >= (i5 * 8) - i6) {
                bArr[i2] = (byte) ((j >>> i7) & 255);
                i7 -= 8;
                i2++;
            }
            i += this.b.e;
        }
        return i2;
    }

    public eoeg b(eoeb eoebVar, Character ch) {
        return new eoef(eoebVar, ch);
    }

    @Override // defpackage.eoeg
    public void c(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        emxf.k(0, i, bArr.length);
        while (i2 < i) {
            i(appendable, bArr, i2, Math.min(this.b.f, i - i2));
            i2 += this.b.f;
        }
    }

    @Override // defpackage.eoeg
    public final int d(int i) {
        return (int) (((this.b.d * i) + 7) / 8);
    }

    @Override // defpackage.eoeg
    public final int e(int i) {
        return this.b.e * erla.b(i, this.b.f, RoundingMode.CEILING);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eoef) {
            eoef eoefVar = (eoef) obj;
            if (this.b.equals(eoefVar.b) && Objects.equals(this.c, eoefVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eoeg
    public final eoeg f() {
        eoeg eoegVar = this.a;
        if (eoegVar == null) {
            eoeb eoebVar = this.b;
            if (eoebVar.e()) {
                emxf.m(!eoebVar.d(), "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr = new char[eoebVar.b.length];
                int i = 0;
                while (true) {
                    char[] cArr2 = eoebVar.b;
                    if (i >= cArr2.length) {
                        break;
                    }
                    cArr[i] = emuz.a(cArr2[i]);
                    i++;
                }
                eoeb eoebVar2 = new eoeb(eoebVar.a.concat(".lowerCase()"), cArr);
                eoebVar = eoebVar.h ? eoebVar2.c() : eoebVar2;
            }
            eoegVar = eoebVar == this.b ? this : b(eoebVar, this.c);
            this.a = eoegVar;
        }
        return eoegVar;
    }

    @Override // defpackage.eoeg
    public final eoeg g() {
        return this.c == null ? this : b(this.b, null);
    }

    @Override // defpackage.eoeg
    public final CharSequence h(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        Character ch = this.c;
        return Objects.hashCode(ch) ^ this.b.hashCode();
    }

    final void i(Appendable appendable, byte[] bArr, int i, int i2) {
        emxf.k(i, i + i2, bArr.length);
        int i3 = 0;
        emxf.a(i2 <= this.b.f);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = (i2 + 1) * 8;
        eoeb eoebVar = this.b;
        while (i3 < i2 * 8) {
            long j2 = j >>> ((i5 - eoebVar.d) - i3);
            eoeb eoebVar2 = this.b;
            appendable.append(eoebVar2.a(((int) j2) & eoebVar2.c));
            i3 += this.b.d;
        }
        if (this.c != null) {
            while (i3 < this.b.f * 8) {
                this.c.charValue();
                appendable.append('=');
                i3 += this.b.d;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.b);
        if (8 % this.b.d != 0) {
            if (this.c == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.c);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public eoef(String str, String str2, Character ch) {
        this(new eoeb(str, str2.toCharArray()), ch);
    }
}
