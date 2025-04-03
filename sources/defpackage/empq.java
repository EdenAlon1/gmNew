package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class empq implements empt {
    public final enip a;
    private final exdb b;
    private final emkc c;

    public empq(emkc emkcVar, exdb exdbVar) {
        this.c = emkcVar;
        this.b = exdbVar;
        this.a = enip.o(new eygk(emkcVar.m, emkc.a));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.empt
    public final List a(fbts fbtsVar, final List list) {
        char c;
        int i;
        int i2 = 0;
        enhk enhkVar = (enhk) IntStream.CC.range(0, list.size()).boxed().collect(endq.a(new Function() { // from class: empo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return emps.a((fbxa) list.get(((Integer) obj).intValue()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Function$CC.identity()));
        int i3 = engw.d;
        engw engwVar = enou.a;
        if (!this.a.isEmpty()) {
            engwVar = (engw) Collection.EL.stream(list).filter(new Predicate() { // from class: empp
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
                    fbwy fbwyVar = ((fbxa) obj).e;
                    if (fbwyVar == null) {
                        fbwyVar = fbwy.b;
                    }
                    fbri b = fbri.b(fbwyVar.l);
                    if (b == null) {
                        b = fbri.UNRECOGNIZED;
                    }
                    return empq.this.a.contains(b);
                }
            }).collect(endq.a);
            list.removeAll(engwVar);
        }
        engr engrVar = new engr();
        fbup fbupVar = fbtsVar.f;
        if (fbupVar == null) {
            fbupVar = fbup.a;
        }
        List a = emnp.a(fbupVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            engrVar.h(new exde((fbxa) it.next()));
        }
        exdf exdfVar = new exdf(engrVar.g(), a);
        exdb exdbVar = this.b;
        emkc emkcVar = this.c;
        boolean z = emkcVar.i;
        int a2 = emjz.a(emkcVar.f);
        if (a2 == 0) {
            a2 = 1;
        }
        String str = a2 != 1 ? a2 != 2 ? a2 != 3 ? "FILTER_TOP_IMPRESSION" : "FILTER_EACH_BY_RERANKER_SCORE" : "FILTER_ALL_BY_TOP_RERANKER_SCORE" : "NO_FILTERING";
        switch (str.hashCode()) {
            case -401835270:
                if (str.equals("FILTER_TOP_IMPRESSION")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -313826004:
                if (str.equals("FILTER_ALL_BY_TOP_RERANKER_SCORE")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1157076240:
                if (str.equals("FILTER_EACH_BY_RERANKER_SCORE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1669599308:
                if (str.equals("NO_FILTERING")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            i = 1;
        } else if (c == 1) {
            i = 2;
        } else if (c == 2) {
            i = 3;
        } else {
            if (c != 3) {
                throw new IllegalArgumentException();
            }
            i = 4;
        }
        float f = emkcVar.g;
        int i4 = emkcVar.j;
        if (i4 == 0) {
            i4 = emkcVar.e;
        }
        exdi a3 = exdbVar.a(exdfVar, z, i, f, i4);
        ArrayList arrayList = new ArrayList();
        int a4 = emjz.a(this.c.f);
        if (a4 == 0 || a4 != 4) {
            Iterator it2 = a3.a.iterator();
            while (it2.hasNext()) {
                arrayList.add(emps.d(((exdh) it2.next()).a.a, Optional.of(Double.valueOf(r6.b)), 4));
            }
        } else if (!a3.b.isEmpty()) {
            Iterator it3 = ((exdg) a3.b.get(0)).a.a.iterator();
            while (it3.hasNext()) {
                arrayList.add(emps.d(((exde) it3.next()).a, Optional.of(Double.valueOf(((exdg) a3.b.get(0)).b)), 6));
            }
        }
        if (!this.a.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            while (i2 < arrayList.size() && i5 < engwVar.size()) {
                fbxa fbxaVar = (fbxa) arrayList.get(i2);
                fbxa fbxaVar2 = (fbxa) engwVar.get(i5);
                int size = arrayList2.size();
                if (this.c.i) {
                    if (((Integer) enhkVar.get(emps.a(fbxaVar2))).intValue() == size) {
                        arrayList2.add(fbxaVar2);
                        i5++;
                    } else {
                        arrayList2.add(fbxaVar);
                        i2++;
                    }
                } else if (((Integer) enhkVar.get(emps.a(fbxaVar))).intValue() > ((Integer) enhkVar.get(emps.a(fbxaVar2))).intValue()) {
                    arrayList2.add(fbxaVar2);
                    i5++;
                } else {
                    arrayList2.add(fbxaVar);
                    i2++;
                }
            }
            while (i5 < engwVar.size()) {
                arrayList2.add((fbxa) engwVar.get(i5));
                i5++;
            }
            while (i2 < arrayList.size()) {
                arrayList2.add((fbxa) arrayList.get(i2));
                i2++;
            }
            arrayList = arrayList2;
        }
        if (this.c.h) {
            emps.c(arrayList);
        }
        return arrayList;
    }
}
