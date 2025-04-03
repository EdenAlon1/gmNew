package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cttp extends ffhv implements ffjm {
    final /* synthetic */ cttq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cttp(cttq cttqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cttqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cttp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        long epochMilli = this.a.c.f().toEpochMilli();
        Object e = cttq.a.e();
        e.getClass();
        final long longValue = epochMilli - ((Number) e).longValue();
        bvhd a = bvhn.a();
        a.z("isSmartsHatsEligible");
        a.d(new Function() { // from class: ctto
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bvhm bvhmVar = (bvhm) obj2;
                bvhmVar.b(longValue);
                fbrd fbrdVar = fbrd.CLICKED;
                bvhmVar.aq(new dtwe("p2p_suggestions.suggestion_status", 1, Integer.valueOf(fbrdVar == null ? 0 : fbrdVar.a())));
                return bvhmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return Boolean.valueOf(a.b().i() >= ((Number) cttq.b.e()).intValue());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cttp(this.a, ffguVar);
    }
}
