package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.knowledge.hobbes.chat.p13n.features.PredicatesAggregator;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiwj implements aiwf {
    public final aiwm a;
    public final errl b;
    public final aiwc c;
    private final aiwl d;

    public aiwj(aiwc aiwcVar, aiwl aiwlVar, aiwm aiwmVar, errl errlVar) {
        this.c = aiwcVar;
        this.d = aiwlVar;
        this.a = aiwmVar;
        this.b = errlVar;
    }

    public final elfl a(final Queue queue) {
        if (queue.isEmpty()) {
            return elfo.e(null);
        }
        final Instant instant = (Instant) queue.remove();
        final aiwl aiwlVar = this.d;
        Instant b = bdgt.b(instant.toEpochMilli());
        final aiwe aiweVar = new aiwe(b.toEpochMilli(), b.plus(Duration.ofDays(1L)).minusMillis(1L).toEpochMilli());
        final aixm aixmVar = aiwlVar.d;
        return (!aixmVar.d.a() ? elfj.c(elfo.e(Optional.empty())) : elfj.c(elfl.g(aixmVar.b.d(emms.a((String) aixm.a.e()))).h(new emwl() { // from class: aixl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cfup cfupVar = aixm.a;
                return optional.isEmpty() ? optional : Optional.of(Uri.parse(((String) optional.get()).replace("android://", "file:///data/user/0/")).toString());
            }
        }, aixmVar.c)).f(new erow() { // from class: aixk
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                char c;
                Optional optional = (Optional) obj;
                optional.getClass();
                boolean isEmpty = optional.isEmpty();
                aixm aixmVar2 = aixm.this;
                if (isEmpty) {
                    return Optional.empty();
                }
                try {
                    String str = (String) optional.get();
                    exds exdsVar = (exds) exdt.a.createBuilder();
                    exdsVar.copyOnWrite();
                    ((exdt) exdsVar.instance).b = str;
                    exdt exdtVar = (exdt) exdsVar.build();
                    exdq exdqVar = (exdq) exdr.a.createBuilder();
                    exdqVar.copyOnWrite();
                    exdr exdrVar = (exdr) exdqVar.instance;
                    exdtVar.getClass();
                    exdrVar.c = exdtVar;
                    exdrVar.b |= 2;
                    PredicatesAggregator predicatesAggregator = new PredicatesAggregator(PredicatesAggregator.nativeCreatePredicateEvaluator(((exdr) exdqVar.build()).toByteArray()));
                    erpcVar.a(predicatesAggregator, aixmVar2.c);
                    return Optional.of(predicatesAggregator);
                } catch (Exception e) {
                    String message = e.getMessage() != null ? e.getMessage() : "";
                    int hashCode = message.hashCode();
                    if (hashCode != -1642953530) {
                        if (hashCode == 615976424 && message.equals("SENTENCE_PIECE_CONFIG_IS_EMPTY")) {
                            c = 0;
                        }
                        c = 65535;
                    } else {
                        if (message.equals("SENTENCE_PIECE_CONFIG_NOT_FOUND")) {
                            c = 1;
                        }
                        c = 65535;
                    }
                    if (c == 0) {
                        aixmVar2.a("SENTENCE_PIECE_CONFIG_IS_EMPTY", e);
                    } else if (c != 1) {
                        aixmVar2.a("UNKNOWN_PREDICATES_AGGREGATOR_ERROR", e);
                    } else {
                        aixmVar2.a("SENTENCE_PIECE_CONFIG_NOT_FOUND", e);
                    }
                    return Optional.empty();
                }
            }
        }, aixmVar.c)).f(new erow() { // from class: aiwk
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                Optional optional = (Optional) obj;
                optional.getClass();
                if (optional.isEmpty()) {
                    return Optional.empty();
                }
                aiwe aiweVar2 = aiweVar;
                aiwl aiwlVar2 = aiwl.this;
                bdmq bdmqVar = (bdmq) aiwlVar2.c.a.b();
                Object e = aixc.b.e();
                e.getClass();
                int intValue = ((Number) e).intValue();
                final long j = aiweVar2.a;
                final long j2 = aiweVar2.b;
                ekzz f = eleg.f("MessageDatabaseOperations#getSentMessages");
                try {
                    efbd.b();
                    ArrayList arrayList = new ArrayList();
                    buxo d = MessagesTable.d();
                    d.z("getSentMessages");
                    d.h(new Function() { // from class: bdke
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar = (buxz) obj2;
                            cskc cskcVar = bdmq.a;
                            buxzVar.ai(axuh.d);
                            buxzVar.aa(j);
                            buxzVar.aq(new dtwe("messages.sent_timestamp", 10, Long.valueOf(j2)));
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    d.x(intValue);
                    buuo buuoVar = (buuo) d.b().o();
                    while (buuoVar.moveToNext()) {
                        try {
                            MessageCoreData a = ((byzp) bdmqVar.e.b()).a();
                            a.aN(buuoVar);
                            ((bdpt) bdmqVar.f.b()).c(a, false);
                            bdmqVar.N(a);
                            arrayList.add(a);
                        } finally {
                        }
                    }
                    buuoVar.close();
                    f.close();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String ar = ((MessageCoreData) it.next()).ar();
                        if (ar != null) {
                            arrayList2.add(ar);
                        }
                    }
                    engw a2 = engq.a(arrayList2);
                    if (a2.isEmpty()) {
                        return Optional.empty();
                    }
                    PredicatesAggregator predicatesAggregator = (PredicatesAggregator) optional.get();
                    try {
                        int size = a2.size();
                        enhd enhdVar = new enhd();
                        enhdVar.g(predicatesAggregator.a(a2));
                        enhdVar.k((String) aixc.c.e(), Integer.valueOf(size));
                        return Optional.of(enhdVar.b());
                    } catch (exdm e2) {
                        aiwlVar2.a.o("Error calculating p13n features", e2);
                        return Optional.empty();
                    }
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, aiwlVar.b).h().i(new eroh() { // from class: aiwg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return elfo.e(null);
                }
                final Queue queue2 = queue;
                final Instant instant2 = instant;
                final aiwj aiwjVar = aiwj.this;
                final enhk enhkVar = (enhk) optional.get();
                final Instant minus = instant2.minus(Duration.ofDays(1L));
                final aixb aixbVar = (aixb) aiwjVar.a;
                return elfo.f(new Runnable() { // from class: aiwn
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Instant b2 = bdgt.b(minus.toEpochMilli());
                        String[] strArr = bvar.a;
                        final bvao bvaoVar = new bvao(bvar.a);
                        bvaoVar.z("getLatestDecayedFeaturesBeforeDate-p13_decayed_feature_values_table1");
                        bvaoVar.e(new Function() { // from class: ctpq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bvaq bvaqVar = (bvaq) obj2;
                                bvaqVar.aq(new dtrt("smarts_personalization_decayed_feature_values.date", 10, Long.valueOf(bdgt.a(Instant.this))));
                                return bvaqVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bvaoVar.c(new bval(bvar.c.b));
                        bvaoVar.x(1);
                        bvao bvaoVar2 = new bvao(bvar.a);
                        bvaoVar2.z("getLatestDecayedFeaturesBeforeDate-p13_decayed_feature_values_table2");
                        bvaoVar2.e(new Function() { // from class: ctpr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bvaq bvaqVar = (bvaq) obj2;
                                Function function = new Function() { // from class: ctpz
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function2) {
                                        return Function$CC.$default$andThen(this, function2);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return ((bvac) obj3).b;
                                    }

                                    public final /* synthetic */ Function compose(Function function2) {
                                        return Function$CC.$default$compose(this, function2);
                                    }
                                };
                                bvao bvaoVar3 = bvao.this;
                                bvaoVar3.d(function);
                                bvaqVar.aq(new dtru("smarts_personalization_decayed_feature_values.date", 1, bvaoVar3.b()));
                                return bvaqVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bvae bvaeVar = (bvae) bvaoVar2.b().o();
                        try {
                            enhd enhdVar = new enhd();
                            while (bvaeVar.moveToNext()) {
                                final buzp buzpVar = (buzp) bvaeVar.cO();
                                bvbr a = bvbu.a();
                                a.z("getLatestDecayedFeaturesBeforeDate-p13_features1");
                                a.c(new Function() { // from class: ctps
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        buzp buzpVar2 = buzp.this;
                                        bvbt bvbtVar = (bvbt) obj2;
                                        buzpVar2.az(0, "feature_id");
                                        bvbtVar.aq(new dtrt("smarts_personalization_features.feature_id", 1, Long.valueOf(bdhk.a(buzpVar2.a))));
                                        return bvbtVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                bvbj bvbjVar = (bvbj) a.b().o();
                                try {
                                    emxf.b(bvbjVar.getCount() == 1, "No feature id for feature: ");
                                    bvax bvaxVar = (bvax) bvbjVar.cQ();
                                    if (bvaxVar != null) {
                                        String str = bvaxVar.l().b;
                                        if (!TextUtils.isEmpty(str)) {
                                            buzpVar.az(2, "feature_value");
                                            enhdVar.k(str, Float.valueOf(buzpVar.c));
                                        }
                                    }
                                    bvbjVar.close();
                                } finally {
                                }
                            }
                            enhk c = enhdVar.c();
                            final Instant instant3 = instant2;
                            final enhk enhkVar2 = enhkVar;
                            final aixb aixbVar2 = aixb.this;
                            bvaeVar.close();
                            final enhk a2 = aixb.a(c, new Function() { // from class: aiwx
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    cfup cfupVar = aixb.a;
                                    return Float.valueOf(((Float) ((Map.Entry) obj2).getValue()).floatValue() * ((Float) aixb.a.e()).floatValue());
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            enin eninVar = new enin();
                            eninVar.j(enhkVar2.keySet());
                            eninVar.j(a2.keySet());
                            final enhk enhkVar3 = (enhk) Collection.EL.stream(eninVar.g()).collect(endq.a(new Function() { // from class: aiwp
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    String str2 = (String) obj2;
                                    cfup cfupVar = aixb.a;
                                    return str2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: aiwq
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    String str2 = (String) obj2;
                                    cfup cfupVar = aixb.a;
                                    return Float.valueOf(((Integer) enhk.this.getOrDefault(str2, 0)).intValue() + ((Float) a2.getOrDefault(str2, Float.valueOf(0.0f))).floatValue());
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }));
                            final float floatValue = ((Float) enhkVar3.getOrDefault(aixc.c.e(), Float.valueOf(1.0f))).floatValue();
                            enhk enhkVar4 = (enhk) Collection.EL.stream(enhkVar3.entrySet()).filter(new Predicate() { // from class: aiws
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
                                    cfup cfupVar = aixb.a;
                                    return !((String) ((Map.Entry) obj2).getKey()).equals(aixc.c.e());
                                }
                            }).collect(endq.a(new Function() { // from class: aiwt
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return (String) ((Map.Entry) obj2).getKey();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: aiwu
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return (Float) ((Map.Entry) obj2).getValue();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }));
                            final TreeMap treeMap = new TreeMap(new Comparator() { // from class: aiwy
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    Map.Entry entry = (Map.Entry) obj2;
                                    Map.Entry entry2 = (Map.Entry) obj3;
                                    cfup cfupVar = aixb.a;
                                    int compareTo = ((Comparable) entry.getValue()).compareTo(entry2.getValue());
                                    if (compareTo == 0) {
                                        compareTo = ((Comparable) entry.getKey()).compareTo(entry2.getKey());
                                    }
                                    return -compareTo;
                                }
                            });
                            Collection.EL.stream(enhkVar4.entrySet()).forEach(new Consumer() { // from class: aiwz
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj2) {
                                    Map.Entry entry = (Map.Entry) obj2;
                                    cfup cfupVar = aixb.a;
                                    Comparable comparable = (Comparable) entry.getKey();
                                    TreeMap treeMap2 = treeMap;
                                    treeMap2.put(entry, comparable);
                                    if (treeMap2.size() > ((Integer) aixb.b.e()).intValue()) {
                                        treeMap2.pollLastEntry();
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            final enhk a3 = aixb.a((enhk) Collection.EL.stream(treeMap.keySet()).collect(endq.a(new Function() { // from class: aixa
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return (Comparable) ((Map.Entry) obj2).getKey();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: aiwo
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return (Comparable) ((Map.Entry) obj2).getValue();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            })), new Function() { // from class: aiwv
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    cfup cfupVar = aixb.a;
                                    return Float.valueOf(((Float) ((Map.Entry) obj2).getValue()).floatValue() / floatValue);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            aixbVar2.d.d("P13nFeatureWriter#insertFeatures", new Runnable() { // from class: aiwr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Instant instant4 = instant3;
                                    final Instant b3 = bdgt.b(instant4.toEpochMilli());
                                    ekzz f = eleg.f("P13nFeaturesDatabaseOperationsImpl#insertDecayedFeatures");
                                    aixb aixbVar3 = aixb.this;
                                    ctqf ctqfVar = aixbVar3.e;
                                    final enhk enhkVar5 = a3;
                                    final enhk enhkVar6 = enhkVar3;
                                    try {
                                        efbd.b();
                                        final AtomicReference atomicReference = new AtomicReference();
                                        ctqfVar.a.d("P13nFeaturesDatabaseOperationsImpl#insertDecayedFeatures", new Runnable() { // from class: ctpu
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                bvbr a4 = bvbu.a();
                                                a4.z("+getOrCreateFeatureIds");
                                                final enhk enhkVar7 = enhk.this;
                                                a4.c(new Function() { // from class: ctpp
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj2) {
                                                        bvbt bvbtVar = (bvbt) obj2;
                                                        Stream map = Collection.EL.stream(enhk.this.keySet()).map(new Function() { // from class: ctpt
                                                            @Override // java.util.function.Function
                                                            /* renamed from: andThen */
                                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                                return Function$CC.$default$andThen(this, function);
                                                            }

                                                            @Override // java.util.function.Function
                                                            public final Object apply(Object obj3) {
                                                                return bdhl.a((String) obj3);
                                                            }

                                                            public final /* synthetic */ Function compose(Function function) {
                                                                return Function$CC.$default$compose(this, function);
                                                            }
                                                        });
                                                        int i = engw.d;
                                                        Iterable iterable = (Iterable) map.collect(endq.a);
                                                        int intValue = bvbu.c().intValue();
                                                        if (intValue < 54060) {
                                                            dtub.w("feature", intValue);
                                                        }
                                                        engr engrVar = new engr();
                                                        Iterator it = iterable.iterator();
                                                        while (it.hasNext()) {
                                                            engrVar.h(String.valueOf(bdhl.d((bdhl) it.next())));
                                                        }
                                                        bvbtVar.aq(new dtrw("smarts_personalization_features.feature", 3, bvbt.at(engrVar.g()), false));
                                                        return bvbtVar;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                engw y = a4.b().y();
                                                final Set set = (Set) Collection.EL.stream(y).map(new Function() { // from class: ctpw
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj2) {
                                                        return bdhl.e(((bvax) obj2).l());
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }).collect(endq.b);
                                                Stream filter = Collection.EL.stream(enhkVar7.keySet()).filter(new Predicate() { // from class: ctqa
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
                                                        return !set.contains((String) obj2);
                                                    }
                                                });
                                                final Instant instant5 = b3;
                                                bvax[] bvaxVarArr = (bvax[]) filter.map(new Function() { // from class: ctqb
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj2) {
                                                        String[] strArr2 = bvbu.a;
                                                        bvba bvbaVar = new bvba();
                                                        bvbaVar.b(bdhl.a((String) obj2));
                                                        bvbaVar.d(Instant.this);
                                                        return bvbaVar.a();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }).toArray(new IntFunction() { // from class: ctqc
                                                    @Override // java.util.function.IntFunction
                                                    public final Object apply(int i) {
                                                        return new bvax[i];
                                                    }
                                                });
                                                long[] A = dtub.A(bvbu.b(), 0, true, new BiConsumer() { // from class: bvav
                                                    @Override // java.util.function.BiConsumer
                                                    public final void accept(Object obj2, Object obj3) {
                                                        bvax bvaxVar2 = (bvax) obj2;
                                                        final Long l = (Long) obj3;
                                                        String[] strArr2 = bvbu.a;
                                                        if (l.longValue() >= 0) {
                                                            bvaxVar2.a = (bdhk) new dtuj() { // from class: bvau
                                                                @Override // defpackage.dtuj
                                                                public final Object a() {
                                                                    String[] strArr3 = bvbu.a;
                                                                    return new bdhk(l.longValue());
                                                                }
                                                            }.a();
                                                            bvaxVar2.fY(0);
                                                        }
                                                    }

                                                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                                                    }
                                                }, bvaxVarArr);
                                                if (A == null) {
                                                    throw new IllegalStateException("Unable to insert missing P13n features");
                                                }
                                                for (int i = 0; i < bvaxVarArr.length; i++) {
                                                    bvax bvaxVar2 = bvaxVarArr[i];
                                                    bvba bvbaVar = new bvba();
                                                    BitSet bitSet = bvaxVar2.cJ;
                                                    bvbaVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
                                                    BitSet bitSet2 = bvbaVar.az;
                                                    if (bitSet2 == null || bitSet2.get(0)) {
                                                        bvbaVar.a = bvaxVar2.k();
                                                    }
                                                    BitSet bitSet3 = bvbaVar.az;
                                                    if (bitSet3 == null || bitSet3.get(1)) {
                                                        bvbaVar.b = bvaxVar2.l();
                                                    }
                                                    BitSet bitSet4 = bvbaVar.az;
                                                    if (bitSet4 == null || bitSet4.get(2)) {
                                                        bvaxVar2.az(2, "start_date");
                                                        bvbaVar.c = bvaxVar2.c;
                                                    }
                                                    bvbaVar.c(new bdhk(A[i]));
                                                    bvaxVarArr[i] = bvbaVar.a();
                                                }
                                                AtomicReference atomicReference2 = atomicReference;
                                                int i2 = engw.d;
                                                engr engrVar = new engr();
                                                engrVar.j(y);
                                                engrVar.j(Arrays.asList(bvaxVarArr));
                                                atomicReference2.set((enhk) Collection.EL.stream(engrVar.g()).collect(endq.a(new Function() { // from class: ctpx
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj2) {
                                                        return ((bvax) obj2).l();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }, new Function() { // from class: ctpy
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj2) {
                                                        return ((bvax) obj2).k();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                })));
                                            }
                                        });
                                        final enhk enhkVar7 = (enhk) atomicReference.get();
                                        ctqfVar.a.d("P13nFeaturesDatabaseOperationsImpl#insertDecayedFeatures", new Runnable() { // from class: ctqe
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final enhk enhkVar8 = enhkVar7;
                                                final Instant instant5 = b3;
                                                Map.EL.forEach(enhk.this, new BiConsumer() { // from class: ctqd
                                                    @Override // java.util.function.BiConsumer
                                                    public final void accept(Object obj2, Object obj3) {
                                                        String str2 = (String) obj2;
                                                        Float f2 = (Float) obj3;
                                                        bdhk bdhkVar = (bdhk) enhk.this.get(bdhl.a(str2));
                                                        if (bdhkVar == null) {
                                                            throw new IllegalStateException("Feature id not present for feature:".concat(String.valueOf(str2)));
                                                        }
                                                        Instant instant6 = instant5;
                                                        String[] strArr2 = bvar.a;
                                                        buzu buzuVar = new buzu();
                                                        buzuVar.b(instant6);
                                                        buzuVar.c(bdhkVar);
                                                        buzuVar.d(f2.floatValue());
                                                        buzp a4 = buzuVar.a(new Supplier() { // from class: buzr
                                                            @Override // java.util.function.Supplier
                                                            public final Object get() {
                                                                return new buzq();
                                                            }
                                                        });
                                                        final dtve a5 = bvar.a();
                                                        dtub.b(bvar.a(), "smarts_personalization_decayed_feature_values", a4, new Function() { // from class: buzl
                                                            @Override // java.util.function.Function
                                                            /* renamed from: andThen */
                                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                                return Function$CC.$default$andThen(this, function);
                                                            }

                                                            @Override // java.util.function.Function
                                                            public final Object apply(Object obj4) {
                                                                return Long.valueOf(dtve.this.S("smarts_personalization_decayed_feature_values", (ContentValues) obj4));
                                                            }

                                                            public final /* synthetic */ Function compose(Function function) {
                                                                return Function$CC.$default$compose(this, function);
                                                            }
                                                        }, new Consumer() { // from class: buzm
                                                            @Override // java.util.function.Consumer
                                                            /* renamed from: accept */
                                                            public final void o(Object obj4) {
                                                            }

                                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                return Consumer$CC.$default$andThen(this, consumer);
                                                            }
                                                        });
                                                    }

                                                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                                                    }
                                                });
                                            }
                                        });
                                        f.close();
                                        ctqf ctqfVar2 = aixbVar3.e;
                                        final Instant b4 = bdgt.b(instant4.toEpochMilli());
                                        f = eleg.f("P13nFeaturesDatabaseOperationsImpl#insertNormalizedFeatures");
                                        try {
                                            efbd.b();
                                            ctqfVar2.a.d("P13nFeaturesDatabaseOperationsImpl#insertNormalizedFeatures", new Runnable() { // from class: ctpv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    String[] strArr2 = bvcy.a;
                                                    bvcr bvcrVar = new bvcr();
                                                    bvcrVar.f("insertNormalizedFeatures");
                                                    bvcrVar.d();
                                                    bvcf bvcfVar = new bvcf();
                                                    bvcfVar.b(Instant.this);
                                                    enhk enhkVar8 = enhkVar5;
                                                    enhkVar8.getClass();
                                                    emrj emrjVar = (emrj) emrk.a.createBuilder();
                                                    emrjVar.getClass();
                                                    Set<Map.Entry> entrySet = enhkVar8.entrySet();
                                                    entrySet.getClass();
                                                    for (Map.Entry entry : entrySet) {
                                                        String str2 = (String) entry.getKey();
                                                        float floatValue2 = ((Number) entry.getValue()).floatValue();
                                                        emrh emrhVar = (emrh) emri.a.createBuilder();
                                                        emrhVar.getClass();
                                                        str2.getClass();
                                                        emrhVar.copyOnWrite();
                                                        ((emri) emrhVar.instance).b = str2;
                                                        emrhVar.copyOnWrite();
                                                        ((emri) emrhVar.instance).c = floatValue2;
                                                        eyfy build = emrhVar.build();
                                                        build.getClass();
                                                        emri emriVar = (emri) build;
                                                        emrjVar.copyOnWrite();
                                                        emrk emrkVar = (emrk) emrjVar.instance;
                                                        eygr eygrVar = emrkVar.b;
                                                        if (!eygrVar.c()) {
                                                            emrkVar.b = eyfy.mutableCopy(eygrVar);
                                                        }
                                                        emrkVar.b.add(emriVar);
                                                    }
                                                    eyfy build2 = emrjVar.build();
                                                    build2.getClass();
                                                    bvcfVar.c((emrk) build2);
                                                    bvca a4 = bvcfVar.a(new Supplier() { // from class: bvcc
                                                        @Override // java.util.function.Supplier
                                                        public final Object get() {
                                                            return new bvcb();
                                                        }
                                                    });
                                                    final dtve a5 = bvcy.a();
                                                    dtub.b(bvcy.a(), "smarts_personalization_normalized_feature_values", a4, new Function() { // from class: bvbx
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj2) {
                                                            return Long.valueOf(dtve.this.S("smarts_personalization_normalized_feature_values", (ContentValues) obj2));
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    }, new Consumer() { // from class: bvby
                                                        @Override // java.util.function.Consumer
                                                        /* renamed from: accept */
                                                        public final void o(Object obj2) {
                                                        }

                                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                            return Consumer$CC.$default$andThen(this, consumer);
                                                        }
                                                    });
                                                }
                                            });
                                            f.close();
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                            });
                        } catch (Throwable th) {
                            try {
                                bvaeVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, aixbVar.c).i(new eroh() { // from class: aiwi
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return aiwj.this.a(queue2);
                    }
                }, aiwjVar.b);
            }
        }, this.b);
    }
}
