package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhig extends fhjs implements fhfl {
    public static final /* synthetic */ int n = 0;
    public final fhhf a;
    public Socket b;
    public Socket c;
    public fhge d;
    public fhgt e;
    public fhkf f;
    public fhmv g;
    public fhmu h;
    public boolean i;
    public int j;
    public int k;
    public final List l;
    public long m;
    private boolean p;
    private int q;
    private int r;

    public fhig(fhhf fhhfVar) {
        fhhfVar.getClass();
        this.a = fhhfVar;
        this.k = 1;
        this.l = new ArrayList();
        this.m = Long.MAX_VALUE;
    }

    public final Socket a() {
        Socket socket = this.c;
        socket.getClass();
        return socket;
    }

    public final void b() {
        Socket socket = this.b;
        if (socket != null) {
            fhhl.r(socket);
        }
    }

    public final synchronized void c() {
        this.q++;
    }

    public final synchronized void d() {
        this.p = true;
    }

    public final synchronized void e() {
        this.i = true;
    }

    @Override // defpackage.fhjs
    public final void f(fhkn fhknVar) {
        fhknVar.k(8, null);
    }

    public final synchronized void g(fhid fhidVar, IOException iOException) {
        if (iOException instanceof fhku) {
            fhku fhkuVar = (fhku) iOException;
            if (fhkuVar.a == 8) {
                int i = this.r + 1;
                this.r = i;
                if (i > 1) {
                    this.i = true;
                    this.j++;
                }
            } else if (fhkuVar.a != 9 || !fhidVar.l) {
                this.i = true;
                this.j++;
            }
        } else if (!i() || (iOException instanceof fhji)) {
            this.i = true;
            if (this.q == 0) {
                fhgs fhgsVar = fhidVar.a;
                fhhf fhhfVar = this.a;
                if (fhhfVar.b.type() != Proxy.Type.DIRECT) {
                    fhey fheyVar = fhhfVar.a;
                    fheyVar.h.connectFailed(fheyVar.i.f(), fhhfVar.b.address(), iOException);
                }
                fhgsVar.z.b(fhhfVar);
                this.j++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (defpackage.fhlv.b(r7, (java.security.cert.X509Certificate) r0) != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.fhey r6, java.util.List r7) {
        /*
            r5 = this;
            byte[] r0 = defpackage.fhhl.a
            java.util.List r0 = r5.l
            int r0 = r0.size()
            int r1 = r5.k
            r2 = 0
            if (r0 >= r1) goto Lca
            boolean r0 = r5.i
            if (r0 == 0) goto L13
            goto Lca
        L13:
            fhhf r0 = r5.a
            fhey r0 = r0.a
            boolean r0 = r0.a(r6)
            if (r0 == 0) goto Lca
            fhgk r0 = r6.i
            fhhf r1 = r5.a
            fhey r1 = r1.a
            fhgk r1 = r1.i
            java.lang.String r0 = r0.c
            java.lang.String r1 = r1.c
            boolean r0 = defpackage.ffkj.e(r0, r1)
            r1 = 1
            if (r0 == 0) goto L31
            return r1
        L31:
            fhkf r0 = r5.f
            if (r0 != 0) goto L36
            return r2
        L36:
            if (r7 == 0) goto Lca
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L40
            goto Lca
        L40:
            java.util.Iterator r7 = r7.iterator()
        L44:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r0 = r7.next()
            fhhf r0 = (defpackage.fhhf) r0
            java.net.Proxy r3 = r0.b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L44
            fhhf r3 = r5.a
            java.net.Proxy r3 = r3.b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L44
            fhhf r3 = r5.a
            java.net.InetSocketAddress r0 = r0.c
            java.net.InetSocketAddress r3 = r3.c
            boolean r0 = defpackage.ffkj.e(r3, r0)
            if (r0 == 0) goto L44
            javax.net.ssl.HostnameVerifier r7 = r6.d
            fhlv r0 = defpackage.fhlv.a
            if (r7 != r0) goto Lca
            fhgk r7 = r6.i
            fhhf r0 = r5.a
            int r3 = r7.d
            fhey r0 = r0.a
            fhgk r0 = r0.i
            int r4 = r0.d
            if (r3 == r4) goto L87
            goto Lca
        L87:
            java.lang.String r3 = r7.c
            java.lang.String r0 = r0.c
            boolean r0 = defpackage.ffkj.e(r3, r0)
            if (r0 == 0) goto L92
            goto Lb5
        L92:
            boolean r0 = r5.p
            if (r0 != 0) goto Lca
            fhge r0 = r5.d
            if (r0 == 0) goto Lca
            java.util.List r0 = r0.a()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto Lca
            java.lang.String r7 = r7.c
            java.lang.Object r0 = r0.get(r2)
            r0.getClass()
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            boolean r7 = defpackage.fhlv.b(r7, r0)
            if (r7 == 0) goto Lca
        Lb5:
            fhfh r6 = r6.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r6.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            fhge r7 = r5.d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r7.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            java.util.List r7 = r7.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r7.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            r6.b()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lca
            return r1
        Lca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhig.h(fhey, java.util.List):boolean");
    }

    public final boolean i() {
        return this.f != null;
    }

    public final void j(int i, int i2) {
        Socket socket;
        int i3;
        fhhf fhhfVar = this.a;
        Proxy proxy = fhhfVar.b;
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = fhif.a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = fhhfVar.a.b.createSocket();
            socket.getClass();
        } else {
            socket = new Socket(proxy);
        }
        this.b = socket;
        socket.setSoTimeout(i2);
        try {
            fhlc.b.g(socket, this.a.c, i);
            try {
                this.g = new fhnp(fhne.c(socket));
                this.h = fhnf.a(fhne.a(socket));
            } catch (NullPointerException e) {
                if (ffkj.e(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            InetSocketAddress inetSocketAddress = this.a.c;
            Objects.toString(inetSocketAddress);
            ConnectException connectException = new ConnectException("Failed to connect to ".concat(inetSocketAddress.toString()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // defpackage.fhjs
    public final synchronized void k(fhkt fhktVar) {
        fhktVar.getClass();
        this.k = fhktVar.d();
    }

    public final void l() {
        this.i = true;
    }

    public final void m() {
        Socket socket = this.c;
        socket.getClass();
        fhmv fhmvVar = this.g;
        fhmvVar.getClass();
        fhmu fhmuVar = this.h;
        fhmuVar.getClass();
        socket.setSoTimeout(0);
        fhjq fhjqVar = new fhjq(fhhu.a);
        fhjqVar.b = socket;
        fhjqVar.c = fhhl.f + " " + this.a.a.i.c;
        fhjqVar.d = fhmvVar;
        fhjqVar.e = fhmuVar;
        fhjqVar.f = this;
        fhkf fhkfVar = new fhkf(fhjqVar);
        this.f = fhkfVar;
        this.k = fhkf.a.d();
        fhhu fhhuVar = fhhu.a;
        fhhuVar.getClass();
        fhkfVar.u.b();
        fhkfVar.u.h(fhkfVar.q);
        if (fhkfVar.q.c() != 65535) {
            fhkfVar.u.i(0, r2 - 65535);
        }
        fhhuVar.a().f(new fhhq(fhkfVar.d, fhkfVar.v));
    }

    public final String toString() {
        fhge fhgeVar = this.d;
        String str = fhgeVar != null ? fhgeVar.b : "none";
        fhhf fhhfVar = this.a;
        fhgt fhgtVar = this.e;
        StringBuilder sb = new StringBuilder("Connection{");
        fhgk fhgkVar = fhhfVar.a.i;
        sb.append(fhgkVar.c);
        sb.append(":");
        sb.append(fhgkVar.d);
        sb.append(", proxy=");
        sb.append(fhhfVar.b);
        sb.append(" hostAddress=");
        sb.append(fhhfVar.c);
        sb.append(" cipherSuite=");
        sb.append(str);
        sb.append(" protocol=");
        sb.append(fhgtVar);
        sb.append("}");
        return sb.toString();
    }
}
