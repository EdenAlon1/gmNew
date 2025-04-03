package defpackage;

import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eilo implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SendMessageRequest apply(clsh clshVar) {
        eico j = SendMessageRequest.j();
        c(j);
        if ((clshVar.b & 4) != 0) {
            emwd emwdVar = eink.d;
            clns clnsVar = clshVar.e;
            if (clnsVar == null) {
                clnsVar = clns.a;
            }
            j.b((Conversation) emwdVar.fP(clnsVar));
        }
        if ((clshVar.b & 8) != 0) {
            emwd emwdVar2 = eink.c;
            clpc clpcVar = clshVar.f;
            if (clpcVar == null) {
                clpcVar = clpc.b;
            }
            j.d((Message) emwdVar2.fP(clpcVar));
        }
        if ((clshVar.b & 16) != 0) {
            emwd emwdVar3 = eink.b;
            clpi clpiVar = clshVar.g;
            if (clpiVar == null) {
                clpiVar = clpi.a;
            }
            j.e((MessageClass) emwdVar3.fP(clpiVar));
        }
        if ((clshVar.b & 2) != 0) {
            emwd emwdVar4 = eink.a;
            clsn clsnVar = clshVar.d;
            if (clsnVar == null) {
                clsnVar = clsn.a;
            }
            j.h((TraceId) emwdVar4.fP(clsnVar));
        }
        b(clshVar, j);
        if ((clshVar.b & 32) != 0) {
            emwd emwdVar5 = eink.e;
            clpy b = clpy.b(clshVar.h);
            if (b == null) {
                b = clpy.MESSAGING_METHOD_UNKNOWN;
            }
            j.f((eigz) emwdVar5.fP(b));
        }
        return j.a();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clsh clshVar, eico eicoVar);

    public abstract void c(eico eicoVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
