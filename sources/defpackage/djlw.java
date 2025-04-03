package defpackage;

import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.FeatureTagState;
import android.telephony.ims.SipDelegateConfiguration;
import android.telephony.ims.SipDelegateConnection;
import android.telephony.ims.stub.DelegateConnectionStateCallback;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djlw implements DelegateConnectionStateCallback {
    public static final /* synthetic */ int a = 0;
    private final djmm b;
    private final djmt c;
    private final String d;
    private final SettableFuture e;

    public djlw(djmm djmmVar, djmt djmtVar, String str, SettableFuture settableFuture) {
        this.b = djmmVar;
        this.c = djmtVar;
        this.d = str;
        this.e = settableFuture;
    }

    public final void onConfigurationChanged(SipDelegateConfiguration sipDelegateConfiguration) {
        int i;
        dkty.l(this.b.i, "ConnectionStateCallback[%s]#onConfigurationChanged, version: %d", this.d, Long.valueOf(sipDelegateConfiguration.getVersion()));
        if (dkty.v()) {
            enhd enhdVar = new enhd();
            enhdVar.k("p_access_network_info_header", dktx.GENERIC.c(sipDelegateConfiguration.getSipPaniHeader()));
            enhdVar.k("security_verify_header", dktx.GENERIC.c(Optional.ofNullable(sipDelegateConfiguration.getIpSecConfiguration()).map(new Function() { // from class: djlu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((SipDelegateConfiguration.IpSecConfiguration) obj).getSipSecurityVerifyHeader();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse("")));
            enhdVar.k("home_domain", Optional.ofNullable(sipDelegateConfiguration.getHomeDomain()).orElse(""));
            enhdVar.k("ue_public_user_id", dktx.USER_ID.c(sipDelegateConfiguration.getPublicUserIdentifier()));
            enhdVar.k("server_default_ipaddress", dktx.IP_ADDRESS.c(sipDelegateConfiguration.getSipServerAddress().getAddress().getHostAddress()));
            enhdVar.k("server_default_port", Integer.valueOf(sipDelegateConfiguration.getSipServerAddress().getPort()));
            enhdVar.k("ue_default_ipaddress", dktx.IP_ADDRESS.c(sipDelegateConfiguration.getLocalAddress().getAddress().getHostAddress()));
            enhdVar.k("ue_default_port", Integer.valueOf(sipDelegateConfiguration.getLocalAddress().getPort()));
            enhdVar.k("p_associated_uri_header", dktx.URI_SIP.c(sipDelegateConfiguration.getSipAssociatedUriHeader()));
            enhdVar.k("service_route_header", dktx.IP_ADDRESS.c(sipDelegateConfiguration.getSipServiceRouteHeader()));
            enhdVar.k("sip_instance", emxe.b(this.b.G));
            enhdVar.k("uri_user_part", dktx.USER_ID.c(emxe.b(sipDelegateConfiguration.getSipContactUserParameter())));
            dkty.d(this.b.i, "SipDelegateConfiguration changed: %s", Collection.EL.stream(enhdVar.c().entrySet()).map(new Function() { // from class: djlv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    int i2 = djlw.a;
                    return String.format("%s: %s", entry.getKey(), String.valueOf(entry.getValue()));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining("\n")));
        }
        if (emxe.c(sipDelegateConfiguration.getImei())) {
            dkty.h(this.b.i, "Invalid SipDelegateConfiguration with an empty IMEI", new Object[0]);
            i = 4;
        } else if (emxe.c(sipDelegateConfiguration.getSipContactUserParameter())) {
            dkty.h(this.b.i, "Invalid SipDelegateConfiguration with an empty Contact Username", new Object[0]);
            i = 5;
        } else if (emxe.c(sipDelegateConfiguration.getLocalAddress().getAddress().getHostAddress())) {
            dkty.h(this.b.i, "Invalid SipDelegateConfiguration with an empty HostAddress", new Object[0]);
            i = 6;
        } else {
            i = 2;
        }
        if (((Boolean) djmm.d.a()).booleanValue()) {
            djmt djmtVar = this.c;
            djmm djmmVar = this.b;
            String str = this.d;
            String A = djmmVar.A();
            long version = sipDelegateConfiguration.getVersion();
            eywg eywgVar = (eywg) eywh.a.createBuilder();
            eywgVar.copyOnWrite();
            eywh eywhVar = (eywh) eywgVar.instance;
            A.getClass();
            eywhVar.b |= 2;
            eywhVar.d = A;
            eywgVar.copyOnWrite();
            eywh eywhVar2 = (eywh) eywgVar.instance;
            str.getClass();
            eywhVar2.b |= 1;
            eywhVar2.c = str;
            eyvw eyvwVar = (eyvw) eyvy.a.createBuilder();
            eyvwVar.copyOnWrite();
            eyvy eyvyVar = (eyvy) eyvwVar.instance;
            eyvyVar.b |= 1;
            eyvyVar.c = version;
            eyvwVar.copyOnWrite();
            eyvy eyvyVar2 = (eyvy) eyvwVar.instance;
            eyvyVar2.d = i - 1;
            eyvyVar2.b |= 2;
            eywgVar.copyOnWrite();
            eywh eywhVar3 = (eywh) eywgVar.instance;
            eyvy eyvyVar3 = (eyvy) eyvwVar.build();
            eyvyVar3.getClass();
            eywhVar3.f = eyvyVar3;
            eywhVar3.b |= 8;
            djmtVar.b((eywh) eywgVar.build());
        }
        if (i == 2) {
            this.b.s(2, sipDelegateConfiguration);
        } else {
            dkty.h(this.b.i, "Invalid SipDelegateConfiguration. state=%d", Integer.valueOf(i - 1));
        }
    }

    public final void onCreated(SipDelegateConnection sipDelegateConnection) {
        dkty.d(this.b.i, "ConnectionStateCallback[%s]#onCreated", this.d);
        if (((Boolean) djmm.d.a()).booleanValue()) {
            djmt djmtVar = this.c;
            djmm djmmVar = this.b;
            String str = this.d;
            String A = djmmVar.A();
            eywg eywgVar = (eywg) eywh.a.createBuilder();
            eywgVar.copyOnWrite();
            eywh eywhVar = (eywh) eywgVar.instance;
            A.getClass();
            eywhVar.b |= 2;
            eywhVar.d = A;
            eywgVar.copyOnWrite();
            eywh eywhVar2 = (eywh) eywgVar.instance;
            str.getClass();
            eywhVar2.b |= 1;
            eywhVar2.c = str;
            eyvz eyvzVar = (eyvz) eywb.a.createBuilder();
            eyvzVar.copyOnWrite();
            eywb eywbVar = (eywb) eyvzVar.instance;
            eywbVar.d = 2;
            eywbVar.b |= 2;
            eywgVar.copyOnWrite();
            eywh eywhVar3 = (eywh) eywgVar.instance;
            eywb eywbVar2 = (eywb) eyvzVar.build();
            eywbVar2.getClass();
            eywhVar3.i = eywbVar2;
            eywhVar3.b |= 64;
            djmtVar.b((eywh) eywgVar.build());
        }
        this.b.s(1, sipDelegateConnection);
    }

    public final void onDestroyed(int i) {
        String str = this.d;
        Integer valueOf = Integer.valueOf(i);
        int i2 = djll.a;
        dkty.l(this.b.i, "ConnectionStateCallback[%s]#onDestroyed: code: %d, name: %s}", str, valueOf, i != 1 ? i != 2 ? i != 3 ? i != 4 ? "SIP_DELEGATE_DESTROY_REASON_UNKNOWN" : "SIP_DELEGATE_DESTROY_REASON_SUBSCRIPTION_TORN_DOWN" : "SIP_DELEGATE_DESTROY_REASON_USER_DISABLED_RCS" : "SIP_DELEGATE_DESTROY_REASON_REQUESTED_BY_APP" : "SIP_DELEGATE_DESTROY_REASON_SERVICE_DEAD");
        if (((Boolean) djmm.d.a()).booleanValue()) {
            djmt djmtVar = this.c;
            djmm djmmVar = this.b;
            String str2 = this.d;
            String A = djmmVar.A();
            eywg eywgVar = (eywg) eywh.a.createBuilder();
            eywgVar.copyOnWrite();
            eywh eywhVar = (eywh) eywgVar.instance;
            A.getClass();
            eywhVar.b |= 2;
            eywhVar.d = A;
            eywgVar.copyOnWrite();
            eywh eywhVar2 = (eywh) eywgVar.instance;
            str2.getClass();
            eywhVar2.b |= 1;
            eywhVar2.c = str2;
            eywc eywcVar = (eywc) eywd.a.createBuilder();
            eywcVar.copyOnWrite();
            eywd eywdVar = (eywd) eywcVar.instance;
            eywdVar.b = 1 | eywdVar.b;
            eywdVar.c = i;
            eywgVar.copyOnWrite();
            eywh eywhVar3 = (eywh) eywgVar.instance;
            eywd eywdVar2 = (eywd) eywcVar.build();
            eywdVar2.getClass();
            eywhVar3.g = eywdVar2;
            eywhVar3.b |= 16;
            djmtVar.b((eywh) eywgVar.build());
        }
        this.e.set(this.b.D);
        if (i != 2) {
            this.b.r(8, i);
        }
    }

    public final void onFeatureTagStatusChanged(DelegateRegistrationState delegateRegistrationState, Set set) {
        enip o = ctid.f ? enip.o(delegateRegistrationState.getRegisteringFeatureTags()) : enpd.a;
        enip o2 = enip.o(delegateRegistrationState.getRegisteredFeatureTags());
        enip enipVar = (enip) Collection.EL.stream(set).map(new Function() { // from class: djlb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((FeatureTagState) obj).getFeatureTag();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b);
        enip enipVar2 = (enip) Collection.EL.stream(delegateRegistrationState.getDeregisteredFeatureTags()).map(new Function() { // from class: djlb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((FeatureTagState) obj).getFeatureTag();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b);
        enip enipVar3 = (enip) Collection.EL.stream(delegateRegistrationState.getDeregisteringFeatureTags()).map(new Function() { // from class: djlb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((FeatureTagState) obj).getFeatureTag();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b);
        dkty.l(this.b.i, "ConnectionStateCallback[%s]#onFeatureTagStatusChanged: registering=[%s], registered=[%s], deregistering=[%s], deregistered=[%s], denied=[%s]", this.d, o, o2, enipVar3, enipVar2, enipVar);
        if (((Boolean) djmm.d.a()).booleanValue()) {
            djmt djmtVar = this.c;
            djmm djmmVar = this.b;
            String str = this.d;
            String A = djmmVar.A();
            enip enipVar4 = ((Boolean) djmm.h.a()).booleanValue() ? o : enpd.a;
            final eywe eyweVar = (eywe) eywf.a.createBuilder();
            Collection.EL.stream(o2).forEach(new Consumer() { // from class: djmo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    eyud a2 = djll.a((String) obj);
                    eywe eyweVar2 = eywe.this;
                    eyweVar2.copyOnWrite();
                    eywf eywfVar = (eywf) eyweVar2.instance;
                    eywf eywfVar2 = eywf.a;
                    a2.getClass();
                    eygi eygiVar = eywfVar.b;
                    if (!eygiVar.c()) {
                        eywfVar.b = eyfy.mutableCopy(eygiVar);
                    }
                    eywfVar.b.h(a2.z);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Collection.EL.stream(enipVar2).forEach(new Consumer() { // from class: djmp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    eyud a2 = djll.a((String) obj);
                    eywe eyweVar2 = eywe.this;
                    eyweVar2.copyOnWrite();
                    eywf eywfVar = (eywf) eyweVar2.instance;
                    eywf eywfVar2 = eywf.a;
                    a2.getClass();
                    eygi eygiVar = eywfVar.c;
                    if (!eygiVar.c()) {
                        eywfVar.c = eyfy.mutableCopy(eygiVar);
                    }
                    eywfVar.c.h(a2.z);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Collection.EL.stream(enipVar).forEach(new Consumer() { // from class: djmq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    eyud a2 = djll.a((String) obj);
                    eywe eyweVar2 = eywe.this;
                    eyweVar2.copyOnWrite();
                    eywf eywfVar = (eywf) eyweVar2.instance;
                    eywf eywfVar2 = eywf.a;
                    a2.getClass();
                    eygi eygiVar = eywfVar.d;
                    if (!eygiVar.c()) {
                        eywfVar.d = eyfy.mutableCopy(eygiVar);
                    }
                    eywfVar.d.h(a2.z);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Collection.EL.stream(enipVar4).forEach(new Consumer() { // from class: djmr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    eyud a2 = djll.a((String) obj);
                    eywe eyweVar2 = eywe.this;
                    eyweVar2.copyOnWrite();
                    eywf eywfVar = (eywf) eyweVar2.instance;
                    eywf eywfVar2 = eywf.a;
                    a2.getClass();
                    eygi eygiVar = eywfVar.e;
                    if (!eygiVar.c()) {
                        eywfVar.e = eyfy.mutableCopy(eygiVar);
                    }
                    eywfVar.e.h(a2.z);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Collection.EL.stream(enipVar3).forEach(new Consumer() { // from class: djms
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    eyud a2 = djll.a((String) obj);
                    eywe eyweVar2 = eywe.this;
                    eyweVar2.copyOnWrite();
                    eywf eywfVar = (eywf) eyweVar2.instance;
                    eywf eywfVar2 = eywf.a;
                    a2.getClass();
                    eygi eygiVar = eywfVar.f;
                    if (!eygiVar.c()) {
                        eywfVar.f = eyfy.mutableCopy(eygiVar);
                    }
                    eywfVar.f.h(a2.z);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            eywg eywgVar = (eywg) eywh.a.createBuilder();
            eywgVar.copyOnWrite();
            eywh eywhVar = (eywh) eywgVar.instance;
            A.getClass();
            eywhVar.b |= 2;
            eywhVar.d = A;
            eywgVar.copyOnWrite();
            eywh eywhVar2 = (eywh) eywgVar.instance;
            str.getClass();
            eywhVar2.b |= 1;
            eywhVar2.c = str;
            eywgVar.copyOnWrite();
            eywh eywhVar3 = (eywh) eywgVar.instance;
            eywf eywfVar = (eywf) eyweVar.build();
            eywfVar.getClass();
            eywhVar3.e = eywfVar;
            eywhVar3.b |= 4;
            djmtVar.b((eywh) eywgVar.build());
        }
        boolean containsAll = o2.containsAll(this.b.y());
        boolean containsAll2 = o2.containsAll(this.b.x());
        boolean isEmpty = enipVar.isEmpty();
        boolean isEmpty2 = o.isEmpty();
        boolean isEmpty3 = enipVar3.isEmpty();
        if (containsAll) {
            if (!containsAll2) {
                dkty.r(this.b.i, "transitioning to REGISTERED state with pending unregistered feature tags", new Object[0]);
            }
            this.b.s(5, delegateRegistrationState);
        } else {
            if (((Boolean) djmm.h.a()).booleanValue() && !isEmpty2) {
                dkty.l(this.b.i, "#onFeatureTagStatusChange still awaiting required feature tag registrations: [%s]", o);
                return;
            }
            if (!isEmpty) {
                dkty.r(this.b.i, "#onFeatureTagStatusChanged missing required feature tags, registration failed", new Object[0]);
                this.b.q(7);
            } else if (!isEmpty3) {
                dkty.l(this.b.i, "#onFeatureTagStatusChanged deregistering feature tags are ignored, waiting until feature tags become deregistered for further processing", new Object[0]);
            } else {
                dkty.r(this.b.i, "#onFeatureTagStatusChanged missing required feature tags, registration deactivated", new Object[0]);
                this.b.q(6);
            }
        }
    }
}
