package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crlf implements crln {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyy MM dd HH:mm:ss.SSS", Locale.US);
    private final ctyx b;
    private final dkpp c;
    private final cort d;
    private final ffbr e;

    public crlf(ctyx ctyxVar, dkpp dkppVar, cort cortVar, ffbr ffbrVar) {
        this.b = ctyxVar;
        this.c = dkppVar;
        this.d = cortVar;
        this.e = ffbrVar;
    }

    private final void g() {
        String l = ((atrw) this.e.b()).a() ? (String) this.d.h(cors.a).map(new Function() { // from class: crle
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cosz) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("") : this.c.l();
        if (l.equals(this.b.f("UPSELL_PROMPT_SIM_ID", ""))) {
            return;
        }
        this.b.n("PROMPT_COUNT");
        this.b.n("LAST_UPSELL_PROMPT_TIME");
        this.b.n("USER_ACCEPTED_UPSELL");
        this.b.l("UPSELL_PROMPT_SIM_ID", l);
    }

    @Override // defpackage.crln
    public final int a() {
        g();
        return this.b.d("PROMPT_COUNT", 0);
    }

    @Override // defpackage.crln
    public final Optional b() {
        g();
        if (!this.b.p("LAST_UPSELL_PROMPT_TIME")) {
            return Optional.empty();
        }
        try {
            return Optional.of(a.parse(this.b.f("LAST_UPSELL_PROMPT_TIME", "")));
        } catch (ParseException unused) {
            return Optional.empty();
        }
    }

    @Override // defpackage.crln
    public final void c() {
        g();
        this.b.j("PROMPT_COUNT", a() + 1);
    }

    @Override // defpackage.crln
    public final void d(Date date) {
        g();
        this.b.l("LAST_UPSELL_PROMPT_TIME", a.format(date));
    }

    @Override // defpackage.crln
    public final void e(boolean z) {
        g();
        this.b.h("USER_ACCEPTED_UPSELL", z);
    }

    @Override // defpackage.crln
    public final boolean f() {
        g();
        return this.b.q("USER_ACCEPTED_UPSELL", false);
    }
}
