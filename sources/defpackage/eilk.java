package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eilk implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final clqc apply(MessagingResult messagingResult) {
        clpz clpzVar = (clpz) clqc.a.createBuilder();
        c(messagingResult, clpzVar);
        b(messagingResult, clpzVar);
        d(messagingResult, clpzVar);
        e(messagingResult, clpzVar);
        return (clqc) clpzVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(MessagingResult messagingResult, clpz clpzVar);

    public abstract void c(MessagingResult messagingResult, clpz clpzVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(MessagingResult messagingResult, clpz clpzVar);

    public abstract void e(MessagingResult messagingResult, clpz clpzVar);
}
