package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juo {
    public int a;
    public int b;
    public int c = -1;
    public int d = -1;
    private final jvk e;

    public juo(jlm jlmVar, long j) {
        this.e = new jvk(jlmVar.b);
        this.a = jpm.d(j);
        this.b = jpm.c(j);
        int d = jpm.d(j);
        int c = jpm.c(j);
        if (d < 0 || d > jlmVar.a()) {
            throw new IndexOutOfBoundsException("start (" + d + ") offset is outside of text region " + jlmVar.a());
        }
        if (c >= 0 && c <= jlmVar.a()) {
            if (d > c) {
                throw new IllegalArgumentException(a.r(c, d, "Do not set reversed range: ", " > "));
            }
        } else {
            throw new IndexOutOfBoundsException("end (" + c + ") offset is outside of text region " + jlmVar.a());
        }
    }

    private final void l(int i) {
        if (i < 0) {
            jwo.b(a.h(i, "Cannot set selectionEnd to a negative value: "));
        }
        this.b = i;
    }

    private final void m(int i) {
        if (i < 0) {
            jwo.b(a.h(i, "Cannot set selectionStart to a negative value: "));
        }
        this.a = i;
    }

    private static /* synthetic */ String n(juo juoVar, int i, String str) {
        return str + i + ") offset is outside of text region " + juoVar.e.a();
    }

    public final char a(int i) {
        jvk jvkVar = this.e;
        jur jurVar = jvkVar.b;
        if (jurVar == null) {
            return jvkVar.a.charAt(i);
        }
        int i2 = jvkVar.c;
        if (i < i2) {
            return jvkVar.a.charAt(i);
        }
        int b = jurVar.b();
        if (i >= b + i2) {
            return jvkVar.a.charAt(i - ((b - jvkVar.d) + i2));
        }
        int i3 = i - i2;
        int i4 = jurVar.c;
        if (i3 < i4) {
            return jurVar.b[i3];
        }
        return jurVar.b[(i3 - i4) + jurVar.d];
    }

    public final int b() {
        int i = this.a;
        int i2 = this.b;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int c() {
        return this.e.a();
    }

    public final long d() {
        long a = jpn.a(this.a, this.b);
        long j = jpm.a;
        return a;
    }

    public final jpm e() {
        if (k()) {
            return new jpm(jpn.a(this.c, this.d));
        }
        return null;
    }

    public final void f() {
        this.c = -1;
        this.d = -1;
    }

    public final void g(int i, int i2) {
        long a = jpn.a(i, i2);
        long j = jpm.a;
        this.e.b(i, i2, "");
        long a2 = jup.a(jpn.a(this.a, this.b), a);
        m(jpm.d(a2));
        l(jpm.c(a2));
        if (k()) {
            long a3 = jup.a(jpn.a(this.c, this.d), a);
            if (jpm.i(a3)) {
                f();
            } else {
                this.c = jpm.d(a3);
                this.d = jpm.c(a3);
            }
        }
    }

    public final void h(int i, int i2, String str) {
        if (i < 0 || i > this.e.a()) {
            throw new IndexOutOfBoundsException(n(this, i, "start ("));
        }
        if (i2 < 0 || i2 > this.e.a()) {
            throw new IndexOutOfBoundsException(n(this, i2, "end ("));
        }
        if (i > i2) {
            throw new IllegalArgumentException(a.r(i2, i, "Do not set reversed range: ", " > "));
        }
        this.e.b(i, i2, str);
        m(str.length() + i);
        l(i + str.length());
        this.c = -1;
        this.d = -1;
    }

    public final void i(int i, int i2) {
        if (i < 0 || i > this.e.a()) {
            throw new IndexOutOfBoundsException(n(this, i, "start ("));
        }
        if (i2 < 0 || i2 > this.e.a()) {
            throw new IndexOutOfBoundsException(n(this, i2, "end ("));
        }
        if (i >= i2) {
            throw new IllegalArgumentException(a.r(i2, i, "Do not set reversed or empty range: ", " > "));
        }
        this.c = i;
        this.d = i2;
    }

    public final void j(int i, int i2) {
        if (i < 0 || i > this.e.a()) {
            throw new IndexOutOfBoundsException(n(this, i, "start ("));
        }
        if (i2 < 0 || i2 > this.e.a()) {
            throw new IndexOutOfBoundsException(n(this, i2, "end ("));
        }
        if (i > i2) {
            throw new IllegalArgumentException(a.r(i2, i, "Do not set reversed range: ", " > "));
        }
        m(i);
        l(i2);
    }

    public final boolean k() {
        return this.c != -1;
    }

    public final String toString() {
        return this.e.toString();
    }
}
