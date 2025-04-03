package defpackage;

import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djvf {
    public volatile dktn a;
    public volatile String b;
    public final Optional c;

    public djvf(String str, Optional optional) {
        this.b = str;
        this.c = optional;
    }

    private static String g(String str, Object... objArr) {
        return objArr.length == 0 ? str : String.format(Locale.US, str, objArr);
    }

    public final void a(String str, Object... objArr) {
        dkty.d(this.a, "%s [%s]", g(str, objArr), this.b);
    }

    public final void b(String str, Object... objArr) {
        dkty.h(this.a, "%s [%s]", g(str, objArr), this.b);
    }

    public final void c(Throwable th, String str, Object... objArr) {
        dkty.j(th, this.a, "%s [%s]", g(str, objArr), this.b);
    }

    public final void d(String str, Object... objArr) {
        dkty.l(this.a, "%s [%s]", g(str, objArr), this.b);
    }

    public final void e(String str, Object... objArr) {
        dkty.r(this.a, "%s [%s]", g(str, objArr), this.b);
    }

    public final void f(Throwable th, String str, Object... objArr) {
        dkty.t(th, this.a, "%s [%s]", g(str, objArr), this.b);
    }
}
