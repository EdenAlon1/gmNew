package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctvi {
    public static final cskc a = cskc.g("Bugle", "CountryCodeDetector");
    public final ffbr b;
    private String c;
    private String d;

    public ctvi(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    private final synchronized String f() {
        ctvb g;
        String str;
        String s = ((ctwb) this.b.b()).j().s();
        final String[] strArr = {s};
        if (TextUtils.isEmpty(s)) {
            ((ctwb) this.b.b()).o(new ctwa() { // from class: ctvg
                @Override // defpackage.ctwa
                public final boolean a(int i) {
                    String s2 = ((ctwb) ctvi.this.b.b()).h(i).s();
                    if (TextUtils.isEmpty(s2)) {
                        return true;
                    }
                    strArr[0] = s2;
                    csjb c = ctvi.a.c();
                    c.I("updateHomeCountry from SIM country.");
                    c.m(i);
                    c.A("detected country", s2);
                    c.r();
                    return false;
                }
            });
            if (TextUtils.isEmpty(strArr[0])) {
                String s2 = ((ctwb) this.b.b()).g().s();
                if (s2 == null) {
                    s2 = "";
                }
                strArr[0] = s2;
                csjb c = a.c();
                c.I("updateHomeCountry from system locale as fallback.");
                c.A("detected country", strArr[0]);
                c.r();
            }
        }
        g = ((ctwb) this.b.b()).g();
        str = strArr[0];
        str.getClass();
        return g.o(str);
    }

    private final synchronized String g(String str) {
        String p = ((ctwb) this.b.b()).j().p();
        final String[] strArr = {p};
        if (TextUtils.isEmpty(p)) {
            ((ctwb) this.b.b()).o(new ctwa() { // from class: ctvh
                @Override // defpackage.ctwa
                public final boolean a(int i) {
                    String p2 = ((ctwb) ctvi.this.b.b()).h(i).p();
                    if (TextUtils.isEmpty(p2)) {
                        return true;
                    }
                    strArr[0] = p2;
                    csjb c = ctvi.a.c();
                    c.I("updateSmsNetworkCountry from network country.");
                    c.m(i);
                    c.A("detected country", p2);
                    c.r();
                    return false;
                }
            });
            if (TextUtils.isEmpty(strArr[0])) {
                return str;
            }
        } else {
            csjb c = a.c();
            c.I("updateSmsNetworkCountry from default subscription network country.");
            c.A("detected country", strArr[0]);
            c.r();
        }
        ctvb g = ((ctwb) this.b.b()).g();
        String str2 = strArr[0];
        str2.getClass();
        return g.o(str2);
    }

    public final synchronized Optional a(int i) {
        String d;
        d = d(i);
        return TextUtils.isEmpty(d) ? Optional.empty() : Optional.of(d);
    }

    public final synchronized String b() {
        String str;
        if (this.d == null) {
            e();
        }
        str = this.d;
        if (str == null) {
            throw new NullPointerException("homeCountry is null");
        }
        return str;
    }

    public final synchronized String c() {
        String str;
        if (this.c == null) {
            e();
        }
        str = this.c;
        if (str == null) {
            throw new IllegalStateException("smsNetworkCountry is null");
        }
        return str;
    }

    public final synchronized String d(int i) {
        String p;
        ctwi h = ((ctwb) this.b.b()).h(i);
        p = h.p();
        if (TextUtils.isEmpty(p)) {
            p = h.s();
            if (TextUtils.isEmpty(p) && (p = ((ctwb) this.b.b()).g().s()) == null) {
                p = "";
            }
        }
        return ((ctwb) this.b.b()).g().o(p);
    }

    public final synchronized void e() {
        String f = f();
        this.d = f;
        this.c = g(f);
    }
}
