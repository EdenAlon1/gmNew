package defpackage;

import android.content.Context;
import android.telephony.SmsManager;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctwu implements ctwi {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl");
    public final int a;
    public final ctvi b;
    private final ctwb d;
    private final aobh e;
    private final ctuy f;
    private final ffbr g;
    private final ctwy h;

    public ctwu(ctwb ctwbVar, aobh aobhVar, ctvi ctviVar, ffbr ffbrVar, ctuy ctuyVar, ctwy ctwyVar, int i) {
        this.a = i;
        this.d = ctwbVar;
        this.e = aobhVar;
        this.b = ctviVar;
        this.f = ctuyVar;
        this.h = ctwyVar;
        this.g = ffbrVar;
    }

    @Override // defpackage.ctwi
    public final boolean A() {
        return this.h.w();
    }

    @Override // defpackage.ctwi
    public final boolean B() {
        return this.h.x();
    }

    @Override // defpackage.ctwi
    public final boolean C() {
        return this.h.y();
    }

    @Override // defpackage.ctwi
    public final boolean D() {
        return this.h.z();
    }

    @Override // defpackage.ctwi
    public final int[] E() {
        return this.h.A();
    }

    @Override // defpackage.ctwi
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ctwi
    public final int b() {
        return this.h.a();
    }

    @Override // defpackage.ctwi
    public final int c() {
        return this.h.b();
    }

    @Override // defpackage.ctwi
    public final int d() {
        return this.h.c();
    }

    @Override // defpackage.ctwi
    public final int e() {
        return this.h.d();
    }

    @Override // defpackage.ctwi
    public final SmsManager f() {
        return this.h.e();
    }

    @Override // defpackage.ctwi
    public final aoku g(String str) {
        return this.e.j(this.e.c(str, new emyl() { // from class: ctwr
            @Override // defpackage.emyl
            public final Object get() {
                ctwu ctwuVar = ctwu.this;
                return ctwuVar.b.a(ctwuVar.a);
            }
        }), this.a);
    }

    @Override // defpackage.ctwi
    public final Optional h() {
        return this.h.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [aoku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aoku, java.lang.Object] */
    @Override // defpackage.ctwi
    public final Optional i(boolean z) {
        Optional k = k(z);
        if (k.isEmpty()) {
            return Optional.empty();
        }
        String s = s();
        String v = this.d.g().v(emxe.b(k.get().j()), s);
        ensk h = c.h();
        h.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.t, Integer.valueOf(this.a));
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl", "getCanonicalForSelf", 284, "SubscriptionUtilsImpl.java")).D("SubscriptionUtils.getCanonicalForSelf: self=%s, country=%s", cskt.b(v), s);
        return Optional.of(this.e.h(k.get(), v));
    }

    @Override // defpackage.ctwi
    public final Optional j() {
        return this.h.g();
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ctwi
    public final Optional k(boolean z) {
        if (z) {
            String c2 = this.f.c(this.a);
            if (!TextUtils.isEmpty(c2)) {
                return Optional.of(this.e.c(c2, new emyl() { // from class: ctws
                    @Override // defpackage.emyl
                    public final Object get() {
                        return Optional.of(ctwu.this.s());
                    }
                }));
            }
        }
        if (this.f.d()) {
            ensk h = c.h();
            h.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.t, Integer.valueOf(this.a));
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl", "getMessagingIdentity", 178, "SubscriptionUtilsImpl.java")).q("getMessagingIdentity: Emulating unknown SIM number");
            return Optional.empty();
        }
        Optional h2 = this.h.h();
        if (h2.isEmpty()) {
            ensk e = c.e();
            e.Y(ente.a, "Bugle");
            enrr enrrVar2 = (enrr) e;
            enrrVar2.Y(csux.t, Integer.valueOf(this.a));
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl", "getMessagingIdentity", 186, "SubscriptionUtilsImpl.java")).q("String phone number for self is empty!");
            return Optional.empty();
        }
        final String s = s();
        if (((esfl) this.g.b()).h((String) h2.get(), s)) {
            return Optional.of(this.e.c((String) h2.get(), new emyl() { // from class: ctwt
                @Override // defpackage.emyl
                public final Object get() {
                    return Optional.of(s);
                }
            }));
        }
        ensk h3 = c.h();
        h3.Y(ente.a, "Bugle");
        enrr enrrVar3 = (enrr) h3;
        enrrVar3.Y(csux.t, Integer.valueOf(this.a));
        ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/util/phone/SubscriptionUtilsImpl", "getMessagingIdentity", 198, "SubscriptionUtilsImpl.java")).D("Delegate phone number for self is invalid! With country=%s and number=%s", s, cskt.b(h2.get()));
        return Optional.empty();
    }

    @Override // defpackage.ctwi
    public final CharSequence l() {
        return this.h.i();
    }

    @Override // defpackage.ctwi
    public final CharSequence m() {
        return this.h.j();
    }

    @Override // defpackage.ctwi
    public final String n() {
        return this.h.k();
    }

    @Override // defpackage.ctwi
    public final String o() {
        return this.h.l();
    }

    @Override // defpackage.ctwi
    public final String p() {
        return this.h.m();
    }

    @Override // defpackage.ctwi
    public final String q() {
        return this.h.n();
    }

    @Override // defpackage.ctwi
    public final String r() {
        return this.h.o();
    }

    @Override // defpackage.ctwi
    public final String s() {
        String p = this.h.p();
        return TextUtils.isEmpty(p) ? "" : p.toUpperCase(Locale.US);
    }

    @Override // defpackage.ctwi
    public final String t(Locale locale) {
        return s();
    }

    public final String toString() {
        return m().toString();
    }

    @Override // defpackage.ctwi
    public final String u() {
        return this.h.q();
    }

    @Override // defpackage.ctwi
    public final String v() {
        return this.h.r();
    }

    @Override // defpackage.ctwi
    public final String w() {
        return this.h.s();
    }

    @Override // defpackage.ctwi
    public final String x() {
        return this.h.t();
    }

    @Override // defpackage.ctwi
    public final String y(Context context) {
        return this.h.u(context);
    }

    @Override // defpackage.ctwi
    public final boolean z(int i) {
        return this.h.v(i);
    }
}
