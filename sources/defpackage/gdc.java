package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdc extends fuh implements gcz {
    public final hho e;
    public final hho f;

    public gdc(Long l, Long l2, ffmj ffmjVar, int i, dmug dmugVar, Locale locale) {
        super(l2, ffmjVar, dmugVar, locale);
        hal halVar = null;
        if (l != null) {
            hal b = this.c.b(l.longValue());
            if (ffmjVar.e(b.a)) {
                halVar = b;
            }
        }
        this.e = new hic(halVar, hla.a);
        this.f = new hic(new gdj(i), hla.a);
    }

    @Override // defpackage.gcz
    public final int c() {
        return ((gdj) this.f.a()).a;
    }

    @Override // defpackage.gcz
    public final Long d() {
        hal halVar = (hal) this.e.a();
        if (halVar != null) {
            return Long.valueOf(halVar.c);
        }
        return null;
    }
}
