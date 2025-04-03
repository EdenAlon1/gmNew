package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fuh {
    public final ffmj a;
    public final Locale b;
    public final ham c;
    public final hho d;
    private final hho e;

    public fuh(Long l, ffmj ffmjVar, dmug dmugVar, Locale locale) {
        haq f;
        this.a = ffmjVar;
        this.b = locale;
        hao haoVar = new hao(locale);
        this.c = haoVar;
        this.d = new hic(dmugVar, hla.a);
        if (l != null) {
            f = haoVar.e(l.longValue());
            if (!ffmjVar.e(f.a)) {
                f = haoVar.f(haoVar.c());
            }
        } else {
            f = haoVar.f(haoVar.c());
        }
        this.e = new hic(f, hla.a);
    }

    public final long a() {
        return ((haq) this.e.a()).e;
    }

    public final void b(long j) {
        haq e = this.c.e(j);
        if (this.a.e(e.a)) {
            this.e.b(e);
        }
    }
}
