package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eima extends eilb {
    static final emwd a = new einh();

    @Override // defpackage.eilb, defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        Conversation conversation = (Conversation) obj;
        clnp clnpVar = (clnp) clns.a.createBuilder();
        clqr clqrVar = (clqr) clqs.a.createBuilder();
        String b = conversation.b();
        clqrVar.copyOnWrite();
        clqs clqsVar = (clqs) clqrVar.instance;
        clqsVar.b |= 1;
        clqsVar.c = b;
        clqs clqsVar2 = (clqs) clqrVar.build();
        clnpVar.copyOnWrite();
        clns clnsVar = (clns) clnpVar.instance;
        clqsVar2.getClass();
        clnsVar.e = clqsVar2;
        clnsVar.b |= 4;
        clqv clqvVar = (clqv) a.m().fP(conversation.a());
        clnpVar.copyOnWrite();
        clns clnsVar2 = (clns) clnpVar.instance;
        clqvVar.getClass();
        clnsVar2.d = clqvVar;
        clnsVar2.b |= 2;
        int i = conversation.c() + (-1) != 0 ? 3 : 2;
        clnpVar.copyOnWrite();
        clns clnsVar3 = (clns) clnpVar.instance;
        clnsVar3.c = i - 1;
        clnsVar3.b |= 1;
        return (clns) clnpVar.build();
    }

    @Override // defpackage.eilb, defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        clns clnsVar = (clns) obj;
        eiea eieaVar = new eiea();
        emwd emwdVar = a;
        clqv clqvVar = clnsVar.d;
        if (clqvVar == null) {
            clqvVar = clqv.a;
        }
        eieaVar.b((RcsDestinationId) emwdVar.fP(clqvVar));
        int a2 = clnr.a(clnsVar.c);
        int i = 1;
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = a2 - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                i = 2;
            } else if (i2 != 3) {
                throw new IllegalArgumentException("Conversation type not supported");
            }
        }
        eieaVar.d(i);
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        eieaVar.c(clqsVar.c);
        return eieaVar.a();
    }
}
