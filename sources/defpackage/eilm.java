package defpackage;

import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eilm implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoveUserFromGroupRequest apply(clrd clrdVar) {
        ehzh ehzhVar = new ehzh();
        d(ehzhVar);
        if ((clrdVar.b & 4) != 0) {
            emwd emwdVar = eini.a;
            clns clnsVar = clrdVar.d;
            if (clnsVar == null) {
                clnsVar = clns.a;
            }
            ehzhVar.b((Conversation) emwdVar.fP(clnsVar));
        }
        c(clrdVar, ehzhVar);
        b(clrdVar, ehzhVar);
        return ehzhVar.a();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clrd clrdVar, eicd eicdVar);

    public abstract void c(clrd clrdVar, eicd eicdVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(eicd eicdVar);
}
