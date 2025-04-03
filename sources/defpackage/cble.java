package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cble extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ cblf f;
    final /* synthetic */ MessageId g;
    final /* synthetic */ cqpu h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cble(cblf cblfVar, MessageId messageId, cqpu cqpuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = cblfVar;
        this.g = messageId;
        this.h = cqpuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cble) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        fgjb fgjbVar;
        Object obj3;
        MessageId messageId;
        ffhh ffhhVar = ffhh.a;
        if (this.e != 0) {
            obj3 = this.d;
            Object obj4 = this.c;
            obj2 = this.b;
            Object obj5 = this.a;
            ffci.b(obj);
            fgjbVar = obj5;
            messageId = obj4;
        } else {
            ffci.b(obj);
            cblf cblfVar = this.f;
            MessageId messageId2 = this.g;
            final ffji ffjiVar = new ffji() { // from class: cblb
                @Override // defpackage.ffji
                public final Object invoke(Object obj6) {
                    return new fgjf();
                }
            };
            Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(cblfVar.e, messageId2, new Function() { // from class: cblc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj6) {
                    return ffji.this.invoke(obj6);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            computeIfAbsent.getClass();
            obj2 = this.f;
            MessageId messageId3 = this.g;
            cqpu cqpuVar = this.h;
            fgjbVar = (fgjb) computeIfAbsent;
            this.a = fgjbVar;
            this.b = obj2;
            this.c = messageId3;
            this.d = cqpuVar;
            this.e = 1;
            if (fgjbVar.a(null, this) == ffhhVar) {
                return ffhhVar;
            }
            obj3 = cqpuVar;
            messageId = messageId3;
        }
        final MessageId messageId4 = messageId;
        try {
            Duration duration = cblf.a;
            ((cblf) obj2).c.put(messageId4, obj3);
            ((cblf) obj2).f.c(new Supplier() { // from class: cbld
                @Override // java.util.function.Supplier
                public final Object get() {
                    return MessageId.this;
                }
            }, "RichCardMediaTransferProgressManager::Notify");
            ffud ffudVar = (ffud) ((cblf) obj2).d.get(messageId4);
            if (ffudVar != null) {
                ffudVar.t(null);
            }
            ConcurrentHashMap concurrentHashMap = ((cblf) obj2).d;
            ConcurrentHashMap concurrentHashMap2 = ((cblf) obj2).e;
            final ffji ffjiVar2 = new ffji() { // from class: cbkw
                @Override // defpackage.ffji
                public final Object invoke(Object obj6) {
                    Duration duration2 = cblf.a;
                    ((MessageId) obj6).getClass();
                    return new fgjf();
                }
            };
            Object computeIfAbsent2 = ConcurrentMap.EL.computeIfAbsent(concurrentHashMap2, messageId4, new Function() { // from class: cbkx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj6) {
                    Duration duration2 = cblf.a;
                    return ffji.this.invoke(obj6);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            computeIfAbsent2.getClass();
            concurrentHashMap.put(messageId4, axol.k(((cblf) obj2).b, null, new cbla((fgjb) computeIfAbsent2, (cblf) obj2, messageId4, (cqpu) obj3, null), 3));
            fgjbVar.b(null);
            return ffcu.a;
        } catch (Throwable th) {
            fgjbVar.b(null);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cble(this.f, this.g, this.h, ffguVar);
    }
}
