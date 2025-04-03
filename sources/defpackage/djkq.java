package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djkq {
    public final Context a;
    public final dktn b;
    public final dikj c;
    public final Map d = new HashMap();
    private final Optional e;
    private final int[] f;

    public djkq(Context context, Optional optional, int[] iArr, dktn dktnVar, dikj dikjVar) {
        this.a = context;
        this.c = dikjVar;
        this.e = optional;
        this.f = iArr;
        this.b = dktnVar;
    }

    private final djjt d(int i) {
        return (djjt) this.d.get(Integer.valueOf(i));
    }

    public final djjt a() {
        djjt d;
        if (this.e.isPresent()) {
            djjy djjyVar = (djjy) this.e.get();
            djjt[] djjtVarArr = new djjt[18];
            djjtVarArr[0] = d(0);
            djjtVarArr[1] = d(1);
            djjtVarArr[17] = d(17);
            return djjyVar.a(djjtVarArr);
        }
        int[] iArr = this.f;
        int i = 0;
        while (true) {
            if (i >= 3) {
                return null;
            }
            d = d(iArr[i]);
            if (d != null) {
                if (d.g == null) {
                    dkty.r(d.j, "Active interface is not available because network is null", new Object[0]);
                } else if (d.e.a == null) {
                    dkty.r(d.j, "Active interface is not available because ip address is null", new Object[0]);
                } else {
                    dkvp d2 = d.d();
                    try {
                        if (!dkvw.a() || !djak.y()) {
                            dkvp d3 = d.d();
                            Network b = d3.b();
                            NetworkInfo e = b != null ? d3.e(b) : null;
                            dkty.l(d.j, "Check if the interface %s is available and active network info is: %s", d.g(), e);
                            if (e != null && e.isConnected() && e.getType() == d.c()) {
                                break;
                            }
                        } else {
                            Network b2 = d2.b();
                            dkty.l(d.j, "Check if the interface %s is available and active network is: %s", d.g(), b2);
                            if (b2 != null) {
                                NetworkCapabilities c = d2.c(b2);
                                if (!djak.r()) {
                                    if (c != null && c.hasTransport(d.b()) && c.hasCapability(12) && c.hasCapability(16)) {
                                        break;
                                    }
                                } else if (c != null && c.hasTransport(d.b()) && c.hasCapability(12) && c.hasCapability(16) && c.hasCapability(21)) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    } catch (dkvd e2) {
                        dkty.t(e2, d.j, "Can't get active network info, missing permissions.", new Object[0]);
                    }
                }
            }
            i++;
        }
        return d;
    }

    public final /* synthetic */ void b(djjt djjtVar) {
        try {
            djjtVar.j();
        } catch (SocketException e) {
            dkty.j(e, this.b, "Failed to initialize %s", djjtVar);
        }
    }

    public final void c() {
        dkty.d(this.b, "Refreshing ImsNetworkInterfaces.", new Object[0]);
        Collection.EL.stream(this.d.values()).forEach(new Consumer() { // from class: djkp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                djkq.this.b((djjt) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
