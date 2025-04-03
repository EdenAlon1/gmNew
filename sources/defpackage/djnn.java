package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.RouteInfo;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djnn extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int b = 0;
    private static final int[] c = {0, 1, 4};
    public final djqd a;
    private final dktn d;
    private NetworkCapabilities e;
    private djkr f;
    private final Executor g;
    private final dkvp h;
    private boolean i = false;

    public djnn(Executor executor, djqd djqdVar, dkvp dkvpVar, dktn dktnVar) {
        this.g = executor;
        this.a = djqdVar;
        this.h = dkvpVar;
        this.d = dktnVar;
    }

    private final Optional b(Network network, NetworkCapabilities networkCapabilities, LinkProperties linkProperties) {
        String interfaceName = linkProperties.getInterfaceName();
        if (interfaceName == null) {
            dkty.r(this.d, "Null interface name in LinkProperties", new Object[0]);
            return Optional.empty();
        }
        if (linkProperties.getLinkAddresses().isEmpty()) {
            dkty.r(this.d, "LinkProperties(%s) has an empty IP address.", interfaceName);
            return Optional.empty();
        }
        if (network == null) {
            throw new NullPointerException("Null network");
        }
        if (networkCapabilities == null) {
            throw new NullPointerException("Null networkCapabilities");
        }
        engw n = engw.n((List) Collection.EL.stream(linkProperties.getLinkAddresses()).map(new Function() { // from class: djnm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((LinkAddress) obj).getAddress();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList()));
        engw n2 = engw.n(linkProperties.getDnsServers());
        if (n != null && n2 != null) {
            djkn djknVar = new djkn(n, n2, network, networkCapabilities, interfaceName);
            dkty.l(this.d, "buildNetworkInterface for Network:%s, ip routes:[%s], other debug properties: NetworkInterface: %s, LinkProperties: %s", network, !((Boolean) dizg.o().a.ah.a()).booleanValue() ? engw.r("link property logging not enabled") : (List) Collection.EL.stream(linkProperties.getRoutes()).map(new Function() { // from class: djnl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    RouteInfo routeInfo = (RouteInfo) obj;
                    int i = djnn.b;
                    return String.format("ip_prefix:[%s], is_default:[%s]", routeInfo.getDestination(), Boolean.valueOf(routeInfo.isDefaultRoute()));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList()), dktx.GENERIC.c(djknVar), dktx.GENERIC.c(linkProperties));
            return Optional.of(djknVar);
        }
        StringBuilder sb = new StringBuilder();
        if (n == null) {
            sb.append(" ipAddresses");
        }
        if (n2 == null) {
            sb.append(" dnsServers");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void a(final djkr djkrVar) {
        djkr djkrVar2 = this.f;
        this.f = djkrVar;
        if (djkrVar2 != null) {
            NetworkCapabilities b2 = djkrVar2.b();
            NetworkCapabilities b3 = djkrVar.b();
            int[] iArr = c;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= 3) {
                    break;
                }
                int i2 = iArr[i];
                if (b2.hasTransport(i2) && !b3.hasTransport(i2)) {
                    dkty.d(this.d, "Default transport changed to %d.", Integer.valueOf(i2));
                    dkty.l(this.d, "Transport type has changed. Send disconnection to the previous transport.", new Object[0]);
                    Executor executor = this.g;
                    djqd djqdVar = this.a;
                    djqdVar.getClass();
                    executor.execute(new djnj(djqdVar));
                    break;
                }
                i++;
            }
        }
        this.g.execute(new Runnable() { // from class: djnk
            @Override // java.lang.Runnable
            public final void run() {
                djnn.this.a.a.b.s(20, djkrVar);
            }
        });
        this.i = false;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        dkty.r(this.d, "Network:%s", network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        LinkProperties linkProperties;
        dkty.d(this.d, "Network:%s NetworkCapabilities:%s", network, networkCapabilities);
        if (!networkCapabilities.hasCapability(16)) {
            dkty.r(this.d, "Network interface is not validated.", new Object[0]);
            return;
        }
        this.e = networkCapabilities;
        try {
            linkProperties = this.h.a(network);
        } catch (dkvd e) {
            dkty.j(e, this.d, "Failed to get LinkProperties.", new Object[0]);
            linkProperties = null;
        }
        if (linkProperties != null) {
            Optional b2 = b(network, networkCapabilities, linkProperties);
            if (b2.isPresent()) {
                a((djkr) b2.get());
                return;
            }
        }
        dkty.d(this.d, "Waiting for LinkProperties.", new Object[0]);
        this.i = true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        NetworkCapabilities networkCapabilities = this.e;
        if (networkCapabilities == null) {
            dkty.r(this.d, "onCapabilitiesChanged() is not called. Ignore onLinkPropertiesChanged().", new Object[0]);
            return;
        }
        dkty.d(this.d, "Network:%s LinkProperties:%s", network, dktx.GENERIC.c(linkProperties));
        if (this.i) {
            b(network, networkCapabilities, linkProperties).ifPresent(new Consumer() { // from class: djnh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    djnn.this.a((djkr) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        dkty.r(this.d, "Network is lost:%s", network);
        djqd djqdVar = this.a;
        djqdVar.getClass();
        this.g.execute(new djnj(djqdVar));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        dkty.r(this.d, "NetworkRequest failure.", new Object[0]);
        final djqd djqdVar = this.a;
        djqdVar.getClass();
        this.g.execute(new Runnable() { // from class: djni
            @Override // java.lang.Runnable
            public final void run() {
                djqd.this.a.b.q(22);
            }
        });
    }
}
