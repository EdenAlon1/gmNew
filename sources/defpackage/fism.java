package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fism extends fitk {
    private final fise b;

    public fism(fise fiseVar, firl firlVar) {
        super(firf.m, firlVar);
        this.b = fiseVar;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int a(long j) {
        return this.b.O(j);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int b(Locale locale) {
        return fiso.a(locale).k;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int c() {
        return 7;
    }

    @Override // defpackage.fitk, defpackage.fird
    public final int d() {
        return 1;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final String k(int i, Locale locale) {
        return fiso.a(locale).c[i];
    }

    @Override // defpackage.fisz, defpackage.fird
    public final String m(int i, Locale locale) {
        return fiso.a(locale).b[i];
    }

    @Override // defpackage.fird
    public final firl s() {
        return this.b.d;
    }

    @Override // defpackage.fisz
    protected final int y(String str, Locale locale) {
        Integer num = (Integer) fiso.a(locale).h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new firo(firf.m, str);
    }
}
