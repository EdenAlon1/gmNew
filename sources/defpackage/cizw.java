package defpackage;

import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cizw implements ciwq {
    @Override // defpackage.ciwq
    public final /* bridge */ /* synthetic */ ciwl a(Object obj) {
        cjax cjaxVar = (cjax) obj;
        ciwk ciwkVar = (ciwk) ciwl.a.createBuilder();
        cixf cixfVar = cixf.NT_INCOMING_MESSAGE;
        ciwkVar.copyOnWrite();
        ciwl ciwlVar = (ciwl) ciwkVar.instance;
        ciwlVar.e = cixfVar.j;
        ciwlVar.b |= 1;
        ciwkVar.copyOnWrite();
        ciwl ciwlVar2 = (ciwl) ciwkVar.instance;
        cjaxVar.getClass();
        ciwlVar2.d = cjaxVar;
        ciwlVar2.c = 3;
        return (ciwl) ciwkVar.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ciwq
    public final engw b(engw engwVar) {
        int i;
        emxf.a(!engwVar.isEmpty());
        ciwk ciwkVar = (ciwk) ciwl.a.createBuilder();
        int i2 = 0;
        cixf b = cixf.b(((ciwl) engwVar.get(0)).e);
        if (b == null) {
            b = cixf.NT_UNKNOWN;
        }
        ciwkVar.copyOnWrite();
        ciwl ciwlVar = (ciwl) ciwkVar.instance;
        ciwlVar.e = b.j;
        ciwlVar.b |= 1;
        boolean allMatch = Collection.EL.stream(engwVar).allMatch(new Predicate() { // from class: cizt
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
                return ((ciwl) obj).f;
            }
        });
        ciwkVar.copyOnWrite();
        ciwl ciwlVar2 = (ciwl) ciwkVar.instance;
        ciwlVar2.b |= 2;
        ciwlVar2.f = allMatch;
        engw engwVar2 = (engw) Collection.EL.stream(engwVar).filter(new Predicate() { // from class: cizu
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
                return ((ciwl) obj).c == 3;
            }
        }).map(new Function() { // from class: cizv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ciwl ciwlVar3 = (ciwl) obj;
                return ciwlVar3.c == 3 ? (cjax) ciwlVar3.d : cjax.a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a);
        cjav cjavVar = (cjav) cjax.a.createBuilder();
        boolean anyMatch = Collection.EL.stream(engwVar2).anyMatch(new Predicate() { // from class: cizq
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
                return ((cjax) obj).e;
            }
        });
        cjavVar.copyOnWrite();
        cjax cjaxVar = (cjax) cjavVar.instance;
        cjaxVar.b |= 2;
        cjaxVar.e = anyMatch;
        boolean anyMatch2 = Collection.EL.stream(engwVar2).anyMatch(new Predicate() { // from class: cizr
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
                return ((cjax) obj).d;
            }
        });
        cjavVar.copyOnWrite();
        cjax cjaxVar2 = (cjax) cjavVar.instance;
        cjaxVar2.b |= 1;
        cjaxVar2.d = anyMatch2;
        boolean anyMatch3 = Collection.EL.stream(engwVar2).anyMatch(new Predicate() { // from class: cizs
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
                return ((cjax) obj).f;
            }
        });
        cjavVar.copyOnWrite();
        cjax cjaxVar3 = (cjax) cjavVar.instance;
        cjaxVar3.b |= 4;
        cjaxVar3.f = anyMatch3;
        HashMap hashMap = new HashMap();
        int size = engwVar2.size();
        while (i2 < size) {
            Iterator it = DesugarCollections.unmodifiableMap(((cjax) engwVar2.get(i2)).c).entrySet().iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    cjao cjaoVar = (cjao) ((cjap) entry.getValue()).toBuilder();
                    cjap cjapVar = (cjap) hashMap.get(entry.getKey());
                    if (cjapVar != null) {
                        long min = Math.min(((cjap) cjaoVar.instance).c, cjapVar.c);
                        cjaoVar.copyOnWrite();
                        cjap cjapVar2 = (cjap) cjaoVar.instance;
                        cjapVar2.b |= 1;
                        cjapVar2.c = min;
                    }
                    hashMap.put((String) entry.getKey(), (cjap) cjaoVar.build());
                }
            }
            i2 = i;
        }
        cjavVar.a(enhk.j(hashMap));
        cjax cjaxVar4 = (cjax) cjavVar.build();
        ciwkVar.copyOnWrite();
        ciwl ciwlVar3 = (ciwl) ciwkVar.instance;
        cjaxVar4.getClass();
        ciwlVar3.d = cjaxVar4;
        ciwlVar3.c = 3;
        return engw.r((ciwl) ciwkVar.build());
    }

    @Override // defpackage.ciwq
    public final /* synthetic */ Object c(ciwl ciwlVar) {
        return ciwlVar.c == 3 ? (cjax) ciwlVar.d : cjax.a;
    }
}
