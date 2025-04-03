package defpackage;

import android.content.Context;
import android.net.Network;
import j$.util.Objects;
import j$.util.Optional;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegb {
    private static final dktn g = new dktn("MsrpManager");
    public final int a;
    public final eeft b;
    public eegk c;
    public final eefo d;
    public final String e;
    public final dktn f;
    private final String h;
    private final String i;
    private final Context j;
    private final Optional k;
    private final int l;
    private int m;

    public eegb(Context context, Optional optional, String str, int i, eeft eeftVar, int i2) {
        String b = eeja.b();
        eefo t = ((eega) dipp.a(eega.class)).t();
        String c = djak.c();
        this.c = null;
        this.m = 1;
        this.h = str;
        this.a = i;
        this.i = b;
        this.d = t;
        this.e = c;
        this.b = eeftVar;
        this.j = context.getApplicationContext();
        this.k = optional;
        this.f = new dktn("MsrpManager[%s]", b);
        this.l = i2;
    }

    public static String g(eegw eegwVar) {
        eegu a = eegwVar.a("setup");
        String str = a != null ? a.b : "passive";
        dkty.d(g, "Remote setup attribute is %s", str);
        if (str != null) {
            return str.equals("active") ? "passive" : "active";
        }
        throw new IllegalStateException("expected non-null remoteSetup");
    }

    private final Optional j() {
        if (((Boolean) djak.a().b.o.a()).booleanValue()) {
            return Optional.of(new InetSocketAddress(this.h, djak.p() ? this.a : 0));
        }
        dkty.r(this.f, "enableBindMsrpSocketLocalAddress is disabled, binding MSRP connection to any ip/port", new Object[0]);
        return Optional.empty();
    }

    private final String k() {
        int i = this.m;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? "UNKNOWN" : "CLOSED" : "SETUP" : "NEW";
        }
        throw null;
    }

    public final eegk a(String str, int i, String str2, String str3, String str4, eefv eefvVar) {
        int i2;
        boolean startsWith;
        eefy eefyVar;
        eefq eefqVar;
        try {
            startsWith = str3.startsWith("msrps");
            eefyVar = new eefy(eefvVar);
        } catch (Exception e) {
            e = e;
            i2 = 0;
        }
        try {
            if (startsWith) {
                dkty.l(this.f, "Creating secure MSRP client connection to %s on network[%s]", erls.a(str, i).toString(), this.k);
                eeft eeftVar = this.b;
                Optional ofNullable = Optional.ofNullable(str2);
                final Optional optional = this.k;
                final Optional j = j();
                Context context = eeftVar.a;
                final eece a = eeftVar.c.a();
                final KeyStore b = eeftVar.b.b();
                i2 = 0;
                final String str5 = (String) ofNullable.orElse(null);
                eefqVar = new eefq(context, new eecp(new eeco() { // from class: eecd
                    @Override // defpackage.eeco
                    public final Socket a() {
                        return eece.this.c(b, str5);
                    }
                }, new eecm() { // from class: eefr
                    @Override // defpackage.eecm
                    public final InetAddress a(Socket socket, String str6) {
                        Optional optional2 = Optional.this;
                        if (optional2.isPresent()) {
                            dkty.c("Binding MSRP socket to local address %s", dktx.IP_ADDRESS.c(optional2));
                            socket.bind((SocketAddress) optional2.get());
                        }
                        Optional optional3 = optional;
                        if (!optional3.isPresent()) {
                            return null;
                        }
                        dkty.c("Bind socket to network %s", optional3);
                        ((Network) optional3.get()).bindSocket(socket);
                        if (Objects.nonNull(str6)) {
                            return ((Network) optional3.get()).getByName(str6);
                        }
                        return null;
                    }
                }, str, i, Optional.of(eeftVar.d.a(optional, eefyVar))), 3);
            } else {
                i2 = 0;
                dkty.l(this.f, "Creating insecure MSRP client connection to %s on network[%s]", erls.a(str, i).toString(), this.k);
                eeft eeftVar2 = this.b;
                final Optional optional2 = this.k;
                final Optional j2 = j();
                eefqVar = new eefq(eeftVar2.a, eeftVar2.c.a().a(new eecm() { // from class: eefr
                    @Override // defpackage.eecm
                    public final InetAddress a(Socket socket, String str6) {
                        Optional optional22 = Optional.this;
                        if (optional22.isPresent()) {
                            dkty.c("Binding MSRP socket to local address %s", dktx.IP_ADDRESS.c(optional22));
                            socket.bind((SocketAddress) optional22.get());
                        }
                        Optional optional3 = optional2;
                        if (!optional3.isPresent()) {
                            return null;
                        }
                        dkty.c("Bind socket to network %s", optional3);
                        ((Network) optional3.get()).bindSocket(socket);
                        if (Objects.nonNull(str6)) {
                            return ((Network) optional3.get()).getByName(str6);
                        }
                        return null;
                    }
                }, str, i, Optional.of(eeftVar2.d.a(optional2, eefyVar))), 1);
            }
            eefq eefqVar2 = eefqVar;
            i(eefqVar2, str3, str4, eefvVar, Optional.of(erls.a(str, i)));
            eefqVar2.b();
            dktn dktnVar = this.f;
            Object[] objArr = new Object[1];
            objArr[i2] = this.c;
            dkty.l(dktnVar, "MSRP client endpoint created and opened: %s", objArr);
            Object[] objArr2 = new Object[1];
            objArr2[i2] = this.c;
            dkty.w(8, 3, "MSRP client endpoint created and opened: %s", objArr2);
            eegk eegkVar = this.c;
            eegkVar.getClass();
            return eegkVar;
        } catch (Exception e2) {
            e = e2;
            dkty.j(e, this.f, "Couldn't create the MSRP client session", new Object[i2]);
            String valueOf = String.valueOf(e.getMessage());
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            throw new eefw("MSRP client session creation failed: ".concat(valueOf), th);
        }
    }

    public final eegw b() {
        return c(djak.p() ? this.a : 9, "TCP/MSRP", "msrp");
    }

    public final eegw c(int i, String str, String str2) {
        eegw eegwVar = new eegw(eegv.MESSAGE, i, 1, str, "*");
        eegwVar.e(new eegu("path", f(str2, i)));
        return eegwVar;
    }

    public final eegw d() {
        return e(this.e, this.d.a(), djak.p() ? this.a : 9);
    }

    public final eegw e(String str, String str2, int i) {
        eegw c = c(i, "TCP/TLS/MSRP", "msrps");
        c.e(new eegu("fingerprint", a.w(str2, str, " ")));
        return c;
    }

    final String f(String str, int i) {
        String str2 = this.h;
        if ((erlu.a(str2) instanceof Inet6Address) && str2.trim().charAt(0) != '[') {
            str2 = a.a(str2, "[", "]");
        }
        return String.format(Locale.US, "%1$s://%2$s:%3$d/%4$s;tcp", str, str2, Integer.valueOf(i), this.i);
    }

    public final synchronized void h() {
        dkty.w(9, 3, "MSRP connection disconnected", new Object[0]);
        eegk eegkVar = this.c;
        if (eegkVar != null) {
            try {
                dkty.l(this.f, "Closing MSRP session for SIP call id:[%s] from state:[%s]", ((eego) eegkVar).c, k());
                eegk eegkVar2 = this.c;
                dkty.d(((eego) eegkVar2).f, "Closing msrp media session", new Object[0]);
                ((eego) eegkVar2).h.ifPresent(new eegn());
                final eefq eefqVar = ((eego) eegkVar2).b;
                new Thread(new Runnable() { // from class: eefp
                    @Override // java.lang.Runnable
                    public final void run() {
                        eefq eefqVar2 = eefq.this;
                        eege eegeVar = eefqVar2.d;
                        if (eegeVar != null) {
                            eegeVar.a = true;
                            try {
                                eegeVar.interrupt();
                            } catch (Exception unused) {
                            }
                            dkty.c("Receiver is terminated", new Object[0]);
                            eefqVar2.d = null;
                        }
                        try {
                            eefqVar2.f.c();
                            dkty.c("Connection has been closed", new Object[0]);
                        } catch (Exception e) {
                            try {
                                dkty.i(e, "Couldn't close socket correctly", new Object[0]);
                            } catch (Exception e2) {
                                dkty.i(e2, "Couldn't close socket correctly", new Object[0]);
                            }
                        }
                    }
                }).start();
            } catch (Exception e) {
                dkty.j(e, this.f, "Error while closing session", new Object[0]);
            }
            this.c = null;
        } else {
            dkty.l(this.f, "Closing the MSRP session - session does not exist from state:[%s]", k());
        }
        this.m = 3;
    }

    public final void i(eefq eefqVar, String str, String str2, eefv eefvVar, Optional optional) {
        String f;
        int i = eefqVar.h;
        boolean z = i == 3 || i == 4;
        if (this.m == 3) {
            throw new IllegalStateException("state should not be CLOSED. did you call closeSession before calling setupSession?");
        }
        String str3 = true != z ? "msrp" : "msrps";
        String str4 = this.i;
        if (eefqVar.c()) {
            f = f(str3, djak.p() ? this.a : 9);
        } else {
            f = f(str3, this.a);
        }
        eego eegoVar = new eego(str4, eefqVar, str, f, str2, new eegj(this.l), engw.s(eefvVar, new eefx(this.j, ((eegl) dipp.a(eegl.class)).k())), new SecureRandom(), optional);
        this.c = eegoVar;
        dkty.l(this.f, "created msrp session for SIP call id:[%s] from state:[%s]", eegoVar.c, k());
        this.m = 2;
    }
}
