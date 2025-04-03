package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.util.Collection;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emoz implements empj {
    public static final enru a = enru.c("com/google/chat/smartmessaging/smartreply/android/providers/ConversationStarterSuggestionProvider");
    public int b;
    public int c;
    private final Duration d;
    private final emyl e;

    public emoz(final emlg emlgVar, final emmt emmtVar) {
        this.d = Duration.ofMillis(emlgVar.c);
        this.e = emys.a(new emyl() { // from class: emoo
            @Override // defpackage.emyl
            public final Object get() {
                fbxo fbxoVar;
                emmt emmtVar2 = emmtVar;
                emlg emlgVar2 = emlgVar;
                emhv emhvVar = emlgVar2.d;
                if (emhvVar == null) {
                    emhvVar = emhv.a;
                }
                if (emhvVar.equals(emhv.a)) {
                    fbxoVar = fbxo.a;
                } else {
                    try {
                        InputStream f = emmtVar2.f(emhvVar);
                        try {
                            fbxoVar = (fbxo) eyfy.parseFrom(fbxo.a, f, eyfc.a());
                            if (f != null) {
                                f.close();
                            }
                        } finally {
                        }
                    } catch (IOException e) {
                        ((enrr) ((enrr) ((enrr) emoz.a.i()).g(e)).h("com/google/chat/smartmessaging/smartreply/android/providers/ConversationStarterSuggestionProvider", "readConversationStartersConfigFromFile", (char) 142, "ConversationStarterSuggestionProvider.java")).q("Unable to parse conversation starter config");
                        fbxoVar = fbxo.a;
                    }
                }
                int i = emlgVar2.b;
                int i2 = (i & 4) != 0 ? emlgVar2.e : fbxoVar.c;
                int min = Math.min((i & 8) != 0 ? emlgVar2.f : fbxoVar.d, i2);
                engw engwVar = (engw) Collection.EL.stream(fbxoVar.b).map(new Function() { // from class: emop
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        fbxq fbxqVar = empl.a;
                        return new empk((fbxm) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collector.CC.of(new Supplier() { // from class: emom
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        int i3 = engw.d;
                        return new engr();
                    }
                }, new BiConsumer() { // from class: emoq
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        ((engr) obj).h(obj2);
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                }, new BinaryOperator() { // from class: emor
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        engr engrVar = (engr) obj;
                        engrVar.j(((engr) obj2).g());
                        return engrVar;
                    }
                }, new Function() { // from class: emos
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((engr) obj).g();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Collector.Characteristics[0]));
                if (engwVar == null) {
                    throw new NullPointerException("Null conversationStarters");
                }
                emoz emozVar = emoz.this;
                emok emokVar = new emok(engwVar, i2, min);
                emozVar.b = emokVar.b;
                emozVar.c = emokVar.c;
                return emokVar.a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
    @Override // defpackage.empj
    public final ArrayList a(fbts fbtsVar, Locale locale) {
        ArrayList arrayList = new ArrayList();
        if (!this.d.isZero() && !this.d.isNegative() && (fbtsVar.c & 2) != 0) {
            fbup fbupVar = fbtsVar.f;
            if (fbupVar == null) {
                fbupVar = fbup.a;
            }
            if (fbupVar.b.size() != 0) {
                fbup fbupVar2 = fbtsVar.f;
                fbup fbupVar3 = fbupVar2 == null ? fbup.a : fbupVar2;
                if (fbupVar2 == null) {
                    fbupVar2 = fbup.a;
                }
                long j = ((fbun) fbupVar3.b.get(fbupVar2.b.size() - 1)).e;
                Instant ofEpochSecond = Instant.ofEpochSecond(eyki.g(j / 1000000, (int) ((j % 1000000) * 1000)).b);
                Instant ofEpochMilli = Instant.ofEpochMilli(fbtsVar.l);
                if (Duration.between(ofEpochSecond, ofEpochMilli).compareTo(this.d) < 0) {
                    long epochMilli = ofEpochSecond.plus(this.d).toEpochMilli();
                    fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
                    fbtp fbtpVar = fbtp.a;
                    fbwzVar.copyOnWrite();
                    fbxa fbxaVar = (fbxa) fbwzVar.instance;
                    fbtpVar.getClass();
                    fbxaVar.d = fbtpVar;
                    fbxaVar.c = 24;
                    fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
                    fbwxVar.copyOnWrite();
                    ((fbwy) fbwxVar.instance).p = epochMilli;
                    fbri fbriVar = fbri.EXPIRATION_SENTINEL;
                    fbwxVar.copyOnWrite();
                    ((fbwy) fbwxVar.instance).l = fbriVar.a();
                    fbrg fbrgVar = fbrg.CONVERSATION_STARTER;
                    fbwxVar.copyOnWrite();
                    ((fbwy) fbwxVar.instance).g = fbrgVar.a();
                    fbwzVar.copyOnWrite();
                    fbxa fbxaVar2 = (fbxa) fbwzVar.instance;
                    fbwy fbwyVar = (fbwy) fbwxVar.build();
                    fbwyVar.getClass();
                    fbxaVar2.e = fbwyVar;
                    fbxaVar2.b |= 1;
                    arrayList.add((fbxa) fbwzVar.build());
                    return arrayList;
                }
                final LocalDateTime L = ofEpochMilli.atZone(ZoneId.systemDefault()).L();
                ArrayList arrayList2 = (ArrayList) Collection.EL.stream((engw) this.e.get()).map(new Function() { // from class: emot
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return new empl((empk) obj, LocalDateTime.this);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: emou
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
                        empl emplVar = (empl) obj;
                        if (!emplVar.i) {
                            return false;
                        }
                        if (emplVar.g.equals(empl.c) && emplVar.h.equals(empl.c)) {
                            return true;
                        }
                        return (emplVar.f.getYear() >= emplVar.d.getYear() && emplVar.f.getYear() <= emplVar.e.getYear()) && (emplVar.f.getMonthValue() >= emplVar.d.getMonthValue() && emplVar.f.getMonthValue() <= emplVar.e.getMonthValue()) && emplVar.f.toLocalTime().isAfter(emplVar.d.toLocalTime()) && emplVar.f.toLocalTime().isBefore(emplVar.e.toLocalTime());
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: emov
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                Collections.shuffle(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                arrayList3.addAll((java.util.Collection) Collection.EL.stream(arrayList2).filter(new Predicate() { // from class: emow
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
                        return ((empl) obj).k;
                    }
                }).map(new Function() { // from class: emox
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((empl) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).limit(this.b).collect(Collectors.toCollection(new Supplier() { // from class: emov
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                })));
                arrayList4.addAll((java.util.Collection) Collection.EL.stream(arrayList2).filter(new Predicate() { // from class: emoy
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
                        return ((empl) obj).j;
                    }
                }).map(new Function() { // from class: emon
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((empl) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).limit(this.c).collect(Collectors.toCollection(new Supplier() { // from class: emov
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                })));
                Collections.shuffle(arrayList3);
                Collections.shuffle(arrayList4);
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                int i = this.c;
                ArrayList arrayList6 = arrayList4;
                if (size > i) {
                    arrayList6 = arrayList4.subList(0, i);
                }
                arrayList5.addAll(arrayList6);
                int size2 = arrayList5.size();
                int i2 = this.b;
                if (size2 < i2) {
                    int size3 = i2 - arrayList5.size();
                    int size4 = arrayList3.size();
                    ArrayList arrayList7 = arrayList3;
                    if (size4 > size3) {
                        arrayList7 = arrayList3.subList(0, size3);
                    }
                    arrayList5.addAll(arrayList7);
                }
                Collections.shuffle(arrayList5);
                return arrayList5;
            }
        }
        return arrayList;
    }

    @Override // defpackage.empj
    public final /* synthetic */ void b() {
    }
}
