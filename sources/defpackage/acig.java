package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acig implements fbba {
    /* JADX WARN: Type inference failed for: r7v2, types: [chzl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [chzl, java.lang.Object] */
    public static cilj a(final eisx eisxVar, Context context, final chja chjaVar, cgxw cgxwVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, final ffbr ffbrVar, errl errlVar) {
        eisxVar.getClass();
        context.getClass();
        chjaVar.getClass();
        cgxwVar.getClass();
        optional4.getClass();
        ffbrVar.getClass();
        errlVar.getClass();
        if (((Boolean) cgcv.a.e()).booleanValue()) {
            ffbr ffbrVar2 = new ffbr() { // from class: acia
                @Override // defpackage.ffbr, defpackage.ffbq
                public final Object b() {
                    return chja.this;
                }
            };
            Object obj = optional.get();
            ?? r7 = optional2.get();
            Object obj2 = optional3.get();
            final ffji ffjiVar = new ffji() { // from class: acib
                @Override // defpackage.ffji
                public final Object invoke(Object obj3) {
                    chhm chhmVar = (chhm) obj3;
                    akho akhoVar = (akho) ffbr.this.b();
                    chhmVar.getClass();
                    akhx akhxVar = akhoVar.a;
                    akis akisVar = akhxVar.a;
                    akhy akhyVar = akhxVar.b;
                    eisx eisxVar2 = eisxVar;
                    akkp akkpVar = akisVar.a;
                    return Optional.of(new cibd(eisxVar2, chhmVar, akkpVar.as, akhyVar.ec, akkpVar.q));
                }
            };
            Optional flatMap = optional4.flatMap(new Function() { // from class: acic
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj3) {
                    return ffji.this.invoke(obj3);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            Duration duration = chzl.a;
            Duration ofSeconds = Duration.ofSeconds(((Number) cgyj.m.e()).intValue());
            Object e = cgyj.n.e();
            e.getClass();
            int intValue = ((Number) e).intValue();
            Object e2 = cgyj.o.e();
            e2.getClass();
            return new cilj(context, ffbrVar2, (cija) obj, r7, (cihi) obj2, errlVar, cgxwVar, 5, flatMap, duration, ofSeconds, intValue, ((Number) e2).intValue(), false, true, true);
        }
        ffbr ffbrVar3 = new ffbr() { // from class: acid
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return chja.this;
            }
        };
        Object obj3 = optional.get();
        ?? r8 = optional2.get();
        Object obj4 = optional3.get();
        final ffji ffjiVar2 = new ffji() { // from class: acie
            @Override // defpackage.ffji
            public final Object invoke(Object obj5) {
                return Optional.of(new chhk((chhm) obj5));
            }
        };
        Optional flatMap2 = optional4.flatMap(new Function() { // from class: acif
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj5) {
                return ffji.this.invoke(obj5);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        Duration duration2 = chzl.a;
        Duration ofSeconds2 = Duration.ofSeconds(((Number) cgyj.m.e()).intValue());
        Object e3 = cgyj.n.e();
        e3.getClass();
        int intValue2 = ((Number) e3).intValue();
        Object e4 = cgyj.o.e();
        e4.getClass();
        return new cilj(context, ffbrVar3, (cija) obj3, r8, (cihi) obj4, errlVar, cgxwVar, 5, flatMap2, duration2, ofSeconds2, intValue2, ((Number) e4).intValue(), false, true, true);
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
