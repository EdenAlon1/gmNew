package defpackage;

import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eilq implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final TriggerGroupNotificationRequest apply(clst clstVar) {
        ehzq ehzqVar = new ehzq();
        c(ehzqVar);
        if ((clstVar.b & 4) != 0) {
            emwd emwdVar = einm.a;
            clns clnsVar = clstVar.d;
            if (clnsVar == null) {
                clnsVar = clns.a;
            }
            ehzqVar.b((Conversation) emwdVar.fP(clnsVar));
        }
        b(clstVar, ehzqVar);
        return ehzqVar.a();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clst clstVar, eicw eicwVar);

    public abstract void c(eicw eicwVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
