package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccqp implements ccdx {
    public final csca b;
    public final cdve c;
    public final dtuu d;
    public final ffbr e;
    public final cqoh f;
    public final ccub g;
    private final asif i;
    private final axkm j;
    private final errl k;
    private final errl l;
    private final asio m;
    private final asim n;
    private static final cskc h = cskc.g("BugleCms", "CmsParticipantConsumer");
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer");

    public ccqp(cdve cdveVar, csca cscaVar, axkm axkmVar, asif asifVar, errl errlVar, errl errlVar2, dtuu dtuuVar, ffbr ffbrVar, cqoh cqohVar, asio asioVar, ccub ccubVar, asim asimVar) {
        this.c = cdveVar;
        this.b = cscaVar;
        this.i = asifVar;
        this.j = axkmVar;
        this.k = errlVar;
        this.l = errlVar2;
        this.d = dtuuVar;
        this.e = ffbrVar;
        this.f = cqohVar;
        this.m = asioVar;
        this.g = ccubVar;
        this.n = asimVar;
    }

    public static void h(ParticipantsTable.BindData bindData) {
        String L = bindData.L();
        if (TextUtils.isEmpty(L)) {
            throw new ccqm();
        }
        bvvr f = ParticipantsTable.f();
        f.ap("restoreCmsIdForDefaultSelfParticipant");
        f.V(new Function() { // from class: ccqc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.w(-1);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        f.g(L);
        int e = f.b().e();
        if (e == 1) {
            csjb c = h.c();
            c.I("Updated default self participant cms_id");
            c.A("Cms id", L);
            c.r();
            return;
        }
        csjb e2 = h.e();
        e2.I("Failed to update default self participant cms_id");
        e2.y("Number of updates", e);
        e2.r();
    }

    @Override // defpackage.ccdx
    public final elfl a(final engw engwVar, Optional optional, boolean z) {
        if (engwVar.isEmpty()) {
            return elfo.e(enoz.a);
        }
        final elfl g = elfo.g(new Callable() { // from class: ccqd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekzz f;
                enhk enhkVar;
                enhk b;
                boolean z2;
                ccqd ccqdVar = this;
                final enhd enhdVar = new enhd();
                enhd enhdVar2 = new enhd();
                final HashMap hashMap = new HashMap();
                enhd enhdVar3 = new enhd();
                engw engwVar2 = engwVar;
                int size = engwVar2.size();
                int i = 0;
                while (true) {
                    final ccqp ccqpVar = ccqp.this;
                    if (i >= size) {
                        final enhk b2 = enhdVar2.b();
                        final enhk b3 = enhdVar3.b();
                        enhk j = enhk.j(hashMap);
                        enhd enhdVar4 = new enhd();
                        if (j.isEmpty()) {
                            enhkVar = enoz.a;
                        } else {
                            final enip enipVar = (enip) Collection.EL.stream(j.keySet()).filter(new Predicate() { // from class: cdvf
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
                                    bvth[] bvthVarArr = cdvm.a;
                                    return !TextUtils.isEmpty((String) obj);
                                }
                            }).collect(endq.b);
                            if (enipVar.isEmpty()) {
                                enhkVar = enoz.a;
                            } else {
                                f = eleg.f("CmsParticipantBugleMergeHandler#findDupByCmsIds");
                                try {
                                    bvvn e = ParticipantsTable.e();
                                    e.z("findDupParticipantsByCmsIds");
                                    e.c(cdvm.a);
                                    e.h(new Function() { // from class: cdvg
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            bvvw bvvwVar = (bvvw) obj;
                                            bvth[] bvthVarArr = cdvm.a;
                                            bvvwVar.e(enip.this);
                                            return bvvwVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    enhkVar = (enhk) Collection.EL.stream(e.b().y()).filter(new Predicate() { // from class: cdvh
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
                                            bvth[] bvthVarArr = cdvm.a;
                                            return ((ParticipantsTable.BindData) obj).L() != null;
                                        }
                                    }).collect(endq.a(new Function() { // from class: cdvi
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            bvth[] bvthVarArr = cdvm.a;
                                            return emxe.b(((ParticipantsTable.BindData) obj).L());
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }, new Function() { // from class: cdvj
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                                            bvth[] bvthVarArr = cdvm.a;
                                            return bindData;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }));
                                    f.close();
                                } finally {
                                }
                            }
                        }
                        enhdVar4.g(enhkVar);
                        enhd enhdVar5 = new enhd();
                        enqu listIterator = j.entrySet().listIterator();
                        while (listIterator.hasNext()) {
                            Map.Entry entry = (Map.Entry) listIterator.next();
                            if (!enhkVar.containsKey(entry.getKey())) {
                                enhdVar5.i(entry);
                            }
                        }
                        enhk b4 = enhdVar5.b();
                        if (b4.keySet().isEmpty()) {
                            b = enoz.a;
                        } else {
                            f = eleg.f("CmsParticipantBugleMergeHandler#findDupsByDestinations");
                            try {
                                HashMap hashMap2 = new HashMap();
                                ArrayList arrayList = new ArrayList();
                                for (Map.Entry entry2 : b4.entrySet()) {
                                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) entry2.getValue();
                                    String U = bindData.U();
                                    int r = bindData.r();
                                    if (!TextUtils.isEmpty(U)) {
                                        String[] strArr = ParticipantsTable.a;
                                        bvvw bvvwVar = new bvvw();
                                        bvvwVar.r(U);
                                        bvvwVar.w(r);
                                        arrayList.add(bvvwVar);
                                        hashMap2.put(cdvm.b(bindData), (String) entry2.getKey());
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    b = enoz.a;
                                } else {
                                    String[] strArr2 = ParticipantsTable.a;
                                    bvvw bvvwVar2 = new bvvw();
                                    bvvwVar2.ar((bvvw[]) arrayList.toArray(new bvvw[0]));
                                    bvvn e2 = ParticipantsTable.e();
                                    e2.z("findDupParticipantsByDestinations");
                                    e2.c(cdvm.a);
                                    e2.g(bvvwVar2);
                                    engw y = e2.b().y();
                                    enhd enhdVar6 = new enhd();
                                    enqv it = y.iterator();
                                    while (it.hasNext()) {
                                        ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) it.next();
                                        String str = (String) hashMap2.get(cdvm.b(bindData2));
                                        if (!TextUtils.isEmpty(str)) {
                                            enhdVar6.k(str, bindData2);
                                        }
                                    }
                                    b = enhdVar6.b();
                                }
                                f.close();
                            } finally {
                            }
                        }
                        enhdVar4.g(b);
                        final enhk b5 = enhdVar4.b();
                        ccqpVar.d.b(new emyl() { // from class: ccpy
                            @Override // defpackage.emyl
                            public final Object get() {
                                ekzz ekzzVar;
                                ekzz f2 = eleg.f("CmsParticipantConsumer#overwriteWithCmsParticipantList");
                                enhk enhkVar2 = b3;
                                try {
                                    enqu listIterator2 = b5.entrySet().listIterator();
                                    while (true) {
                                        boolean hasNext = listIterator2.hasNext();
                                        enhd enhdVar7 = enhdVar;
                                        HashMap hashMap3 = hashMap;
                                        enhk enhkVar3 = b2;
                                        final ccqp ccqpVar2 = ccqp.this;
                                        if (hasNext) {
                                            Map.Entry entry3 = (Map.Entry) listIterator2.next();
                                            String str2 = (String) entry3.getKey();
                                            ParticipantsTable.BindData bindData3 = (ParticipantsTable.BindData) hashMap3.get(str2);
                                            ParticipantsTable.BindData bindData4 = (ParticipantsTable.BindData) entry3.getValue();
                                            etah etahVar = (etah) enhkVar3.get(str2);
                                            if (bindData3 == null || bindData4 == null) {
                                                ensk j2 = ccqp.a.j();
                                                j2.Y(ente.a, "BugleCms");
                                                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer", "overwriteWithCmsParticipantList", 375, "CmsParticipantConsumer.java")).t("Skip overwrite due to data missing for cmsId:%s", str2);
                                                hashMap3.remove(str2);
                                                if (etahVar != null) {
                                                    enhdVar7.k(etahVar, new IllegalStateException("Missing data."));
                                                }
                                            } else {
                                                try {
                                                    ccqpVar2.c.a(bindData3, bindData4);
                                                } catch (Throwable th) {
                                                    if (etahVar == null || !(th instanceof Exception)) {
                                                        throw th;
                                                    }
                                                    ensk j3 = ccqp.a.j();
                                                    j3.Y(ente.a, "BugleCms");
                                                    ((enrr) ((enrr) ((enrr) j3).g(th)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer", "overwriteWithCmsParticipantList", 388, "CmsParticipantConsumer.java")).t("Failed to overwrite. %s", bindData4.S());
                                                    enhdVar7.k(etahVar, th);
                                                }
                                                hashMap3.remove(str2);
                                            }
                                        } else {
                                            f2.close();
                                            ekzz f3 = eleg.f("CmsParticipantConsumer#insertCmsParticipantList");
                                            try {
                                                for (final Map.Entry entry4 : hashMap3.entrySet()) {
                                                    String str3 = (String) entry4.getKey();
                                                    final etah etahVar2 = (etah) enhkVar3.get(str3);
                                                    final csbz csbzVar = (csbz) enhkVar2.get(str3);
                                                    if (etahVar2 == null || csbzVar == null) {
                                                        ekzzVar = f3;
                                                        ensk j4 = ccqp.a.j();
                                                        j4.Y(ente.a, "BugleCms");
                                                        ((enrr) ((enrr) j4).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer", "insertCmsParticipantList", 413, "CmsParticipantConsumer.java")).t("Participant data missing for cmsId: %s", str3);
                                                    } else {
                                                        try {
                                                            ekzzVar = f3;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            ekzzVar = f3;
                                                        }
                                                        try {
                                                            ccqpVar2.d.d("CmsParticipantConsumer#restoreCmsItemData", new Runnable() { // from class: ccqb
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    ccqp.this.g(etahVar2, csbzVar, (ParticipantsTable.BindData) entry4.getValue());
                                                                }
                                                            });
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            try {
                                                                if (!(th instanceof Exception)) {
                                                                    throw th;
                                                                }
                                                                ensk j5 = ccqp.a.j();
                                                                j5.Y(ente.a, "BugleCms");
                                                                ((enrr) ((enrr) ((enrr) j5).g(th)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer", "insertCmsParticipantList", 424, "CmsParticipantConsumer.java")).t("Failed to insert %s", str3);
                                                                enhdVar7.k(etahVar2, th);
                                                                f3 = ekzzVar;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                Throwable th5 = th;
                                                                try {
                                                                    ekzzVar.close();
                                                                    throw th5;
                                                                } catch (Throwable th6) {
                                                                    th5.addSuppressed(th6);
                                                                    throw th5;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    f3 = ekzzVar;
                                                }
                                                f3.close();
                                                return null;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                ekzzVar = f3;
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        });
                        return enhdVar.b();
                    }
                    etah etahVar = (etah) engwVar2.get(i);
                    csce a2 = ccqpVar.b.a(etahVar);
                    ParticipantsTable.BindData b6 = a2.b();
                    if (a2.c && !TextUtils.isEmpty(b6.L())) {
                        ccub ccubVar = ccqpVar.g;
                        String L = b6.L();
                        L.getClass();
                        ccubVar.g(L);
                    }
                    try {
                        if (bdtd.m(b6)) {
                            ccqp.h(b6);
                        } else {
                            String str2 = etahVar.c;
                            if (TextUtils.isEmpty(str2)) {
                                ensk j2 = ccqp.a.j();
                                j2.Y(ente.a, "BugleCms");
                                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer", "fillUpParticipantMaps", 349, "CmsParticipantConsumer.java")).q("CMS participant does not have CMS Id.");
                                enhdVar.k(etahVar, new ccqm());
                            } else {
                                enhdVar2.k(str2, etahVar);
                                hashMap.put(str2, b6);
                                enhdVar3.k(str2, a2);
                            }
                        }
                    } finally {
                        if (z2) {
                            i++;
                            ccqdVar = this;
                        }
                    }
                    i++;
                    ccqdVar = this;
                }
            }
        }, this.k);
        elfl f = g.i(new eroh() { // from class: ccqe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ccqp.this.e(engwVar.size() - ((enhk) obj).size());
            }
        }, this.l).i(new eroh() { // from class: ccqf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return elfo.e((enhk) erqt.q(elfl.this));
            }
        }, this.l).f(Throwable.class, new eroh() { // from class: ccqg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Throwable th = (Throwable) obj;
                if (!(th instanceof Exception)) {
                    return elfo.d(th);
                }
                engw engwVar2 = engw.this;
                ensk j = ccqp.a.j();
                j.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer", "restoreCmsItemDataList", (char) 249, "CmsParticipantConsumer.java")).q("Failed to restore batch.");
                return elfo.e((enhk) Collection.EL.stream(engwVar2).collect(endq.a(Function$CC.identity(), new Function() { // from class: ccqa
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (Exception) th;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })));
            }
        }, this.l);
        return this.n.a() ? f.i(new eroh() { // from class: ccqh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final enhk enhkVar = (enhk) obj;
                return ccqp.this.g.c().h(new emwl() { // from class: ccpz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return enhk.this;
                    }
                }, erpp.a);
            }
        }, erpp.a) : f;
    }

    @Override // defpackage.ccdx
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    @Override // defpackage.ccdx
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ccdx
    public final /* bridge */ /* synthetic */ elfl d(Object obj) {
        return f((etah) obj, true);
    }

    public final elfl e(int i) {
        return (csgj.a() && this.i.a() && !this.m.a()) ? this.j.v(i) : elfo.e(null);
    }

    public final elfl f(final etah etahVar, final boolean z) {
        elfl i = elfo.g(new Callable() { // from class: ccqj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Optional ofNullable;
                final ccqp ccqpVar = ccqp.this;
                csca cscaVar = ccqpVar.b;
                final etah etahVar2 = etahVar;
                final csce a2 = cscaVar.a(etahVar2);
                final ParticipantsTable.BindData b = a2.b();
                if (a2.c && !TextUtils.isEmpty(b.L())) {
                    ccub ccubVar = ccqpVar.g;
                    String L = b.L();
                    L.getClass();
                    ccubVar.g(L);
                }
                if (bdtd.m(b)) {
                    ccqp.h(b);
                    return null;
                }
                cqoh cqohVar = ccqpVar.f;
                cdve cdveVar = ccqpVar.c;
                long a3 = cqohVar.a();
                String L2 = b.L();
                if (TextUtils.isEmpty(L2)) {
                    ofNullable = Optional.empty();
                } else {
                    ParticipantsTable.BindData a4 = ParticipantsTable.a(L2);
                    if (a4 != null) {
                        ((akzt) ((cdvm) cdveVar).b.b()).e("Bugle.Cms.Restore.Participant.Outcome", 3);
                    }
                    ofNullable = Optional.ofNullable(a4);
                }
                if (!ofNullable.isPresent()) {
                    final String U = b.U();
                    final int r = b.r();
                    if (U == null) {
                        ofNullable = Optional.empty();
                    } else {
                        bvvn e = ParticipantsTable.e();
                        e.z("findDuplicationWithSameDestinationAndSubId");
                        e.h(new Function() { // from class: cdvk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bvvw bvvwVar = (bvvw) obj;
                                bvth[] bvthVarArr = cdvm.a;
                                bvvwVar.r(U);
                                bvvwVar.w(r);
                                return bvvwVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bvti bvtiVar = (bvti) e.b().o();
                        try {
                            if (bvtiVar.moveToFirst()) {
                                ((akzt) ((cdvm) cdveVar).b.b()).e("Bugle.Cms.Restore.Participant.Outcome", 4);
                                Optional of = Optional.of((ParticipantsTable.BindData) bvtiVar.cO());
                                bvtiVar.close();
                                ofNullable = of;
                            } else {
                                bvtiVar.close();
                                ofNullable = Optional.empty();
                            }
                        } catch (Throwable th) {
                            try {
                                bvtiVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }
                if (!ofNullable.isPresent()) {
                    ((akzt) ccqpVar.e.b()).e("Bugle.Cms.Restore.Participant.Outcome", 5);
                    return ccqpVar.d.c("CmsParticipantConsumer#restoreCmsItemData", new emyl() { // from class: ccqi
                        @Override // defpackage.emyl
                        public final Object get() {
                            ccqp.this.g(etahVar2, a2, b);
                            return null;
                        }
                    });
                }
                ccqpVar.c.a(b, (ParticipantsTable.BindData) ofNullable.get());
                ((akzt) ccqpVar.e.b()).g("Bugle.Cms.Restore.Participant.DuplicateSearchDuration", ccqpVar.f.a() - a3);
                return null;
            }
        }, this.k).i(new eroh() { // from class: ccqk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return z ? ccqp.this.e(1) : elfo.e(null);
            }
        }, this.l);
        return this.n.a() ? i.i(new eroh() { // from class: ccql
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ccqp.this.g.c().h(new emwl() { // from class: ccpx
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, erpp.a);
            }
        }, erpp.a) : i;
    }

    public final void g(etah etahVar, csbz csbzVar, ParticipantsTable.BindData bindData) {
        String str = etahVar.c;
        try {
            long longValue = bindData.J().longValue();
            if (longValue < 0) {
                csjb e = h.e();
                e.I("Insert participant failed");
                e.A("cms_id", str);
                e.r();
                throw new ccqn();
            }
            btnb a2 = csbzVar.a();
            if (csbzVar.c() && !TextUtils.isEmpty(bindData.L())) {
                ccub ccubVar = this.g;
                String L = bindData.L();
                L.getClass();
                ccubVar.g(L);
            }
            if (a2.k() > 0) {
                btne btneVar = new btne();
                BitSet bitSet = a2.cJ;
                btneVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
                BitSet bitSet2 = btneVar.az;
                if (bitSet2 == null || bitSet2.get(0)) {
                    a2.az(0, "_id");
                    btneVar.a = a2.a;
                }
                BitSet bitSet3 = btneVar.az;
                if (bitSet3 == null || bitSet3.get(1)) {
                    a2.az(1, "participant_id");
                    btneVar.b = a2.b;
                }
                BitSet bitSet4 = btneVar.az;
                if (bitSet4 == null || bitSet4.get(2)) {
                    btneVar.c = a2.k();
                }
                btneVar.c(longValue);
                long longValue2 = btneVar.a().l().longValue();
                if (longValue2 < 0) {
                    csjb b = h.b();
                    b.I("Insert linkPreviewParticipantData failed with return value");
                    b.H(longValue2);
                    b.r();
                }
            }
        } catch (Throwable th) {
            if ((asvl.a() || csgj.a()) && (th instanceof Error)) {
                throw th;
            }
            csjb e2 = h.e();
            e2.I("Insert participant threw");
            e2.A("cms_id", str);
            e2.s(th);
            throw new ccqo(th);
        }
    }
}
