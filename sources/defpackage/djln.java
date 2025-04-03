package defpackage;

import android.net.Network;
import android.telephony.ims.ImsManager;
import android.telephony.ims.ImsRcsManager;
import android.telephony.ims.RcsUceAdapter;
import android.telephony.ims.SipDelegateConfiguration;
import android.telephony.ims.SipDelegateManager;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djln implements djjw {
    static final diyy a = dizd.a(190970850);
    private final dktn b;
    private final djmn c;
    private djmm d;

    @Deprecated
    private final djts e;
    private final djtl f;
    private final dikj g;
    private int h = -1;
    private final djjk i = new djlm();
    private final djjo j;

    public djln(dktn dktnVar, djmn djmnVar, djjo djjoVar, djts djtsVar, djtl djtlVar, dikj dikjVar) {
        this.b = dktnVar;
        this.c = djmnVar;
        this.j = djjoVar;
        this.e = djtsVar;
        this.f = djtlVar;
        this.g = dikjVar;
    }

    @Override // defpackage.djjw
    public final djjk a() {
        return this.i;
    }

    @Override // defpackage.djjw
    public final djjt b() {
        return null;
    }

    @Override // defpackage.djjw
    public final Optional c() {
        return Optional.of(djjs.d((String) Optional.ofNullable(this.j.a).map(new Function() { // from class: djjl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((InetAddress) obj).getHostAddress();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null), (Network) Optional.ofNullable(this.j.b).orElse(null), l()));
    }

    @Override // defpackage.djjw
    public final String d() {
        if (!l()) {
            return dizg.J() ? this.f.a.m().w() : this.e.a.w();
        }
        djmm djmmVar = this.d;
        djmmVar.getClass();
        return djmmVar.z();
    }

    @Override // defpackage.djjw
    public final synchronized void e() {
        djmm djmmVar = this.d;
        dkty.l(this.b, "Destroying RegistrationEngine.", new Object[0]);
        if (Objects.isNull(djmmVar)) {
            return;
        }
        djmmVar.F();
        djmmVar.m();
        this.d = null;
    }

    @Override // defpackage.djjw
    public final void f(PrintWriter printWriter) {
        if (((Boolean) a.a()).booleanValue()) {
            printWriter.println("    - SingleRegistrationRegistrationController: ".concat(this.b.a));
            djmm djmmVar = this.d;
            if (djmmVar != null) {
                printWriter.println("     - SingleRegistrationStateMachine ".concat(String.valueOf(String.valueOf(djmmVar.i))));
                djma djmaVar = (djma) djmmVar.d();
                printWriter.println("       state: ".concat(djmaVar != null ? djmaVar.a() : "UnknownState"));
                SipDelegateConfiguration sipDelegateConfiguration = djmmVar.E;
                if (sipDelegateConfiguration != null) {
                    printWriter.println("       - SipDelegateConfiguration");
                    printWriter.println("         p_access_network_info_header: ".concat(String.valueOf(dktx.GENERIC.c(sipDelegateConfiguration.getSipPaniHeader()))));
                    printWriter.println("         security_verify_header: ".concat(String.valueOf(dktx.GENERIC.c(Optional.ofNullable(sipDelegateConfiguration.getIpSecConfiguration()).map(new djlp()).orElse("")))));
                    printWriter.println("         home_domain: ".concat(String.valueOf(sipDelegateConfiguration.getHomeDomain())));
                    printWriter.println("         ue_public_user_id: ".concat(String.valueOf(dktx.USER_ID.c(sipDelegateConfiguration.getPublicUserIdentifier()))));
                    printWriter.println("         server_default_ipaddress: ".concat(String.valueOf(dktx.IP_ADDRESS.c(sipDelegateConfiguration.getSipServerAddress().getAddress().getHostAddress()))));
                    printWriter.println("         server_default_port: " + sipDelegateConfiguration.getSipServerAddress().getPort());
                    printWriter.println("         ue_default_ipaddress: ".concat(String.valueOf(dktx.IP_ADDRESS.c(sipDelegateConfiguration.getLocalAddress().getAddress().getHostAddress()))));
                    printWriter.println("         ue_default_port: " + sipDelegateConfiguration.getLocalAddress().getPort());
                    printWriter.println("         p_associated_uri_header: ".concat(String.valueOf(dktx.URI_SIP.c(sipDelegateConfiguration.getSipAssociatedUriHeader()))));
                    printWriter.println("         service_route_header: ".concat(String.valueOf(dktx.IP_ADDRESS.c(sipDelegateConfiguration.getSipServiceRouteHeader()))));
                    printWriter.println("         uri_user_part: ".concat(String.valueOf(dktx.USER_ID.c(sipDelegateConfiguration.getSipContactUserParameter()))));
                    printWriter.println("         user_agent: ".concat(String.valueOf(dktx.GENERIC.c(sipDelegateConfiguration.getSipUserAgentHeader()))));
                }
            }
        }
    }

    @Override // defpackage.djjw
    public final void g(dilc dilcVar) {
        dkty.l(this.b, "Restarting IMS registration. reason=%s", dilcVar);
        int i = this.h;
        j(dilcVar);
        i(i);
    }

    @Override // defpackage.djjw
    public final void h(dilc dilcVar, int i) {
        dkty.l(this.b, "Restarting IMS registration. reason=%s sipCode=%d", dilcVar, Integer.valueOf(i));
        if (dilcVar != dilc.REREGISTRATION_REQUIRED) {
            g(dilcVar);
            return;
        }
        djmm djmmVar = this.d;
        if (djmmVar != null) {
            djmmVar.r(18, i);
        }
    }

    @Override // defpackage.djjw
    public final synchronized void i(int i) {
        ImsRcsManager imsRcsManager;
        ImsRcsManager imsRcsManager2;
        RcsUceAdapter uceAdapter;
        dkty.l(this.b, "Request to start registration to IMS network.", new Object[0]);
        djmm djmmVar = this.d;
        if (djmmVar == null || djmmVar.d() == djmmVar.t) {
            if (!Objects.isNull(djmmVar)) {
                djmmVar.F();
            }
            dkty.l(this.b, "Starting RegistrationStateMachine.", new Object[0]);
            djmn djmnVar = this.c;
            int b = djmnVar.d.b();
            ImsManager m68m = aeb$$ExternalSyntheticApiModelOutline0.m68m(djmnVar.a.getSystemService(aeb$$ExternalSyntheticApiModelOutline0.m71m()));
            imsRcsManager = m68m.getImsRcsManager(b);
            SipDelegateManager sipDelegateManager = m68m.getSipDelegateManager(b);
            imsRcsManager2 = m68m.getImsRcsManager(b);
            uceAdapter = imsRcsManager2.getUceAdapter();
            djmm djmmVar2 = new djmm(uceAdapter, djmnVar.h, djmnVar.e, djmnVar.f, djmnVar.c, djmnVar.b, sipDelegateManager, djmnVar.g, djmnVar.r, djmnVar.i, djmnVar.p, djmnVar.j, djmnVar.q, djmnVar.k, imsRcsManager, djmnVar.l, djmnVar.m, ((Boolean) djao.p().a.N.a()).booleanValue() ? Optional.of(new djlg()) : Optional.empty(), djmnVar.n, djmnVar.o);
            if (Objects.isNull(djmmVar2)) {
                dkty.g("Failed to create RegistrationEngineStateMachine.", new Object[0]);
                return;
            }
            djmmVar2.o(new djmw(djmmVar2.A(), this.g));
            djmmVar2.v();
            this.d = djmmVar2;
            djmmVar = djmmVar2;
        }
        if (Objects.isNull(djmmVar)) {
            return;
        }
        if (djmmVar.N()) {
            dkty.d(this.b, "Already registered", new Object[0]);
        } else {
            this.h = i;
            djmmVar.q(3);
        }
    }

    @Override // defpackage.djjw
    public final synchronized void j(dilc dilcVar) {
        dkty.l(this.b, "Unregistering from IMS network. reason=%s", dilcVar);
        djmm djmmVar = this.d;
        if (Objects.isNull(djmmVar)) {
            return;
        }
        djmmVar.F();
        this.d = null;
        this.h = -1;
    }

    @Override // defpackage.djjw
    public final boolean k() {
        djmm djmmVar = this.d;
        if (Objects.isNull(djmmVar)) {
            return false;
        }
        return djmmVar.O() || djmmVar.N();
    }

    @Override // defpackage.djjw
    public final boolean l() {
        djmm djmmVar = this.d;
        if (Objects.isNull(djmmVar)) {
            return false;
        }
        return djmmVar.N();
    }

    @Override // defpackage.djjw
    public final boolean m() {
        djmm djmmVar = this.d;
        if (Objects.isNull(djmmVar)) {
            return false;
        }
        return djmmVar.O();
    }

    @Override // defpackage.djjw
    public final boolean n() {
        return false;
    }
}
