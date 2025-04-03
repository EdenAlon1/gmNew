package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class cuyl implements eroh {
    public final /* synthetic */ cvdc a;

    @Override // defpackage.eroh
    public final ListenableFuture a(Object obj) {
        engw engwVar;
        final cvas cvasVar = (cvas) obj;
        final engw n = engw.n(DesugarCollections.unmodifiableMap(cvasVar.e).keySet());
        if (!cvasVar.h || (cvasVar.b & 2) == 0) {
            engwVar = enou.a;
        } else {
            cvah cvahVar = cvasVar.j;
            if (cvahVar == null) {
                cvahVar = cvah.a;
            }
            engwVar = engw.n(DesugarCollections.unmodifiableMap(cvahVar.f).keySet());
        }
        final engw engwVar2 = engwVar;
        final cvdc cvdcVar = this.a;
        final elfl a = elfo.a((Iterable) Collection.EL.stream(n).map(new Function() { // from class: cvcj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                String str = (String) obj2;
                str.getClass();
                eyhm eyhmVar = cvasVar.e;
                if (!eyhmVar.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                cvdc cvdcVar2 = cvdc.this;
                return cvdcVar2.c.b(((cvan) eyhmVar.get(str)).b);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a));
        final elfl a2 = elfo.a((Iterable) Collection.EL.stream(engwVar2).map(new Function() { // from class: cvck
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                String str = (String) obj2;
                cvah cvahVar2 = cvasVar.j;
                if (cvahVar2 == null) {
                    cvahVar2 = cvah.a;
                }
                str.getClass();
                eyhm eyhmVar = cvahVar2.f;
                if (!eyhmVar.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                cvdc cvdcVar2 = cvdc.this;
                return cvdcVar2.c.b(((cvaj) eyhmVar.get(str)).b);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a));
        return elfo.m(a, a2).a(new Callable() { // from class: cvcl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = (List) erqt.q(a);
                List list2 = (List) erqt.q(a2);
                HashMap hashMap = new HashMap();
                int i = 0;
                while (true) {
                    engw engwVar3 = n;
                    cvas cvasVar2 = cvas.this;
                    if (i >= engwVar3.size()) {
                        enhd enhdVar = new enhd();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            enhdVar.k((String) entry.getKey(), engw.n((java.util.Collection) entry.getValue()));
                        }
                        engw engwVar4 = engwVar2;
                        if (engwVar4.isEmpty()) {
                            return new cvbv(cvasVar2, enhdVar.c(), enoz.a);
                        }
                        HashMap hashMap2 = new HashMap();
                        for (int i2 = 0; i2 < engwVar4.size(); i2++) {
                            String str = (String) engwVar4.get(i2);
                            cvah cvahVar2 = cvasVar2.j;
                            if (cvahVar2 == null) {
                                cvahVar2 = cvah.a;
                            }
                            str.getClass();
                            eyhm eyhmVar = cvahVar2.f;
                            if (!eyhmVar.containsKey(str)) {
                                throw new IllegalArgumentException();
                            }
                            cvaj cvajVar = (cvaj) eyhmVar.get(str);
                            List list3 = (List) Map.EL.computeIfAbsent(hashMap2, str, new Function() { // from class: cvcs
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return new ArrayList();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            engw engwVar5 = (engw) list2.get(i2);
                            for (int i3 = 0; i3 < engwVar5.size(); i3++) {
                                list3.add(cvdc.a((KeyPair) engwVar5.get(i3), (cvbt) cvajVar.b.get(i3)));
                            }
                        }
                        enhd enhdVar2 = new enhd();
                        for (Map.Entry entry2 : hashMap2.entrySet()) {
                            enhdVar2.k((String) entry2.getKey(), engw.n((java.util.Collection) entry2.getValue()));
                        }
                        return new cvbv(cvasVar2, enhdVar.c(), enhdVar2.c());
                    }
                    String str2 = (String) engwVar3.get(i);
                    str2.getClass();
                    eyhm eyhmVar2 = cvasVar2.e;
                    if (!eyhmVar2.containsKey(str2)) {
                        throw new IllegalArgumentException();
                    }
                    cvan cvanVar = (cvan) eyhmVar2.get(str2);
                    List list4 = (List) Map.EL.computeIfAbsent(hashMap, str2, new Function() { // from class: cvcr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return new ArrayList();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    engw engwVar6 = (engw) list.get(i);
                    for (int i4 = 0; i4 < engwVar6.size(); i4++) {
                        list4.add(cvdc.a((KeyPair) engwVar6.get(i4), (cvbt) cvanVar.b.get(i4)));
                    }
                    i++;
                }
            }
        }, cvdcVar.d);
    }
}
