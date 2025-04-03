package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwa implements ccuq {
    public static final EnumSet b = EnumSet.of(ccvs.b);
    public static final EnumSet c = EnumSet.of(ccvs.a);
    public static final EnumSet d = EnumSet.of(ccvs.c);
    public static final EnumSet e = EnumSet.of(crwp.FREQUENTLY_CHANGED_PART);
    public static final EnumSet f = EnumSet.of(crwp.RARELY_CHANGED_PART);
    public static final EnumSet g = EnumSet.of(crwp.ADDITIONAL_FIELDS_PART);
    public final crwq h;
    private final crxx i;
    private final ffhd j;
    private final aszv k;

    public ccwa(crxx crxxVar, crwq crwqVar, ffhd ffhdVar, aszv aszvVar) {
        ffhdVar.getClass();
        this.i = crxxVar;
        this.h = crwqVar;
        this.j = ffhdVar;
        this.k = aszvVar;
    }

    @Override // defpackage.ccuq
    public final /* bridge */ /* synthetic */ csgg a(Object obj) {
        crwx crwxVar = (crwx) obj;
        crwxVar.getClass();
        return crwxVar.c().N();
    }

    @Override // defpackage.ccuq
    public final /* bridge */ /* synthetic */ Object b(Object obj, bqvj bqvjVar, boolean z, EnumSet enumSet, ffgu ffguVar) {
        return g((crwx) obj, bqvjVar, enumSet, ffguVar);
    }

    @Override // defpackage.ccuq
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        crwx crwxVar = (crwx) obj;
        crwxVar.getClass();
        return crwxVar.c().R();
    }

    @Override // defpackage.ccuq
    public final Map e(Collection collection, EnumSet enumSet) {
        Object a;
        collection.getClass();
        enumSet.getClass();
        if (!((ersq) ((asyx) this.k).a.b()).a("bugle.implement_batch_fetch_local_data_for_cms_conversations")) {
            int i = ccuo.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(collection, 10)), 16));
            for (Object obj : collection) {
                try {
                    a = c((String) obj, enumSet);
                } catch (Throwable th) {
                    a = ffci.a(th);
                }
                linkedHashMap.put(obj, new ffch(a));
            }
            return linkedHashMap;
        }
        final crxx crxxVar = this.i;
        ArrayList arrayList = new ArrayList(ffdx.n(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(bdgq.b((String) it.next()));
        }
        final engw a2 = engq.a(arrayList);
        enhk enhkVar = (enhk) crxxVar.d.c("CmsConversationFetcher#fetchCmsConversationDataList", new emyl() { // from class: crxo
            @Override // defpackage.emyl
            public final Object get() {
                final crxx crxxVar2 = crxx.this;
                final ParticipantsTable.BindData a3 = crxxVar2.a();
                ekzz f2 = eleg.f("CmsConversationFetcher#fetchAdditionalFields#batched");
                try {
                    boolean a4 = csgj.a();
                    engw engwVar = a2;
                    final enhk enhkVar2 = (a4 && ((Optional) crxxVar2.b.b()).isPresent()) ? (enhk) Collection.EL.stream(((crua) crxxVar2.c.b()).a((Map) ((Optional) crxxVar2.b.b()).get(), (engw) Collection.EL.stream(engwVar).map(new Function() { // from class: crxp
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((ConversationIdType) obj2).a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(endq.a)).entrySet()).collect(endq.a(new Function() { // from class: crxq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return bdgq.b((String) ((Map.Entry) obj2).getKey());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: crxr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return (enhk) ((Map.Entry) obj2).getValue();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    })) : enoz.a;
                    f2.close();
                    return (enhk) Collection.EL.stream(((bczy) crxxVar2.a.b()).D(engwVar).entrySet()).collect(endq.a(new Function() { // from class: crxs
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return (ConversationIdType) ((Map.Entry) obj2).getKey();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: crxt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            Map.Entry entry = (Map.Entry) obj2;
                            return crxx.this.b((bseh) entry.getValue(), a3, (enhk) enhkVar2.getOrDefault(entry.getKey(), null), (ConversationIdType) entry.getKey());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }));
                } catch (Throwable th2) {
                    try {
                        f2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        });
        enhkVar.getClass();
        ArrayList arrayList2 = new ArrayList(enhkVar.size());
        Iterator it2 = enhkVar.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            arrayList2.add(new ffcf(((ConversationIdType) entry.getKey()).a(), new ffch((crwx) entry.getValue())));
        }
        Map k = ffew.k(arrayList2);
        Set e2 = fffi.e(ffdx.ar(collection), k.keySet());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(e2, 10)), 16));
        for (Object obj2 : e2) {
            String str = (String) obj2;
            str.getClass();
            linkedHashMap2.put(obj2, new ffch(ffci.a(new ccwp(str))));
        }
        return ffew.j(k, linkedHashMap2);
    }

    @Override // defpackage.ccuq
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final crwx c(final String str, EnumSet enumSet) {
        str.getClass();
        enumSet.getClass();
        Object orElseThrow = this.i.c(bdgq.b(str)).orElseThrow(new Supplier() { // from class: ccvx
            @Override // java.util.function.Supplier
            public final Object get() {
                EnumSet enumSet2 = ccwa.b;
                return new ccwp(str);
            }
        });
        orElseThrow.getClass();
        return (crwx) orElseThrow;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.crwx r11, defpackage.bqvj r12, java.util.EnumSet r13, defpackage.ffgu r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.ccvz
            if (r0 == 0) goto L13
            r0 = r14
            ccvz r0 = (defpackage.ccvz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccvz r0 = new ccvz
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r14)
            goto L4b
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.ffci.b(r14)
            ffhd r14 = r10.j
            ffhd r14 = defpackage.ekxi.a(r14)
            ccvy r4 = new ccvy
            r5 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r3
            java.lang.Object r14 = defpackage.ffra.a(r14, r4, r0)
            if (r14 != r1) goto L4b
            return r1
        L4b:
            r14.getClass()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccwa.g(crwx, bqvj, java.util.EnumSet, ffgu):java.lang.Object");
    }
}
