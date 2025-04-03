package defpackage;

import android.content.Context;
import android.telephony.SmsManager;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azti implements ctwi {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionUtilsWrapper");
    public final ctwi a;
    private final cosz c;
    private final ffbr d;

    public azti(ctwi ctwiVar, cosz coszVar, ffbr ffbrVar) {
        coszVar.getClass();
        ffbrVar.getClass();
        this.a = ctwiVar;
        this.c = coszVar;
        this.d = ffbrVar;
        if (ctwiVar.a() != -1) {
            int a = ctwiVar.a();
            int i = coszVar.d;
            if (a == i) {
                return;
            }
            throw new IllegalArgumentException("subIds mismatch " + ctwiVar.a() + ", " + i);
        }
    }

    @Override // defpackage.ctwi
    public final boolean A() {
        return this.a.A();
    }

    @Override // defpackage.ctwi
    public final boolean B() {
        return this.a.B();
    }

    @Override // defpackage.ctwi
    public final boolean C() {
        return this.a.C();
    }

    @Override // defpackage.ctwi
    public final boolean D() {
        return this.a.D();
    }

    @Override // defpackage.ctwi
    public final int[] E() {
        return this.a.E();
    }

    @Override // defpackage.ctwi
    public final int a() {
        return this.c.d;
    }

    @Override // defpackage.ctwi
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.ctwi
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.ctwi
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.ctwi
    public final int e() {
        return this.a.e();
    }

    @Override // defpackage.ctwi
    public final SmsManager f() {
        return this.a.f();
    }

    @Override // defpackage.ctwi
    public final aoku g(String str) {
        return this.a.g(str);
    }

    @Override // defpackage.ctwi
    public final Optional h() {
        return this.a.h();
    }

    @Override // defpackage.ctwi
    public final Optional i(boolean z) {
        return k(z);
    }

    @Override // defpackage.ctwi
    public final Optional j() {
        return this.a.j();
    }

    @Override // defpackage.ctwi
    public final Optional k(boolean z) {
        String str = this.c.g;
        if (str != null && str.length() != 0) {
            return Optional.of(((aolr) this.d.b()).c(this.c.g, new emyl() { // from class: azth
                @Override // defpackage.emyl
                public final Object get() {
                    String s = azti.this.a.s();
                    if (s.length() == 0) {
                        s = null;
                    }
                    return Optional.ofNullable(s);
                }
            }));
        }
        ensk h = b.h();
        h.Y(ente.a, "BugleSelfIdentity");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.t, Integer.valueOf(a()));
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionUtilsWrapper", "getMessagingIdentity", 47, "SubscriptionUtilsWrapper.kt")).q("empty phone number from override");
        return Optional.empty();
    }

    @Override // defpackage.ctwi
    public final CharSequence l() {
        return this.a.l();
    }

    @Override // defpackage.ctwi
    public final CharSequence m() {
        return this.a.m();
    }

    @Override // defpackage.ctwi
    public final String n() {
        return this.a.n();
    }

    @Override // defpackage.ctwi
    public final String o() {
        return this.a.o();
    }

    @Override // defpackage.ctwi
    public final String p() {
        return this.a.p();
    }

    @Override // defpackage.ctwi
    public final String q() {
        return this.a.q();
    }

    @Override // defpackage.ctwi
    public final String r() {
        String str = this.c.u;
        str.getClass();
        return str;
    }

    @Override // defpackage.ctwi
    public final String s() {
        return this.a.s();
    }

    @Override // defpackage.ctwi
    @ffbs
    public final String t(Locale locale) {
        return this.a.t(locale);
    }

    @Override // defpackage.ctwi
    public final String u() {
        return this.a.u();
    }

    @Override // defpackage.ctwi
    public final String v() {
        return this.a.v();
    }

    @Override // defpackage.ctwi
    public final String w() {
        String str = this.c.n;
        str.getClass();
        return str;
    }

    @Override // defpackage.ctwi
    public final String x() {
        return this.a.x();
    }

    @Override // defpackage.ctwi
    public final String y(Context context) {
        return this.a.y(context);
    }

    @Override // defpackage.ctwi
    public final boolean z(int i) {
        return this.a.z(i);
    }
}
