package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkur {
    public final dkuv b;
    private static final diyy c = dizd.a(116284689);
    private static final diyy d = dizd.a(181241346);
    public static final diyy a = diyv.b("bug_191166396");

    public dkur(dkuv dkuvVar) {
        this.b = dkuvVar;
    }

    public static eekk a(eehy eehyVar, boolean z, String[] strArr) {
        if (eehyVar == null) {
            throw new IllegalArgumentException("sipStack cannot be null.");
        }
        String str = eehyVar.c;
        eehk eehkVar = dkut.a;
        return new eekk(eehk.f(str, z, eehyVar.h(), eehyVar.n()), eehyVar.p(), eehyVar.i(), Optional.ofNullable(eehyVar.g()), strArr);
    }

    public static eelx b(int i, eelw eelwVar) {
        eehk eehkVar = dkut.a;
        if (eelwVar == null) {
            throw new NullPointerException("null parameters");
        }
        eelx eelxVar = new eelx(i, eelx.y(i));
        for (eeku eekuVar : eelwVar.d) {
            if ((eekuVar instanceof eekt) || (eekuVar instanceof eell) || (eekuVar instanceof eelp) || (eekuVar instanceof eekh) || (eekuVar instanceof eele) || eekuVar.c.equalsIgnoreCase("Time-Stamp")) {
                eelxVar.k(eekuVar);
            }
        }
        eekg eekgVar = eelwVar.g;
        if (eekgVar != null) {
            eelxVar.k(eekgVar);
        }
        eelxVar.k = null;
        eelxVar.m(fhpi.a);
        eelxVar.m("Content-Length");
        Collection.EL.stream(eelxVar.g().a).forEach(new Consumer() { // from class: dkup
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                diyy diyyVar = dkur.a;
                ((eelo) obj).g = false;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return eelxVar;
    }

    public static void i(eelw eelwVar, String... strArr) {
        eelwVar.k(eene.g("Require", (String) DesugarArrays.stream(strArr).collect(Collectors.joining(","))));
    }

    public static void j(eelw eelwVar, String... strArr) {
        eelwVar.k(eene.g("Proxy-Require", (String) DesugarArrays.stream(strArr).collect(Collectors.joining(","))));
    }

    public static void k(eelw eelwVar, String str) {
        eelwVar.k(eene.g("Security-Verify", str));
    }

    public static void l(eelw eelwVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            eelwVar.k((eeku) arrayList.get(i));
        }
    }

    public static void m(String str, String str2, String str3) {
        if (str == null) {
            throw new eejg("call-ID is null.");
        }
        if (str2 == null) {
            throw new eejg("localParty is null.");
        }
        if (str3 == null) {
            throw new eejg("remoteParty is null.");
        }
    }

    private static void t(eenk eenkVar) {
        if (!dkut.z(eenkVar)) {
            throw new dkuq();
        }
    }

    private static final eelx u(eenk eenkVar, int i) {
        t(eenkVar);
        try {
            eelx b = b(i, (eelw) eenkVar.a);
            eell eellVar = (eell) b.d("To");
            String l = eenkVar.l();
            if (eellVar == null || l == null) {
                throw new eejg("To header is null.");
            }
            if (!l.contains("tag")) {
                eellVar.f(eeja.a());
            }
            return b;
        } catch (Exception e) {
            dkty.i(e, "Can't create SIP message", new Object[0]);
            throw new eejg("Can't create SIP response");
        }
    }

    private static final eelx v(eenk eenkVar, String str, int i) {
        t(eenkVar);
        try {
            eelx b = b(i, (eelw) eenkVar.a);
            if (str == null) {
                return b;
            }
            eell eellVar = (eell) b.d("To");
            if (eellVar == null) {
                throw new eejg("To header is null.");
            }
            eellVar.f(str);
            return b;
        } catch (eeje e) {
            dkty.i(e, "Can't create SIP message: ", new Object[0]);
            throw new eejg("Can't create SIP response");
        }
    }

    public final eenk c(eehy eehyVar, eehr eehrVar, String str, byte[] bArr, String str2, Optional optional) {
        eelw a2;
        eenk eenkVar;
        try {
            String str3 = eehrVar.f;
            String str4 = eehrVar.a;
            String str5 = eehrVar.g;
            String str6 = eehrVar.h;
            m(str4, str5, str6);
            eehk eehkVar = dkut.a;
            eeit d2 = eehk.d(str3);
            eekh b = eene.b(str4);
            eekg a3 = eene.a(eehrVar.b, "MESSAGE");
            eeio b2 = eehk.b(str5);
            a2 = eehq.a(d2, "MESSAGE", b, a3, eene.f(b2, eehrVar.d), eene.i(eehk.b(str6), eehrVar.e), dkut.q(eehyVar), dkut.g());
            eenkVar = new eenk(a2);
            ArrayList arrayList = eehrVar.j;
            if (arrayList != null) {
                l(a2, arrayList);
            }
            a2.k(eene.g("P-Preferred-Identity", b2.c()));
        } catch (Exception e) {
            e = e;
        }
        try {
            a2.k(dkut.f(this.b.a()));
            String[] split = TextUtils.split(str, "/");
            a2.o(bArr, eene.d(split[0], split[1]));
            a2.p(eene.c(bArr.length));
            if (optional.isPresent() && ((Boolean) c.a()).booleanValue()) {
                a2.k(eene.g("Contribution-ID", (String) optional.get()));
            }
            if (((Boolean) d.a()).booleanValue()) {
                Optional optional2 = eehyVar.e;
                if (optional2.isPresent()) {
                    k(a2, (String) optional2.get());
                    i(a2, "sec-agree");
                    j(a2, "sec-agree");
                }
            }
            eenkVar.b = str2;
            return eenkVar;
        } catch (Exception e2) {
            e = e2;
            dkty.i(e, "Can't create SIP message", new Object[0]);
            throw new eejg("Can't create SIP MESSAGE message");
        }
    }

    public final eenk d(eehy eehyVar, eehr eehrVar, String str, int i, String str2, String str3, byte[] bArr) {
        eelw a2;
        try {
            String str4 = eehrVar.f;
            String str5 = eehrVar.a;
            String str6 = eehrVar.g;
            String str7 = eehrVar.h;
            m(str5, str6, str7);
            eehk eehkVar = dkut.a;
            eeit d2 = eehk.d(str4);
            eekh b = eene.b(str5);
            eekg a3 = eene.a(eehrVar.b, "PUBLISH");
            eeio b2 = eehk.b(str6);
            a2 = eehq.a(d2, "PUBLISH", b, a3, eene.f(b2, eehrVar.d), eene.i(eehk.b(str7), null), dkut.q(eehyVar), dkut.g());
            ArrayList arrayList = eehrVar.j;
            if (arrayList != null) {
                l(a2, arrayList);
            }
            if (i >= 0) {
                a2.k(eene.e(i));
            }
            if (str2 != null) {
                a2.k(eene.g("SIP-If-Match", str2));
            }
            a2.k(eene.g("P-Preferred-Identity", b2.c()));
        } catch (Exception e) {
            e = e;
        }
        try {
            a2.k(dkut.f(this.b.a()));
            a2.k(eene.g("Event", str));
            if (bArr != null && str3 != null) {
                a2.p(eene.c(0));
                String[] split = TextUtils.split(str3, "/");
                a2.o(bArr, eene.d(split[0], split[1]));
            }
            return new eenk(a2);
        } catch (Exception e2) {
            e = e2;
            dkty.i(e, "Can't create SIP message: %s", e.getMessage());
            throw new eejg("Can't create SIP PUBLISH message");
        }
    }

    public final eenk e(eehy eehyVar, eehr eehrVar, int i, String str, String[] strArr) {
        try {
            String str2 = eehrVar.f;
            String str3 = eehrVar.a;
            String str4 = eehrVar.g;
            String str5 = eehrVar.h;
            m(str3, str4, str5);
            eehk eehkVar = dkut.a;
            eelw a2 = eehq.a(eehk.d(str2), "SUBSCRIBE", eene.b(str3), eene.a(eehrVar.b, "SUBSCRIBE"), eene.f(eehrVar.x ? eehk.b("sip:anonymous@anonymous.invalid") : eehk.b(str4), eehrVar.d), eene.i(eehk.b(str5), eehrVar.e), dkut.q(eehyVar), dkut.g());
            ArrayList arrayList = eehrVar.j;
            if (arrayList != null) {
                l(a2, arrayList);
            }
            a2.k(eene.e(i));
            a2.k(eene.g("P-Preferred-Identity", str4));
            try {
                a2.k(dkut.f(this.b.a()));
                a2.k(a(eehyVar, false, strArr));
                eenf.b(a2, a.t(str, "Event: "));
                Optional optional = eehyVar.e;
                if (optional.isPresent()) {
                    k(a2, (String) optional.get());
                    i(a2, "sec-agree");
                    j(a2, "sec-agree");
                }
                return new eenk(a2);
            } catch (Exception e) {
                e = e;
                dkty.i(e, "Can't create SIP message", new Object[0]);
                throw new eejg("Can't create SIP SUBSCRIBE message");
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final eenl f(eehy eehyVar, eehr eehrVar) {
        eenk eenkVar = eehrVar.i;
        eenk eenkVar2 = eehrVar.p;
        if (eenkVar2 != null) {
            eenkVar = eenkVar2;
        }
        if (eenkVar == null) {
            return null;
        }
        return g(eehyVar, eehrVar, eenkVar);
    }

    public final eenl g(eehy eehyVar, eehr eehrVar, eenk eenkVar) {
        try {
            eelx b = b(BasePaymentResult.ERROR_REQUEST_FAILED, eenkVar.y());
            eell eellVar = (eell) b.d("To");
            if (eellVar == null) {
                throw new eejg("To header is null.");
            }
            eellVar.f(eehrVar.d);
            b.k(a(eehyVar, false, new String[0]));
            b.k(dkut.e(this.b.a()));
            b.k(eene.g("Require", "timer"));
            b.p(eene.c(0));
            eenh[] eenhVarArr = eehrVar.r;
            if (eenhVarArr != null) {
                if (eenhVarArr.length == 1) {
                    b.o(eenhVarArr[0].a, eene.d("application", "sdp"));
                } else {
                    String concat = "b".concat(eeja.a());
                    byte[] B = dkut.B(eenhVarArr, concat);
                    eeko d2 = eene.d("multipart", "mixed");
                    d2.n(concat);
                    b.o(B, d2);
                }
            }
            return new eenl(b);
        } catch (Exception e) {
            dkty.i(e, "Can't create SIP message", new Object[0]);
            throw new eejg("Can't create SIP response");
        }
    }

    public final eenl h(eenk eenkVar, String str, int i) {
        return new eenl(v(eenkVar, str, i));
    }

    public final eenl n(eenk eenkVar) {
        return new eenl(u(eenkVar, BasePaymentResult.ERROR_REQUEST_FAILED));
    }

    public final eenl o(eenk eenkVar, int i, int i2) {
        eelx u = u(eenkVar, i);
        if (((Boolean) a.a()).booleanValue()) {
            u.m = i2;
        }
        return new eenl(u);
    }

    public final eenl p(eenk eenkVar, String str, int i, int i2) {
        eelx v = v(eenkVar, str, i);
        if (((Boolean) a.a()).booleanValue()) {
            v.m = i2;
        }
        return new eenl(v);
    }

    public final eenk q(eehy eehyVar, eehr eehrVar) {
        try {
            String str = eehrVar.f;
            String str2 = eehrVar.a;
            String str3 = eehrVar.g;
            String str4 = eehrVar.h;
            m(str2, str3, str4);
            eehk eehkVar = dkut.a;
            eeit d2 = eehk.d(str);
            eekh b = eene.b(str2);
            eekg a2 = eene.a(eehrVar.b, "ACK");
            eekt f = eene.f(eehk.b(str3), eehrVar.d);
            eell i = eene.i(eehk.b(str4), eehrVar.e);
            eenk eenkVar = eehrVar.i;
            if (eenkVar == null) {
                throw new eejg("INVITE is null.");
            }
            String b2 = ((eelo) eenkVar.a.g().e(0)).b();
            int y = eehrVar.q.y();
            if (y > 199 && y < 300) {
                b2 = dkut.p();
            }
            if (b2 == null) {
                throw new eejg("Branch is null.");
            }
            eelo j = eene.j(eehyVar.n(), eehyVar.i(), eehyVar.p(), b2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(j);
            eelw a3 = eehq.a(d2, "ACK", b, a2, f, i, arrayList, dkut.g());
            ArrayList arrayList2 = eehrVar.j;
            if (arrayList2 != null) {
                l(a3, arrayList2);
            }
            a3.k(a(eehyVar, false, new String[0]));
            a3.k(dkut.f(this.b.a()));
            a3.k(dkut.F());
            return new eenk(a3);
        } catch (Exception e) {
            dkty.i(e, "Can't create SIP message", new Object[0]);
            throw new eejg("Can't create SIP ACK message");
        }
    }

    public final eenk r(eehy eehyVar, eehr eehrVar) {
        String str;
        String str2;
        String str3;
        String str4;
        eeit d2;
        int length;
        int i = 0;
        try {
            str = eehrVar.f;
            str2 = eehrVar.a;
            str3 = eehrVar.g;
            str4 = eehrVar.h;
        } catch (Exception e) {
            e = e;
        }
        try {
            if (str2 == null || str3 == null || str4 == null) {
                throw new eejg(a.C(eehrVar, "Call-ID, localParty or remoteParty is null. "));
            }
            if (eehrVar.k && eehrVar.v != null) {
                eehk eehkVar = dkut.a;
                d2 = eehk.d(eehrVar.v);
            } else {
                if (str == null) {
                    throw new eejg("Target is null.");
                }
                eehk eehkVar2 = dkut.a;
                d2 = eehk.d(str);
            }
            eeit eeitVar = d2;
            eekh b = eene.b(str2);
            eekg a2 = eene.a(eehrVar.b, "INVITE");
            eeio b2 = eehk.b(str3);
            eelw a3 = eehq.a(eeitVar, "INVITE", b, a2, eene.f(b2, eehrVar.d), eene.i(eehk.b(str4), eehrVar.e), dkut.r(eehyVar, true), dkut.g());
            eekj eekjVar = eehrVar.c;
            if (eekjVar != null) {
                a3.k(eekjVar);
                dkty.c("set conference header: %s", eekjVar.a);
            }
            a3.k(a(eehyVar, false, new String[0]));
            ArrayList arrayList = eehrVar.j;
            if (arrayList != null) {
                l(a3, arrayList);
            }
            a3.k(eene.g("P-Preferred-Identity", b2.c()));
            a3.k(dkut.f(this.b.a()));
            a3.k(dkut.F());
            a3.k(eene.g("Supported", "timer"));
            if (!dizg.H() && (!((Boolean) dizg.o().a.J.a()).booleanValue() || dizg.o().L())) {
                eelj eeljVar = (eelj) eene.g("Session-Expires", "1800");
                a3.k(eeljVar);
                String str5 = eehrVar.w;
                if (str5 != null) {
                    eeljVar.f(str5);
                }
            }
            Optional optional = eehyVar.e;
            if (optional.isPresent()) {
                k(a3, (String) optional.get());
                i(a3, "sec-agree");
                j(a3, "sec-agree");
            }
            a3.p(eene.c(0));
            eenh[] eenhVarArr = eehrVar.t;
            if (eenhVarArr == null) {
                eenhVarArr = eehrVar.r;
            }
            if (eenhVarArr != null && (length = eenhVarArr.length) > 0) {
                if (length == 1) {
                    String[] split = TextUtils.split(eenhVarArr[0].b, "/");
                    a3.o(eenhVarArr[0].a, eene.d(split[0], split[1]));
                } else {
                    String t = a.t(eeja.a(), "b");
                    eeko d3 = eene.d("multipart", "mixed");
                    d3.n(t);
                    a3.o(dkut.B(eenhVarArr, t), d3);
                }
            }
            eenk eenkVar = new eenk(a3);
            if (eenhVarArr != null) {
                StringBuilder sb = new StringBuilder();
                String str6 = "";
                while (i < eenhVarArr.length) {
                    eenh eenhVar = eenhVarArr[i];
                    sb.append(str6);
                    sb.append(eenhVar.c());
                    i++;
                    str6 = VCardBuilder.VCARD_END_OF_LINE;
                }
                eenkVar.b = sb.toString();
            }
            return eenkVar;
        } catch (Exception e2) {
            e = e2;
            dkty.i(e, "Can't create SIP message", new Object[0]);
            throw new eejg("Can't create SIP INVITE message", e);
        }
    }

    public final eenk s(eehy eehyVar, eehr eehrVar) {
        try {
            String str = eehrVar.f;
            String str2 = eehrVar.a;
            String str3 = eehrVar.g;
            String str4 = eehrVar.h;
            m(str2, str3, str4);
            eehk eehkVar = dkut.a;
            eeit d2 = eehk.d(str);
            eekh b = eene.b(str2);
            eekg a2 = eene.a(eehrVar.b, "OPTIONS");
            eeio b2 = eehk.b(str3);
            eelw a3 = eehq.a(d2, "OPTIONS", b, a2, eene.f(b2, eehrVar.d), eene.i(eehk.b(str4), null), dkut.q(eehyVar), dkut.g());
            a3.k(a(eehyVar, false, new String[0]));
            a3.k(eene.g("Accept", "application/sdp"));
            ArrayList arrayList = eehrVar.j;
            if (arrayList != null) {
                l(a3, arrayList);
            }
            a3.k(eene.g("P-Preferred-Identity", b2.c()));
            a3.k(dkut.f(this.b.a()));
            a3.k(dkut.F());
            return new eenk(a3);
        } catch (Exception e) {
            dkty.i(e, "Can't create SIP message", new Object[0]);
            throw new eejg("Can't create SIP OPTIONS message");
        }
    }
}
