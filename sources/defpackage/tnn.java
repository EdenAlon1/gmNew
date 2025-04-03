package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnn implements crtz {
    public static final cskc a = cskc.g("BugleCms", "CloudStoreSettingsClientImpl");
    static final eyfh b;
    static final eyfh c;
    static final eyfh d;
    static final esze e;
    public final crty f;
    public final ffbr g;
    public final ffbr h;
    public final axmm i;
    public final arep j;
    public final errl k;
    private final axkm l;
    private final errl m;

    static {
        eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
        eyfgVar.a("cms_box_state");
        b = (eyfh) eyfgVar.build();
        eyfg eyfgVar2 = (eyfg) eyfh.a.createBuilder();
        eyfgVar2.a("feature_types");
        c = (eyfh) eyfgVar2.build();
        eyfg eyfgVar3 = (eyfg) eyfh.a.createBuilder();
        eyfgVar3.a("owner_addresses");
        d = (eyfh) eyfgVar3.build();
        eszd eszdVar = (eszd) esze.a.createBuilder();
        eszdVar.copyOnWrite();
        ((esze) eszdVar.instance).d = true;
        e = (esze) eszdVar.build();
    }

    public tnn(crty crtyVar, axkm axkmVar, ffbr ffbrVar, ffbr ffbrVar2, axmm axmmVar, arep arepVar, errl errlVar, errl errlVar2) {
        this.f = crtyVar;
        this.l = axkmVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = axmmVar;
        this.j = arepVar;
        this.m = errlVar;
        this.k = errlVar2;
    }

    public static esjy m() {
        esjw esjwVar = (esjw) esjy.a.createBuilder();
        esjx esjxVar = esjx.ENABLED;
        esjwVar.copyOnWrite();
        ((esjy) esjwVar.instance).b = esjxVar.a();
        return (esjy) esjwVar.build();
    }

    public static etaq o(String str, eyhs eyhsVar) {
        etap etapVar = (etap) etaq.a.createBuilder();
        etapVar.copyOnWrite();
        ((etaq) etapVar.instance).f = str;
        etapVar.copyOnWrite();
        ((etaq) etapVar.instance).e = "message/encrypted";
        eydp eydpVar = (eydp) eydq.a.createBuilder();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
        esii esiiVar = (esii) esij.a.createBuilder();
        esiiVar.copyOnWrite();
        ((esij) esiiVar.instance).c = -1;
        eyee byteString = eyhsVar.toByteString();
        esiiVar.copyOnWrite();
        esij esijVar = (esij) esiiVar.instance;
        byteString.getClass();
        esijVar.b = byteString;
        eyee byteString2 = ((esij) esiiVar.build()).toByteString();
        eydpVar.copyOnWrite();
        ((eydq) eydpVar.instance).c = byteString2;
        etapVar.copyOnWrite();
        etaq etaqVar = (etaq) etapVar.instance;
        eydq eydqVar = (eydq) eydpVar.build();
        eydqVar.getClass();
        etaqVar.g = eydqVar;
        etaqVar.b |= 1;
        return (etaq) etapVar.build();
    }

    public static void p(fedn fednVar, String str, String str2) {
        csjb e2 = a.e();
        e2.I("Failed to set status on the server");
        e2.A("contentId", str2);
        e2.A("Method", str);
        e2.A("Code", fednVar.a.getCode());
        e2.A("Message", fednVar.a.getDescription());
        e2.r();
    }

    private final elfl q(final eszw eszwVar) {
        return this.l.k().i(new eroh() { // from class: tmv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                axez axezVar = (axez) obj;
                eswn eswnVar = (eswn) eswo.a.createBuilder();
                axes b2 = axes.b(axezVar.y);
                if (b2 == null) {
                    b2 = axes.ENCRYPTION_STATUS_UNSPECIFIED;
                }
                eszw eszwVar2 = eszwVar;
                tnn tnnVar = tnn.this;
                esxf a2 = tel.a(b2);
                eswnVar.copyOnWrite();
                ((eswo) eswnVar.instance).e = a2.a();
                esye a3 = tnnVar.i.a(axezVar);
                eswnVar.copyOnWrite();
                eswo eswoVar = (eswo) eswnVar.instance;
                eswoVar.c = a3.a();
                eswoVar.b |= 1;
                eswnVar.copyOnWrite();
                eswo eswoVar2 = (eswo) eswnVar.instance;
                eswoVar2.d = eszwVar2.a();
                eswoVar2.b |= 2;
                if (tnnVar.j.a()) {
                    eszt esztVar = (eszt) eszu.a.createBuilder();
                    esztVar.copyOnWrite();
                    ((eszu) esztVar.instance).b = 1;
                    eswnVar.copyOnWrite();
                    eswo eswoVar3 = (eswo) eswnVar.instance;
                    eszu eszuVar = (eszu) esztVar.build();
                    eszuVar.getClass();
                    eswoVar3.f = eszuVar;
                    eswoVar3.b |= 4;
                }
                eswo eswoVar4 = (eswo) eswnVar.build();
                crty crtyVar = tnnVar.f;
                esvu esvuVar = (esvu) esvv.b.createBuilder();
                esvuVar.copyOnWrite();
                esvv esvvVar = (esvv) esvuVar.instance;
                eswoVar4.getClass();
                esvvVar.j = eswoVar4;
                esvvVar.c |= 16;
                return crtyVar.S((esvv) esvuVar.build(), tnn.b, tnn.e);
            }
        }, this.m);
    }

    public final elfl a(String str, final String str2, eyhs eyhsVar) {
        eszy eszyVar = (eszy) eszz.a.createBuilder();
        eszyVar.copyOnWrite();
        ((eszz) eszyVar.instance).e = etad.a(4);
        eszyVar.copyOnWrite();
        ((eszz) eszyVar.instance).k = str;
        eszyVar.a(str);
        etan etanVar = (etan) etao.a.createBuilder();
        etanVar.a(o(str2, eyhsVar));
        eszyVar.copyOnWrite();
        eszz eszzVar = (eszz) eszyVar.instance;
        etao etaoVar = (etao) etanVar.build();
        etaoVar.getClass();
        eszzVar.i = etaoVar;
        eszzVar.b |= 4;
        return this.f.f((eszz) eszyVar.build(), false).h(new emwl() { // from class: tng
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb c2 = tnn.a.c();
                c2.I("Created CMS status object.");
                c2.A("contentId", str2);
                c2.r();
                return null;
            }
        }, erpp.a).e(fedn.class, new emwl() { // from class: tnh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fedn fednVar = (fedn) obj;
                tnn.p(fednVar, "CreateObject", str2);
                throw fednVar;
            }
        }, erpp.a);
    }

    @Override // defpackage.crtz
    public final elfl b() {
        return this.f.k(b).i(new eroh() { // from class: tmp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                esvv esvvVar = (esvv) obj;
                eswo eswoVar = esvvVar.j;
                if (eswoVar == null) {
                    eswoVar = eswo.a;
                }
                if ((eswoVar.b & 1) == 0) {
                    final tnn tnnVar = tnn.this;
                    return tnnVar.f.r("initial_sync_status").h(new emwl() { // from class: tmm
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            eszz eszzVar = (eszz) obj2;
                            Collection arrayList = new ArrayList();
                            int i = eszzVar.b & 4;
                            tnn tnnVar2 = tnn.this;
                            if (i != 0) {
                                etao etaoVar = eszzVar.i;
                                if (etaoVar == null) {
                                    etaoVar = etao.a;
                                }
                                arrayList = etaoVar.b;
                            }
                            Optional findFirst = Collection.EL.stream(arrayList).filter(new Predicate() { // from class: tni
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo439negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj3) {
                                    cskc cskcVar = tnn.a;
                                    return ((etaq) obj3).f.equals("initial_sync_status@message.cms.google");
                                }
                            }).findFirst();
                            if (findFirst.isPresent()) {
                                try {
                                    eydq eydqVar = ((etaq) findFirst.get()).g;
                                    if (eydqVar == null) {
                                        eydqVar = eydq.a;
                                    }
                                    esij esijVar = (esij) eyfy.parseFrom(esij.a, eydqVar.c, eyfc.a());
                                    if (esijVar.c != -1) {
                                        csjb e2 = tnn.a.e();
                                        e2.I("Could not parse initial_sync_status object");
                                        e2.A("ObjectId", eszzVar.c);
                                        e2.A("Method", "parseInitialSyncState");
                                        e2.A("Cause", "EncryptedData doesn't have unencrypted key index.");
                                        e2.r();
                                        return esye.INITIAL_SYNC_STATE_UNSPECIFIED;
                                    }
                                    esim esimVar = (esim) eyfy.parseFrom(esim.a, esijVar.b, eyfc.a());
                                    tnx tnxVar = (tnx) tnnVar2.g.b();
                                    esil b2 = esil.b(esimVar.b);
                                    if (b2 == null) {
                                        b2 = esil.UNRECOGNIZED;
                                    }
                                    return (esye) tnxVar.fP(b2);
                                } catch (eygu e3) {
                                    csjb e4 = tnn.a.e();
                                    e4.I("Could not parse initial_sync_status object");
                                    e4.A("ObjectId", eszzVar.c);
                                    e4.A("Method", "parseInitialSyncState");
                                    e4.A("Message", e3.getMessage());
                                    e4.A("Cause", e3.getCause());
                                    e4.r();
                                }
                            }
                            return esye.INITIAL_SYNC_STATE_UNSPECIFIED;
                        }
                    }, tnnVar.k);
                }
                eswo eswoVar2 = esvvVar.j;
                if (eswoVar2 == null) {
                    eswoVar2 = eswo.a;
                }
                esye b2 = esye.b(eswoVar2.c);
                if (b2 == null) {
                    b2 = esye.UNRECOGNIZED;
                }
                return elfo.e(b2);
            }
        }, this.k).f(fedn.class, new eroh() { // from class: tmq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fedn fednVar = (fedn) obj;
                Status status = fednVar.a;
                cskc cskcVar = tnn.a;
                if (status.getCode().equals(Status.Code.NOT_FOUND)) {
                    return elfo.e(esye.INITIAL_SYNC_STATE_UNSPECIFIED);
                }
                tnn.a.s("Failed to get the user initial sync status from server", fednVar);
                return elfo.d(fednVar);
            }
        }, this.m);
    }

    @Override // defpackage.crtz
    public final elfl c() {
        return this.f.k(b).i(new eroh() { // from class: tna
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                esvv esvvVar = (esvv) obj;
                eswo eswoVar = esvvVar.j;
                if (eswoVar == null) {
                    eswoVar = eswo.a;
                }
                if ((eswoVar.b & 2) == 0) {
                    final tnn tnnVar = tnn.this;
                    return tnnVar.f.s("multidevice_status").h(new emwl() { // from class: tnl
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            esjx esjxVar;
                            eszz eszzVar = (eszz) obj2;
                            toa toaVar = (toa) tnn.this.h.b();
                            java.util.Collection arrayList = new ArrayList();
                            if ((eszzVar.b & 4) != 0) {
                                etao etaoVar = eszzVar.i;
                                if (etaoVar == null) {
                                    etaoVar = etao.a;
                                }
                                arrayList = etaoVar.b;
                            }
                            Optional findFirst = Collection.EL.stream(arrayList).filter(new Predicate() { // from class: tnj
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo439negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj3) {
                                    cskc cskcVar = tnn.a;
                                    return ((etaq) obj3).f.equals("multidevice_status@message.cms.google");
                                }
                            }).findFirst();
                            if (findFirst.isPresent()) {
                                try {
                                    eydq eydqVar = ((etaq) findFirst.get()).g;
                                    if (eydqVar == null) {
                                        eydqVar = eydq.a;
                                    }
                                    esij esijVar = (esij) eyfy.parseFrom(esij.a, eydqVar.c, eyfc.a());
                                    if (esijVar.c == -1) {
                                        esjxVar = esjx.b(((esjy) eyfy.parseFrom(esjy.a, esijVar.b, eyfc.a())).b);
                                        if (esjxVar == null) {
                                            esjxVar = esjx.UNRECOGNIZED;
                                        }
                                    } else {
                                        csjb e2 = tnn.a.e();
                                        e2.I("Could not parse multi_device_status object");
                                        e2.A("ObjectId", eszzVar.c);
                                        e2.A("Method", "parseMultiDeviceStatus");
                                        e2.A("Cause", "EncryptedData doesn't have unencrypted key index.");
                                        e2.r();
                                        esjxVar = esjx.DISABLED;
                                    }
                                } catch (eygu e3) {
                                    csjb e4 = tnn.a.e();
                                    e4.I("Could not parse multi_device_status object");
                                    e4.A("ObjectId", eszzVar.c);
                                    e4.A("Method", "parseMultiDeviceStatus");
                                    e4.A("Message", e3.getMessage());
                                    e4.A("Cause", e3.getCause());
                                    e4.r();
                                    esjxVar = esjx.DISABLED;
                                }
                            } else {
                                esjxVar = esjx.DISABLED;
                            }
                            return (eszw) toaVar.fP(esjxVar);
                        }
                    }, tnnVar.k);
                }
                eswo eswoVar2 = esvvVar.j;
                if (eswoVar2 == null) {
                    eswoVar2 = eswo.a;
                }
                eszw b2 = eszw.b(eswoVar2.d);
                if (b2 == null) {
                    b2 = eszw.UNRECOGNIZED;
                }
                return elfo.e(b2);
            }
        }, this.k).f(fedn.class, new eroh() { // from class: tnb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fedn fednVar = (fedn) obj;
                Status status = fednVar.a;
                cskc cskcVar = tnn.a;
                if (status.getCode().equals(Status.Code.NOT_FOUND)) {
                    return elfo.e(eszw.DISABLED);
                }
                tnn.a.s("Failed to get the user multi-device status from server", fednVar);
                return elfo.d(fednVar);
            }
        }, this.m);
    }

    public final elfl d() {
        return this.l.k().h(new emwl() { // from class: tnf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                esil esilVar;
                axez axezVar = (axez) obj;
                esik esikVar = (esik) esim.a.createBuilder();
                axezVar.getClass();
                axmm axmmVar = tnn.this.i;
                if (axmmVar.b.a() && axmmVar.c.a()) {
                    esilVar = esil.NOT_SET;
                } else {
                    axmi b2 = axmi.b(axezVar.f);
                    if (b2 == null) {
                        b2 = axmi.INITIAL_SYNC_STATUS_NOT_SET;
                    }
                    switch (b2) {
                        case INITIAL_SYNC_STATUS_NOT_SET:
                        case STARTED:
                            esilVar = esil.NOT_SET;
                            break;
                        case RESTORE:
                        case RESTORE_KEYS:
                            esilVar = esil.RESTORE;
                            break;
                        case BACKUP:
                        case INITIAL_BACKUP_NEEDS_RETRY:
                        case RESTORE_MESSAGES_COMPLETE:
                            esilVar = esil.BACKUP;
                            break;
                        case FAILED:
                            esilVar = esil.FAILED;
                            break;
                        case COMPLETE:
                            esilVar = esil.COMPLETE;
                            break;
                        default:
                            throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(b2))));
                    }
                    esilVar.getClass();
                }
                esikVar.copyOnWrite();
                ((esim) esikVar.instance).b = esilVar.a();
                return (esim) esikVar.build();
            }
        }, this.k);
    }

    @Override // defpackage.crtz
    public final elfl e() {
        esik esikVar = (esik) esim.a.createBuilder();
        esil esilVar = esil.NOT_SET;
        esikVar.copyOnWrite();
        ((esim) esikVar.instance).b = esilVar.a();
        final esim esimVar = (esim) esikVar.build();
        axkm axkmVar = this.l;
        final esye esyeVar = esye.INITIAL_SYNC_STATE_UNSPECIFIED;
        return axkmVar.k().i(new eroh() { // from class: tmn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                tnn tnnVar = tnn.this;
                eswo n = tnnVar.n((axez) obj, esyeVar);
                esvu esvuVar = (esvu) esvv.b.createBuilder();
                esvuVar.copyOnWrite();
                esvv esvvVar = (esvv) esvuVar.instance;
                n.getClass();
                esvvVar.j = n;
                esvvVar.c |= 16;
                return tnnVar.f.S((esvv) esvuVar.build(), tnn.b, tnn.e);
            }
        }, this.m).i(new eroh() { // from class: tmr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return tnn.this.l("initial_sync_status", "initial_sync_status@message.cms.google", esimVar);
            }
        }, this.k).f(fedn.class, new eroh() { // from class: tms
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fedn fednVar = (fedn) obj;
                Status status = fednVar.a;
                cskc cskcVar = tnn.a;
                if (!status.getCode().equals(Status.Code.NOT_FOUND)) {
                    return elfo.d(fednVar);
                }
                tnn.a.m("Feature already disabled");
                return elfo.e(null);
            }
        }, this.k);
    }

    @Override // defpackage.crtz
    public final elfl f(final List list) {
        return this.f.k(d).i(new eroh() { // from class: tmt
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                esvv esvvVar = (esvv) obj;
                esvu esvuVar = (esvu) esvv.b.createBuilder();
                esvuVar.copyOnWrite();
                esvv esvvVar2 = (esvv) esvuVar.instance;
                eygi eygiVar = esvvVar2.i;
                if (!eygiVar.c()) {
                    esvvVar2.i = eyfy.mutableCopy(eygiVar);
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    esvvVar2.i.h(((esxi) it.next()).a());
                }
                tnn tnnVar = tnn.this;
                eygr eygrVar = esvvVar.e;
                esvuVar.copyOnWrite();
                esvv esvvVar3 = (esvv) esvuVar.instance;
                esvvVar3.b();
                eydl.addAll(eygrVar, esvvVar3.e);
                return tnnVar.f.S((esvv) esvuVar.build(), tnn.c, tnn.e);
            }
        }, this.k).h(new emwl() { // from class: tmu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new eygk(((esvv) obj).i, esvv.a);
            }
        }, this.k);
    }

    @Override // defpackage.crtz
    public final elfl g() {
        return d().i(new eroh() { // from class: tmg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                tnn tnnVar = tnn.this;
                final esim esimVar = (esim) obj;
                return tnnVar.j().h(new emwl() { // from class: tmh
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cskc cskcVar = tnn.a;
                        return esim.this;
                    }
                }, tnnVar.k);
            }
        }, this.k).i(new eroh() { // from class: tmo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return tnn.this.l("initial_sync_status", "initial_sync_status@message.cms.google", (esim) obj);
            }
        }, this.m).f(fedn.class, new eroh() { // from class: tmz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fedn fednVar = (fedn) obj;
                if (!fednVar.a.getCode().equals(Status.Code.NOT_FOUND)) {
                    return elfo.d(fednVar);
                }
                final tnn tnnVar = tnn.this;
                return tnnVar.d().i(new eroh() { // from class: tnm
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return tnn.this.a("initial_sync_status", "initial_sync_status@message.cms.google", (esim) obj2);
                    }
                }, tnnVar.k);
            }
        }, this.m);
    }

    @Override // defpackage.crtz
    public final elfl h() {
        return q(eszw.MULTI_DEVICE_STATE_UNSPECIFIED).i(new eroh() { // from class: tmi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return tnn.this.f.r("multidevice_status");
            }
        }, this.k).i(new eroh() { // from class: tmj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return tnn.this.f.g(((eszz) obj).c, false);
            }
        }, this.k).h(new emwl() { // from class: tmk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = tnn.a;
                return null;
            }
        }, this.k).e(fedn.class, new emwl() { // from class: tml
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fedn fednVar = (fedn) obj;
                Status status = fednVar.a;
                cskc cskcVar = tnn.a;
                if (!status.getCode().equals(Status.Code.NOT_FOUND)) {
                    throw fednVar;
                }
                tnn.a.m("Feature already disabled");
                return null;
            }
        }, this.k);
    }

    @Override // defpackage.crtz
    public final elfl i() {
        return q(eszw.ENABLED).i(new eroh() { // from class: tnd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return tnn.this.a("multidevice_status", "multidevice_status@message.cms.google", tnn.m());
            }
        }, this.k).f(fedn.class, new eroh() { // from class: tne
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fedn fednVar = (fedn) obj;
                return fednVar.a.getCode().equals(Status.Code.ALREADY_EXISTS) ? tnn.this.l("multidevice_status", "multidevice_status@message.cms.google", tnn.m()) : elfo.d(fednVar);
            }
        }, this.m);
    }

    @Override // defpackage.crtz
    public final elfl j() {
        return this.l.k().i(new eroh() { // from class: tnc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                tnn tnnVar = tnn.this;
                axez axezVar = (axez) obj;
                eswo n = tnnVar.n(axezVar, tnnVar.i.a(axezVar));
                esvu esvuVar = (esvu) esvv.b.createBuilder();
                esvuVar.copyOnWrite();
                esvv esvvVar = (esvv) esvuVar.instance;
                n.getClass();
                esvvVar.j = n;
                esvvVar.c |= 16;
                return tnnVar.f.S((esvv) esvuVar.build(), tnn.b, tnn.e);
            }
        }, this.m);
    }

    @Override // defpackage.crtz
    public final elfl k(final esjy esjyVar, final esim esimVar) {
        return this.f.k(b).i(new eroh() { // from class: tnk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                esvv esvvVar = (esvv) obj;
                eswo eswoVar = esvvVar.j;
                if (eswoVar == null) {
                    eswoVar = eswo.a;
                }
                esjy esjyVar2 = esjyVar;
                tnn tnnVar = tnn.this;
                eswn eswnVar = (eswn) eswoVar.toBuilder();
                toa toaVar = (toa) tnnVar.h.b();
                esjx b2 = esjx.b(esjyVar2.b);
                if (b2 == null) {
                    b2 = esjx.UNRECOGNIZED;
                }
                esim esimVar2 = esimVar;
                eszw eszwVar = (eszw) toaVar.fP(b2);
                eswnVar.copyOnWrite();
                eswo eswoVar2 = (eswo) eswnVar.instance;
                eswoVar2.d = eszwVar.a();
                eswoVar2.b |= 2;
                tnx tnxVar = (tnx) tnnVar.g.b();
                esil b3 = esil.b(esimVar2.b);
                if (b3 == null) {
                    b3 = esil.UNRECOGNIZED;
                }
                esye esyeVar = (esye) tnxVar.fP(b3);
                eswnVar.copyOnWrite();
                eswo eswoVar3 = (eswo) eswnVar.instance;
                eswoVar3.c = esyeVar.a();
                eswoVar3.b |= 1;
                eswo eswoVar4 = (eswo) eswnVar.build();
                esvu esvuVar = (esvu) esvvVar.toBuilder();
                esvuVar.copyOnWrite();
                esvv esvvVar2 = (esvv) esvuVar.instance;
                eswoVar4.getClass();
                esvvVar2.j = eswoVar4;
                esvvVar2.c |= 16;
                return tnnVar.f.S((esvv) esvuVar.build(), tnn.b, tnn.e);
            }
        }, this.k);
    }

    public final elfl l(String str, final String str2, final eyhs eyhsVar) {
        return this.f.r(str).i(new eroh() { // from class: tmw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str3 = ((eszz) obj).c;
                etaq o = tnn.o(str2, eyhsVar);
                eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
                eyfgVar.a("extended_detail");
                return tnn.this.f.X(str3, o, (eyfh) eyfgVar.build(), false);
            }
        }, this.m).h(new emwl() { // from class: tmx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb c2 = tnn.a.c();
                c2.I("Updated CMS status object.");
                c2.A("contentId", str2);
                c2.r();
                return null;
            }
        }, erpp.a).e(fedn.class, new emwl() { // from class: tmy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fedn fednVar = (fedn) obj;
                tnn.p(fednVar, "UpdateObject", str2);
                throw fednVar;
            }
        }, erpp.a);
    }

    public final eswo n(axez axezVar, esye esyeVar) {
        eswn eswnVar = (eswn) eswo.a.createBuilder();
        axes b2 = axes.b(axezVar.y);
        if (b2 == null) {
            b2 = axes.ENCRYPTION_STATUS_UNSPECIFIED;
        }
        esxf a2 = tel.a(b2);
        eswnVar.copyOnWrite();
        ((eswo) eswnVar.instance).e = a2.a();
        eswnVar.copyOnWrite();
        eswo eswoVar = (eswo) eswnVar.instance;
        eswoVar.c = esyeVar.a();
        eswoVar.b |= 1;
        emwl emwlVar = tnz.a;
        axeu b3 = axeu.b(axezVar.l);
        if (b3 == null) {
            b3 = axeu.UNSPECIFIED_STATUS;
        }
        Object apply = emwlVar.apply(b3);
        eswnVar.copyOnWrite();
        eswo eswoVar2 = (eswo) eswnVar.instance;
        eswoVar2.d = ((eszw) apply).a();
        eswoVar2.b |= 2;
        if (this.j.a()) {
            eszt esztVar = (eszt) eszu.a.createBuilder();
            esztVar.copyOnWrite();
            ((eszu) esztVar.instance).b = 1;
            eswnVar.copyOnWrite();
            eswo eswoVar3 = (eswo) eswnVar.instance;
            eszu eszuVar = (eszu) esztVar.build();
            eszuVar.getClass();
            eswoVar3.f = eszuVar;
            eswoVar3.b |= 4;
        }
        return (eswo) eswnVar.build();
    }
}
