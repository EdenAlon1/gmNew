package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class copt implements copj {
    public final ffbr a;
    private final Context b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffsk f;

    public copt(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffsk ffskVar) {
        context.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffskVar.getClass();
        this.b = context;
        this.c = ffbrVar;
        this.a = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffskVar;
    }

    @Override // defpackage.copj
    public final void a(Set set) {
        set.getClass();
        ekzz f = eleg.f("SimFlagLoader#handleSimLoaded");
        try {
            Context context = this.b;
            Stream stream = Collection.EL.stream(set);
            final ffji ffjiVar = new ffji() { // from class: copo
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    cosz coszVar = (cosz) obj;
                    coszVar.getClass();
                    String str = coszVar.k;
                    str.getClass();
                    boolean z = false;
                    if (str.length() != 0) {
                        String str2 = coszVar.l;
                        str2.getClass();
                        if (str2.length() != 0) {
                            String str3 = coszVar.c;
                            str3.getClass();
                            if (str3.length() != 0) {
                                z = true;
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
            };
            Stream filter = stream.filter(new Predicate() { // from class: copp
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
                    return ((Boolean) ffji.this.invoke(obj)).booleanValue();
                }
            });
            final ffji ffjiVar2 = new ffji() { // from class: copq
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    cosz coszVar = (cosz) obj;
                    coszVar.getClass();
                    return coszVar.c;
                }
            };
            Stream map = filter.map(new Function() { // from class: copr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ffji.this.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            engw engwVar = (engw) map.collect(endq.a);
            if (!engwVar.isEmpty()) {
                ((cguc) this.d.b()).a(engwVar);
            }
            Object b = this.c.b();
            b.getClass();
            cfud cfudVar = (cfud) b;
            engwVar.getClass();
            Optional h = ((cort) this.e.b()).h(cors.a);
            final ffji ffjiVar3 = new ffji() { // from class: copm
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    return ((cosz) obj).c;
                }
            };
            if (engwVar.contains(h.map(new Function() { // from class: copn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ffji.this.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(""))) {
                cfudVar.b(context, cuae.PHENOTYPE_REGISTRATION_TRIGGER_SIM_CHANGE);
            }
            axol.k(this.f, null, new cops(this, null), 3);
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.copj
    public final /* synthetic */ void b(Set set) {
    }
}
