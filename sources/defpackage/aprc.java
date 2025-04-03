package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aprc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aprh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aprc(aprh aprhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aprhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aprc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        apqn apqnVar = null;
        ffci.b(obj);
        if (i == 0) {
            aprh aprhVar = this.b;
            this.a = 1;
            final ffji ffjiVar = new ffji() { // from class: cbku
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    Duration duration = cblf.a;
                    ((MessageId) obj2).getClass();
                    return new fgjf();
                }
            };
            Function function = new Function() { // from class: cbkv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    Duration duration = cblf.a;
                    return ffji.this.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            };
            cblf cblfVar = aprhVar.b;
            ConcurrentHashMap concurrentHashMap = cblfVar.e;
            MessageId messageId = aprhVar.c;
            Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(concurrentHashMap, messageId, function);
            computeIfAbsent.getClass();
            obj = ffra.a(ekxi.a(cblfVar.b.hT()), new cbkz(null, (fgjb) computeIfAbsent, cblfVar, messageId), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        cqpu cqpuVar = (cqpu) obj;
        if (cqpuVar != null) {
            apqm d = apqn.d();
            d.b(cqpuVar.a());
            d.d(cqpuVar.b());
            d.c(cqpuVar.c());
            apqnVar = d.a();
        }
        return Optional.ofNullable(apqnVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aprc(this.b, ffguVar);
    }
}
