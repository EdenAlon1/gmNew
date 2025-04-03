package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkil extends dkie {
    static final diyy i = diyv.b("enable_rbm_bot_id_in_capabilities");
    static final diyy j = dizd.a(161540993);
    public final dkqu k;
    public final ffbr l;
    public final Map m;
    public final dkhx n;
    public final dkib o;
    public final dkid p;
    private final ctvb q;

    public dkil(djjr djjrVar, dkhc dkhcVar, dkii dkiiVar, ffbr ffbrVar, ctvb ctvbVar, dkhx dkhxVar, dkib dkibVar, dkid dkidVar, dkur dkurVar) {
        super(djjrVar, dkhcVar, dkiiVar, dkurVar);
        this.m = DesugarCollections.synchronizedMap(new HashMap());
        this.l = ffbrVar;
        this.q = ctvbVar;
        this.k = new dkqu(djjrVar.c());
        this.n = dkhxVar;
        this.o = dkibVar;
        this.p = dkidVar;
        this.f = dkurVar;
    }

    public static final void u(dkht dkhtVar, eeif eeifVar) {
        dkhtVar.g = eeifVar.a();
        eenj eenjVar = eeifVar.b;
        if (eenjVar != null) {
            w(dkhtVar, eenjVar);
        }
    }

    private static final void w(dkht dkhtVar, eenj eenjVar) {
        String j2 = eenjVar.j("User-Agent");
        if (j2 != null) {
            dkhtVar.h.put(dkhs.a, j2);
        }
    }

    @Override // defpackage.dkgm
    protected final void g(dilc dilcVar) {
        this.m.clear();
    }

    @Override // defpackage.dkie
    public final void q(eenk eenkVar) {
        String x;
        dkty.k("Receive an OPTIONS request", new Object[0]);
        ctvb ctvbVar = this.q;
        eeit b = dkut.b(eenkVar, ctvbVar);
        String str = null;
        if (b instanceof eeiq) {
            str = (String) ((eeiq) b).a.a().map(new dkus()).orElse(null);
            if (!dkut.w(str)) {
                x = dkut.n(b.toString(), ctvbVar);
                if (x != null || x.isEmpty()) {
                    throw new IllegalArgumentException("Invalid MSISDN in capability request");
                }
                eenkVar.j("P-Application-ID");
                dkht a = this.p.a(eenkVar.j("Contact"), r());
                a.c = !eenkVar.w();
                if (a.e <= 0) {
                    a.e = System.currentTimeMillis();
                }
                w(a, eenkVar);
                dkht dkhtVar = new dkht(this.h.a());
                Iterator it = dkhtVar.i.iterator();
                while (it.hasNext()) {
                    if (!a.i.contains((String) it.next())) {
                        it.remove();
                    }
                }
                v(0L, x, a);
                try {
                    eehy eehyVar = ((eehz) this.l).a;
                    dkur dkurVar = this.f;
                    try {
                        eelx b2 = dkur.b(BasePaymentResult.ERROR_REQUEST_FAILED, (eelw) eenkVar.a);
                        eell eellVar = (eell) b2.d("To");
                        if (eellVar == null) {
                            throw new eejg("To header is null.");
                        }
                        eellVar.f(eeja.a());
                        b2.k(dkut.e(dkurVar.b.a()));
                        b2.k(dkut.F());
                        eenl eenlVar = new eenl(b2);
                        eekk eekkVar = new eekk(eehk.f(eehyVar.c, false, this.a.c().mUserName, eehyVar.n()), eehyVar.p(), eehyVar.i(), Optional.ofNullable(eehyVar.g()), new String[0]);
                        dkhz.e(eekkVar, dkhtVar, r());
                        eenlVar.a.k(eekkVar);
                        eehyVar.s(eenlVar);
                        return;
                    } catch (Exception e) {
                        dkty.i(e, "Can't create SIP message", new Object[0]);
                        throw new eejg("Can't create SIP response");
                    }
                } catch (Exception e2) {
                    dkty.g("Can't send 200 OK for OPTIONS: %s", e2.getMessage());
                    return;
                }
            }
        } else if (b instanceof eeir) {
            eeir eeirVar = (eeir) b;
            str = eeirVar.a();
            if (eeirVar.e()) {
                str = "+".concat(String.valueOf(str));
            }
        }
        x = (!dkut.w(str) || dizg.w()) ? str : ctvbVar.x(str);
        if (x != null) {
        }
        throw new IllegalArgumentException("Invalid MSISDN in capability request");
    }

    @Override // defpackage.dkie
    public final void s(String str, long j2, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException("MSISDN must not be null.");
        }
        if (((Boolean) j.a()).booleanValue() && this.m.containsKey(str2)) {
            dkty.c("Options Capabilities request for %s already pending", dktx.PHONE_NUMBER.c(str2));
            return;
        }
        if (!l()) {
            throw new eejg("Unable to request options capabilities, capability service is not started!");
        }
        dkii dkiiVar = this.h;
        if (dkiiVar == null) {
            throw new eejg("Failed to request options capability: no capabilities factory available");
        }
        djjr djjrVar = this.a;
        dkht a = dkiiVar.a();
        if (!djjp.a(djjrVar).isPresent()) {
            throw new eejg("Network interface unavailable [AppId=" + str + ", id=" + j2 + ", MSISDN=" + dktx.PHONE_NUMBER.c(str2) + "]");
        }
        dkty.c("Requesting Options capabilities for %s", dktx.PHONE_NUMBER.c(str2));
        ffbr ffbrVar = this.l;
        djjr djjrVar2 = this.a;
        ctvb ctvbVar = this.q;
        eehy eehyVar = ((eehz) ffbrVar).a;
        String l = dkut.l(str2, djjrVar2.c(), ctvbVar);
        eehy eehyVar2 = ((eehz) this.l).a;
        if (eehyVar2.v()) {
            throw new eejg("SipStack is null. Can't create dialog path.");
        }
        String w = eehy.w();
        if (Objects.isNull(w)) {
            throw new eejg("CallId is null. Can't create dialog path.");
        }
        String e = this.a.e();
        if (Objects.isNull(e)) {
            throw new eejg("Public User Identity is null in ImsModule. Can't create dialog path.");
        }
        eehr eehrVar = new eehr(w, 1, l, e, l, eehyVar2.q());
        eenk s = this.f.s(eehyVar, eehrVar);
        dkhz.d(s, a, r());
        dkhz.e(s.b(), a, r());
        dkik dkikVar = new dkik(this, j2, a, eehrVar, str2);
        this.m.put(str2, dkikVar);
        eehyVar.k(s, dkikVar);
    }

    @Override // defpackage.dkie
    public final void t(String str) {
        if (((Boolean) j.a()).booleanValue() || !this.m.containsKey(str)) {
            s(null, 0L, str);
        } else {
            dkty.c("Options Capabilities request for %s already pending", dktx.PHONE_NUMBER.c(str));
        }
    }

    public final void v(long j2, String str, dkht dkhtVar) {
        this.m.remove(str);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((dkic) it.next()).k(j2, str, dkhtVar);
        }
    }

    @Override // defpackage.dkgm
    public final void n() {
    }

    @Override // defpackage.dkgm
    public final void o() {
    }
}
