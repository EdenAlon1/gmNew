package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.telephony.SmsManager;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctwq implements ctwi {
    private static final cskc c = cskc.g("Bugle", "SubscriptionUtilsFake");
    public final ctvi a;
    public final ctwp b;
    private final ctwb d;
    private final aobh e;

    static {
        "gbaKey".getBytes(StandardCharsets.UTF_8);
    }

    public ctwq(ctvi ctviVar, ctwb ctwbVar, ctwp ctwpVar, aobh aobhVar) {
        this.a = ctviVar;
        this.d = ctwbVar;
        this.b = ctwpVar;
        this.e = aobhVar;
    }

    @Override // defpackage.ctwi
    public final boolean A() {
        return ((ctut) this.b).c != null;
    }

    @Override // defpackage.ctwi
    public final boolean B() {
        return false;
    }

    @Override // defpackage.ctwi
    public final boolean C() {
        return false;
    }

    @Override // defpackage.ctwi
    public final boolean D() {
        return ((ctut) this.b).b;
    }

    @Override // defpackage.ctwi
    public final int[] E() {
        ctut ctutVar = (ctut) this.b;
        return new int[]{ctutVar.j, ctutVar.k};
    }

    @Override // defpackage.ctwi
    public final int a() {
        return ((ctut) this.b).a;
    }

    @Override // defpackage.ctwi
    public final int b() {
        return 0;
    }

    @Override // defpackage.ctwi
    public final int c() {
        return 0;
    }

    @Override // defpackage.ctwi
    public final int d() {
        return ((ctut) this.b).d;
    }

    @Override // defpackage.ctwi
    public final int e() {
        return ((ctut) this.b).o;
    }

    @Override // defpackage.ctwi
    public final SmsManager f() {
        return SmsManager.getSmsManagerForSubscriptionId(SmsManager.getDefaultSmsSubscriptionId());
    }

    @Override // defpackage.ctwi
    public final aoku g(String str) {
        return this.e.j(this.e.c(str, new emyl() { // from class: ctwm
            @Override // defpackage.emyl
            public final Object get() {
                ctwq ctwqVar = ctwq.this;
                return ctwqVar.a.a(((ctut) ctwqVar.b).a);
            }
        }), ((ctut) this.b).a);
    }

    @Override // defpackage.ctwi
    public final Optional h() {
        return Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [aoku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [aoku, java.lang.Object] */
    @Override // defpackage.ctwi
    public final Optional i(boolean z) {
        Optional k = k(z);
        if (k.isEmpty()) {
            return Optional.empty();
        }
        String s = s();
        String v = this.d.g().v(emxe.b(k.get().j()), s);
        cskc cskcVar = c;
        if (cskcVar.t(2)) {
            csjb d = cskcVar.d();
            d.I("SubscriptionUtils.getCanonicalForSelf: self=");
            d.k(v);
            d.A("country", s);
            d.I(s);
            d.r();
        }
        return Optional.of(this.e.h(k.get(), v));
    }

    @Override // defpackage.ctwi
    public final Optional j() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("enableMultipartSMS", false);
        bundle.putInt("smsToMmsTextLengthThreshold", -1);
        bundle.putInt("systemCarrierConfig", 2);
        return Optional.of(bundle);
    }

    @Override // defpackage.ctwi
    public final Optional k(boolean z) {
        emyl emylVar = new emyl() { // from class: ctwn
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.of(((ctut) ctwq.this.b).l);
            }
        };
        return Optional.of(this.e.c(((ctut) this.b).i, emylVar));
    }

    @Override // defpackage.ctwi
    public final CharSequence l() {
        return ((ctut) this.b).g;
    }

    @Override // defpackage.ctwi
    public final CharSequence m() {
        return ((ctut) this.b).e;
    }

    @Override // defpackage.ctwi
    public final String n() {
        return emxe.b(((ctut) this.b).c);
    }

    @Override // defpackage.ctwi
    public final String o() {
        return "";
    }

    @Override // defpackage.ctwi
    public final String p() {
        return ((ctut) this.b).m;
    }

    @Override // defpackage.ctwi
    public final String q() {
        return ((ctut) this.b).g;
    }

    @Override // defpackage.ctwi
    public final String r() {
        return ((ctut) this.b).f;
    }

    @Override // defpackage.ctwi
    public final String s() {
        return ((ctut) this.b).l;
    }

    @Override // defpackage.ctwi
    public final String t(Locale locale) {
        return ((ctut) this.b).l;
    }

    public final String toString() {
        return m().toString();
    }

    @Override // defpackage.ctwi
    public final String u() {
        return ((ctut) this.b).h;
    }

    @Override // defpackage.ctwi
    public final String v() {
        ctut ctutVar = (ctut) this.b;
        return ctutVar.j + Integer.toString(ctutVar.k);
    }

    @Override // defpackage.ctwi
    public final String w() {
        return emxe.b(((ctut) this.b).c);
    }

    @Override // defpackage.ctwi
    public final String x() {
        return "";
    }

    @Override // defpackage.ctwi
    public final String y(Context context) {
        return ((ctut) this.b).n;
    }

    @Override // defpackage.ctwi
    public final boolean z(int i) {
        return false;
    }
}
