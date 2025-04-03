package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fisz extends fird {
    public final firf g;

    protected fisz(firf firfVar) {
        if (firfVar == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.g = firfVar;
    }

    @Override // defpackage.fird
    public abstract int a(long j);

    @Override // defpackage.fird
    public int b(Locale locale) {
        int c = c();
        if (c >= 0) {
            if (c < 10) {
                return 1;
            }
            if (c < 100) {
                return 2;
            }
            if (c < 1000) {
                return 3;
            }
        }
        return Integer.toString(c).length();
    }

    @Override // defpackage.fird
    public abstract int c();

    @Override // defpackage.fird
    public long e(long j, int i) {
        return q().a(j, i);
    }

    @Override // defpackage.fird
    public long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.fird
    public abstract long g(long j);

    @Override // defpackage.fird
    public abstract long h(long j, int i);

    @Override // defpackage.fird
    public long i(long j, String str, Locale locale) {
        return h(j, y(str, locale));
    }

    @Override // defpackage.fird
    public String k(int i, Locale locale) {
        return m(i, locale);
    }

    @Override // defpackage.fird
    public String l(long j, Locale locale) {
        return k(a(j), locale);
    }

    @Override // defpackage.fird
    public String m(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // defpackage.fird
    public String n(long j, Locale locale) {
        return m(a(j), locale);
    }

    @Override // defpackage.fird
    public final String o() {
        return this.g.y;
    }

    @Override // defpackage.fird
    public final firf p() {
        return this.g;
    }

    @Override // defpackage.fird
    public abstract firl q();

    @Override // defpackage.fird
    public firl r() {
        return null;
    }

    @Override // defpackage.fird
    public boolean t(long j) {
        return false;
    }

    public final String toString() {
        return "DateTimeField[" + o() + "]";
    }

    @Override // defpackage.fird
    public final boolean u() {
        return true;
    }

    public int w(long j) {
        return c();
    }

    protected int y(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new firo(this.g, str);
        }
    }
}
