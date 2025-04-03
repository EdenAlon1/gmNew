package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.net.ServerSocket;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import javax.net.ssl.SSLServerSocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dkkj extends dkha implements eefv {
    public static final String D;
    private static final emye aa;
    public boolean E;
    public eegb F;
    protected List G;
    public String H;
    public String I;
    public boolean J;
    public final LinkedBlockingDeque K;
    public final dkux L;
    public long M;
    public dkjt N;
    public dkjj O;
    public final Object P;
    public boolean Q;
    public final dkrp R;
    public dkjw S;
    public ffbr T;
    public boolean U;
    public boolean V;
    public final String W;
    public final dkkt X;
    private dkhi ab;
    private dkhm ac;
    private final ConcurrentHashMap ad;
    private boolean ae;
    private Optional af;
    private final InstantMessageConfiguration ag;
    private dkki ah;
    public static final dktn B = new dktn("InstantMessageSession");
    static final diyy C = diyv.b("enable_reason_header_on_bye_for_all_sessions");
    private static final diyy Y = dizd.a(173039682);
    private static final diyy Z = dizd.a(183695160);

    static {
        diyv.b("enable_revocation_for_encrypted_session");
        D = edzn.DELIVERED.p + ", " + edzn.DISPLAYED.p;
        aa = emye.d(" ").f().a();
    }

    public dkkj(Context context, dkgm dkgmVar, ffbr ffbrVar, eenk eenkVar, eeft eeftVar, dkrp dkrpVar, diod diodVar, dkur dkurVar, InstantMessageConfiguration instantMessageConfiguration, dikx dikxVar) {
        super(context, dkgmVar, ffbrVar, null, eenkVar, diodVar, dkurVar);
        this.E = false;
        this.ac = dkhm.LEAVE_INVOLUNTARILY;
        this.K = new LinkedBlockingDeque();
        this.ad = new ConcurrentHashMap();
        this.O = dkjj.CONFERENCE_FACTORY_URI;
        this.P = new Object();
        this.ae = false;
        this.Q = true;
        this.af = Optional.empty();
        this.S = dkjw.e;
        this.R = dkrpVar;
        this.F = bt(context, dkgmVar.a, eeftVar, bs(1));
        this.E = be(eenkVar);
        String e = eenkVar.e();
        if (e == null) {
            throw new eejg("Incoming request has no contact header");
        }
        this.J = e.contains("+g.gsma.rcs.isbot");
        this.L = new dkux(this.m);
        this.ag = instantMessageConfiguration;
        bq();
        eehk eehkVar = dkut.a;
        eekk b = eenkVar.b();
        this.V = b != null && (b.l("vnd.google.rcs.encrypted") || b.l("+vnd.google.rcs.encrypted"));
        this.X = new dkjd(instantMessageConfiguration.mMessageTech, 1);
        this.y = eenkVar.j("Contribution-ID");
        this.W = eenkVar.j("Accept-Contact");
        if (this.y == null && ((Boolean) djao.p().a.H.a()).booleanValue()) {
            as(eenkVar, this.l.d, 5);
            o(new eejg("Incoming request has no contributionId"), 2, 62);
            return;
        }
        if (ai()) {
            this.z = eenkVar.j("Conversation-ID");
        }
        List<eenh> o = eenkVar.o();
        eekt eektVar = eenkVar.a.e;
        for (eenh eenhVar : o) {
            if (!emuz.e(eenhVar.b, "application/resource-lists+xml") && !eenhVar.b.equalsIgnoreCase("application/sdp")) {
                byte[] bArr = eenhVar.a;
                String str = eenhVar.b;
                String str2 = this.l.g;
                String y = y();
                String x = x();
                dkjt dkjtVar = new dkjt(str2, bArr, str);
                boolean z = this.E;
                dkjtVar.o = z;
                dkjtVar.q = this.J;
                dkjtVar.p = z && TextUtils.equals(this.I, y);
                dkjtVar.c = y;
                dkjtVar.e = x;
                if (dkkm.b(dkjtVar)) {
                    try {
                        edzi b2 = edzi.b(dkjtVar.f);
                        dkjtVar.k = b2.g("urn:ietf:params:imdn", "Message-ID");
                        dkjtVar.j = b2.a();
                        dkjtVar.l = dkkm.a(b2);
                        dkjtVar.i = b2.c();
                    } catch (Exception unused) {
                        dkty.r(B, "Failed to parse CPIM msg to get IMDN msg ID and profile info!", new Object[0]);
                    }
                }
                TextUtils.isEmpty(null);
                this.N = dkjtVar;
                return;
            }
        }
    }

    public static boolean be(eenk eenkVar) {
        String e = eenkVar.e();
        if (e != null) {
            return e.contains(String.format(";%s", "isfocus"));
        }
        throw new eejg("Incoming request has no contact header");
    }

    protected static final eegc bj(dkjt dkjtVar) {
        eegc eegcVar;
        String str = dkjtVar.b;
        if (str == null) {
            dkty.r(B, "Message has no receiver - return null", new Object[0]);
            return null;
        }
        String str2 = dkjtVar.k;
        if ("message/cpim".equalsIgnoreCase(dkjtVar.h)) {
            edzh edzhVar = dkjtVar.g;
            if (edzhVar == null) {
                dkty.h(B, "MessageContent is null, return null", new Object[0]);
                return null;
            }
            eegcVar = new eegc(edzhVar, "message/cpim");
            if (dizq.p()) {
                str2.getClass();
                eegcVar.f(str2);
            }
        } else if (str2 == null) {
            edzh edzhVar2 = dkjtVar.g;
            if (edzhVar2 == null) {
                dkty.h(B, "MessageContent is null, return null", new Object[0]);
                return null;
            }
            eegcVar = new eegc(edzhVar2, dkjtVar.h);
        } else {
            edzi edziVar = new edzi(dkjtVar.h, "utf-8");
            edziVar.l(dkjtVar.c);
            edziVar.p(str);
            edziVar.j(dkjtVar.f);
            edziVar.o("imdn", "urn:ietf:params:imdn");
            edziVar.n("urn:ietf:params:imdn", "Message-ID", dkjtVar.k);
            edziVar.m("DateTime", dktc.a().toString());
            eegc eegcVar2 = new eegc(edziVar.s());
            eegcVar2.f(str2);
            eegcVar = eegcVar2;
        }
        if (!((Boolean) djac.a().a.c.a()).booleanValue() || dkjtVar.r) {
            eegcVar.e("yes");
        } else {
            eegcVar.e("no");
        }
        eegcVar.g();
        eegcVar.o = dkjtVar.b();
        return eegcVar;
    }

    private final String bn() {
        String str = this.y;
        String concat = str == null ? "" : "\r\n contributionId: ".concat(str);
        return " conferenceUri: " + dktx.URI.c(this.I) + concat + "\r\n conversationId: " + this.z + "\r\n sessionExitState: " + String.valueOf(this.ac) + "\r\n participants: " + dktx.USER_ID.b(aE());
    }

    private final void bo(dkjt dkjtVar, int i) {
        dkty.d(B, "Cleaning up %s", dkjtVar.toString());
        aG(dkjtVar, i);
    }

    private final void bp(int i) {
        if (this.p && ((!((Boolean) Z.a()).booleanValue() || !ai()) && this.N != null && !this.ae)) {
            dkty.d(B, "[Session ID: %s] Initial message has failed.", this.k);
            aG(this.N, i);
        }
        dkty.d(B, "[Session ID: %s] Need to cleanup %d pending and %d queued messages.", this.k, Integer.valueOf(this.ad.size()), Integer.valueOf(this.K.size()));
        Iterator it = this.ad.values().iterator();
        while (it.hasNext()) {
            bo((dkjt) it.next(), i);
        }
        this.ad.clear();
        Iterator it2 = this.K.iterator();
        while (it2.hasNext()) {
            bo((dkjt) it2.next(), i);
        }
        this.K.clear();
    }

    private final void bq() {
        if (this.I != null) {
            return;
        }
        this.I = this.l.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v19, types: [dkjw] */
    /* JADX WARN: Type inference failed for: r8v20, types: [dkjw] */
    /* JADX WARN: Type inference failed for: r8v23, types: [dkjw] */
    /* JADX WARN: Type inference failed for: r8v24, types: [dkjw] */
    /* JADX WARN: Type inference failed for: r8v25, types: [dkjw] */
    private final void br(eegc eegcVar, int i, eegg eeggVar) {
        int i2;
        dkjc dkjcVar;
        dktn dktnVar = B;
        dkty.l(dktnVar, "Data transfer error: message[%s]", dktx.MSRP_MESSAGE.c(eegcVar));
        dkjc dkjcVar2 = null;
        if (eegcVar != null) {
            dkjt dkjtVar = (dkjt) this.ad.remove(eegcVar);
            if (i == 3) {
                if (eeggVar != null) {
                    boolean z = this.E;
                    int i3 = eeggVar.a;
                    if (i3 != 400 && i3 != 403) {
                        if (i3 == 408) {
                            dkjcVar = dizg.H() ? dkjw.e : dkjw.g;
                        } else if (i3 != 415 && i3 != 501) {
                            dkjcVar = dkjw.g;
                        }
                        this.S = dkjcVar;
                        dkjcVar2 = dkjcVar;
                    }
                    dkjcVar = z ? dkjw.d : dkjw.c;
                    this.S = dkjcVar;
                    dkjcVar2 = dkjcVar;
                }
                i = 3;
            }
            if (dkjtVar != null) {
                int i4 = i - 1;
                if (i4 == 1) {
                    i2 = 58;
                } else if (i4 == 2) {
                    i2 = 57;
                    if (dkjcVar2 != null) {
                        int i5 = dkjcVar2.a;
                        switch (i5) {
                            case 1:
                                i2 = 62;
                                break;
                            case 2:
                                i2 = 63;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i2 = 64;
                                break;
                            default:
                                dkty.r(dktnVar, "Invalid error type %s", Integer.valueOf(i5));
                                break;
                        }
                    }
                } else {
                    i2 = i4 != 3 ? 55 : 52;
                }
                aG(dkjtVar, i2);
            }
        }
        if (dkjcVar2 != null && dkjcVar2.a == 3) {
            dkty.d(dktnVar, "Error %s, do not stop the session.", dkjcVar2);
            return;
        }
        if (this.a != dkho.RUNNING) {
            dkty.l(dktnVar, "Session is %s. Ignoring MSRP transfer error!", this.a.toString());
            return;
        }
        final boolean z2 = dkjcVar2 != null;
        if (!this.E) {
            bc(z2);
        } else if (((Boolean) djak.a().b.h.a()).booleanValue()) {
            dkty.r(dktnVar, "chat conference - MSRP connection is released. schedule disconnecting it.", new Object[0]);
            this.af = Optional.of(dksu.a(new Runnable() { // from class: dkkb
                @Override // java.lang.Runnable
                public final void run() {
                    dkkj.this.bc(z2);
                }
            }, 3L, TimeUnit.SECONDS));
        } else {
            dkty.r(dktnVar, "chat conference - disconnecting instead of stopping", new Object[0]);
            bc(z2);
        }
    }

    private static int bs(int i) {
        return i == 2 ? ((Integer) dizq.c().a.i.a()).intValue() : ((Integer) dizq.c().a.h.a()).intValue();
    }

    private static eegb bt(Context context, djjr djjrVar, eeft eeftVar, int i) {
        Optional a = djjp.a(djjrVar);
        if (context == null) {
            throw new eefw("Can't create msrp manager: no application context available");
        }
        if (a.isEmpty()) {
            throw new eefw("Can't create msrp manager: no network interface available");
        }
        return new eegb(context, ((djjs) a.get()).b(), (String) ((djjs) a.get()).a().orElseThrow(new Supplier() { // from class: dkkc
            @Override // java.util.function.Supplier
            public final Object get() {
                dktn dktnVar = dkkj.B;
                return new eefw("Can't create msrp manager: no local ip address");
            }
        }), eech.a(), eeftVar, i);
    }

    @Override // defpackage.dkha
    public final String B() {
        if (!this.E) {
            return super.B();
        }
        return bn() + VCardBuilder.VCARD_END_OF_LINE + super.B();
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0205 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0185 A[FALL_THROUGH] */
    @Override // defpackage.dkha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void M(defpackage.eenl r18) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkkj.M(eenl):void");
    }

    @Override // defpackage.dkha
    protected void P() {
        if (this.E) {
            bq();
        }
    }

    @Override // defpackage.dkha
    public final void Q(eenk eenkVar) {
        dkhm dkhmVar;
        String[] split;
        String trim;
        if (this.t != null) {
            try {
                dkty.l(dkha.f, "Send 200 OK", new Object[0]);
                super.ad(this.A.n(eenkVar));
            } catch (Exception e) {
                dkty.j(e, dkha.f, "Error while processing bye: %s", e.getMessage());
            }
        }
        if (this.E) {
            String j = eenkVar.j("Reason");
            String str = null;
            if (!TextUtils.isEmpty(j)) {
                if (!TextUtils.isEmpty(j) && (split = j.split(";")) != null) {
                    for (String str2 : split) {
                        if (!TextUtils.isEmpty(str2) && str2.startsWith("cause")) {
                            trim = str2.trim();
                            break;
                        }
                    }
                }
                trim = null;
                if (!TextUtils.isEmpty(trim)) {
                    List i = emye.b('=').i(trim);
                    if (i.size() >= 2) {
                        String str3 = (String) i.get(1);
                        if (!TextUtils.isEmpty(str3)) {
                            str = str3.trim();
                        }
                    }
                }
            }
            dkty.d(B, "Received a BYE, cause value of the reason header is %s", str);
            if (djag.n() && eenkVar.j("Referred-By") != null) {
                String j2 = eenkVar.j("Referred-By");
                j2.getClass();
                this.H = dkut.l(j2, u(), this.m);
            }
            if (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str)) {
                return;
            }
            int parseInt = Integer.parseInt(str);
            dkhm[] values = dkhm.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    dkhmVar = dkhm.DISCONNECT;
                    break;
                }
                dkhmVar = values[i2];
                if (dkhmVar.e == parseInt) {
                    break;
                } else {
                    i2++;
                }
            }
            dkty.d(B, "Setting exit state to %s", dkhmVar.toString());
            this.ac = dkhmVar;
        }
    }

    @Override // defpackage.dkha
    protected final void R(eenl eenlVar) {
        eekj eekjVar = eenlVar.a.j;
        if (eekjVar != null) {
            this.x = eekjVar;
            dkty.d(dkha.f, "conference header response: %s", this.x.a);
        }
        aI(eenlVar);
        try {
            if (this.E) {
                String f = eenlVar.f();
                if (TextUtils.isEmpty(f)) {
                    dkty.h(B, "Received empty conference URI from 200 OK", new Object[0]);
                } else {
                    this.I = f;
                }
            }
        } catch (Exception e) {
            dkty.j(e, B, "Conference URI set has failed: %s", e.getMessage());
        }
    }

    @Override // defpackage.dkha
    protected final void S(eenk eenkVar) {
        if (this.E || (ai() && ((Boolean) C.a()).booleanValue())) {
            try {
                dkhm aw = aw();
                eenkVar.s("Reason", "SIP;cause=" + aw.e + ";text=\"" + aw.f + "\"");
            } catch (eeje e) {
                dkty.j(e, B, "Can't add reason header: %s", e.getMessage());
            }
        }
    }

    @Override // defpackage.dkha
    protected void T(eenk eenkVar) {
        if (ai()) {
            dktn dktnVar = B;
            dkty.d(dktnVar, "CPM is enabled, adding Conversation-ID", new Object[0]);
            if (this.z == null) {
                dkty.h(dktnVar, "Conversation-ID not generated yet", new Object[0]);
                return;
            }
            if (eenkVar.j("Conversation-ID") != null) {
                dkty.r(dktnVar, "Conversation-ID was already added to INVITE header", new Object[0]);
                return;
            }
            try {
                String str = this.z;
                str.getClass();
                eenkVar.s("Conversation-ID", str);
            } catch (eeje e) {
                dkty.j(e, B, "SIP INVITE can't accept Conversation-ID: %s", e.getMessage());
            }
            if (((Boolean) djao.p().a.o.a()).booleanValue()) {
                try {
                    if (!dizg.E()) {
                        if (this.E) {
                            eenkVar.s("P-Preferred-Service", "urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session.group");
                            return;
                        } else {
                            eenkVar.s("P-Preferred-Service", "urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session");
                            return;
                        }
                    }
                    dkkt dkktVar = this.X;
                    Optional empty = !dkktVar.e() ? Optional.empty() : dkktVar.f() ? Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.largemsg") : this.E ? Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session.group") : Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session");
                    if (empty.isPresent()) {
                        eenkVar.s("P-Preferred-Service", (String) empty.get());
                    }
                } catch (eeje e2) {
                    dkty.j(e2, B, "SIP INVITE can't accept P-Preferred-Service: %s", e2.getMessage());
                }
            }
        }
    }

    @Override // defpackage.dkha
    protected final void U() {
        dkhi dkhiVar = this.ab;
        if (dkhiVar != null) {
            dkhiVar.i(this.ah);
            this.ab.l(true);
        }
    }

    @Override // defpackage.dkha
    public final void V(eenl eenlVar) {
        dkty.d(dkha.f, "Received session progress/ringing", new Object[0]);
        if (eenlVar.y() == 180) {
            this.r = true;
        }
        N(eenlVar);
        K(eenlVar.z());
        aI(eenlVar);
    }

    public final enip aA() {
        String str;
        String str2 = this.k;
        dktn dktnVar = B;
        dkty.d(dktnVar, "Retrieving remote accept wrapped types for group session: %s", str2);
        eenh g = this.l.g();
        if (g == null) {
            dkty.d(dktnVar, "No remote SDP. Cannot retrieve accept wrapped types for session: %s", str2);
            return enpd.a;
        }
        String b = g.b();
        if (emxe.c(b)) {
            dkty.d(dktnVar, "No remote SDP content. Cannot retrieve accept wrapped types for session: %s", str2);
            return enpd.a;
        }
        BufferedReader bufferedReader = new BufferedReader(new StringReader(b));
        eegw eegwVar = null;
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                if (readLine.startsWith("m=")) {
                    eegwVar = eegw.c(readLine);
                } else if (readLine.startsWith("c=") && !Objects.isNull(eegwVar)) {
                    eegwVar.c = eegt.a(readLine);
                } else if (readLine.startsWith("b=") && !Objects.isNull(eegwVar)) {
                    eegwVar.d = eegs.a(readLine);
                } else if (readLine.startsWith("i=") && !Objects.isNull(eegwVar)) {
                    eegwVar.b = eehh.c(readLine);
                } else if (readLine.startsWith("a=") && !Objects.isNull(eegwVar)) {
                    eegwVar.e(eegu.a(readLine));
                }
            }
        } catch (IOException unused) {
        }
        if (eegwVar == null) {
            dkty.d(B, "No remote SDP media description. Cannot retrieve accept wrapped types for session: %s", str2);
            return enpd.a;
        }
        eegu a = eegwVar.a("accept-wrapped-types");
        if (a != null && (str = a.b) != null) {
            return enip.n(aa.g(str));
        }
        dkty.d(B, "No remote accept wrapped types for session: %s", str2);
        return enpd.a;
    }

    public Optional aB() {
        return Optional.empty();
    }

    protected final String aC() {
        return (this.E || this.X.f()) ? "message/cpim" : "message/cpim application/im-iscomposing+xml";
    }

    protected String aD() {
        StringBuilder sb = new StringBuilder("text/plain application/vnd.gsma.rcs-ft-http+xml");
        if (this.E) {
            sb.append(" application/im-iscomposing+xml application/vnd.oma.cpm-groupdata+xml");
        }
        if (this.J) {
            sb.append(" multipart/mixed application/vnd.gsma.botsuggestion.v1.0+json application/vnd.gsma.botmessage.v1.0+json");
        }
        sb.append(" message/imdn+xml");
        if (this.Q) {
            sb.append(" application/vnd.gsma.rcspushlocation+xml");
        }
        return sb.toString();
    }

    public final List aE() {
        List list = this.G;
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
    }

    public final void aF(dkkk dkkkVar) {
        ((dkha) this).g.add(dkkkVar);
    }

    protected final void aG(dkjt dkjtVar, int i) {
        for (dkhd dkhdVar : ((dkha) this).g) {
            if (dkhdVar instanceof dkkk) {
                ((dkkk) dkhdVar).a(dkjtVar, i);
            }
        }
    }

    protected final void aH(dkjt dkjtVar) {
        for (dkhd dkhdVar : ((dkha) this).g) {
            if (dkhdVar instanceof dkkk) {
                ((dkkk) dkhdVar).b(dkjtVar);
            }
        }
    }

    final void aI(eenl eenlVar) {
        dkjt dkjtVar;
        if (this.ae) {
            return;
        }
        int y = eenlVar.y();
        if ((y != 180 && y != 486 && y != 200) || this.E || ai() || (dkjtVar = this.N) == null) {
            return;
        }
        this.ae = true;
        aH(dkjtVar);
    }

    protected final void aJ(dkjt dkjtVar) {
        dkty.d(B, "Received message: %s", dkjtVar.toString());
        for (dkhd dkhdVar : ((dkha) this).g) {
            if (dkhdVar instanceof dkkk) {
                ((dkkk) dkhdVar).c(dkjtVar);
            }
        }
    }

    public final void aK(String str, dkjy dkjyVar) {
        for (dkhd dkhdVar : ((dkha) this).g) {
            if (dkhdVar instanceof dkju) {
                ((dkju) dkhdVar).q(str, dkjyVar);
            }
        }
    }

    @Override // defpackage.eefv
    public final void aL(eegc eegcVar) {
        dkty.d(B, "Incoming msrp message: message=%s; contentType=%s", eegcVar.b(), eegcVar.h);
    }

    @Override // defpackage.eefv
    public final void aM(eegk eegkVar, eegc eegcVar) {
        bd();
        try {
            String str = eegcVar.h;
            dkjt dkjtVar = new dkjt(dkjs.UNKNOWN);
            dkjtVar.d(eegcVar.h, eegcVar.b.I());
            dkjtVar.c = y();
            dkjtVar.b = this.l.g;
            dkjtVar.e = x();
            boolean z = this.E;
            dkjtVar.o = z;
            dkjtVar.q = this.J;
            dkjtVar.p = z && TextUtils.equals(this.I, y());
            if (dktk.e(str, "message/cpim")) {
                edzi b = edzi.b(eegcVar.b.I());
                String f = b.f();
                if (f == null) {
                    throw new dkjy(8, "incoming message has no from header");
                }
                dkjtVar.c = edzj.a(f).a;
                String i = b.i();
                if (!GroupManagementContentType.CONTENT_TYPE.equals(b.e())) {
                    if (i == null) {
                        throw new dkjy(8, "incoming message has no to header");
                    }
                    dkjtVar.b = edzj.a(i).a;
                }
                String g = b.g("urn:ietf:params:imdn", "Message-ID");
                if (g != null) {
                    dkjtVar.k = g;
                }
                String t = b.t();
                if (t != null) {
                    dkjtVar.j = dktc.c(t).a;
                }
                dkjtVar.l = dkkm.a(b);
                dkjtVar.i = b.c();
            }
            dkty.d(B, "Received MSRP message:\nsender: %s\nreceiver: %s\ncontent-type: %s\nsize: %d\ncontent: %s", dktx.USER_ID.c(dkjtVar.c), dktx.USER_ID.c(dkjtVar.b), dkjtVar.h, Integer.valueOf(dkjtVar.f.length), dktx.MESSAGE_CONTENT.c(new String(dkjtVar.f, StandardCharsets.UTF_8)));
            aJ(dkjtVar);
        } catch (Exception e) {
            dkty.j(e, B, "Problem while receiving data", new Object[0]);
        }
    }

    @Override // defpackage.eefv
    public final void aN(eegk eegkVar, eegc eegcVar) {
        if (eegcVar.k) {
            return;
        }
        dktn dktnVar = B;
        dkty.d(dktnVar, "Data transferred: message[%s]", dktx.MSRP_MESSAGE.c(eegcVar));
        dkjt dkjtVar = (dkjt) this.ad.remove(eegcVar);
        if (dkjtVar == null) {
            dkty.r(dktnVar, "No instant message found for msrp message - skipping event", new Object[0]);
        } else {
            aH(dkjtVar);
        }
    }

    @Override // defpackage.eefv
    public final void aO(eegk eegkVar, eegc eegcVar) {
        dkty.l(B, "Data transfer aborted: message[%s]", dktx.MSRP_MESSAGE.c(eegcVar));
    }

    @Override // defpackage.eefv
    public final void aP(eegk eegkVar, eegc eegcVar, eegg eeggVar) {
        dkty.r(B, "MsrpRequestRejected, response: %s, status code %s", eeggVar.b, Integer.valueOf(eeggVar.a));
        br(eegcVar, 3, eeggVar);
    }

    @Override // defpackage.eefv
    public final void aS() {
        String str = this.k;
        dktn dktnVar = B;
        dkty.r(dktnVar, "Dedicated bearer is lost for session %s", str);
        if (dizg.x()) {
            dkty.l(dktnVar, "Session %s falling back to a default bearer.", this.k);
        } else {
            n(9, 69);
        }
    }

    public final void aT(dkkh dkkhVar) {
        int ordinal = dkkhVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            X(4, 7, 24);
            return;
        }
        if (ordinal == 2) {
            X(9, 7, 58);
            return;
        }
        if (ordinal == 3) {
            X(10, 7, 59);
            return;
        }
        if (ordinal == 4) {
            X(11, 7, 60);
        } else if (ordinal != 5) {
            X(2, this.d, this.e);
        } else {
            X(12, 7, 70);
        }
    }

    public final void aU(dkkk dkkkVar) {
        ((dkha) this).g.remove(dkkkVar);
    }

    public final void aV(dkjt dkjtVar) {
        if (!bg()) {
            dkty.h(B, "Unable to send message: %s, %d", this.a.toString(), Integer.valueOf(this.n));
            throw new dkjy();
        }
        if (dkjtVar.c == null) {
            dkjtVar.c = this.l.g;
        }
        if (dkjtVar.b == null) {
            dkjtVar.b = y();
        }
        dkty.w(13, 3, "Queueing message for sending %s with messageid=%s", dkjtVar, dkjtVar.k);
        this.K.add(dkjtVar);
    }

    public final void aW(long j, dkhi dkhiVar) {
        dkhi dkhiVar2 = this.ab;
        if (dkhiVar2 != null) {
            dkhiVar2.i(this.ah);
        }
        this.ab = dkhiVar;
        if (dkhiVar != null) {
            dkki dkkiVar = new dkki(this, j);
            this.ah = dkkiVar;
            dkhiVar.d(dkkiVar);
        }
    }

    public final void aX(boolean z) {
        emxf.l(this.a.equals(dkho.INITIAL));
        this.V = z;
    }

    public final void aY(boolean z) {
        if (!this.p) {
            dkty.r(B, "Ignoring disable network fallback signal: terminating session", new Object[0]);
        }
        if (this.a != dkho.INITIAL) {
            dkty.r(B, "Ignoring disable network fallback signal: session in state %s", this.a.toString());
        } else {
            this.U = z;
        }
    }

    protected final void aZ(dkjt dkjtVar, eegc eegcVar) {
        this.ad.put(eegcVar, dkjtVar);
    }

    @Override // defpackage.dkha
    public final boolean ai() {
        if (dizg.E()) {
            return this.X.e();
        }
        InstantMessageConfiguration instantMessageConfiguration = this.ag;
        eehk eehkVar = dkut.a;
        return instantMessageConfiguration.a();
    }

    public final dihz au(diib diibVar) {
        Optional ofNullable = this.J ? Optional.ofNullable(this.o) : Optional.empty();
        if (ofNullable.isEmpty()) {
            dkty.h(B, "BotId is missing; cannot wait for business info availability", new Object[0]);
            return dihz.CLIENT_ERROR;
        }
        String str = (String) ofNullable.get();
        if (diibVar.d(str) == dihz.INFO_LOCALLY_AVAILABLE) {
            dkty.l(B, "Business info is already locally available for %s", dktx.USER_ID_BOT.c(str));
            return dihz.INFO_LOCALLY_AVAILABLE;
        }
        if (BusinessInfoData.getVerifiedBotPlatform(str) == 0) {
            dkty.h(B, "Unknown platform for botId %s", dktx.USER_ID_BOT.c(str));
            return dihz.CLIENT_ERROR;
        }
        dkkd dkkdVar = new dkkd(this, str, diibVar);
        dktn dktnVar = B;
        dkty.l(dktnVar, "Starting new business info retrieval for botId %s", dktx.USER_ID_BOT.c(str));
        diibVar.g(str, dkkdVar);
        dkty.l(dktnVar, "Waiting for business info retrieval for botId %s", dktx.USER_ID_BOT.c(str));
        synchronized (this.P) {
            long millis = TimeUnit.SECONDS.toMillis(ermn.a(((Long) diyr.a().b.g.a()).longValue()));
            long millis2 = TimeUnit.SECONDS.toMillis(ermn.a(((Long) diyr.a().b.f.a()).longValue()));
            long currentTimeMillis = System.currentTimeMillis();
            long j = millis2 + currentTimeMillis;
            emxf.l(j > currentTimeMillis);
            long j2 = currentTimeMillis;
            while (currentTimeMillis < j) {
                try {
                    j2 = Math.min(j, j2 + millis);
                    while (currentTimeMillis < j2 && !diibVar.f(str)) {
                        this.P.wait(j2 - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                    if (diibVar.f(str)) {
                        dkty.l(B, "Business info retrieval completed for botId %s", dktx.USER_ID_BOT.c(str));
                        return diibVar.d(str);
                    }
                    try {
                        eehr eehrVar = this.l;
                        eenk eenkVar = eehrVar.i;
                        if (eenkVar == null) {
                            throw new eejg("No invite found for this session");
                        }
                        Z(eenkVar, eehrVar.d);
                    } catch (eejg e) {
                        dkty.h(B, "Could not send 180 ringing while retrieving business information: %s", e);
                        m(e);
                    }
                } catch (InterruptedException unused) {
                    dkty.h(B, "Interrupted while waiting for business information for botId %s", dktx.USER_ID_BOT.c(str));
                }
            }
            dkty.h(B, "Timeout - Business info retrieval period expired for botId %s", dktx.USER_ID_BOT.c(str));
            return dihz.SERVER_ERROR;
        }
    }

    protected final InstantMessageConfiguration av() {
        return t().d();
    }

    public final dkhm aw() {
        return this.E ? this.ac : dkhm.LEAVE;
    }

    protected final dkjt ax(int i) {
        dktn dktnVar = B;
        dkty.d(dktnVar, "Polling for next sending message", new Object[0]);
        dkjt dkjtVar = (dkjt) this.K.poll(i, TimeUnit.MILLISECONDS);
        dkty.d(dktnVar, "Found sending message %s", dkjtVar);
        return dkjtVar;
    }

    protected final eegk ay(String str, eefv eefvVar) {
        eefq eefqVar;
        eecp eecpVar;
        eegb eegbVar = this.F;
        if (str.startsWith("msrps")) {
            dkty.l(eegbVar.f, "Creating secure MSRP server endpoint at %d", Integer.valueOf(eegbVar.a));
            eeft eeftVar = eegbVar.b;
            final int i = eegbVar.a;
            if (((Boolean) dizg.o().a.ai.a()).booleanValue()) {
                final eece b = eeftVar.c.b();
                eecpVar = new eecp(new eecl() { // from class: eecc
                    @Override // defpackage.eecl
                    public final ServerSocket a() {
                        return eece.this.b(i);
                    }
                });
            } else {
                eecpVar = new eecp(new eecl() { // from class: eefs
                    @Override // defpackage.eecl
                    public final ServerSocket a() {
                        return SSLServerSocketFactory.getDefault().createServerSocket(i);
                    }
                });
            }
            eefqVar = new eefq(eeftVar.a, eecpVar, 4);
        } else {
            dkty.l(eegbVar.f, "Creating MSRP server endpoint at %d", Integer.valueOf(eegbVar.a));
            eeft eeftVar2 = eegbVar.b;
            final int i2 = eegbVar.a;
            Context context = eeftVar2.a;
            final eece b2 = eeftVar2.c.b();
            eefqVar = new eefq(context, new eecp(new eecl() { // from class: eecb
                @Override // defpackage.eecl
                public final ServerSocket a() {
                    return eece.this.c.createServerSocket(i2);
                }
            }), 2);
        }
        eegbVar.i(eefqVar, str, this.l.a, eefvVar, Optional.empty());
        new eefz(eegbVar, eefqVar).start();
        eegk eegkVar = eegbVar.c;
        eegkVar.getClass();
        return eegkVar;
    }

    protected final eegw az(boolean z) {
        if (this.w) {
            if (z) {
                return this.F.d();
            }
            eegb eegbVar = this.F;
            return eegbVar.e(eegbVar.e, eegbVar.d.a(), eegbVar.a);
        }
        if (z) {
            return this.F.b();
        }
        eegb eegbVar2 = this.F;
        return eegbVar2.c(eegbVar2.a, "TCP/MSRP", "msrp");
    }

    public final void ba(String[] strArr) {
        final ImsConfiguration u = u();
        this.G = (List) DesugarArrays.stream(strArr).map(new Function() { // from class: dkkf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dkut.l((String) obj, u, dkkj.this.m);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
    }

    public final void bb(dkhm dkhmVar) {
        if (!this.E) {
            dkty.r(B, "setting session exit state on 1:1 chat will be ignored by getSessionExitState", new Object[0]);
        }
        this.ac = dkhmVar;
    }

    public final void bc(boolean z) {
        if (z) {
            n(3, 61);
        } else {
            L(new dkjy(6, "Data transfer error"));
        }
    }

    protected final void bd() {
        this.M = System.currentTimeMillis();
    }

    public final boolean bf() {
        if (djac.d()) {
            return aA().contains("application/conference-info+xml");
        }
        return false;
    }

    public boolean bg() {
        if (this.af.isPresent()) {
            return false;
        }
        if (((((Boolean) Y.a()).booleanValue() || this.E) && this.a == dkho.STARTING) || this.a == dkho.RUNNING) {
            return true;
        }
        return this.a != dkho.STOPPED && this.n == 1;
    }

    public final String[] bh() {
        return (String[]) Collection.EL.toArray(this.X.d(), new IntFunction() { // from class: dkke
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                dktn dktnVar = dkkj.B;
                return new String[i];
            }
        });
    }

    @Override // defpackage.eefv
    public final void bi(eegk eegkVar, eegc eegcVar, int i) {
        br(eegcVar, i, null);
    }

    @Override // defpackage.eefv
    public final void bk(eegf eegfVar) {
        byte[] bArr;
        if (dizq.p()) {
            String e = eegfVar.e("Status");
            String a = eegfVar.a();
            String e2 = eegfVar.e("Status");
            if (e2 == null || e2.startsWith("000 200")) {
                dkty.l(B, "[%s] MSRP REPORT received with status 200", a);
                return;
            }
            dkty.r(B, "[%s] MSRP REPORT received with status: %s ", a, e);
            dkjt dkjtVar = new dkjt(dkjs.CPIM_MESSAGE);
            String str = this.l.g;
            str.getClass();
            dkjtVar.c = y();
            dkjtVar.b = str;
            dkjtVar.e = x();
            boolean z = this.E;
            dkjtVar.o = z;
            dkjtVar.q = this.J;
            dkjtVar.s = true;
            dkjtVar.p = z && TextUtils.equals(this.I, y());
            edzo edzoVar = new edzo("local:".concat(String.valueOf(String.valueOf(UUID.randomUUID()))), dkjtVar.c, str, eegfVar.d, edzn.DELIVERY_FAILED);
            dkjtVar.e("message/cpim");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                edzo.u(edzoVar, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                bArr = new byte[0];
            }
            dkjtVar.f = bArr;
            dkjtVar.a = dkjs.UNKNOWN;
            dkty.l(B, "[%s] Received MSRP REPORT - translated into IMDN:\nsender: %s\nreceiver: %s\ncontent-type: %s\nsize: %d\ncontent: %s", a, dktx.USER_ID.c(dkjtVar.c), dktx.USER_ID.c(dkjtVar.b), dkjtVar.h, Integer.valueOf(dkjtVar.f.length), dktx.MESSAGE_CONTENT.c(new String(dkjtVar.f, StandardCharsets.UTF_8)));
            aJ(dkjtVar);
            n(3, 61);
        }
    }

    public final void bl() {
        this.J = true;
    }

    public final void bm() {
        this.E = true;
    }

    @Override // defpackage.dkha, defpackage.dkgd
    protected final void f() {
        int i;
        this.F.h();
        int i2 = this.d;
        int i3 = this.e;
        dkjw dkjwVar = this.S;
        if (i3 == 21) {
            i = 51;
        } else if (i2 != 2 || i3 != 4) {
            int i4 = ((dkjc) dkjwVar).a;
            switch (i4) {
                case 1:
                    i = 59;
                    break;
                case 2:
                    i = 60;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    i = 61;
                    break;
                default:
                    dkty.r(B, "Invalid error type %s", Integer.valueOf(i4));
                    i = 50;
                    break;
            }
        } else {
            i = 52;
        }
        bp(i);
        try {
            super.ah(null);
        } catch (Exception e) {
            dkty.j(e, dkha.f, "Exception during service termination", new Object[0]);
            J();
            return;
        }
        if (this.u) {
            h(5);
            i(29);
            J();
            return;
        }
        if (this.t != null) {
            h(1);
            i(19);
            super.O();
            return;
        }
        eehr eehrVar = this.l;
        if (!eehrVar.m && !eehrVar.l) {
            if (this.p) {
                h(5);
                i(29);
                eehr eehrVar2 = this.l;
                if (eehrVar2.k) {
                    F();
                    return;
                } else {
                    if (eehrVar2.o) {
                        return;
                    }
                    ac(null);
                    return;
                }
            }
            int i5 = this.n;
            if (i5 == 2) {
                dkty.d(dkha.f, "Session has been rejected by user", new Object[0]);
                eehr eehrVar3 = this.l;
                eenk eenkVar = eehrVar3.i;
                eenkVar.getClass();
                aq(eenkVar, eehrVar3.d, 12);
                h(5);
                i(30);
                F();
                return;
            }
            if (i5 == 0) {
                eenk eenkVar2 = eehrVar.i;
                eenkVar2.getClass();
                String str = eehrVar.d;
                try {
                    dkty.l(dkha.f, "Send 408 Timeout", new Object[0]);
                    super.ad(this.A.p(eenkVar2, str, 408, 7));
                } catch (Exception e2) {
                    dkty.j(e2, dkha.f, "Can't send 408 Timeout", new Object[0]);
                }
                h(1);
                i(1);
                H(408, "Session has been rejected on timeout");
                return;
            }
            if (i5 == 3) {
                h(1);
                i(66);
                dkty.d(dkha.f, "Session has been canceled by remote user", new Object[0]);
                eehr eehrVar4 = this.l;
                eenk eenkVar3 = eehrVar4.i;
                eenkVar3.getClass();
                String str2 = eehrVar4.d;
                try {
                    dkty.l(dkha.f, "Send 487 Request terminated", new Object[0]);
                    super.ad(this.A.p(eenkVar3, str2, 487, 13));
                } catch (Exception e3) {
                    dkty.j(e3, dkha.f, "Can't send 487 Request Terminated response", new Object[0]);
                }
                Iterator it = ((dkha) this).g.iterator();
                while (it.hasNext()) {
                    try {
                        ((dkhd) it.next()).f();
                    } catch (Exception e4) {
                        dkty.j(e4, dkha.f, "handleSessionAbortedByRemote: Call to listener failed with error: ", new Object[0]);
                    }
                }
                return;
            }
            if (i5 == 4) {
                eenk eenkVar4 = eehrVar.i;
                eenkVar4.getClass();
                ar(eenkVar4, eehrVar.d, 16);
                h(2);
                i(24);
                H(488, "Session invitation was not acceptable");
                return;
            }
            if (i5 == 4) {
                dkty.d(dkha.f, "Session invitation was not acceptable", new Object[0]);
                eehr eehrVar5 = this.l;
                eenk eenkVar5 = eehrVar5.i;
                eenkVar5.getClass();
                ar(eenkVar5, eehrVar5.d, 17);
                h(2);
                i(24);
                H(488, "Not acceptable here");
                return;
            }
            if (i5 == 8) {
                dkty.d(dkha.f, "Session has been declined by user", new Object[0]);
                eehr eehrVar6 = this.l;
                eenk eenkVar6 = eehrVar6.i;
                eenkVar6.getClass();
                String str3 = eehrVar6.d;
                try {
                    dkty.l(dkha.f, "Send 603 Decline", new Object[0]);
                    super.ad(this.A.p(eenkVar6, str3, 603, 20));
                } catch (Exception e5) {
                    dkty.j(e5, dkha.f, "Can't send 603 Decline response", new Object[0]);
                }
                h(5);
                i(30);
                F();
                return;
            }
            if (i5 == 9) {
                eenk eenkVar7 = eehrVar.i;
                eenkVar7.getClass();
                aq(eenkVar7, eehrVar.d, 10);
                h(5);
                i(30);
                H(486, "Session from blocked user is declined");
                return;
            }
            if (i5 == 10) {
                dkty.d(dkha.f, "Session has been rejected by user; business info retrieval encountered a server error", new Object[0]);
                h(7);
                i(59);
                eehr eehrVar7 = this.l;
                eenk eenkVar8 = eehrVar7.i;
                eenkVar8.getClass();
                String str4 = eehrVar7.d;
                int a = ermn.a(((Long) diyr.a().b.k.a()).longValue());
                try {
                    dkty.l(dkha.f, "Sending 503 Service Unavailable", new Object[0]);
                    eenl p = this.A.p(eenkVar8, str4, 503, 19);
                    if (a > 0) {
                        dkty.l(dkha.f, "Add Retry-After header: %s", Integer.valueOf(a));
                        p.s("Retry-After", String.valueOf(a));
                    }
                    super.ad(p);
                    return;
                } catch (Exception e6) {
                    dkty.j(e6, dkha.f, "Can't send 503 Service Unavailable", new Object[0]);
                    return;
                }
            }
            if (i5 == 11) {
                dkty.d(dkha.f, "Session has been rejected by user; business info retrieval encountered a client error", new Object[0]);
                h(7);
                i(60);
                eehr eehrVar8 = this.l;
                eenk eenkVar9 = eehrVar8.i;
                eenkVar9.getClass();
                as(eenkVar9, eehrVar8.d, 6);
                return;
            }
            if (i5 == 12) {
                dkty.d(dkha.f, "Session has been rejected by user; business info retrieval encountered a client error", new Object[0]);
                h(7);
                i(70);
                eehr eehrVar9 = this.l;
                eenk eenkVar10 = eehrVar9.i;
                eenkVar10.getClass();
                String str5 = eehrVar9.d;
                try {
                    dkty.l(dkha.f, "Send 606 Not Acceptable", new Object[0]);
                    super.ad(this.A.p(eenkVar10, str5, 606, 22));
                    return;
                } catch (Exception e7) {
                    dkty.j(e7, dkha.f, "Can't send 606 Not Acceptable response", new Object[0]);
                    return;
                }
            }
            return;
            dkty.j(e, dkha.f, "Exception during service termination", new Object[0]);
            J();
            return;
        }
        if (this.d != 2) {
            super.ab();
        }
        h(5);
        i(29);
        J();
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    @Override // defpackage.dkha, defpackage.dkgd
    protected final void g(Throwable th) {
        dkqs dkqsVar;
        this.F.h();
        int i = th instanceof EOFException ? 52 : th instanceof eefw ? 56 : 0;
        bp(i);
        int i2 = 4;
        if (i == 0) {
            super.h(0);
            super.i(0);
        } else if (i == 52) {
            super.h(2);
            super.i(4);
        } else {
            super.h(2);
            super.i(61);
        }
        if (this.af.isPresent()) {
            this.af.get().cancel(false);
            this.af = Optional.empty();
        }
        if (th instanceof eefw) {
            th = new dkjy(51, th.getMessage(), th);
        }
        try {
            if (th instanceof dkqs) {
                dkqsVar = (dkqs) th;
            } else {
                if (th instanceof eehu) {
                    i2 = 7;
                } else if (th instanceof eejg) {
                    if (!(th.getCause() instanceof IOException)) {
                        String message = th.getMessage();
                        if (message != null) {
                            if (!message.contains("SipTransport is null")) {
                                if (message.contains("SIP message to send is null")) {
                                    i2 = 8;
                                }
                            }
                        }
                        i2 = 11;
                    }
                } else {
                    i2 = th instanceof dkhn ? 9 : th instanceof dkhl ? 10 : th instanceof IOException ? 5 : 0;
                }
                dkqsVar = new dkqs(i2, th.getMessage(), th);
            }
            super.ah(dkqsVar);
            if (this.t != null) {
                h(1);
                i(19);
                super.O();
                return;
            }
            eehr eehrVar = this.l;
            if (!eehrVar.m && !eehrVar.l) {
                if (this.p) {
                    h(2);
                    i(17);
                    eehr eehrVar2 = this.l;
                    if (eehrVar2.k) {
                        G(dkqsVar);
                        return;
                    } else {
                        if (eehrVar2.o) {
                            return;
                        }
                        ac(dkqsVar);
                        return;
                    }
                }
                if (this.n != 0) {
                    dkty.d(dkha.f, "Session has been rejected by user", new Object[0]);
                    eehr eehrVar3 = this.l;
                    eenk eenkVar = eehrVar3.i;
                    eenkVar.getClass();
                    ar(eenkVar, eehrVar3.d, 18);
                    h(5);
                    i(30);
                    G(dkqsVar);
                    return;
                }
                return;
            }
            h(2);
            i(29);
            super.ab();
            if (this.a == dkho.STARTING) {
                G(dkqsVar);
                return;
            }
            Iterator it = ((dkha) this).g.iterator();
            while (it.hasNext()) {
                try {
                    ((dkhd) it.next()).l(dkqsVar);
                } catch (Exception e) {
                    dkty.j(e, dkha.f, "handleSessionTerminated: Call to listener failed with error", new Object[0]);
                }
            }
        } catch (Exception e2) {
            dkty.j(e2, dkha.f, "Exception during service termination", new Object[0]);
            J();
        }
    }

    @Override // defpackage.dkha, defpackage.dkgd
    public final String toString() {
        if (!this.E) {
            return super.toString();
        }
        return bn() + VCardBuilder.VCARD_END_OF_LINE + super.toString();
    }

    public dkkj(Context context, dkgm dkgmVar, ffbr ffbrVar, String str, eeft eeftVar, dkrp dkrpVar, diod diodVar, dkur dkurVar, InstantMessageConfiguration instantMessageConfiguration, int i, dikx dikxVar) {
        super(context, dkgmVar, ffbrVar, str, null, diodVar, dkurVar);
        String str2;
        this.E = false;
        this.ac = dkhm.LEAVE_INVOLUNTARILY;
        this.K = new LinkedBlockingDeque();
        this.ad = new ConcurrentHashMap();
        this.O = dkjj.CONFERENCE_FACTORY_URI;
        this.P = new Object();
        this.ae = false;
        this.Q = true;
        this.af = Optional.empty();
        this.S = dkjw.e;
        this.R = dkrpVar;
        djji djjiVar = (djji) dkgmVar.a;
        djjw djjwVar = djjiVar.b;
        if (djjwVar != null && djjwVar.n()) {
            str2 = djjiVar.c().mWifiMediaTransport;
        } else {
            str2 = djjiVar.c().mPsMediaTransport;
        }
        this.w = "MSRPoTLS".equals(str2);
        this.F = bt(context, dkgmVar.a, eeftVar, bs(i));
        this.L = new dkux(this.m);
        this.ag = instantMessageConfiguration;
        this.W = null;
        this.X = new dkjd(instantMessageConfiguration.mMessageTech, i);
    }

    @Override // defpackage.eefv
    public final /* synthetic */ void aQ(eegk eegkVar, eegg eeggVar, eegc eegcVar) {
    }

    @Override // defpackage.eefv
    public final /* synthetic */ void aR(eegk eegkVar, eegg eeggVar, eegf eegfVar) {
    }
}
