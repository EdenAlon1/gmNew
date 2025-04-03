package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import j$.util.Optional;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dkha extends dkgd {
    private static final diyy B = dizd.a(174556556);
    private static final diyy C = dizd.a(181136833);
    private static final diyy D = dizd.a(182436580);
    public static final dktn f = new dktn("ImsServiceSession");
    public final dkur A;
    private final dkqu E;
    private eeit F;
    private String G;
    private final PowerManager.WakeLock H;
    private final diod J;
    public final dkgm i;
    public final ffbr j;
    public final eehr l;
    public final ctvb m;
    public String o;
    public boolean p;
    public String q;
    public dkgz s;
    public eenk t;
    public final dkhp v;
    protected eekj x;
    public String y;
    public String z;
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public final Object h = new Object();
    public final String k = eeja.a();
    public int n = 0;
    public boolean r = false;
    public boolean u = false;
    public boolean w = false;
    private final Object I = new Object();

    public dkha(Context context, dkgm dkgmVar, ffbr ffbrVar, String str, eenk eenkVar, diod diodVar, dkur dkurVar) {
        this.q = "";
        ctvb d = ((dkgy) dipp.a(dkgy.class)).d();
        this.m = d;
        this.i = dkgmVar;
        this.j = ffbrVar;
        this.J = diodVar;
        this.A = dkurVar;
        this.d = 0;
        this.e = 0;
        this.E = new dkqu(dkgmVar.a.c());
        this.H = ((PowerManager) context.getSystemService("power")).newWakeLock(1, A());
        this.y = eeja.b();
        this.z = eeja.b();
        this.v = new dkhp(this, t(), ffbrVar, dkurVar);
        boolean z = eenkVar == null;
        this.p = z;
        eeio eeioVar = null;
        if (!z) {
            eeit b = dkut.b(eenkVar, d);
            b.getClass();
            this.F = b;
            au();
            String j = eenkVar.j("P-Asserted-Identity");
            j = (j == null || j.length() == 0) ? eenkVar.j("From") : j;
            if (j != null) {
                try {
                    eeioVar = eehk.b(j);
                } catch (eeje e) {
                    dkty.i(e, "Error while parsing remote address: %s", e.getMessage());
                }
            }
            if (eeioVar != null) {
                this.G = eeioVar.a;
            }
            eekj eekjVar = eenkVar.a.j;
            if (eekjVar != null) {
                this.x = eekjVar;
                dkty.d(f, "conference header from server: %s", eekjVar.a);
            }
            if (eenkVar.y().q("Subject")) {
                this.q = eenkVar.j("Subject");
            }
            try {
                String d2 = eenkVar.d();
                if (d2 == null) {
                    throw new eejg("Null CallId. Can't create dialog path");
                }
                String f2 = eenkVar.f();
                if (f2 == null) {
                    throw new eejg("Null Contact. Can't create dialog path");
                }
                String l = eenkVar.l();
                if (l == null) {
                    throw new eejg("Null To header. Can't create dialog path");
                }
                String i = eenkVar.i();
                if (i == null) {
                    throw new eejg("Null From header. Can't create dialog path");
                }
                int a = eenkVar.a();
                ArrayList s = dkut.s(eenkVar, false);
                eekk eekkVar = (eekk) eenkVar.a.c().f();
                eekkVar.getClass();
                eehr eehrVar = new eehr(d2, a, f2, l, i, s);
                eehrVar.i = eenkVar;
                eehrVar.e = dkut.i(eenkVar.i());
                String d3 = eekkVar.e.d("+sip.instance");
                if (d3 != null) {
                    eehrVar.e(d3);
                }
                eekk eekkVar2 = (eekk) eenkVar.a.c().f();
                if (eekkVar2 != null) {
                    eeio eeioVar2 = eekkVar2.a;
                    if (eeioVar2.b.l()) {
                        eeiq eeiqVar = (eeiq) eeioVar2.b;
                        if (eeiqVar.b.a("gr") != null) {
                            eehrVar.v = eeiqVar.c();
                        }
                    }
                    if (eehrVar.v == null) {
                        String i2 = eekkVar2.i("pub-gruu");
                        if (i2 != null) {
                            eehrVar.v = i2;
                        } else {
                            String i3 = eekkVar2.i("temp-gruu");
                            if (i3 != null) {
                                eehrVar.v = i3;
                            }
                        }
                    }
                }
                String g = eenkVar.g();
                if (g != null) {
                    String h = eenkVar.h();
                    h.getClass();
                    try {
                        eehrVar.s = eenh.d(g, h);
                    } catch (IOException e2) {
                        dkty.j(e2, f, "Could not set content: %s", e2.getMessage());
                    }
                }
                this.l = eehrVar;
            } catch (eejg e3) {
                throw new IllegalStateException(e3);
            }
        } else {
            if (str == null) {
                throw new IllegalStateException("Remote contact cannot be null.");
            }
            ae(str, ((eehz) ffbrVar).a);
            this.x = null;
            try {
                djjr djjrVar = dkgmVar.a;
                eehy v = v();
                String w = eehy.w();
                ArrayList q = v.q();
                String e4 = djjrVar.e();
                if (e4 == null) {
                    throw new eejg("Public Identity is empty in ImsModule. Can't create dialog path");
                }
                this.l = new eehr(w, 1, y(), e4, y(), q);
            } catch (eejg e5) {
                throw new IllegalStateException(e5);
            }
        }
        dkty.d(f, "session %s created", this.k);
    }

    private final void au() {
        String j = dkut.j(this.F, this.m);
        boolean z = this.F.l() && !PhoneNumberUtils.isGlobalPhoneNumber(j);
        this.o = z ? dkut.n(this.F.toString(), this.m) : j;
        dkty.l(f, "Updated remoteUserName: {remoteUserName: '%s', remoteUri: '%s', extractedUserName: '%s'}, isSipUriAndNotGlobalPhone: %s", dktx.USER_ID.c(this.o), dktx.URI_SIP.c(this.F), dktx.USER_ID.c(j), Boolean.valueOf(z));
    }

    protected abstract String A();

    public String B() {
        eelv eelvVar;
        eelv eelvVar2;
        String dkgdVar = toString();
        StringBuilder sb = new StringBuilder("Sip history for Call ID ");
        eehr eehrVar = this.l;
        sb.append(eehrVar.a);
        sb.append("\r\n\r\n");
        eenk eenkVar = eehrVar.i;
        if (eenkVar != null && eenkVar.a != null) {
            sb.append(" --- Initial INVITE:\r\n\r\n");
            sb.append(eenkVar.n());
            sb.append("\r\n\r\n");
        }
        eenk eenkVar2 = eehrVar.p;
        if (eenkVar2 != null && (eelvVar2 = eenkVar2.a) != null) {
            sb.append(" --- Last request, timestamp ");
            sb.append(eelvVar2.c);
            sb.append(":\r\n\r\n");
            sb.append(eehrVar.p.n());
            sb.append("\r\n\r\n");
        }
        eenl eenlVar = eehrVar.q;
        if (eenlVar != null && (eelvVar = eenlVar.a) != null) {
            sb.append(" --- Last response, timestamp ");
            sb.append(eelvVar.c);
            sb.append(":\r\n\r\n");
            sb.append(eehrVar.q.n());
            sb.append("\r\n\r\n");
        }
        return a.w(sb.toString(), dkgdVar, "\r\n\r\n");
    }

    public final synchronized void C() {
        if (this.p) {
            dkty.d(f, "session %s cannot be accepted because it is originating", this.k);
            return;
        }
        dkty.d(f, "session %s invitation has been accepted", this.k);
        this.n = 1;
        synchronized (this.h) {
            this.h.notifyAll();
        }
    }

    protected final void D(eenh[] eenhVarArr) {
        if (eenhVarArr != null) {
            eehy eehyVar = ((eehz) this.j).a;
            if (eehyVar.v()) {
                throw new eejg("The sip stack is unavailable while completing the sdp");
            }
            String str = this.i.a.c().mUserName;
            if (((Boolean) C.a()).booleanValue() && TextUtils.isEmpty(str)) {
                str = dkut.o(t().e(), this.m);
            }
            String n = eehyVar.n();
            if (TextUtils.isEmpty(n)) {
                throw new eehb("Unable to complete SDP. Local IP address not available!");
            }
            eegr a = eegr.a(n);
            for (eenh eenhVar : eenhVarArr) {
                if (eenhVar != null && "application/sdp".equals(eenhVar.b)) {
                    String b = eenhVar.b();
                    b.getClass();
                    eehg b2 = eehd.b(b);
                    if (b2.a.size() <= 0) {
                        b2.c(eehj.a);
                    }
                    if (b2.e == null) {
                        b2.e = new eegz(str, eegy.a, a, n);
                    }
                    if (b2.h == null) {
                        b2.h = new eegt(eegy.a, a, eehyVar.n());
                    }
                    try {
                        eenhVar.a = b2.f().getBytes("utf-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
            }
        }
    }

    public final synchronized void E(dilc dilcVar) {
        this.u = true;
        n(2, dkgd.a(dilcVar));
    }

    protected final void F() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dkhd) it.next()).e();
            } catch (Exception e) {
                dkty.j(e, f, "handleSessionAborted: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    protected final void G(dkqs dkqsVar) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dkhd) it.next()).g(dkqsVar);
            } catch (Exception e) {
                dkty.j(e, f, "handleSessionStartFailed: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    protected final void H(int i, String str) {
        dkty.d(f, "handleSessionStartFailed with reason: %s, due to: %s", eelx.y(i), str);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dkhd) it.next()).h(i, str);
            } catch (Exception e) {
                dkty.j(e, f, "handleSessionStartFailed: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    protected final void I() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dkhd) it.next()).j();
            } catch (Exception e) {
                dkty.j(e, f, "handleSessionStarting: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    protected final void J() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dkhd) it.next()).k();
            } catch (Exception e) {
                dkty.j(e, f, "handleSessionTerminated: Call to listener failed with error", new Object[0]);
            }
        }
    }

    protected final void K(eelx eelxVar) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            dkhd dkhdVar = (dkhd) it.next();
            try {
                if (dkhdVar instanceof dkhe) {
                    ((dkhe) dkhdVar).r(eelxVar);
                }
            } catch (Exception e) {
                dkty.j(e, f, "responseReceived: Call to listener failed with error", new Object[0]);
            }
        }
    }

    protected final void L(dkqs dkqsVar) {
        this.r = false;
        dkty.j(dkqsVar, f, "Error occurred - stopping session: %s", dkqsVar.getMessage());
        m(dkqsVar);
    }

    protected void M(eenl eenlVar) {
        throw null;
    }

    protected final void N(eenl eenlVar) {
        dkty.d(f, "Provisional response received for INVITE: %d %s", Integer.valueOf(eenlVar.y()), eenlVar.A());
        eenh[] eenhVarArr = this.l.s;
        String h = eenlVar.h();
        if ((eenhVarArr == null || eenhVarArr.length == 0) && h != null) {
            try {
                String g = eenlVar.g();
                g.getClass();
                this.l.s = eenh.d(g, h);
            } catch (IOException e) {
                dkty.d(f, "IOException: %s", e.getMessage());
            }
        }
    }

    public final void O() {
        ag();
        if (this.a == dkho.STARTING) {
            H(487, "Terminated by remote");
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dkhd) it.next()).m();
            } catch (Exception e) {
                dkty.j(e, f, "handleSessionTerminatedByRemote: Call to listener failed with error", new Object[0]);
            }
        }
    }

    public void Q(eenk eenkVar) {
        throw null;
    }

    protected void R(eenl eenlVar) {
        throw null;
    }

    protected void S(eenk eenkVar) {
        throw null;
    }

    protected void T(eenk eenkVar) {
        throw null;
    }

    public void V(eenl eenlVar) {
        throw null;
    }

    public final synchronized void W() {
        X(2, this.d, this.e);
    }

    protected final void X(int i, int i2, int i3) {
        dkty.d(f, "session %s invitation is requested to be rejected: %s", this.k, Integer.valueOf(i));
        this.n = i;
        h(i2);
        i(i3);
        synchronized (this.h) {
            this.h.notifyAll();
        }
    }

    protected final void Y(int i, int i2) {
        dkty.l(f, "Stop reason: %d subreason: %d", Integer.valueOf(i), Integer.valueOf(i2));
        String str = this.l.a;
        if (str != null) {
            this.J.a(str, str, i, i2, this.p);
        }
    }

    public final void Z(eenk eenkVar, String str) {
        dkur dkurVar = this.A;
        eehy v = v();
        try {
            eenl h = dkurVar.h(eenkVar, str, 180);
            h.q(dkur.a(v, false, new String[0]));
            ad(h);
        } catch (eeje e) {
            dkty.i(e, "Can't create SIP message", new Object[0]);
            throw new eejg("Can't create SIP response", e);
        }
    }

    protected final void aa(eehr eehrVar) {
        try {
            eehy v = v();
            dkur dkurVar = this.A;
            t();
            ad(dkurVar.q(v, eehrVar));
        } catch (Exception e) {
            dkty.j(e, f, "Can't send SIP ACK", new Object[0]);
        }
    }

    public final void ab() {
        try {
            eehy v = v();
            this.l.a();
            dkty.l(f, "Send BYE", new Object[0]);
            dkur dkurVar = this.A;
            eehr eehrVar = this.l;
            t();
            try {
                String str = eehrVar.f;
                String str2 = eehrVar.a;
                String str3 = eehrVar.g;
                String str4 = eehrVar.h;
                dkur.m(str2, str3, str4);
                eehk eehkVar = dkut.a;
                eeit d = eehk.d(str);
                eekh b = eene.b(str2);
                eekg a = eene.a(eehrVar.b, "BYE");
                eeio b2 = eehk.b(str3);
                eelw a2 = eehq.a(d, "BYE", b, a, eene.f(b2, eehrVar.d), eene.i(eehk.b(str4), eehrVar.e), dkut.q(v), dkut.g());
                ArrayList arrayList = eehrVar.j;
                if (arrayList != null) {
                    dkur.l(a2, arrayList);
                }
                a2.k(eene.g("P-Preferred-Identity", b2.c()));
                a2.k(dkut.f(dkurVar.b.a()));
                a2.k(dkut.F());
                Optional optional = v.e;
                if (optional.isPresent()) {
                    dkur.k(a2, (String) optional.get());
                    dkur.i(a2, "sec-agree");
                    dkur.j(a2, "sec-agree");
                }
                eenk eenkVar = new eenk(a2);
                if (ai()) {
                    eenkVar.s("Conversation-ID", this.z);
                }
                dkqu dkquVar = this.E;
                if (dkquVar != null) {
                    dkquVar.b(eenkVar);
                }
                S(eenkVar);
                v.k(eenkVar, new dkgx(this));
                ag();
            } catch (Exception e) {
                dkty.i(e, "Can't create SIP message", new Object[0]);
                throw new eejg("Can't create SIP BYE message");
            }
        } catch (Exception e2) {
            dkty.j(e2, f, "Error while sending bye: %s", e2.getMessage());
        }
    }

    protected final void ac(dkqs dkqsVar) {
        dkur dkurVar;
        eehy v;
        eehr eehrVar;
        eeit d;
        eekh b;
        eekg a;
        eekt f2;
        eell i;
        eenk eenkVar;
        dkty.l(f, "Send CANCEL", new Object[0]);
        eeif eeifVar = null;
        try {
            dkurVar = this.A;
            v = v();
            eehrVar = this.l;
            t();
            try {
                String str = eehrVar.f;
                String str2 = eehrVar.a;
                String str3 = eehrVar.g;
                String str4 = eehrVar.h;
                dkur.m(str2, str3, str4);
                eehk eehkVar = dkut.a;
                d = eehk.d(str);
                b = eene.b(str2);
                a = eene.a(eehrVar.b, "CANCEL");
                f2 = eene.f(eehk.b(str3), eehrVar.d);
                i = eene.i(eehk.b(str4), null);
                eenkVar = eehrVar.i;
            } catch (Exception e) {
                dkty.i(e, "Can't create SIP message", new Object[0]);
                throw new eejg("Can't create SIP CANCEL message");
            }
        } catch (Exception e2) {
            dkty.j(e2, f, "Error while sending cancel: %s", e2.getMessage());
        }
        if (eenkVar == null) {
            throw new eejg("INVITE is null.");
        }
        eelw a2 = eehq.a(d, "CANCEL", b, a, f2, i, eenkVar.p(), dkut.g());
        ArrayList arrayList = eehrVar.j;
        if (arrayList != null) {
            dkur.l(a2, arrayList);
        }
        a2.k(dkur.a(v, false, new String[0]));
        a2.k(dkut.f(dkurVar.b.a()));
        a2.k(dkut.F());
        eenk eenkVar2 = new eenk(a2);
        dkqu dkquVar = this.E;
        if (dkquVar != null) {
            dkquVar.b(eenkVar2);
        }
        eeif l = v().l(eenkVar2);
        this.l.b();
        eeifVar = l;
        if (eeifVar != null || ((Boolean) B.a()).booleanValue()) {
            dkty.l(f, "Response of CANCEL is received: %b", Boolean.valueOf((eeifVar == null || eeifVar.b() == null) ? false : true));
            if (dkqsVar != null) {
                G(dkqsVar);
            } else {
                F();
            }
        }
    }

    public final void ad(eenj eenjVar) {
        v().s(eenjVar);
    }

    protected final void ae(String str, eehy eehyVar) {
        dkty.l(f, "Setting contact: %s", dktx.USER_ID.c(str));
        ImsConfiguration c = this.i.a.c();
        if (((Boolean) C.a()).booleanValue()) {
            boolean y = dkut.y(c);
            String f2 = !eehyVar.v() ? eehyVar.f() : "";
            if (TextUtils.isEmpty(f2)) {
                f2 = t().c().mDomain;
            }
            eeit d = dkut.d(str, f2, this.m, y);
            d.getClass();
            this.F = d;
        } else {
            eeit c2 = dkut.c(str, c, this.m);
            c2.getClass();
            this.F = c2;
        }
        au();
    }

    public final void af(int i, int i2) {
        h(i);
        i(i2);
        if (!this.l.l) {
            W();
        } else {
            l();
            dkty.l(f, "Stopped session, reason: %d subreason: %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void ag() {
        this.l.d();
    }

    public final void ah(dkqs dkqsVar) {
        dkty.d(f, "Terminating session", new Object[0]);
        synchronized (this.I) {
            this.I.notify();
        }
        if (dkqsVar == null) {
            try {
                U();
            } catch (Exception e) {
                dkty.h(f, "Error while calling onTerminating: %s", e.getMessage());
            }
        }
    }

    public boolean ai() {
        throw null;
    }

    public final boolean aj() {
        return ai() || djao.v();
    }

    protected eenh[] ak() {
        throw null;
    }

    public String[] al() {
        throw null;
    }

    public final synchronized void an() {
        dkty.d(f, "Session invitation is requested to be declined", new Object[0]);
        this.n = 8;
        h(2);
        i(56);
        synchronized (this.h) {
            this.h.notifyAll();
        }
    }

    public final synchronized void ao() {
        this.u = true;
        n(2, 57);
    }

    protected final void ap(eenk eenkVar) {
        int indexOf;
        dkty.w(24, 3, "Sending SIP INVITE with callid=%s", eenkVar.d());
        this.l.k = false;
        eeif l = v().l(eenkVar);
        String str = l.c;
        dktn dktnVar = f;
        dkty.d(dktnVar, "Created transaction: %s", str);
        dkty.d(dktnVar, "First invite message timeout value is %d seconds and later invite message timeout value is %d seconds", Long.valueOf(djao.c()), Long.valueOf(djao.c()));
        int i = l.i((int) djao.c(), (int) djao.c());
        if (!l.g()) {
            if (i == 2) {
                return;
            }
            this.l.k = true;
            if (i == 3) {
                n(1, 66);
                H(477, emxe.b(l.c()));
                return;
            } else {
                n(1, 21);
                H(408, "No response received for INVITE");
                return;
            }
        }
        eenl b = l.b();
        b.getClass();
        this.l.q = b;
        dkty.w(27, 3, "SIP Response received with response code: %s", Integer.valueOf(b.y()));
        int a = l.a();
        if (a >= 100 && a < 200) {
            N(b);
            return;
        }
        if (a != 200) {
            if (a != 407) {
                M(b);
                return;
            }
            try {
                dkty.l(dktnVar, "407 response received", new Object[0]);
                this.l.e = dkut.i(b.l());
                this.l.q = b;
                dkty.l(dktnVar, "Send ACK for 407 response", new Object[0]);
                dkur dkurVar = this.A;
                eehy v = v();
                eehr eehrVar = this.l;
                t();
                ad(dkurVar.q(v, eehrVar));
                this.E.a(b);
                this.l.a();
                dkty.l(dktnVar, "Send second INVITE", new Object[0]);
                dkur dkurVar2 = this.A;
                eehy v2 = v();
                eehr eehrVar2 = this.l;
                t();
                eenk r = dkurVar2.r(v2, eehrVar2);
                String[] al = al();
                if (al != null) {
                    dkut.u(r, x(), al);
                }
                this.l.i = r;
                String str2 = this.q;
                if (str2 != null) {
                    r.r(a.t(str2, "Subject: "));
                }
                this.E.b(r);
                T(r);
                eell eellVar = r.y().f;
                eellVar.getClass();
                eellVar.e();
                ap(r);
                return;
            } catch (Exception e) {
                dkty.j(e, f, "Session initiation has failed", new Object[0]);
                L(new dkqs(e));
                return;
            }
        }
        try {
            this.r = false;
            dkty.l(dktnVar, "200 OK response received", new Object[0]);
            eehr eehrVar3 = this.l;
            eehrVar3.q = b;
            eehrVar3.f();
            this.l.e = dkut.i(b.l());
            String f2 = b.f();
            if (f2 != null) {
                this.l.f = f2;
            }
            ArrayList s = dkut.s(b, true);
            eehr eehrVar4 = this.l;
            eehrVar4.j = s;
            eehrVar4.s = eenh.d(b.g(), b.h());
            eekk eekkVar = (eekk) b.z().c().f();
            eekkVar.getClass();
            String d = eekkVar.e.d("+sip.instance");
            if (d != null) {
                this.l.e(d);
            }
            String e2 = b.e();
            if (e2 != null && this.G == null) {
                int indexOf2 = e2.indexOf(34) + 1;
                String str3 = null;
                if (indexOf2 > 0 && (indexOf = e2.indexOf(34, indexOf2)) > indexOf2) {
                    str3 = e2.substring(indexOf2, indexOf);
                }
                this.G = str3;
            }
            this.l.c();
            dkty.l(dktnVar, "Send ACK", new Object[0]);
            dkur dkurVar3 = this.A;
            eehy v3 = v();
            eehr eehrVar5 = this.l;
            t();
            ad(dkurVar3.q(v3, eehrVar5));
            try {
                R(b);
                P();
            } catch (Exception e3) {
                dkty.j(e3, f, "Session completion has failed: %s", e3.getMessage());
                m(e3);
            }
            this.v.b(this.l, b);
        } catch (Exception e4) {
            dkty.j(e4, f, "Session initiation has failed: %s", e4.getMessage());
            L(new dkqs(e4));
        }
    }

    public final void aq(eenk eenkVar, String str, int i) {
        try {
            dkty.l(f, "Send 486 Busy here", new Object[0]);
            ad(this.A.p(eenkVar, str, 486, i));
        } catch (Exception e) {
            dkty.j(e, f, "Can't send 486 Busy Response", new Object[0]);
        }
    }

    protected final void ar(eenk eenkVar, String str, int i) {
        try {
            dkty.l(f, "Send 488 Not acceptable", new Object[0]);
            ad(this.A.p(eenkVar, str, 488, i));
        } catch (Exception e) {
            dkty.j(e, f, "Can't send 488 Not acceptable", new Object[0]);
        }
    }

    public final void as(eenk eenkVar, String str, int i) {
        try {
            dkty.l(f, "Sending 400 Bad Request", new Object[0]);
            ad(this.A.p(eenkVar, str, 400, i));
        } catch (Exception e) {
            dkty.j(e, f, "Can't send 400 Bad Request", new Object[0]);
        }
    }

    public final void at() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            dkhd dkhdVar = (dkhd) it.next();
            try {
                if (dkhdVar instanceof dkhe) {
                    ((dkhe) dkhdVar).t();
                }
            } catch (Exception e) {
                dkty.j(e, f, "requestReceived: Call to listener failed with error", new Object[0]);
            }
        }
    }

    @Override // defpackage.dkgd
    protected final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            try {
                ((dkhd) it.next()).i();
            } catch (Exception e) {
                dkty.j(e, f, "handleSessionStarted: Call to listener failed with error: ", new Object[0]);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|6|9|(4:10|11|12|(19:14|15|16|17|18|19|(1:21)|22|(1:24)(3:43|44|(1:46))|25|(1:27)(1:42)|(1:29)|30|(1:32)|33|34|35|36|37)(9:55|56|57|58|(3:60|(1:62)(1:64)|63)(6:65|66|67|68|69|(1:71)(7:72|73|74|75|(3:80|(2:91|92)(5:82|83|84|86|87)|76)|94|(1:96)(2:97|(3:99|100|101)(1:105))))|34|35|36|37))|118|119|120|121|122|(1:(0))) */
    @Override // defpackage.dkgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void d() {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkha.d():void");
    }

    @Override // defpackage.dkgd
    protected final void e() {
        this.i.i(this);
        Y(this.d, this.e);
    }

    @Override // defpackage.dkgd
    protected void f() {
        throw null;
    }

    @Override // defpackage.dkgd
    protected void g(Throwable th) {
        throw null;
    }

    @Override // defpackage.dkgd
    protected final void r() {
        this.i.i(this);
        Y(this.d, this.e);
    }

    public final int s() {
        int i;
        eenk eenkVar = this.l.i;
        eenkVar.getClass();
        int i2 = this.n;
        if (i2 != 0) {
            return i2;
        }
        dkty.d(f, "Wait session invitation answer", new Object[0]);
        synchronized (this.h) {
            i = 0;
            while (i < 60) {
                try {
                    this.h.wait(5000L);
                    if (this.n != 0) {
                        break;
                    }
                    try {
                        Z(eenkVar, this.l.d);
                        i += 5;
                    } catch (eejg e) {
                        m(e);
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i >= 60) {
            dkty.l(f, "Timeout - Ringing period expired", new Object[0]);
            this.n = 0;
        }
        return this.n;
    }

    public final djjr t() {
        return this.i.a;
    }

    @Override // defpackage.dkgd
    public String toString() {
        return " mSessionId: " + this.k + "\r\n remoteUri: " + dktx.URI.c(this.F) + "\r\n invitationStatus: " + this.n + "\r\n disconnect: " + this.u + "\r\n isRinging: " + this.r + "\r\n originating: " + this.p + "\r\n updateOriginating: false\r\n" + (" State: " + String.valueOf(this.a) + "\r\n Error: " + String.valueOf(this.c));
    }

    public final ImsConfiguration u() {
        return t().c();
    }

    protected final eehy v() {
        eehy eehyVar = ((eehz) this.j).a;
        if (eehyVar.v()) {
            throw new eejg("SipStack is not initialized.");
        }
        return eehyVar;
    }

    public final String w() {
        return ai() ? this.z : this.y;
    }

    public final String x() {
        return this.l.u;
    }

    public final String y() {
        eeit eeitVar = this.F;
        if (eeitVar != null) {
            return eeitVar.toString();
        }
        throw new IllegalStateException("remote URI was not initialized");
    }

    public final String z() {
        String str = this.o;
        str.getClass();
        return str;
    }

    protected void P() {
    }

    protected void U() {
    }
}
