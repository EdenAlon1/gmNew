package defpackage;

import android.database.MatrixCursor;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdvd implements cdsq {
    public static final cskc a = cskc.g("BugleCms", "CmsMessageBugleMergeHandlerImpl");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/mergehandlers/CmsMessageBugleMergeHandlerImpl");
    public static final String[] c = {MessagesTable.c.M.d(), MessagesTable.c.j.d(), MessagesTable.c.n.d(), MessagesTable.c.m.d(), MessagesTable.c.k.d(), MessagesTable.c.B.d(), MessagesTable.c.D.d(), MessagesTable.c.L.d(), MessagesTable.c.N.d(), MessagesTable.c.W.d(), MessagesTable.c.G.d(), MessagesTable.c.C.d(), MessagesTable.c.ad.d()};
    public static final String[] d = {MessagesTable.c.M.d(), MessagesTable.c.j.d(), MessagesTable.c.n.d(), MessagesTable.c.m.d(), MessagesTable.c.k.d(), MessagesTable.c.B.d(), MessagesTable.c.D.d(), MessagesTable.c.L.d(), MessagesTable.c.N.d(), MessagesTable.c.W.d(), MessagesTable.c.G.d(), MessagesTable.c.C.d(), MessagesTable.c.ad.d(), MessagesTable.c.ap.d()};
    public static final String[] e = {"x.".concat(String.valueOf(MessagesTable.c.M.d())), "x.".concat(String.valueOf(MessagesTable.c.j.d())), "x.".concat(String.valueOf(MessagesTable.c.n.d())), "x.".concat(String.valueOf(MessagesTable.c.m.d())), "x.".concat(String.valueOf(MessagesTable.c.k.d())), "x.".concat(String.valueOf(MessagesTable.c.B.d())), "x.".concat(String.valueOf(MessagesTable.c.D.d())), "x.".concat(String.valueOf(MessagesTable.c.L.d())), "x.".concat(String.valueOf(MessagesTable.c.N.d())), "x.".concat(String.valueOf(MessagesTable.c.W.d())), "x.".concat(String.valueOf(MessagesTable.c.G.d())), "x.".concat(String.valueOf(MessagesTable.c.C.d())), "x.".concat(String.valueOf(MessagesTable.c.ad.d()))};
    public static final String[] f = {"x.".concat(String.valueOf(MessagesTable.c.M.d())), "x.".concat(String.valueOf(MessagesTable.c.j.d())), "x.".concat(String.valueOf(MessagesTable.c.n.d())), "x.".concat(String.valueOf(MessagesTable.c.m.d())), "x.".concat(String.valueOf(MessagesTable.c.k.d())), "x.".concat(String.valueOf(MessagesTable.c.B.d())), "x.".concat(String.valueOf(MessagesTable.c.D.d())), "x.".concat(String.valueOf(MessagesTable.c.L.d())), "x.".concat(String.valueOf(MessagesTable.c.N.d())), "x.".concat(String.valueOf(MessagesTable.c.W.d())), "x.".concat(String.valueOf(MessagesTable.c.G.d())), "x.".concat(String.valueOf(MessagesTable.c.C.d())), "x.".concat(String.valueOf(MessagesTable.c.ad.d())), "x.".concat(String.valueOf(MessagesTable.c.ap.d()))};
    public static final buun[] g;
    private static final buun[] m;
    public final Optional h;
    public final ffbr i;
    public final aslf j;
    public final ashx k;
    public final asjo l;
    private final ffbr n;
    private final errl o;
    private final cefl p;
    private final Optional q;
    private final eisx r;
    private final ashs s;
    private final ashm t;
    private final ashn u;

    static {
        buum buumVar = MessagesTable.c;
        buun buunVar = buumVar.a;
        buun buunVar2 = buumVar.M;
        buun buunVar3 = buumVar.j;
        buun buunVar4 = buumVar.n;
        buun buunVar5 = buumVar.m;
        buun buunVar6 = buumVar.k;
        buun buunVar7 = buumVar.B;
        buun buunVar8 = buumVar.D;
        buun buunVar9 = buumVar.L;
        buun buunVar10 = buumVar.N;
        buun buunVar11 = buumVar.W;
        buun buunVar12 = buumVar.G;
        buun buunVar13 = buumVar.C;
        buun buunVar14 = buumVar.ad;
        buun buunVar15 = buumVar.b;
        buun buunVar16 = buumVar.i;
        m = new buun[]{buunVar, buunVar2, buunVar3, buunVar4, buunVar5, buunVar6, buunVar7, buunVar8, buunVar9, buunVar10, buunVar11, buunVar10, buunVar12, buunVar13, buunVar14, buunVar15, buunVar16};
        g = new buun[]{buunVar, buunVar2, buunVar3, buunVar4, buunVar5, buunVar6, buunVar7, buunVar8, buunVar9, buunVar10, buunVar11, buunVar10, buunVar12, buunVar13, buunVar14, buunVar15, buunVar16, buumVar.ap};
    }

    public cdvd(ffbr ffbrVar, errl errlVar, cefl ceflVar, Optional optional, Optional optional2, eisx eisxVar, ashs ashsVar, ffbr ffbrVar2, ashm ashmVar, ashn ashnVar, aslf aslfVar, ashx ashxVar, asjo asjoVar) {
        this.n = ffbrVar;
        this.o = errlVar;
        this.p = ceflVar;
        this.q = optional;
        this.h = optional2;
        this.r = eisxVar;
        this.s = ashsVar;
        this.i = ffbrVar2;
        this.t = ashmVar;
        this.u = ashnVar;
        this.j = aslfVar;
        this.k = ashxVar;
        this.l = asjoVar;
    }

    public static int e(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static enhk f(Map map) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            MessagesTable.BindData bindData = (MessagesTable.BindData) entry.getValue();
            String T = bindData.T();
            if (TextUtils.isEmpty(T)) {
                ensk j = b.j();
                j.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/mergehandlers/CmsMessageBugleMergeHandlerImpl", "findDuplicateForMmsPushNotification", 2131, "CmsMessageBugleMergeHandlerImpl.java")).t("Restoring a MMS_PUSH_NOTIFICATION with no mms_content_location. cms_id = %s", entry.getKey());
            } else {
                String[] strArr = MessagesTable.a;
                buxz buxzVar = new buxz();
                buxzVar.m(bindData.C());
                buxzVar.aq(new dtrt("messages.mms_content_location", 1, String.valueOf(T)));
                arrayList.add(buxzVar);
                hashMap.put(T, (String) entry.getKey());
            }
        }
        if (arrayList.isEmpty()) {
            ensk j2 = b.j();
            j2.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/mergehandlers/CmsMessageBugleMergeHandlerImpl", "findDuplicateForMmsPushNotification", 2147, "CmsMessageBugleMergeHandlerImpl.java")).r("There is no CMS messages to dedup, requested size = %s", map.size());
            return enoz.a;
        }
        String[] strArr2 = MessagesTable.a;
        buxz buxzVar2 = new buxz();
        buxzVar2.j(csgg.w);
        buxzVar2.ar((buxz[]) arrayList.toArray(new buxz[0]));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(((Boolean) ((cfup) csgj.W.get()).e()).booleanValue() ? g : m));
        arrayList2.add(MessagesTable.c.t);
        buxo d2 = MessagesTable.d();
        d2.z("findDuplicateForMmsPushNotification");
        d2.c((buun[]) arrayList2.toArray(new buun[0]));
        d2.k(new buxs(buxzVar2));
        engw y = d2.b().y();
        enhd enhdVar = new enhd();
        int i = ((enou) y).c;
        for (int i2 = 0; i2 < i; i2++) {
            MessagesTable.BindData bindData2 = (MessagesTable.BindData) y.get(i2);
            String str = (String) hashMap.get(bindData2.T());
            str.getClass();
            enhdVar.k(str, bindData2);
        }
        return enhdVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Optional g(engw engwVar) {
        Stream filter = Collection.EL.stream(engwVar).filter(new Predicate() { // from class: cdtg
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
                cskc cskcVar = cdvd.a;
                return !TextUtils.isEmpty(((PartsTable.BindData) obj).K());
            }
        });
        int i = engw.d;
        engw engwVar2 = (engw) filter.collect(endq.a);
        return engwVar2.isEmpty() ? Optional.empty() : Optional.of((PartsTable.BindData) engwVar2.get(0));
    }

    public static String h(MessagesTable.BindData bindData) {
        return bindData.w() + "_" + bindData.C().a + "_" + bindData.s();
    }

    public static Function i(final MessagesTable.BindData bindData) {
        return bindData.l() != 0 ? new Function() { // from class: cdub
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                cskc cskcVar = cdvd.a;
                final MessagesTable.BindData bindData2 = MessagesTable.BindData.this;
                buxzVar.b(new Function() { // from class: cduj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buxz buxzVar2 = (buxz) obj2;
                        cskc cskcVar2 = cdvd.a;
                        buxzVar2.Q((MessagesTable.BindData.this.w() / 1000) * 1000);
                        return buxzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: cdut
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buxz buxzVar2 = (buxz) obj2;
                        cskc cskcVar2 = cdvd.a;
                        buxzVar2.Q(MessagesTable.BindData.this.w());
                        return buxzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        } : new Function() { // from class: cdua
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                cskc cskcVar = cdvd.a;
                buxzVar.Q(MessagesTable.BindData.this.w());
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        };
    }

    public static boolean l(MessagesTable.BindData bindData, MessagesTable.BindData bindData2) {
        return !((Boolean) ((cfup) csgj.W.get()).e()).booleanValue() ? Objects.equals(bindData.R(), bindData2.R()) && bindData.l() == bindData2.l() && bindData.af() == bindData2.af() && bindData.ae() == bindData2.ae() && bindData.s() == bindData2.s() && Objects.equals(bindData.P(), bindData2.P()) && bindData.n() == bindData2.n() && Objects.equals(bindData.S(), bindData2.S()) && bindData.t() == bindData2.t() && Objects.equals(bindData.Q(), bindData2.Q()) && bindData.ad() == bindData2.ad() && Objects.equals(bindData.G(), bindData2.G()) && bindData.M() == csgg.MERGED_FROM_CMS : Objects.equals(bindData.R(), bindData2.R()) && bindData.l() == bindData2.l() && bindData.af() == bindData2.af() && bindData.ae() == bindData2.ae() && bindData.s() == bindData2.s() && Objects.equals(bindData.P(), bindData2.P()) && bindData.n() == bindData2.n() && Objects.equals(bindData.S(), bindData2.S()) && bindData.t() == bindData2.t() && Objects.equals(bindData.Q(), bindData2.Q()) && bindData.ad() == bindData2.ad() && Objects.equals(bindData.G(), bindData2.G()) && bindData.M() == csgg.MERGED_FROM_CMS && bindData.O().equals(bindData2.O());
    }

    private static String m(MessagesTable.BindData bindData) {
        return bindData.C().a + "_" + bindData.w();
    }

    private static String n(MessagesTable.BindData bindData) {
        return bindData.C().a + "_" + ((bindData.w() / 1000) * 1000);
    }

    @Override // defpackage.cdsq
    public final elfl a(final MessagesTable.BindData bindData, final MessagesTable.BindData bindData2, final engw engwVar, final eshh eshhVar) {
        return elfo.f(new Runnable() { // from class: cdtx
            @Override // java.lang.Runnable
            public final void run() {
                cdvd.this.k(bindData, bindData2, engwVar, eshhVar, false);
            }
        }, this.o).f(cduy.class, new eroh() { // from class: cdtz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cskc cskcVar = cdvd.a;
                return elfo.d((cduy) obj);
            }
        }, erpp.a);
    }

    @Override // defpackage.cdsq
    public final enhk b(Map map) {
        if (((Boolean) ((cfup) csgj.W.get()).e()).booleanValue()) {
            final enhk enhkVar = (enhk) Collection.EL.stream(map.values()).filter(new Predicate() { // from class: cduh
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
                    MessagesTable.BindData bindData = (MessagesTable.BindData) obj;
                    cskc cskcVar = cdvd.a;
                    return bindData.O() != null && bindData.O().isPresent();
                }
            }).collect(endq.a(new Function() { // from class: cdui
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((MessagesTable.BindData) obj).O();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: cduk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    MessagesTable.BindData bindData = (MessagesTable.BindData) obj;
                    cskc cskcVar = cdvd.a;
                    return bindData;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
            if (!enhkVar.isEmpty()) {
                ekzz f2 = eleg.f("CmsMessageMergeHandler#findDuplicateByMessagePersistenceIds");
                try {
                    buxo d2 = MessagesTable.d();
                    d2.z("findDuplicateByMessagePersistenceIds");
                    d2.h(new Function() { // from class: cdul
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            cskc cskcVar = cdvd.a;
                            enip keySet = enhk.this.keySet();
                            int intValue = MessagesTable.g().intValue();
                            if (intValue < 60370) {
                                dtub.w("message_persistence_id", intValue);
                            }
                            engr engrVar = new engr();
                            Iterator<E> it = keySet.iterator();
                            while (it.hasNext()) {
                                engrVar.h(String.valueOf(bdhj.b((Optional) it.next())));
                            }
                            buxzVar.aq(new dtrw("messages.message_persistence_id", 3, buxz.at(engrVar.g()), false));
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    d2.c(g);
                    enhk enhkVar2 = (enhk) Collection.EL.stream(((enhk) Collection.EL.stream(d2.b().y()).collect(endq.a(new Function() { // from class: cdum
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            cskc cskcVar = cdvd.a;
                            return ((UUID) ((MessagesTable.BindData) obj).O().get()).toString();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: cdun
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            MessagesTable.BindData bindData = (MessagesTable.BindData) obj;
                            cskc cskcVar = cdvd.a;
                            return bindData;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }))).entrySet()).filter(new Predicate() { // from class: cduo
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
                            cskc cskcVar = cdvd.a;
                            return enhk.this.get(Optional.of(UUID.fromString((String) ((Map.Entry) obj).getKey()))) != null;
                        }
                    }).collect(endq.a(new Function() { // from class: cdup
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            cskc cskcVar = cdvd.a;
                            MessagesTable.BindData bindData = (MessagesTable.BindData) enhk.this.get(Optional.of(UUID.fromString((String) ((Map.Entry) obj).getKey())));
                            bindData.getClass();
                            bindData.R().getClass();
                            return bindData.R();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: cduq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (MessagesTable.BindData) ((Map.Entry) obj).getValue();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }));
                    f2.close();
                    return enhkVar2;
                } catch (Throwable th) {
                    try {
                        f2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return enoz.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cdsq
    public final enhk c(Map map, Map map2) {
        ekzz ekzzVar;
        Throwable th;
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        enhk j;
        Integer num;
        HashMap hashMap3;
        enhk j2;
        String str;
        int i2;
        cdvc cdvcVar;
        enhk j3;
        int i3;
        Map map3 = map;
        String str2 = "part_count_non_media";
        ekzz f2 = eleg.f("CmsMessageMergeHandler#findDupByXmsMessages");
        try {
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            HashMap hashMap6 = new HashMap();
            HashMap hashMap7 = new HashMap();
            Iterator it = map2.entrySet().iterator();
            while (true) {
                boolean z = true;
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                try {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str3 = (String) entry.getKey();
                    Optional g2 = g((engw) entry.getValue());
                    try {
                        if (!this.k.a() || map3.get(str3) == null || ((MessagesTable.BindData) map3.get(str3)).l() != 2) {
                            z = false;
                        }
                        if (g2.isPresent()) {
                            if (z) {
                                MessagesTable.BindData bindData = (MessagesTable.BindData) map3.get(str3);
                                bindData.getClass();
                                hashMap7.put(str3, bindData);
                            } else {
                                String K = ((PartsTable.BindData) g2.get()).K();
                                if (K != null) {
                                    hashMap4.put(str3, K);
                                }
                            }
                        } else if (z) {
                            MessagesTable.BindData bindData2 = (MessagesTable.BindData) map3.get(str3);
                            bindData2.getClass();
                            hashMap7.put(str3, bindData2);
                        } else {
                            int i4 = engw.d;
                            engw engwVar = (engw) Map.EL.getOrDefault(map2, str3, enou.a);
                            hashMap6.put(str3, new cdvc(engwVar.size(), (int) Collection.EL.stream(engwVar).filter(new Predicate() { // from class: cdtn
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
                                    cskc cskcVar = cdvd.a;
                                    return le.f.contains(((PartsTable.BindData) obj).H());
                                }
                            }).count()));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        ekzzVar = f2;
                        try {
                            ekzzVar.close();
                            throw th;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            enhd enhdVar = new enhd();
            if (hashMap4.isEmpty()) {
                ekzzVar = f2;
                hashMap = hashMap7;
            } else {
                HashMap hashMap8 = new HashMap();
                enfz enfzVar = new enfz();
                enfz enfzVar2 = new enfz();
                String[] strArr = MessagesTable.a;
                buxz buxzVar = new buxz();
                buxzVar.b(new Function() { // from class: cdue
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar2 = (buxz) obj;
                        cskc cskcVar = cdvd.a;
                        buxzVar2.b(new Function() { // from class: cduw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                buxz buxzVar3 = (buxz) obj2;
                                cskc cskcVar2 = cdvd.a;
                                buxzVar3.i(csgg.UNKNOWN);
                                return buxzVar3;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: cdux
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                buxz buxzVar3 = (buxz) obj2;
                                cskc cskcVar2 = cdvd.a;
                                buxzVar3.i(csgg.RESTORED_FROM_TELEPHONY);
                                return buxzVar3;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return buxzVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ArrayList arrayList = new ArrayList();
                for (String str4 : hashMap4.keySet()) {
                    int i5 = i;
                    MessagesTable.BindData bindData3 = (MessagesTable.BindData) map3.get(str4);
                    if (bindData3 != null) {
                        buxz buxzVar2 = new buxz();
                        ekzzVar = f2;
                        try {
                            buxzVar2.m(bindData3.C());
                            HashMap hashMap9 = hashMap7;
                            Function[] functionArr = new Function[1];
                            functionArr[i5] = i(bindData3);
                            buxzVar2.b(functionArr);
                            arrayList.add(buxzVar2);
                            enfzVar.t(m(bindData3), str4);
                            enfzVar2.t(n(bindData3), str4);
                            i = i5;
                            f2 = ekzzVar;
                            hashMap7 = hashMap9;
                        } catch (Throwable th5) {
                            th = th5;
                            th = th;
                            ekzzVar.close();
                            throw th;
                        }
                    } else {
                        i = i5;
                    }
                }
                ekzzVar = f2;
                hashMap = hashMap7;
                int i6 = i;
                if (arrayList.isEmpty()) {
                    j3 = enoz.a;
                } else {
                    buxzVar.ar((buxz[]) arrayList.toArray(new buxz[i6]));
                    buxo d2 = MessagesTable.d();
                    d2.z("findDuplicationWithTexts");
                    d2.c(((Boolean) ((cfup) csgj.W.get()).e()).booleanValue() ? g : m);
                    d2.k(new buxs(buxzVar));
                    bwdf c2 = PartsTable.c();
                    c2.c(PartsTable.d.c);
                    d2.D(dtvz.i(c2.b(), PartsTable.d.b, MessagesTable.c.a).g());
                    engw y = d2.b().y();
                    int i7 = ((enou) y).c;
                    int i8 = 0;
                    while (i8 < i7) {
                        MessagesTable.BindData bindData4 = (MessagesTable.BindData) y.get(i8);
                        engw engwVar2 = y;
                        String K2 = ((PartsTable.BindData[]) bindData4.aG("parts", new PartsTable.BindData[0]))[0].K();
                        if (K2 == null) {
                            i3 = i7;
                        } else {
                            Iterator it2 = enfzVar.c(m(bindData4)).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    String str5 = (String) it2.next();
                                    if (!hashMap8.containsKey(str5)) {
                                        i3 = i7;
                                        if (Objects.equals(hashMap4.get(str5), K2)) {
                                            hashMap8.put(str5, bindData4);
                                            break;
                                        }
                                        i7 = i3;
                                    }
                                } else {
                                    i3 = i7;
                                    Iterator it3 = enfzVar2.c(n(bindData4)).iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            String str6 = (String) it3.next();
                                            if (!hashMap8.containsKey(str6) && Objects.equals(hashMap4.get(str6), K2)) {
                                                hashMap8.put(str6, bindData4);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i8++;
                        y = engwVar2;
                        i7 = i3;
                    }
                    j3 = enhk.j(hashMap8);
                }
                enhdVar.g(j3);
            }
            if (hashMap6.isEmpty()) {
                hashMap2 = hashMap5;
            } else {
                HashMap hashMap10 = new HashMap();
                enfz enfzVar3 = new enfz();
                enfz enfzVar4 = new enfz();
                String[] strArr2 = MessagesTable.a;
                buxz buxzVar3 = new buxz();
                buxzVar3.b(new Function() { // from class: cdtj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar4 = (buxz) obj;
                        cskc cskcVar = cdvd.a;
                        buxzVar4.i(csgg.UNKNOWN);
                        return buxzVar4;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: cdtk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar4 = (buxz) obj;
                        cskc cskcVar = cdvd.a;
                        buxzVar4.i(csgg.RESTORED_FROM_TELEPHONY);
                        return buxzVar4;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = hashMap6.keySet().iterator();
                while (it4.hasNext()) {
                    String str7 = (String) it4.next();
                    MessagesTable.BindData bindData5 = (MessagesTable.BindData) map3.get(str7);
                    if (bindData5 != null) {
                        Iterator it5 = it4;
                        buxz buxzVar4 = new buxz();
                        buxzVar4.m(bindData5.C());
                        buxzVar4.b(i(bindData5));
                        arrayList2.add(buxzVar4);
                        enfzVar3.t(m(bindData5), str7);
                        enfzVar4.t(n(bindData5), str7);
                        map3 = map;
                        it4 = it5;
                        hashMap5 = hashMap5;
                    } else {
                        map3 = map;
                    }
                }
                hashMap2 = hashMap5;
                if (arrayList2.isEmpty()) {
                    ensk j4 = b.j();
                    j4.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) j4).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/mergehandlers/CmsMessageBugleMergeHandlerImpl", "findDuplicationWithoutTextV2", 1870, "CmsMessageBugleMergeHandlerImpl.java")).q("No \"WHERE\" terms generated in findDuplicationWithoutTextV2.");
                    j2 = enoz.a;
                } else {
                    buxzVar3.ar((buxz[]) arrayList2.toArray(new buxz[0]));
                    buxo d3 = MessagesTable.d();
                    d3.z("findDuplicationWithoutTextV2");
                    d3.c(((Boolean) ((cfup) csgj.W.get()).e()).booleanValue() ? g : m);
                    d3.k(new buxs(buxzVar3));
                    d3.v(MessagesTable.c.a);
                    d3.n(new dtzq("count($V{p})", new Object[]{PartsTable.d.a}), "part_count");
                    bwau bwauVar = PartsTable.d.e;
                    d3.n(new dtzq("SUM(CASE WHEN $V{p} IS NULL THEN 1 WHEN $V{p} IN ($R) THEN 1 ELSE 0 END)", new Object[]{bwauVar, bwauVar, Collection.EL.stream(le.f).map(new cdst()).collect(Collectors.joining(","))}), "part_count_non_media");
                    bwdf c3 = PartsTable.c();
                    c3.c(PartsTable.d.b);
                    dtvy i9 = dtvz.i(c3.b(), PartsTable.d.b, MessagesTable.c.a);
                    ((dtrd) i9).e = "p";
                    d3.G(i9.g());
                    engw y2 = d3.b().y();
                    int i10 = ((enou) y2).c;
                    int i11 = 0;
                    while (i11 < i10) {
                        MessagesTable.BindData bindData6 = (MessagesTable.BindData) y2.get(i11);
                        String ay = bindData6.ay("part_count");
                        String ay2 = bindData6.ay(str2);
                        int parseInt = Integer.parseInt(ay);
                        int parseInt2 = Integer.parseInt(ay2);
                        engw engwVar3 = y2;
                        Iterator it6 = enfzVar3.c(m(bindData6)).iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                Iterator it7 = it6;
                                String str8 = (String) it6.next();
                                if (hashMap10.containsKey(str8)) {
                                    it6 = it7;
                                } else {
                                    str = str2;
                                    cdvc cdvcVar2 = (cdvc) hashMap6.get(str8);
                                    if (cdvcVar2 != null) {
                                        i2 = i10;
                                        if (cdvcVar2.a == parseInt && cdvcVar2.b == parseInt2) {
                                            hashMap10.put(str8, bindData6);
                                            break;
                                        }
                                        i10 = i2;
                                    }
                                    it6 = it7;
                                    str2 = str;
                                }
                            } else {
                                str = str2;
                                i2 = i10;
                                Iterator it8 = enfzVar4.c(n(bindData6)).iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        String str9 = (String) it8.next();
                                        if (!hashMap10.containsKey(str9) && (cdvcVar = (cdvc) hashMap6.get(str9)) != null) {
                                            Iterator it9 = it8;
                                            if (cdvcVar.a == parseInt && cdvcVar.b == parseInt2) {
                                                hashMap10.put(str9, bindData6);
                                                break;
                                            }
                                            it8 = it9;
                                        }
                                    }
                                }
                            }
                        }
                        i11++;
                        y2 = engwVar3;
                        i10 = i2;
                        str2 = str;
                    }
                    j2 = enhk.j(hashMap10);
                }
                enhdVar.g(j2);
            }
            if (!hashMap2.isEmpty()) {
                HashMap hashMap11 = new HashMap();
                enfz enfzVar5 = new enfz();
                enfz enfzVar6 = new enfz();
                String[] strArr3 = MessagesTable.a;
                buxz buxzVar5 = new buxz();
                buxzVar5.b(new Function() { // from class: cduf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar6 = (buxz) obj;
                        cskc cskcVar = cdvd.a;
                        buxzVar6.b(new Function() { // from class: cduc
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                buxz buxzVar7 = (buxz) obj2;
                                cskc cskcVar2 = cdvd.a;
                                buxzVar7.i(csgg.UNKNOWN);
                                return buxzVar7;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: cdud
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                buxz buxzVar7 = (buxz) obj2;
                                cskc cskcVar2 = cdvd.a;
                                buxzVar7.i(csgg.RESTORED_FROM_TELEPHONY);
                                return buxzVar7;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return buxzVar6;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ArrayList arrayList3 = new ArrayList();
                Iterator it10 = hashMap2.keySet().iterator();
                while (it10.hasNext()) {
                    String str10 = (String) it10.next();
                    MessagesTable.BindData bindData7 = (MessagesTable.BindData) map.get(str10);
                    if (bindData7 != null) {
                        buxz buxzVar6 = new buxz();
                        buxzVar6.m(bindData7.C());
                        buxzVar6.b(i(bindData7));
                        arrayList3.add(buxzVar6);
                        enfzVar5.t(m(bindData7), str10);
                        enfzVar6.t(n(bindData7), str10);
                        it10 = it10;
                    }
                }
                if (arrayList3.isEmpty()) {
                    j = enoz.a;
                } else {
                    buxzVar5.ar((buxz[]) arrayList3.toArray(new buxz[0]));
                    buxo d4 = MessagesTable.d();
                    d4.z("findDuplicationsForMedia");
                    d4.c(g);
                    d4.k(new buxs(buxzVar5));
                    d4.v(MessagesTable.c.a);
                    d4.n(new dtzq("count($V{p})", new Object[]{PartsTable.d.a}), "part_count");
                    bwdf c4 = PartsTable.c();
                    c4.c(PartsTable.d.b);
                    dtvy i12 = dtvz.i(c4.b(), PartsTable.d.b, MessagesTable.c.a);
                    ((dtrd) i12).e = "p";
                    d4.G(i12.g());
                    engw y3 = d4.b().y();
                    int i13 = ((enou) y3).c;
                    int i14 = 0;
                    while (i14 < i13) {
                        MessagesTable.BindData bindData8 = (MessagesTable.BindData) y3.get(i14);
                        try {
                            num = Integer.valueOf(bindData8.ay("part_count"));
                        } catch (NumberFormatException e2) {
                            ensk j5 = b.j();
                            j5.Y(ente.a, "BugleCms");
                            ((enrr) ((enrr) ((enrr) j5).g(e2)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/mergehandlers/CmsMessageBugleMergeHandlerImpl", "findDuplicationWithoutText", (char) 2008, "CmsMessageBugleMergeHandlerImpl.java")).q("Invalid part count");
                            num = 0;
                        }
                        Iterator it11 = enfzVar5.c(m(bindData8)).iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                hashMap3 = hashMap2;
                                for (String str11 : enfzVar6.c(n(bindData8))) {
                                    if (!hashMap11.containsKey(str11) && num.equals((Integer) Map.EL.getOrDefault(hashMap3, str11, 0))) {
                                        hashMap11.put(str11, bindData8);
                                        break;
                                    }
                                }
                            } else {
                                String str12 = (String) it11.next();
                                if (!hashMap11.containsKey(str12)) {
                                    hashMap3 = hashMap2;
                                    if (num.equals(Map.EL.getOrDefault(hashMap3, str12, 0))) {
                                        hashMap11.put(str12, bindData8);
                                        break;
                                    }
                                    hashMap2 = hashMap3;
                                }
                            }
                        }
                        i14++;
                        hashMap2 = hashMap3;
                    }
                    j = enhk.j(hashMap11);
                }
                enhdVar.g(j);
            }
            if (!hashMap.isEmpty()) {
                enhdVar.g(f(hashMap));
            }
            enhk b2 = enhdVar.b();
            ekzzVar.close();
            return b2;
        } catch (Throwable th6) {
            th = th6;
            ekzzVar = f2;
        }
    }

    @Override // defpackage.cdsq
    public final enhk d(java.util.Map map) {
        final Set keySet = map.keySet();
        if (keySet.isEmpty()) {
            return enoz.a;
        }
        ekzz f2 = eleg.f("CmsMessageMergeHandler#findDupByCmsIds");
        try {
            buxo d2 = MessagesTable.d();
            d2.z("findDuplicationByCmsIds");
            d2.h(new Function() { // from class: cdsx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = cdvd.a;
                    buxzVar.g(keySet);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d2.c(g);
            enhk enhkVar = (enhk) Collection.EL.stream(d2.b().y()).filter(new Predicate() { // from class: cdsy
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
                    cskc cskcVar = cdvd.a;
                    return ((MessagesTable.BindData) obj).R() != null;
                }
            }).collect(endq.a(new Function() { // from class: cdsz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = cdvd.a;
                    return emxe.b(((MessagesTable.BindData) obj).R());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: cdta
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    MessagesTable.BindData bindData = (MessagesTable.BindData) obj;
                    cskc cskcVar = cdvd.a;
                    return bindData;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
            f2.close();
            return enhkVar;
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j(MatrixCursor matrixCursor, cdvn cdvnVar) {
        MessagesTable.BindData a2 = cdvnVar.a();
        MessagesTable.BindData b2 = cdvnVar.b();
        MessageIdType D = a2.D();
        if (this.k.a() && b2.l() == 2 && a2.l() == 1) {
            buoy H = b2.H();
            H.O(a2.l());
            H.X(a2.af());
            H.ao(a2.s());
            b2 = H.a();
        }
        if (this.l.a() && a2.af()) {
            buoy H2 = b2.H();
            H2.X(a2.af());
            b2 = H2.a();
        }
        if (l(a2, b2)) {
            ensk h = b.h();
            h.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/mergehandlers/CmsMessageBugleMergeHandlerImpl", "addRowToOverwriteMatrix", 939, "CmsMessageBugleMergeHandlerImpl.java")).D("Skip batched update (new) of identical message bugleDbId=%s cmsId=%s", a2.D().b(), b2.R());
        } else {
            String str = !TextUtils.isEmpty(bdhg.d(b2.G())) ? b2.G().b : !TextUtils.isEmpty(bdhg.d(a2.G())) ? a2.G().b : null;
            if (((Boolean) ((cfup) csgj.W.get()).e()).booleanValue()) {
                matrixCursor.addRow(new Object[]{Long.valueOf(D.a), b2.R(), Integer.valueOf(b2.l()), Integer.valueOf(e(b2.ae())), Integer.valueOf(b2.s()), Integer.valueOf(e(b2.af())), b2.P(), Integer.valueOf(b2.n()), b2.S(), Long.valueOf(b2.t()), b2.Q(), Integer.valueOf(e(b2.ad())), str, b2.M(), ((UUID) b2.O().get()).toString()});
            } else {
                matrixCursor.addRow(new Object[]{Long.valueOf(D.a), b2.R(), Integer.valueOf(b2.l()), Integer.valueOf(e(b2.ae())), Integer.valueOf(b2.s()), Integer.valueOf(e(b2.af())), b2.P(), Integer.valueOf(b2.n()), b2.S(), Long.valueOf(b2.t()), b2.Q(), Integer.valueOf(e(b2.ad())), str, b2.M()});
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x025a, code lost:
    
        if (((com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.BindData) r0.get(r2)).K() != null) goto L81;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02db A[Catch: all -> 0x062d, TRY_ENTER, TryCatch #5 {all -> 0x062d, blocks: (B:110:0x02a4, B:113:0x02b6, B:115:0x02db, B:117:0x02ea, B:118:0x02f2, B:120:0x02f8), top: B:109:0x02a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x054a A[Catch: all -> 0x05f9, TryCatch #13 {all -> 0x05f9, blocks: (B:60:0x0542, B:62:0x054a, B:64:0x0550), top: B:59:0x0542 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r32, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r33, defpackage.engw r34, defpackage.eshh r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdvd.k(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, engw, eshh, boolean):void");
    }
}
