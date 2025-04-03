package defpackage;

import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eilc implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CreateGroupRequest apply(clny clnyVar) {
        ehyj ehyjVar = new ehyj();
        d(ehyjVar);
        if ((clnyVar.b & 4) != 0) {
            b(clnyVar, ehyjVar);
        }
        if ((clnyVar.b & 8) != 0) {
            ehyjVar.f(clnyVar.e);
        }
        engr d = engw.d(clnyVar.f.size());
        Iterator<E> it = clnyVar.f.iterator();
        while (it.hasNext()) {
            d.h((RcsDestinationId) eimb.a.fP((clqv) it.next()));
        }
        ehyjVar.d(d.g());
        c(clnyVar, ehyjVar);
        return ehyjVar.a();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clny clnyVar, eiad eiadVar);

    public abstract void c(clny clnyVar, eiad eiadVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(eiad eiadVar);
}
