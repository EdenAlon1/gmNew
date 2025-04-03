package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csww implements erqj {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ cswx b;

    public csww(cswx cswxVar, SettableFuture settableFuture) {
        this.a = settableFuture;
        this.b = cswxVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        fbed fbedVar = (fbed) fbee.a.createBuilder();
        Iterable iterable = (Iterable) Collection.EL.stream(((csxr) obj).a()).map(new Function() { // from class: cswt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                final csxn csxnVar = (csxn) obj2;
                final int i = true != ((csmz) csww.this.b.e.a()).w() ? 300000 : 1000000;
                List list = (List) DesugarArrays.stream(cswx.d).filter(new Predicate() { // from class: cswp
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
                    public final boolean test(Object obj3) {
                        cskc cskcVar = cswx.a;
                        return csxn.this.d((String) obj3) != null;
                    }
                }).map(new Function() { // from class: cswq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        cskc cskcVar = cswx.a;
                        csxo d = csxn.this.d((String) obj3);
                        d.getClass();
                        return d;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: cswr
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
                    public final boolean test(Object obj3) {
                        csxo csxoVar = (csxo) obj3;
                        cskc cskcVar = cswx.a;
                        if (csxoVar.c() == null || csxoVar.d() == null || csxoVar.a() == null) {
                            return false;
                        }
                        int i2 = i;
                        Integer a = csxoVar.a();
                        a.getClass();
                        return a.intValue() <= i2;
                    }
                }).sorted(Comparator.EL.reversed(Comparator.CC.comparingInt(new ToIntFunction() { // from class: csws
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj3) {
                        cskc cskcVar = cswx.a;
                        Integer a = ((csxo) obj3).a();
                        a.getClass();
                        return a.intValue();
                    }
                }))).limit(2L).collect(Collectors.toCollection(new Supplier() { // from class: cswj
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                if (list.isEmpty()) {
                    return fbeg.a;
                }
                if (list.size() == 1) {
                    list.add(1, (csxo) list.get(0));
                }
                fbef fbefVar = (fbef) fbeg.a.createBuilder();
                fbefVar.copyOnWrite();
                ((fbeg) fbefVar.instance).h = 3;
                fbea b = cswx.b((csxo) list.get(0));
                fbefVar.copyOnWrite();
                fbeg fbegVar = (fbeg) fbefVar.instance;
                b.getClass();
                fbegVar.f = b;
                fbegVar.b |= 1;
                fbea b2 = cswx.b((csxo) list.get(1));
                fbefVar.copyOnWrite();
                fbeg fbegVar2 = (fbeg) fbefVar.instance;
                b2.getClass();
                fbegVar2.g = b2;
                fbegVar2.b |= 2;
                String b3 = csxnVar.b();
                fbefVar.copyOnWrite();
                ((fbeg) fbefVar.instance).c = b3;
                fbefVar.copyOnWrite();
                ((fbeg) fbefVar.instance).d = "tenor.com";
                String b4 = csxnVar.b();
                fbefVar.copyOnWrite();
                ((fbeg) fbefVar.instance).e = b4;
                String a = csxnVar.a();
                fbefVar.copyOnWrite();
                ((fbeg) fbefVar.instance).i = a;
                return (fbeg) fbefVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: cswu
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
                return !((fbeg) obj2).equals(fbeg.a);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: cswv
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        fbedVar.copyOnWrite();
        fbee fbeeVar = (fbee) fbedVar.instance;
        eygr eygrVar = fbeeVar.b;
        if (!eygrVar.c()) {
            fbeeVar.b = eyfy.mutableCopy(eygrVar);
        }
        SettableFuture settableFuture = this.a;
        eydl.addAll(iterable, fbeeVar.b);
        settableFuture.set((fbee) fbedVar.build());
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (!(th instanceof fjcb)) {
            this.a.setException(th);
            return;
        }
        csjb b = cswx.a.b();
        b.I("Failed to query Tenor API.");
        b.y("status", ((fjcb) th).a);
        b.s(th);
        this.a.set(fbee.a);
    }
}
