package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class comy {
    public final cond a;
    private final ConcurrentHashMap b = new ConcurrentHashMap();

    public comy(cond condVar) {
        this.a = condVar;
    }

    public final comc a(final comv comvVar) {
        final ffji ffjiVar = new ffji() { // from class: comw
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((comb) obj).getClass();
                cond condVar = comy.this.a;
                ((asvp) condVar.b.b()).getClass();
                errl errlVar = (errl) condVar.c.b();
                errlVar.getClass();
                errl errlVar2 = (errl) condVar.d.b();
                errlVar2.getClass();
                return new conc(condVar.a, errlVar, errlVar2, comvVar);
            }
        };
        coma comaVar = (coma) comvVar;
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(this.b, comaVar.a, new Function() { // from class: comx
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
        computeIfAbsent.getClass();
        final conc concVar = (conc) computeIfAbsent;
        String str = (String) comaVar.b.orElse("");
        str.getClass();
        boolean z = ((coma) concVar.d).f;
        boolean z2 = comaVar.f;
        if (z == z2) {
            ConcurrentHashMap concurrentHashMap = concVar.e;
            final ffji ffjiVar2 = new ffji() { // from class: comz
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    String str2 = (String) obj;
                    str2.getClass();
                    conc concVar2 = conc.this;
                    colz colzVar = new colz(concVar2.d);
                    colzVar.g(str2);
                    comv a = colzVar.a();
                    copc copcVar = new copc(concVar2.a, concVar2.b, concVar2.c, a);
                    if (!((coma) a).f) {
                        return copcVar;
                    }
                    AtomicReference atomicReference = concVar2.f;
                    conb conbVar = new conb(null);
                    while (!atomicReference.compareAndSet(null, conbVar) && atomicReference.get() == null) {
                    }
                    Object obj2 = concVar2.f.get();
                    obj2.getClass();
                    return new comt(copcVar, a, (conb) obj2);
                }
            };
            Object computeIfAbsent2 = ConcurrentMap.EL.computeIfAbsent(concurrentHashMap, str, new Function() { // from class: cona
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
            computeIfAbsent2.getClass();
            return (comc) computeIfAbsent2;
        }
        throw new IllegalStateException("Requesting cache state " + z2 + " but it is already " + z);
    }
}
