package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ccah;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccah implements cdwq {
    public static final cskc a = cskc.g("BugleCms", "BackupSelfParticipantWorkItemProcessor");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/BackupSelfParticipantWorkItemProcessor");
    public final asif c;
    public final errl d;
    public final errl e;
    public final axkm f;
    public final axdf g;
    public final asik h;
    public final crzd i;

    /* compiled from: PG */
    public interface a {
        crtz eT();

        Map gx();
    }

    public ccah(axkm axkmVar, asif asifVar, errl errlVar, errl errlVar2, axdf axdfVar, crzd crzdVar, asik asikVar) {
        this.f = axkmVar;
        this.c = asifVar;
        this.d = errlVar;
        this.e = errlVar2;
        this.g = axdfVar;
        this.i = crzdVar;
        this.h = asikVar;
    }

    public static final ceyt e(cdxp cdxpVar) {
        csgm b2 = csgm.b(cdxpVar.e);
        if (b2 == null) {
            b2 = csgm.CMS_FEATURE_UNDEFINED;
        }
        if (!csgj.a() || !b2.equals(csgm.CMS_FEATURE_BACKUP_AND_RESTORE)) {
            return ceyt.j(engw.r(cdxt.a(cdxpVar)));
        }
        cdvw cdvwVar = (cdvw) cdvx.a.createBuilder();
        csgm csgmVar = csgm.CMS_FEATURE_BACKUP_AND_RESTORE;
        cdvwVar.copyOnWrite();
        cdvx cdvxVar = (cdvx) cdvwVar.instance;
        cdvxVar.d = csgmVar.d;
        cdvxVar.b |= 2;
        int i = cdxpVar.c;
        cdvwVar.copyOnWrite();
        cdvx cdvxVar2 = (cdvx) cdvwVar.instance;
        cdvxVar2.b |= 1;
        cdvxVar2.c = i;
        return ceyt.j(engw.r(ccan.a((cdvx) cdvwVar.build())));
    }

    @Override // defpackage.cdws
    public final /* synthetic */ int a(Object obj) {
        return ((cdxp) obj).c;
    }

    public final elfl b() {
        bvvn e = ParticipantsTable.e();
        e.z("BackupSelfParticipantWorkHandler.getSelfParticipant");
        bvvw bvvwVar = new bvvw();
        bvvwVar.w(-1);
        e.g(bvvwVar);
        e.x(1);
        return e.b().w().h(new emwl() { // from class: cbzu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw engwVar = (engw) obj;
                if (engwVar.size() == 1) {
                    return (ParticipantsTable.BindData) engwVar.get(0);
                }
                ccah.a.n("Could not find a SELF participant");
                throw new ccai();
            }
        }, this.d);
    }

    @Override // defpackage.cdwq
    public final /* bridge */ /* synthetic */ elfl c(final ceuw ceuwVar, Object obj, Object obj2) {
        final a aVar = (a) obj;
        final cdxp cdxpVar = (cdxp) obj2;
        return (this.h.a() ? this.f.i().i(new eroh() { // from class: cbzr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj3) {
                boolean equals = ((eyja) obj3).equals(eykm.c);
                final ccah ccahVar = ccah.this;
                final ceuw ceuwVar2 = ceuwVar;
                final ccah.a aVar2 = aVar;
                return !equals ? ccahVar.b().i(new eroh() { // from class: ccad
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj4) {
                        ccah ccahVar2 = ccah.this;
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj4;
                        String b2 = ccahVar2.i.b(null, true);
                        bvvr f = ParticipantsTable.f();
                        f.ap("processCmsWorkItemAsync#setCmsId");
                        f.g(b2);
                        int a2 = f.a(-1);
                        ceuw ceuwVar3 = ceuwVar2;
                        ccah.a aVar3 = aVar2;
                        if (a2 <= 0) {
                            return ccahVar2.d(elfo.e(bindData), 17, ceuwVar3, aVar3);
                        }
                        bvpo C = bindData.C();
                        C.f(b2);
                        return ccahVar2.d(elfo.e(C.a()), 33, ceuwVar3, aVar3);
                    }
                }, ccahVar.e) : ccahVar.d(ccahVar.b(), 17, ceuwVar2, aVar2);
            }
        }, this.d).f(fedn.class, new eroh() { // from class: cbzs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj3) {
                fedn fednVar = (fedn) obj3;
                if (fednVar.a.getCode() != Status.Code.NOT_FOUND) {
                    throw fednVar;
                }
                ensk h = ccah.b.h();
                h.Y(ente.a, "BugleCms");
                enrr enrrVar = (enrr) h;
                enrrVar.Y(csux.O, "BackupSelfParticipantWorkItemProcessor");
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/BackupSelfParticipantWorkItemProcessor", "backupSelfParticipant", 195, "BackupSelfParticipantWorkItemProcessor.java")).q("Updating SELF participant since it was not found in CMS");
                bvvr f = ParticipantsTable.f();
                f.ap("backupSelfParticipant#removeCmsId");
                f.h();
                if (f.a(-1) <= 0) {
                    throw fednVar;
                }
                ccah.a aVar2 = aVar;
                ceuw ceuwVar2 = ceuwVar;
                ccah ccahVar = ccah.this;
                return ccahVar.d(ccahVar.b(), 17, ceuwVar2, aVar2);
            }
        }, this.e).i(new eroh() { // from class: cbzt
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj3) {
                Boolean bool = (Boolean) obj3;
                final boolean booleanValue = bool.booleanValue();
                if (csgj.a()) {
                    ccah ccahVar = ccah.this;
                    if (ccahVar.c.a()) {
                        return ccahVar.f.am().h(new emwl() { // from class: ccaa
                            @Override // defpackage.emwl
                            public final Object apply(Object obj4) {
                                return Boolean.valueOf(booleanValue);
                            }
                        }, erpp.a);
                    }
                }
                return elfo.e(bool);
            }
        }, this.d) : d(b(), 17, ceuwVar, aVar)).i(new eroh() { // from class: cbzv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj3) {
                if (!((Boolean) obj3).booleanValue()) {
                    return elfo.e(ceyt.m());
                }
                final cdxp cdxpVar2 = cdxpVar;
                final ccah ccahVar = ccah.this;
                if (!csgj.a()) {
                    return elfo.e(ccah.e(cdxpVar2));
                }
                final ccah.a aVar2 = aVar;
                return ccahVar.f.ao().i(new eroh() { // from class: ccag
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj4) {
                        final crtz eT = aVar2.eT();
                        final ArrayList arrayList = new ArrayList();
                        final cdxp cdxpVar3 = cdxpVar2;
                        csgm b2 = csgm.b(cdxpVar3.e);
                        if (b2 == null) {
                            b2 = csgm.CMS_FEATURE_UNDEFINED;
                        }
                        final ccah ccahVar2 = ccah.this;
                        arrayList.add(ten.a(b2));
                        return ccahVar2.f.h().i(new eroh() { // from class: ccaf
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj5) {
                                esxf a2 = tel.a((axes) obj5);
                                csjb c = ccah.a.c();
                                List list = arrayList;
                                Stream map = Collection.EL.stream(list).map(new Function() { // from class: cbzq
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj6) {
                                        return ((esxi) obj6).name();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i = engw.d;
                                c.A("CmsFeatureTypes", ((engw) map.collect(endq.a)).toString());
                                c.A("CmsEncryptionStatus", a2.name());
                                c.I("Updating CMS box featureTypes and encryption state...");
                                c.r();
                                final crtz crtzVar = eT;
                                elfl f = crtzVar.f(list);
                                eroh erohVar = new eroh() { // from class: cbzy
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj6) {
                                        return crtz.this.j();
                                    }
                                };
                                ccah ccahVar3 = ccah.this;
                                elfl i2 = f.i(erohVar, ccahVar3.d);
                                final cdxp cdxpVar4 = cdxpVar3;
                                return i2.h(new emwl() { // from class: cbzz
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj6) {
                                        return ccah.e(cdxp.this);
                                    }
                                }, ccahVar3.d);
                            }
                        }, ccahVar2.d);
                    }
                }, ccahVar.d);
            }
        }, this.d).e(csgp.class, new emwl() { // from class: cbzw
            @Override // defpackage.emwl
            public final Object apply(Object obj3) {
                csgp csgpVar = (csgp) obj3;
                ccah.a.s("Failed when backing up SELF participant", csgpVar);
                ccah.this.g.i(((cetk) ceuwVar.a()).c, csgpVar);
                return csgpVar.b.equals(csgx.RETRY) ? ceyt.m() : ceyt.k();
            }
        }, this.d).e(Throwable.class, new emwl() { // from class: cbzx
            @Override // defpackage.emwl
            public final Object apply(Object obj3) {
                Throwable th = (Throwable) obj3;
                ccah.a.s("Failed when backing up SELF participant", th);
                ccah.this.g.i(((cetk) ceuwVar.a()).c, th);
                return ceyt.m();
            }
        }, this.d);
    }

    public final elfl d(elfl elflVar, final int i, final ceuw ceuwVar, final a aVar) {
        return elflVar.i(new eroh() { // from class: ccab
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                ccah ccahVar = ccah.this;
                return !ccahVar.h.a() ? (csgj.a() && ccahVar.c.a()) ? ccahVar.f.am().h(new emwl() { // from class: ccae
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return ParticipantsTable.BindData.this;
                    }
                }, erpp.a) : elfo.e(bindData) : elfo.e(bindData);
            }
        }, this.d).i(new eroh() { // from class: ccac
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                ccjf ccjfVar = (ccjf) aVar.gx().get(3);
                ccjfVar.getClass();
                int i2 = i;
                if (ccah.this.h.a()) {
                    ensk h = ccah.b.h();
                    h.Y(ente.a, "BugleCms");
                    enrr enrrVar = (enrr) h;
                    enrrVar.Y(csux.O, "BackupSelfParticipantWorkItemProcessor");
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/BackupSelfParticipantWorkItemProcessor", "backupSelfParticipant", 236, "BackupSelfParticipantWorkItemProcessor.java")).t("Backing up SELF participant with: %s", ccue.b(i2));
                } else {
                    csjb c = ccah.a.c();
                    c.I("Backing up SELF participant");
                    c.A("participantId", bindData.S());
                    c.r();
                }
                return ccjfVar.d(String.valueOf(((cetk) ceuwVar.a()).e), bindData.S(), ccue.a(i2));
            }
        }, this.d);
    }
}
