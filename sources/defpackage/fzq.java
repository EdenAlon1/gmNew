package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzq {
    public Long a;
    private final ffmj b;
    private final haw c;
    private final String d;
    private final String e;
    private final String f;
    private final gae g;
    private final dmug h;

    public fzq(ffmj ffmjVar, dmug dmugVar, haw hawVar, gae gaeVar, String str, String str2, String str3) {
        this.b = ffmjVar;
        this.h = dmugVar;
        this.c = hawVar;
        this.g = gaeVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final String a(hal halVar, Locale locale) {
        String a;
        if (halVar == null) {
            String str = this.d;
            String upperCase = this.c.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return hcb.a(str, upperCase);
        }
        if (!this.b.e(halVar.a)) {
            return hcb.a(this.e, fwc.a(this.b.a, 0, 7), fwc.a(this.b.b, 0, 7));
        }
        dmug dmugVar = this.h;
        if (dmugVar.b(halVar.a) && dmugVar.a(halVar.c)) {
            return "";
        }
        String str2 = this.f;
        a = this.g.a(Long.valueOf(halVar.c), locale, false);
        return hcb.a(str2, a);
    }
}
