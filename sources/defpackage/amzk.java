package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amzk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amzm b;
    final /* synthetic */ engw c;
    final /* synthetic */ engw d;
    final /* synthetic */ Optional e;
    final /* synthetic */ boolean f;
    final /* synthetic */ Integer g;
    final /* synthetic */ boolean h;
    final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amzk(amzm amzmVar, engw engwVar, engw engwVar2, Optional optional, boolean z, Integer num, boolean z2, boolean z3, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amzmVar;
        this.c = engwVar;
        this.d = engwVar2;
        this.e = optional;
        this.f = z;
        this.g = num;
        this.h = z2;
        this.i = z3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amzk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object b;
        int i;
        final List b2;
        boolean I;
        ffhh ffhhVar = ffhh.a;
        int i2 = this.a;
        ffci.b(obj);
        if (i2 != 0) {
            b = obj;
        } else {
            amzm amzmVar = this.b;
            this.a = 1;
            b = amzmVar.b(this);
            if (b == ffhhVar) {
                return ffhhVar;
            }
        }
        final int intValue = ((Number) b).intValue();
        final amzm amzmVar2 = this.b;
        final engw engwVar = this.c;
        engw engwVar2 = this.d;
        Optional optional = this.e;
        boolean z = this.f;
        Integer num = this.g;
        boolean z2 = this.h;
        boolean z3 = this.i;
        if (engwVar.isEmpty() && engwVar2.isEmpty() && !optional.isPresent()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ecri d = ((ecrj) amzmVar2.b.b()).d();
        d.getClass();
        try {
            ekzz f = eleg.f("ConversationSearcher#findAllConversationPartialMatchInternal");
            try {
                ArrayList arrayList = new ArrayList();
                if (z) {
                    i = 1;
                    b2 = ffdx.g(1, 2);
                } else {
                    i = 1;
                    b2 = ffdx.b(0);
                }
                ankg a = ankj.a();
                a.z("findAllConversationPartialMatchInternal");
                a.e(new Function() { // from class: amyr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        anki ankiVar = (anki) obj2;
                        anki ankiVar2 = amzm.a;
                        ankiVar.b(b2);
                        ankiVar.c(engwVar.size());
                        return ankiVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (((auvs) amzmVar2.c.b()).a() && z2) {
                    a.d(amzm.a);
                }
                ankd[] ankdVarArr = new ankd[i];
                ankdVarArr[0] = new ankd(ankj.b.a);
                a.c(ankdVarArr);
                a.r();
                dtsu o = a.b().o();
                try {
                    ankb ankbVar = (ankb) o;
                    while (ankbVar.moveToNext() && (num == null || arrayList.size() < num.intValue())) {
                        Stream of = Stream.CC.of((Object[]) new String[][]{ankbVar.h(), ankbVar.i(), ankbVar.j()});
                        final amzf amzfVar = amzf.a;
                        Stream flatMap = of.flatMap(new Function() { // from class: amys
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                anki ankiVar = amzm.a;
                                return ffji.this.invoke(obj2);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        final ffji ffjiVar = new ffji() { // from class: amyt
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                String str = (String) obj2;
                                anki ankiVar = amzm.a;
                                return Boolean.valueOf(str != null);
                            }
                        };
                        final enip enipVar = (enip) flatMap.filter(new Predicate() { // from class: amyu
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
                                anki ankiVar = amzm.a;
                                return ((Boolean) ffji.this.invoke(obj2)).booleanValue();
                            }
                        }).collect(endq.b);
                        enipVar.getClass();
                        String f2 = ankbVar.f();
                        ConversationIdType d2 = ankbVar.d();
                        engw engwVar3 = engwVar;
                        f = eleg.f("ConversationSearcherImpl#isPartiallMatch");
                        try {
                            if (amzmVar2.c(z3, d2)) {
                                ffig.a(f, null);
                                engwVar = engwVar3;
                            } else {
                                Stream stream = Collection.EL.stream(engwVar3);
                                engw engwVar4 = engwVar2;
                                final ffji ffjiVar2 = new ffji() { // from class: amyn
                                    @Override // defpackage.ffji
                                    public final Object invoke(Object obj2) {
                                        String str = (String) obj2;
                                        str.getClass();
                                        return Boolean.valueOf(amzm.this.d(enipVar, str, intValue));
                                    }
                                };
                                Optional optional2 = optional;
                                if (stream.allMatch(new Predicate() { // from class: amyo
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
                                        anki ankiVar = amzm.a;
                                        return ((Boolean) ffji.this.invoke(obj2)).booleanValue();
                                    }
                                })) {
                                    if (engwVar4.isEmpty() && optional2.isEmpty()) {
                                        ffig.a(f, null);
                                    } else {
                                        if (!engwVar4.isEmpty()) {
                                            Stream stream2 = Collection.EL.stream(engwVar4);
                                            final ffji ffjiVar3 = new ffji() { // from class: amyp
                                                @Override // defpackage.ffji
                                                public final Object invoke(Object obj2) {
                                                    String str = (String) obj2;
                                                    str.getClass();
                                                    return Boolean.valueOf(amzm.this.d(enipVar, str, intValue));
                                                }
                                            };
                                            if (stream2.anyMatch(new Predicate() { // from class: amyq
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
                                                    anki ankiVar = amzm.a;
                                                    return ((Boolean) ffji.this.invoke(obj2)).booleanValue();
                                                }
                                            })) {
                                                ffig.a(f, null);
                                            }
                                        }
                                        if (optional2.isPresent() && f2 != null) {
                                            Locale locale = amzmVar2.f;
                                            locale.getClass();
                                            String lowerCase = f2.toLowerCase(locale);
                                            lowerCase.getClass();
                                            String str = (String) optional2.get();
                                            Locale locale2 = amzmVar2.f;
                                            locale2.getClass();
                                            String lowerCase2 = str.toLowerCase(locale2);
                                            lowerCase2.getClass();
                                            I = ffpc.I(lowerCase, lowerCase2, false);
                                            if (I) {
                                                ffig.a(f, null);
                                            }
                                        }
                                    }
                                    arrayList.add(ankbVar.d());
                                    engwVar2 = engwVar4;
                                    engwVar = engwVar3;
                                    optional = optional2;
                                }
                                ffig.a(f, null);
                                engwVar2 = engwVar4;
                                engwVar = engwVar3;
                                optional = optional2;
                            }
                        } finally {
                        }
                    }
                    ffig.a(o, null);
                    engw a2 = engq.a(arrayList);
                    ffig.a(f, null);
                    ((ecrj) amzmVar2.b.b()).f(d, new ecda("ConversationSearcher#findAllConversationPartialMatchInternal"), null, ecrh.SUCCESS);
                    ArrayList arrayList2 = new ArrayList(ffdx.n(a2, 10));
                    Iterator<E> it = a2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new BugleConversationId((ConversationIdType) it.next()));
                    }
                    return engq.a(arrayList2);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            ((ecrj) amzmVar2.b.b()).f(d, new ecda("ConversationSearcher#findAllConversationPartialMatchInternal"), null, ecrh.SUCCESS);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amzk(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ffguVar);
    }
}
