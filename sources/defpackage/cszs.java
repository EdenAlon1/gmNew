package defpackage;

import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cszs {
    public final cszl a;
    public final errl b;
    public final Set c;
    public final cszb d;
    public final ffbr e;
    private final ejlc f;

    public cszs(cszl cszlVar, errl errlVar, Set set, ctac ctacVar, ffbr ffbrVar) {
        this.a = cszlVar;
        this.b = errlVar;
        this.c = set;
        this.d = ctacVar;
        this.e = ffbrVar;
        this.f = new ejlc(new erog() { // from class: cszq
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final cszs cszsVar = cszs.this;
                return elfl.g(cszsVar.a.i.c()).i(new eroh() { // from class: cszr
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        enij a;
                        int i;
                        final cszs cszsVar2 = cszs.this;
                        Integer num = (Integer) obj;
                        boolean a2 = ((ersq) ((auad) ((cszy) cszsVar2.e.b()).a).a.b()).a("bugle.survey_map_bugfix");
                        Set set2 = cszsVar2.c;
                        cszb cszbVar = cszsVar2.d;
                        Integer valueOf = Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY);
                        double d = eobe.a;
                        if (a2) {
                            Stream sorted = Collection.EL.stream(set2).filter(new Predicate() { // from class: cszu
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
                                    return !((csza) obj2).d().isEmpty();
                                }
                            }).sorted(new Comparator() { // from class: cszv
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    return ((csza) obj2).d().compareTo(((csza) obj3).d());
                                }
                            });
                            int i2 = engw.d;
                            engw engwVar = (engw) sorted.collect(endq.a);
                            enij enijVar = enij.a;
                            ArrayList arrayList = new ArrayList();
                            int size = engwVar.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                csza cszaVar = (csza) engwVar.get(i3);
                                double a3 = cszaVar.a() + d;
                                enop d2 = enop.d(Integer.valueOf(cszy.a(d)), Integer.valueOf(cszy.a(a3)));
                                if (!d2.h()) {
                                    enih.b(d2, cszaVar, arrayList);
                                    d = a3;
                                }
                            }
                            enih.b(enop.c(Integer.valueOf(cszy.a(d)), valueOf), cszbVar, arrayList);
                            a = enih.a(arrayList);
                        } else {
                            Stream sorted2 = Collection.EL.stream(set2).filter(new Predicate() { // from class: cszw
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
                                    return !((csza) obj2).d().isEmpty();
                                }
                            }).sorted(new Comparator() { // from class: cszx
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    return ((csza) obj2).d().compareTo(((csza) obj3).d());
                                }
                            });
                            int i4 = engw.d;
                            engw engwVar2 = (engw) sorted2.collect(endq.a);
                            enij enijVar2 = enij.a;
                            ArrayList arrayList2 = new ArrayList();
                            int size2 = engwVar2.size();
                            double d3 = 0.0d;
                            for (int i5 = 0; i5 < size2; i5++) {
                                csza cszaVar2 = (csza) engwVar2.get(i5);
                                double a4 = cszaVar2.a();
                                if (a4 != eobe.a) {
                                    double d4 = a4 + d3;
                                    enih.b(enop.d(Integer.valueOf(cszy.a(d3)), Integer.valueOf(cszy.a(d4))), cszaVar2, arrayList2);
                                    d3 = d4;
                                }
                            }
                            enih.b(enop.c(Integer.valueOf(cszy.a(d3)), valueOf), cszbVar, arrayList2);
                            a = enih.a(arrayList2);
                        }
                        emwl emwlVar = new emwl() { // from class: enig
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return ((enop) obj2).b;
                            }
                        };
                        ener enerVar = new ener(num);
                        engw engwVar3 = a.b;
                        enoe enoeVar = enoe.a;
                        List g = enkr.g(engwVar3, emwlVar);
                        if (!(g instanceof RandomAccess)) {
                            g = new ArrayList(g);
                        }
                        int size3 = g.size() - 1;
                        int i6 = 0;
                        while (true) {
                            if (i6 > size3) {
                                i = i6 - 1;
                                break;
                            }
                            int i7 = (i6 + size3) >>> 1;
                            int compare = enoeVar.compare(enerVar, g.get(i7));
                            if (compare >= 0) {
                                if (compare <= 0) {
                                    g.subList(i6, size3 + 1);
                                    i = i6 + (i7 - i6);
                                    break;
                                }
                                i6 = i7 + 1;
                            } else {
                                size3 = i7 - 1;
                            }
                        }
                        Object obj2 = null;
                        if (i != -1 && ((enop) a.b.get(i)).a(num)) {
                            obj2 = a.c.get(i);
                        }
                        final cszb cszbVar2 = (cszb) obj2;
                        return cszbVar2 instanceof csza ? ((csza) cszbVar2).b().h(new emwl() { // from class: cszp
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return ((Boolean) obj3).booleanValue() ? cszbVar2 : cszs.this.d;
                            }
                        }, cszsVar2.b) : elfo.e(cszsVar2.d);
                    }
                }, cszsVar.b);
            }
        }, errlVar);
    }

    public final elfl a() {
        if (((Boolean) cszt.s.e()).booleanValue()) {
            return elfo.e((cszb) this.c.iterator().next());
        }
        ejlc ejlcVar = this.f;
        ejlcVar.getClass();
        return elfl.g(ejlcVar.c());
    }
}
