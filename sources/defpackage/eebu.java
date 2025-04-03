package defpackage;

import android.net.QosCallback;
import android.net.QosCallbackException;
import android.net.QosSession;
import android.net.QosSessionAttributes;
import android.telephony.data.EpsBearerQosSessionAttributes;
import android.telephony.data.NrQosSessionAttributes;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eebu extends QosCallback {
    final /* synthetic */ kfb a;
    final /* synthetic */ Socket b;
    final /* synthetic */ eebv c;

    public eebu(eebv eebvVar, kfb kfbVar, Socket socket) {
        this.a = kfbVar;
        this.b = socket;
        this.c = eebvVar;
    }

    public final void onError(QosCallbackException qosCallbackException) {
        this.a.c(qosCallbackException);
        this.c.f.a(qosCallbackException);
    }

    public final void onQosSessionAvailable(QosSession qosSession, QosSessionAttributes qosSessionAttributes) {
        dkty.k("[SR] QoS session available.", new Object[0]);
        final eyve eyveVar = (eyve) eyvg.a.createBuilder();
        try {
            if (qosSession.getSessionType() == 1) {
                EpsBearerQosSessionAttributes epsBearerQosSessionAttributes = (EpsBearerQosSessionAttributes) qosSessionAttributes;
                int qosIdentifier = epsBearerQosSessionAttributes.getQosIdentifier();
                eyveVar.copyOnWrite();
                eyvg eyvgVar = (eyvg) eyveVar.instance;
                eyvgVar.b |= 4;
                eyvgVar.e = qosIdentifier;
                long guaranteedUplinkBitRateKbps = epsBearerQosSessionAttributes.getGuaranteedUplinkBitRateKbps();
                eyveVar.copyOnWrite();
                eyvg eyvgVar2 = (eyvg) eyveVar.instance;
                eyvgVar2.b |= 8;
                eyvgVar2.f = guaranteedUplinkBitRateKbps;
                long guaranteedDownlinkBitRateKbps = epsBearerQosSessionAttributes.getGuaranteedDownlinkBitRateKbps();
                eyveVar.copyOnWrite();
                eyvg eyvgVar3 = (eyvg) eyveVar.instance;
                eyvgVar3.b |= 16;
                eyvgVar3.g = guaranteedDownlinkBitRateKbps;
                Collection.EL.stream(epsBearerQosSessionAttributes.getRemoteAddresses()).forEach(new Consumer() { // from class: eebw
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        eyve.this.a(eeby.b((InetSocketAddress) obj));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else if (qosSession.getSessionType() == 2) {
                NrQosSessionAttributes nrQosSessionAttributes = (NrQosSessionAttributes) qosSessionAttributes;
                int qosIdentifier2 = nrQosSessionAttributes.getQosIdentifier();
                eyveVar.copyOnWrite();
                eyvg eyvgVar4 = (eyvg) eyveVar.instance;
                eyvgVar4.b |= 4;
                eyvgVar4.e = qosIdentifier2;
                long guaranteedUplinkBitRateKbps2 = nrQosSessionAttributes.getGuaranteedUplinkBitRateKbps();
                eyveVar.copyOnWrite();
                eyvg eyvgVar5 = (eyvg) eyveVar.instance;
                eyvgVar5.b |= 8;
                eyvgVar5.f = guaranteedUplinkBitRateKbps2;
                long guaranteedDownlinkBitRateKbps2 = nrQosSessionAttributes.getGuaranteedDownlinkBitRateKbps();
                eyveVar.copyOnWrite();
                eyvg eyvgVar6 = (eyvg) eyveVar.instance;
                eyvgVar6.b |= 16;
                eyvgVar6.g = guaranteedDownlinkBitRateKbps2;
                Collection.EL.stream(nrQosSessionAttributes.getRemoteAddresses()).forEach(new Consumer() { // from class: eebx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        eyve.this.a(eeby.b((InetSocketAddress) obj));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        } catch (ClassCastException unused) {
            dkty.d(dkty.b, "Could not cast QosSessionAttributes", new Object[0]);
        }
        eebv eebvVar = this.c;
        eyva eyvaVar = (eyva) eyvd.a.createBuilder();
        int sessionId = qosSession.getSessionId();
        eyveVar.copyOnWrite();
        eyvg eyvgVar7 = (eyvg) eyveVar.instance;
        eyvgVar7.b |= 1;
        eyvgVar7.c = sessionId;
        int d = eeby.d(qosSession.getSessionType());
        eyveVar.copyOnWrite();
        eyvg eyvgVar8 = (eyvg) eyveVar.instance;
        eyvgVar8.d = d - 1;
        eyvgVar8.b |= 2;
        eyvaVar.copyOnWrite();
        eyvd eyvdVar = (eyvd) eyvaVar.instance;
        eyvg eyvgVar9 = (eyvg) eyveVar.build();
        eyvgVar9.getClass();
        eyvdVar.d = eyvgVar9;
        eyvdVar.b |= 2;
        eyvaVar.copyOnWrite();
        eyvd eyvdVar2 = (eyvd) eyvaVar.instance;
        eyvdVar2.e = 2;
        eyvdVar2.b |= 4;
        eebvVar.f.c((eyvd) eyvaVar.build(), 3);
        try {
            if (qosSession.getSessionType() == 1) {
                EpsBearerQosSessionAttributes epsBearerQosSessionAttributes2 = (EpsBearerQosSessionAttributes) qosSessionAttributes;
                int qosIdentifier3 = epsBearerQosSessionAttributes2.getQosIdentifier();
                List remoteAddresses = epsBearerQosSessionAttributes2.getRemoteAddresses();
                dkty.c("[SR] EpsBearerQosSessionAttributes: [ qosIdentifier = %d, remoteAddresses = %s]", Integer.valueOf(qosIdentifier3), Arrays.toString(enkr.g(remoteAddresses, new emwl() { // from class: eebt
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return ((InetSocketAddress) obj).toString();
                    }
                }).toArray()));
                eebv.c(qosIdentifier3);
                eebv.d(remoteAddresses, this.b);
            } else {
                if (qosSession.getSessionType() != 2) {
                    throw new IOException("Unknown QoS session type.");
                }
                NrQosSessionAttributes nrQosSessionAttributes2 = (NrQosSessionAttributes) qosSessionAttributes;
                int qosIdentifier4 = nrQosSessionAttributes2.getQosIdentifier();
                List remoteAddresses2 = nrQosSessionAttributes2.getRemoteAddresses();
                dkty.c("[SR] NrQosSessionAttributes: [ qosIdentifier = %d, remoteAddresses = %s]", Integer.valueOf(qosIdentifier4), Arrays.toString(enkr.g(remoteAddresses2, new emwl() { // from class: eebt
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return ((InetSocketAddress) obj).toString();
                    }
                }).toArray()));
                eebv.c(qosIdentifier4);
                eebv.d(remoteAddresses2, this.b);
            }
        } catch (IOException | ClassCastException e) {
            this.a.c(e);
            this.c.f.a(e);
        }
        this.a.b(this);
    }

    public final void onQosSessionLost(QosSession qosSession) {
        dkty.q("[SR] QoS session lost.", new Object[0]);
        this.c.g.a.aS();
        eyva eyvaVar = (eyva) eyvd.a.createBuilder();
        eyve eyveVar = (eyve) eyvg.a.createBuilder();
        int sessionId = qosSession.getSessionId();
        eyveVar.copyOnWrite();
        eyvg eyvgVar = (eyvg) eyveVar.instance;
        eyvgVar.b |= 1;
        eyvgVar.c = sessionId;
        int d = eeby.d(qosSession.getSessionType());
        eyveVar.copyOnWrite();
        eyvg eyvgVar2 = (eyvg) eyveVar.instance;
        eyvgVar2.d = d - 1;
        eyvgVar2.b |= 2;
        eyvaVar.copyOnWrite();
        eyvd eyvdVar = (eyvd) eyvaVar.instance;
        eyvg eyvgVar3 = (eyvg) eyveVar.build();
        eyvgVar3.getClass();
        eyvdVar.d = eyvgVar3;
        eyvdVar.b |= 2;
        eyvaVar.copyOnWrite();
        eyvd eyvdVar2 = (eyvd) eyvaVar.instance;
        eyvdVar2.e = 3;
        eyvdVar2.b |= 4;
        this.c.f.c((eyvd) eyvaVar.build(), 3);
    }
}
