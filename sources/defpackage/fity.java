package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fity implements fiuq, fiuo {
    protected final firf a;
    protected final int b;
    protected final boolean c;

    public fity(firf firfVar, int i, boolean z) {
        this.a = firfVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.fiuo
    public final int a() {
        return this.b;
    }

    public int c(fiuk fiukVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        char charAt;
        int min = Math.min(this.b, charSequence.length() - i);
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        boolean z2 = false;
        while (i5 < min) {
            char charAt2 = charSequence.charAt(i + i5);
            if (i5 == 0) {
                if (charAt2 != '-') {
                    if (charAt2 == '+') {
                        charAt2 = '+';
                    } else {
                        i5 = 0;
                    }
                }
                if (this.c) {
                    z = charAt2 == '-';
                    z2 = charAt2 == '+';
                    if (min <= 1 || (charAt = charSequence.charAt(i + 1)) < '0' || charAt > '9') {
                        break;
                    }
                    min = Math.min(min + 1, charSequence.length() - i);
                    i5 = 1;
                } else {
                    i5 = 0;
                }
            }
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            i5++;
        }
        i4 = i5;
        if (i4 >= 9) {
            i2 = i4 + i;
            i3 = z2 ? Integer.parseInt(charSequence.subSequence(i + 1, i2).toString()) : Integer.parseInt(charSequence.subSequence(i, i2).toString());
        } else {
            int i6 = (z || z2) ? i + 1 : i;
            try {
                int charAt3 = charSequence.charAt(i6) - '0';
                i2 = i4 + i;
                for (int i7 = i6 + 1; i7 < i2; i7++) {
                    charAt3 = (((charAt3 << 3) + (charAt3 + charAt3)) + charSequence.charAt(i7)) - 48;
                }
                i3 = z ? -charAt3 : charAt3;
            } catch (StringIndexOutOfBoundsException unused) {
                return ~i;
            }
        }
        fiukVar.d(this.a, i3);
        return i2;
    }
}
