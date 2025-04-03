package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edxx {
    public final int a;
    public final long b;
    private final List c;
    private final ExecutorService d;
    private final edwg e;

    /* JADX WARN: Multi-variable type inference failed */
    public edxx(emro emroVar, ExecutorService executorService, edwg edwgVar) {
        emrq emrqVar = (emrq) emroVar.b.get(0);
        this.a = emrqVar.b;
        emst emstVar = (emst) emrqVar.c.get(0);
        this.b = emstVar.b;
        this.c = !emstVar.d.isEmpty() ? emstVar.d : emrqVar.d;
        this.d = executorService;
        this.e = edwgVar;
    }

    public final elfl a() {
        if (this.c.isEmpty()) {
            return elfo.e(enpe.c);
        }
        if (edvz.b(this.a, this.b)) {
            edwa a = edvz.a(this.a, this.b);
            return a.a() == 2 ? elfo.d(new edxw("Cached error attempting to extract the Experiment IDs from Phenotype")) : elfo.e(a.b());
        }
        edwg edwgVar = this.e;
        Stream stream = Collection.EL.stream(new HashSet(this.c));
        final ecxc ecxcVar = edwgVar.b;
        ecxcVar.getClass();
        Stream map = stream.map(new Function() { // from class: edwe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ecxc.this.d((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        final engw engwVar = (engw) map.collect(endq.a);
        return elfl.g(elfo.j(engwVar).a(new Callable() { // from class: edwf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                enja enjaVar = new enja(enoe.a);
                engw engwVar2 = engw.this;
                int size = engwVar2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    try {
                        try {
                            enjaVar.o(((enip) Collection.EL.stream(((ecwy) erqt.q((ListenableFuture) engwVar2.get(i2))).d).map(new Function() { // from class: edwb
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    try {
                                        eulw eulwVar = (eulw) eyfy.parseFrom(eulw.a, (eyee) obj);
                                        int i3 = eulwVar.b;
                                        int a2 = eulv.a(i3);
                                        if (a2 == 0) {
                                            a2 = 1;
                                        }
                                        if (a2 - 1 != 3) {
                                            int a3 = eulv.a(i3);
                                            throw new IllegalArgumentException("Unsupported token format version: ".concat((a3 == 0 || a3 == 1) ? "UNKNOWN" : a3 != 2 ? a3 != 3 ? "VERSION_3" : "VERSION_2" : "VERSION_1"));
                                        }
                                        byte[] I = eulwVar.c.I();
                                        for (int i4 = 0; i4 < I.length; i4++) {
                                            I[i4] = (byte) (I[i4] ^ 7);
                                        }
                                        try {
                                            euls eulsVar = (euls) eyfy.parseFrom(euls.a, I);
                                            eulg eulgVar = (eulg) eulh.a.createBuilder();
                                            List a4 = eulf.a(eulsVar.b);
                                            eulgVar.copyOnWrite();
                                            eulh eulhVar = (eulh) eulgVar.instance;
                                            eygi eygiVar = eulhVar.b;
                                            if (!eygiVar.c()) {
                                                eulhVar.b = eyfy.mutableCopy(eygiVar);
                                            }
                                            eydl.addAll(a4, eulhVar.b);
                                            List a5 = eulf.a(eulsVar.c);
                                            eulgVar.copyOnWrite();
                                            eulh eulhVar2 = (eulh) eulgVar.instance;
                                            eygi eygiVar2 = eulhVar2.c;
                                            if (!eygiVar2.c()) {
                                                eulhVar2.c = eyfy.mutableCopy(eygiVar2);
                                            }
                                            eydl.addAll(a5, eulhVar2.c);
                                            List a6 = eulf.a(eulsVar.d);
                                            eulgVar.copyOnWrite();
                                            eulh eulhVar3 = (eulh) eulgVar.instance;
                                            eygi eygiVar3 = eulhVar3.d;
                                            if (!eygiVar3.c()) {
                                                eulhVar3.d = eyfy.mutableCopy(eygiVar3);
                                            }
                                            eydl.addAll(a6, eulhVar3.d);
                                            List a7 = eulf.a(eulsVar.e);
                                            eulgVar.copyOnWrite();
                                            eulh eulhVar4 = (eulh) eulgVar.instance;
                                            eygi eygiVar4 = eulhVar4.e;
                                            if (!eygiVar4.c()) {
                                                eulhVar4.e = eyfy.mutableCopy(eygiVar4);
                                            }
                                            eydl.addAll(a7, eulhVar4.e);
                                            return (eulh) eulgVar.build();
                                        } catch (eygu e) {
                                            throw new IllegalArgumentException("Unable to decode the v2 device experiment token", e);
                                        }
                                    } catch (eygu e2) {
                                        throw new IllegalArgumentException("Unable to parse the given token.", e2);
                                    }
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).flatMap(new Function() { // from class: edwc
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    eulh eulhVar = (eulh) obj;
                                    return Stream.CC.of((Object[]) new Stream[]{Collection.EL.stream(eulhVar.d), Collection.EL.stream(eulhVar.b), Collection.EL.stream(eulhVar.e), Collection.EL.stream(eulhVar.c)});
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).flatMap(Function$CC.identity()).map(new Function() { // from class: edwd
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(((Integer) obj).intValue());
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(endq.b)).g());
                        } catch (Throwable th) {
                            ((enrr) ((enrr) ((enrr) edwg.a.i()).g(th)).h("com/google/android/libraries/privatetelemetry/mobalt/experiments/PhenotypeExperimentIdsExtractor", "getExperimentIds", 'D', "PhenotypeExperimentIdsExtractor.java")).q("Couldn't decode ExperimentToken");
                            return edvu.a;
                        }
                    } catch (Throwable th2) {
                        ((enrr) ((enrr) ((enrr) edwg.a.i()).g(th2)).h("com/google/android/libraries/privatetelemetry/mobalt/experiments/PhenotypeExperimentIdsExtractor", "getExperimentIds", '<', "PhenotypeExperimentIdsExtractor.java")).q("Couldn't extract ExperimentTokens");
                    }
                }
                enjc g = enjaVar.g();
                g.getClass();
                return new edvv(g);
            }
        }, edwgVar.c)).h(new emwl() { // from class: edxv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                edxx edxxVar = edxx.this;
                edwa edwaVar = (edwa) obj;
                edvz.a.put(new edvx(edxxVar.a, edxxVar.b), edwaVar);
                if (edwaVar.a() != 2) {
                    return edwaVar.b();
                }
                throw new edxw("Error attempting to extract the Experiment IDs from Phenotype");
            }
        }, this.d);
    }

    public final enjc b() {
        if (this.c.isEmpty()) {
            return enpe.c;
        }
        if (!edvz.b(this.a, this.b)) {
            return enpe.c;
        }
        edwa a = edvz.a(this.a, this.b);
        emxf.m(a.a() == 1, "Expected to find experiment IDs in the cache, instead found an error");
        return a.b();
    }
}
