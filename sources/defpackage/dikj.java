package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikj extends dikp {
    public static final diyy b = diyv.b("add_ip_version_to_socket_event_rev1");
    private final Context e;

    public dikj(Context context, djix djixVar, dkpp dkppVar, eplu epluVar, errl errlVar, dijt dijtVar) {
        super(djixVar, dkppVar, epluVar, errlVar, dijtVar);
        this.e = context;
    }

    public static int r(String str) {
        if (((Boolean) b.a()).booleanValue()) {
            try {
                return InetAddress.getByName(str) instanceof Inet6Address ? 3 : 2;
            } catch (UnknownHostException unused) {
            }
        }
        return 1;
    }

    public static final void t(eyzr eyzrVar, eeer eeerVar) {
        String str = ((eedn) eeerVar).c;
        if (str != null) {
            eyzrVar.copyOnWrite();
            ezab ezabVar = (ezab) eyzrVar.instance;
            ezab ezabVar2 = ezab.a;
            ezabVar.b |= 64;
            ezabVar.i = str;
        }
    }

    public final void d(ezar ezarVar) {
        e(ezarVar, null);
    }

    public final void e(ezar ezarVar, String str) {
        dkty.o("Logging SIP registration event, type = %s", ezarVar);
        ezal ezalVar = (ezal) ezau.a.createBuilder();
        ezalVar.copyOnWrite();
        ezau ezauVar = (ezau) ezalVar.instance;
        ezauVar.c = ezarVar.g;
        ezauVar.b |= 1;
        if (!TextUtils.isEmpty(str)) {
            ezalVar.copyOnWrite();
            ezau ezauVar2 = (ezau) ezalVar.instance;
            str.getClass();
            ezauVar2.b |= 2;
            ezauVar2.d = str;
        }
        n((ezau) ezalVar.build());
    }

    public final void f(ezat ezatVar, Optional optional) {
        ezal ezalVar = (ezal) ezau.a.createBuilder();
        ezalVar.copyOnWrite();
        ezau ezauVar = (ezau) ezalVar.instance;
        ezauVar.e = ezatVar.w;
        ezauVar.b |= 4;
        ezalVar.getClass();
        optional.ifPresent(new diki(ezalVar));
        dkty.o("Logging SIP registration state change event, state = %s", ezatVar);
        n((ezau) ezalVar.build());
    }

    public final void g(ezat ezatVar, ezat ezatVar2, long j, Optional optional, Optional optional2) {
        final ezal ezalVar = (ezal) ezau.a.createBuilder();
        ezalVar.copyOnWrite();
        ezau ezauVar = (ezau) ezalVar.instance;
        ezauVar.e = ezatVar.w;
        ezauVar.b |= 4;
        ezalVar.copyOnWrite();
        ezau ezauVar2 = (ezau) ezalVar.instance;
        ezauVar2.h = ezatVar2.w;
        ezauVar2.b |= 128;
        ezalVar.copyOnWrite();
        ezau ezauVar3 = (ezau) ezalVar.instance;
        ezauVar3.b |= 256;
        ezauVar3.i = (int) j;
        ezalVar.getClass();
        optional.ifPresent(new Consumer() { // from class: dikh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int intValue = ((Integer) obj).intValue();
                ezal ezalVar2 = ezal.this;
                ezalVar2.copyOnWrite();
                ezau ezauVar4 = (ezau) ezalVar2.instance;
                ezau ezauVar5 = ezau.a;
                ezauVar4.b |= 512;
                ezauVar4.j = intValue;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional2.ifPresent(new diki(ezalVar));
        dkty.o("Logging SIP registration state change event, from %s to %s after %d ms. subId=%d", ezatVar2, ezatVar, Long.valueOf(j), optional.orElse(-1));
        n((ezau) ezalVar.build());
    }

    public final void h(String str, ezap ezapVar) {
        ezam ezamVar = (ezam) ezan.a.createBuilder();
        ezamVar.copyOnWrite();
        ezan ezanVar = (ezan) ezamVar.instance;
        ezanVar.c = ezapVar.C;
        ezanVar.b |= 1;
        ezan ezanVar2 = (ezan) ezamVar.build();
        ezal ezalVar = (ezal) ezau.a.createBuilder();
        ezalVar.copyOnWrite();
        ezau ezauVar = (ezau) ezalVar.instance;
        str.getClass();
        ezauVar.b |= 64;
        ezauVar.g = str;
        ezalVar.copyOnWrite();
        ezau ezauVar2 = (ezau) ezalVar.instance;
        ezanVar2.getClass();
        ezauVar2.f = ezanVar2;
        ezauVar2.b |= 32;
        ezau ezauVar3 = (ezau) ezalVar.build();
        dkty.o("Logging SIP registration Processed message, message = %s", ezapVar);
        n(ezauVar3);
    }

    public final void i(String str, ezap ezapVar, dilc dilcVar) {
        ezam ezamVar = (ezam) ezan.a.createBuilder();
        ezamVar.copyOnWrite();
        ezan ezanVar = (ezan) ezamVar.instance;
        ezanVar.c = ezapVar.C;
        ezanVar.b |= 1;
        int a = eyto.a(dilcVar.ordinal());
        if (a != 0) {
            ezamVar.copyOnWrite();
            ezan ezanVar2 = (ezan) ezamVar.instance;
            ezanVar2.d = a - 1;
            ezanVar2.b |= 2;
        }
        ezal ezalVar = (ezal) ezau.a.createBuilder();
        ezalVar.copyOnWrite();
        ezau ezauVar = (ezau) ezalVar.instance;
        str.getClass();
        ezauVar.b |= 64;
        ezauVar.g = str;
        ezalVar.copyOnWrite();
        ezau ezauVar2 = (ezau) ezalVar.instance;
        ezan ezanVar3 = (ezan) ezamVar.build();
        ezanVar3.getClass();
        ezauVar2.f = ezanVar3;
        ezauVar2.b |= 32;
        ezau ezauVar3 = (ezau) ezalVar.build();
        dkty.o("Logging SIP registration Processed message, message = %s, terminationReason = %s", ezapVar, dilcVar);
        n(ezauVar3);
    }

    public final void j(ezbl ezblVar) {
        String str;
        if (o()) {
            String str2 = ezblVar.n;
            int a = ezbj.a(ezblVar.m);
            if (a != 0) {
                switch (a) {
                    case 1:
                        break;
                    case 2:
                        str = "SOCKET_STATE_INIT";
                        break;
                    case 3:
                        str = "SOCKET_STATE_ACCEPTING";
                        break;
                    case 4:
                        str = "SOCKET_STATE_ACCEPTED";
                        break;
                    case 5:
                        str = "SOCKET_STATE_CONNECTING";
                        break;
                    case 6:
                        str = "SOCKET_STATE_CONNECTED";
                        break;
                    case 7:
                        str = "SOCKET_STATE_AUTHENTICATING";
                        break;
                    case 8:
                        str = "SOCKET_STATE_AUTHENTICATED";
                        break;
                    case 9:
                        str = "SOCKET_STATE_ACTIVE";
                        break;
                    case 10:
                        str = "SOCKET_STATE_CLOSING";
                        break;
                    case 11:
                        str = "SOCKET_STATE_CLOSED";
                        break;
                    default:
                        str = "SOCKET_STATE_FAILED";
                        break;
                }
                dkty.o("Logging socket state monitoring event for socket [%s]: %s", str2, str);
                Context context = this.e;
                ezac ezacVar = (ezac) ezad.a.createBuilder();
                ezacVar.copyOnWrite();
                ezad ezadVar = (ezad) ezacVar.instance;
                ezblVar.getClass();
                ezadVar.c = ezblVar;
                ezadVar.b = 3;
                B(context, (ezad) ezacVar.build());
            }
            str = "SOCKET_STATE_UNKNOWN";
            dkty.o("Logging socket state monitoring event for socket [%s]: %s", str2, str);
            Context context2 = this.e;
            ezac ezacVar2 = (ezac) ezad.a.createBuilder();
            ezacVar2.copyOnWrite();
            ezad ezadVar2 = (ezad) ezacVar2.instance;
            ezblVar.getClass();
            ezadVar2.c = ezblVar;
            ezadVar2.b = 3;
            B(context2, (ezad) ezacVar2.build());
        }
    }

    public final void k(ezab ezabVar) {
        ezac ezacVar = (ezac) ezad.a.createBuilder();
        ezacVar.copyOnWrite();
        ezad ezadVar = (ezad) ezacVar.instance;
        ezabVar.getClass();
        ezadVar.c = ezabVar;
        ezadVar.b = 2;
        B(this.e, (ezad) ezacVar.build());
    }

    @Deprecated
    public final void l(ezbl ezblVar) {
        if (o()) {
            return;
        }
        ezac ezacVar = (ezac) ezad.a.createBuilder();
        ezacVar.copyOnWrite();
        ezad ezadVar = (ezad) ezacVar.instance;
        ezblVar.getClass();
        ezadVar.c = ezblVar;
        ezadVar.b = 3;
        B(this.e, (ezad) ezacVar.build());
    }

    public final void m(ezak ezakVar) {
        ezac ezacVar = (ezac) ezad.a.createBuilder();
        ezacVar.copyOnWrite();
        ezad ezadVar = (ezad) ezacVar.instance;
        ezakVar.getClass();
        ezadVar.c = ezakVar;
        ezadVar.b = 1;
        B(this.e, (ezad) ezacVar.build());
    }

    public final void n(ezau ezauVar) {
        if (((Boolean) dizg.o().a.O.a()).booleanValue()) {
            ezac ezacVar = (ezac) ezad.a.createBuilder();
            ezacVar.copyOnWrite();
            ezad ezadVar = (ezad) ezacVar.instance;
            ezauVar.getClass();
            ezadVar.c = ezauVar;
            ezadVar.b = 4;
            B(this.e, (ezad) ezacVar.build());
        }
    }

    public final boolean o() {
        if (djak.u()) {
            return eplu.CARRIER_SERVICES_EVENT_SOURCE_RCS.equals(this.a);
        }
        return false;
    }

    public final ezae p(int i, ezaj ezajVar, ezag ezagVar, int i2) {
        ezae ezaeVar = (ezae) ezak.a.createBuilder();
        ezaeVar.copyOnWrite();
        ezak ezakVar = (ezak) ezaeVar.instance;
        ezakVar.c = i - 1;
        ezakVar.b |= 1;
        ezaeVar.copyOnWrite();
        ezak ezakVar2 = (ezak) ezaeVar.instance;
        ezakVar2.d = ezajVar.e;
        ezakVar2.b |= 2;
        if (dijq.a() == 2) {
            ezaeVar.copyOnWrite();
            ezak ezakVar3 = (ezak) ezaeVar.instance;
            ezakVar3.e = ezagVar.d;
            ezakVar3.b |= 4;
            ezaeVar.copyOnWrite();
            ezak ezakVar4 = (ezak) ezaeVar.instance;
            ezakVar4.b |= 8;
            ezakVar4.f = i2;
        }
        return ezaeVar;
    }

    @Deprecated
    public final ezba q(ezbh ezbhVar, int i, String str, int i2, int i3) {
        ezba ezbaVar = (ezba) ezbl.a.createBuilder();
        ezbaVar.copyOnWrite();
        ezbl ezblVar = (ezbl) ezbaVar.instance;
        ezblVar.f = ezbhVar.e;
        ezblVar.b |= 8;
        if (((Boolean) b.a()).booleanValue()) {
            ezbaVar.copyOnWrite();
            ezbl ezblVar2 = (ezbl) ezbaVar.instance;
            ezblVar2.k = i - 1;
            ezblVar2.b |= 256;
            ezbaVar.copyOnWrite();
            ezbl ezblVar3 = (ezbl) ezbaVar.instance;
            ezblVar3.j = i3 - 1;
            ezblVar3.b |= 128;
        }
        if (dijq.a() == 2) {
            ezbaVar.copyOnWrite();
            ezbl ezblVar4 = (ezbl) ezbaVar.instance;
            ezblVar4.b |= 32;
            ezblVar4.h = str;
            ezbaVar.copyOnWrite();
            ezbl ezblVar5 = (ezbl) ezbaVar.instance;
            ezblVar5.b |= 64;
            ezblVar5.i = i2;
        }
        return ezbaVar;
    }

    public final void s(String str, int i) {
        ezav ezavVar = (ezav) ezaz.a.createBuilder();
        ezay ezayVar = ezay.SIP_TRANSPORT_EVENT_TYPE_ERROR;
        ezavVar.copyOnWrite();
        ezaz ezazVar = (ezaz) ezavVar.instance;
        ezazVar.c = ezayVar.c;
        ezazVar.b |= 1;
        ezavVar.copyOnWrite();
        ezaz ezazVar2 = (ezaz) ezavVar.instance;
        ezazVar2.e = i - 1;
        ezazVar2.b |= 4;
        ezavVar.copyOnWrite();
        ezaz ezazVar3 = (ezaz) ezavVar.instance;
        str.getClass();
        ezazVar3.b |= 2;
        ezazVar3.d = str;
        ezaz ezazVar4 = (ezaz) ezavVar.build();
        if (((Boolean) djak.a().b.s.a()).booleanValue()) {
            ezay b2 = ezay.b(ezazVar4.c);
            if (b2 == null) {
                b2 = ezay.SIP_TRANSPORT_EVENT_TYPE_UNKNOWN;
            }
            dkty.o("Logging SipTransportEvent event type, %s", b2);
            ezac ezacVar = (ezac) ezad.a.createBuilder();
            ezacVar.copyOnWrite();
            ezad ezadVar = (ezad) ezacVar.instance;
            ezazVar4.getClass();
            ezadVar.c = ezazVar4;
            ezadVar.b = 5;
            B(this.e, (ezad) ezacVar.build());
        }
    }
}
