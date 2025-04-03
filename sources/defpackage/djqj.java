package defpackage;

import android.os.Message;
import android.os.SystemClock;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djqj implements djjv, dixx {
    final String a;
    String b;
    private final dikj c;
    private final int d;
    private long f;
    private ezat e = ezat.SIP_REGISTRATION_STATE_UNKNOWN;
    private final AtomicReference g = new AtomicReference();
    private final boolean h = ((Boolean) diyv.b("use_elapsed_time_in_registration_event_logger").a()).booleanValue();

    public djqj(String str, int i, dikj dikjVar) {
        this.c = dikjVar;
        this.a = str;
        this.d = i;
    }

    private static ezap o(int i) {
        switch (i) {
            case 1:
                return ezap.REGISTRATION_EVENT_MESSAGE_SEND_SIP_MESSAGE;
            case 2:
                return ezap.REGISTRATION_EVENT_MESSAGE_RECEIVE_SIP_RESPONSE;
            case 3:
                return ezap.REGISTRATION_EVENT_MESSAGE_SIP_REQUEST_TIMEOUT;
            case 4:
                return ezap.REGISTRATION_EVENT_MESSAGE_CONNECTIVITY_EVENT;
            case 5:
                return ezap.REGISTRATION_EVENT_MESSAGE_TRANSPORT_ERROR;
            case 6:
            case 11:
            default:
                return ezap.REGISTRATION_EVENT_MESSAGE_UNKNOWN;
            case 7:
                return ezap.REGISTRATION_EVENT_MESSAGE_START_REGISTRATION;
            case 8:
                return ezap.REGISTRATION_EVENT_MESSAGE_STOP_REGISTRATION;
            case 9:
                return ezap.REGISTRATION_EVENT_MESSAGE_REREGISTRATION_REQUIRED;
            case 10:
                return ezap.REGISTRATION_EVENT_MESSAGE_DISCOVER_SIP_SERVER;
            case 12:
                return ezap.REGISTRATION_EVENT_MESSAGE_CONNECT_TO_SERVER;
            case 13:
                return ezap.REGISTRATION_EVENT_MESSAGE_CONNECTED_TO_SERVER;
            case 14:
                return ezap.REGISTRATION_EVENT_MESSAGE_REFRESH_TIMEOUT;
            case 15:
                return ezap.REGISTRATION_EVENT_MESSAGE_RETRY_TIMEOUT;
            case 16:
                return ezap.REGISTRATION_EVENT_MESSAGE_SIM_DETECTED;
            case 17:
                return ezap.REGISTRATION_EVENT_MESSAGE_SIM_REMOVED;
            case 18:
                return ezap.REGISTRATION_EVENT_MESSAGE_CONNECTION_TIMEOUT;
            case 19:
                return ezap.REGISTRATION_EVENT_MESSAGE_CONNECT_TO_SERVER_FAILURE;
        }
    }

    private final void p(int i) {
        eyrg eyrgVar = (eyrg) eyrh.a.createBuilder();
        eyrgVar.copyOnWrite();
        eyrh eyrhVar = (eyrh) eyrgVar.instance;
        eyrhVar.c = i - 1;
        eyrhVar.b |= 16384;
        ((djjt) this.g.get()).c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dixx
    public final void b(dixy dixyVar) {
        char c;
        ezat ezatVar;
        long longValue;
        if (dixyVar.a().equals("ReregisteringState")) {
            this.c.e(ezar.SIP_REGISTRATION_EVENT_TYPE_REREGISTERING, this.b);
        } else if (dixyVar.a().equals("DeregisteringState")) {
            this.c.e(ezar.SIP_REGISTRATION_EVENT_TYPE_UNREGISTERING, this.b);
        } else if (dixyVar.a().equals("DeregisteredState")) {
            this.c.e(ezar.SIP_REGISTRATION_EVENT_TYPE_UNREGISTERED, this.b);
        }
        String a = dixyVar.a();
        switch (a.hashCode()) {
            case -1912539026:
                if (a.equals("DeregisteredState")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1744214834:
                if (a.equals("ReadyState")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1625135049:
                if (a.equals("SubscribedState")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1364164455:
                if (a.equals("ConnectingState")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1060655388:
                if (a.equals("StoppedState")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1024214587:
                if (a.equals("ReregisteringState")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -956761710:
                if (a.equals("RegisteringState")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -420991217:
                if (a.equals("RegisteredState")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -146072452:
                if (a.equals("ReregisteredState")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 49896467:
                if (a.equals("DeregisteringState")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 369485162:
                if (a.equals("SubscribingState")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 414054229:
                if (a.equals("DisabledState")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 844560105:
                if (a.equals("RetryState")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1174681192:
                if (a.equals("SimRemovedState")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1346635631:
                if (a.equals("ReconfigurationRequiredState")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1802360855:
                if (a.equals("WaitForNetworkState")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                ezatVar = ezat.SIP_REGISTRATION_STOPPED_STATE;
                break;
            case 1:
                ezatVar = ezat.SIP_REGISTRATION_READY_STATE;
                break;
            case 2:
                ezatVar = ezat.SIP_REGISTRATION_WAIT_FOR_NETWORK_STATE;
                break;
            case 3:
                ezatVar = ezat.SIP_REGISTRATION_CONNECTING_STATE;
                break;
            case 4:
                ezatVar = ezat.SIP_REGISTRATION_REGISTERING_STATE;
                break;
            case 5:
                ezatVar = ezat.SIP_REGISTRATION_REGISTERED_STATE;
                break;
            case 6:
                ezatVar = ezat.SIP_REGISTRATION_SUBSCRIBING_STATE;
                break;
            case 7:
                ezatVar = ezat.SIP_REGISTRATION_SUBSCRIBED_STATE;
                break;
            case '\b':
                ezatVar = ezat.SIP_REGISTRATION_REREGISTERING_STATE;
                break;
            case '\t':
                ezatVar = ezat.SIP_REGISTRATION_REREGISTERED_STATE;
                break;
            case '\n':
                ezatVar = ezat.SIP_REGISTRATION_DEREGISTERING_STATE;
                break;
            case 11:
                ezatVar = ezat.SIP_REGISTRATION_DEREGISTERED_STATE;
                break;
            case '\f':
                ezatVar = ezat.SIP_REGISTRATION_RECONFIGURATION_REQUIRED_STATE;
                break;
            case '\r':
                ezatVar = ezat.SIP_REGISTRATION_RETRY_STATE;
                break;
            case 14:
                ezatVar = ezat.SIP_REGISTRATION_DISABLED_STATE;
                break;
            case 15:
                ezatVar = ezat.SIP_REGISTRATION_SIM_REMOVED_STATE;
                break;
            default:
                ezatVar = ezat.SIP_REGISTRATION_STATE_UNKNOWN;
                break;
        }
        ezat ezatVar2 = ezatVar;
        if (this.h) {
            Long l = dkvm.a.a;
            longValue = SystemClock.elapsedRealtime();
            Long.valueOf(longValue).getClass();
        } else {
            longValue = dkvj.a().longValue();
        }
        long j = longValue;
        if (ezat.SIP_REGISTRATION_STATE_UNKNOWN.equals(this.e)) {
            this.c.f(ezatVar2, Optional.empty());
        } else {
            this.c.g(ezatVar2, this.e, j - this.f, Optional.of(Integer.valueOf(this.d)), Optional.empty());
        }
        this.e = ezatVar2;
        this.f = j;
    }

    @Override // defpackage.dixx
    public final void e(dixy dixyVar, Message message) {
        dkty.c("[%s] processed Message %s", dixyVar.a(), message);
        int i = message.what;
        if (i == 101 || i == 4) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof dilc) {
            this.c.i(this.a, o(message.what), (dilc) obj);
            return;
        }
        if (message.what == 2) {
            if (obj instanceof eenl) {
                dikj dikjVar = this.c;
                String str = this.a;
                ezap o = o(message.what);
                int y = ((eenl) obj).y();
                ezam ezamVar = (ezam) ezan.a.createBuilder();
                ezamVar.copyOnWrite();
                ezan ezanVar = (ezan) ezamVar.instance;
                ezanVar.c = o.C;
                ezanVar.b |= 1;
                ezamVar.copyOnWrite();
                ezan ezanVar2 = (ezan) ezamVar.instance;
                ezanVar2.b = 4 | ezanVar2.b;
                ezanVar2.e = y;
                ezan ezanVar3 = (ezan) ezamVar.build();
                ezal ezalVar = (ezal) ezau.a.createBuilder();
                ezalVar.copyOnWrite();
                ezau ezauVar = (ezau) ezalVar.instance;
                str.getClass();
                ezauVar.b |= 64;
                ezauVar.g = str;
                ezalVar.copyOnWrite();
                ezau ezauVar2 = (ezau) ezalVar.instance;
                ezanVar3.getClass();
                ezauVar2.f = ezanVar3;
                ezauVar2.b |= 32;
                ezau ezauVar3 = (ezau) ezalVar.build();
                dkty.o("Logging SIP registration Processed message, message = %s sipResponseCode = %d", o, Integer.valueOf(y));
                dikjVar.n(ezauVar3);
                return;
            }
            return;
        }
        if (message.what != 7) {
            this.c.h(this.a, o(message.what));
            return;
        }
        dikj dikjVar2 = this.c;
        String str2 = this.a;
        ezap o2 = o(message.what);
        int i2 = message.arg1;
        ezam ezamVar2 = (ezam) ezan.a.createBuilder();
        ezamVar2.copyOnWrite();
        ezan ezanVar4 = (ezan) ezamVar2.instance;
        ezanVar4.c = o2.C;
        ezanVar4.b |= 1;
        ezamVar2.copyOnWrite();
        ezan ezanVar5 = (ezan) ezamVar2.instance;
        ezanVar5.b |= 8;
        ezanVar5.f = i2;
        ezan ezanVar6 = (ezan) ezamVar2.build();
        ezal ezalVar2 = (ezal) ezau.a.createBuilder();
        ezalVar2.copyOnWrite();
        ezau ezauVar4 = (ezau) ezalVar2.instance;
        str2.getClass();
        ezauVar4.b |= 64;
        ezauVar4.g = str2;
        ezalVar2.copyOnWrite();
        ezau ezauVar5 = (ezau) ezalVar2.instance;
        ezanVar6.getClass();
        ezauVar5.f = ezanVar6;
        ezauVar5.b |= 32;
        ezau ezauVar6 = (ezau) ezalVar2.build();
        dkty.o("Logging SIP registration Processed message, message = %s configVersion = %d", o2, Integer.valueOf(i2));
        dikjVar2.n(ezauVar6);
    }

    @Override // defpackage.djjv
    public final void h(djjt djjtVar) {
        this.g.set(djjtVar);
    }

    @Override // defpackage.djjv
    public final void j(String str) {
        this.b = str;
        this.c.e(ezar.SIP_REGISTRATION_EVENT_TYPE_REGISTERED, str);
        p(2);
    }

    @Override // defpackage.djjv
    public final void k(String str) {
        this.b = str;
        this.c.e(ezar.SIP_REGISTRATION_EVENT_TYPE_REGISTERING, str);
    }

    @Override // defpackage.djjv
    public final void l() {
        p(3);
    }

    @Override // defpackage.djjv
    public final void m() {
        p(3);
    }

    @Override // defpackage.dixx
    public final void a() {
    }

    @Override // defpackage.dixx
    public final void c() {
    }

    @Override // defpackage.dixx
    public final void d() {
    }

    @Override // defpackage.dixx
    public final void f() {
    }

    @Override // defpackage.dixx
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.djjv
    public final void i() {
    }

    @Override // defpackage.djjv
    public final void n() {
    }
}
