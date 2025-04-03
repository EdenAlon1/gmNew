package defpackage;

import android.content.Context;
import android.database.MatrixCursor;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccie {
    public static final cskc a = cskc.g("BugleCms", "CmsConversationConsumerDelegate");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate");
    public static final bskq[] c;
    public final crty d;
    public final crxa e;
    public final ccqp f;
    public final akzt g;
    public final errl h;
    public final errl i;
    public final ccij j;
    public final ffbr k;
    public final cefl l;
    public final ceeq m;
    public final dtuu n;
    public final axdf o;
    public final ccub p;
    public final asim q;
    public final aszu r;
    public final ffbr s;
    private final cdsi t;
    private final ccpw u;
    private final asif v;
    private final axkm w;
    private final cqoh x;
    private final asio y;

    static {
        bskp bskpVar = bsom.c;
        c = new bskq[]{bsom.c.a, bskpVar.c, bskpVar.Z, bskpVar.q, bskpVar.g, bskpVar.d, bskpVar.N, bskpVar.aa, bskpVar.al, bskpVar.r, bskpVar.as, bskpVar.aw};
    }

    public ccie(asim asimVar, crty crtyVar, cdsi cdsiVar, crxa crxaVar, ccqp ccqpVar, ccpw ccpwVar, axkm axkmVar, asif asifVar, akzt akztVar, ccij ccijVar, cefl ceflVar, errl errlVar, errl errlVar2, ffbr ffbrVar, ccub ccubVar, dtuu dtuuVar, cqoh cqohVar, ceeq ceeqVar, axdf axdfVar, asio asioVar, aszu aszuVar, ffbr ffbrVar2) {
        this.q = asimVar;
        this.d = crtyVar;
        this.t = cdsiVar;
        this.e = crxaVar;
        this.f = ccqpVar;
        this.u = ccpwVar;
        this.v = asifVar;
        this.w = axkmVar;
        this.g = akztVar;
        this.j = ccijVar;
        this.l = ceflVar;
        this.h = errlVar;
        this.i = errlVar2;
        this.k = ffbrVar;
        this.p = ccubVar;
        this.n = dtuuVar;
        this.x = cqohVar;
        this.m = ceeqVar;
        this.o = axdfVar;
        this.y = asioVar;
        this.r = aszuVar;
        this.s = ffbrVar2;
    }

    public static enhk e(Collection collection, Map map, csgg csggVar, final Map map2) {
        if (!collection.isEmpty()) {
            bskq[] bskqVarArr = {bsom.c.a, bsom.c.al};
            try {
                MatrixCursor matrixCursor = new MatrixCursor((String[]) DesugarArrays.stream(bskqVarArr).map(new Function() { // from class: ccha
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cskc cskcVar = ccie.a;
                        String d = ((bskq) obj).d();
                        d.getClass();
                        return d;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).toArray(new IntFunction() { // from class: cchb
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        cskc cskcVar = ccie.a;
                        return new String[i];
                    }
                }));
                try {
                    final ArrayList arrayList = new ArrayList();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        bseh bsehVar = (bseh) map.get((String) it.next());
                        if (bsehVar != null) {
                            ConversationIdType C = bsehVar.C();
                            matrixCursor.addRow(new Object[]{Long.valueOf(C.a), Integer.valueOf(csggVar.ordinal())});
                            arrayList.add(C);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        enhk enhkVar = enoz.a;
                        matrixCursor.close();
                        return enhkVar;
                    }
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.ap("CmsConversationConsumerDelegate-update");
                    bsoeVar.ad(new Function() { // from class: cchc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            cskc cskcVar = ccie.a;
                            bsolVar.t(arrayList);
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    Stream skip = DesugarArrays.stream(bskqVarArr).skip(1L);
                    int i = engw.d;
                    engw engwVar = (engw) skip.collect(endq.a);
                    Context context = dtub.b;
                    bsoeVar.ao(engwVar, matrixCursor, new dtzq("$R = $V", new Object[]{"_I._id", bsom.c.a}));
                    bsoeVar.b().t(5);
                    matrixCursor.close();
                } finally {
                }
            } catch (RuntimeException e) {
                return (enhk) Collection.EL.stream(collection).collect(endq.a(new Function() { // from class: cchd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cskc cskcVar = ccie.a;
                        emxd emxdVar = (emxd) map2.get((String) obj);
                        emxdVar.getClass();
                        return (eswr) emxdVar.a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: cche
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cskc cskcVar = ccie.a;
                        return e;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
            }
        }
        return enoz.a;
    }

    public final elfl a(final eswr eswrVar, final boolean z) {
        elfl h = elfo.h(new erog() { // from class: ccib
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final ccie ccieVar = ccie.this;
                crxa crxaVar = ccieVar.e;
                final eswr eswrVar2 = eswrVar;
                final crxn a2 = crxaVar.a(eswrVar2);
                enip d = a2.d();
                boolean isEmpty = d.isEmpty();
                final boolean z2 = z;
                if (isEmpty) {
                    return ccieVar.d(a2, eswrVar2, z2);
                }
                csjb c2 = ccie.a.c();
                c2.I("Encountered unknown cms_ids in participants list for conversation.");
                c2.b(bdgq.b(eswrVar2.c).a);
                c2.y("missingParticipantCount", d.size());
                c2.r();
                return ccieVar.d.e(d.g()).i(new eroh() { // from class: cchf
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final ccie ccieVar2;
                        enhk enhkVar = (enhk) obj;
                        enqu listIterator = enhkVar.entrySet().listIterator();
                        boolean z3 = true;
                        while (true) {
                            ccieVar2 = ccie.this;
                            if (!listIterator.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) listIterator.next();
                            if (((Optional) entry.getValue()).isPresent()) {
                                ccieVar2.g.e("Bugle.Cms.Restore.RestoreParticipantFromConversationConsumer", 1);
                            } else {
                                csjb e = ccie.a.e();
                                e.I("Could not find participant for conversation");
                                e.A("participantId", entry.getKey());
                                e.r();
                                ccieVar2.g.e("Bugle.Cms.Restore.RestoreParticipantFromConversationConsumer", 2);
                                z3 = false;
                            }
                        }
                        if (!z3) {
                            throw new ccic();
                        }
                        final boolean z4 = z2;
                        Stream map = Collection.EL.stream(enhkVar.values()).flatMap(new Function() { // from class: ccgj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((Optional) obj2).stream();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).map(new Function() { // from class: ccgk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ccie.this.f.f((etah) obj2, z4);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = engw.d;
                        return elfo.l((Iterable) map.collect(endq.a)).a(new Callable() { // from class: ccgm
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cskc cskcVar = ccie.a;
                                return null;
                            }
                        }, ccieVar2.h).f(Exception.class, new eroh() { // from class: ccgn
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                Exception exc = (Exception) obj2;
                                ccie.this.g.e("Bugle.Cms.Restore.RestoreParticipantFromConversationConsumer", 2);
                                throw exc;
                            }
                        }, ccieVar2.i);
                    }
                }, ccieVar.h).e(crtw.class, new emwl() { // from class: cchg
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ccie.a.s("Exception when looking up CMS participants", (crtw) obj);
                        throw new ccic();
                    }
                }, ccieVar.h).i(new eroh() { // from class: ccgb
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ccie.this.d(a2, eswrVar2, z2);
                    }
                }, ccieVar.h);
            }
        }, this.h);
        return this.q.a() ? h.i(new eroh() { // from class: ccff
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ccie.this.p.a().h(new emwl() { // from class: ccgz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cskc cskcVar = ccie.a;
                        return null;
                    }
                }, erpp.a);
            }
        }, erpp.a) : h;
    }

    public final elfl b(final engw engwVar, final Optional optional) {
        if (engwVar.isEmpty()) {
            return elfo.e(enoz.a);
        }
        elfl f = elfo.h(new erog() { // from class: ccfx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final ccie ccieVar;
                elfl e;
                final HashMap hashMap = new HashMap();
                final enhd enhdVar = new enhd();
                enin eninVar = new enin();
                enhv enhvVar = new enhv();
                final engw engwVar2 = engwVar;
                int size = engwVar2.size();
                int i = 0;
                while (true) {
                    ccieVar = ccie.this;
                    if (i >= size) {
                        break;
                    }
                    eswr eswrVar = (eswr) engwVar2.get(i);
                    String str = eswrVar.c;
                    try {
                        crxn a2 = ccieVar.e.a(eswrVar);
                        enip d = a2.d();
                        eninVar.j(d);
                        enqu listIterator = d.listIterator();
                        while (listIterator.hasNext()) {
                            enhvVar.h((String) listIterator.next(), eswrVar);
                        }
                        hashMap.put(str, new emxd(eswrVar, a2));
                    } catch (RuntimeException e2) {
                        ensk j = ccie.b.j();
                        j.Y(ente.a, "BugleCms");
                        ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "prepareForConversationRestore", 959, "CmsConversationConsumerDelegate.java")).t("Failed to prepare a conversation to restore %s.", str);
                        enhdVar.k(eswrVar, e2);
                    }
                    i++;
                }
                final enhz f2 = enhvVar.f();
                final engw g = eninVar.g().g();
                elfl e3 = elfo.e(null);
                if (!g.isEmpty()) {
                    if (g.isEmpty()) {
                        e = elfo.e(enoz.a);
                    } else {
                        final Optional optional2 = optional;
                        e = ccieVar.d.e(g).i(new eroh() { // from class: ccgc
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                enhk enhkVar = (enhk) obj;
                                final enhd enhdVar2 = new enhd();
                                enqu listIterator2 = enhkVar.entrySet().listIterator();
                                while (listIterator2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) listIterator2.next();
                                    if (((Optional) entry.getValue()).isEmpty()) {
                                        ensk h = ccie.b.h();
                                        h.Y(ente.a, "BugleCms");
                                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "fetchMissingParticipantsFromCmsForBatch", 1129, "CmsConversationConsumerDelegate.java")).t("Could not find participant:%s for conversation restore.", entry.getKey());
                                        enhdVar2.k((String) entry.getKey(), new ccic());
                                    }
                                }
                                Optional optional3 = optional2;
                                engw engwVar3 = g;
                                final ccie ccieVar2 = ccie.this;
                                Stream map = Collection.EL.stream(enhkVar.values()).filter(new Predicate() { // from class: ccge
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
                                    public final boolean test(Object obj2) {
                                        return ((Optional) obj2).isPresent();
                                    }
                                }).map(new Function() { // from class: ccgf
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return (etah) ((Optional) obj2).get();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i2 = engw.d;
                                engw engwVar4 = (engw) map.collect(endq.a);
                                final int size2 = engwVar3.size();
                                return ccieVar2.f.a(engwVar4, optional3, false).h(new emwl() { // from class: ccgg
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        enhk enhkVar2 = (enhk) obj2;
                                        boolean isEmpty = enhkVar2.isEmpty();
                                        final ccie ccieVar3 = ccie.this;
                                        if (!isEmpty) {
                                            Collection.EL.stream(enhkVar2.entrySet()).limit(5L).forEach(new Consumer() { // from class: cchv
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void o(Object obj3) {
                                                    Map.Entry entry2 = (Map.Entry) obj3;
                                                    ccie.this.o.w(4, false, 0, (Throwable) entry2.getValue(), 0, ((etah) entry2.getKey()).c);
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                            throw new csgt(12, csgx.RETRY);
                                        }
                                        enhk b2 = enhdVar2.b();
                                        if (!b2.isEmpty()) {
                                            ccieVar3.g.f("Bugle.Cms.Restore.RestoreParticipantFromConversationConsumer", 2, ((enoz) b2).d);
                                        }
                                        if (size2 > ((enoz) b2).d) {
                                            ccieVar3.g.f("Bugle.Cms.Restore.RestoreParticipantFromConversationConsumer", 1, r0 - r3);
                                        }
                                        return b2;
                                    }
                                }, ccieVar2.i);
                            }
                        }, ccieVar.h).e(crtw.class, new emwl() { // from class: ccgd
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                ensk j2 = ccie.b.j();
                                j2.Y(ente.a, "BugleCms");
                                ((enrr) ((enrr) ((enrr) j2).g((crtw) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "fetchMissingParticipantsFromCmsForBatch", 1192, "CmsConversationConsumerDelegate.java")).q("Exception when looking up CMS participants");
                                throw new ccic();
                            }
                        }, ccieVar.i);
                    }
                    e3 = e.h(new emwl() { // from class: cchq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            cskc cskcVar = ccie.a;
                            enqu listIterator2 = ((enhk) obj).entrySet().listIterator();
                            while (listIterator2.hasNext()) {
                                enhz enhzVar = enhz.this;
                                Map.Entry entry = (Map.Entry) listIterator2.next();
                                enqu listIterator3 = enhzVar.c((String) entry.getKey()).listIterator();
                                while (listIterator3.hasNext()) {
                                    Map map = hashMap;
                                    enhd enhdVar2 = enhdVar;
                                    eswr eswrVar2 = (eswr) listIterator3.next();
                                    enhdVar2.k(eswrVar2, (Exception) entry.getValue());
                                    map.remove(eswrVar2.c);
                                }
                            }
                            return null;
                        }
                    }, ccieVar.i);
                }
                final elfl h = e3.h(new emwl() { // from class: cchw
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        final ccie ccieVar2 = ccie.this;
                        boolean a3 = ((ersq) ((asyv) ccieVar2.r).a.b()).a("bugle.enable_batch_conversation_restore");
                        final HashMap hashMap2 = hashMap;
                        final enhd enhdVar2 = enhdVar;
                        if (!a3) {
                            return (enhk) ccieVar2.n.b(new emyl() { // from class: ccgh
                                @Override // defpackage.emyl
                                public final Object get() {
                                    String str2;
                                    ConversationIdType a4;
                                    enhd enhdVar3 = new enhd();
                                    HashMap hashMap3 = hashMap2;
                                    Iterator it = hashMap3.entrySet().iterator();
                                    while (true) {
                                        enhd enhdVar4 = enhdVar2;
                                        ccie ccieVar3 = ccie.this;
                                        if (!it.hasNext()) {
                                            final enhk c2 = enhdVar3.c();
                                            cefl ceflVar = ccieVar3.l;
                                            Stream map = Collection.EL.stream(hashMap3.entrySet()).filter(new Predicate() { // from class: ccgp
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
                                                public final boolean test(Object obj2) {
                                                    Map.Entry entry = (Map.Entry) obj2;
                                                    cskc cskcVar = ccie.a;
                                                    return enhk.this.containsKey(entry.getKey()) && ((emxd) entry.getValue()).b != null;
                                                }
                                            }).map(new Function() { // from class: ccgq
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj2) {
                                                    Map.Entry entry = (Map.Entry) obj2;
                                                    cskc cskcVar = ccie.a;
                                                    String str3 = (String) entry.getKey();
                                                    crwz crwzVar = (crwz) ((emxd) entry.getValue()).b;
                                                    ConversationIdType conversationIdType = (ConversationIdType) enhk.this.get(str3);
                                                    conversationIdType.getClass();
                                                    return new cefk(conversationIdType.a(), str3, crwzVar.e());
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            });
                                            int i2 = engw.d;
                                            ceflVar.a((List) map.collect(endq.a), 3);
                                            return enhdVar4.b();
                                        }
                                        Map.Entry entry = (Map.Entry) it.next();
                                        String str3 = (String) entry.getKey();
                                        try {
                                            crwz crwzVar = (crwz) ((emxd) entry.getValue()).b;
                                            ceeq ceeqVar = ccieVar3.m;
                                            crwzVar.getClass();
                                            str3.getClass();
                                            bsel F = crwzVar.a().F();
                                            F.as(new cpxu());
                                            bseh a5 = F.a();
                                            if (a5.k() == 2) {
                                                a5.getClass();
                                                bsel F2 = a5.F();
                                                F2.ak(ceeqVar.f.a(a5, a5.R()));
                                                bseh a6 = F2.a();
                                                ckjy w = ckjz.w();
                                                a6.getClass();
                                                ceeq.k(w, a6);
                                                engw c3 = crwzVar.c();
                                                c3.getClass();
                                                ArrayList arrayList = new ArrayList(ffdx.n(c3, 10));
                                                Iterator<E> it2 = c3.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList.add(Long.valueOf(((bscj) it2.next()).k()));
                                                }
                                                final ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
                                                Iterator it3 = arrayList.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList2.add(String.valueOf(((Number) it3.next()).longValue()));
                                                }
                                                bvvn e4 = ParticipantsTable.e();
                                                e4.z("CmsConversationRestoreBcmProxy#loadParticipants");
                                                e4.h(new Function() { // from class: ceef
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj2) {
                                                        bvvw bvvwVar = (bvvw) obj2;
                                                        bvvwVar.m(arrayList2);
                                                        return bvvwVar;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                w.r(e4.b().y());
                                                ((ckhq) w).e = 3;
                                                a4 = ceeqVar.b(w, crwzVar, a6, false);
                                                str2 = str3;
                                            } else {
                                                a5.getClass();
                                                long a7 = ceeqVar.j.a();
                                                Optional r = ceeqVar.b.r(ceeqVar.c(crwzVar));
                                                eshh eshhVar = eshh.a;
                                                r.getClass();
                                                eshhVar.getClass();
                                                a4 = ceeqVar.a(r, a5, eshhVar, a7, crwzVar, str3, false);
                                                str2 = str3;
                                            }
                                            try {
                                                if (ccieVar3.q.a() && crwzVar.f()) {
                                                    ccieVar3.p.e(str2);
                                                }
                                                enhdVar3.k(str2, a4);
                                            } catch (RuntimeException e5) {
                                                e = e5;
                                                enhdVar4.k((eswr) ((emxd) entry.getValue()).a, e);
                                                ensk j2 = ccie.b.j();
                                                j2.Y(ente.a, "BugleCms");
                                                ((enrr) ((enrr) ((enrr) j2).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "runConversationRestoreUsingBcm", 886, "CmsConversationConsumerDelegate.java")).t("Restore conversation failed for cmsId:%s", str2);
                                            }
                                        } catch (RuntimeException e6) {
                                            e = e6;
                                            str2 = str3;
                                        }
                                    }
                                }
                            });
                        }
                        final enhk enhkVar = (enhk) Collection.EL.stream(hashMap2.entrySet()).collect(endq.a(new ccfp(), new Function() { // from class: ccga
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                crwz crwzVar = (crwz) ((emxd) ((Map.Entry) obj2).getValue()).b;
                                crwzVar.getClass();
                                bseh a4 = crwzVar.a();
                                ccie ccieVar3 = ccie.this;
                                if (ccieVar3.q.a() && crwzVar.f()) {
                                    ccub ccubVar = ccieVar3.p;
                                    String R = a4.R();
                                    R.getClass();
                                    ccubVar.e(R);
                                }
                                return a4;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }));
                        return (enhk) ccieVar2.n.c("runBatchedConversationRestore", new emyl() { // from class: ccgo
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:80:0x0482  */
                            /* JADX WARN: Removed duplicated region for block: B:84:0x06c1 A[LOOP:3: B:82:0x06bb->B:84:0x06c1, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:89:0x0488 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Type inference failed for: r19v10 */
                            /* JADX WARN: Type inference failed for: r19v14 */
                            /* JADX WARN: Type inference failed for: r19v15 */
                            /* JADX WARN: Type inference failed for: r19v16 */
                            /* JADX WARN: Type inference failed for: r19v17 */
                            /* JADX WARN: Type inference failed for: r19v18 */
                            /* JADX WARN: Type inference failed for: r19v5 */
                            /* JADX WARN: Type inference failed for: r19v6 */
                            /* JADX WARN: Type inference failed for: r19v7 */
                            /* JADX WARN: Type inference failed for: r19v8 */
                            /* JADX WARN: Type inference failed for: r19v9 */
                            @Override // defpackage.emyl
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object get() {
                                /*
                                    Method dump skipped, instructions count: 1769
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.ccgo.get():java.lang.Object");
                            }
                        });
                    }
                }, ccieVar.h);
                return h.i(new eroh() { // from class: cchx
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return ccie.this.c(engwVar2.size() - ((enhk) obj).size());
                    }
                }, ccieVar.i).i(new eroh() { // from class: cchy
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        cskc cskcVar = ccie.a;
                        return elfo.e((enhk) erqt.q(elfl.this));
                    }
                }, ccieVar.i);
            }
        }, this.h).f(Exception.class, new eroh() { // from class: ccfy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ensk j = ccie.b.j();
                j.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) ((enrr) j).g((Exception) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "executeRestoreCmsItemDataList", 300, "CmsConversationConsumerDelegate.java")).q("Conversation restore failed as a batch.");
                ensk h = ccie.b.h();
                h.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "executeRestoreCmsItemDataList", 302, "CmsConversationConsumerDelegate.java")).q("Conversation restore falling back to one-by-one.");
                final enhd enhdVar = new enhd();
                engw engwVar2 = engwVar;
                elfl e = elfo.e(null);
                int size = engwVar2.size();
                for (int i = 0; i < size; i++) {
                    final ccie ccieVar = ccie.this;
                    final eswr eswrVar = (eswr) engwVar2.get(i);
                    e = e.i(new eroh() { // from class: cchr
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return ccie.this.a(eswrVar, true);
                        }
                    }, ccieVar.i).e(Exception.class, new emwl() { // from class: ccht
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            Exception exc = (Exception) obj2;
                            ensk j2 = ccie.b.j();
                            j2.Y(ente.a, "BugleCms");
                            enrr enrrVar = (enrr) ((enrr) ((enrr) j2).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumerDelegate", "fallbackToOneByOneRestore", 924, "CmsConversationConsumerDelegate.java");
                            eswr eswrVar2 = eswr.this;
                            enrrVar.t("A conversation restore failed. Id:%s", eswrVar2.c);
                            enhdVar.k(eswrVar2, exc);
                            return null;
                        }
                    }, ccieVar.i);
                }
                return e.h(new emwl() { // from class: cchu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cskc cskcVar = ccie.a;
                        return enhd.this.b();
                    }
                }, erpp.a);
            }
        }, this.i);
        return this.q.a() ? f.i(new eroh() { // from class: ccfz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final enhk enhkVar = (enhk) obj;
                return ccie.this.p.a().h(new emwl() { // from class: cchh
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cskc cskcVar = ccie.a;
                        return enhk.this;
                    }
                }, erpp.a);
            }
        }, erpp.a) : f;
    }

    public final elfl c(int i) {
        return (csgj.a() && this.v.a() && !this.y.a()) ? this.w.t(i) : elfo.e(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [aoku, java.lang.Object] */
    public final elfl d(final crwz crwzVar, final eswr eswrVar, final boolean z) {
        elfl c2;
        long a2;
        Optional ofNullable;
        engw engwVar;
        asim asimVar = this.q;
        final bseh a3 = crwzVar.a();
        if (asimVar.a() && ((crxn) crwzVar).g && !TextUtils.isEmpty(a3.R())) {
            this.p.e(a3.R());
        }
        if (((Boolean) ayhv.a.e()).booleanValue()) {
            ceeq ceeqVar = this.m;
            String str = eswrVar.c;
            str.getClass();
            c2 = axol.c(ceeqVar.g, ffhe.a, ffsm.a, new ceen(z, crwzVar, ceeqVar, str, null));
            return c2.i(new eroh() { // from class: cchs
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return z ? ccie.this.c(1) : elfo.e(null);
                }
            }, this.i);
        }
        if (a3.k() == 2) {
            String str2 = ((crxm) ((crxn) crwzVar).f).get().k;
            if (true == TextUtils.isEmpty(str2)) {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                throw new ccid();
            }
            ccpw ccpwVar = this.u;
            if (a3.k() != 2) {
                throw new ccpu();
            }
            String a4 = ccpwVar.f.a(a3, a3.R());
            if (a4 != null) {
                engwVar = engw.r(ccpwVar.d.a(a4, str2, a3.X()));
            } else {
                ensz enszVar = (ensz) ccpw.a.j();
                enszVar.Y(cdii.h, a3.R());
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantAndConversationToTelephonyPersister", "createParticipantsForRcsGroupConversation", 149, "CmsParticipantAndConversationToTelephonyPersister.java")).q("Cannot get MSISDN when creating fake participants name for Rcs group conversation");
                int i = engw.d;
                engwVar = enou.a;
            }
            a2 = ccpwVar.a(engwVar, a3);
        } else {
            ccpw ccpwVar2 = this.u;
            int i2 = engw.d;
            engw engwVar2 = enou.a;
            engw c3 = crwzVar.c();
            if (a3.k() == 2) {
                throw new ccpv();
            }
            ArrayList arrayList = new ArrayList();
            int size = c3.size();
            for (int i3 = 0; i3 < size; i3++) {
                long k = ((bscj) c3.get(i3)).k();
                ParticipantsTable.BindData b2 = ((bdrr) ccpwVar2.b.b()).b(String.valueOf(k));
                if (b2 == null) {
                    throw new ceft(String.format(Locale.US, "Restore for participant %d failed", Long.valueOf(k)));
                }
                Optional of = Optional.of(ccpwVar2.e.q(b2));
                of.isPresent();
                String o = ((aoks) of.get()).o();
                of.isPresent();
                if (of.get().E()) {
                    throw new cefs(String.format(Locale.US, "Normalized destination for participant %d is not restored properly", Long.valueOf(k)));
                }
                arrayList.add(o);
            }
            a2 = ccpwVar2.a(engw.n(arrayList), a3);
        }
        bsel F = a3.F();
        F.as(cpxu.b(a2));
        ccpw ccpwVar3 = this.u;
        final bseh a5 = F.a();
        ccpwVar3.c.S(a2, a5.G().d());
        final eshh e = csgj.a() ? crwzVar.e() : eshh.a;
        cqoh cqohVar = this.x;
        cdsi cdsiVar = this.t;
        long a6 = cqohVar.a();
        String R = a5.R();
        if (R == null) {
            ofNullable = Optional.empty();
        } else {
            bseh a7 = bsom.a(R);
            if (a7 != null) {
                ((akzt) ((cdsl) cdsiVar).a.b()).e("Bugle.Cms.Restore.Conversation.Outcome", 3);
            }
            ofNullable = Optional.ofNullable(a7);
        }
        if (!ofNullable.isPresent()) {
            final cpxu M = a5.M();
            if (M.d()) {
                ofNullable = Optional.empty();
            } else {
                bsob e2 = bsom.e();
                e2.z("findDuplicationWithSameThreadId");
                e2.i(new Function() { // from class: cdsj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        bsolVar.K(cpxu.this);
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bskr bskrVar = (bskr) e2.b().o();
                try {
                    if (bskrVar.moveToFirst()) {
                        ((akzt) ((cdsl) cdsiVar).a.b()).e("Bugle.Cms.Restore.Conversation.Outcome", 4);
                        Optional of2 = Optional.of((bseh) bskrVar.cO());
                        bskrVar.close();
                        ofNullable = of2;
                    } else {
                        bskrVar.close();
                        ofNullable = Optional.empty();
                    }
                } finally {
                }
            }
        }
        if (!ofNullable.isPresent()) {
            this.g.e("Bugle.Cms.Restore.Conversation.Outcome", 5);
            return elfo.e((ConversationIdType) this.n.c("CmsConversationConsumer#restoreCmsItemData", new emyl() { // from class: cchz
                @Override // defpackage.emyl
                public final Object get() {
                    bseh bsehVar = a5;
                    eswr eswrVar2 = eswrVar;
                    ConversationIdType a8 = ccij.a(bsehVar, eswrVar2.c);
                    ccij.d(crwzVar, a8);
                    ccie ccieVar = ccie.this;
                    if (csgj.a()) {
                        ccieVar.l.b(e, a8.toString(), eswrVar2.c, 3);
                    }
                    ccieVar.j.c(a8, a3);
                    return a8;
                }
            })).h(new emwl() { // from class: ccia
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cskc cskcVar = ccie.a;
                    ccij.b((ConversationIdType) obj);
                    return null;
                }
            }, this.h);
        }
        ConversationIdType C = ((bseh) ofNullable.get()).C();
        this.t.a(a5, e, C);
        this.j.c(C, a3);
        this.g.g("Bugle.Cms.Restore.Conversation.DuplicateSearchDuration", this.x.a() - a6);
        return elfo.e(null);
    }
}
