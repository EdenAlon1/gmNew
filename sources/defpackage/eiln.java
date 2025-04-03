package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eiln implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eicl apply(clrz clrzVar) {
        eifn eifnVar;
        TraceId traceId;
        eyee eyeeVar;
        ehzk ehzkVar = new ehzk();
        ehzkVar.a(TraceId.b().d());
        if ((clrzVar.b & 4) != 0) {
            emwd emwdVar = einj.c;
            clns clnsVar = clrzVar.e;
            if (clnsVar == null) {
                clnsVar = clns.a;
            }
            Conversation conversation = (Conversation) emwdVar.fP(clnsVar);
            if (conversation == null) {
                throw new NullPointerException("Null conversation");
            }
            ehzkVar.a = conversation;
        }
        if ((clrzVar.b & 8) != 0) {
            emwd emwdVar2 = einj.b;
            cloj clojVar = clrzVar.f;
            if (clojVar == null) {
                clojVar = cloj.b;
            }
            eifn eifnVar2 = (eifn) emwdVar2.fP(clojVar);
            if (eifnVar2 == null) {
                throw new NullPointerException("Null message");
            }
            ehzkVar.b = eifnVar2;
        }
        if ((clrzVar.b & 2) != 0) {
            emwd emwdVar3 = einj.a;
            clsn clsnVar = clrzVar.d;
            if (clsnVar == null) {
                clsnVar = clsn.a;
            }
            ehzkVar.a((TraceId) emwdVar3.fP(clsnVar));
        }
        b(clrzVar, ehzkVar);
        Conversation conversation2 = ehzkVar.a;
        if (conversation2 != null && (eifnVar = ehzkVar.b) != null && (traceId = ehzkVar.c) != null && (eyeeVar = ehzkVar.d) != null) {
            return new ehzl(conversation2, eifnVar, traceId, eyeeVar);
        }
        StringBuilder sb = new StringBuilder();
        if (ehzkVar.a == null) {
            sb.append(" conversation");
        }
        if (ehzkVar.b == null) {
            sb.append(" message");
        }
        if (ehzkVar.c == null) {
            sb.append(" traceId");
        }
        if (ehzkVar.d == null) {
            sb.append(" opaqueData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clrz clrzVar, eick eickVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
