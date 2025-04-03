package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiow {
    public final List a;
    public fiqr d = new fiqr("", null);
    public int e = 0;
    public int b = 0;
    public int c = 0;

    public fiow(List list) {
        this.a = list;
        if (list.isEmpty()) {
            return;
        }
        n(0, 0);
        o((fiqr) list.get(0));
    }

    public static fiow f(fiqs fiqsVar) {
        return new fiow(fiqsVar.a);
    }

    private final void n(int i, int i2) {
        if (i < 0 || i >= this.a.size()) {
            throw new IllegalArgumentException("Line index " + i + " out of range, number of lines: " + this.a.size());
        }
        fiqr fiqrVar = (fiqr) this.a.get(i);
        if (i2 < 0 || i2 > fiqrVar.a.length()) {
            throw new IllegalArgumentException("Index " + i2 + " out of range, line length: " + fiqrVar.a.length());
        }
    }

    private final void o(fiqr fiqrVar) {
        this.d = fiqrVar;
        this.e = fiqrVar.a.length();
    }

    public final char a() {
        int i = this.c;
        return i < this.e ? this.d.a.charAt(i) : this.b < this.a.size() + (-1) ? '\n' : (char) 0;
    }

    public final int b(char c) {
        int i = 0;
        while (true) {
            char a = a();
            if (a == 0) {
                return -1;
            }
            if (a == c) {
                return i;
            }
            h();
            i++;
        }
    }

    public final int c(char c) {
        int i = 0;
        while (a() == c) {
            h();
            i++;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d() {
        /*
            r3 = this;
            r0 = 0
        L1:
            char r1 = r3.a()
            r2 = 32
            if (r1 == r2) goto Ld
            switch(r1) {
                case 9: goto Ld;
                case 10: goto Ld;
                case 11: goto Ld;
                case 12: goto Ld;
                case 13: goto Ld;
                default: goto Lc;
            }
        Lc:
            return r0
        Ld:
            r3.h()
            int r0 = r0 + 1
            goto L1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fiow.d():int");
    }

    public final fiov e() {
        return new fiov(this.b, this.c);
    }

    public final fiqs g(fiov fiovVar, fiov fiovVar2) {
        int i = fiovVar.a;
        if (i == fiovVar2.a) {
            fiqr fiqrVar = (fiqr) this.a.get(i);
            CharSequence subSequence = fiqrVar.a.subSequence(fiovVar.b, fiovVar2.b);
            fiqf fiqfVar = fiqrVar.b;
            return fiqs.c(new fiqr(subSequence, null));
        }
        fiqs fiqsVar = new fiqs();
        fiqr fiqrVar2 = (fiqr) this.a.get(fiovVar.a);
        fiqsVar.d(fiqrVar2.a(fiovVar.b, fiqrVar2.a.length()));
        int i2 = fiovVar.a;
        while (true) {
            i2++;
            int i3 = fiovVar2.a;
            if (i2 >= i3) {
                fiqsVar.d(((fiqr) this.a.get(i3)).a(0, fiovVar2.b));
                return fiqsVar;
            }
            fiqsVar.d((fiqr) this.a.get(i2));
        }
    }

    public final void h() {
        int i = this.c + 1;
        this.c = i;
        if (i > this.e) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 < this.a.size()) {
                o((fiqr) this.a.get(this.b));
            } else {
                o(new fiqr("", null));
            }
            this.c = 0;
        }
    }

    public final void i(fiov fiovVar) {
        n(fiovVar.a, fiovVar.b);
        int i = fiovVar.a;
        this.b = i;
        this.c = fiovVar.b;
        o((fiqr) this.a.get(i));
    }

    public final boolean j() {
        return this.c < this.e || this.b < this.a.size() + (-1);
    }

    public final boolean k(char c) {
        if (a() != c) {
            return false;
        }
        h();
        return true;
    }

    public final boolean l(String str) {
        int i = this.c;
        int i2 = this.e;
        if (i < i2 && i + str.length() <= i2) {
            for (int i3 = 0; i3 < str.length(); i3++) {
                if (this.d.a.charAt(this.c + i3) == str.charAt(i3)) {
                }
            }
            this.c += str.length();
            return true;
        }
        return false;
    }

    public final int m(fioz fiozVar) {
        int i = 0;
        while (fiozVar.c(a())) {
            h();
            i++;
        }
        return i;
    }
}
