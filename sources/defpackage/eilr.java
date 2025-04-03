package defpackage;

import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eilr implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateGroupRequest apply(cltb cltbVar) {
        ehzs ehzsVar = new ehzs();
        c(ehzsVar);
        if ((cltbVar.b & 4) != 0) {
            emwd emwdVar = einn.a;
            clns clnsVar = cltbVar.d;
            if (clnsVar == null) {
                clnsVar = clns.a;
            }
            ehzsVar.b((Conversation) emwdVar.fP(clnsVar));
        }
        if ((cltbVar.b & 8) != 0) {
            ehzsVar.e(cltbVar.e);
        }
        b(cltbVar, ehzsVar);
        return ehzsVar.a();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(cltb cltbVar, eidb eidbVar);

    public abstract void c(eidb eidbVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
