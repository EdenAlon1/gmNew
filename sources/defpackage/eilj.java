package defpackage;

import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eilj extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        Message message = (Message) obj;
        clpb clpbVar = (clpb) clpc.b.createBuilder();
        f(message, clpbVar);
        clqv clqvVar = (clqv) eind.a.m().fP(message.a());
        clpbVar.copyOnWrite();
        clpc clpcVar = (clpc) clpbVar.instance;
        clqvVar.getClass();
        clpcVar.e = clqvVar;
        clpcVar.c |= 2;
        c(message, clpbVar);
        if (message.g().isPresent()) {
            g(message, clpbVar);
        }
        if (message.f().isPresent() && message.f().isPresent()) {
            clqv clqvVar2 = (clqv) eind.a.m().fP(message.f().get());
            clpbVar.copyOnWrite();
            clpc clpcVar2 = (clpc) clpbVar.instance;
            clqvVar2.getClass();
            clpcVar2.f = clqvVar2;
            clpcVar2.c |= 4;
        }
        e(message, clpbVar);
        if (message.e().isPresent() && message.e().isPresent()) {
            boolean booleanValue = ((Boolean) message.e().get()).booleanValue();
            clpbVar.copyOnWrite();
            clpc clpcVar3 = (clpc) clpbVar.instance;
            clpcVar3.c |= 32;
            clpcVar3.j = booleanValue;
        }
        if (message.d().isPresent()) {
            d(message, clpbVar);
        }
        return (clpc) clpbVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        clpc clpcVar = (clpc) obj;
        eigi i = Message.i();
        if ((clpcVar.c & 1) != 0) {
            k(clpcVar, i);
        }
        if ((clpcVar.c & 2) != 0) {
            emwd emwdVar = eind.a;
            clqv clqvVar = clpcVar.e;
            if (clqvVar == null) {
                clqvVar = clqv.a;
            }
            i.i((RcsDestinationId) emwdVar.fP(clqvVar));
        }
        if ((clpcVar.c & 4) != 0) {
            emwd emwdVar2 = eind.a;
            clqv clqvVar2 = clpcVar.f;
            if (clqvVar2 == null) {
                clqvVar2 = clqv.a;
            }
            i.h((RcsDestinationId) emwdVar2.fP(clqvVar2));
        }
        h(clpcVar, i);
        if ((clpcVar.c & 8) != 0) {
            l(clpcVar, i);
        }
        if ((clpcVar.c & 16) != 0) {
            j(clpcVar, i);
        }
        if ((clpcVar.c & 32) != 0) {
            i.g(clpcVar.j);
        }
        i(clpcVar, i);
        return i.a();
    }

    public abstract void c(Message message, clpb clpbVar);

    public void d(Message message, clpb clpbVar) {
        throw null;
    }

    public abstract void e(Message message, clpb clpbVar);

    public abstract void f(Message message, clpb clpbVar);

    public abstract void g(Message message, clpb clpbVar);

    public abstract void h(clpc clpcVar, eigi eigiVar);

    public void i(clpc clpcVar, eigi eigiVar) {
        throw null;
    }

    public abstract void j(clpc clpcVar, eigi eigiVar);

    public abstract void k(clpc clpcVar, eigi eigiVar);

    public abstract void l(clpc clpcVar, eigi eigiVar);
}
