package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fisc extends fitj {
    public fisc() {
        super(firf.n, fise.s, fise.t);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int b(Locale locale) {
        return fiso.a(locale).m;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long i(long j, String str, Locale locale) {
        String[] strArr = fiso.a(locale).f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new firo(firf.n, str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return h(j, length);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final String m(int i, Locale locale) {
        return fiso.a(locale).f[i];
    }
}
