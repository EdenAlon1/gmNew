package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fisp extends fisi {
    public fisp(fise fiseVar) {
        super(fiseVar);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int b(Locale locale) {
        return fiso.a(locale).l;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final String k(int i, Locale locale) {
        return fiso.a(locale).e[i];
    }

    @Override // defpackage.fisz, defpackage.fird
    public final String m(int i, Locale locale) {
        return fiso.a(locale).d[i];
    }

    @Override // defpackage.fisz
    protected final int y(String str, Locale locale) {
        Integer num = (Integer) fiso.a(locale).i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new firo(firf.h, str);
    }
}
