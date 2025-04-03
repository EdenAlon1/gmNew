package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctvb implements cskg {
    public static final cskc a = cskc.g("Bugle", "BuglePhoneNumberUtils");
    private static final csjp f = new csjp(TimeUnit.SECONDS.toMillis(10));
    private static final csjp g = new csjp(TimeUnit.SECONDS.toMillis(10));
    private static final emyl h = emys.a(new emyl() { // from class: ctuw
        @Override // defpackage.emyl
        public final Object get() {
            cskc cskcVar = ctvb.a;
            return Pattern.compile("\\s");
        }
    });
    public final ffbr b;
    public final fazb c;
    public final ffbr d;
    public final ffbr e;
    private final Context j;
    private final ctvi k;
    private final cmh i = new cmh();
    private final emyl l = emys.a(new emyl() { // from class: ctux
        @Override // defpackage.emyl
        public final Object get() {
            cskc cskcVar = ctvb.a;
            return enip.o(((ezgw) dizg.o().a.am.a()).b);
        }
    });

    public ctvb(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ctvi ctviVar, fazb fazbVar) {
        this.j = context;
        this.b = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.k = ctviVar;
        this.c = fazbVar;
        csix.l(context);
    }

    private final cmh O(String str) {
        if (str == null) {
            str = "";
        }
        cmh cmhVar = (cmh) this.i.get(str);
        if (cmhVar != null) {
            return cmhVar;
        }
        cmh cmhVar2 = new cmh();
        this.i.put(str, cmhVar2);
        return cmhVar2;
    }

    public static Optional i(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 5) {
            return Optional.empty();
        }
        if (str.length() == 6) {
            return Optional.of(str);
        }
        return Optional.of(String.format(Locale.US, "%03d%03d", Integer.valueOf(Integer.parseInt(str.substring(0, 3))), Integer.valueOf(Integer.parseInt(str.substring(3)))));
    }

    public final String A() {
        return this.k.c();
    }

    public final String B(String str, esfi esfiVar) {
        csjb d = a.d();
        d.K(f, str);
        d.I("format if normalized.");
        d.k(str);
        d.A("format", esfiVar);
        d.r();
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return ((esfl) this.c.b()).b(e(str, null), esfiVar);
        } catch (esfg unused) {
            return str;
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [aoku, java.lang.Object] */
    public final HashSet C() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ctwb) this.e.b()).m().iterator();
        while (it.hasNext()) {
            Optional i = ((ctwb) this.e.b()).h(((ctwi) it.next()).a()).i(true);
            hashSet.add(i.isPresent() ? emxe.b(i.get().h()) : "");
        }
        return hashSet;
    }

    public final void D(String str, String str2, ctva ctvaVar) {
        synchronized (this.i) {
            O(str2).put(str, ctvaVar);
        }
    }

    @Deprecated
    public final boolean E() {
        return Settings.Global.getInt(((ctvs) this.d.b()).b.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    @Deprecated
    public final boolean F() {
        TelephonyManager telephonyManager = (TelephonyManager) ((ctvs) this.d.b()).d.get();
        return telephonyManager != null && telephonyManager.getPhoneType() == 2;
    }

    @Deprecated
    public final boolean G() {
        return ((ctvs) this.d.b()).d();
    }

    @Deprecated
    public final boolean H(String str) {
        try {
            return PhoneNumberUtils.isEmergencyNumber(str);
        } catch (Exception e) {
            a.o("isEmergencyNumber: unexpected exception", e);
            return false;
        }
    }

    public final boolean I(String str) {
        if (dktk.d(str)) {
            return false;
        }
        return str.equals(w(str, "", evpx.ZZ.eW, false));
    }

    public final boolean J(esfh esfhVar) {
        return ((esfl) this.c.b()).i(esfhVar);
    }

    @Deprecated
    public final boolean K() {
        return ((ctvs) this.d.b()).f();
    }

    @Deprecated
    public final boolean L(String str) {
        try {
            return ((esfl) this.c.b()).j(e(str, ""));
        } catch (esfg unused) {
            return false;
        }
    }

    public final boolean M(String str) {
        if (dktk.d(str) || str.charAt(0) != '+') {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return false;
            }
        }
        return true;
    }

    public final int N(esfh esfhVar) {
        return ((esfl) this.c.b()).m(esfhVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ctva a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            fazb r0 = r8.c
            java.lang.Object r0 = r0.b()
            esfl r0 = (defpackage.esfl) r0
            r1 = 0
            java.lang.String r2 = defpackage.emxe.a(r10)     // Catch: defpackage.esfg -> L73
            esfh r2 = r8.e(r9, r2)     // Catch: defpackage.esfg -> L73
            emyl r3 = r8.l     // Catch: defpackage.esfg -> L73
            java.lang.Object r3 = r3.get()     // Catch: defpackage.esfg -> L73
            enip r3 = (defpackage.enip) r3     // Catch: defpackage.esfg -> L73
            boolean r3 = r3.isEmpty()     // Catch: defpackage.esfg -> L73
            r4 = 1
            if (r3 != 0) goto L4a
            boolean r3 = r2.d()     // Catch: defpackage.esfg -> L73
            if (r3 != 0) goto L27
            goto L4a
        L27:
            ctvf r3 = new ctvf     // Catch: defpackage.esfg -> L73
            int r5 = r2.a()     // Catch: defpackage.esfg -> L73
            r3.<init>(r5)     // Catch: defpackage.esfg -> L73
            java.lang.String r3 = r8.z(r3)     // Catch: defpackage.esfg -> L73
            emyl r5 = r8.l     // Catch: defpackage.esfg -> L73
            java.lang.Object r5 = r5.get()     // Catch: defpackage.esfg -> L73
            enip r5 = (defpackage.enip) r5     // Catch: defpackage.esfg -> L73
            boolean r3 = r5.contains(r3)     // Catch: defpackage.esfg -> L73
            if (r3 == 0) goto L4a
            boolean r3 = r8.J(r2)     // Catch: defpackage.esfg -> L73
            if (r3 == 0) goto L4a
            r3 = r4
            goto L4b
        L4a:
            r3 = r1
        L4b:
            int r5 = r8.N(r2)     // Catch: defpackage.esfg -> L73
            if (r5 != r4) goto L53
            r5 = r4
            goto L54
        L53:
            r5 = r1
        L54:
            ctuq r6 = new ctuq     // Catch: defpackage.esfg -> L73
            r6.<init>()     // Catch: defpackage.esfg -> L73
            esfi r7 = defpackage.esfi.E164     // Catch: defpackage.esfg -> L73
            java.lang.String r0 = r0.b(r2, r7)     // Catch: defpackage.esfg -> L73
            r6.b(r0)     // Catch: defpackage.esfg -> L73
            if (r3 != 0) goto L68
            if (r5 == 0) goto L67
            goto L68
        L67:
            r4 = r1
        L68:
            r6.d(r4)     // Catch: defpackage.esfg -> L73
            r6.c(r5)     // Catch: defpackage.esfg -> L73
            ctva r9 = r6.a()     // Catch: defpackage.esfg -> L73
            return r9
        L73:
            r0 = move-exception
            cskc r2 = defpackage.ctvb.a
            csjb r2 = r2.a()
            java.lang.String r3 = "Not able to parse phone number"
            r2.I(r3)
            r2.k(r9)
            java.lang.String r3 = "for country"
            r2.I(r3)
            r2.I(r10)
            r2.s(r0)
            ctuq r10 = new ctuq
            r10.<init>()
            r10.b(r9)
            r10.d(r1)
            r10.c(r1)
            ctva r9 = r10.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctvb.a(java.lang.String, java.lang.String):ctva");
    }

    public final ctva b(String str, String str2) {
        ctva ctvaVar;
        synchronized (this.i) {
            ctvaVar = (ctva) O(str2).get(str);
        }
        return ctvaVar;
    }

    public final ctvf c(String str) {
        return new ctvf(((esfl) this.c.b()).a(str));
    }

    public final enip d() {
        return (enip) Collection.EL.stream(((ctwb) this.e.b()).m()).map(new Function() { // from class: ctuu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ctwb) ctvb.this.e.b()).h(((ctwi) obj).a()).i(true);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).flatMap(new Function() { // from class: ctuv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Optional) obj).stream();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b);
    }

    public final esfh e(String str, String str2) {
        return ((esfl) this.c.b()).n(((Pattern) h.get()).matcher(str).replaceAll(""), str2);
    }

    public final Optional f(String str) {
        try {
            return Optional.of(new ctvf(e(str, "").a()));
        } catch (esfg unused) {
            return Optional.empty();
        }
    }

    public final Optional g(String str, String str2) {
        try {
            return Optional.of(new ctvf(e(str, str2).a()));
        } catch (esfg unused) {
            return Optional.empty();
        }
    }

    public final Optional h() {
        TelephonyManager telephonyManager = (TelephonyManager) ((ctvs) this.d.b()).d.get();
        return i(telephonyManager == null ? null : telephonyManager.getSimOperator());
    }

    public final Optional j() {
        if (dizg.N()) {
            return Optional.ofNullable(emxe.a(r()));
        }
        ffbr ffbrVar = this.b;
        ffbrVar.getClass();
        String b = ((ctuy) ffbrVar.b()).b();
        if (ctxu.a(b)) {
            b = s();
        }
        return Optional.ofNullable(emxe.a(b));
    }

    public final String k(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return String.format(kqt.a(this.j.getResources().getConfiguration()).f(0), "%03d%03d", Integer.valueOf(Integer.parseInt(str)), Integer.valueOf(Integer.parseInt(str2)));
            } catch (NumberFormatException unused) {
            }
        }
        csjb e = a.e();
        e.I("canonicalizeMccMnc: invalid mccmnc.");
        e.A("mcc", str);
        e.A("mnc", str2);
        e.r();
        return String.valueOf(str).concat(String.valueOf(str2));
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        synchronized (this.i) {
            this.i.clear();
            ((esfl) this.c.b()).p();
        }
    }

    public final String m(esfh esfhVar, esfi esfiVar) {
        return ((esfl) this.c.b()).b(esfhVar, esfiVar);
    }

    @Deprecated
    public final String n(String str) {
        return B(str, esfi.INTERNATIONAL);
    }

    final String o(String str) {
        return str.toUpperCase(kqt.a(this.j.getResources().getConfiguration()).f(0));
    }

    @Deprecated
    public final String p(String str) {
        csix.l(this.b);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int a2 = ((ctuy) this.b.b()).a();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.isDigit(str.charAt(i2))) {
                i++;
            }
        }
        if (i < a2) {
            return str;
        }
        String r = r();
        ctvf ctvfVar = (dizg.N() && r.isEmpty()) ? new ctvf(0) : c(r);
        try {
            esfh e = e(str, r);
            ctvf ctvfVar2 = new ctvf(e.a());
            esfi esfiVar = (ctvfVar.a() || !ctvfVar2.equals(ctvfVar)) ? esfi.INTERNATIONAL : esfi.NATIONAL;
            String b = ((esfl) this.c.b()).b(e, esfiVar);
            csjb d = a.d();
            d.K(g, str);
            d.I("format for display.");
            d.k(str);
            d.I("-->");
            d.k(b);
            d.A("systemCountry", r);
            d.A("systemCountryCode", ctvfVar);
            d.A("callCode", ctvfVar2);
            d.A("phoneNumberFormat", esfiVar);
            d.r();
            return b;
        } catch (esfg e2) {
            csjb e3 = a.e();
            e3.I("formatForDisplay: invalid phone number");
            e3.k(str);
            e3.I("with country");
            e3.I(r);
            e3.s(e2);
            return str;
        }
    }

    @Deprecated
    public final String q() {
        return ((ctvs) this.d.b()).a();
    }

    public final String r() {
        csix.l(this.b);
        String b = ((ctuy) this.b.b()).b();
        return ctxu.a(b) ? dizg.N() ? this.k.b() : this.k.c() : b;
    }

    public final String s() {
        Locale f2 = kqt.a(this.j.getResources().getConfiguration()).f(0);
        String country = f2.getCountry();
        if (TextUtils.isEmpty(country)) {
            return null;
        }
        return country.toUpperCase(f2);
    }

    public final String t(int[] iArr) {
        return String.format(kqt.a(this.j.getResources().getConfiguration()).f(0), "%03d%03d", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public final String u(esfh esfhVar) {
        return ((esfl) this.c.b()).d(esfhVar);
    }

    public final String v(String str, String str2) {
        return w(str, str, str2, false);
    }

    public final String w(String str, String str2, String str3, boolean z) {
        ctva b = b(str, str3);
        if (b == null) {
            b = a(str, str3);
            D(str, str3, b);
        }
        if (b.c() || !z) {
            return b.c() ? b.a() : str2;
        }
        throw new IllegalArgumentException("Phone number could not be normalized");
    }

    public final String x(String str) {
        return v(str, r());
    }

    public final String y(String str, boolean z) {
        return w(str, str, (String) j().orElse(evpx.ZZ.eW), z);
    }

    public final String z(ctvf ctvfVar) {
        return ((esfl) this.c.b()).e(ctvfVar.a);
    }
}
