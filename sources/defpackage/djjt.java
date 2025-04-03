package defpackage;

import android.content.Context;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class djjt {
    public static final diyy a = dizd.a(158761105);
    public static final String[] b = {"8.8.8.8", "8.8.4.4"};
    public static final String[] c = {"2001:4860:4860:0:0:0:0:8888", "2001:4860:4860:0:0:0:0:8844"};
    public boolean d;
    public final dihi e;
    protected final Context f;
    public Network g;
    public String h;
    public final dikj i;
    public final dktn j;
    public final int k;

    public djjt(Context context, int i, dihi dihiVar, dktn dktnVar, dikj dikjVar) {
        this.e = dihiVar;
        this.k = i;
        this.j = new dktn(dktnVar.a + "ImsNetworkInterface[" + djka.b(i) + "]");
        this.i = dikjVar;
        this.f = context;
    }

    public static boolean k(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasCapability(12) || networkCapabilities.hasCapability(8) || !networkCapabilities.hasCapability(15);
    }

    public final int a() {
        if (m()) {
            return 4;
        }
        return n() ? 6 : 0;
    }

    public abstract int b();

    public abstract int c();

    public final dkvp d() {
        return dkvo.f(this.f);
    }

    public final eejk e(djtr djtrVar) {
        String v = this.k == 1 ? djtrVar.v() : djtrVar.A();
        if ("SIPoUDP".equals(v)) {
            dkty.d(this.j, "TransportProtocol SIP_OVER_UDP", new Object[0]);
            return eejk.UDP;
        }
        if ("SIPoTLS".equals(v)) {
            dkty.d(this.j, "TransportProtocol SIP_OVER_TLS", new Object[0]);
            return eejk.TLS;
        }
        dkty.d(this.j, "TransportProtocol SIP_OVER_TCP", new Object[0]);
        return eejk.TCP;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof djjt)) {
            return TextUtils.equals(this.h, ((djjt) obj).h);
        }
        return false;
    }

    public final ezag f() {
        return l() ? ezag.NETWORK_INTERFACE_AVAILABILITY_AVAILABLE : ezag.NETWORK_INTERFACE_AVAILABILITY_UNAVAILABLE;
    }

    public final String g() {
        return djka.b(this.k);
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.b.iterator();
        while (it.hasNext()) {
            arrayList.add(((InetAddress) it.next()).getHostAddress());
        }
        return arrayList;
    }

    public final int hashCode() {
        String str = this.h;
        str.getClass();
        return str.hashCode();
    }

    public final void i(LinkProperties linkProperties) {
        ArrayList arrayList = new ArrayList();
        this.d = false;
        try {
            arrayList.addAll(linkProperties.getDnsServers());
        } catch (NoSuchMethodException unused) {
            dkty.h(this.j, "Can't retrieve DNS address.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            dkty.l(this.j, "Using Google DNS server.", new Object[0]);
            String[] strArr = new String[0];
            if (m()) {
                strArr = b;
            } else if (n()) {
                strArr = c;
            }
            for (String str : strArr) {
                try {
                    arrayList.add(InetAddress.getByName(str));
                } catch (UnknownHostException unused2) {
                    dkty.h(this.j, "Invalid nameserver %s", str);
                }
            }
        } else {
            this.d = true;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InetAddress inetAddress = (InetAddress) arrayList.get(i);
            if (inetAddress instanceof Inet4Address) {
                this.e.c(inetAddress);
            }
        }
        if (n()) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                InetAddress inetAddress2 = (InetAddress) arrayList.get(i2);
                if (inetAddress2 instanceof Inet6Address) {
                    this.e.c(inetAddress2);
                }
            }
        }
    }

    public abstract void j();

    public final boolean l() {
        dkvp d = d();
        Network network = this.g;
        if (network == null) {
            dkty.l(this.j, "Network isn't available because network object is null", new Object[0]);
            return false;
        }
        if (this.e.a == null) {
            dkty.l(this.j, "Network isn't available because ip address is null", new Object[0]);
            return false;
        }
        try {
            if (dkvw.a() && djak.y()) {
                NetworkCapabilities c2 = d.c(network);
                dkty.l(this.j, "network capabilities for network[%s]: %s", network, c2);
                return djak.r() ? c2 != null && c2.hasCapability(12) && c2.hasCapability(16) && c2.hasCapability(21) : c2 != null && c2.hasCapability(12) && c2.hasCapability(16);
            }
            NetworkInfo e = d.e(network);
            dkty.l(this.j, "network info for network[%s]: %s", network, e);
            return e != null && e.isConnected() && e.getType() == c();
        } catch (dkvd e2) {
            dkty.t(e2, this.j, "Can't get network capabilities, missing permissions.", new Object[0]);
            return false;
        }
    }

    public final boolean m() {
        return this.e.f();
    }

    public final boolean n() {
        return this.e.g();
    }

    public final String toString() {
        return "Name: " + this.h + ", Network access: " + this.e.toString();
    }
}
