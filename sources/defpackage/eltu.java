package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eltu implements eloy {
    public final elnz a;
    public final eluv b;
    private final Optional c;
    private final Object d;
    private final Optional e;
    private final Executor f;

    public eltu(eluv eluvVar, Optional optional, Object obj, elnz elnzVar, Optional optional2, Executor executor) {
        this.b = eluvVar;
        this.c = optional;
        this.d = obj;
        this.a = elnzVar;
        this.e = optional2;
        this.f = executor;
    }

    @Override // defpackage.elny
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.eloy
    public final elzf d() {
        elze elzeVar = (elze) elzf.a.createBuilder();
        eluv eluvVar = this.b;
        String str = eluvVar.a;
        elzeVar.copyOnWrite();
        ((elzf) elzeVar.instance).b = str;
        Stream stream = Collection.EL.stream(eluvVar.c);
        final Object obj = this.d;
        Iterable iterable = (Iterable) stream.map(new Function() { // from class: elus
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                Object apply;
                apply = ((eluy) obj2).c().apply(obj);
                return (Optional) apply;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: elut
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
        }).map(new Function() { // from class: eluu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return (elzi) ((Optional) obj2).get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(elvb.a());
        elzeVar.copyOnWrite();
        elzf elzfVar = (elzf) elzeVar.instance;
        eygr eygrVar = elzfVar.d;
        if (!eygrVar.c()) {
            elzfVar.d = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, elzfVar.d);
        elze elzeVar2 = (elze) ((elzf) elzeVar.build()).toBuilder();
        if (this.c.isPresent()) {
            String str2 = (String) this.c.get();
            elzeVar2.copyOnWrite();
            ((elzf) elzeVar2.instance).c = str2;
        }
        if (this.e.isPresent()) {
            emad emadVar = (emad) emae.a.createBuilder();
            Boolean bool = (Boolean) this.e.get();
            bool.booleanValue();
            emadVar.copyOnWrite();
            emae emaeVar = (emae) emadVar.instance;
            emaeVar.b = 1;
            emaeVar.c = bool;
            elzeVar2.copyOnWrite();
            elzf elzfVar2 = (elzf) elzeVar2.instance;
            emae emaeVar2 = (emae) emadVar.build();
            emaeVar2.getClass();
            eygr eygrVar2 = elzfVar2.f;
            if (!eygrVar2.c()) {
                elzfVar2.f = eyfy.mutableCopy(eygrVar2);
            }
            elzfVar2.f.add(emaeVar2);
        }
        return (elzf) elzeVar2.build();
    }

    @Override // defpackage.eloy
    public final void e(elpa elpaVar, elmy elmyVar) {
        Object obj;
        Map map = (Map) Collection.EL.stream(((elpb) elpaVar).a.entrySet()).collect(Collectors.collectingAndThen(Collectors.toMap(new Function() { // from class: elto
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
        }, new Function() { // from class: eltp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return (List) Collection.EL.stream((List) ((Map.Entry) obj2).getValue()).filter(new Predicate() { // from class: eltr
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
                        return (((elzr) obj3).b & 1) != 0;
                    }
                }).map(new Function() { // from class: elts
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        emac emacVar = ((elzr) obj3).c;
                        return emacVar == null ? emac.a : emacVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(elvb.a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }), new Function() { // from class: elva
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return DesugarCollections.unmodifiableMap((Map) obj2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        try {
            eluv eluvVar = this.b;
            obj = eluvVar.b.get();
            elpd elpdVar = (elpd) obj;
            for (eluy eluyVar : eluvVar.c) {
                List list = (List) map.get(eluyVar.b());
                if (list != null) {
                    try {
                        eluyVar.a().a(elpdVar, list);
                    } catch (eltn e) {
                        throw new eltn(String.format("Failed to parse parameter '%s' from assistant because of failure: %s", eluyVar.b(), e.getMessage()), e);
                    }
                }
            }
            try {
                final Object a = elpdVar.a();
                final ListenableFuture a2 = kfg.a(new kfd() { // from class: elph
                    @Override // defpackage.kfd
                    public final Object a(kfb kfbVar) {
                        return Boolean.valueOf(kfbVar.b(null));
                    }
                });
                final Function function = new Function() { // from class: eltq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return eltu.this.a.b(a);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                final Executor executor = this.f;
                elpn.a(kfg.a(new kfd() { // from class: elpi
                    public final /* synthetic */ String d = "actionExecutor";

                    @Override // defpackage.kfd
                    public final Object a(kfb kfbVar) {
                        elpn.a(ListenableFuture.this, new elpl(function, kfbVar), executor);
                        return this.d;
                    }
                }), new eltt(this, elmyVar), this.f);
            } catch (IllegalStateException e2) {
                throw new eltn(String.format("Failed to build Argument class because of failure: %s", e2.getMessage()), e2);
            }
        } catch (eltn e3) {
            if (e3.getMessage() != null) {
                String message = e3.getMessage();
                if (elvc.a != null) {
                    Log.e("ActionCapability", message);
                }
            }
            elmyVar.a(6);
        }
    }

    @Override // defpackage.eloy
    public final /* synthetic */ void f() {
    }
}
