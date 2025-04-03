package defpackage;

import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuvo extends ffhv implements ffjm {
    final /* synthetic */ cuvp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuvo(cuvp cuvpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cuvpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuvo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object apply;
        ffci.b(obj);
        String[] strArr = buld.a;
        bukq bukqVar = new bukq();
        bukqVar.f("deleteExpiredOutcomes");
        final cuvp cuvpVar = this.a;
        apply = new Function() { // from class: cuvn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bulc bulcVar = (bulc) obj2;
                long epochMilli = ((cqoh) cuvp.this.f.b()).f().toEpochMilli() - Duration.ofDays(((Number) culo.a.e()).intValue()).toMillis();
                int intValue = buld.c().intValue();
                if (intValue < 59190) {
                    dtub.w("classification_timestamp", intValue);
                }
                bulcVar.aq(new dtwe("message_spam.classification_timestamp", 8, Long.valueOf(epochMilli)));
                return bulcVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bulc());
        bukqVar.b = new bukz((bulc) apply);
        bukqVar.d();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cuvo(this.a, ffguVar);
    }
}
