package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aciu implements acip {
    private static final cskc e = cskc.g("DittoClearcutLogger", "SatelliteClearcutLogger");
    public final ffbr a;
    public final Object b = new Object();
    public final AtomicBoolean c = new AtomicBoolean(true);
    public String d = "";
    private final ffbr f;
    private final errl g;
    private final bzed h;
    private final Optional i;
    private final errl j;

    public aciu(bzed bzedVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2) {
        this.a = ffbrVar;
        this.f = ffbrVar2;
        this.g = errlVar;
        this.h = bzedVar;
        this.i = optional;
        this.j = errlVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ezmh p(int i) {
        char c;
        ezmh ezmhVar = (ezmh) ezmk.a.createBuilder();
        ezmhVar.copyOnWrite();
        ((ezmk) ezmhVar.instance).e = ezmj.a(i);
        ezmhVar.copyOnWrite();
        ((ezmk) ezmhVar.instance).g = ezmi.a(9);
        String str = (String) acrz.a.e();
        switch (str.hashCode()) {
            case -1897523141:
                if (str.equals("staging")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -318354310:
                if (str.equals("preprod")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3449687:
                if (str.equals("prod")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1439571273:
                if (str.equals("autopush")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        int i2 = c != 0 ? c != 1 ? c != 2 ? c != 3 ? 2 : 6 : 5 : 4 : 3;
        ezmhVar.copyOnWrite();
        ((ezmk) ezmhVar.instance).f = i2 - 2;
        int f = acrz.f();
        ezmhVar.copyOnWrite();
        ((ezmk) ezmhVar.instance).h = f;
        return ezmhVar;
    }

    private final elfl q() {
        if (this.i.isPresent() && this.c.get()) {
            return ((aclb) this.i.get()).f().h(new emwl() { // from class: acis
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    aciu aciuVar = aciu.this;
                    String str = (String) obj;
                    aciuVar.c.set(false);
                    synchronized (aciuVar.b) {
                        aciuVar.d = str;
                        if (aciuVar.d.equals("empty_source_id")) {
                            return "";
                        }
                        return aciuVar.d;
                    }
                }
            }, this.g);
        }
        synchronized (this.b) {
            if (this.d.equals("empty_source_id")) {
                return elfo.e("");
            }
            return elfo.e(this.d);
        }
    }

    private final void r(final String str, final int i, final int i2, final int i3) {
        q().h(new emwl() { // from class: acir
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i4;
                int i5 = i - 1;
                String str2 = (String) obj;
                ezmh p = aciu.p(2);
                switch (i5) {
                    case 6:
                        i4 = 8;
                        break;
                    case 7:
                        i4 = 9;
                        break;
                    case 8:
                        i4 = 10;
                        break;
                    case 9:
                        i4 = 11;
                        break;
                    case 10:
                        i4 = 12;
                        break;
                    case 11:
                        i4 = 13;
                        break;
                    default:
                        i4 = 14;
                        break;
                }
                String str3 = str;
                ezlx ezlxVar = (ezlx) ezma.a.createBuilder();
                ezlxVar.copyOnWrite();
                ((ezma) ezlxVar.instance).c = 1;
                ezlxVar.copyOnWrite();
                ((ezma) ezlxVar.instance).d = ezly.a(i4);
                if (!TextUtils.isEmpty(str3)) {
                    ezlxVar.copyOnWrite();
                    ((ezma) ezlxVar.instance).h = str3;
                }
                if (!TextUtils.isEmpty(str2)) {
                    ezlxVar.copyOnWrite();
                    ezma ezmaVar = (ezma) ezlxVar.instance;
                    str2.getClass();
                    ezmaVar.f = str2;
                }
                int i6 = i2;
                if (i6 != -1) {
                    ezlxVar.copyOnWrite();
                    ((ezma) ezlxVar.instance).j = i6;
                }
                int i7 = i3;
                if (i7 != -1) {
                    ezlxVar.copyOnWrite();
                    ((ezma) ezlxVar.instance).k = i7;
                }
                aciu aciuVar = aciu.this;
                p.copyOnWrite();
                ezmk ezmkVar = (ezmk) p.instance;
                ezma ezmaVar2 = (ezma) ezlxVar.build();
                ezmk ezmkVar2 = ezmk.a;
                ezmaVar2.getClass();
                ezmkVar.d = ezmaVar2;
                ezmkVar.c = 3;
                aciuVar.o(p, bzed.b(str2));
                return true;
            }
        }, this.g).k(axnw.b(), this.g);
    }

    @Override // defpackage.acip
    public final void a(String str) {
        r(str, 10, -1, -1);
    }

    @Override // defpackage.acip
    public final void b(String str, int i, int i2) {
        r(str, 7, i, i2);
    }

    @Override // defpackage.acip
    public final void c(String str) {
        r(str, 13, -1, -1);
    }

    @Override // defpackage.acip
    public final void d(String str, int i) {
        n(str, 4, i, fagh.OK, 2);
    }

    @Override // defpackage.acip
    public final void e(String str, int i, fagh faghVar) {
        n(str, 9, i, faghVar, 2);
    }

    @Override // defpackage.acip
    public final void f(String str, int i) {
        n(str, 7, i, fagh.OK, 2);
    }

    @Override // defpackage.acip
    public final void g(String str, int i) {
        n(str, 3, i, fagh.OK, 2);
    }

    @Override // defpackage.acip
    public final void h(String str, int i, fagh faghVar) {
        n(str, 5, i, faghVar, 2);
    }

    @Override // defpackage.acip
    public final void i(String str, int i, fagh faghVar) {
        n(str, 8, i, faghVar, 2);
    }

    @Override // defpackage.acip
    public final void j(String str, int i) {
        n(str, 6, i, fagh.OK, 2);
    }

    @Override // defpackage.acip
    public final void k(String str) {
        r(str, 11, -1, -1);
    }

    @Override // defpackage.acip
    public final void l(String str) {
        r(str, 12, -1, -1);
    }

    @Override // defpackage.acip
    public final void m() {
        this.c.set(true);
    }

    @Override // defpackage.acip
    public final void n(final String str, final int i, final int i2, final fagh faghVar, final int i3) {
        if (!this.h.a()) {
            e.p("Clearcut loggings are disabled.");
            return;
        }
        q().h(new emwl() { // from class: aciq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                ezmh p = aciu.p(11);
                ezmz ezmzVar = (ezmz) ezna.a.createBuilder();
                ezmzVar.copyOnWrite();
                ((ezna) ezmzVar.instance).d = i - 2;
                ezmzVar.copyOnWrite();
                ((ezna) ezmzVar.instance).f = faghVar.a();
                ezmzVar.copyOnWrite();
                ((ezna) ezmzVar.instance).g = i3 - 2;
                aciu aciuVar = aciu.this;
                boolean e2 = ((ctvs) aciuVar.a.b()).e();
                ezmzVar.copyOnWrite();
                ((ezna) ezmzVar.instance).h = e2;
                String str3 = str;
                if (!TextUtils.isEmpty(str3)) {
                    ezmzVar.copyOnWrite();
                    ezna eznaVar = (ezna) ezmzVar.instance;
                    str3.getClass();
                    eznaVar.b = str3;
                }
                if (!TextUtils.isEmpty(str2)) {
                    ezmzVar.copyOnWrite();
                    ezna eznaVar2 = (ezna) ezmzVar.instance;
                    str2.getClass();
                    eznaVar2.c = str2;
                }
                int i4 = i2;
                ezmzVar.copyOnWrite();
                ((ezna) ezmzVar.instance).e = i4;
                p.copyOnWrite();
                ezmk ezmkVar = (ezmk) p.instance;
                ezna eznaVar3 = (ezna) ezmzVar.build();
                ezmk ezmkVar2 = ezmk.a;
                eznaVar3.getClass();
                ezmkVar.d = eznaVar3;
                ezmkVar.c = 13;
                aciuVar.o(p, bzed.b(str2));
                return true;
            }
        }, this.g).k(axnw.b(), this.g);
    }

    final void o(ezmh ezmhVar, int i) {
        ezmx ezmxVar = (ezmx) ezmy.a.createBuilder();
        ezmxVar.copyOnWrite();
        ezmy ezmyVar = (ezmy) ezmxVar.instance;
        ezmk ezmkVar = (ezmk) ezmhVar.build();
        ezmkVar.getClass();
        ezmyVar.c = ezmkVar;
        ezmyVar.b |= 1;
        final ezmy ezmyVar2 = (ezmy) ezmxVar.build();
        final dfld c = this.h.c(i);
        if (c == null) {
            return;
        }
        axnw.h(((aleo) this.f.b()).a().h(new emwl() { // from class: acit
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                dflc i2 = dfld.this.i(ezmyVar2);
                i2.i(-1);
                i2.c();
                return null;
            }
        }, this.j));
    }
}
