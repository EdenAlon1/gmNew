package defpackage;

import android.content.Context;
import android.net.Network;
import android.os.PowerManager;
import j$.util.Optional;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeny implements eeno {
    public static final diyy a = dizd.a(181030825);
    public final dktn b;
    public eenp c;
    public eenz d;
    public final PowerManager.WakeLock g;
    private final String j;
    private final String k;
    private final int l;
    private int m;
    private final eejk n;
    private final String o;
    private final eece p;
    private final Network q;
    private final dikj r;
    private final UUID i = UUID.randomUUID();
    public eecp e = null;
    private eenx s = null;
    public long f = -1;
    final AtomicInteger h = new AtomicInteger(0);

    public eeny(Context context, Network network, String str, int i, String str2, int i2, String str3, dikj dikjVar, dktn dktnVar, eece eeceVar, eejk eejkVar) {
        this.q = network;
        this.j = str;
        this.m = i;
        this.k = str2;
        this.l = i2;
        this.o = str3;
        this.r = dikjVar;
        this.b = dktnVar;
        this.p = eeceVar;
        this.n = eejkVar;
        this.g = dkvi.a(context).newWakeLock(1, "CarrierServices:SipTransport");
    }

    private final ezbh t() {
        return this.n == eejk.TCP ? ezbh.SOCKET_PROTOCOL_TYPE_TCP : ezbh.SOCKET_PROTOCOL_TYPE_TLS;
    }

    @Override // defpackage.eeno
    public final int a() {
        return this.m;
    }

    @Override // defpackage.eeno
    public final int b() {
        return this.l;
    }

    @Override // defpackage.eeno
    public final String c() {
        return this.o;
    }

    @Override // defpackage.eeno
    public final String d() {
        return this.i.toString();
    }

    @Override // defpackage.eeno
    public final String e() {
        return this.j;
    }

    @Override // defpackage.eeno
    public final String f() {
        return this.k;
    }

    final synchronized void g(final Network network) {
        eecp eecpVar;
        try {
            ezbh t = t();
            dikj dikjVar = this.r;
            String str = this.j;
            String str2 = this.k;
            int i = this.l;
            if (!dikjVar.o()) {
                dkty.o("Logging socket opening event, protocol type = %s", t);
                ezba q = dikjVar.q(t, dikj.r(str), str2, i, dikj.r(str2));
                q.copyOnWrite();
                ezbl ezblVar = (ezbl) q.instance;
                ezbl ezblVar2 = ezbl.a;
                ezblVar.d = 1;
                ezblVar.b |= 2;
                dikjVar.l((ezbl) q.build());
            }
            eecm eecmVar = new eecm() { // from class: eenw
                @Override // defpackage.eecm
                public final InetAddress a(Socket socket, String str3) {
                    Network network2 = network;
                    eeny eenyVar = eeny.this;
                    dkty.l(eenyVar.b, "Binding socket to network [%s]", network2);
                    try {
                        network2.bindSocket(socket);
                        if (str3 == null) {
                            return null;
                        }
                        try {
                            return network2.getByName(str3);
                        } catch (IOException e) {
                            dkty.j(e, eenyVar.b, "error resolving static PCSCF host [%s] while connecting SIP transport", str3);
                            throw e;
                        }
                    } catch (IOException e2) {
                        dkty.j(e2, eenyVar.b, "error binding socket to network [%s]", network2);
                        throw e2;
                    }
                }
            };
            String str3 = this.k;
            int i2 = this.l;
            if (n()) {
                dkty.d(this.b, "Creating a TCP socket connection", new Object[0]);
                eecpVar = this.p.a(eecmVar, str3, i2, Optional.empty());
            } else {
                dkty.c("Creating a TLS socket connection", new Object[0]);
                final eece eeceVar = this.p;
                final String str4 = this.o;
                eecpVar = new eecp(new eeco() { // from class: eeca
                    @Override // defpackage.eeco
                    public final Socket a() {
                        int a2;
                        SSLSocket sSLSocket = (SSLSocket) eece.this.d().createSocket();
                        sSLSocket.setUseClientMode(true);
                        if (djao.a() > 0 && (a2 = (int) djas.a()) > 0) {
                            sSLSocket.setSoTimeout(a2);
                        }
                        String str5 = str4;
                        if (emxe.c(str5)) {
                            dkty.q("Invalid host, cannot setup host verification!", new Object[0]);
                            return sSLSocket;
                        }
                        if (erlu.b(str5)) {
                            dkty.c("Skipping host verification for IP address: %s", str5);
                            return sSLSocket;
                        }
                        if (((Boolean) eece.a.a()).booleanValue()) {
                            dkty.c("Enabling SNI.", new Object[0]);
                            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                            if (sSLParameters == null) {
                                sSLParameters = new SSLParameters();
                            }
                            sSLParameters.setServerNames(Arrays.asList(new SNIHostName(str5)));
                            sSLSocket.setSSLParameters(sSLParameters);
                        }
                        eecz eeczVar = this;
                        dkty.c("Setting up host for verification: %s", str5);
                        sSLSocket.addHandshakeCompletedListener(new eeda(str5, eeczVar));
                        return sSLSocket;
                    }
                }, eecmVar, str3, i2, Optional.empty());
            }
            this.e = eecpVar;
            eecpVar.d();
            this.e.b();
            dkty.w(21, 3, "SIP connection established", new Object[0]);
            ezbh t2 = t();
            dikj dikjVar2 = this.r;
            String str5 = this.j;
            String str6 = this.k;
            int i3 = this.l;
            if (dikjVar2.o()) {
                return;
            }
            dkty.o("Logging socket opened event, protocol type = %s", t2);
            ezba q2 = dikjVar2.q(t2, dikj.r(str5), str6, i3, dikj.r(str6));
            q2.copyOnWrite();
            ezbl ezblVar3 = (ezbl) q2.instance;
            ezbl ezblVar4 = ezbl.a;
            ezblVar3.d = 2;
            ezblVar3.b |= 2;
            dikjVar2.l((ezbl) q2.build());
        } catch (IOException e) {
            l();
            q(ezbe.SOCKET_FAILURE_UNABLE_TO_OPEN);
            throw new eenn(e);
        }
    }

    @Override // defpackage.eeno
    public final synchronized void h() {
        if (this.h.compareAndSet(0, 1)) {
            g(this.q);
            eenx eenxVar = new eenx(this);
            this.s = eenxVar;
            eenxVar.start();
        }
    }

    @Override // defpackage.eeno
    public final synchronized void i(eelv eelvVar) {
        eejg eejgVar;
        String u = eelvVar.s() ? eelvVar.u(2) : (eelvVar.t() && ((eelx) eelvVar).A()) ? eelvVar.v("ACK", 2) : null;
        try {
            this.d.getClass();
            if (this.s == null) {
                h();
            }
            byte[] b = eelvVar.b();
            if (b == null) {
                throw new eejg("SIP message to send is null");
            }
            dkty.d(this.b, ">>>>>>>>>> SIP send message[%s] started (%d bytes) [%s]", eelu.a(eelvVar.l), Integer.valueOf(b.length), u);
            eecp eecpVar = this.e;
            if (eecpVar == null) {
                s(2);
                dkty.h(this.b, "<<<<<<<<<< SIP message aborted [%s]: client socket is null", u);
                if (eelvVar.s() && u != null) {
                    this.d.a(u);
                }
            } else {
                OutputStream b2 = eecpVar.b();
                b2.write(b);
                b2.flush();
                dkty.d(this.b, "<<<<<<<<<< SIP message[%s] sent [%s]", eelu.a(eelvVar.l), u);
                if (!eelvVar.r()) {
                    this.d.b(eelvVar);
                }
            }
        } catch (eenn | IOException e) {
            s(3);
            dkty.j(e, this.b, "<<<<<<<<<< SIP message[%s] failed [%s]: %s", eelu.a(eelvVar.l), u, e.getMessage());
            q(ezbe.SOCKET_FAILURE_WRITE_ERROR);
            p();
            if (e instanceof eejg) {
                eejgVar = (eejg) e;
            } else {
                dktn dktnVar = this.b;
                eejgVar = new eejg(dktnVar.a + ": Can't send message: " + e.getMessage(), e);
            }
            eenp eenpVar = this.c;
            if (eenpVar != null) {
                eenpVar.a(d(), eejgVar);
            } else {
                dkty.r(this.b, "SipTransportErrorListener is null", new Object[0]);
            }
            throw eejgVar;
        }
    }

    @Override // defpackage.eeno
    public final void j(eenp eenpVar) {
        this.c = eenpVar;
    }

    @Override // defpackage.eeno
    public final void k(eenz eenzVar) {
        this.d = eenzVar;
    }

    @Override // defpackage.eeno
    public final synchronized void l() {
        if (this.h.compareAndSet(1, 2)) {
            eenx eenxVar = this.s;
            if (eenxVar != null) {
                eenxVar.interrupt();
            }
            r();
        }
    }

    @Override // defpackage.eeno
    public final void m(int i) {
        this.m = i;
    }

    @Override // defpackage.eeno
    public final boolean n() {
        return this.n == eejk.TCP;
    }

    @Override // defpackage.eeno
    public final boolean o() {
        return this.n == eejk.TLS;
    }

    final synchronized void p() {
        try {
            eecp eecpVar = this.e;
            if (eecpVar != null) {
                eecpVar.c();
            }
            dkty.w(22, 3, "SIP connection disconnected", new Object[0]);
            ezbh t = t();
            dikj dikjVar = this.r;
            String str = this.j;
            String str2 = this.k;
            int i = this.l;
            if (!dikjVar.o()) {
                dkty.o("Logging socket closed event, protocol type = %s", t);
                ezba q = dikjVar.q(t, dikj.r(str), str2, i, dikj.r(str2));
                q.copyOnWrite();
                ezbl ezblVar = (ezbl) q.instance;
                ezbl ezblVar2 = ezbl.a;
                ezblVar.d = 4;
                ezblVar.b |= 2;
                dikjVar.l((ezbl) q.build());
            }
        } catch (Exception e) {
            dkty.t(e, this.b, "Unable to close socket", new Object[0]);
            q(ezbe.SOCKET_FAILURE_UNABLE_TO_CLOSE);
        }
        this.e = null;
    }

    public final void q(ezbe ezbeVar) {
        dikj dikjVar = this.r;
        ezbh t = t();
        long j = this.f;
        if (dikjVar.o()) {
            return;
        }
        int i = this.l;
        String str = this.k;
        String str2 = this.j;
        dkty.o("Logging socket failure event, protocol type = %s, reason = %s", t, ezbeVar);
        ezba q = dikjVar.q(t, dikj.r(str2), str, i, dikj.r(str));
        q.copyOnWrite();
        ezbl ezblVar = (ezbl) q.instance;
        ezbl ezblVar2 = ezbl.a;
        ezblVar.d = 3;
        ezblVar.b |= 2;
        q.copyOnWrite();
        ezbl ezblVar3 = (ezbl) q.instance;
        ezblVar3.e = ezbeVar.j;
        ezblVar3.b |= 4;
        q.copyOnWrite();
        ezbl ezblVar4 = (ezbl) q.instance;
        ezblVar4.b |= 512;
        ezblVar4.l = j;
        dikjVar.l((ezbl) q.build());
    }

    public final void r() {
        p();
        this.s = null;
        try {
            this.d.d();
        } catch (Exception e) {
            s(4);
            dkty.j(e, this.b, "caught exception in SipTransport#teardown", new Object[0]);
        }
    }

    public final void s(int i) {
        this.r.s(d(), i);
    }
}
