package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crvt {
    public static final entd a = entd.c("BugleCmsBoxDetails");
    public static final eyfh b;
    public static final esze c;
    static final eszs d;
    public final axkm e;
    public final crty f;
    public final akzt g;
    public final axdf h;
    public final errl i;
    private final aszs j;
    private final errl k;

    static {
        eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
        eyfgVar.a("box_devices");
        b = (eyfh) eyfgVar.build();
        eszd eszdVar = (eszd) esze.a.createBuilder();
        eszdVar.copyOnWrite();
        ((esze) eszdVar.instance).d = true;
        eszdVar.copyOnWrite();
        ((esze) eszdVar.instance).e = true;
        c = (esze) eszdVar.build();
        eszr eszrVar = (eszr) eszs.a.createBuilder();
        eszrVar.copyOnWrite();
        ((eszs) eszrVar.instance).c = eszq.a(5);
        eszrVar.copyOnWrite();
        ((eszs) eszrVar.instance).b = "fake address";
        d = (eszs) eszrVar.build();
    }

    public crvt(axkm axkmVar, crty crtyVar, akzt akztVar, axdf axdfVar, errl errlVar, errl errlVar2, aszs aszsVar) {
        this.e = axkmVar;
        this.f = crtyVar;
        this.g = akztVar;
        this.h = axdfVar;
        this.k = errlVar;
        this.i = errlVar2;
        this.j = aszsVar;
    }

    public final elfl a(esvv esvvVar, boolean z) {
        if (this.j.a() || !z) {
            return elfo.e(null);
        }
        axkm axkmVar = this.e;
        final String str = esvvVar.k;
        return axkmVar.C(new Function() { // from class: axiy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                axep axepVar = (axep) obj;
                cskc cskcVar = axkm.a;
                axepVar.copyOnWrite();
                axez axezVar = (axez) axepVar.instance;
                axez axezVar2 = axez.a;
                String str2 = str;
                str2.getClass();
                axezVar.c |= 4096;
                axezVar.Q = str2;
                return axepVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl b() {
        eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
        eyfgVar.a("box_devices");
        eyfgVar.a("extended_detail");
        final elfl k = this.f.k((eyfh) eyfgVar.build());
        final elfl i = this.e.n().i(new eroh() { // from class: crvl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    ensz enszVar = (ensz) crvt.a.h();
                    enszVar.Y(cdii.m, (String) optional.get());
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "getOrGenerateDeviceId", 323, "CmsBoxDetailsManager.java")).q("Retrieved the existing device ID.");
                    return elfo.e((String) optional.get());
                }
                crvt crvtVar = crvt.this;
                final String uuid = UUID.randomUUID().toString();
                ensz enszVar2 = (ensz) crvt.a.h();
                enszVar2.Y(cdii.m, uuid);
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "getOrGenerateDeviceId", 331, "CmsBoxDetailsManager.java")).q("Generated device ID for the device.");
                crvtVar.g.c("Bugle.Cms.PrimaryDevice.DeviceIdGenerated.Count");
                return crvtVar.e.A(new Function() { // from class: axhm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        axep axepVar = (axep) obj2;
                        cskc cskcVar = axkm.a;
                        axepVar.copyOnWrite();
                        axez axezVar = (axez) axepVar.instance;
                        axez axezVar2 = axez.a;
                        String str = uuid;
                        str.getClass();
                        axezVar.b |= 8;
                        axezVar.g = str;
                        return axepVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).h(new emwl() { // from class: crvo
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = crvt.a;
                        return uuid;
                    }
                }, crvtVar.i);
            }
        }, this.k);
        return elfo.m(k, i).b(new erog() { // from class: crvj
            @Override // defpackage.erog
            public final ListenableFuture a() {
                String str = (String) erqt.q(i);
                esvv esvvVar = (esvv) erqt.q(k);
                engw a2 = cscq.a(esvvVar);
                eydq eydqVar = esvvVar.g;
                if (eydqVar == null) {
                    eydqVar = eydq.a;
                }
                try {
                    final String str2 = ((eshj) eyfy.parseFrom(eshj.a, ((esij) eyfy.parseFrom(esij.a, eydqVar.c, eyfc.a())).b, eyfc.a())).b;
                    String uuid = UUID.randomUUID().toString();
                    final boolean z = (a2.contains(str) && a2.size() == 1) ? false : true;
                    boolean isEmpty = str2.isEmpty();
                    if (str2.isEmpty()) {
                        str2 = uuid;
                    } else {
                        ensz enszVar = (ensz) crvt.a.h();
                        enszVar.Y(cdii.n, str2);
                        enszVar.Y(cdii.x, "Box logging ID exists on the server");
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "updatePrimaryDeviceAndBoxDetails", 116, "CmsBoxDetailsManager.java")).q("Updating local box logging ID");
                    }
                    final crvt crvtVar = crvt.this;
                    axnw.h(crvtVar.e.A(new Function() { // from class: axia
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            axep axepVar = (axep) obj;
                            cskc cskcVar = axkm.a;
                            axepVar.copyOnWrite();
                            axez axezVar = (axez) axepVar.instance;
                            axez axezVar2 = axez.a;
                            String str3 = str2;
                            str3.getClass();
                            axezVar.b |= 512;
                            axezVar.m = str3;
                            return axepVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }));
                    if (!z && !isEmpty) {
                        ensz enszVar2 = (ensz) crvt.a.h();
                        enszVar2.Y(cdii.m, str);
                        enszVar2.Y(cdii.n, str2);
                        enszVar2.Y(cdii.x, "Not setting logging ID and primary device");
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "updatePrimaryDeviceAndBoxDetails", 129, "CmsBoxDetailsManager.java")).q("Skip updating box details in box");
                        return elfo.e(null);
                    }
                    ensz enszVar3 = (ensz) crvt.a.h();
                    enszVar3.Y(cdii.m, str);
                    enszVar3.Y(cdii.o, eirv.b().a(a2));
                    enszVar3.Y(cdii.n, str2);
                    ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "updatePrimaryDeviceAndBoxDetails", 138, "CmsBoxDetailsManager.java")).q("Updating box for primary device/box logging id");
                    esvu esvuVar = (esvu) esvv.b.createBuilder();
                    String str3 = esvvVar.d;
                    esvuVar.copyOnWrite();
                    esvv esvvVar2 = (esvv) esvuVar.instance;
                    str3.getClass();
                    esvvVar2.d = str3;
                    eyfg eyfgVar2 = (eyfg) eyfh.a.createBuilder();
                    if (z) {
                        esvuVar.a((Iterable) Collection.EL.stream(esvvVar.f).filter(new Predicate() { // from class: crvm
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
                            public final boolean test(Object obj) {
                                entd entdVar = crvt.a;
                                int a3 = esvz.a(((esvx) obj).c);
                                return a3 == 0 || a3 != 3;
                            }
                        }).collect(Collectors.toCollection(new crvn())));
                        esvw esvwVar = (esvw) esvx.a.createBuilder();
                        esvwVar.copyOnWrite();
                        esvx esvxVar = (esvx) esvwVar.instance;
                        str.getClass();
                        esvxVar.b = str;
                        esvwVar.copyOnWrite();
                        ((esvx) esvwVar.instance).c = 1;
                        esvwVar.copyOnWrite();
                        ((esvx) esvwVar.instance).d = 2;
                        esvx esvxVar2 = (esvx) esvwVar.build();
                        esvuVar.copyOnWrite();
                        esvv esvvVar3 = (esvv) esvuVar.instance;
                        esvxVar2.getClass();
                        esvvVar3.a();
                        esvvVar3.f.add(esvxVar2);
                        eyfgVar2.a("box_devices");
                        ensz enszVar4 = (ensz) crvt.a.h();
                        enszVar4.Y(cdii.m, str);
                        enszVar4.Y(cdii.n, str2);
                        ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "prepareUpdateForPrimaryDevice", 220, "CmsBoxDetailsManager.java")).q("Update primary device id");
                        engw a3 = cscq.a(esvvVar);
                        axdf axdfVar = crvtVar.h;
                        String a4 = eirv.b().a(a3);
                        epfc epfcVar = (epfc) epfe.a.createBuilder();
                        epfcVar.copyOnWrite();
                        epfe epfeVar = (epfe) epfcVar.instance;
                        epfeVar.c = 1;
                        epfeVar.b |= 1;
                        epfcVar.copyOnWrite();
                        epfe epfeVar2 = (epfe) epfcVar.instance;
                        str2.getClass();
                        epfeVar2.b |= 2;
                        epfeVar2.d = str2;
                        epfcVar.copyOnWrite();
                        epfe epfeVar3 = (epfe) epfcVar.instance;
                        str.getClass();
                        epfeVar3.b |= 4;
                        epfeVar3.e = str;
                        epfcVar.copyOnWrite();
                        epfe epfeVar4 = (epfe) epfcVar.instance;
                        epfeVar4.b |= 8;
                        epfeVar4.f = a4;
                        axdfVar.s((epfe) epfcVar.build());
                    } else if (a2.contains(str) && a2.size() == 1) {
                        ensz enszVar5 = (ensz) crvt.a.h();
                        enszVar5.Y(cdii.m, str);
                        enszVar5.Y(cdii.n, str2);
                        enszVar5.Y(cdii.x, "Current device is primary device in box");
                        ((ensz) enszVar5.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "updatePrimaryDeviceAndBoxDetails", 152, "CmsBoxDetailsManager.java")).q("Not setting device ID");
                    } else {
                        ensz enszVar6 = (ensz) crvt.a.h();
                        enszVar6.Y(cdii.m, str);
                        enszVar6.Y(cdii.n, str2);
                        ((ensz) enszVar6.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "updatePrimaryDeviceAndBoxDetails", 158, "CmsBoxDetailsManager.java")).q("Not setting device ID");
                    }
                    if (isEmpty) {
                        eshi eshiVar = (eshi) eshj.a.createBuilder();
                        eshiVar.copyOnWrite();
                        eshj eshjVar = (eshj) eshiVar.instance;
                        str2.getClass();
                        eshjVar.b = str2;
                        eshj eshjVar2 = (eshj) eshiVar.build();
                        esii esiiVar = (esii) esij.a.createBuilder();
                        eyee byteString = eshjVar2.toByteString();
                        esiiVar.copyOnWrite();
                        ((esij) esiiVar.instance).b = byteString;
                        esiiVar.copyOnWrite();
                        ((esij) esiiVar.instance).c = -1;
                        esij esijVar = (esij) esiiVar.build();
                        eydp eydpVar = (eydp) eydq.a.createBuilder();
                        eydpVar.copyOnWrite();
                        ((eydq) eydpVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
                        eyee byteString2 = esijVar.toByteString();
                        eydpVar.copyOnWrite();
                        ((eydq) eydpVar.instance).c = byteString2;
                        eydq eydqVar2 = (eydq) eydpVar.build();
                        esvuVar.copyOnWrite();
                        esvv esvvVar4 = (esvv) esvuVar.instance;
                        eydqVar2.getClass();
                        esvvVar4.g = eydqVar2;
                        esvvVar4.c |= 1;
                        eyfgVar2.a("extended_detail");
                        ensz enszVar7 = (ensz) crvt.a.h();
                        enszVar7.Y(cdii.n, str2);
                        enszVar7.Y(cdii.m, str);
                        ((ensz) enszVar7.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "prepareUpdateForBoxLoggingId", 237, "CmsBoxDetailsManager.java")).q("Update box logging id");
                    } else {
                        ensz enszVar8 = (ensz) crvt.a.h();
                        enszVar8.Y(cdii.n, str2);
                        ((ensz) enszVar8.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "updatePrimaryDeviceAndBoxDetails", 168, "CmsBoxDetailsManager.java")).q("Not setting box logging ID");
                    }
                    return (csgj.a() && ((Boolean) ((cfup) csfu.b.get()).e()).booleanValue() && z) ? crvtVar.f.ai((esvv) esvuVar.build(), (eyfh) eyfgVar2.build(), crvt.c, 3).i(new eroh() { // from class: crvi
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return crvt.this.a((esvv) obj, true);
                        }
                    }, crvtVar.i) : crvtVar.f.S((esvv) esvuVar.build(), (eyfh) eyfgVar2.build(), crvt.c).i(new eroh() { // from class: crvk
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return crvt.this.a((esvv) obj, z);
                        }
                    }, crvtVar.i);
                } catch (eygu e) {
                    throw new crvv(e);
                }
            }
        }, this.i);
    }
}
