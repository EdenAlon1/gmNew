package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fisn extends fisz {
    private final fise a;

    public fisn(fise fiseVar) {
        super(firf.b);
        this.a = fiseVar;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int a(long j) {
        return this.a.Y(j) <= 0 ? 0 : 1;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int b(Locale locale) {
        return fiso.a(locale).j;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int c() {
        return 1;
    }

    @Override // defpackage.fird
    public final int d() {
        return 0;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long g(long j) {
        if (a(j) == 1) {
            return this.a.ae(0L, 1);
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long h(long j, int i) {
        fite.c(this, i, 0, 1);
        if (a(j) == i) {
            return j;
        }
        return this.a.ae(j, -this.a.Y(j));
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long i(long j, String str, Locale locale) {
        Integer num = (Integer) fiso.a(locale).g.get(str);
        if (num != null) {
            return h(j, num.intValue());
        }
        throw new firo(firf.b, str);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final String m(int i, Locale locale) {
        return fiso.a(locale).a[i];
    }

    @Override // defpackage.fisz, defpackage.fird
    public final firl q() {
        return fitp.h(firn.a);
    }

    @Override // defpackage.fird
    public final firl s() {
        return null;
    }

    @Override // defpackage.fird
    public final void v() {
    }
}
