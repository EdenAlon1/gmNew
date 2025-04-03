package defpackage;

import android.os.Message;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djmw implements dixx {
    final String a;
    private final dikj b;
    private ezat c = ezat.SIP_REGISTRATION_STATE_UNKNOWN;
    private long d;

    public djmw(String str, dikj dikjVar) {
        this.b = dikjVar;
        this.a = "SR-".concat(String.valueOf(str));
    }

    private static ezap h(int i) {
        switch (i) {
            case 1:
                return ezap.REGISTRATION_EVENT_MESSAGE_CONNECTION_CREATED;
            case 2:
                return ezap.REGISTRATION_EVENT_MESSAGE_CONFIGURED;
            case 3:
                return ezap.REGISTRATION_EVENT_MESSAGE_START_REGISTRATION;
            case 4:
                return ezap.REGISTRATION_EVENT_MESSAGE_STOP_REGISTRATION;
            case 5:
                return ezap.REGISTRATION_EVENT_MESSAGE_ACTIVATE;
            case 6:
                return ezap.REGISTRATION_EVENT_MESSAGE_DEACTIVATE;
            case 7:
                return ezap.REGISTRATION_EVENT_MESSAGE_REGISTRATION_FAILED;
            case 8:
                return ezap.REGISTRATION_EVENT_MESSAGE_CONNECTION_DESTROYED;
            case 9:
                return ezap.REGISTRATION_EVENT_MESSAGE_PUBLISH_200OK_RESPONSE;
            case 10:
                return ezap.REGISTRATION_EVENT_MESSAGE_PUBLISH_FAILED_RESPONSE;
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                return ezap.REGISTRATION_EVENT_MESSAGE_UNKNOWN;
            case 15:
                return ezap.REGISTRATION_EVENT_MESSAGE_RETRY_TIMEOUT;
            case 16:
                return ezap.REGISTRATION_EVENT_MESSAGE_REGISTER_TIMEOUT;
            case 17:
                return ezap.REGISTRATION_EVENT_MESSAGE_PUBLISH_TIMEOUT;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dixx
    public final void b(dixy dixyVar) {
        char c;
        ezat ezatVar;
        if (dixyVar.a().equals("RegisteringState")) {
            this.b.d(ezar.SIP_REGISTRATION_EVENT_TYPE_REGISTERING);
        } else if (dixyVar.a().equals("RegisteredState")) {
            this.b.d(ezar.SIP_REGISTRATION_EVENT_TYPE_REGISTERED);
        } else if (dixyVar.a().equals("DeregisteringState")) {
            this.b.d(ezar.SIP_REGISTRATION_EVENT_TYPE_UNREGISTERING);
        } else if (dixyVar.a().equals("InactiveState") || dixyVar.a().equals("TerminatedState")) {
            this.b.d(ezar.SIP_REGISTRATION_EVENT_TYPE_UNREGISTERED);
        }
        String a = dixyVar.a();
        switch (a.hashCode()) {
            case -1364164455:
                if (a.equals("ConnectingState")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -956761710:
                if (a.equals("RegisteringState")) {
                    c = 2;
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
            case -397999261:
                if (a.equals("PublishedState")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -317727730:
                if (a.equals("TerminatedState")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -256263219:
                if (a.equals("InitialState")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -216642939:
                if (a.equals("ReceiveFeatureTagsState")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 49896467:
                if (a.equals("DeregisteringState")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 308196038:
                if (a.equals("InactiveState")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 844560105:
                if (a.equals("RetryState")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 951960926:
                if (a.equals("ReceiveConfigurationState")) {
                    c = 3;
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
                ezatVar = ezat.SIP_REGISTRATION_CONNECTING_STATE;
                break;
            case 2:
                ezatVar = ezat.SIP_REGISTRATION_REGISTERING_STATE;
                break;
            case 3:
                ezatVar = ezat.SIP_REGISTRATION_RECEIVE_CONFIGURATION_STATE;
                break;
            case 4:
                ezatVar = ezat.SIP_REGISTRATION_RECEIVE_FEATURE_TAGS_STATE;
                break;
            case 5:
                ezatVar = ezat.SIP_REGISTRATION_REGISTERED_STATE;
                break;
            case 6:
                ezatVar = ezat.SIP_REGISTRATION_DEREGISTERING_STATE;
                break;
            case 7:
                ezatVar = ezat.SIP_REGISTRATION_INACTIVE_STATE;
                break;
            case '\b':
                ezatVar = ezat.SIP_REGISTRATION_TERMINATED_STATE;
                break;
            case '\t':
                ezatVar = ezat.SIP_REGISTRATION_RETRY_STATE;
                break;
            case '\n':
                ezatVar = ezat.SIP_REGISTRATION_PUBLISHED_STATE;
                break;
            default:
                ezatVar = ezat.SIP_REGISTRATION_STATE_UNKNOWN;
                break;
        }
        ezat ezatVar2 = ezatVar;
        long longValue = dkvj.a().longValue();
        if (ezat.SIP_REGISTRATION_STATE_UNKNOWN.equals(this.c)) {
            this.b.f(ezatVar2, Optional.of(this.a));
        } else {
            long j = longValue - this.d;
            this.b.g(ezatVar2, this.c, j, Optional.empty(), Optional.of(this.a));
        }
        this.c = ezatVar2;
        this.d = longValue;
    }

    @Override // defpackage.dixx
    public final void e(dixy dixyVar, Message message) {
        dkty.c("[%s] processed Message %s", dixyVar.a(), message);
        if (message.what == 101) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof dilc) {
            this.b.i(this.a, h(message.what), (dilc) obj);
        } else {
            this.b.h(this.a, h(message.what));
        }
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
}
