package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class roa {
    protected final String a;
    protected int c;
    protected int b = 0;
    private final rlb d = new rlb();

    public roa(String str) {
        this.c = 0;
        String trim = str.trim();
        this.a = trim;
        this.c = trim.length();
    }

    protected static final boolean s(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public final float b(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        q();
        return c();
    }

    public final float c() {
        float a = this.d.a(this.a, this.b, this.c);
        if (!Float.isNaN(a)) {
            this.b = this.d.a;
        }
        return a;
    }

    public final float d() {
        q();
        float a = this.d.a(this.a, this.b, this.c);
        if (!Float.isNaN(a)) {
            this.b = this.d.a;
        }
        return a;
    }

    protected final int e() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.b = i3;
        if (i3 < i2) {
            return this.a.charAt(i3);
        }
        return -1;
    }

    public final rlr f() {
        float c = c();
        if (Float.isNaN(c)) {
            return null;
        }
        int r = r();
        return r == 0 ? new rlr(c, 1) : new rlr(c, r);
    }

    public final Boolean g(Object obj) {
        if (obj == null) {
            return null;
        }
        q();
        int i = this.b;
        if (i != this.c) {
            char charAt = this.a.charAt(i);
            if (charAt != '0') {
                if (charAt == '1') {
                    charAt = '1';
                }
            }
            this.b++;
            return Boolean.valueOf(charAt == '1');
        }
        return null;
    }

    public final Integer h() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        String str = this.a;
        this.b = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public final String i() {
        if (!o()) {
            int i = this.b;
            char charAt = this.a.charAt(i);
            if (charAt != '\'') {
                if (charAt == '\"') {
                    charAt = '\"';
                }
            }
            int e = e();
            while (e != -1) {
                if (e == charAt) {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return this.a.substring(i + 1, i2);
                }
                e = e();
            }
            this.b = i;
            return null;
        }
        return null;
    }

    public final String j() {
        return k(' ');
    }

    public final String k(char c) {
        if (o()) {
            return null;
        }
        char charAt = this.a.charAt(this.b);
        if (s(charAt) || charAt == c) {
            return null;
        }
        int i = this.b;
        int e = e();
        while (e != -1 && e != c && !s(e)) {
            e = e();
        }
        return this.a.substring(i, this.b);
    }

    public final void l() {
        while (true) {
            int i = this.b;
            if (i >= this.c || !s(this.a.charAt(i))) {
                return;
            } else {
                this.b++;
            }
        }
    }

    public final boolean m(char c) {
        int i = this.b;
        boolean z = false;
        if (i < this.c && this.a.charAt(i) == c) {
            z = true;
        }
        if (z) {
            this.b++;
        }
        return z;
    }

    public final boolean n(String str) {
        int i = this.b;
        int i2 = this.c;
        int length = str.length();
        boolean z = false;
        if (i <= i2 - length && this.a.substring(i, i + length).equals(str)) {
            z = true;
        }
        if (z) {
            this.b += length;
        }
        return z;
    }

    public final boolean o() {
        return this.b == this.c;
    }

    public final boolean p() {
        int i = this.b;
        if (i == this.c) {
            return false;
        }
        char charAt = this.a.charAt(i);
        if (charAt < 'a' || charAt > 'z') {
            return charAt >= 'A' && charAt <= 'Z';
        }
        return true;
    }

    public final boolean q() {
        l();
        int i = this.b;
        if (i == this.c || this.a.charAt(i) != ',') {
            return false;
        }
        this.b++;
        l();
        return true;
    }

    public final int r() {
        if (o()) {
            return 0;
        }
        if (this.a.charAt(this.b) == '%') {
            this.b++;
            return 9;
        }
        int i = this.b;
        if (i > this.c - 2) {
            return 0;
        }
        try {
            int a = rne.a(this.a.substring(i, i + 2).toLowerCase(Locale.US));
            this.b += 2;
            return a;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }
}
