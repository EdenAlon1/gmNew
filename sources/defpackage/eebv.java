package defpackage;

import android.net.Network;
import android.net.QosCallback;
import android.net.QosSocketInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eebv implements eebp {
    static final diyy a = diyv.b("SingleRegistrationQosHandler_enableExpandedQci");
    static final diyy b = diyv.b("SingleRegistrationQosHandler_disableQciVerification");
    public final errl c;
    public final dkvp d;
    public final Network e;
    public final eeby f;
    public final eefy g;
    private QosCallback h;

    public eebv(errl errlVar, dkvp dkvpVar, Network network, eefy eefyVar, eeby eebyVar) {
        this.c = errlVar;
        this.d = dkvpVar;
        this.e = network;
        this.g = eefyVar;
        this.f = eebyVar;
    }

    public static void c(int i) {
        if (((Boolean) b.a()).booleanValue()) {
            return;
        }
        if (!((Boolean) a.a()).booleanValue()) {
            if (i != 6) {
                throw new IOException(String.format("Wrong QCI: expected %d, got %d.", 6, Integer.valueOf(i)));
            }
        } else {
            eygi eygiVar = ((ezgu) dizg.o().a.z.a()).b;
            Integer valueOf = Integer.valueOf(i);
            if (!eygiVar.contains(valueOf)) {
                throw new IOException(String.format("Wrong QCI: expected %s, got %d.", eygiVar, valueOf));
            }
        }
    }

    public static void d(List list, Socket socket) {
        if (!((Boolean) dizg.o().a.x.a()).booleanValue() || dizg.o().L() || list == null || list.isEmpty()) {
            return;
        }
        InetAddress inetAddress = socket.getInetAddress();
        inetAddress.getClass();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, socket.getPort());
        if (!list.contains(inetSocketAddress)) {
            throw new IOException(String.format("Client socket connected to %s. QoS session set for %s.", inetSocketAddress, Arrays.toString(list.toArray())));
        }
    }

    @Override // defpackage.eebp
    public final void a() {
        QosCallback qosCallback = this.h;
        if (qosCallback != null) {
            ((dkvo) this.d).a.unregisterQosCallback(qosCallback);
        }
    }

    @Override // defpackage.eebp
    public final void b(final Socket socket) {
        dkty.k("[SR] Setting up the dedicated bearer.", new Object[0]);
        eyva eyvaVar = (eyva) eyvd.a.createBuilder();
        eyvaVar.copyOnWrite();
        eyvd eyvdVar = (eyvd) eyvaVar.instance;
        eyvdVar.e = 1;
        eyvdVar.b |= 4;
        this.f.c((eyvd) eyvaVar.build(), 2);
        ListenableFuture a2 = kfg.a(new kfd() { // from class: eebs
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                eebv eebvVar = eebv.this;
                Network network = eebvVar.e;
                Socket socket2 = socket;
                QosSocketInfo qosSocketInfo = new QosSocketInfo(network, socket2);
                eebu eebuVar = new eebu(eebvVar, kfbVar, socket2);
                dkvp dkvpVar = eebvVar.d;
                try {
                    ((dkvo) dkvpVar).a.registerQosCallback(qosSocketInfo, eebvVar.c, eebuVar);
                    return "SingleRegistrationQosHandler#waitForDedicatedBearerSetup";
                } catch (SecurityException e) {
                    throw new dkvd("CONNECTIVITY_USE_RESTRICTED_NETWORKS permission is missing.", e);
                }
            }
        });
        Integer num = (Integer) dizg.o().a.o.a();
        try {
            this.h = (QosCallback) a2.get(num.intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException(e);
        } catch (ExecutionException e2) {
            e = e2;
            throw new IOException(e);
        } catch (TimeoutException e3) {
            dkty.g("Timed out while waiting for %d seconds for the dedicated bearer setup.", num);
            eeby eebyVar = this.f;
            eyva eyvaVar2 = (eyva) eyvd.a.createBuilder();
            eyvaVar2.copyOnWrite();
            eyvd eyvdVar2 = (eyvd) eyvaVar2.instance;
            eyvdVar2.c = 5;
            eyvdVar2.b = 1 | eyvdVar2.b;
            eyvaVar2.copyOnWrite();
            eyvd eyvdVar3 = (eyvd) eyvaVar2.instance;
            eyvdVar3.e = 3;
            eyvdVar3.b |= 4;
            eebyVar.c((eyvd) eyvaVar2.build(), 4);
            throw new IOException(e3);
        }
    }
}
