package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccrf implements ccjf {
    public static final entd a = entd.c("BugleCms");
    public static final entd b = entd.c("BugleCmsCall");
    public final crty c;
    public final csbl d;
    public final csaj e;
    public final errl f;
    public final errl g;
    public final cdnd h;
    public final ashs i;
    public final ffbr j;
    public final asji k;
    public final ashn l;
    public final cryg m;
    private final cdls n;
    private final ashx o;
    private final akzt p;
    private final asiw q;

    public ccrf(crty crtyVar, csbl csblVar, csaj csajVar, cdls cdlsVar, errl errlVar, errl errlVar2, cdnd cdndVar, ashs ashsVar, ffbr ffbrVar, asji asjiVar, ashn ashnVar, ashx ashxVar, akzt akztVar, asiw asiwVar, cryg crygVar) {
        this.c = crtyVar;
        this.d = csblVar;
        this.e = csajVar;
        this.h = cdndVar;
        this.n = cdlsVar;
        this.i = ashsVar;
        this.j = ffbrVar;
        this.f = errlVar;
        this.g = errlVar2;
        this.k = asjiVar;
        this.l = ashnVar;
        this.o = ashxVar;
        this.p = akztVar;
        this.q = asiwVar;
        this.m = crygVar;
    }

    public static ccki e(Throwable th, String str, String str2, int i, String str3) {
        ensz enszVar = (ensz) ((ensz) a.j()).g(th);
        enszVar.Y(cdii.c, str2);
        enszVar.Y(cdii.d, str);
        enszVar.Y(cdii.e, str3);
        enszVar.Y(cdii.p, Integer.valueOf(i));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "executeFailure", 654, "CmsPayloadPartHandler.java")).q("CMS message updates backup: Failure while processing CmsPayloadPart.");
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        return cckc.a(th, i);
    }

    private final elfl f(final String str) {
        return this.n.a(bdhb.b(str)).h(new emwl() { // from class: ccqr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = ccrf.a;
                return new cckg();
            }
        }, this.g).e(cdlr.class, new emwl() { // from class: ccqw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cdlr cdlrVar = (cdlr) obj;
                ensz enszVar = (ensz) ccrf.a.j();
                enszVar.Y(cdii.c, str);
                ((ensz) ((ensz) enszVar.g(cdlrVar)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "deleteMediaPartsForMessage", 520, "CmsPayloadPartHandler.java")).q("Deletion of blob ids failed for message");
                return new ccke(cdlrVar);
            }
        }, this.f);
    }

    @Override // defpackage.ccjf
    public final elfl a(engw engwVar, Optional optional) {
        return elfo.d(new UnsupportedOperationException());
    }

    @Override // defpackage.ccjf
    public final elfl b(final String str, final String str2, final int i, final boolean z) {
        elfl elflVar;
        boolean z2;
        Optional f = this.e.f(bdhb.b(str2));
        if (csgj.a() && i == ccue.a(9)) {
            elflVar = f(str2);
        } else if (f.isEmpty()) {
            ensz enszVar = (ensz) a.h();
            enszVar.Y(cdii.d, str);
            enszVar.Y(cdii.c, str2);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "handlePotentialPartsDeletion", 429, "CmsPayloadPartHandler.java")).q("Message for this payload part not found");
            elflVar = i == ccrk.a(5) ? f(str2) : elfo.e(new cckf());
        } else {
            elflVar = null;
        }
        if (elflVar != null) {
            return elflVar;
        }
        final crzp crzpVar = (crzp) f.get();
        final MessageCoreData a2 = crzpVar.a();
        if (!this.o.a() && a2.d() == 2) {
            ensz enszVar2 = (ensz) a.h();
            enszVar2.Y(cdii.d, str);
            enszVar2.Y(cdii.c, str2);
            enszVar2.Y(cdii.p, Integer.valueOf(i));
            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "processSingleItem", 213, "CmsPayloadPartHandler.java")).q("Skip updating WAP_PUSH message");
            return elfo.e(new cckf());
        }
        if (a2.k() == 16) {
            ensz enszVar3 = (ensz) a.h();
            enszVar3.Y(cdii.d, str);
            enszVar3.Y(cdii.c, str2);
            enszVar3.Y(cdii.p, Integer.valueOf(i));
            ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "processSingleItem", 223, "CmsPayloadPartHandler.java")).q("Skip backing up parts for scheduled send message");
            return elfo.e(new cckf());
        }
        if (a2.k() == 3) {
            ensz enszVar4 = (ensz) a.h();
            enszVar4.Y(cdii.d, str);
            enszVar4.Y(cdii.c, str2);
            enszVar4.Y(cdii.p, Integer.valueOf(i));
            ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "processSingleItem", 234, "CmsPayloadPartHandler.java")).q("Skip updating draft message");
            return elfo.e(new cckf());
        }
        final String ak = a2.ak();
        if (!TextUtils.isEmpty(ak)) {
            if (i != ccrk.a(4)) {
                final crtp crtpVar = new crtp();
                final enhk enhkVar = (enhk) Collection.EL.stream(a2.ab()).filter(new Predicate() { // from class: ccqx
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
                        return ((MessagePartCoreData) obj).bo();
                    }
                }).collect(endq.a(new Function() { // from class: ccqy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((MessagePartCoreData) obj).aa();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: ccqz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cgzv cgzvVar = (cgzv) ccrf.this.j.b();
                        cgzvVar.getClass();
                        elfl d = cgzvVar.d((MessagePartCoreData) obj);
                        d.getClass();
                        return d;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                return elfo.j(enhkVar.values()).a(new Callable() { // from class: ccra
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        entd entdVar = ccrf.a;
                        enhk enhkVar2 = enhk.this;
                        final csbf csbfVar = crtpVar;
                        final MessageCoreData messageCoreData = a2;
                        Map.EL.forEach(enhkVar2, new BiConsumer() { // from class: ccqt
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                String str3 = (String) obj;
                                elfl elflVar2 = (elfl) obj2;
                                entd entdVar2 = ccrf.a;
                                csbf csbfVar2 = csbf.this;
                                try {
                                    crtr crtrVar = new crtr();
                                    crtrVar.a = (eyee) erqt.q(elflVar2);
                                    csbfVar2.c(str3, crtrVar.a());
                                } catch (Exception e) {
                                    MessageCoreData messageCoreData2 = messageCoreData;
                                    ensz enszVar5 = (ensz) ccrf.a.j();
                                    enszVar5.Y(cdii.c, messageCoreData2.B().b());
                                    ((ensz) ((ensz) enszVar5.g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "buildCalculatedData", 330, "CmsPayloadPartHandler.java")).q("Failed to calculate thumbnails for this message.");
                                }
                            }

                            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                return BiConsumer$CC.$default$andThen(this, biConsumer);
                            }
                        });
                        return csbfVar.a();
                    }
                }, this.f).i(new eroh() { // from class: ccrc
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        char c;
                        etaq a3;
                        boolean z3;
                        ListenableFuture h;
                        elfl d;
                        final ccrf ccrfVar = ccrf.this;
                        final int i2 = i;
                        crzp crzpVar2 = crzpVar;
                        csbg csbgVar = (csbg) obj;
                        try {
                            engw g = csaj.g(crzpVar2);
                            if (!g.isEmpty()) {
                                throw new csgv("Missing message dependency", engw.n(g));
                            }
                            bqvj c2 = ccrfVar.m.c(1);
                            byte[] q = c2 == null ? null : c2.q();
                            if (c2 == null || q == null) {
                                throw new crvu("No encryption key available in cmsTable");
                            }
                            csbq a4 = ccrfVar.d.a(crzpVar2, c2);
                            a4.b(csbgVar);
                            int a5 = ccrk.a(3);
                            boolean z4 = z;
                            final String str3 = str2;
                            if (i2 == a5) {
                                a3 = a4.a(csbj.OBJECT_PAYLOAD_PART_ENCRYPTED_FREQ_CHANGED);
                                c = 0;
                            } else if (i2 == ccrk.a(5)) {
                                if (!ccrfVar.l.a()) {
                                    z3 = z4;
                                } else if (z4) {
                                    c = 0;
                                    a3 = a4.a(csbj.OBJECT_PAYLOAD_PART_ENCRYPTED_RARELY_CHANGED);
                                } else {
                                    z3 = false;
                                }
                                c = 0;
                                ccrfVar.h.g(crzpVar2.a(), z3, eykm.c);
                                ccrfVar.h.f(crzpVar2.a(), z3, eykm.c);
                                a3 = a4.a(csbj.OBJECT_PAYLOAD_PART_ENCRYPTED_RARELY_CHANGED);
                            } else {
                                c = 0;
                                if (!ccrfVar.i.a() || !csgj.a() || i2 != ccrk.a(6)) {
                                    ensz enszVar5 = (ensz) ccrf.a.j();
                                    enszVar5.Y(cdii.a, "PayloadPart");
                                    enszVar5.Y(cdii.b, "Unidentified");
                                    enszVar5.Y(cdii.c, str3);
                                    ensn ensnVar = cdii.p;
                                    Integer valueOf = Integer.valueOf(i2);
                                    enszVar5.Y(ensnVar, valueOf);
                                    ((ensz) enszVar5.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "buildPayloadPart", 502, "CmsPayloadPartHandler.java")).q("Flags not recognized for PayloadPart");
                                    throw new ccje(String.format("Flag %s does not indicate a update operation for entityType=%s", valueOf, "PayloadPart"));
                                }
                                a3 = a4.a(csbj.OBJECT_PAYLOAD_PART_ADDITIONAL_FIELDS);
                            }
                            final String str4 = ak;
                            final String str5 = str;
                            if (a3 == null) {
                                ensk n = ccrf.a.n();
                                n.Y(cdii.d, str5);
                                n.Y(cdii.c, str3);
                                n.Y(cdii.p, Integer.valueOf(i2));
                                n.Y(cdii.e, str4);
                                ((ensz) n.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "buildPayloadPart", 363, "CmsPayloadPartHandler.java")).q("PayloadPart not found. Skip.");
                                return elfo.e(new cckf());
                            }
                            final MessageCoreData messageCoreData = a2;
                            if (!csgj.a() || !((Boolean) ((cfup) csfu.c.get()).e()).booleanValue() || !((Boolean) ((cfup) csgj.s.get()).e()).booleanValue()) {
                                String ak2 = messageCoreData.ak();
                                if (ccjd.b(i2)) {
                                    ensz enszVar6 = (ensz) ccrf.b.h();
                                    enszVar6.Y(cdii.a, "PayloadPart");
                                    enszVar6.Y(cdii.b, "Update");
                                    enszVar6.Y(cdii.c, str3);
                                    enszVar6.Y(cdii.e, ak2);
                                    enszVar6.Y(cdii.p, Integer.valueOf(i2));
                                    ((ensz) enszVar6.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "callCms", 608, "CmsPayloadPartHandler.java")).o();
                                    crty crtyVar = ccrfVar.c;
                                    eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
                                    eyfgVar.a("extended_detail");
                                    h = crtyVar.X(ak2, a3, (eyfh) eyfgVar.build(), z4);
                                } else {
                                    ensz enszVar7 = (ensz) ccrf.b.j();
                                    enszVar7.Y(cdii.a, "PayloadPart");
                                    enszVar7.Y(cdii.b, "Unidentified");
                                    enszVar7.Y(cdii.c, str3);
                                    enszVar7.Y(cdii.e, ak2);
                                    ensn ensnVar2 = cdii.p;
                                    Integer valueOf2 = Integer.valueOf(i2);
                                    enszVar7.Y(ensnVar2, valueOf2);
                                    ((ensz) enszVar7.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "callCms", 619, "CmsPayloadPartHandler.java")).q("Can't find operation for PayloadPart");
                                    Object[] objArr = new Object[2];
                                    objArr[c] = valueOf2;
                                    objArr[1] = "PayloadPart";
                                    h = erqt.h(new ccje(String.format("Flag %s does not indicate a update operation for entityType=%s", objArr)));
                                }
                                return elfl.g(h).i(new eroh() { // from class: ccre
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        etaq etaqVar = (etaq) obj2;
                                        ensk o = ccrf.a.o();
                                        o.Y(cdii.c, str3);
                                        o.Y(cdii.d, str5);
                                        o.Y(cdii.e, str4);
                                        o.Y(cdii.p, Integer.valueOf(i2));
                                        o.Y(cdii.i, etaqVar != null ? etaqVar.c : "");
                                        o.Y(cdii.j, etaqVar != null ? etaqVar.f : "");
                                        ((ensz) o.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "executeSuccess", 642, "CmsPayloadPartHandler.java")).q("Processed CMS message updates backup");
                                        if (!((Boolean) ((cfup) csgj.s.get()).e()).booleanValue() || !csgj.a()) {
                                            return elfo.e(new cckg());
                                        }
                                        MessageCoreData messageCoreData2 = messageCoreData;
                                        ccrf ccrfVar2 = ccrf.this;
                                        eszy eszyVar = (eszy) eszz.a.createBuilder();
                                        String ak3 = messageCoreData2.ak();
                                        eszyVar.copyOnWrite();
                                        eszz eszzVar = (eszz) eszyVar.instance;
                                        ak3.getClass();
                                        eszzVar.c = ak3;
                                        eszyVar.b("STATUS", String.valueOf(messageCoreData2.k()));
                                        eszz eszzVar2 = (eszz) eszyVar.build();
                                        eyfg eyfgVar2 = (eyfg) eyfh.a.createBuilder();
                                        eyfgVar2.a("attributes");
                                        eyfh eyfhVar = (eyfh) eyfgVar2.build();
                                        eszd eszdVar = (eszd) esze.a.createBuilder();
                                        eszdVar.copyOnWrite();
                                        ((esze) eszdVar.instance).d = true;
                                        return ccrfVar2.c.ak(eszzVar2, eyfhVar, (esze) eszdVar.build()).h(new emwl() { // from class: ccqv
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj3) {
                                                entd entdVar = ccrf.a;
                                                return new cckg();
                                            }
                                        }, ccrfVar2.f);
                                    }
                                }, ccrfVar.g).e(Throwable.class, new emwl() { // from class: ccqs
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        Throwable th = (Throwable) obj2;
                                        if ((ccrf.this.k.a() || csgj.a()) && (th instanceof Error)) {
                                            throw ((Error) th);
                                        }
                                        String str6 = str4;
                                        int i3 = i2;
                                        return ccrf.e(th, str5, str3, i3, str6);
                                    }
                                }, ccrfVar.g);
                            }
                            String ak3 = messageCoreData.ak();
                            if (ccjd.b(i2)) {
                                ensz enszVar8 = (ensz) ccrf.b.h();
                                enszVar8.Y(cdii.a, "PayloadPart");
                                enszVar8.Y(cdii.b, "Update");
                                enszVar8.Y(cdii.c, str3);
                                enszVar8.Y(cdii.e, ak3);
                                enszVar8.Y(cdii.p, Integer.valueOf(i2));
                                ((ensz) enszVar8.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "updateMessageAttributesAndPayloadPart", 542, "CmsPayloadPartHandler.java")).o();
                                eszy eszyVar = (eszy) eszz.a.createBuilder();
                                String ak4 = messageCoreData.ak();
                                eszyVar.copyOnWrite();
                                eszz eszzVar = (eszz) eszyVar.instance;
                                ak4.getClass();
                                eszzVar.c = ak4;
                                eszyVar.b("STATUS", String.valueOf(messageCoreData.k()));
                                etan etanVar = (etan) etao.a.createBuilder();
                                etanVar.a(a3);
                                etao etaoVar = (etao) etanVar.build();
                                eszyVar.copyOnWrite();
                                eszz eszzVar2 = (eszz) eszyVar.instance;
                                etaoVar.getClass();
                                eszzVar2.i = etaoVar;
                                eszzVar2.b |= 4;
                                eszz eszzVar3 = (eszz) eszyVar.build();
                                crty crtyVar2 = ccrfVar.c;
                                eyfg eyfgVar2 = (eyfg) eyfh.a.createBuilder();
                                eyfgVar2.a("attributes");
                                eyfgVar2.a("payload");
                                d = crtyVar2.V(eszzVar3, (eyfh) eyfgVar2.build(), esze.a, z4).h(new emwl() { // from class: ccrb
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        entd entdVar = ccrf.a;
                                        return new cckg();
                                    }
                                }, ccrfVar.f);
                            } else {
                                ensz enszVar9 = (ensz) ccrf.b.j();
                                enszVar9.Y(cdii.a, "PayloadPart");
                                enszVar9.Y(cdii.b, "Unidentified");
                                enszVar9.Y(cdii.c, str3);
                                enszVar9.Y(cdii.e, ak3);
                                ensn ensnVar3 = cdii.p;
                                Integer valueOf3 = Integer.valueOf(i2);
                                enszVar9.Y(ensnVar3, valueOf3);
                                ((ensz) enszVar9.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "updateMessageAttributesAndPayloadPart", 567, "CmsPayloadPartHandler.java")).q("Can't find operation for PayloadPart");
                                Object[] objArr2 = new Object[2];
                                objArr2[c] = valueOf3;
                                objArr2[1] = "PayloadPart";
                                d = elfo.d(new ccje(String.format("Flag %s does not indicate a update operation for entityType=%s", objArr2)));
                            }
                            return d.e(Throwable.class, new emwl() { // from class: ccrd
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    Throwable th = (Throwable) obj2;
                                    if ((ccrf.this.k.a() || csgj.a()) && (th instanceof Error)) {
                                        throw ((Error) th);
                                    }
                                    String str6 = str4;
                                    int i3 = i2;
                                    return ccrf.e(th, str5, str3, i3, str6);
                                }
                            }, ccrfVar.g);
                        } catch (RuntimeException e) {
                            return elfo.e(cckc.a(e, i2));
                        }
                    }
                }, this.g);
            }
            if (this.l.a()) {
                if (!z) {
                    z2 = false;
                }
                return elfo.e(new cckg());
            }
            z2 = z;
            this.h.g(a2, z2, eykm.c);
            this.h.f(a2, z2, eykm.c);
            return elfo.e(new cckg());
        }
        entd entdVar = a;
        ensz enszVar5 = (ensz) entdVar.h();
        enszVar5.Y(cdii.d, str);
        enszVar5.Y(cdii.c, str2);
        ((ensz) enszVar5.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "processSingleItem", 244, "CmsPayloadPartHandler.java")).q("Message for this payload part is not backed up");
        csgg V = a2.V();
        if (((ersq) ((arkf) this.q).a.b()).a("bugle.log_media_with_invalid_cms_lifecycle_id_state") && V.a()) {
            ensz enszVar6 = (ensz) entdVar.j();
            enszVar6.Y(cdii.d, str);
            enszVar6.Y(cdii.c, str2);
            enszVar6.Y(cdii.f, V);
            ((ensz) enszVar6.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "processSingleItem", PrivateKeyType.INVALID, "CmsPayloadPartHandler.java")).q("Message for this payload part does not have a CMS ID but has a CMS life cycle representing an item backed up.");
            this.p.e("Bugle.Cms.Media.Upload.MessageNoCmsIdAndBackedUpLifeCycle.Count", teo.a(V) - 1);
        }
        return elfo.e(new ccke(new csgv("Missing message dependency", engw.r(new csgn(str2, 3)))));
    }

    @Override // defpackage.ccjf
    public final /* synthetic */ boolean c(int i) {
        return ccjd.a(i);
    }

    @Override // defpackage.ccjf
    public final elfl d(String str, String str2, int i) {
        return b(str, str2, i, true).i(new eroh() { // from class: ccqu
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ccki cckiVar = (ccki) obj;
                boolean z = cckiVar instanceof cckd;
                entd entdVar = ccrf.a;
                if (!z && !(cckiVar instanceof ccke)) {
                    return elfo.e(true);
                }
                Throwable th = ((cckb) cckiVar).a;
                return th instanceof cdlr ? elfo.e(false) : elfo.d(th);
            }
        }, this.f);
    }
}
